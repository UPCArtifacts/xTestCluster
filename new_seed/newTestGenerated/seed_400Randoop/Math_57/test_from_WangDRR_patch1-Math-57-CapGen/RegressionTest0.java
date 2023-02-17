import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy emptyClusterStrategy0 = org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_POINTS_NUMBER;
        java.lang.Class<?> wildcardClass1 = emptyClusterStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + emptyClusterStrategy0 + "' != '" + org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_POINTS_NUMBER + "'", emptyClusterStrategy0.equals(org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_POINTS_NUMBER));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy emptyClusterStrategy0 = org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy.FARTHEST_POINT;
        java.lang.Class<?> wildcardClass1 = emptyClusterStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + emptyClusterStrategy0 + "' != '" + org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy.FARTHEST_POINT + "'", emptyClusterStrategy0.equals(org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy.FARTHEST_POINT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy emptyClusterStrategy0 = org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR;
        java.lang.Class<?> wildcardClass1 = emptyClusterStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + emptyClusterStrategy0 + "' != '" + org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR + "'", emptyClusterStrategy0.equals(org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy emptyClusterStrategy0 = org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_VARIANCE;
        java.lang.Class<?> wildcardClass1 = emptyClusterStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + emptyClusterStrategy0 + "' != '" + org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_VARIANCE + "'", emptyClusterStrategy0.equals(org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_VARIANCE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

