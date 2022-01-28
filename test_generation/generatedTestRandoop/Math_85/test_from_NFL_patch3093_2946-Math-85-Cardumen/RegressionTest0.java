import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl0.cumulativeProbability((double) '#', (double) 10L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        java.lang.Class<?> wildcardClass1 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 100, (double) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl0.cumulativeProbability((double) 'a', (double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) 0L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.inverseCumulativeProbability(100.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.cumulativeProbability(Double.POSITIVE_INFINITY, 0.8413447460685395d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl0.cumulativeProbability((double) 1, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.cumulativeProbability((double) 1.0f, (double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl0.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 10, (double) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.00411206605241144d, (double) (short) 100);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6179114221889526d + "'", double5 == 0.6179114221889526d);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) 0L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) '#');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl0.cumulativeProbability((double) 'a', 0.3989422804014327d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability((double) 100L, 0.8413447460685395d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        normalDistributionImpl0.setStandardDeviation(0.8413447460685395d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.cumulativeProbability(Double.POSITIVE_INFINITY, 1.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.0024364383453520616d, (double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.inverseCumulativeProbability((double) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 100, (-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability((double) '#', (double) (short) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999999857d + "'", double8 == 0.9999999999999857d);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl0.cumulativeProbability((double) 10, 0.5d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, 0.00411206605241144d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 1, (double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl0.cumulativeProbability((double) 'a', 35.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl0.cumulativeProbability((double) '#', 0.8511172425430698d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.inverseCumulativeProbability(100.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3989422804014327d, (-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((double) 0L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability((double) 10, (double) 1L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1, (double) 0L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) ' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability((double) 'a', 0.0024364383453520616d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.inverseCumulativeProbability(Double.POSITIVE_INFINITY);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) (short) 1);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = normalDistributionImpl0.inverseCumulativeProbability(Double.POSITIVE_INFINITY);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.8413447460685395d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.5d);
        double double4 = normalDistributionImpl2.cumulativeProbability(97.0d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) 0L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0024364383453520616d + "'", double11 == 0.0024364383453520616d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 100L, Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', 97.0d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.09467574302164261d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability(35.0d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability((double) ' ', (-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), (double) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.539827837277029d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability((double) '4', 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 55.1999999998222d + "'", double5 == 55.1999999998222d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.003447496149865155d, 101.0d);
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.6179114221889526d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3511030636567253d + "'", double5 == 0.3511030636567253d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.004112723567028872d + "'", double7 == 0.004112723567028872d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.inverseCumulativeProbability(101.0000002290142d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, (double) (short) 10);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.5020563944007155d, Double.POSITIVE_INFINITY);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability(0.011397187830924622d, 0.004112723567028872d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0L, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability(0.8413447460685395d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999999857d + "'", double8 == 0.9999999999999857d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), (double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(Double.NaN);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.09467574302164261d);
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl0.cumulativeProbability((double) 10L, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.0d + "'", double12 == 101.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NEGATIVE_INFINITY, 101.0d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1L), (double) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8511172425430698d, 0.00411206605241144d);
        normalDistributionImpl2.setMean(0.003447496149865155d);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003447496149865155d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 101.0000002290142d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 101.0000002290142d + "'", double3 == 101.0000002290142d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, (double) (byte) 10);
        normalDistributionImpl2.setMean(0.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability(101.0d, (double) ' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(55.1999999998222d, 0.02151428054220411d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setMean(97.0d);
        double double12 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-1.312499901071692d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999999857d + "'", double8 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.cumulativeProbability(32.0d, (-3.3306690738754696E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.0d);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double6 = normalDistributionImpl0.cumulativeProbability(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989389075407833d + "'", double4 == 0.3989389075407833d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, (double) (short) 10);
        normalDistributionImpl2.setMean(101.0000002290142d);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.3511030636567253d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.09467574302164261d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.005268537016191098d, 0.15865525393145702d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.inverseCumulativeProbability(97.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5d, (double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, (double) 1L);
        double double14 = normalDistributionImpl0.inverseCumulativeProbability((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.inverseCumulativeProbability(0.25536251834768864d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(55.1999999998222d, 0.539827837277029d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.cumulativeProbability((double) '#', 11.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setStandardDeviation(0.9999999999999857d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.5020563944007155d, (double) 10L);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999999857d + "'", double12 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.2989609388114332E-14d + "'", double15 == 1.2989609388114332E-14d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setMean(100.0d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.09467574302164261d, 0.39276307230455315d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 7.230419748435191E-4d + "'", double9 == 7.230419748435191E-4d);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.39891637076145464d, (double) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.0d);
        double double4 = normalDistributionImpl0.cumulativeProbability(0.0024364383453520616d);
        double double5 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5009719973078852d + "'", double4 == 0.5009719973078852d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.691462461274013d, 32.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl0.inverseCumulativeProbability((double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.24463748165229704d + "'", double3 == 0.24463748165229704d);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.8413447460685395d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9597790821736437d + "'", double6 == 0.9597790821736437d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.26831686462225557d + "'", double7 == 0.26831686462225557d);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.cumulativeProbability(0.1096616106907986d, 4.703838883365341E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.6179114221889526d);
        double double9 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        normalDistributionImpl0.setStandardDeviation(0.8413447460685395d);
        normalDistributionImpl0.setMean((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl0.cumulativeProbability(101.0000002290142d, (double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', 97.0d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.39891637076145464d, (-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl0.inverseCumulativeProbability(0.1096616106907986d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 0.8413447460685395d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.8413447460685395d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double14 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(0.3511030636567253d, 2.7581570254009424E-5d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9949360047253046d + "'", double6 == 0.9949360047253046d);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        normalDistributionImpl0.setStandardDeviation(2.8165665442762825E-24d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.8165665442762825E-24d + "'", double12 == 2.8165665442762825E-24d);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.4423124760719d + "'", double14 == 97.4423124760719d);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.3848369645341492d, 0.24197072451914337d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 1.4774954927042859E-22d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0033293208790807836d + "'", double6 == 0.0033293208790807836d);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.39891637076145464d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.2561529682171768d) + "'", double11 == (-1.2561529682171768d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.8413447460685395d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double14 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.cumulativeProbability(97.0d, 0.40985459992980544d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9949360047253046d, 0.00411206605241144d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) '#');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double14 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.inverseCumulativeProbability(101.0000002290142d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, 2.7581570254009424E-5d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double14 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) (byte) 100);
        normalDistributionImpl0.setMean(0.24197072451914337d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl0.setMean((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        normalDistributionImpl0.setStandardDeviation(0.8413447460685395d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(55.1999999998222d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((double) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        double double11 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl0.cumulativeProbability(0.05208127941521934d, (-1.2561529682171768d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability(0.38767317623584496d, (-3.3306690738754696E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.density((java.lang.Double) 2.8165665442762825E-24d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.26831686462225557d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3989422804014327d + "'", double11 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3848369645341492d + "'", double13 == 0.3848369645341492d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.cumulativeProbability(0.40985459992980544d, 0.26831686462225557d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 32.0d);
        normalDistributionImpl0.setStandardDeviation(0.6179114221889526d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.24197072451914683d + "'", double7 == 0.24197072451914683d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        normalDistributionImpl2.setMean(0.00411206605241144d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(0.8206667139258397d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.cumulativeProbability((double) 1L, 0.1096616106907986d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.26831686462225557d + "'", double3 == 0.26831686462225557d);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(2.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.49202168628309806d + "'", double4 == 0.49202168628309806d);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.539827837277029d);
        normalDistributionImpl0.setMean(11.0d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, (-3.3306690738754696E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NEGATIVE_INFINITY, (-3.3306690738754696E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double8 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 100L, 0.15865525393145702d);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.cumulativeProbability(0.5d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.cumulativeProbability(0.9949360047253046d, 0.5009719973078852d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5020563944007155d + "'", double9 == 0.5020563944007155d);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003447496149865155d, 0.09467574302164261d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.9949360047253046d, 0.46080199849299264d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.3989422804014327d);
        normalDistributionImpl2.setMean(36.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003859293226999287d + "'", double4 == 0.003859293226999287d);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl0.inverseCumulativeProbability((double) (byte) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.39891637076145464d + "'", double3 == 0.39891637076145464d);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.inverseCumulativeProbability((-23.019820521106425d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        normalDistributionImpl2.setStandardDeviation(0.691462461274013d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.40985459992980544d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 55.1999999998222d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4850139316775809d + "'", double6 == 0.4850139316775809d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        double double11 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(55.1999999998222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.1096616106907986d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 100L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3989422804014327d + "'", double8 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean(32.0d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation(97.0d);
        double double7 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.5d);
        double double4 = normalDistributionImpl2.cumulativeProbability(97.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(101.0d, 0.539827837277029d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.inverseCumulativeProbability(101.0000002290142d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 100.0d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        double double16 = normalDistributionImpl0.cumulativeProbability(0.003989422804014327d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl0.inverseCumulativeProbability(97.4423124760719d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setMean(Double.POSITIVE_INFINITY);
        double double9 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.cumulativeProbability(100.0d, (double) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(4.0161707293151494E-11d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.04883560073156118d, (double) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean(32.0d);
        normalDistributionImpl0.setStandardDeviation(0.24197072451914337d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.5095890191126843d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(9.189674862301045E-4d, (-23.019820521106425d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        normalDistributionImpl0.setMean(1.0d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.39891637076145464d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.inverseCumulativeProbability((-1.1102230246251565E-15d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.27389214325950473d + "'", double14 == 0.27389214325950473d);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double14 = normalDistributionImpl0.cumulativeProbability((double) (-1L), 2.0d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double14 = normalDistributionImpl0.cumulativeProbability((double) (-1L), 2.0d);
        normalDistributionImpl0.setMean((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.39276307230455315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1L, (double) 0L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.39891637076145464d + "'", double3 == 0.39891637076145464d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.15865525393145702d);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.8106088131500386d);
        double double12 = normalDistributionImpl2.cumulativeProbability((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.46080199849299264d + "'", double8 == 0.46080199849299264d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.463391164310498d + "'", double10 == 0.463391164310498d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.4562046874576832d + "'", double12 == 0.4562046874576832d);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.04100846842391914d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.24463748165229704d);
        normalDistributionImpl2.setMean(0.24197072451914683d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability(0.24463748165229704d, (-1.1102230246251565E-15d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011398072438227633d + "'", double9 == 0.011398072438227633d);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3989422804014327d + "'", double8 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setStandardDeviation(0.9999999999999857d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999999857d + "'", double12 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999999999999857d + "'", double13 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-3.241851231905457E-14d) + "'", double15 == (-3.241851231905457E-14d));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.inverseCumulativeProbability(1.0000000000000073d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9949360047253046d + "'", double6 == 0.9949360047253046d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NaN, (double) 1.0f);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation(Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3989389075407833d, 0.8106088131500386d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.539827837277029d);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 55.1999999998222d + "'", double5 == 55.1999999998222d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setMean(Double.POSITIVE_INFINITY);
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.24463748165229704d, Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.cumulativeProbability(10.0d, 1.4866698082023473d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1), 0.039846824608907386d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2906118579297512E-137d + "'", double4 == 1.2906118579297512E-137d);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 0.8413447460685395d);
        double double3 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.9949360047253046d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 6.106226635438361E-16d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.1096616106907986d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability(36.0d, (-1.5210055437364645E-14d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.39891637076145464d + "'", double4 == 0.39891637076145464d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setStandardDeviation((double) 10L);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.27389214325950473d, 0.27389214325950473d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.782792010140924E-24d + "'", double14 == 7.782792010140924E-24d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        normalDistributionImpl0.setMean(0.0d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, 0.3989422804014327d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.00411206605241144d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26831686462225557d + "'", double4 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.43147049479370425d + "'", double7 == 0.43147049479370425d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.486658076023932d + "'", double9 == 1.486658076023932d);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, 0.00411206605241144d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 9.026109053048334d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5095890191126843d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.003391125823206404d);
        normalDistributionImpl0.setStandardDeviation(4.155983485151227E-4d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-23.019820521106425d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.3796360778440238d) + "'", double9 == (-1.3796360778440238d));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.005268537016191098d, 0.15865525393145702d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 32.0d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.01945305528714028d + "'", double4 == 0.01945305528714028d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0014324330216118556d + "'", double4 == 0.0014324330216118556d);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.539827837277029d);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) (-1L));
        normalDistributionImpl2.setMean(0.39891637076145464d);
        normalDistributionImpl2.setStandardDeviation((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 55.1999999998222d + "'", double5 == 55.1999999998222d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.04883560073156118d + "'", double7 == 0.04883560073156118d);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.30446746012271947d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-49.62465476117713d) + "'", double5 == (-49.62465476117713d));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability(0.38767317623584496d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.0d, 0.1096616106907986d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.0d, (double) 0.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(2.8165665442762825E-24d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.3511030636567253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 91.0d + "'", double10 == 91.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl0.cumulativeProbability(1.0000000000000073d, 0.3848369645341492d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean((double) (short) 0);
        normalDistributionImpl0.setMean(0.0d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setStandardDeviation(4.703838883365341E-4d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.24197072451914683d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.inverseCumulativeProbability((-9.992007221626409E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.24197072451914337d + "'", double11 == 0.24197072451914337d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.cumulativeProbability(0.5095890191126843d, 0.1586552539314552d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.004112807014447759d + "'", double9 == 0.004112807014447759d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.8413447460685395d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double14 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.09467574302164261d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        normalDistributionImpl2.setMean(0.004982565440835918d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4774954927042859E-22d + "'", double4 == 1.4774954927042859E-22d);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.39276307230455315d);
        normalDistributionImpl0.setMean((-3.3306690738754696E-16d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6527527593302829d + "'", double5 == 0.6527527593302829d);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setStandardDeviation((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.cumulativeProbability(0.5045637245140185d, 0.011394981174247374d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.36348329932713447d);
        normalDistributionImpl2.setMean(0.6148878559046674d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.003391125823206404d + "'", double7 == 0.003391125823206404d);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.38767317623584496d);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 42.867561125735264d + "'", double5 == 42.867561125735264d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.0024364383453520616d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.3989389075407833d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        normalDistributionImpl2.setMean(8.881784197001252E-16d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.003971497250408449d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.011398350795231223d + "'", double6 == 0.011398350795231223d);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0, (double) (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0, 0.691462461274013d);
        double double6 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.inverseCumulativeProbability((-157.44388116860097d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.25536251834768864d + "'", double5 == 0.25536251834768864d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.04883560073156118d, 0.38767317623584496d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6148878559046674d, (-157.44388116860097d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double14 = normalDistributionImpl0.cumulativeProbability((-1.2561529682171768d));
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.cumulativeProbability(0.8413447460685395d, 0.3988974611574716d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        normalDistributionImpl0.setStandardDeviation((double) '#');
        normalDistributionImpl0.setMean(0.25536251834768864d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3989422804014327d + "'", double8 == 0.3989422804014327d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.09467574302164261d);
        double double14 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((-1.1102230246251565E-15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.09467574302164261d + "'", double14 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.09467574302164261d + "'", double15 == 0.09467574302164261d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(42.867561125735264d, 36.0d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        normalDistributionImpl0.setMean((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-1.3796360778440238d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.3511030636567253d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3989422804014327d + "'", double8 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.3823439839379167d) + "'", double10 == (-0.3823439839379167d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011398350868612364d, (-1.1102230246251565E-15d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.NEGATIVE_INFINITY + "'", double9 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 101.0d);
        normalDistributionImpl0.setMean(97.4423124760719d);
        normalDistributionImpl0.setMean((-1.312499901071692d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass2 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.9999999999999857d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.inverseCumulativeProbability((-1.5210055437364645E-14d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 35.0d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        normalDistributionImpl0.setStandardDeviation(0.8413447460685395d);
        normalDistributionImpl0.setMean((double) 100.0f);
        normalDistributionImpl0.setMean(0.003859293226999287d);
        double double18 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.8413447460685395d + "'", double18 == 0.8413447460685395d);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-3.241851231905457E-14d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.39891637076145464d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 4.262705371416836E-21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3684295859056615d + "'", double13 == 0.3684295859056615d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3989422804014327d + "'", double15 == 0.3989422804014327d);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.011398350799319024d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(8.603904923161464d, (-1.312499901071692d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26831686462225557d + "'", double4 == 0.26831686462225557d);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setStandardDeviation(0.9999999999999857d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.5040019287905985d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability(52.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999999857d + "'", double12 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999999999999857d + "'", double13 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.5210055437364645E-14d) + "'", double15 == (-1.5210055437364645E-14d));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8106088131500386d, 0.005268537016191098d);
        normalDistributionImpl2.setMean(0.011398350789919569d);
        double double5 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability(9.617656016062085d, (double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.011398350789919569d + "'", double5 == 0.011398350789919569d);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = normalDistributionImpl0.inverseCumulativeProbability((-0.3491633383337742d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.6179114221889526d);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.011398350868612364d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-22.76824609551198d) + "'", double11 == (-22.76824609551198d));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NaN, (double) 1.0f);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl0.cumulativeProbability(1.486658076023932d, 0.2738700294039217d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 0L);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 1L);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1096616106907986d + "'", double7 == 0.1096616106907986d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.24463748165229704d, Double.NaN);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5095890191126843d);
        normalDistributionImpl0.setStandardDeviation((double) 100.0f);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setMean(1.2989609388114332E-14d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.387432573590388d);
        normalDistributionImpl0.setStandardDeviation(2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3700968566970246d + "'", double6 == 0.3700968566970246d);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) (short) 1);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.09467574302164261d);
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.38852033512092876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.26480951088062704d + "'", double12 == 0.26480951088062704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7168223047536362d + "'", double14 == 0.7168223047536362d);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.6549981199955597d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.POSITIVE_INFINITY, (-1.1102230246251565E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.8511172425430698d);
        double double15 = normalDistributionImpl2.cumulativeProbability((-2.942091015256665E-15d), 0.6549981199955597d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.007465462625309283d + "'", double15 == 0.007465462625309283d);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', (-2.942091015256665E-15d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d);
        normalDistributionImpl0.setStandardDeviation(0.49202168628309806d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 91.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7907416280995573E-73d + "'", double15 == 1.7907416280995573E-73d);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double8 = normalDistributionImpl0.cumulativeProbability(3.533930913758865E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.9999999999999982d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, (double) 1L);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.04100846842391914d);
        normalDistributionImpl0.setMean(0.3989389075407833d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.24463748165229704d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.39884996302130266d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011398072438227633d + "'", double9 == 0.011398072438227633d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setStandardDeviation(0.9999999999999857d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.6527527593302829d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999999857d + "'", double12 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999999999999857d + "'", double13 == 0.9999999999999857d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5095890191126843d);
        normalDistributionImpl0.setStandardDeviation((double) 100.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.003391125823206404d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003989422801720462d + "'", double12 == 0.003989422801720462d);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.539827837277029d);
        normalDistributionImpl0.setMean(11.0d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.02419707245191434d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.026109053048334d + "'", double15 == 9.026109053048334d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl0.inverseCumulativeProbability((-1.5210055437364645E-14d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.NEGATIVE_INFINITY + "'", double7 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 100.0d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.011397187830924622d);
        normalDistributionImpl0.setMean(101.0d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.39276307230455315d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability(32.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.9968985579339d + "'", double15 == 100.9968985579339d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011394981174247374d, 0.1096616106907986d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 10L);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.003859293226999287d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-26.641381163946413d) + "'", double11 == (-26.641381163946413d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.density((java.lang.Double) 0.38852033512092876d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.8165665442762825E-24d + "'", double3 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, (double) 1L);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.0013711354501702022d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        double double10 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5095890191126843d);
        normalDistributionImpl0.setStandardDeviation((double) 100.0f);
        normalDistributionImpl0.setMean(0.003859293226999287d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.8106088131500386d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.cumulativeProbability(1.8656947736106488E-4d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 88.0180622223085d + "'", double13 == 88.0180622223085d);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.8511172425430698d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(1.2989609388114332E-14d);
        double double16 = normalDistributionImpl2.inverseCumulativeProbability(0.691462461274013d);
        normalDistributionImpl2.setMean((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-266.9999995d) + "'", double14 == (-266.9999995d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 36.0d + "'", double16 == 36.0d);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setStandardDeviation((double) (byte) 1);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability(0.39884996302130266d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.25632498330402864d) + "'", double8 == (-0.25632498330402864d));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double14 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) (byte) 100);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.00394988272520803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.9949360047253046d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.8106088131500386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.88014208468009d + "'", double14 == 100.88014208468009d);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 101.0000002290142d);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.26831686462225557d, 0.5009719973078852d);
        normalDistributionImpl2.setMean(0.341284693435295d);
        normalDistributionImpl2.setMean(0.04100846842391914d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8385529758034967d + "'", double4 == 0.8385529758034967d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.189674862301045E-4d + "'", double7 == 9.189674862301045E-4d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.6148878559046674d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.cumulativeProbability(4.703838883365341E-4d, 8.881784197001252E-16d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0d + "'", double14 == 2.0d);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double14 = normalDistributionImpl0.cumulativeProbability((double) 0, 0.011398072438227633d);
        double double15 = normalDistributionImpl0.getMean();
        double double18 = normalDistributionImpl0.cumulativeProbability(0.02151428054220411d, 0.0985721653937312d);
        normalDistributionImpl0.setMean((double) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0024364383453520616d + "'", double11 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.7581570254009424E-5d + "'", double14 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.8656947736106488E-4d + "'", double18 == 1.8656947736106488E-4d);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.inverseCumulativeProbability(4.155983485151227E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 1);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 9.189674862301045E-4d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.004112723567028872d, 0.005383918863507501d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.inverseCumulativeProbability((double) ' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.22818092574262E-6d + "'", double5 == 5.22818092574262E-6d);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.004112723567028872d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.004982565585890275d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999999999999857d, 0.49202168628309806d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability((double) (byte) 0);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.NEGATIVE_INFINITY + "'", double9 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        normalDistributionImpl0.setStandardDeviation(0.003859293226999287d);
        normalDistributionImpl0.setStandardDeviation(9.359740967898311d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.inverseCumulativeProbability((-266.9999995d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.15865525393145702d);
        double double12 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 98.99999977098578d + "'", double11 == 98.99999977098578d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.003439130075321901d, 0.3684295859056615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.24197072451914337d + "'", double11 == 0.24197072451914337d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.07223569176415257d + "'", double14 == 0.07223569176415257d);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (short) -1);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        normalDistributionImpl0.setStandardDeviation(2.8165665442762825E-24d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(2.275957200481571E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 99.99999909265232d + "'", double13 == 99.99999909265232d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5041127341632511d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setStandardDeviation(0.04883560073156118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011398350799319024d, 0.011398350868612364d);
        normalDistributionImpl2.setMean(0.00411206605241144d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.38767317623584496d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.inverseCumulativeProbability((double) ' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 42.867561125735264d + "'", double5 == 42.867561125735264d);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double11 = normalDistributionImpl2.density((java.lang.Double) 0.003859293226999287d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.011398350799319024d + "'", double11 == 0.011398350799319024d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.2738700294039217d);
        normalDistributionImpl2.setStandardDeviation(2.7581570254009424E-5d);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.1096616106907986d);
        double double9 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5095890191126843d);
        normalDistributionImpl0.setStandardDeviation((double) 100.0f);
        normalDistributionImpl0.setMean(0.003859293226999287d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.003971497250408449d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.1102230246251565E-15d), (-1.1102230246251565E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 3.533930913758865E-4d);
        normalDistributionImpl2.setStandardDeviation(0.539827837277029d);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.011397187830924622d);
        normalDistributionImpl0.setMean(101.0d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.39276307230455315d);
        normalDistributionImpl0.setMean((-0.25632498330402864d));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.9968985579339d + "'", double15 == 100.9968985579339d);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        normalDistributionImpl2.setMean(0.0d);
        normalDistributionImpl2.setMean(0.35049274541515896d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.8413447460685395d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 99.99999909265232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3989422804012685d + "'", double15 == 0.3989422804012685d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(55.1999999998222d);
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double13 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(97.4423124760719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5072268199307045d, 5.22818092574262E-6d);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.0024364383453520616d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.3989389075407833d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.inverseCumulativeProbability(9.617656016062085d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.02151428054220411d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.cumulativeProbability(8.603904923161464d, 0.298693554355323d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.39884996302130266d + "'", double6 == 0.39884996302130266d);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.24197072451914337d, 3.621390715929835E-27d);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.15865525393145702d);
        double double9 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.46080199849299264d + "'", double8 == 0.46080199849299264d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.25536251834768864d, 35.0d);
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.03980208177438576d);
        double double16 = normalDistributionImpl0.density((java.lang.Double) 92.00000215d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0985721653937312d + "'", double12 == 0.0985721653937312d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-75.29874369961907d) + "'", double14 == (-75.29874369961907d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003976677061955973d + "'", double16 == 0.003976677061955973d);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability((double) (short) 100, 0.8385529758034967d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.8413447460685395d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(4.155983485151227E-4d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 96.65780841917969d + "'", double13 == 96.65780841917969d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.5095890191126843d);
        double double9 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.4562046874576832d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MathException; message: org.apache.commons.math.ConvergenceException: number of iterations=89, maximum iterations=2,147,483,647, initial=-90, lower bound=-179,769,313,486,231,570,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000, upper bound=10, final a value=-179, final b value=-1, f(a)=-0.427, f(b)=0");
        } catch (org.apache.commons.math.MathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003971497250408449d + "'", double8 == 0.003971497250408449d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.463391164310498d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double14 = normalDistributionImpl0.cumulativeProbability((double) 0, 0.011398072438227633d);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.463391164310498d);
        normalDistributionImpl0.setMean(0.005745855155042334d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl0.cumulativeProbability(0.40985459992980544d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0024364383453520616d + "'", double11 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.7581570254009424E-5d + "'", double14 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1597791228150634d + "'", double16 == 0.1597791228150634d);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.24463748165229704d);
        normalDistributionImpl2.setMean(10.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.011394981174247374d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011398072438227633d + "'", double9 == 0.011398072438227633d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.38767317623584496d + "'", double13 == 0.38767317623584496d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5095890191126843d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.003391125823206404d);
        normalDistributionImpl0.setStandardDeviation(4.155983485151227E-4d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(1.897375280211193E-22d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.3796360778440238d) + "'", double9 == (-1.3796360778440238d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.000415598348515d) + "'", double13 == (-1.000415598348515d));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0013711354501702022d, 0.26831686462225557d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(2.0d, 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.1208129155306007d + "'", double8 == 0.1208129155306007d);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.011398350799319024d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26831686462225557d + "'", double4 == 0.26831686462225557d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 101.0d);
        double double10 = normalDistributionImpl0.cumulativeProbability((-23.019820521106425d));
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.7168223047536362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.104628079763643E-15d) + "'", double10 == (-8.104628079763643E-15d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.30855485436716207d + "'", double12 == 0.30855485436716207d);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double8 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.004112807014447759d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl0.inverseCumulativeProbability(97.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.9597790821736437d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability(0.8511172425430698d, 0.3988974611574716d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        normalDistributionImpl2.setMean(0.8511172425430698d);
        double double7 = normalDistributionImpl2.cumulativeProbability(3.621390715929835E-27d, 0.003713014007658319d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.4759460734292684E-4d + "'", double7 == 1.4759460734292684E-4d);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0, (double) 10L);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-266.9999995d), 0.5041127341632511d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 100, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(99.71682230475363d, (-3.3306690738754696E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0013711354501702022d, 0.24197072451914683d);
        normalDistributionImpl2.setStandardDeviation(1.8656947736106488E-4d);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011394981174247374d, 0.1096616106907986d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1096616106907986d + "'", double3 == 0.1096616106907986d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 1.0d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.3511030636567253d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.617656016062085d + "'", double6 == 9.617656016062085d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.38852033512092876d, 0.003713014007658319d);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(2.8165665442762825E-24d);
        normalDistributionImpl0.setStandardDeviation(36.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 91.0d + "'", double10 == 91.0d);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.13934966669526672d, (double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8511172425430698d, 0.00411206605241144d);
        normalDistributionImpl2.setMean(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability(1.0000000000000073d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.24463748165229704d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(0.24463748165229704d, (-3.3306690738754696E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011398072438227633d + "'", double9 == 0.011398072438227633d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.09467574302164261d);
        double double14 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.getMean();
        double double17 = normalDistributionImpl0.cumulativeProbability((double) 100L);
        normalDistributionImpl0.setMean((-0.3823439839379167d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.09467574302164261d + "'", double14 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.09467574302164261d + "'", double15 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        normalDistributionImpl2.setMean(0.8511172425430698d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.36348329932713447d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.039846824608907386d + "'", double6 == 0.039846824608907386d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d);
        normalDistributionImpl0.setStandardDeviation(0.49202168628309806d);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.5020563944007155d, 8.723175385778642d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.8206667139258397d, (double) ' ');
        normalDistributionImpl2.setStandardDeviation(0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0161707293151494E-11d + "'", double5 == 4.0161707293151494E-11d);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(101.0d, 0.005745855155042334d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.011398350868612364d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.43147049479370425d, 3.533930913758865E-4d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(9.617656016062085d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((double) 0L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.38852033512092876d, 9.189674862301045E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(88.0180622223085d, (-209.999668607858d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.011398350799319024d);
        normalDistributionImpl2.setMean(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26831686462225557d + "'", double4 == 0.26831686462225557d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1096616106907986d, 0.3511030636567253d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 100L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003971497250408449d, (double) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl0.inverseCumulativeProbability(8.723175385778642d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.6179114221889526d);
        double double9 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(9.617656016062085d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        normalDistributionImpl0.setMean(0.0013711354501702022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.1102230246251565E-16d) + "'", double13 == (-1.1102230246251565E-16d));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        double double10 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) '#');
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.5095890191126843d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', 97.0d);
        normalDistributionImpl2.setStandardDeviation(4.0161707293151494E-11d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999999999999982d, (double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 18.0000005d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.inverseCumulativeProbability(1.7907416280995573E-73d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = normalDistributionImpl0.inverseCumulativeProbability(1.4866698082023473d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05208127941521934d + "'", double6 == 0.05208127941521934d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0018084020582365135d, (double) 100);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.463391164310498d, (-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.inverseCumulativeProbability(101.0000002290142d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3989422804014327d + "'", double8 == 0.3989422804014327d);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(9.026109053048334d, 0.011398350789919569d);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double14 = normalDistributionImpl0.cumulativeProbability((double) 0, 0.011398072438227633d);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.463391164310498d);
        normalDistributionImpl0.setMean(0.005745855155042334d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl0.cumulativeProbability(0.46080199849299264d, (-209.999668607858d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0024364383453520616d + "'", double11 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.7581570254009424E-5d + "'", double14 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1597791228150634d + "'", double16 == 0.1597791228150634d);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.4774954927042859E-22d, 18.0000005d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(9.359740967898311d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011398072438227633d, (-1.5210055437364645E-14d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.341284693435295d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability(8.603904923161464d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8211239448342376d, (double) 1);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation(100.3988499631105d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, (double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        normalDistributionImpl0.setMean((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-3.241851231905457E-14d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.43147049479370425d, 3.533930913758865E-4d);
        normalDistributionImpl2.setStandardDeviation(0.02419707245191434d);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(3.533930913758865E-4d, 0.005745855155042334d);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.8511172425430698d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(1.2989609388114332E-14d);
        double double15 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double19 = normalDistributionImpl2.cumulativeProbability((double) 0.0f, 0.15865525393145702d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = normalDistributionImpl2.cumulativeProbability(0.6527527593302829d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-266.9999995d) + "'", double14 == (-266.9999995d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0018084020582365135d + "'", double19 == 0.0018084020582365135d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.3989389075407833d, 0.5d);
        normalDistributionImpl2.setMean(0.011394981174247374d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.155983485151227E-4d + "'", double7 == 4.155983485151227E-4d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0);
        double double13 = normalDistributionImpl0.cumulativeProbability(10.0d, 98.52557187804089d);
        normalDistributionImpl0.setMean(0.4562046874576832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7763568394002505E-15d + "'", double13 == 1.7763568394002505E-15d);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.25536251834768864d, 1.4774954927042859E-22d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.691462461274013d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.9999999999999857d, 1.4759460734292684E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1), 0.00411206605241144d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) (-23.019820521106425d));
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-9.992007221626409E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setStandardDeviation(4.703838883365341E-4d);
        normalDistributionImpl2.setStandardDeviation(0.005723383913933699d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(0.1096616106907986d, 9.189674862301045E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setStandardDeviation(4.703838883365341E-4d);
        double double6 = normalDistributionImpl2.cumulativeProbability((-0.3491633383337742d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.539827837277029d);
        normalDistributionImpl0.setMean(11.0d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.02419707245191434d);
        double double17 = normalDistributionImpl0.density((java.lang.Double) 0.04883560073156118d);
        double double19 = normalDistributionImpl0.inverseCumulativeProbability(0.011398350795231223d);
        double double20 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.49999999999998457d);
        double double24 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.026109053048334d + "'", double15 == 9.026109053048334d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.621390715929835E-27d + "'", double17 == 3.621390715929835E-27d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.723175385641783d + "'", double19 == 8.723175385641783d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 11.0d + "'", double20 == 11.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.35206532676430224d + "'", double24 == 0.35206532676430224d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.11693498857496193d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.8511172425430698d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 2.8165665442762825E-24d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 35.0d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.40985459992980544d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.0024364383453520616d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.cumulativeProbability(0.25536251834768864d, 0.003859293226999287d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        normalDistributionImpl0.setStandardDeviation(0.003859293226999287d);
        double double13 = normalDistributionImpl0.cumulativeProbability(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setStandardDeviation((double) 10L);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.27389214325950473d, 0.27389214325950473d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        double double17 = normalDistributionImpl0.cumulativeProbability((-1.5210055437364645E-14d), 0.26831686462225557d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.782792010140924E-24d + "'", double14 == 7.782792010140924E-24d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.881784197001252E-16d + "'", double17 == 8.881784197001252E-16d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((-1.1102230246251565E-15d));
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.38767317623584496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 99.71461122256248d + "'", double13 == 99.71461122256248d);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        normalDistributionImpl0.setStandardDeviation((double) 10);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability(0.004112805055412701d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(7.267167198656892E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.4850139316775809d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, (double) (byte) 10);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.539827837277029d);
        double double7 = normalDistributionImpl2.density((java.lang.Double) 93.45487690387074d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.02151428054220411d + "'", double5 == 0.02151428054220411d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.22771251574621E-21d + "'", double7 == 8.22771251574621E-21d);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8206667139258397d, 91.0d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.inverseCumulativeProbability(101.04123693179952d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 91.0d + "'", double3 == 91.0d);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.5d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.09467574302164261d, 0.003987627967620997d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0);
        normalDistributionImpl0.setMean(0.011394981174247374d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.00394988272520803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.49702986288581713d + "'", double14 == 0.49702986288581713d);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.3989422804014327d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.8413447460685395d);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.01945305528714028d, 0.6549981199955597d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability((-1.5210055437364645E-14d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.inverseCumulativeProbability(1.0000000000000073d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05208127941521934d + "'", double6 == 0.05208127941521934d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.density((java.lang.Double) 0.01945305528714028d);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.8165665442762825E-24d + "'", double3 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6549981199955597d, Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.5040019287905985d);
        normalDistributionImpl0.setMean(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.7134509881791207d), 0.004112723567028872d);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double11 = normalDistributionImpl0.density((java.lang.Double) (-0.9953663079612478d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0023956230879392023d + "'", double11 == 0.0023956230879392023d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.cumulativeProbability(0.26831686462225557d, 0.011394981174247374d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(9.617656016062085d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.02151428054220411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.4203249534089945E-25d + "'", double13 == 1.4203249534089945E-25d);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        normalDistributionImpl2.setMean(8.881784197001252E-16d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.3989422804014327d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.39276307230455315d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003859293226999287d + "'", double4 == 0.003859293226999287d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.603904923161464d + "'", double6 == 8.603904923161464d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.3511030636567253d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.23921277642240243d);
        normalDistributionImpl2.setStandardDeviation(0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25820249755352387d + "'", double4 == 0.25820249755352387d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.298693554355323d + "'", double6 == 0.298693554355323d);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.39891637076145464d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.inverseCumulativeProbability(99.99999909265232d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3989422804014327d + "'", double8 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3684295859056615d + "'", double10 == 0.3684295859056615d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        normalDistributionImpl0.setMean(0.8385529758034967d);
        normalDistributionImpl0.setStandardDeviation(0.3511030636567253d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.inverseCumulativeProbability(88.0180622223085d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.691462461274013d);
        normalDistributionImpl2.setStandardDeviation(0.15993344388391528d);
        normalDistributionImpl2.setStandardDeviation((double) 'a');
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003447496149865155d + "'", double6 == 0.003447496149865155d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8106088131500386d, 0.005268537016191098d);
        normalDistributionImpl2.setMean(0.011398350789919569d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.2300923061989596d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.007507297482889052d + "'", double6 == 0.007507297482889052d);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.2738700294039217d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.003949881050253595d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.011394981174247374d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.004112807014447759d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.50000402809845d);
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.4850139316775809d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3988974611574716d + "'", double7 == 0.3988974611574716d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.0d);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double5 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989389075407833d + "'", double4 == 0.3989389075407833d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        normalDistributionImpl0.setMean((double) (short) 10);
        double double15 = normalDistributionImpl0.cumulativeProbability((-2.942091015256665E-15d), 0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.497202527569243E-15d + "'", double15 == 3.497202527569243E-15d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 0.8413447460685395d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.004112751329122643d, 4.262705371416836E-21d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8413447460685395d + "'", double4 == 0.8413447460685395d);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.04100846842391914d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 2.8278868567633342E-24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5041127341632511d, 99.71682230475363d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.0011494368275037914d, 1.7763568394002505E-15d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double8 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.00411206605241144d, 0.3988974611574716d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.09467574302164261d);
        double double14 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.getMean();
        double double17 = normalDistributionImpl0.cumulativeProbability((double) 100L);
        double double19 = normalDistributionImpl0.cumulativeProbability(93.45487690387074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.09467574302164261d + "'", double14 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.09467574302164261d + "'", double15 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) (short) 1);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.09467574302164261d);
        normalDistributionImpl0.setStandardDeviation(0.35049274541515896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.26480951088062704d + "'", double12 == 0.26480951088062704d);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        normalDistributionImpl0.setMean((double) (-1L));
        double double16 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0, 2.7581570254009424E-5d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl0.inverseCumulativeProbability(100.3988499631105d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.5095890191126843d);
        double double9 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003971497250408449d + "'", double8 == 0.003971497250408449d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 101.0000002290142d);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.26831686462225557d, 0.5009719973078852d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.6179114221889526d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8385529758034967d + "'", double4 == 0.8385529758034967d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.189674862301045E-4d + "'", double7 == 9.189674862301045E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.00394988272520803d + "'", double9 == 0.00394988272520803d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 100.0d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        double double16 = normalDistributionImpl0.cumulativeProbability(0.4850139316775809d);
        normalDistributionImpl0.setMean(0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setStandardDeviation((double) (byte) 1);
        normalDistributionImpl0.setMean(101.0d);
        double double9 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 101.0d + "'", double9 == 101.0d);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        normalDistributionImpl2.setStandardDeviation(0.691462461274013d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.inverseCumulativeProbability((-3.3306690738754696E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0024364383453520616d + "'", double5 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.691462461274013d + "'", double6 == 0.691462461274013d);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3989422804014327d + "'", double2 == 0.3989422804014327d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4562046874576832d, 0.8106088131500386d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4562046874576832d + "'", double3 == 0.4562046874576832d);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setStandardDeviation((double) (byte) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 9.359740967898311d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.782510087634035E-20d + "'", double8 == 3.782510087634035E-20d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9949360047253046d, 0.15865525393145702d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 2.7581570254009424E-5d);
        normalDistributionImpl2.setMean(0.3989389075407833d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.267167198656892E-9d + "'", double4 == 7.267167198656892E-9d);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (-1.0f));
        normalDistributionImpl0.setStandardDeviation(0.9988689163583906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.15865525393145702d + "'", double9 == 0.15865525393145702d);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.6148878559046674d);
        normalDistributionImpl0.setStandardDeviation(0.14489999812567278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8106088131500386d, 0.005268537016191098d);
        normalDistributionImpl2.setMean(0.011398350789919569d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.inverseCumulativeProbability(0.5041127341632511d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.011398350789919569d + "'", double5 == 0.011398350789919569d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.011452691720483021d + "'", double7 == 0.011452691720483021d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.inverseCumulativeProbability(1.2906118579297512E-137d);
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-209.999668607858d) + "'", double7 == (-209.999668607858d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.1102230246251565E-16d), 9.539394167099525E-23d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.11693498857496193d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.612770517507248E-7d) + "'", double4 == (-9.612770517507248E-7d));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl0.cumulativeProbability(9.359740967898311d, (-3.241851231905457E-14d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        normalDistributionImpl2.setMean(0.8511172425430698d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.density((java.lang.Double) 9.539394167099525E-23d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8511172425430698d + "'", double5 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03974999240299294d + "'", double8 == 0.03974999240299294d);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(42.867561125735264d, 36.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.011398350799319024d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11693498857496193d + "'", double4 == 0.11693498857496193d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 36.0d + "'", double5 == 36.0d);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.005268537016191098d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.15993344388391528d + "'", double4 == 0.15993344388391528d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setStandardDeviation((double) (byte) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.5040019287905985d, 9.026109053048334d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.30713001079381186d + "'", double9 == 0.30713001079381186d);
    }
}
