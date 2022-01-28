import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(56.015625d, 43.02734375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [56.016, 43.027]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(15.8515625d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [15.852, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(10.15625d, 5.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [10.156, 5.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 4.478515625d, 18.9580078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 16.78125d, 48.92578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0d, 40.6533203125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.32666015625d + "'", double2 == 20.32666015625d);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(6.0d, 17.6875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.84375d + "'", double2 == 11.84375d);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(5.50030517578125d, 48.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26.750152587890625d + "'", double2 == 26.750152587890625d);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 13.716796875d, 1.578125d, 33.53125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 17.5791015625d, 65.8515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 14.0d, 15.10546875d, 10.85546875d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(18.34375d, 20.1412353515625d, 41.90625d);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(60.25d, 11.663330078125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.9566650390625d + "'", double2 == 35.9566650390625d);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 8.8828125d, 13.36749267578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(30.75d, 18.1533203125d, 37.64453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [30.75, 18.153]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 45.03125d, 19.515625d, 59.03125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(15.89453125d, 34.125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 25.009765625d + "'", double2 == 25.009765625d);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 15.88916015625d, 76.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 8.15625d, 23.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 32.6015625d, 16.16015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [32.602, 16.16]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 4.0078125d, 29.515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(76.0d, 28.84765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [76, 28.848]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 28.75d, 33.53125d, 5.375d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 30.1533203125d, 13.60546875d, 11.3125d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(3.953125d, 17.658203125d);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 42.0d, 25.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [42, 25.375]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 55.203125d, (double) 0.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(13.89794921875d, 6.4854278564453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [13.898, 6.485]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 16.7890625d, 7.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 78.5d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 24.4375d, 13.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) 1.0f, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [1, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 29.5d, 31.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.0d, (double) 0, 7.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 29.515625d, 27.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(39.25d, 25.009765625d, 19.515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [39.25, 25.01]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(11.476638793945312d, 13.0625d, (double) '#');
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(31.0625d, 33.234375d);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 12.8203125d, 0.0d, 25.22265625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(28.375d, 4.03125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.203125d + "'", double2 == 16.203125d);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(31.48046875d, 30.125d, 54.990234375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 3.0390625d, 61.23828125d, 31.9765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 2.0d, 2.65625d, 9.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) ' ', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 15.688720703125d, 5.78125d, 12.53546142578125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(9.6767578125d, 25.22265625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.44970703125d + "'", double2 == 17.44970703125d);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(3.953125d, 12.494140625d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.494, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(43.0390625d, 5.78155517578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [43.039, 5.782]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) 1L, 8.8828125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.94140625d + "'", double2 == 4.94140625d);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 9.3834228515625d, 6.718902587890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 32.6015625d, 2.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(21.513671875d, 43.0390625d, 26.59375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(2.96875d, 18.382232666015625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.675491333007812d + "'", double2 == 10.675491333007812d);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.1875d, 15.3125d);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 12.775390625d, 11.410346984863281d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) -1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 21.265625d, 29.75d, 11.53125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(20.1412353515625d, 66.0d, (-0.75d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 17.658203125d, 6.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.75d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 26.59375d, 20.1328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(76.0d, 22.640625d, 74.5d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(19.515625d, 53.0d, 13.36749267578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [53, 13.367]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(10.4541015625d, 5.375d, 41.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [10.454, 5.375]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.23828125d, 48.4501953125d, 53.953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(5.75d, 5.46875d, 22.875d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) (short) 10, 0.59375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [10, 0.594]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 20.68359375d, 7.984375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 22.4453125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(15.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [15, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(75.0d, 22.875d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(39.25d, 51.875d, 31.9765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [51.875, 31.977]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(20.1875d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [20.188, 10]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(4.478515625d, 29.0d, 18.375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(14.61328125d, 7.056640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [14.613, 7.057]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, 31.0625d);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 78.5d, 18.0625d, 13.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(49.0d, 2.65625d, 3.92578125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(25.375d, 19.765625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.5703125d + "'", double2 == 22.5703125d);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) (byte) 1, 28.46875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 10.85546875d, 54.30078125d, 36.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.0d, 5.1875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) -1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 11.410346984863281d, 22.4453125d, (double) (short) 10, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 4.5d, 10.64892578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 32.2783203125d, 4.478515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(22.4453125d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.22265625d + "'", double2 == 11.22265625d);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 1.015625d, 37.5d, 6.5703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 22.5d, 56.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 15.375d, (double) 0.0f, 6.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(26.1875d, 10.791168212890625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.489334106445312d + "'", double2 == 18.489334106445312d);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 12.75d, 5.78125d, 1.578125d, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(5.50030517578125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [5.5, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 4.03125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(37.5625d, 21.8515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [37.562, 21.852]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((-1), univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 30.0d, 20.1875d, 3.953125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 11.410346984863281d, 24.59375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 38.89453125d, 18.1533203125d, 35.9566650390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 6.875d, 29.875d, 1.578125d, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(25.5d, 18.15625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.828125d + "'", double2 == 21.828125d);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 18.8759765625d, 1.578125d, 33.2109375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 7.8443603515625d, 6.875d, 10.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 15.251953125d, 41.90625d, 75.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) (-1L), 24.59375d, 9.75d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(4.03125d, (double) (byte) 100, 23.01953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [100, 23.02]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 10.60546875d, 5.50030517578125d, 14.4375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (-0.625d), 14.10186767578125d, 10.453125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 10.453125d, 29.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(24.4375d, 14.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [24.438, 14.125]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.59375d, 26.59375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 28.390625d, 3.71875d, 5.78125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 17.00390625d, 3.78125d, 13.3131103515625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(15.3125d, 17.84814453125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.580322265625d + "'", double2 == 16.580322265625d);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 12.2509765625d, 46.2890625d, 15.571365356445312d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 26.9765625d, 23.44140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(6.15625d, (-1.0d), 10.85546875d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 17.6875d, 45.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(6.9375d, 8.6015625d, 29.0625d);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 65.8515625d, 8.658203125d, 5.23828125d, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 34.09375d, 11.3203125d, 19.515625d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 18.25d, (-0.8125d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 9.3834228515625d, 25.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 78.5d, 0.59375d, 8.658203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(0.59375d, 9.75d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(57.84375d, 22.4453125d, 32.125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (byte) 0, 18.0625d, 3.0390625d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(15.571365356445312d, 1.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [15.571, 1.062]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 26.9765625d, 12.494140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 48.4501953125d, 24.57666015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(43.02734375d, 10.23828125d, 6.5703125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(25.1396484375d, 11.3125d, 16.42413330078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [25.14, 11.312]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 14.15655517578125d, 55.203125d, 9.3834228515625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 30.0d, 27.375d, 13.875d, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 14.9765625d, 19.1138916015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(17.973785400390625d, 17.0625d, 10.23828125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 57.0d, 79.5390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(5.46875d, 22.5703125d);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) (byte) 0, 30.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 20.2421875d, 6.9375d, 12.2509765625d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 29.875d, 9.3834228515625d, 3.0390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 16.42413330078125d, 0.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(7.0d, 15.10546875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.052734375d + "'", double2 == 11.052734375d);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 6.3125d, 22.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(24.3828125d, (double) 10.0f, 27.390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [24.383, 10]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) (short) 0, 19.1138916015625d, 6.25d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.53125d, 21.625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.078125d + "'", double2 == 11.078125d);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 26.5d, 18.822265625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [26.5, 18.822]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 11.2890625d, 51.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 10.0d, 22.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 19.1138916015625d, 6.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(14.10186767578125d, 6.718902587890625d, 7.5625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [14.102, 6.719]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(6.7138671875d, 24.59375d, 34.25d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.00390625d, 0.0d, 14.0d, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 12.0d, 53.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 31.5390625d, 7.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [31.539, 7.062]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 16.0d, 6.7138671875d, 24.9736328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 30.75d, 20.8828125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.03125d, 64.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 1.375d, 18.1533203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 11.5d, 5.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.0d, 8.15625d, 14.046875d);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 18.34375d, 28.25d, 11.53125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) 100.0f, 37.5625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 68.78125d + "'", double2 == 68.78125d);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 18.8759765625d, 19.55078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(17.07666015625d, 15.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [17.077, 15]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 28.306640625d, (double) (short) 1, 5.78125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 19.216796875d, 17.07666015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [19.217, 17.077]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 24.9765625d, 7.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [24.977, 7.062]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 13.875d, 29.515625d, 23.15625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 13.60546875d, 5.767730712890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 13.89794921875d, 19.25d, 74.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(9.6767578125d, 7.0d, (-0.8125d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 18.489334106445312d, 13.31640625d, 21.611480712890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) -1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 5.50030517578125d, 0.0d, 21.828125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.203125d, 30.125d, 30.0d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 41.5d, 13.8515625d, 14.875d, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 16.015625d, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 29.5390625d, 31.388671875d, 11.078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 18.375d, 48.4501953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(18.1533203125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [18.153, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 1.015625d, 17.0625d, 12.2509765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 12.4873046875d, 14.1256103515625d, 47.726715087890625d, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 19.765625d, 13.43780517578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(11.2890625d, 18.5885009765625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.93878173828125d + "'", double2 == 14.93878173828125d);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(15.251953125d, 20.53125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.8916015625d + "'", double2 == 17.8916015625d);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) 'a', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 5.0d, 38.89453125d, 11.078125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) (byte) 10, 49.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.75d + "'", double2 == 29.75d);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 32.375d, 30.1533203125d, 10.1328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 0.6875d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.5390625d, 20.1875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 28.75d, 5.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 58.2265625d, 24.9765625d, 0.6875d, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 5.5d, (double) 1L, 17.6875d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 14.427734375d, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(27.375d, 11.53125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.453125d + "'", double2 == 19.453125d);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 3.5d, 23.6328125d, 14.11328125d, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 7.953125d, 15.75d, 8.8828125d, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 3.0390625d, 5.875d, 19.3349609375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 22.0791015625d, 31.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.6875d, 0.25d, 32.2783203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 10.15625d, 6.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 21.513671875d, 31.5390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 1, 11.410346984863281d, 13.8515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 13.8515625d, 28.306640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(5.0d, 20.0283203125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.51416015625d + "'", double2 == 12.51416015625d);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(22.76953125d, 1.0625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.916015625d + "'", double2 == 11.916015625d);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 29.75d, 13.0625d, 5.4453125d, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 32.375d, (double) 'a', (double) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 5.25d, 28.46875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 33.234375d, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 4.478515625d, 10.60546875d, 35.9566650390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(10.875d, 17.390625d, 39.25d);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 37.64453125d, (-0.375d), 12.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 16.06640625d, 29.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(70.39453125d, 32.2783203125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.33642578125d + "'", double2 == 51.33642578125d);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(70.39453125d, 9.72265625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 40.05859375d + "'", double2 == 40.05859375d);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(16.015625d, 5.767730712890625d, 18.34375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [16.016, 5.768]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 9.72265625d, (-0.5d), 42.69171142578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(21.37744140625d, 6.4854278564453125d, 76.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) -1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 12.0d, 22.76953125d, 9.03125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 10.4765625d, 6.640625d, 29.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(9.125d, 20.8828125d);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((-0.8125d), 14.15655517578125d, 35.9566650390625d);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 27.0d, 32.1328125d, 4.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 25.57080078125d, 21.625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [25.571, 21.625]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 23.44140625d, 17.6875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(24.125d, 56.75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 40.4375d + "'", double2 == 40.4375d);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 1.375d, 12.2509765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(11.3203125d, 6.3125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [11.32, 6.312]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) (short) 100, 14.125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.0625d + "'", double2 == 57.0625d);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (-0.25d), 60.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(8.3125d, 15.6875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.0d + "'", double2 == 12.0d);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 5.75d, 18.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 34.4970703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(32.6015625d, 13.875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.23828125d + "'", double2 == 23.23828125d);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 1L, 24.125d, 25.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 35.11328125d, 0.5d, 11.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 25.25d, 21.50390625d, 6.3125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 13.25d, 6.7138671875d, 17.44970703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.0d, (double) 100.0f, 28.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [100, 28.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 45.3291015625d, 22.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(11.052734375d, 0.0d, 17.658203125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 0.0d, 7.984375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 26.9765625d, 31.703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 39.53955078125d, 10.453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [39.54, 10.453]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 21.611480712890625d, 8.9765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 26.750152587890625d, 14.15655517578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [26.75, 14.157]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(32.2783203125d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [32.278, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 12.2509765625d, 50.0d, 64.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 18.5885009765625d, 10.675491333007812d, 40.05859375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) (short) 100, 40.6533203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [100, 40.653]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) ' ', 54.30078125d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.658203125d, 14.046875d, 31.03125d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 16.42413330078125d, 31.4375d, 27.4140625d, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(7.5625d, 28.87890625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.220703125d + "'", double2 == 18.220703125d);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(12.51416015625d, 21.828125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.171142578125d + "'", double2 == 17.171142578125d);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 20.5d, (double) '#', 6.859375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(15.8515625d, 37.5d, 12.51416015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [37.5, 12.514]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(23.625d, (-0.3125d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [23.625, -0.312]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 0.0d, 6.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 9.125d, 49.25d, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(46.2890625d, 11.30078125d, 5.9375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 14.1256103515625d, 23.625d, 25.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 20.53125d, 15.75d, 0.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 11.078125d, 30.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(6.5d, 59.03125d, 50.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 6.640625d, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(7.0d, 19.515625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.2578125d + "'", double2 == 13.2578125d);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.4453125d, 11.75d, 65.8515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(26.938720703125d, (double) (byte) 100, 7.5625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((-1), univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 21.08203125d, 28.306640625d, 0.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) 'a', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 31.388671875d, 25.1396484375d, 15.375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 19.25d, 31.0625d, 14.046875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 10.65625d, 0.0d, 24.9765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 5.375d, 23.625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(27.75d, (double) (byte) -1, 45.89453125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(19.216796875d, 21.845703125d, 9.453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [21.846, 9.453]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(18.382232666015625d, 8.921875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.652053833007812d + "'", double2 == 13.652053833007812d);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(5.125d, 13.3131103515625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.21905517578125d + "'", double2 == 9.21905517578125d);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 100L, 57.61328125d, 12.494140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 21.8515625d, 21.625d, 1.578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(6.7138671875d, 23.6328125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.17333984375d + "'", double2 == 15.17333984375d);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 23.125d, 13.716796875d, 27.390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 10, 27.75d, 10.453125d, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 3.953125d, 11.605712890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 13.43780517578125d, 6.875d, 24.9765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(22.5d, 32.1328125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 27.31640625d + "'", double2 == 27.31640625d);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-0.625d), 0.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 16.92578125d, 26.8232421875d, 28.84765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((-0.3125d), 30.125d, 7.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 10.84375d, 19.75d, 13.31640625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(19.55078125d, 18.382232666015625d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [19.551, 18.382]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 12.8203125d, 14.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.0d, 34.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 48.0d, 15.6875d, 10.94140625d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 0.0d, 12.8203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 5.125d, 5.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(15.3125d, 23.125d);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 14.427734375d, 10.85546875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) -1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) 0, 26.9765625d, 65.8515625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 34.09375d, 23.32666015625d, 13.31640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 29.7890625d, 29.5d, 6.640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 14.046875d, 30.1533203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(7.203277587890625d, 5.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 43.0390625d, 22.76953125d, 25.57080078125d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 8.8828125d, 34.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.375d, 32.6015625d, 24.125d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 17.84375d, 25.57080078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 13.336463928222656d, 24.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(17.8916015625d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [17.892, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 22.76953125d, 17.5791015625d, 15.23046875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 29.5390625d, 19.766845703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 31.0d, 28.306640625d, 11.34405517578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(5.875d, 28.697265625d, 17.0625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 18.1533203125d, 17.265625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [18.153, 17.266]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(10.94140625d, 40.6533203125d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 20.8828125d, 28.84765625d, 20.0283203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 13.43780517578125d, 5.767730712890625d, 43.4375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 8.6015625d, 1.015625d, 29.515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(0.0d, 27.4140625d, 31.703125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 11.31640625d, 10.60546875d, 14.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) (short) 0, 10.675491333007812d, 29.515625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 12.306640625d, 37.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 9.21905517578125d, 2.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [9.219, 2.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 6.7138671875d, 26.8232421875d, 15.3125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 13.0625d, 4.478515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [13.062, 4.479]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(12.5625d, 14.9765625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.76953125d + "'", double2 == 13.76953125d);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(11.410346984863281d, 0.0d, 12.515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [11.41, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 6.859375d, 34.125d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 8.3125d, 13.76953125d, 31.5390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, 36.351806640625d);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.78125d, 28.375d, 19.0283203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 18.1533203125d, 30.3125d, 17.07666015625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 9.875d, 11.975830078125d, 0.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(76.0d, 0.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [76, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 27.0d, 8.875d, 7.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(12.51416015625d, 27.31640625d, 28.306640625d);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 13.336463928222656d, 65.8515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.75d, 37.5d, 24.57666015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 18.822265625d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [18.822, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.578125d, 25.57080078125d, 29.875d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(43.0390625d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [43.039, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 11.916015625d, 43.0390625d, 21.611480712890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 26.5625d, 1.0d, 39.53955078125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 27.0d, 56.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 10L, 9.125d, 10.1328125d, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 18.822265625d, 75.0d, 17.84375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 48.4501953125d, 11.587890625d, 13.36749267578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 56.5d, 25.22265625d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 20.8828125d, 30.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 54.30078125d, 7.8443603515625d, 6.859375d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 13.2578125d, 5.78125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 24.0d, 3.78125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(8.0078125d, 16.7890625d, 20.1328125d);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(6.0d, 19.766845703125d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(29.75d, 18.822265625d, 9.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(46.2890625d, 0.0d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 24.4375d, 24.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(19.515625d, 34.4970703125d, 18.489334106445312d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [34.497, 18.489]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(12.306640625d, 18.146484375d, 29.0625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 25.5d, 26.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(49.25d, 10.1328125d, 14.427734375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(6.859375d, 12.2509765625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.55517578125d + "'", double2 == 9.55517578125d);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(13.875d, 10.4375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.15625d + "'", double2 == 12.15625d);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 22.640625d, 10.23828125d, 13.2578125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 17.84375d, 26.59375d, 11.34405517578125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(50.0d, 51.875d, 12.4873046875d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0d, 15.571365356445312d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.785682678222656d + "'", double2 == 7.785682678222656d);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(43.02734375d, 15.88916015625d, 2.65625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, 38.89453125d);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(19.1138916015625d, 14.93878173828125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [19.114, 14.939]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 0.0d, 18.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 15.53125d, 23.95166015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(15.53125d, 1.015625d, 21.625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(45.03125d, 31.0625d, 50.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [45.031, 31.062]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.0d, 68.78125d, (double) (short) 100);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(29.0d, 36.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.625d + "'", double2 == 32.625d);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(26.9765625d, 29.75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.36328125d + "'", double2 == 28.36328125d);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(23.6328125d, 7.8443603515625d, 24.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [23.633, 7.844]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 4.478515625d, (double) (-1.0f), 34.09375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (short) 100, 0.0d, 28.25d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(10.23828125d, 4.03125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.134765625d + "'", double2 == 7.134765625d);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(39.03125d, 28.84765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [39.031, 28.848]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(8.1953125d, 7.134765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [8.195, 7.135]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 8.8828125d, 16.8125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(55.203125d, 29.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [55.203, 29.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 24.125d, 11.0006103515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (-1.0f), 12.359375d, 10.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(68.78125d, 37.5d, 49.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(26.80908203125d, 5.78155517578125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.295318603515625d + "'", double2 == 16.295318603515625d);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 23.125d, 9.55517578125d, 49.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.0d, (-0.8125d), 19.216796875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, -0.812]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) ' ', 14.9765625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.48828125d + "'", double2 == 23.48828125d);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 23.01953125d, 5.50030517578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(43.0390625d, 9.453125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [43.039, 9.453]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 26.1875d, 35.9566650390625d, 0.59375d, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 60.25d, 16.295318603515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 24.9736328125d, 29.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(14.125d, 76.0d, 5.875d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 7.203277587890625d, 40.6533203125d, 76.0d, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 33.072265625d, 17.5791015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.6875d, 37.5625d, 14.15655517578125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 1.0625d, 6.5d, 29.5d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(50.0d, 19.216796875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [50, 19.217]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 6.25d, 33.072265625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 19.25d, 17.5791015625d, 27.31640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(15.17333984375d, 18.489334106445312d, 76.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 8.15625d, 10.64892578125d, 73.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 14.61328125d, (double) 0L, 52.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 20.2421875d, 16.25d, 19.55078125d, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 23.01953125d, 10.7890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 21.625d, 9.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [21.625, 9.031]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 45.03125d, 31.0d, 19.921875d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 16.295318603515625d, 3.92578125d, 1.015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(20.1328125d, 9.19140625d, 34.4970703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [20.133, 9.191]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(16.92578125d, 6.9375d, 24.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [16.926, 6.938]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 3.78125d, 31.388671875d, 19.766845703125d, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 17.8916015625d, 7.134765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 16.42413330078125d, 13.2578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 6.7138671875d, 0.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 25.22265625d, 4.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 3.953125d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(12.25d, 20.32666015625d, 2.53125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 41.1015625d, 27.75d, 56.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '4', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 32.5d, 10.1328125d, 29.515625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 23.625d, 15.10546875d, 19.0283203125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-0.75d), 73.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(16.16015625d, 10.4375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.298828125d + "'", double2 == 13.298828125d);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 11.53125d, 4.0d, 17.44970703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 33.42041015625d, 17.0625d, 19.765625d, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 3.71875d, (double) (short) 10, (-0.8125d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 14.375d, 14.15655517578125d, 6.859375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(49.25d, 7.0d, 20.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [49.25, 7]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 21.08203125d, 8.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [21.082, 8.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 18.489334106445312d, 10.65625d, 11.2890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 25.5d, 10.7890625d, 28.84765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 14.875d, 36.6875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 32.2783203125d, 28.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.0d, 10.0d, 11.2890625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(7.90625d, 11.587890625d, 8.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 12.625d, 8.78125d, 12.625d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-0.15625d), 5.25d, 11.53125d, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(20.75d, 15.23046875d, 21.828125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 19.43975830078125d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [19.44, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 2.0d, 17.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 57.84375d, 16.295318603515625d, 22.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) -1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 1.0625d, 13.36749267578125d, 5.875d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 56.5d, 25.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 7.5625d, 6.875d, 5.672027587890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 16.8125d, (double) (short) 0, 28.36328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(25.009765625d, (double) (byte) 100);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 66.0d, 18.955078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(9.453125d, 11.53125d, 19.59375d);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 5.767730712890625d, 9.19140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(18.15625d, 57.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 37.578125d + "'", double2 == 37.578125d);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(32.6015625d, 9.3834228515625d, 40.6533203125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 16.015625d, (double) 100L, 38.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 19.75d, 13.875d, 12.0d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(42.69171142578125d, 7.134765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [42.692, 7.135]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 5.2939453125d, 24.9765625d, 7.8443603515625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 16.16015625d, 7.134765625d, 0.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 75.0d, 23.44140625d, 14.046875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 22.76953125d, (double) 100L, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 21.845703125d, 73.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(5.23828125d, 37.578125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.408203125d + "'", double2 == 21.408203125d);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 13.36749267578125d, 28.697265625d, 18.34375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) (short) 100, 17.0625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 58.53125d + "'", double2 == 58.53125d);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (-0.15625d), 15.8515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 13.3131103515625d, 24.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 15.571365356445312d, 44.578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) (short) 0, 16.3359375d);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (short) 10, 7.203277587890625d, 28.390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 29.0d, 13.43780517578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(11.052734375d, 65.8515625d, 18.146484375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 18.489334106445312d, 30.1533203125d, 32.375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '4', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 4.03125d, 76.0d, 46.3125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 9.21905517578125d, 2.53125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(14.375d, 32.5d, 37.578125d);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.0d, 26.5d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [26.5, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 23.125d, 29.0625d, 20.8828125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(26.9765625d, 39.53955078125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 33.258056640625d + "'", double2 == 33.258056640625d);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 12.775390625d, 32.125d, 12.609375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 8.1953125d, 13.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(13.60546875d, 28.46875d, 12.51416015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [28.469, 12.514]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(17.4921875d, 48.92578125d, 37.04718017578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [48.926, 37.047]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) 10L, 44.578125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 27.2890625d + "'", double2 == 27.2890625d);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.03125d, 19.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(54.30078125d, 9.03125d, 39.056640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [54.301, 9.031]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(17.203125d, 26.1875d);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 11.6875d, 0.0d, 0.6875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.9375d, 15.0d, 32.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(21.611480712890625d, 33.2109375d, 15.251953125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(18.822265625d, 29.875d, 15.90625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [29.875, 15.906]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(33.072265625d, 3.0390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [33.072, 3.039]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 15.0d, 33.258056640625d, 5.5d, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(10.4375d, (double) 10L, 32.2783203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [10.438, 10]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 59.03125d, 22.5703125d, 31.703125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(9.3834228515625d, 25.1396484375d, 26.5d);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(56.75d, 14.9765625d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 26.0d, 10.4765625d, 22.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 20.2421875d, 49.0d, 54.30078125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 15.375d, 32.2783203125d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 21.375d, 11.975830078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [21.375, 11.976]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }
}

