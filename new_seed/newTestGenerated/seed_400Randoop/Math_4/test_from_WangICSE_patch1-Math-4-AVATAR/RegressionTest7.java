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
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion8 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion9 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion10 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane11 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DSplitSubHyperplane13 = subLine2.split(euclidean2DHyperplane12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNull(euclidean1DRegion8);
        org.junit.Assert.assertNull(euclidean1DRegion9);
        org.junit.Assert.assertNull(euclidean1DRegion10);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane11);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion9 = euclidean2DAbstractSubHyperplane8.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane10 = euclidean2DAbstractSubHyperplane8.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane11 = euclidean2DAbstractSubHyperplane10.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane12 = euclidean2DAbstractSubHyperplane10.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane13 = euclidean2DAbstractSubHyperplane10.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion14 = euclidean2DAbstractSubHyperplane10.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane15 = euclidean2DAbstractSubHyperplane10.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion16 = euclidean2DAbstractSubHyperplane15.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane17 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion18 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine19 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane17, euclidean1DRegion18);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane20 = subLine19.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane21 = subLine19.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane22 = subLine19.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion23 = euclidean2DAbstractSubHyperplane22.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane24 = euclidean2DAbstractSubHyperplane22.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane25 = euclidean2DAbstractSubHyperplane24.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane26 = euclidean2DAbstractSubHyperplane25.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane27 = euclidean2DAbstractSubHyperplane25.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane28 = euclidean2DAbstractSubHyperplane27.getHyperplane();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane29 = euclidean2DAbstractSubHyperplane15.reunite((org.apache.commons.math3.geometry.partitioning.SubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D>) euclidean2DAbstractSubHyperplane27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean1DRegion9);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane10);
        org.junit.Assert.assertNull(euclidean2DHyperplane11);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane12);
        org.junit.Assert.assertNull(euclidean2DHyperplane13);
        org.junit.Assert.assertNull(euclidean1DRegion14);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane15);
        org.junit.Assert.assertNull(euclidean1DRegion16);
        org.junit.Assert.assertNull(euclidean2DHyperplane20);
        org.junit.Assert.assertNull(euclidean2DHyperplane21);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane22);
        org.junit.Assert.assertNull(euclidean1DRegion23);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane24);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane25);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane26);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane27);
        org.junit.Assert.assertNull(euclidean2DHyperplane28);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane9 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane10 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane11 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion12 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane13 = subLine2.copySelf();
        java.lang.Class<?> wildcardClass14 = subLine2.getClass();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane9);
        org.junit.Assert.assertNull(euclidean2DHyperplane10);
        org.junit.Assert.assertNull(euclidean2DHyperplane11);
        org.junit.Assert.assertNull(euclidean1DRegion12);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion7 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion9 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane10 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane11 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion12 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane13 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane14 = subLine2.getHyperplane();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean1DRegion7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean1DRegion9);
        org.junit.Assert.assertNull(euclidean2DHyperplane10);
        org.junit.Assert.assertNull(euclidean2DHyperplane11);
        org.junit.Assert.assertNull(euclidean1DRegion12);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane13);
        org.junit.Assert.assertNull(euclidean2DHyperplane14);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion7 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane10 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DSplitSubHyperplane12 = subLine2.split(euclidean2DHyperplane11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean1DRegion7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane10);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane7 = euclidean2DAbstractSubHyperplane6.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = euclidean2DAbstractSubHyperplane6.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = euclidean2DAbstractSubHyperplane6.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane10 = euclidean2DAbstractSubHyperplane6.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion11 = euclidean2DAbstractSubHyperplane6.getRemainingRegion();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
        org.junit.Assert.assertNull(euclidean2DHyperplane10);
        org.junit.Assert.assertNull(euclidean1DRegion11);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane4 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane5 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion7 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion9 = euclidean2DAbstractSubHyperplane8.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane10 = euclidean2DAbstractSubHyperplane8.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane11 = euclidean2DAbstractSubHyperplane10.copySelf();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean2DHyperplane4);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean1DRegion7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean1DRegion9);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane10);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane11);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion3 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane4 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion6 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion10 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine11 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane9, euclidean1DRegion10);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane12 = subLine11.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion13 = subLine11.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane14 = subLine11.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane15 = subLine11.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane16 = subLine11.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion17 = subLine11.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion18 = subLine11.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane19 = subLine11.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane20 = subLine11.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane21 = subLine11.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane22 = subLine11.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane23 = subLine11.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane24 = subLine11.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane25 = subLine11.copySelf();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.euclidean.twod.Vector2D vector2D27 = subLine2.intersection(subLine11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean1DRegion3);
        org.junit.Assert.assertNull(euclidean2DHyperplane4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean1DRegion6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane12);
        org.junit.Assert.assertNull(euclidean1DRegion13);
        org.junit.Assert.assertNull(euclidean2DHyperplane14);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane15);
        org.junit.Assert.assertNull(euclidean2DHyperplane16);
        org.junit.Assert.assertNull(euclidean1DRegion17);
        org.junit.Assert.assertNull(euclidean1DRegion18);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane19);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane20);
        org.junit.Assert.assertNull(euclidean2DHyperplane21);
        org.junit.Assert.assertNull(euclidean2DHyperplane22);
        org.junit.Assert.assertNull(euclidean2DHyperplane23);
        org.junit.Assert.assertNull(euclidean2DHyperplane24);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane25);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane4 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion5 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane7 = euclidean2DAbstractSubHyperplane6.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion8 = euclidean2DAbstractSubHyperplane6.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane9 = euclidean2DAbstractSubHyperplane6.copySelf();
        java.lang.Class<?> wildcardClass10 = euclidean2DAbstractSubHyperplane9.getClass();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean2DHyperplane4);
        org.junit.Assert.assertNull(euclidean1DRegion5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane7);
        org.junit.Assert.assertNull(euclidean1DRegion8);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane4 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane5 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion6 = euclidean2DAbstractSubHyperplane5.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane7 = euclidean2DAbstractSubHyperplane5.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion8 = euclidean2DAbstractSubHyperplane5.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane9 = euclidean2DAbstractSubHyperplane5.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane10 = euclidean2DAbstractSubHyperplane9.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane11 = euclidean2DAbstractSubHyperplane10.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane12 = euclidean2DAbstractSubHyperplane10.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion13 = euclidean2DAbstractSubHyperplane10.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane14 = euclidean2DAbstractSubHyperplane10.copySelf();
        org.apache.commons.math3.geometry.partitioning.Transform<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DTransform15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane16 = euclidean2DAbstractSubHyperplane14.applyTransform(euclidean2DTransform15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean2DHyperplane4);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane5);
        org.junit.Assert.assertNull(euclidean1DRegion6);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane7);
        org.junit.Assert.assertNull(euclidean1DRegion8);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane9);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane10);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane11);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane12);
        org.junit.Assert.assertNull(euclidean1DRegion13);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane14);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane4 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane5 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion6 = euclidean2DAbstractSubHyperplane5.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane7 = euclidean2DAbstractSubHyperplane5.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion8 = euclidean2DAbstractSubHyperplane5.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane9 = euclidean2DAbstractSubHyperplane5.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane10 = euclidean2DAbstractSubHyperplane9.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane11 = euclidean2DAbstractSubHyperplane9.copySelf();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean2DHyperplane4);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane5);
        org.junit.Assert.assertNull(euclidean1DRegion6);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane7);
        org.junit.Assert.assertNull(euclidean1DRegion8);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane9);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane10);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane11);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane3 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane4 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane5 = euclidean2DAbstractSubHyperplane4.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = euclidean2DAbstractSubHyperplane4.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = euclidean2DAbstractSubHyperplane6.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = euclidean2DAbstractSubHyperplane6.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = euclidean2DAbstractSubHyperplane6.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane10 = euclidean2DAbstractSubHyperplane6.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane11 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion12 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine13 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane11, euclidean1DRegion12);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane14 = subLine13.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion15 = subLine13.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane16 = subLine13.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane17 = subLine13.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane18 = subLine13.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane19 = subLine13.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane20 = subLine13.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion21 = euclidean2DAbstractSubHyperplane20.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane22 = euclidean2DAbstractSubHyperplane20.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane23 = euclidean2DAbstractSubHyperplane20.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane24 = euclidean2DAbstractSubHyperplane23.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion25 = euclidean2DAbstractSubHyperplane23.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane26 = euclidean2DAbstractSubHyperplane23.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane27 = euclidean2DAbstractSubHyperplane23.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane28 = euclidean2DAbstractSubHyperplane27.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane29 = euclidean2DAbstractSubHyperplane27.getHyperplane();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane30 = euclidean2DAbstractSubHyperplane10.reunite((org.apache.commons.math3.geometry.partitioning.SubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D>) euclidean2DAbstractSubHyperplane27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane3);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane4);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane10);
        org.junit.Assert.assertNull(euclidean2DHyperplane14);
        org.junit.Assert.assertNull(euclidean1DRegion15);
        org.junit.Assert.assertNull(euclidean2DHyperplane16);
        org.junit.Assert.assertNull(euclidean2DHyperplane17);
        org.junit.Assert.assertNull(euclidean2DHyperplane18);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane19);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane20);
        org.junit.Assert.assertNull(euclidean1DRegion21);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane22);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane23);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane24);
        org.junit.Assert.assertNull(euclidean1DRegion25);
        org.junit.Assert.assertNull(euclidean2DHyperplane26);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane27);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane28);
        org.junit.Assert.assertNull(euclidean2DHyperplane29);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane4 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion5 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane7 = subLine2.copySelf();
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.euclidean.twod.Vector2D vector2D10 = subLine2.intersection(subLine8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean2DHyperplane4);
        org.junit.Assert.assertNull(euclidean1DRegion5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane7);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion10 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane11 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion12 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine13 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane11, euclidean1DRegion12);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane14 = subLine13.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion15 = subLine13.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane16 = subLine13.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane17 = subLine13.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane18 = subLine13.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion19 = subLine13.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane20 = subLine13.getHyperplane();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.euclidean.twod.Vector2D vector2D22 = subLine2.intersection(subLine13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
        org.junit.Assert.assertNull(euclidean1DRegion10);
        org.junit.Assert.assertNull(euclidean2DHyperplane14);
        org.junit.Assert.assertNull(euclidean1DRegion15);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane16);
        org.junit.Assert.assertNull(euclidean2DHyperplane17);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane18);
        org.junit.Assert.assertNull(euclidean1DRegion19);
        org.junit.Assert.assertNull(euclidean2DHyperplane20);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion7 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion9 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion10 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion11 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane12 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane13 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion14 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine15 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane13, euclidean1DRegion14);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane16 = subLine15.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion17 = subLine15.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane18 = subLine15.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane19 = subLine15.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane20 = subLine15.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane21 = subLine15.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane22 = subLine15.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane23 = subLine15.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane24 = subLine15.copySelf();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.euclidean.twod.Vector2D vector2D26 = subLine2.intersection(subLine15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean1DRegion7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean1DRegion9);
        org.junit.Assert.assertNull(euclidean1DRegion10);
        org.junit.Assert.assertNull(euclidean1DRegion11);
        org.junit.Assert.assertNull(euclidean2DHyperplane12);
        org.junit.Assert.assertNull(euclidean2DHyperplane16);
        org.junit.Assert.assertNull(euclidean1DRegion17);
        org.junit.Assert.assertNull(euclidean2DHyperplane18);
        org.junit.Assert.assertNull(euclidean2DHyperplane19);
        org.junit.Assert.assertNull(euclidean2DHyperplane20);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane21);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane22);
        org.junit.Assert.assertNull(euclidean2DHyperplane23);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane24);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane9 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion10 = euclidean2DAbstractSubHyperplane9.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane11 = euclidean2DAbstractSubHyperplane9.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane12 = euclidean2DAbstractSubHyperplane9.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane13 = euclidean2DAbstractSubHyperplane12.copySelf();
        java.lang.Class<?> wildcardClass14 = euclidean2DAbstractSubHyperplane13.getClass();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane9);
        org.junit.Assert.assertNull(euclidean1DRegion10);
        org.junit.Assert.assertNull(euclidean2DHyperplane11);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane12);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane10 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion11 = euclidean2DAbstractSubHyperplane10.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion12 = euclidean2DAbstractSubHyperplane10.getRemainingRegion();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane10);
        org.junit.Assert.assertNull(euclidean1DRegion11);
        org.junit.Assert.assertNull(euclidean1DRegion12);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion8 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion9 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane10 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane11 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion12 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane13 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion14 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane15 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion16 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine17 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane15, euclidean1DRegion16);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane18 = subLine17.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion19 = subLine17.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane20 = subLine17.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane21 = subLine17.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane22 = subLine17.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane23 = subLine17.getHyperplane();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.euclidean.twod.Vector2D vector2D25 = subLine2.intersection(subLine17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNull(euclidean1DRegion8);
        org.junit.Assert.assertNull(euclidean1DRegion9);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane10);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane11);
        org.junit.Assert.assertNull(euclidean1DRegion12);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane13);
        org.junit.Assert.assertNull(euclidean1DRegion14);
        org.junit.Assert.assertNull(euclidean2DHyperplane18);
        org.junit.Assert.assertNull(euclidean1DRegion19);
        org.junit.Assert.assertNull(euclidean2DHyperplane20);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane21);
        org.junit.Assert.assertNull(euclidean2DHyperplane22);
        org.junit.Assert.assertNull(euclidean2DHyperplane23);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane4 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion5 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane7 = euclidean2DAbstractSubHyperplane6.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = euclidean2DAbstractSubHyperplane7.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion9 = euclidean2DAbstractSubHyperplane7.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane10 = euclidean2DAbstractSubHyperplane7.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion11 = euclidean2DAbstractSubHyperplane7.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane12 = euclidean2DAbstractSubHyperplane7.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane13 = euclidean2DAbstractSubHyperplane7.getHyperplane();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean2DHyperplane4);
        org.junit.Assert.assertNull(euclidean1DRegion5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean1DRegion9);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane10);
        org.junit.Assert.assertNull(euclidean1DRegion11);
        org.junit.Assert.assertNull(euclidean2DHyperplane12);
        org.junit.Assert.assertNull(euclidean2DHyperplane13);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion8 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion9 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane10 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane11 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane12 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane13 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion14 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane15 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane16 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane17 = euclidean2DAbstractSubHyperplane16.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane18 = euclidean2DAbstractSubHyperplane16.copySelf();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNull(euclidean1DRegion8);
        org.junit.Assert.assertNull(euclidean1DRegion9);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane10);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane11);
        org.junit.Assert.assertNull(euclidean2DHyperplane12);
        org.junit.Assert.assertNull(euclidean2DHyperplane13);
        org.junit.Assert.assertNull(euclidean1DRegion14);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane15);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane16);
        org.junit.Assert.assertNull(euclidean2DHyperplane17);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane18);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion7 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = euclidean2DAbstractSubHyperplane8.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane10 = euclidean2DAbstractSubHyperplane8.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion11 = euclidean2DAbstractSubHyperplane8.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion12 = euclidean2DAbstractSubHyperplane8.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane13 = euclidean2DAbstractSubHyperplane8.copySelf();
        java.lang.Class<?> wildcardClass14 = euclidean2DAbstractSubHyperplane8.getClass();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean1DRegion7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane10);
        org.junit.Assert.assertNull(euclidean1DRegion11);
        org.junit.Assert.assertNull(euclidean1DRegion12);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion7 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion9 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion10 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion11 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane12 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion13 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DSplitSubHyperplane15 = subLine2.split(euclidean2DHyperplane14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean1DRegion7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean1DRegion9);
        org.junit.Assert.assertNull(euclidean1DRegion10);
        org.junit.Assert.assertNull(euclidean1DRegion11);
        org.junit.Assert.assertNull(euclidean2DHyperplane12);
        org.junit.Assert.assertNull(euclidean1DRegion13);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane9 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane10 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane11 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane12 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane13 = euclidean2DAbstractSubHyperplane12.getHyperplane();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane9);
        org.junit.Assert.assertNull(euclidean2DHyperplane10);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane11);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane12);
        org.junit.Assert.assertNull(euclidean2DHyperplane13);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion8 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane9 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane10 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion11 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine12 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane10, euclidean1DRegion11);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane13 = subLine12.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane14 = subLine12.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion15 = subLine12.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane16 = subLine12.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane17 = subLine12.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane18 = subLine12.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane19 = subLine12.copySelf();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.euclidean.twod.Vector2D vector2D21 = subLine2.intersection(subLine12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNull(euclidean1DRegion8);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane9);
        org.junit.Assert.assertNull(euclidean2DHyperplane13);
        org.junit.Assert.assertNull(euclidean2DHyperplane14);
        org.junit.Assert.assertNull(euclidean1DRegion15);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane16);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane17);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane18);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane19);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane4 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane5 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = euclidean2DAbstractSubHyperplane5.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane7 = euclidean2DAbstractSubHyperplane6.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = euclidean2DAbstractSubHyperplane7.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = euclidean2DAbstractSubHyperplane7.getHyperplane();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = euclidean2DAbstractSubHyperplane7.isEmpty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean2DHyperplane4);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane4 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane5 = euclidean2DAbstractSubHyperplane4.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = euclidean2DAbstractSubHyperplane5.copySelf();
        org.apache.commons.math3.geometry.partitioning.Transform<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DTransform7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = euclidean2DAbstractSubHyperplane6.applyTransform(euclidean2DTransform7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane4);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion7 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane9 = euclidean2DAbstractSubHyperplane8.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion10 = euclidean2DAbstractSubHyperplane9.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane11 = euclidean2DAbstractSubHyperplane9.copySelf();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = euclidean2DAbstractSubHyperplane9.isEmpty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNull(euclidean1DRegion7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane9);
        org.junit.Assert.assertNull(euclidean1DRegion10);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane11);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane4 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion5 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane7 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = euclidean2DAbstractSubHyperplane7.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = euclidean2DAbstractSubHyperplane8.getHyperplane();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = euclidean2DAbstractSubHyperplane8.getSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean2DHyperplane4);
        org.junit.Assert.assertNull(euclidean1DRegion5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion10 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane11 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane12 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane13 = euclidean2DAbstractSubHyperplane12.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane14 = euclidean2DAbstractSubHyperplane12.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion15 = euclidean2DAbstractSubHyperplane12.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane16 = euclidean2DAbstractSubHyperplane12.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane17 = euclidean2DAbstractSubHyperplane12.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane18 = euclidean2DAbstractSubHyperplane12.copySelf();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
        org.junit.Assert.assertNull(euclidean1DRegion10);
        org.junit.Assert.assertNull(euclidean2DHyperplane11);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane12);
        org.junit.Assert.assertNull(euclidean2DHyperplane13);
        org.junit.Assert.assertNull(euclidean2DHyperplane14);
        org.junit.Assert.assertNull(euclidean1DRegion15);
        org.junit.Assert.assertNull(euclidean2DHyperplane16);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane17);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane18);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion3 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane4 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = euclidean2DAbstractSubHyperplane4.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = euclidean2DAbstractSubHyperplane4.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion7 = euclidean2DAbstractSubHyperplane4.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = euclidean2DAbstractSubHyperplane4.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane9 = euclidean2DAbstractSubHyperplane8.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane10 = euclidean2DAbstractSubHyperplane9.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane11 = euclidean2DAbstractSubHyperplane10.getHyperplane();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = euclidean2DAbstractSubHyperplane10.isEmpty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean1DRegion3);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNull(euclidean1DRegion7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane9);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane10);
        org.junit.Assert.assertNull(euclidean2DHyperplane11);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion10 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane11 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane12 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane13 = subLine2.copySelf();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
        org.junit.Assert.assertNull(euclidean1DRegion10);
        org.junit.Assert.assertNull(euclidean2DHyperplane11);
        org.junit.Assert.assertNull(euclidean2DHyperplane12);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane13);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane4 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane5 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = euclidean2DAbstractSubHyperplane5.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane7 = euclidean2DAbstractSubHyperplane5.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = euclidean2DAbstractSubHyperplane5.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = euclidean2DAbstractSubHyperplane8.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion10 = euclidean2DAbstractSubHyperplane8.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane11 = euclidean2DAbstractSubHyperplane8.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion12 = euclidean2DAbstractSubHyperplane11.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane13 = euclidean2DAbstractSubHyperplane11.copySelf();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean2DHyperplane4);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
        org.junit.Assert.assertNull(euclidean1DRegion10);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane11);
        org.junit.Assert.assertNull(euclidean1DRegion12);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane13);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion10 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane11 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane12 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane13 = euclidean2DAbstractSubHyperplane12.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane14 = euclidean2DAbstractSubHyperplane12.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane15 = euclidean2DAbstractSubHyperplane14.copySelf();
        org.apache.commons.math3.geometry.partitioning.Transform<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DTransform16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane17 = euclidean2DAbstractSubHyperplane14.applyTransform(euclidean2DTransform16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
        org.junit.Assert.assertNull(euclidean1DRegion10);
        org.junit.Assert.assertNull(euclidean2DHyperplane11);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane12);
        org.junit.Assert.assertNull(euclidean2DHyperplane13);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane14);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane15);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion10 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane11 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane12 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane13 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane14 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion15 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane16 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.partitioning.Side side18 = subLine2.side(euclidean2DHyperplane17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
        org.junit.Assert.assertNull(euclidean1DRegion10);
        org.junit.Assert.assertNull(euclidean2DHyperplane11);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane12);
        org.junit.Assert.assertNull(euclidean2DHyperplane13);
        org.junit.Assert.assertNull(euclidean2DHyperplane14);
        org.junit.Assert.assertNull(euclidean1DRegion15);
        org.junit.Assert.assertNull(euclidean2DHyperplane16);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane4 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane5 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = euclidean2DAbstractSubHyperplane5.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = euclidean2DAbstractSubHyperplane5.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = euclidean2DAbstractSubHyperplane5.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = euclidean2DAbstractSubHyperplane8.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Transform<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DTransform10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane11 = euclidean2DAbstractSubHyperplane8.applyTransform(euclidean2DTransform10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean2DHyperplane4);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion7 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane10 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion11 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DSplitSubHyperplane13 = subLine2.split(euclidean2DHyperplane12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean1DRegion7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
        org.junit.Assert.assertNull(euclidean2DHyperplane10);
        org.junit.Assert.assertNull(euclidean1DRegion11);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane10 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane11 = euclidean2DAbstractSubHyperplane10.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane12 = euclidean2DAbstractSubHyperplane10.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane13 = euclidean2DAbstractSubHyperplane12.copySelf();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane10);
        org.junit.Assert.assertNull(euclidean2DHyperplane11);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane12);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane13);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane3 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane4 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane5 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion7 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.partitioning.Side side10 = subLine2.side(euclidean2DHyperplane9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane3);
        org.junit.Assert.assertNull(euclidean2DHyperplane4);
        org.junit.Assert.assertNull(euclidean2DHyperplane5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNull(euclidean1DRegion7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane4 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane5 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = euclidean2DAbstractSubHyperplane5.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = euclidean2DAbstractSubHyperplane5.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane8 = euclidean2DAbstractSubHyperplane5.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane9 = euclidean2DAbstractSubHyperplane8.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane10 = euclidean2DAbstractSubHyperplane8.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane11 = euclidean2DAbstractSubHyperplane8.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane12 = euclidean2DAbstractSubHyperplane11.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane13 = euclidean2DAbstractSubHyperplane11.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane14 = euclidean2DAbstractSubHyperplane11.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane15 = euclidean2DAbstractSubHyperplane11.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane16 = euclidean2DAbstractSubHyperplane11.getHyperplane();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean2DHyperplane4);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane8);
        org.junit.Assert.assertNull(euclidean2DHyperplane9);
        org.junit.Assert.assertNull(euclidean2DHyperplane10);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane11);
        org.junit.Assert.assertNull(euclidean2DHyperplane12);
        org.junit.Assert.assertNull(euclidean2DHyperplane13);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane14);
        org.junit.Assert.assertNull(euclidean2DHyperplane15);
        org.junit.Assert.assertNull(euclidean2DHyperplane16);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane4 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane5 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane6 = euclidean2DAbstractSubHyperplane5.copySelf();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane7 = euclidean2DAbstractSubHyperplane6.copySelf();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion8 = euclidean2DAbstractSubHyperplane6.getRemainingRegion();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean2DHyperplane4);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane5);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane6);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane7);
        org.junit.Assert.assertNull(euclidean1DRegion8);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane0 = null;
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion1 = null;
        org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(euclidean2DHyperplane0, euclidean1DRegion1);
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane3 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion4 = subLine2.getRemainingRegion();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane5 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane6 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane7 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane8 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean2DAbstractSubHyperplane9 = subLine2.copySelf();
        org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> euclidean2DHyperplane10 = subLine2.getHyperplane();
        org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> euclidean1DRegion11 = subLine2.getRemainingRegion();
        org.junit.Assert.assertNull(euclidean2DHyperplane3);
        org.junit.Assert.assertNull(euclidean1DRegion4);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane5);
        org.junit.Assert.assertNull(euclidean2DHyperplane6);
        org.junit.Assert.assertNull(euclidean2DHyperplane7);
        org.junit.Assert.assertNull(euclidean2DHyperplane8);
        org.junit.Assert.assertNotNull(euclidean2DAbstractSubHyperplane9);
        org.junit.Assert.assertNull(euclidean2DHyperplane10);
        org.junit.Assert.assertNull(euclidean1DRegion11);
    }
}

