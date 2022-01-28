import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.0d, (double) 0.0f, 52.75d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 0.0f, 0.0d, 7.5625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.75d, 5.125d, 31.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.0d, (double) (-1), 75.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 7.0d, (double) 0, 12.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 6.5d, 4.0d, 0.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((-0.375d), 6.5d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (short) 10, 5.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(49.0d, 12.5625d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.0625d, 16.0d, 3.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(21.8515625d, 6.875d, 1.875d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 'a', 18.25d, 14.125d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 32.375d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(12.75d, 28.75d, (-0.25d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [28.75, -0.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 7.90625d, 66.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(24.0d, (double) 1L, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(16.8125d, 0.0d, 18.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [16.812, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 49.0d, 5.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(64.25d, (-0.75d), 32.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [64.25, -0.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) 0.0f, 5.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(7.953125d, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.9765625d + "'", double2 == 8.9765625d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(17.75d, 6.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [17.75, 6.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 1, 66.0d, 10.4765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 51.875d, 0.0d, 18.15625d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-0.75d), (double) '#', (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) (byte) 1, 13.875d);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 5.78125d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(5.125d, (double) (byte) 10);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 4.0d, 26.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (short) -1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(6.0d, 39.25d, (-0.375d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) (short) 0, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.0d + "'", double2 == 50.0d);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.75d, (-0.625d), 18.15625d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(31.0625d, 29.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [31.062, 29.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 58.2265625d, 31.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [58.227, 31.062]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, (double) (byte) 100, 4.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 48.0d, 0.0d, 57.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 29.5d, 9.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 51.875d, (double) (short) -1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 25.5d, 31.4375d, 7.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 25.5d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(100.0d, (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.5d + "'", double2 == 49.5d);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 34.125d, 57.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(31.0625d, 39.25d);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (-0.25d), (-0.75d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [-0.25, -0.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((-1.0d), (double) 1, 16.0d);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(5.25d, (double) 1, 49.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(23.125d, 7.25d, 26.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [23.125, 7.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(18.0625d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 59.03125d + "'", double2 == 59.03125d);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(29.5d, 58.2265625d, 0.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [58.227, 0.375]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 12.5d, 12.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 13.875d, 49.5d, (double) 10L, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) (byte) 1, 31.703125d);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) '#', (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 13.0d, 0.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.0d, 12.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) ' ', 1.0d, 18.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 49.0d, 13.0d, 21.8515625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) (byte) 0, 3.5d, (double) (short) 100);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) (-1), 57.61328125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.306640625d + "'", double2 == 28.306640625d);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 15.75d, 6.0d, 6.3125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) ' ', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.0d, 6.3125d, 25.5d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 32.375d, 7.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 28.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(39.25d, 6.5d, 12.75d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) 0, 5.5d, 7.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 50.0d, 39.25d, 57.0d, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) 100, 6.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [100, 6]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 7.953125d, 14.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (short) 10, 0.0d, 6.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (-0.625d), 13.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 7.90625d, 50.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 12.5d, 16.8125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(34.125d, (double) (short) 100);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(52.75d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [52.75, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 31.0625d, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 5.5d, 10.4765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((-0.25d), 29.5d, (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 48.0d, (double) 0, 49.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) 100, 39.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, -1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.375d, 61.25d, 5.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(12.0d, 7.953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12, 7.953]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(28.5d, 1.75d, 50.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [28.5, 1.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.125d, 23.125d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) 100.0f, 50.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 75.0d + "'", double2 == 75.0d);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 73.0d, 7.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [73, 7]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 15.6875d, 31.0625d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) '4', (double) '#', 16.8125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [52, 35]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(5.125d, 57.0d, 9.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [57, 9.125]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 10, 7.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(12.5d, (-0.75d), (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.5, -0.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 24.0d, 0.375d, 27.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(66.0d, 0.0d, 57.61328125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 49.5d, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [49.5, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 18.0625d, 0.0d, 34.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(48.0d, (double) (byte) -1, 3.5d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.4375d, 0.0d, 58.2265625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(57.0d, 0.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [57, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 13.0d, 59.03125d, 6.0d, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 1.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(16.8125d, 28.306640625d, 32.6015625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 11.5d, 21.8515625d, 24.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(29.5d, 5.78125d, 13.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 51.875d, 39.25d, 6.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(7.25d, 48.0d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 8.9765625d, (-0.625d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [8.977, -0.625]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (-1L), 51.875d, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(26.0d, 33.53125d, 18.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [33.531, 18.156]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) 1.0f, 57.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (-0.75d), 8.9765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((-0.5d), 58.2265625d, 8.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [58.227, 8]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 15.75d, 0.375d, (double) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 48.0d, 0.5d, 31.4375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(18.0625d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [18.062, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 50.0d, 6.0d, 4.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) 0.0f, 0.375d, 23.125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((-1), univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 27.75d, 8.9765625d, (double) (-1.0f), allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 6.3125d, 64.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 6.5d, 14.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(10.4765625d, 23.125d, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(34.125d, 49.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 9.125d, 16.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 21.8515625d, (-0.375d), 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 25.5d, 16.8125d, 31.0625d, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) (byte) 0, 4.0d, 32.5d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) 'a', (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [97, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 9.125d, 23.125d, 5.78125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) 'a', 28.75d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [97, 28.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(17.0625d, 1.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [17.062, 1.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 10.875d, (double) (byte) 10, 0.0d, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(0.0d, (double) (byte) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.25d, (-0.25d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (short) 1, (double) 0.0f, 1.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.5d, 15.75d, 9.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (byte) 10, 16.8125d, 12.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(55.203125d, 50.0d, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(52.75d, 7.5625d, 51.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [52.75, 7.562]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, 7.5625d);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 24.0d, (double) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 27.75d, 0.0d, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 4.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [4, -1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 1.875d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(4.0d, 14.0d, 51.875d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(12.5625d, 22.5d, 25.5d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(28.306640625d, 36.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.2783203125d + "'", double2 == 32.2783203125d);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(100.0d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [100, 100]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 59.03125d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) 100L, 0.375d, 5.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [100, 0.375]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.703125d, (-0.625d), 7.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 1L, (double) 0.0f, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) (byte) 10, 4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.0d + "'", double2 == 7.0d);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.25d, 14.0d, 58.40625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 32.2783203125d, 52.75d, 22.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(12.75d, (double) (-1.0f), 12.5625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(11.5d, 39.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 25.375d + "'", double2 == 25.375d);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(28.75d, 51.875d, 32.5d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.0d, 14.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 15.6875d, 31.4375d, (double) (byte) 1, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(5.0d, 13.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(100.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.5d + "'", double2 == 49.5d);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 49.0d, 12.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((-1), univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 14.0d, 24.0d, 100.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) '4', 16.8125d, (double) '4', (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(57.0d, 14.125d, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 10.0d, 31.703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 52.75d, 7.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) 0.0f, 12.75d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(57.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [57, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 'a', (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) (byte) 100, 66.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [100, 66]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 6.5d, 32.375d, 13.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 14.0d, 5.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 57.61328125d, 31.703125d, 4.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 29.5d, 55.203125d, (double) 10L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(5.125d, 0.375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.75d + "'", double2 == 2.75d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 5.5d, 28.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 100.0f, 5.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 25.375d, (double) (-1.0f), (double) (-1.0f), allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(36.25d, 3.5d, 57.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [36.25, 3.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(26.0d, 6.0d, 1.75d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 18.15625d, 4.5d, 12.0d, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.0625d, 0.0d, 26.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 49.0d, 9.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [49, 9.125]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(32.2783203125d, 10.4765625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.37744140625d + "'", double2 == 21.37744140625d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) (short) -1, 12.75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.875d + "'", double2 == 5.875d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 12.5625d, 3.5d, 16.8125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.0d, 31.0625d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [31.062, -1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 18.15625d, (double) (-1.0f), 6.875d, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (-1), 39.25d, 26.0d, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 33.53125d, 31.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 16.8125d, 18.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 10.0d, 16.8125d, (-0.5d), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.5d, 5.875d, 34.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 61.25d, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) (-1.0f), 6.3125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.65625d + "'", double2 == 2.65625d);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.125d, 7.25d, 100.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 15.75d, 66.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 31.703125d, 39.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (byte) 0, 28.306640625d, 12.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) 100, 0.0d, 33.53125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 55.203125d, (-1.0d), 17.0625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 9.125d, 73.0d, 58.2265625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 9.0d, 64.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (byte) 100, 25.5d, 59.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) 100.0f, 21.37744140625d, 2.75d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) '#', 58.2265625d, 13.875d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 57.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-0.25d), 31.4375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.0d, 2.75d, 7.90625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) ' ', 0.0d, 17.0625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '4', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.0d, 17.75d, 58.2265625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) (byte) -1, 58.2265625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(31.0625d, 52.75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.90625d + "'", double2 == 41.90625d);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((-0.75d), 9.125d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 61.25d, 13.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(15.6875d, 11.5d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [15.688, 11.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 0.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 34.125d, 12.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 61.25d, 16.8125d, 5.78125d, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) 0L, 33.53125d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 12.0d, 15.6875d, 2.65625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (-0.25d), 36.25d, 9.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(33.53125d, 100.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (byte) 100, (double) (byte) 1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(10.0d, 51.875d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(64.25d, (-0.25d), 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 51.875d, 23.125d, 17.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 14.0d, (-0.5d), 17.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (-0.375d), 18.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 26.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(5.875d, 58.2265625d);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(6.3125d, 58.2265625d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 16.0d, 51.875d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, (double) 1L);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(52.75d, 7.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [52.75, 7.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 28.75d, 23.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [28.75, 23.125]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 5.0d, 22.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 1.75d, (-0.375d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 36.25d, (double) (short) 1, 21.37744140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.4375d, (double) 100L, 16.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 100, 13.875d, 14.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 7.25d, 16.8125d, 29.5d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 18.25d, 17.75d, (double) 10, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (short) 1, 28.75d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 100.0d, 18.25d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) '#', (double) (short) -1, 7.0d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 15.6875d, 26.0d, 59.03125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(34.125d, 50.0d, (-0.25d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 50.0d, 0.0d, (-0.375d), allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 15.75d, 4.5d, (double) (short) 10, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) (-1L), 5.875d, 10.0d);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(32.375d, 5.5d, 0.375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(18.25d, 31.0625d, 12.5d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 28.75d, 5.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [28.75, 5.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.0d, (-1.0d), (double) (byte) 100, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 7.25d, 23.125d, 17.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(31.4375d, 16.0d, 49.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 4.0d, 11.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) 10.0f, 58.2265625d, (double) 0, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(6.3125d, 39.25d, 1.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [39.25, 1.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(18.0625d, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [18.062, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) 0, (double) 'a', (-0.375d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [97, -0.375]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) (-1), (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5d) + "'", double2 == (-0.5d));
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(12.5625d, 49.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.03125d + "'", double2 == 31.03125d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) 100L, 31.0625d, 1.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [100, 31.062]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(23.125d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [23.125, 10]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 25.5d, 39.25d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(10.875d, 0.0d, 49.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 58.40625d, 4.0d, 31.03125d, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 1, (double) 100.0f, 7.953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 100, (double) (short) 0, 10.4765625d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 51.875d, 7.90625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 14.125d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 1.875d, 51.875d, 4.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(8.9765625d, 0.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(73.0d, 7.0d, 25.375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) 0L, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.0d, 32.5d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [32.5, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 66.0d, 5.5d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-0.75d), 28.306640625d, 31.703125d, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 12.75d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.75, 10]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 1L, 100.0d, (double) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(41.90625d, (double) (byte) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.25d, 3.5d, (double) ' ', 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) 100, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 76.0d + "'", double2 == 76.0d);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 8.9765625d, 0.25d, 28.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) '4', 6.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.0d + "'", double2 == 29.0d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(31.4375d, 0.0d, 7.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 76.0d, 28.5d, 32.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) 'a', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 5.875d, 15.6875d, 31.03125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(28.306640625d, 39.25d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(5.78125d, 61.25d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(28.5d, 29.5d, 7.953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [29.5, 7.953]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 5.25d, 28.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.5d, 14.0d, 76.0d, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((-1.0d), 18.25d, 34.125d);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) ' ', 0.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [32, 0.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) '#', 5.125d, 33.53125d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 36.25d, 11.5d, 5.875d, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 36.25d, (-0.75d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 73.0d, 39.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [73, 39.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 32.2783203125d, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.25d, 5.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) 10.0f, 12.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((-0.75d), 13.0d, 1.75d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) -1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) (short) -1, 33.53125d, 32.5d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 28.306640625d, (double) 0, 8.9765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 36.25d, 25.375d, (double) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(12.75d, 10.4765625d, 22.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.75, 10.477]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 50.0d, 61.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 10.0f, 0.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.0625d, (double) (-1L), (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0d, (double) (-1.0f), 48.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) 100, 6.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53.0d + "'", double2 == 53.0d);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 12.5625d, 52.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) 10.0f, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.5d + "'", double2 == 4.5d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-0.625d), 9.0d, 18.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 23.125d, 5.0d, 52.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 2.65625d, 3.5d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 53.0d, (double) 'a', 49.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 32.375d, 3.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) (short) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 32.2783203125d, (-0.5d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (-1), 49.0d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(25.375d, 5.78125d, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(18.25d, (-1.0d), 21.8515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [18.25, -1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 57.61328125d, 1.75d, 76.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(64.25d, 0.0d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [64.25, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) (byte) 10, 7.5625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.78125d + "'", double2 == 8.78125d);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 6.0d, 49.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(22.5d, 14.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.25d + "'", double2 == 18.25d);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 32.2783203125d, 14.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [32.278, 14]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 28.75d, 14.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((-0.375d), 1.75d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(26.0d, 5.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [26, 5.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 26.0d, 31.4375d, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(31.03125d, (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.015625d + "'", double2 == 16.015625d);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 4.0d, (-0.5d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [4, -0.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.78125d, (-0.25d), 29.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 31.4375d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [31.438, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 14.0d, (double) 0, 5.78125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) (short) 1, 15.6875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 22.5d, 31.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((-1), univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 75.0d, 41.90625d, (-0.625d), allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 14.125d, (double) ' ', 6.3125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 58.2265625d, (double) (short) 100, 49.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(11.5d, (double) 100L);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) -1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 48.0d, 13.0d, 48.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(25.5d, 14.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.75d + "'", double2 == 19.75d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(26.5d, 7.90625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.203125d + "'", double2 == 17.203125d);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 28.306640625d, (-0.625d), 13.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((-0.625d), 26.0d, 33.53125d);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 18.0625d, 9.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [18.062, 9]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) (-1L), 31.03125d);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 58.40625d, 25.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [58.406, 25.375]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.125d, 29.5d, 51.875d, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(18.0625d, 24.0d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 59.03125d, 5.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (byte) -1, 75.0d, 12.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (-1), 73.0d, 17.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.5d, 11.5d, 66.0d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.203125d, 17.203125d, 5.25d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 73.0d, 12.0d, 23.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(16.015625d, 13.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [16.016, 13.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 49.0d, 12.5625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(13.875d, 1.875d, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [13.875, 1.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 39.25d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [39.25, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(32.2783203125d, 1.875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.07666015625d + "'", double2 == 17.07666015625d);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) 1, (double) (short) 10, (double) 10, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(10.4765625d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.23828125d + "'", double2 == 5.23828125d);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (-0.75d), 10.4765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 39.25d, 49.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) (-1L), (double) 1.0f, (double) 10L);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 19.75d, 16.8125d, 3.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(7.90625d, 58.2265625d, 26.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [58.227, 26.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(50.0d, 49.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [50, 49]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((-0.25d), (double) (-1.0f), 15.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [-0.25, -1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 9.0d, 59.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) 100L, 16.8125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [100, 16.812]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.5d, 58.2265625d, 6.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(21.8515625d, 39.25d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [39.25, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-0.75d), 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 0, 52.75d, 34.125d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.25d, 23.125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.6875d + "'", double2 == 11.6875d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 6.0d, 36.25d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(22.5d, 13.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [22.5, 13.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(59.03125d, 57.0d, 5.23828125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [59.031, 57]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(4.5d, (double) 10L);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(28.75d, 8.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [28.75, 8]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 58.40625d, 18.15625d, 17.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 7.0d, 5.25d, 5.25d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(2.75d, 28.5d);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(32.5d, (double) ' ', (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(17.07666015625d, (-0.375d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [17.077, -0.375]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.875d, (double) (short) -1, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (-1), 55.203125d, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(53.0d, 28.306640625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 40.6533203125d + "'", double2 == 40.6533203125d);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) 10L, 8.9765625d, 41.90625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0d, 49.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.5d + "'", double2 == 24.5d);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.75d, 26.0d, (-0.625d), (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (-1), 39.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 49.0d, 10.4765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [49, 10.477]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) (-1), 2.75d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(7.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [7, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 32.5d, 21.37744140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 31.0625d, (double) (short) 1, 7.5625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(33.53125d, 40.6533203125d, 5.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [40.653, 5.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) (byte) 100, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.5d + "'", double2 == 49.5d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 39.25d, (double) '#', 2.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(3.5d, 12.5d, 6.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.5, 6.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) 'a', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 31.703125d, 58.2265625d, 29.5d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(4.5d, 41.90625d, 8.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 27.75d, 24.0d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 73.0d, 13.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [73, 13.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 6.0d, 24.5d, 41.90625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 6.0d, 1.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [6, 1.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.4375d, 1.0d, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 18.0625d, 8.78125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.25d, 51.875d);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (short) 10, (double) 0, (-0.5d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(57.0d, 32.5d, 4.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [57, 32.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 12.5d, (double) (short) 100, 15.6875d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) (byte) 0, (double) 'a', (double) 10.0f, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) 100L, 18.15625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 59.078125d + "'", double2 == 59.078125d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) '4', 41.90625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [52, 41.906]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 0.0f, 59.03125d, 11.6875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(59.078125d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 79.5390625d + "'", double2 == 79.5390625d);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) (short) -1, 57.61328125d, (double) (short) 0, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 'a', 7.953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) ' ', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) (byte) 1, 12.75d, (double) ' ', allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 7.953125d, 25.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(31.03125d, (double) 10, 34.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [31.031, 10]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 73.0d, 32.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 12.0d, 39.25d, (double) ' ', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 31.703125d, 15.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [31.703, 15.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) 10L, 3.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 12.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 29.0d, 16.015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) '#', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(2.75d, 21.8515625d, 24.0d);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 18.0625d, (-0.625d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [18.062, -0.625]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 75.0d, (double) 100L, 36.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(12.0d, 6.875d, 18.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12, 6.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-0.375d), 28.306640625d, 4.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 2.65625d, 0.0d, (double) 100.0f, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 53.0d, 27.75d, 25.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '4', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 17.0625d, 6.5d, (double) (byte) 100, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.375d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0.375, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(58.40625d, 31.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [58.406, 31.031]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, (double) ' ');
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 32.2783203125d, 3.5d, 32.375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 7.5625d, 16.015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(61.25d, 28.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [61.25, 28.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(1.875d, 64.25d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [64.25, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(31.4375d, 59.078125d, 7.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (-1.0f), 0.0d, 25.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.5d, (-0.625d), 31.703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.5d, 59.078125d, (double) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) (short) 10, (double) (short) 100, 16.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 10L, 6.5d, 64.25d, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 12.5625d, 33.53125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, (double) (short) 1);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) 1.0f, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [1, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 12.75d, 0.0d, 0.5d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(5.78125d, 21.8515625d, (-0.375d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(48.0d, 5.125d, 18.15625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(27.75d, 16.015625d, 7.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 29.0d, 7.90625d, 57.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) '4', 5.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.75d + "'", double2 == 28.75d);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) 'a', 17.07666015625d, 31.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [97, 17.077]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(21.8515625d, 66.0d, 24.5d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 18.0625d, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(17.07666015625d, 76.0d);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(66.0d, 58.40625d, 28.306640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [66, 58.406]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(39.25d, 0.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.75d + "'", double2 == 19.75d);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (byte) 10, 76.0d, 28.306640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.0d, 31.703125d, 50.0d);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 22.5d, 14.0d, 23.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.0d, 59.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((-0.625d), 12.5625d, 4.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(59.03125d, 76.0d, 10.875d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 31.0625d, (double) (byte) 100, 32.6015625d, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 17.203125d, (double) 10.0f, 6.3125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(32.375d, (double) (short) 0, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 29.5d, 14.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [29.5, 14.125]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (byte) 100, (-0.5d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(11.6875d, 0.0d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [11.688, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 59.03125d, 5.875d, 57.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(7.90625d, (double) 0.0f, 7.5625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) '4', 22.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 40.6533203125d, 1.0d, 73.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) '#', 33.53125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [35, 33.531]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((-0.375d), 5.0d);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(11.6875d, (double) (short) 10, 75.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [11.688, 10]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 18.0625d, 7.5625d, (double) (short) 1, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (short) 0, 57.61328125d, 32.2783203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(61.25d, 10.4765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [61.25, 10.477]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.203125d, 0.0d, 17.07666015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }
}

