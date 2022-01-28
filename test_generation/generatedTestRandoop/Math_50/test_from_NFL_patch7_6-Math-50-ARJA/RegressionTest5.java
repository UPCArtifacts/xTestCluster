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
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 9.125d, 28.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(9.0d, 6.5d, 10.23828125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(22.0791015625d, 0.0d, 27.75d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 12.494140625d, 5.5d, 26.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) (short) -1, (double) (short) 100);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(9.375d, (double) 'a', 76.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) 100.0f, 31.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [100, 31]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0d, (-0.5d), 30.75d, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) (short) 0, 44.578125d, 30.125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(15.0d, (double) (-1L), 29.75d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(16.8125d, (double) 100.0f);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 45.03125d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [45.031, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(26.5d, 18.0625d, 2.65625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [26.5, 18.062]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 10.9375d, 23.125d, 9.3834228515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(38.0d, 5.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.625d + "'", double2 == 21.625d);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-0.25d), 23.125d, (double) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 15.688720703125d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [15.689, -1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 4.5d, 30.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 41.90625d, 40.6533203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [41.906, 40.653]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(32.5d, (-0.5d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [32.5, -0.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) ' ', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 15.688720703125d, 12.0d, (-0.5d), allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(6.5d, 32.6015625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.55078125d + "'", double2 == 19.55078125d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) (byte) 100, 19.55078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, 9.375d);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(12.53546142578125d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.767730712890625d + "'", double2 == 5.767730712890625d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(15.688720703125d, 10.9375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.3131103515625d + "'", double2 == 13.3131103515625d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 30.3125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) 'a', 26.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, (double) 'a');
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(18.0625d, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [18.062, 10]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(15.688720703125d, 10.4765625d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) 100L, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.25d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, 7.25d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(30.125d, 18.25d, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(31.703125d, 7.015625d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (short) -1, 34.125d, 15.8515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 13.3131103515625d, (double) 1.0f, 64.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 30.75d, 26.5d, 31.4375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 49.5d, 19.766845703125d, 19.75d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(58.2265625d, 6.3125d, 11.0006103515625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(12.5d, 34.125d, 18.15625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) 100.0f, 32.375d, 39.056640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [100, 32.375]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(23.44140625d, 11.6875d, 13.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 1.0d, 22.5d, 14.125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((-0.5d), 39.056640625d);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 58.2265625d, (double) (short) 0, (-0.75d), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(14.125d, 19.55078125d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 25.375d, 9.3834228515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [25.375, 9.383]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 1.75d, 23.32666015625d, 31.4375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) 0, 23.125d, 58.2265625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 100.0d, 15.6875d, 6.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 21.37744140625d, 9.453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 16.875d, 29.5d, 10.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 13.875d, 41.1015625d, 6.25d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(18.25d, 5.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [18.25, 5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 5.767730712890625d, 29.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) (-1L), 56.75d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 55.203125d, 5.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(32.6015625d, 6.3125d, (-0.25d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [32.602, 6.312]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(29.0625d, 0.0d, 28.306640625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 10.9375d, 24.0d, 31.4375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 11.6875d, 10.0d, (double) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 79.5390625d, 12.494140625d, 17.75d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 8.9765625d, 0.0d, 39.056640625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 1L, 15.8515625d, 9.375d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 41.1015625d, 0.0d, 24.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 28.75d, 10.9375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(23.32666015625d, 5.25d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [23.327, 5.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(48.0d, 44.578125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 46.2890625d + "'", double2 == 46.2890625d);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 49.0d, 5.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 58.2265625d, 32.375d, 12.53546142578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 7.015625d, 32.2783203125d, 31.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 12.5625d, (double) (short) -1, 0.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(73.0d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.5d + "'", double2 == 41.5d);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) ' ', 26.5d, 52.75d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(26.0d, 21.625d, 11.6875d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 14.1256103515625d, 15.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 4.5d, 1.875d, 29.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.875d, 0.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 12.5625d, 25.375d, 23.32666015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 9.125d, 0.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [9.125, 0.375]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(31.0625d, 8.0d, 31.703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [31.062, 8]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(59.078125d, 18.25d, 19.921875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [59.078, 18.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.0625d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 57.84375d, 2.65625d, 5.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) 1.0f, (-0.5d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25d + "'", double2 == 0.25d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 57.61328125d, 26.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) 1, 7.8443603515625d, 17.75d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(19.921875d, 12.75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.3359375d + "'", double2 == 16.3359375d);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 18.0625d, 25.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(38.0d, 0.0d, 13.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [38, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(20.8828125d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [20.883, -1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(15.0d, 8.15625d, 39.056640625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(13.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 56.5d + "'", double2 == 56.5d);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(3.71875d, 10.9375d, 20.8828125d);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 73.0d, 46.2890625d, 18.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '4', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 30.75d, 23.6328125d, 19.59375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 44.578125d, 7.015625d, 34.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(14.375d, 16.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.3125d + "'", double2 == 15.3125d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(0.0d, 64.25d, 20.8828125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(33.53125d, 32.6015625d, 50.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [33.531, 32.602]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(19.59375d, 31.0625d);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 5.9375d, 29.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 9.0d, 0.0d, (double) 1.0f, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 14.1256103515625d, 7.0d, 5.0625d, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 21.37744140625d, 1.75d, 31.703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(31.03125d, 38.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [38, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(12.515625d, 16.0d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 53.953125d, 9.75d, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 16.875d, 6.875d, 7.90625d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(9.75d, 28.75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.25d + "'", double2 == 19.25d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 12.494140625d, 38.0d, 29.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 64.25d, 5.23828125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [64.25, 5.238]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 26.0d, 24.4375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(23.125d, (double) (byte) 10, 5.767730712890625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 8.125d, 7.8443603515625d, 8.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(66.0d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 38.0d + "'", double2 == 38.0d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) 1L, 32.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(1.0d, 9.375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.1875d + "'", double2 == 5.1875d);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(32.5d, 51.875d, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [51.875, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 31.703125d, 4.71875d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) (byte) 10, 57.84375d, 21.8515625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 14.375d, 19.75d, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(29.0625d, 39.03125d, 32.5d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 17.0625d, 39.056640625d, (double) 1L, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(15.0d, 7.90625d, 8.125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(41.5d, 11.6875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26.59375d + "'", double2 == 26.59375d);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 14.0d, 22.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(17.07666015625d, 16.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [17.077, 16.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 14.1256103515625d, (double) 1, 31.4375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(32.5d, 1.75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.125d + "'", double2 == 17.125d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(58.2265625d, 61.25d);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 10.0d, 1.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) ' ', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 5.75d, 16.3359375d, 31.0625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 49.5d, (double) 0.0f, 0.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 16.25d, 6.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(2.75d, 76.0d, 12.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [76, 12.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 26.5d, 5.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 24.0d, 39.25d, 24.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((-0.5d), (double) (-1.0f), 79.5390625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(10.875d, 76.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 43.4375d + "'", double2 == 43.4375d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(11.5d, 61.25d, (double) 100);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(12.0d, (double) 100);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.5d, 73.0d, 23.6328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [73, 23.633]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1.0d), (double) (short) -1, 14.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(9.03125d, 41.90625d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(11.5d, 7.8443603515625d, 45.03125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) (-1L), 7.0d, 27.75d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(22.0791015625d, 73.0d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 36.25d, (double) 0L, 41.90625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(3.5d, 1.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [3.5, 1.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 20.5d, 23.6328125d, 23.32666015625d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 19.55078125d, 37.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 9.0d, 0.0d, 26.59375d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 29.0625d, 36.25d, 4.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(53.0d, 1.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [53, 1.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(32.2783203125d, 17.203125d, 48.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [32.278, 17.203]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 59.078125d, 16.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [59.078, 16.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 28.75d, 6.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) (byte) 10, 31.703125d, 30.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [31.703, 30.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (-1.0d), 16.015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) 'a', 30.75d, 29.0625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 32.375d, 9.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 49.5d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(26.5d, 9.125d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 61.25d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 29.0625d, 9.03125d, 16.875d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(15.0d, 36.25d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(12.0d, (double) (byte) 10, 17.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12, 10]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(31.0625d, 19.75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 25.40625d + "'", double2 == 25.40625d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) 10.0f, 0.0d, 39.03125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(61.25d, 19.766845703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [61.25, 19.767]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(53.953125d, 31.03125d, 73.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(31.03125d, 18.15625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.59375d + "'", double2 == 24.59375d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 7.015625d, 39.056640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) ' ', (-0.625d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [32, -0.625]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 8.0d, (-0.375d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 12.53546142578125d, 8.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.535, 8]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(19.766845703125d, 12.5625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [19.767, 12.562]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 12.5625d, 15.6875d, 76.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(12.75d, 20.8828125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.81640625d + "'", double2 == 16.81640625d);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 12.515625d, 29.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-0.625d), 29.0d, 17.84375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.375d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1875d + "'", double2 == 0.1875d);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 8.9765625d, 28.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(17.0625d, 32.5d);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) '4', 5.9375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [52, 5.938]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(4.71875d, 25.40625d, 2.65625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [25.406, 2.656]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 57.84375d, 8.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [57.844, 8.156]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(13.875d, 12.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.0625d + "'", double2 == 13.0625d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 66.0d, (double) 0, 4.71875d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.0d, 48.0d, 7.015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [48, 7.016]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0d, 53.953125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26.9765625d + "'", double2 == 26.9765625d);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 3.71875d, 29.5d, 64.25d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(16.25d, 16.0d, 50.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 9.3834228515625d, 19.59375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 16.015625d, 48.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(31.0625d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.53125d + "'", double2 == 15.53125d);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(28.306640625d, 45.03125d);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 52.75d, 59.078125d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(76.0d, 0.0d, 9.75d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 58.40625d, 57.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(20.5d, 59.03125d);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(6.9375d, 21.37744140625d, 15.6875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [21.377, 15.688]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 75.0d, 16.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [75, 16]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 40.6533203125d, 56.5d, 0.0d, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (-0.625d), 32.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 18.25d, 6.25d, 0.5d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 22.0791015625d, 4.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 5.767730712890625d, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [5.768, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 79.5390625d, 6.9375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(9.453125d, 23.125d);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(7.8443603515625d, 34.125d);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 28.5d, 7.953125d, 48.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 18.15625d, 13.3131103515625d, 12.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) ' ', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) (byte) -1, 56.5d, 10.9375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 5.0625d, 16.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 29.0d, 5.23828125d, 5.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) ' ', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 16.8125d, 15.688720703125d, (-0.25d), allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(30.75d, 8.78125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.765625d + "'", double2 == 19.765625d);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 24.59375d, 8.6015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 19.25d, 32.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 20.8828125d, 13.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [20.883, 13.062]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(31.03125d, 49.0d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(75.0d, (double) 100);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 100.0d, 52.75d, 5.767730712890625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 7.90625d, 26.9765625d, 12.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) ' ', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 9.03125d, 39.25d, 3.71875d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 66.0d, 12.494140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [66, 12.494]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.9375d, 21.625d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(55.203125d, 56.75d);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.75d, 57.0d, 10.4765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) 100.0f, 1.0625d, 64.25d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(0.0d, 66.0d, 16.015625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(3.953125d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [3.953, -1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 29.0625d, 9.3834228515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [29.062, 9.383]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(10.9375d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.46875d + "'", double2 == 5.46875d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(10.23828125d, 5.9375d, 26.59375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [10.238, 5.938]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) (-1.0f), (double) (byte) 1);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(15.75d, (-0.75d), (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [15.75, -0.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 26.59375d, 12.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [26.594, 12]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) 0L, 15.688720703125d, 28.306640625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 15.8515625d, 17.84375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 45.03125d, 57.84375d, 29.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) 0L, 33.53125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 29.0d, 13.3131103515625d, 39.056640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 18.25d, 7.25d, 19.766845703125d, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 14.1256103515625d, (-1.0d), 0.25d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 10, 4.5d, 22.0791015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(26.9765625d, 59.078125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 43.02734375d + "'", double2 == 43.02734375d);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 3.71875d, 7.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 18.25d, (-0.5d), 21.8515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (byte) 10, 29.0d, 57.84375d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 32.5d, 17.125d, 26.9765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(21.37744140625d, 21.37744140625d, 12.25d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 5.23828125d, 31.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 8.0d, 57.0d, 28.306640625d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 21.625d, 9.375d, 7.953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.5d, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 4.0d, 43.02734375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) ' ', (double) 1L, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [32, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 41.1015625d, 5.25d, 19.59375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) (short) -1, 15.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 10.4765625d, 41.90625d, 31.0625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 19.25d, 0.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 5.9375d, 5.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [5.938, 5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 6.875d, 15.6875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 8.78125d, 66.0d, 33.53125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 12.515625d, 2.65625d, 16.015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(6.5d, 4.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [6.5, 4]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(22.640625d, 6.25d, 28.306640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [22.641, 6.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.0d, 10.4765625d, 17.203125d, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 50.0d, 73.0d, 6.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 52.75d, 16.0d, 29.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) ' ', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 19.25d, (-0.25d), 23.6328125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(6.9375d, 16.81640625d, 14.375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(29.0d, 5.78125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.390625d + "'", double2 == 17.390625d);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 10.9375d, 57.0d, (-0.25d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) 0L, (double) (-1), 12.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, -1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 9.3834228515625d, 17.390625d, 5.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) 1L, 19.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 39.25d, (double) (byte) -1, 23.32666015625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 25.40625d, 9.75d, 0.0d, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((-0.5d), (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.25d) + "'", double2 == (-0.25d));
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 'a', 6.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 15.688720703125d, 18.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 49.0d, 79.5390625d, 0.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 58.2265625d, 10.0d, 13.0d, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 46.2890625d, 24.5d, 59.03125d, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 25.25d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) (-1L), 7.5625d, 1.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) -1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.0d, 17.125d, 59.078125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) 100L, 45.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) (short) 10, 22.640625d, 7.90625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.75d, 21.37744140625d, 17.07666015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 12.75d, 16.81640625d, 21.8515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) 1, 12.25d, 5.46875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.25, 5.469]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) '4', 31.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [52, 31.031]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(6.875d, 43.02734375d, (double) 100);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 10.23828125d, 30.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 52.75d, 12.5625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [52.75, 12.562]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 10.9375d, 5.23828125d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) 'a', 18.25d, 5.50030517578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [97, 18.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 10.4765625d, 76.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 20.5d, 7.5625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [20.5, 7.562]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.375d, 20.5d, 49.5d, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 55.203125d, 12.53546142578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 19.59375d, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '4', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 56.75d, 0.0d, 16.8125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 13.40625d, 12.53546142578125d, 0.0d, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 57.84375d, 8.9765625d, 56.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(23.6328125d, 29.75d, 16.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [29.75, 16]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(7.5625d, (double) '#', (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [35, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) (byte) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 27.75d, 73.0d, 29.75d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 12.515625d, 64.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(12.25d, 2.65625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.25, 2.656]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(1.0d, 39.056640625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0283203125d + "'", double2 == 20.0283203125d);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(24.59375d, 10.4375d, 41.5d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 12.0d, 27.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 40.6533203125d, 0.0d, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((-0.375d), 39.25d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 12.53546142578125d, 29.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 24.0d, 32.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 15.688720703125d, 51.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 10.23828125d, 22.640625d, (double) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(8.125d, 1.75d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(14.125d, 20.0283203125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [20.028, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 24.9765625d, 24.59375d, 3.71875d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) 1L, 16.875d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(23.6328125d, (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.31640625d + "'", double2 == 11.31640625d);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(19.75d, 16.81640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [19.75, 16.816]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) 10L, 8.78125d, 5.767730712890625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 8.78125d, 25.40625d, 7.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(6.875d, 22.0791015625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.47705078125d + "'", double2 == 14.47705078125d);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 37.5d, 8.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [37.5, 8]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) 0, 24.0d, 41.90625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(5.75d, 10.875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.3125d + "'", double2 == 8.3125d);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 46.2890625d, 34.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [46.289, 34.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.46875d, 30.3125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) (short) 1, 25.57080078125d, 15.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [25.571, 15.156]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 32.2783203125d, 29.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 9.75d, 18.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 73.0d, 25.375d, 3.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(23.32666015625d, 22.5d, 0.25d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(15.53125d, 30.75d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 32.2783203125d, 73.0d, 18.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 24.0d, 66.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(5.50030517578125d, 12.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) 'a', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) 100.0f, 5.25d, 23.125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) ' ', 24.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 10.875d, 16.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 5.23828125d, 19.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(29.515625d, 1.875d, 15.6875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [29.516, 1.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 23.32666015625d, 29.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 33.53125d, 4.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(45.03125d, 0.0d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(55.203125d, 26.9765625d, 17.390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [55.203, 26.977]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 0.0d, 23.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 30.125d, 26.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.875d, 79.5390625d, 44.578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 4.5d, 25.5d, 31.703125d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 17.0625d, 15.688720703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, 43.02734375d);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.03125d, 15.75d, (-0.375d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 5.767730712890625d, 12.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(64.25d, (-0.625d), 0.1875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [64.25, -0.625]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(10.0d, 29.0625d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [29.062, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 3.953125d, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [3.953, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(3.5d, 25.375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.4375d + "'", double2 == 14.4375d);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(5.767730712890625d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [5.768, -1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) (byte) 10, 8.78125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.0d, 34.125d, 53.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 18.15625d, 0.0d, 29.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(12.25d, 6.25d, 20.8828125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) (-1.0f), 58.40625d, 25.40625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(15.3125d, (-0.75d), 9.453125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(5.0625d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.53125d + "'", double2 == 2.53125d);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(14.375d, 10.23828125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.306640625d + "'", double2 == 12.306640625d);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) '#', 26.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, (double) 100.0f, 31.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 57.61328125d, (-0.75d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 12.515625d, 12.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 31.703125d, 19.921875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(7.0d, 3.71875d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) -1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) '#', 2.75d, (-1.0d), allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(27.75d, 7.5625d, 57.61328125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(2.65625d, (double) (short) 100, 3.71875d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(14.0d, 22.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.25d + "'", double2 == 18.25d);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.25d, (double) 100.0f, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 45.03125d, 0.0d, 4.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 5.78125d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 39.03125d, 9.375d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(31.0625d, 6.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.65625d + "'", double2 == 18.65625d);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 28.75d, 25.25d, 31.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 12.515625d, 29.515625d, 0.0d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 11.6875d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 19.766845703125d, 10.9375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (byte) 100, 43.4375d, 5.46875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 11.31640625d, (double) 1L, 19.59375d, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 14.125d, 26.9765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 7.5625d, 5.5d, 15.6875d, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(30.3125d, 8.15625d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 14.0d, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 30.125d, (double) 100, 1.0d, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(39.056640625d, (double) 100);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(45.03125d, 0.0d, 19.25d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 16.875d, 14.1256103515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 43.02734375d, 36.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [43.027, 36.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 22.0791015625d, 39.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 23.125d, 19.765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [23.125, 19.766]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 17.125d, 6.25d, 3.953125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 2.75d, 75.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 100.0d, 5.78125d, 10.9375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 32.5d, 19.766845703125d, 10.4375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(52.75d, 0.375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26.5625d + "'", double2 == 26.5625d);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 14.4375d, 15.6875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 17.203125d, 28.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 11.0006103515625d, 16.8125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(39.25d, 32.6015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [39.25, 32.602]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(15.688720703125d, 24.59375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.1412353515625d + "'", double2 == 20.1412353515625d);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 39.25d, (double) (short) -1, 21.37744140625d, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 7.8443603515625d, 16.3359375d, 29.0d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) (-1.0f), 30.75d);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 53.0d, 26.59375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) (short) -1, 25.57080078125d);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 29.75d, 12.494140625d, 5.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 18.65625d, 16.875d, (double) (byte) 10, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(4.5d, 25.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.875d + "'", double2 == 14.875d);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(61.25d, 61.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [61.25, 61.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(5.0d, 5.875d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [5.875, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 17.07666015625d, 6.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 19.921875d, 19.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [19.922, 19.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(21.625d, 21.37744140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [21.625, 21.377]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(18.25d, (-0.25d), 17.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [18.25, -0.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 15.3125d, 26.0d, (-0.75d), 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 59.03125d, 13.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [59.031, 13.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(29.515625d, 26.5625d, 0.25d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 41.5d, 4.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(9.0d, 10.0d, 19.765625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 46.2890625d, 9.75d, 5.5d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 4.5d, 16.015625d, 41.1015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(57.61328125d, 32.2783203125d, 5.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [57.613, 32.278]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 22.0791015625d, 53.953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 1, 0.1875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) (short) 0, (-0.625d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3125d) + "'", double2 == (-0.3125d));
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 1.0625d, 45.03125d, 41.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 31.03125d, 41.90625d, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 73.0d, 13.875d, 6.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) 100, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 61.25d, 8.78125d, 27.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(53.0d, 64.25d);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 2.53125d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [2.531, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(56.5d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [56.5, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(13.40625d, 31.4375d, 4.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [31.438, 4.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.03125d, 7.8443603515625d, 12.515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.23828125d, 16.015625d, 30.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 39.056640625d, (double) 0.0f, 5.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(10.4765625d, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.23828125d + "'", double2 == 10.23828125d);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 7.953125d, 3.953125d, 4.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 2.53125d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (-1.0f), (-0.3125d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 27.75d, 19.921875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 3.71875d, 14.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(16.8125d, 29.515625d);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 53.0d, 16.25d, 15.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(24.5d, 18.65625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.578125d + "'", double2 == 21.578125d);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) 1, 9.3834228515625d, 51.875d);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(39.03125d, 73.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 56.015625d + "'", double2 == 56.015625d);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(24.4375d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 62.21875d + "'", double2 == 62.21875d);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 19.59375d, 5.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [19.594, 5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(9.125d, (double) (byte) -1, 24.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 29.0625d, 16.875d, 29.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 16.25d, 34.25d, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) 1L, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(26.5625d, 5.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [26.562, 5.062]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(28.75d, 5.50030517578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [28.75, 5.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(29.75d, 19.25d, 50.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 7.015625d, 6.3125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-0.5d), 44.578125d, 5.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 58.2265625d, 15.6875d, (double) 0.0f, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 38.0d, 43.02734375d, 3.71875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 4.0d, 10.23828125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 15.3125d, 9.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(6.9375d, 12.25d, 19.921875d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 56.015625d, 19.921875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [56.016, 19.922]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(30.125d, 59.03125d);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.46875d, 12.53546142578125d, 0.25d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(75.0d, 17.203125d, 36.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [75, 17.203]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(14.1256103515625d, 31.0d, 15.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [31, 15.156]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(17.390625d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.1953125d + "'", double2 == 8.1953125d);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 26.5d, 6.9375d, 16.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(23.6328125d, 0.0d, 39.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [23.633, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0d, 39.03125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.515625d + "'", double2 == 19.515625d);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 26.9765625d, 3.71875d, 59.078125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 39.25d, 11.6875d, 5.1875d, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(16.875d, 29.0625d);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.5d, 17.84375d, 44.578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }
}

