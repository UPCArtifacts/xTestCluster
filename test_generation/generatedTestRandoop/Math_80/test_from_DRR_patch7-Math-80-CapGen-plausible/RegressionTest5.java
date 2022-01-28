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
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, 100.0d);
        double[] doubleArray6 = new double[] { (short) 0 };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl9 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray6, doubleArray7, 100.0d);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray7, (double) 100.0f);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl11.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl11.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl17.getD();
        double[] doubleArray19 = eigenDecompositionImpl17.getImagEigenvalues();
        double double21 = eigenDecompositionImpl17.getImagEigenvalue((int) (short) 0);
        double double22 = eigenDecompositionImpl17.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = eigenDecompositionImpl17.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(decompositionSolver14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, 100.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getVT();
        double double7 = eigenDecompositionImpl4.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, 0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl10.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, 100.0d);
        double[] doubleArray6 = new double[] { (short) 0 };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl9 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray6, doubleArray7, 100.0d);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray7, (double) 100.0f);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl11.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl11.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) 1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl19 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) 100L);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl21 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) (-1.0f));
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver22 = eigenDecompositionImpl21.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(decompositionSolver14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(decompositionSolver22);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, 100.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver6 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray7 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getV();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(decompositionSolver6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, 100.0d);
        double[] doubleArray6 = new double[] { (short) 0 };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl9 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray6, doubleArray7, 100.0d);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray7, (double) 100.0f);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl11.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl11.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) 1);
        double double18 = eigenDecompositionImpl17.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl17.getV();
        double[] doubleArray20 = eigenDecompositionImpl17.getRealEigenvalues();
        double[] doubleArray21 = eigenDecompositionImpl17.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = eigenDecompositionImpl17.getD();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = eigenDecompositionImpl17.getRealEigenvalue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(decompositionSolver14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, 100.0d);
        double[] doubleArray5 = eigenDecompositionImpl4.getRealEigenvalues();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        double double8 = eigenDecompositionImpl4.getRealEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) '#');
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) (short) -1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) (byte) 1);
        double double16 = eigenDecompositionImpl15.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl15.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl19 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix17, (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, 100.0d);
        double[] doubleArray6 = new double[] { (short) 0 };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl9 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray6, doubleArray7, 100.0d);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray7, (double) 100.0f);
        double[] doubleArray12 = eigenDecompositionImpl11.getImagEigenvalues();
        double double13 = eigenDecompositionImpl11.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl11.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl11.getV();
        double[] doubleArray16 = eigenDecompositionImpl11.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver17 = eigenDecompositionImpl11.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0]");
        org.junit.Assert.assertNotNull(decompositionSolver17);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, 100.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getVT();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver9 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray10 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray11 = eigenDecompositionImpl4.getImagEigenvalues();
        double double13 = eigenDecompositionImpl4.getRealEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getD();
        java.lang.Class<?> wildcardClass15 = eigenDecompositionImpl4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertNotNull(decompositionSolver9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, 100.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getVT();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        double double10 = eigenDecompositionImpl4.getDeterminant();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = eigenDecompositionImpl4.getImagEigenvalue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, 100.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getVT();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver9 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        double[] doubleArray12 = eigenDecompositionImpl4.getImagEigenvalues();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray14 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getVT();
        double[] doubleArray16 = eigenDecompositionImpl4.getImagEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertNotNull(decompositionSolver9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0]");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, 100.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) (-1L));
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver8 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver9 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getVT();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        double[] doubleArray13 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) '#');
        org.apache.commons.math.linear.RealVector realVector19 = eigenDecompositionImpl17.getEigenvector(0);
        double double20 = eigenDecompositionImpl17.getDeterminant();
        double[] doubleArray21 = eigenDecompositionImpl17.getImagEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(decompositionSolver8);
        org.junit.Assert.assertNotNull(decompositionSolver9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
        org.junit.Assert.assertNotNull(decompositionSolver14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realVector19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0]");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, 100.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getVT();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealVector realVector8 = eigenDecompositionImpl4.getEigenvector(0);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 100.0f);
        double[] doubleArray14 = eigenDecompositionImpl13.getImagEigenvalues();
        java.lang.Class<?> wildcardClass15 = doubleArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(realVector8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, 100.0d);
        double[] doubleArray6 = new double[] { (short) 0 };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl9 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray6, doubleArray7, 100.0d);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray7, (double) 100.0f);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl11.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) (short) 0);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) (-1L));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl19 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) '4');
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl21 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) (byte) 0);
        double double22 = eigenDecompositionImpl21.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = eigenDecompositionImpl21.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = eigenDecompositionImpl21.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl26 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix24, 0.0d);
        double[] doubleArray27 = eigenDecompositionImpl26.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            double double29 = eigenDecompositionImpl26.getImagEigenvalue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0]");
    }
}

