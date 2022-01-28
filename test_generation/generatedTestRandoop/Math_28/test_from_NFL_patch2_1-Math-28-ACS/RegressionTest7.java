import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 97, 10);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 100);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (short) 1);
        simplexSolver2.setMaxIterations(1);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((-1.0d), (int) '4');
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (int) (short) 100);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, 0);
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction4 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray5 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList6 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, linearConstraintArray5);
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver2.optimize(linearObjectiveFunction4, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, goalType8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 100, 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        int int6 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) (byte) -1);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int4 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) '#');
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(1);
        simplexSolver0.setMaxIterations(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 'a', (int) ' ');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, (int) (byte) 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintCollection8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = simplexSolver2.optimize(linearObjectiveFunction7, linearConstraintCollection8, goalType9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) (byte) -1);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations(10);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction14 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray15 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList16 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList16, linearConstraintArray15);
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair20 = simplexSolver2.optimize(linearObjectiveFunction14, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList16, goalType18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(linearConstraintArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, 0);
        simplexSolver2.setMaxIterations((int) 'a');
        simplexSolver2.setMaxIterations((int) ' ');
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 97);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations(32);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) (byte) 1);
        simplexSolver2.setMaxIterations((int) (byte) 0);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) '#');
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations(1);
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 52);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(32);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = simplexSolver2.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) (byte) -1);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations(10);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getIterations();
        int int14 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) 'a');
        simplexSolver2.setMaxIterations(1);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        simplexSolver0.setMaxIterations(97);
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, (int) (byte) 100);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, (int) (byte) 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass11 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, 0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 100, 10);
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations((int) ' ');
        int int7 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (-1));
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(52);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, 97);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, (int) (short) 100);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) (short) 10);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 0);
        simplexSolver2.setMaxIterations((int) ' ');
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(10);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, (int) (byte) 1);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, (int) '#');
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(97);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }
}

