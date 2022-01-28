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
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(32);
        simplexSolver0.setMaxIterations((int) 'a');
        java.lang.Class<?> wildcardClass9 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int9 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int12 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 52);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations(10);
        int int5 = simplexSolver0.getIterations();
        int int6 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1.0f);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations((-1));
        int int10 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        simplexSolver1.setMaxIterations((-1));
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(52);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int12 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        simplexSolver1.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10L);
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int7 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '#');
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        simplexSolver1.setMaxIterations(100);
        int int10 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        simplexSolver1.setMaxIterations(100);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        simplexSolver0.setMaxIterations((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '#');
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        simplexSolver1.setMaxIterations(35);
        int int12 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((-1));
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray8 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList9 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList9, linearConstraintArray8);
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.optimize(linearObjectiveFunction7, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList9, goalType11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(100);
        int int11 = simplexSolver0.getIterations();
        int int12 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(35);
        int int11 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        int int13 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations(10);
        simplexSolver0.setMaxIterations((int) (short) 1);
        simplexSolver0.setMaxIterations((int) ' ');
        simplexSolver0.setMaxIterations((-1));
        int int11 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations(10);
        simplexSolver0.setMaxIterations((int) (short) 1);
        simplexSolver0.setMaxIterations((int) ' ');
        simplexSolver0.setMaxIterations((int) (byte) 10);
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations((int) ' ');
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 0);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 97);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int9 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        simplexSolver1.setMaxIterations((-1));
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        simplexSolver1.setMaxIterations((int) ' ');
        simplexSolver1.setMaxIterations(100);
        int int11 = simplexSolver1.getMaxIterations();
        int int12 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction13 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray14 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList15 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList15, linearConstraintArray14);
        org.apache.commons.math.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = simplexSolver1.optimize(linearObjectiveFunction13, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList15, goalType17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(97);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(35);
        int int12 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) '4');
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) '4');
        simplexSolver1.setMaxIterations((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(32);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) '4');
        simplexSolver0.setMaxIterations(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) 'a');
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(97);
        simplexSolver0.setMaxIterations((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(100);
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(100);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver0.optimize(linearObjectiveFunction8, linearConstraintCollection9, goalType10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1.0f);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) 'a');
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        simplexSolver0.setMaxIterations((-1));
        simplexSolver0.setMaxIterations((-1));
        simplexSolver0.setMaxIterations((int) '#');
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int15 = simplexSolver0.getMaxIterations();
        int int16 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(52);
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 0);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations(0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction14 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray15 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList16 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList16, linearConstraintArray15);
        org.apache.commons.math.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = simplexSolver1.optimize(linearObjectiveFunction14, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList16, goalType18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        simplexSolver1.setMaxIterations(10);
        int int11 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = simplexSolver1.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        simplexSolver1.setMaxIterations((-1));
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        int int11 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass12 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        simplexSolver0.setMaxIterations((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '#');
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        simplexSolver1.setMaxIterations((int) (short) 10);
        int int8 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.optimize(linearObjectiveFunction9, linearConstraintCollection10, goalType11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '#');
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass7 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(35);
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations(1);
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(100);
        int int8 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(100.0d);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 0);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int8 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        simplexSolver0.setMaxIterations((-1));
        int int9 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        simplexSolver0.setMaxIterations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) -1);
        simplexSolver0.setMaxIterations(1);
        simplexSolver0.setMaxIterations((int) (byte) -1);
        simplexSolver0.setMaxIterations((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) '4');
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) (byte) -1);
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        simplexSolver0.setMaxIterations((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver0.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) 'a');
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations((int) (short) 100);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver1.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) 'a');
        int int9 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        int int7 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass8 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 97);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(10);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int11 = simplexSolver1.getIterations();
        int int12 = simplexSolver1.getIterations();
        int int13 = simplexSolver1.getMaxIterations();
        int int14 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '#');
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 10);
        simplexSolver1.setMaxIterations(0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver1.optimize(linearObjectiveFunction12, linearConstraintCollection13, goalType14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getMaxIterations();
        int int11 = simplexSolver0.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = simplexSolver0.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        simplexSolver1.setMaxIterations(10);
        int int11 = simplexSolver1.getIterations();
        int int12 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) (byte) -1);
        int int7 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) '4');
        int int10 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) '#');
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int15 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 0);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getIterations();
        int int11 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        simplexSolver1.setMaxIterations((int) ' ');
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction10 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray11 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList12 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList12, linearConstraintArray11);
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver1.optimize(linearObjectiveFunction10, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList12, goalType14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) '#');
        simplexSolver0.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 97);
        simplexSolver1.setMaxIterations((int) '#');
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((-1));
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(32);
        int int10 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass11 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 10);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) -1);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver1.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100);
        simplexSolver1.setMaxIterations((int) 'a');
        simplexSolver1.setMaxIterations(32);
        simplexSolver1.setMaxIterations((-1));
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver1.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(97);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        simplexSolver0.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction16 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray17 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList18 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList18, linearConstraintArray17);
        org.apache.commons.math.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = simplexSolver0.optimize(linearObjectiveFunction16, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList18, goalType20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        simplexSolver0.setMaxIterations((int) '4');
        int int16 = simplexSolver0.getMaxIterations();
        java.lang.Class<?> wildcardClass17 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(32);
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int5 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass6 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) 'a');
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        simplexSolver0.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        int int11 = simplexSolver0.getIterations();
        int int12 = simplexSolver0.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction13 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray14 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList15 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList15, linearConstraintArray14);
        org.apache.commons.math.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = simplexSolver0.optimize(linearObjectiveFunction13, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList15, goalType17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction19 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray20 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList21 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList21, linearConstraintArray20);
        org.apache.commons.math.optimization.GoalType goalType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair25 = simplexSolver0.optimize(linearObjectiveFunction19, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList21, goalType23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(linearConstraintArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) ' ');
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass6 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 100);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        simplexSolver1.setMaxIterations(10);
        simplexSolver1.setMaxIterations((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1.0f);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) '#');
        simplexSolver1.setMaxIterations(32);
        simplexSolver1.setMaxIterations((int) 'a');
        int int9 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int9 = simplexSolver0.getMaxIterations();
        int int10 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 97);
        simplexSolver1.setMaxIterations((int) '#');
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver1.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((-1.0d));
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int8 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        int int15 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(0);
        java.lang.Class<?> wildcardClass13 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations(97);
        int int7 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        simplexSolver1.setMaxIterations((-1));
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        simplexSolver1.setMaxIterations((-1));
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        java.lang.Class<?> wildcardClass8 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(52);
        int int6 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass7 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction10 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray11 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList12 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList12, linearConstraintArray11);
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver0.optimize(linearObjectiveFunction10, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList12, goalType14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(52);
        int int10 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        simplexSolver1.setMaxIterations((int) '4');
        simplexSolver1.setMaxIterations(10);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations(10);
        int int10 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '#');
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        simplexSolver1.setMaxIterations((int) '#');
        simplexSolver1.setMaxIterations((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations(1);
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int11 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(0.0d);
        int int2 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) '4');
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((int) '#');
        simplexSolver0.setMaxIterations((int) '#');
        int int11 = simplexSolver0.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = simplexSolver0.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations(0);
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        simplexSolver1.setMaxIterations((-1));
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        simplexSolver1.setMaxIterations((int) ' ');
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) '#');
        simplexSolver0.setMaxIterations((int) (byte) 100);
        simplexSolver0.setMaxIterations(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        int int14 = simplexSolver0.getMaxIterations();
        int int15 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '#');
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        simplexSolver1.setMaxIterations((int) '#');
        int int11 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(52);
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int10 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        java.lang.Class<?> wildcardClass13 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        int int14 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) -1);
        int int17 = simplexSolver0.getMaxIterations();
        int int18 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getIterations();
        int int11 = simplexSolver1.getMaxIterations();
        int int12 = simplexSolver1.getMaxIterations();
        int int13 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction10 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray11 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList12 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList12, linearConstraintArray11);
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver0.optimize(linearObjectiveFunction10, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList12, goalType14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 0);
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((-1));
        int int7 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int10 = simplexSolver0.getMaxIterations();
        int int11 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1);
        simplexSolver1.setMaxIterations((int) (byte) 0);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1));
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations(0);
        int int6 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray8 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList9 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList9, linearConstraintArray8);
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.optimize(linearObjectiveFunction7, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList9, goalType11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver1.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }
}

