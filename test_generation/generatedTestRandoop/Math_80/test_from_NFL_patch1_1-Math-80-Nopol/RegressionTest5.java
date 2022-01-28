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
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getVT();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealVector realVector8 = eigenDecompositionImpl4.getEigenvector(0);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        double double12 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray14 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(realVector8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl15.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver17 = eigenDecompositionImpl15.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl15.getD();
        double double20 = eigenDecompositionImpl15.getImagEigenvalue((int) (short) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver21 = eigenDecompositionImpl15.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(decompositionSolver17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver21);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, 100.0d);
        double[] doubleArray5 = eigenDecompositionImpl4.getRealEigenvalues();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, 1.0d);
        double[] doubleArray11 = eigenDecompositionImpl10.getRealEigenvalues();
        double double13 = eigenDecompositionImpl10.getRealEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl10.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl10.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }
}

