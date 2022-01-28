import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setMean(Double.POSITIVE_INFINITY);
        double double9 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.inverseCumulativeProbability(9.359740967898311d);
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10.0f, (double) (short) 10);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.39894227645996516d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02419707245191434d + "'", double4 == 0.02419707245191434d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1685009918038774d + "'", double6 == 0.1685009918038774d);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.50000402809845d);
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.4850139316775809d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.003439130075321901d, 0.4562046874576832d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.30855485436716207d, 0.0014324330216118556d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.17278422051147885d + "'", double10 == 0.17278422051147885d);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 35.0d);
        double double17 = normalDistributionImpl0.cumulativeProbability(4.155983485151227E-4d);
        double double18 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl0.cumulativeProbability(0.3989389075407833d, (-1.1102230246251565E-16d));
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
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.POSITIVE_INFINITY + "'", double18 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        normalDistributionImpl0.setMean((-9.992007221626409E-16d));
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999999857d + "'", double12 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999999999999857d + "'", double13 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.5210055437364645E-14d) + "'", double15 == (-1.5210055437364645E-14d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.39891637076145464d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.39891637076145464d + "'", double16 == 0.39891637076145464d);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100L);
        normalDistributionImpl0.setMean(0.7168223047536362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) Double.NEGATIVE_INFINITY);
        double double13 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.11693498857496193d);
        double double17 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5d + "'", double17 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.cumulativeProbability(0.24197072451914683d, 0.2300923061989596d);
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        normalDistributionImpl0.setStandardDeviation(2.8165665442762825E-24d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10, 0.8511172425430698d);
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) 10L);
        normalDistributionImpl0.setStandardDeviation(0.003391125823206404d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability((double) 'a', 0.341284693435295d);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1586552539314552d + "'", double10 == 0.1586552539314552d);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.8413447460685395d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011452691720483021d, 0.004982565585890275d);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        normalDistributionImpl0.setStandardDeviation(0.003859293226999287d);
        normalDistributionImpl0.setStandardDeviation(9.359740967898311d);
        double double14 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.39891637076145464d, 0.00411206605241144d);
        double double3 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.39891637076145464d + "'", double3 == 0.39891637076145464d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0, 0.691462461274013d);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(7.782792010140924E-24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.25536251834768864d + "'", double5 == 0.25536251834768864d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.005383918863507501d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        normalDistributionImpl0.setMean((double) (short) 10);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(55.1999999998222d);
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.inverseCumulativeProbability((-43.42007985654189d));
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) (-1.1102230246251565E-15d));
        normalDistributionImpl2.setStandardDeviation(0.49202168628309806d);
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0038536028656297734d + "'", double4 == 0.0038536028656297734d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, (double) 1L);
        double double13 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.40985459992980544d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) (byte) -1, 0.0d);
        double double9 = normalDistributionImpl2.inverseCumulativeProbability(0.38767317623584496d);
        double double10 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.004982565440835918d + "'", double7 == 0.004982565440835918d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6148878559046674d + "'", double9 == 0.6148878559046674d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.691462461274013d + "'", double10 == 0.691462461274013d);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.3989389075407833d, 0.5d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.003859293226999287d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.155983485151227E-4d + "'", double7 == 4.155983485151227E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5041286058447934d + "'", double9 == 0.5041286058447934d);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.0d, Double.NaN);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.003447496149865155d, 101.0d);
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.6179114221889526d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.inverseCumulativeProbability(88.0180622223085d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3511030636567253d + "'", double5 == 0.3511030636567253d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.004112723567028872d + "'", double7 == 0.004112723567028872d);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 0.003971497250408449d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.003971497250408449d + "'", double3 == 0.003971497250408449d);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.04123693179952d, 0.39276307230455315d);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.5d);
        double double4 = normalDistributionImpl2.cumulativeProbability(97.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) 10);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double10 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double14 = normalDistributionImpl0.cumulativeProbability((double) 0);
        normalDistributionImpl0.setMean(0.0039695706906738215d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        normalDistributionImpl2.setMean(0.00411206605241144d);
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.3988974611574716d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.cumulativeProbability(0.8511172425430698d, 0.003713014007658319d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-2.557907301394329d) + "'", double12 == (-2.557907301394329d));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 'a');
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.001349898031630159d + "'", double9 == 0.001349898031630159d);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.02419707245191434d, 35.0d);
        normalDistributionImpl2.setStandardDeviation(35.99999999962154d);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.25536251834768864d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-3.3306690738754696E-16d), 0.3684295859056615d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3684295859056615d + "'", double3 == 0.3684295859056615d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(Double.NaN);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.0d + "'", double12 == 101.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        double double16 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999999857d + "'", double12 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999999999999857d + "'", double13 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.5210055437364645E-14d) + "'", double15 == (-1.5210055437364645E-14d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(Double.NaN);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 98.99999977098578d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.cumulativeProbability((double) (short) 100, 1.897375280211193E-22d);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.24197066910440684d + "'", double14 == 0.24197066910440684d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.inverseCumulativeProbability(93.45487690387074d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability(0.539827837277029d);
        double double10 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.0d);
        double double5 = normalDistributionImpl0.cumulativeProbability(6.106226635438361E-16d, 0.6527527593302829d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2430421583241883d + "'", double5 == 0.2430421583241883d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        normalDistributionImpl0.setMean(0.2300923061989596d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.0018084020582365135d, 100.9968985579339d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability(10.0d, 0.001349898031630159d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.39891637076145464d + "'", double3 == 0.39891637076145464d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5902872315713317d + "'", double8 == 0.5902872315713317d);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.539827837277029d);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) (-1L));
        normalDistributionImpl2.setMean(0.39891637076145464d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability(0.2738700294039217d, (-2.557907301394329d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 55.1999999998222d + "'", double5 == 55.1999999998222d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.04883560073156118d + "'", double7 == 0.04883560073156118d);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 100, (double) (short) 1);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.003989422804014327d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.34703633824485d + "'", double4 == 97.34703633824485d);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(Double.POSITIVE_INFINITY);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.39276307230455315d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.39891637076145464d, 0.8413447460685395d);
        normalDistributionImpl0.setMean(0.39894227645996516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6527527593302829d + "'", double5 == 0.6527527593302829d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14489999812567278d + "'", double8 == 0.14489999812567278d);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1096616106907986d, 0.3511030636567253d);
        normalDistributionImpl2.setStandardDeviation(0.02419707245191434d);
        normalDistributionImpl2.setMean(2.8278868567633342E-24d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.39276307230455315d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 99.72787526763412d + "'", double12 == 99.72787526763412d);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) (-1.1102230246251565E-15d));
        double double7 = normalDistributionImpl2.cumulativeProbability(1.4203249534089945E-25d, 0.43147049479370425d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.cumulativeProbability(0.8385529758034967d, 0.49034770664643224d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0038536028656297734d + "'", double4 == 0.0038536028656297734d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0016640454911561742d + "'", double7 == 0.0016640454911561742d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        normalDistributionImpl0.setMean(1.0d);
        normalDistributionImpl0.setStandardDeviation(0.387432573590388d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.cumulativeProbability((double) '4', 0.49999999999999883d);
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 1);
        double double4 = normalDistributionImpl2.cumulativeProbability((-2.942091015256665E-15d));
        double double5 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.49999999999999883d + "'", double4 == 0.49999999999999883d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.6179114221889526d);
        double double9 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.26831686462225557d);
        double double5 = normalDistributionImpl0.density((java.lang.Double) (-49.62465476117713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 1.0d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.3511030636567253d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.02151428054220411d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.617656016062085d + "'", double6 == 9.617656016062085d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.539394167099525E-23d + "'", double8 == 9.539394167099525E-23d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.05208127941521934d, 2.7581570254009424E-5d);
        double double4 = normalDistributionImpl2.cumulativeProbability((-1.5210055437364645E-14d));
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.002359870124408081d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05200315393018593d + "'", double6 == 0.05200315393018593d);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(11.0d, 4.703838883365341E-4d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.cumulativeProbability(0.5045637245140185d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6930673530947105d + "'", double13 == 0.6930673530947105d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double3 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.024933565222190875d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.cumulativeProbability(0.5000162450984852d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.24463748165229704d);
        normalDistributionImpl2.setMean(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability(0.25820249755352387d, (-0.3823439839379167d));
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
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 100, (double) 100.0f);
        normalDistributionImpl2.setStandardDeviation(98.52557187804089d);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.5244398111854908d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.004982565440835918d, 0.9597790821736437d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.8511172425430698d);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(99.71461122256248d, 8.881784197001252E-16d);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5009719973078852d, 101.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(8.723175385778642d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        normalDistributionImpl0.setMean((double) (short) 10);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.5072268199307045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0793856131536207E-20d + "'", double15 == 1.0793856131536207E-20d);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        normalDistributionImpl2.setMean(8.881784197001252E-16d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability((-43.42007985654189d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        normalDistributionImpl2.setMean(0.8511172425430698d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.011398350799319024d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(96.84849763215512d, 0.5013282015108043d);
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setStandardDeviation(101.0d);
        double double10 = normalDistributionImpl0.cumulativeProbability((-23.019820521106425d));
        double double11 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(1.486658076023932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.40985459992980544d + "'", double10 == 0.40985459992980544d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        normalDistributionImpl0.setStandardDeviation(0.6179114221889526d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.02419707245191434d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.24197066910440684d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.539827837277029d);
        double double8 = normalDistributionImpl2.cumulativeProbability((-1.312499901071692d), 0.5009719973078852d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(0.004112807014447759d, 0.0038536028656297734d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 55.1999999998222d + "'", double5 == 55.1999999998222d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.005915351705566119d + "'", double8 == 0.005915351705566119d);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        normalDistributionImpl2.setMean((double) (byte) 100);
        double double9 = normalDistributionImpl2.cumulativeProbability((-75.29874369961907d), 0.1586552539314552d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.041047069588415E-4d + "'", double9 == 9.041047069588415E-4d);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        normalDistributionImpl0.setStandardDeviation(0.003859293226999287d);
        normalDistributionImpl0.setStandardDeviation(9.359740967898311d);
        normalDistributionImpl0.setMean(8.723175385778642d);
        double double17 = normalDistributionImpl0.cumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.17567111172148175d + "'", double17 == 0.17567111172148175d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability(0.8206667139258397d, 9.617656016062085d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 4.0161707293151494E-11d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.1096616106907986d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(Double.NaN);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 98.99999977098578d);
        double double16 = normalDistributionImpl0.inverseCumulativeProbability(6.767237638966325E-27d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.0d + "'", double12 == 101.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.24197066910440684d + "'", double14 == 0.24197066910440684d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 91.0d + "'", double16 == 91.0d);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 100.0d);
        normalDistributionImpl0.setMean(0.0d);
        double double17 = normalDistributionImpl0.density((java.lang.Double) 1.4866698082023473d);
        normalDistributionImpl0.setMean(0.0d);
        double double21 = normalDistributionImpl0.density((java.lang.Double) 0.7168223047536362d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.density((java.lang.Double) (-209.999668607858d));
        normalDistributionImpl0.setMean(0.0d);
        double double13 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.3511030636567253d);
        double double11 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(93.45487690387074d, 1.7907416280995573E-73d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.3823439839379167d) + "'", double10 == (-0.3823439839379167d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.39891637076145464d, 0.00411206605241144d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.00411206605241144d + "'", double5 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.39891637076145464d + "'", double6 == 0.39891637076145464d);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.30446746012271947d);
        double double17 = normalDistributionImpl0.density((java.lang.Double) (-26.641381163946413d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.38134713065470394d + "'", double15 == 0.38134713065470394d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.692839319102378E-155d + "'", double17 == 2.692839319102378E-155d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.38767317623584496d);
        normalDistributionImpl2.setStandardDeviation(0.5041291410139574d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.0985721653937312d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 42.867561125735264d + "'", double5 == 42.867561125735264d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.539827837277029d, 0.1586552539314552d);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability(0.03980208177438576d, 1.2682660406701413E-23d);
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setStandardDeviation((double) 10L);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.27389214325950473d, 0.27389214325950473d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.0016640454911561742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.782792010140924E-24d + "'", double14 == 7.782792010140924E-24d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7763568394002505E-15d + "'", double16 == 1.7763568394002505E-15d);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0024364383453520616d + "'", double3 == 0.0024364383453520616d);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(4.262705371416836E-21d, (-0.3457340159129554d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        normalDistributionImpl0.setStandardDeviation(0.003859293226999287d);
        normalDistributionImpl0.setStandardDeviation(9.359740967898311d);
        normalDistributionImpl0.setMean(8.723175385778642d);
        double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-15.216116946311248d) + "'", double17 == (-15.216116946311248d));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setMean(100.0d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.30446746012271947d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003987627967620997d + "'", double11 == 0.003987627967620997d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 101.0d + "'", double10 == 101.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.cumulativeProbability(0.011452691720483021d, (-0.9953663079612478d));
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3989422804014327d + "'", double11 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3848369645341492d + "'", double13 == 0.3848369645341492d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.5902872315713317d);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        normalDistributionImpl0.setMean(1.2682660406701413E-23d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        normalDistributionImpl0.setStandardDeviation(3.497202527569243E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.39891637076145464d + "'", double4 == 0.39891637076145464d);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, (double) 1L);
        double double14 = normalDistributionImpl0.inverseCumulativeProbability((double) 1L);
        double double16 = normalDistributionImpl0.density((java.lang.Double) 0.7302208489873937d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1208129155306007d, (-1.5210055437364645E-14d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        normalDistributionImpl0.setMean((double) (short) 10);
        normalDistributionImpl0.setStandardDeviation(0.9999998557845271d);
        double double16 = normalDistributionImpl0.density((java.lang.Double) 0.35375207302115724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.485032182693982E-21d + "'", double16 == 2.485032182693982E-21d);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double14 = normalDistributionImpl0.cumulativeProbability((double) 0, 0.011398072438227633d);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.463391164310498d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0024364383453520616d + "'", double11 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.7581570254009424E-5d + "'", double14 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1597791228150634d + "'", double16 == 0.1597791228150634d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean(32.0d);
        normalDistributionImpl0.setStandardDeviation(0.24197072451914337d);
        double double13 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.getMean();
        double double16 = normalDistributionImpl0.density((java.lang.Double) 99.99999909265232d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability(0.39884996302130266d);
        normalDistributionImpl0.setMean(0.5040019287905985d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability(0.8385529758034967d, 0.07223569176415257d);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6549981199955597d + "'", double6 == 0.6549981199955597d);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.3989389075407833d, 0.5d);
        normalDistributionImpl2.setMean(1.4759460734292684E-4d);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.011398350789919569d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.155983485151227E-4d + "'", double7 == 4.155983485151227E-4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-220.8518389289271d) + "'", double11 == (-220.8518389289271d));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-49.62465476117713d), 0.5041291410139574d);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, 0.00411206605241144d);
        double double10 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.8106088131500386d, 0.30855485436716207d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((-1.2561529682171768d));
        normalDistributionImpl0.setMean((-1.312499901071692d));
        normalDistributionImpl0.setStandardDeviation(0.004112723567028872d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl0.cumulativeProbability(1.2989609388114332E-14d, 1.7763568394002505E-15d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) (-3.3306690738754696E-16d));
        double double13 = normalDistributionImpl0.cumulativeProbability(0.003949881050253595d);
        normalDistributionImpl0.setStandardDeviation(0.5041286058447934d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.004112807014447759d + "'", double9 == 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.004112807014447759d + "'", double11 == 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5000162450984852d + "'", double13 == 0.5000162450984852d);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.2906118579297512E-137d, 0.05208137124318141d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) (-1.1102230246251565E-15d));
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.25536251834768864d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0038536028656297734d + "'", double4 == 0.0038536028656297734d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-28.79778829638325d) + "'", double6 == (-28.79778829638325d));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.0d, 0.26480951088062704d);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) (short) 1);
        double double13 = normalDistributionImpl0.cumulativeProbability((double) '4', Double.NaN);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.cumulativeProbability(0.9949360047253046d, 1.7907416280995573E-73d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        normalDistributionImpl0.setMean(0.36348329932713447d);
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
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean((double) (short) 0);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 42.867561125735264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setMean(100.0d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.011452691720483021d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3989422804014327d + "'", double8 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.24463748165229704d);
        normalDistributionImpl0.setMean((-15.216116946311248d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 99.30853753729033d + "'", double11 == 99.30853753729033d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.5020563944007155d, Double.POSITIVE_INFINITY);
        double double11 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5095890191126843d, (-28.79778829638325d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(Double.NaN);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 98.99999977098578d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.0d + "'", double12 == 101.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.24197066910440684d + "'", double14 == 0.24197066910440684d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability(0.13212396732606452d, 0.11693498857496193d);
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.4774954927042859E-22d, 18.0000005d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.6179114221889526d, 0.24197072451914683d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setMean(97.0d);
        double double12 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(2.972322388217208E-11d);
        double double18 = normalDistributionImpl0.cumulativeProbability(98.52557187804089d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl0.inverseCumulativeProbability((-15.216116946311248d));
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) 10L);
        normalDistributionImpl0.setStandardDeviation(0.003391125823206404d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(99.03989407290815d, (double) '#');
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1586552539314552d + "'", double10 == 0.1586552539314552d);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.3989422804014327d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.39276307230455315d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) (-23.019820521106425d));
        double double9 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003859293226999287d + "'", double4 == 0.003859293226999287d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.603904923161464d + "'", double6 == 8.603904923161464d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003439130075321901d + "'", double8 == 0.003439130075321901d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.001349898031630159d, 0.007224929106763151d);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 101.0d);
        normalDistributionImpl0.setStandardDeviation(101.0d);
        normalDistributionImpl0.setMean(0.0011494368275037914d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.39276307230455315d);
        normalDistributionImpl0.setMean(0.35049274541515896d);
        normalDistributionImpl0.setMean(0.003970761836563756d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.3164209905295682d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6527527593302829d + "'", double5 == 0.6527527593302829d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3799365150373838d + "'", double11 == 0.3799365150373838d);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9597790821736437d, (double) '#');
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setMean(55.1999999998222d);
        normalDistributionImpl0.setMean(0.40985459992980544d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 10.0d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.262705371416836E-21d + "'", double10 == 4.262705371416836E-21d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability(0.539827837277029d);
        normalDistributionImpl0.setStandardDeviation(0.024933565222190875d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.007465462625309283d, 0.5072268199307045d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.5072268199307045d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8377571665236911d + "'", double4 == 0.8377571665236911d);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.0d, 0.1096616106907986d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) (-75.29874369961907d));
        normalDistributionImpl2.setStandardDeviation(0.5045637245140185d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.011394981174247374d, (double) 10.0f);
        normalDistributionImpl0.setStandardDeviation(32.0d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.04100846842391914d + "'", double10 == 0.04100846842391914d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setStandardDeviation(4.703838883365341E-4d);
        normalDistributionImpl2.setStandardDeviation(0.005723383913933699d);
        normalDistributionImpl2.setStandardDeviation(0.004112807014447759d);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double5 = normalDistributionImpl0.cumulativeProbability(0.1208129155306007d, 0.9988689163583906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2929905121210513d + "'", double5 == 0.2929905121210513d);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.002359870124408081d, 32.0d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.5020563944007155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.3517027765833526d + "'", double14 == 0.3517027765833526d);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003987627967620997d, (-3.3306690738754696E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(9.617656016062085d);
        double double13 = normalDistributionImpl0.cumulativeProbability(1.4774954927042859E-22d, 0.24197072451914683d);
        normalDistributionImpl0.setStandardDeviation(8.603904923161464d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setStandardDeviation(10.0d);
        double double5 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9015863634979064d, (-157.44388116860097d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        normalDistributionImpl0.setMean(0.2300923061989596d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.0018084020582365135d, 100.9968985579339d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability(35.0d, (-0.839660072847429d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.39891637076145464d + "'", double3 == 0.39891637076145464d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5902872315713317d + "'", double8 == 0.5902872315713317d);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.8206667139258397d, (double) ' ');
        double double7 = normalDistributionImpl2.cumulativeProbability(Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.inverseCumulativeProbability(100.96481902940684d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0161707293151494E-11d + "'", double5 == 4.0161707293151494E-11d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.691462461274013d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.0014324330216118912d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.inverseCumulativeProbability((-26.42666130238155d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003447496149865155d + "'", double6 == 0.003447496149865155d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-43.42007985654189d) + "'", double8 == (-43.42007985654189d));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.007224929106763151d, (-29.19446450367986d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8511172425430698d, 0.00411206605241144d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.49702986288581713d);
        double double8 = normalDistributionImpl2.cumulativeProbability(3.397673124960754E-6d, 0.010956646484166686d);
        normalDistributionImpl2.setMean((double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00411206605241144d + "'", double3 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0020678144699498024d + "'", double8 == 0.0020678144699498024d);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004112807014447759d + "'", double5 == 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (-1.0f));
        double double10 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.007465462625309283d, 2.8165665442762825E-24d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.15865525393145702d + "'", double9 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setMean(1.2989609388114332E-14d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(2.972322388217208E-11d, 9.026109053048334d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.026109053048334d + "'", double3 == 9.026109053048334d);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.density((java.lang.Double) 88.0180622223085d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05208127941521934d + "'", double6 == 0.05208127941521934d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.006616941033833418d + "'", double9 == 0.006616941033833418d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.942091015256665E-15d), 0.03974999240299294d);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.039846824608907386d, 0.4850139316775809d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(1.4774954927042859E-22d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-5.445166607068674d) + "'", double4 == (-5.445166607068674d));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(1.7907416280995573E-73d);
        double double9 = normalDistributionImpl2.cumulativeProbability(3.497202527569243E-15d);
        double double11 = normalDistributionImpl2.cumulativeProbability(1.6653345369377348E-16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 0, 0.539827837277029d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.3989389075407833d, 0.5d);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.155983485151227E-4d + "'", double7 == 4.155983485151227E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3989422804014327d + "'", double10 == 0.3989422804014327d);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.691462461274013d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.005915351705566119d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003447496149865155d + "'", double6 == 0.003447496149865155d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0033303210636190686d + "'", double8 == 0.0033303210636190686d);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.24197072451914337d + "'", double11 == 0.24197072451914337d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        normalDistributionImpl0.setMean((double) (short) 10);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.539827837277029d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        double double17 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.100000163096063d + "'", double15 == 10.100000163096063d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.36348329932713447d);
        double double18 = normalDistributionImpl0.cumulativeProbability(2.8278868567633342E-24d, 8.603904923161464d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl0.cumulativeProbability(0.3989389075407833d, 0.23921277642240243d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.49999999999998457d + "'", double18 == 0.49999999999998457d);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.004112723567028872d, 0.005383918863507501d);
        double double8 = normalDistributionImpl2.cumulativeProbability((-49.62465476117713d), 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.22818092574262E-6d + "'", double5 == 5.22818092574262E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.19557940522778383d + "'", double8 == 0.19557940522778383d);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.13212396732606452d, 0.24197072451914683d);
        normalDistributionImpl2.setMean(0.07223569176415257d);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        double double18 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.026109053048334d + "'", double15 == 9.026109053048334d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.621390715929835E-27d + "'", double17 == 3.621390715929835E-27d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 11.0d + "'", double18 == 11.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.09467574302164261d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability(0.38767317623584496d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 101.0d);
        normalDistributionImpl0.setStandardDeviation(101.0d);
        double double15 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.05208127941521934d, 2.7581570254009424E-5d);
        double double4 = normalDistributionImpl2.cumulativeProbability((-1.5210055437364645E-14d));
        double double5 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.05208127941521934d + "'", double5 == 0.05208127941521934d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.9999999999999857d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability(0.012462652646205209d, 0.011398350789919569d);
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(1.4774954927042859E-22d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-81.9999995d) + "'", double8 == (-81.9999995d));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        normalDistributionImpl0.setMean(0.0020678144699498024d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.002359870124408081d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.38767317623584496d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.11693498857496193d);
        double double9 = normalDistributionImpl2.inverseCumulativeProbability(0.5768792773921276d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 42.867561125735264d + "'", double5 == 42.867561125735264d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.05247175082918987d + "'", double7 == 0.05247175082918987d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 58.20532058556991d + "'", double9 == 58.20532058556991d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.8413447460685395d);
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.0014324330216118912d);
        normalDistributionImpl2.setStandardDeviation(0.3989389075407833d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.012462652646205209d + "'", double7 == 0.012462652646205209d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 100.0d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.inverseCumulativeProbability(1.897375280211193E-22d);
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
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.2561529682171768d), 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.inverseCumulativeProbability(1.2906118579297512E-137d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, 0.298693554355323d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-209.999668607858d) + "'", double7 == (-209.999668607858d));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 0.003971497250408449d);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.1597791228150634d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8278868567633342E-24d + "'", double10 == 2.8278868567633342E-24d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.992007221626409E-16d) + "'", double12 == (-9.992007221626409E-16d));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.density((java.lang.Double) 1.486658076023932d);
        double double17 = normalDistributionImpl0.cumulativeProbability(0.9988689163583906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.13212396732606452d + "'", double15 == 0.13212396732606452d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.8410709021576761d + "'", double17 == 0.8410709021576761d);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.inverseCumulativeProbability((-8.104628079763643E-15d));
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setMean(97.0d);
        double double12 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(2.972322388217208E-11d);
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999999857d + "'", double8 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        double double7 = normalDistributionImpl2.density((java.lang.Double) 7.267167198656892E-9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004112807014447759d + "'", double5 == 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.004112807014447759d + "'", double7 == 0.004112807014447759d);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.5020563944007155d, Double.POSITIVE_INFINITY);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.4999999999999999d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) (-9.992007221626409E-16d));
        double double15 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl0.cumulativeProbability(0.5040019287905985d, 1.4759460734292684E-4d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setMean(55.1999999998222d);
        normalDistributionImpl0.setMean(0.40985459992980544d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 10.0d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.262705371416836E-21d + "'", double10 == 4.262705371416836E-21d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability(0.39884996302130266d);
        normalDistributionImpl0.setMean(0.5040019287905985d);
        normalDistributionImpl0.setMean(0.0033293208790807836d);
        double double13 = normalDistributionImpl0.cumulativeProbability(7.267167198656892E-9d, 8.723175385641783d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 100.3988499631105d);
        normalDistributionImpl0.setStandardDeviation(55.1999999998222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6549981199955597d + "'", double6 == 0.6549981199955597d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5013282015108043d + "'", double13 == 0.5013282015108043d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.04100846842391914d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        double double22 = normalDistributionImpl0.cumulativeProbability((-108.65624978119396d), 0.5009719973078852d);
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 8.326672684688674E-16d + "'", double22 == 8.326672684688674E-16d);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double12 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 1.0f);
        double double17 = normalDistributionImpl0.cumulativeProbability(0.6148878559046674d, (double) 100L);
        double double19 = normalDistributionImpl0.inverseCumulativeProbability(0.38134713065470394d);
        normalDistributionImpl0.setMean(0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003987627967620997d + "'", double11 == 0.003987627967620997d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.34044931186123606d + "'", double17 == 0.34044931186123606d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-29.19446450367986d) + "'", double19 == (-29.19446450367986d));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.density((java.lang.Double) 1.486658076023932d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.13212396732606452d + "'", double15 == 0.13212396732606452d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.26480951088062704d);
        normalDistributionImpl2.setMean((-1.312499901071692d));
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.8377571665236911d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.30446746012271947d + "'", double4 == 0.30446746012271947d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.039528187199597005d + "'", double8 == 0.039528187199597005d);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(99.99999909265232d, 91.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability((-0.839660072847429d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.13390324353657285d + "'", double4 == 0.13390324353657285d);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        normalDistributionImpl0.setStandardDeviation((double) 10);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double6 = normalDistributionImpl2.density((java.lang.Double) Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(0.5013282015108043d, 0.49202168628309806d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double12 = normalDistributionImpl0.cumulativeProbability(10.0d, 55.1999999998222d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        double double16 = normalDistributionImpl0.density((java.lang.Double) 96.7626822507217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0021142574024273783d + "'", double16 == 0.0021142574024273783d);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, (double) (byte) 10);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.011398350789919569d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.0011494368275037914d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03980208177438576d + "'", double4 == 0.03980208177438576d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.039799286795740366d + "'", double6 == 0.039799286795740366d);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3989422804014327d, 0.8385529758034967d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.341284693435295d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.05247175082918987d, 0.039846824608907386d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.472590953478856d + "'", double4 == 0.472590953478856d);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-3.3306690738754696E-16d), 0.5095890191126843d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) (-22.76824609551198d));
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.000415598348515d), (double) 100.0f);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.9980473674631738d, 11.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.03978788906002062d + "'", double5 == 0.03978788906002062d);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.39891637076145464d, 0.00411206605241144d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-7.977165358279764d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.00411206605241144d + "'", double5 == 0.00411206605241144d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 101.0000002290142d);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.26831686462225557d, 0.5009719973078852d);
        normalDistributionImpl2.setMean(0.341284693435295d);
        normalDistributionImpl2.setStandardDeviation(0.001349898031630159d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8385529758034967d + "'", double4 == 0.8385529758034967d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.189674862301045E-4d + "'", double7 == 9.189674862301045E-4d);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        normalDistributionImpl0.setStandardDeviation(0.003859293226999287d);
        normalDistributionImpl0.setStandardDeviation(9.359740967898311d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.359740967898311d + "'", double14 == 9.359740967898311d);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.5040019287905985d);
        normalDistributionImpl0.setStandardDeviation(0.5d);
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.9015863634979064d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.64532182054896d + "'", double14 == 100.64532182054896d);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability(0.39884996302130266d);
        normalDistributionImpl0.setMean(0.5040019287905985d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.5020563944007155d);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6549981199955597d + "'", double6 == 0.6549981199955597d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3989415253831241d + "'", double10 == 0.3989415253831241d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3071300107938131d + "'", double12 == 0.3071300107938131d);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        normalDistributionImpl0.setMean(96.65780841917969d);
        double double18 = normalDistributionImpl0.cumulativeProbability(0.49999999999998457d, (double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.1102230246251565E-16d) + "'", double13 == (-1.1102230246251565E-16d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7143132971519925E-6d + "'", double18 == 1.7143132971519925E-6d);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.cumulativeProbability(0.46080199849299264d, (-5.445166607068674d));
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.NEGATIVE_INFINITY + "'", double9 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability((double) '#', 1.4774954927042859E-22d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((-23.019820521106425d));
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-0.9953663079612478d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4062051513498445d + "'", double10 == 0.4062051513498445d);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        normalDistributionImpl0.setMean(88.0180622223085d);
        double double8 = normalDistributionImpl0.cumulativeProbability((-1.1102230246251565E-15d));
        normalDistributionImpl0.setMean(0.05200315393018593d);
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.6527527593302829d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.44476622630561513d + "'", double12 == 0.44476622630561513d);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation(97.0d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        normalDistributionImpl0.setMean((double) (short) -1);
        double double8 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.38767317623584496d, (double) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.5d);
        double double4 = normalDistributionImpl2.cumulativeProbability(97.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) 10);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.inverseCumulativeProbability((-0.9953663079612478d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.cumulativeProbability(8.723175385778642d, 9.539394167099525E-23d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3164209905295682d, 6.186529907183186E-4d);
        normalDistributionImpl2.setStandardDeviation(0.007224929106763151d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.100000163096063d, 0.02419707245191434d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-9.612770517507248E-7d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setMean(Double.POSITIVE_INFINITY);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.004112751329122643d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 8.723175385641783d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3989422804014327d + "'", double2 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1949611129156012E-17d + "'", double4 == 1.1949611129156012E-17d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.35206532676430224d);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.003971497250408449d);
        double double17 = normalDistributionImpl0.density((java.lang.Double) (-7.977165358279764d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.39894227645996516d + "'", double15 == 0.39894227645996516d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.867585377943257E-15d + "'", double17 == 5.867585377943257E-15d);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, (double) 1L);
        double double14 = normalDistributionImpl0.inverseCumulativeProbability((double) 1L);
        normalDistributionImpl0.setMean(0.003949913404973262d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10.0f, (double) (short) 10);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.39891637076145464d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02419707245191434d + "'", double4 == 0.02419707245191434d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.015559785378119362d + "'", double7 == 0.015559785378119362d);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.density((java.lang.Double) (-209.999668607858d));
        double double12 = normalDistributionImpl0.density((java.lang.Double) (-9.992007221626409E-16d));
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.inverseCumulativeProbability((-9.612770517507248E-7d));
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3989422804014327d + "'", double12 == 0.3989422804014327d);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.8413447460685395d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double15 = normalDistributionImpl0.cumulativeProbability((double) 0.0f);
        double double17 = normalDistributionImpl0.density((java.lang.Double) 0.3220907394873098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.04100846842391914d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.50000402809845d);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10L);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.0010115069907344898d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03969485302638689d + "'", double4 == 0.03969485302638689d);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.1096616106907986d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.inverseCumulativeProbability((-1.000415598348515d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5045637245140185d + "'", double5 == 0.5045637245140185d);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.0033293208790807836d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0985721653937312d, (double) 0L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        normalDistributionImpl0.setStandardDeviation(0.8413447460685395d);
        normalDistributionImpl0.setMean((double) 100.0f);
        double double17 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.0d);
        double double15 = normalDistributionImpl2.density((java.lang.Double) (-108.65624978119396d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.206924786140221E-28d + "'", double15 == 9.206924786140221E-28d);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.39276307230455315d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.39891637076145464d, 0.8413447460685395d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6527527593302829d + "'", double5 == 0.6527527593302829d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14489999812567278d + "'", double8 == 0.14489999812567278d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.004982565440835918d, 0.9597790821736437d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 97.4423124760719d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011394981174247374d, 0.1096616106907986d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.003971497250408449d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4730144282666813d + "'", double4 == 0.4730144282666813d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.011394981174247374d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.004112807014447759d);
        double double17 = normalDistributionImpl0.cumulativeProbability(0.30855485436716207d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5d, 1.0000000000000073d);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.004112723567028872d);
        normalDistributionImpl2.setMean((-1.312499901071692d));
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011398350789919569d + "'", double12 == 0.011398350789919569d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 100.0d);
        normalDistributionImpl0.setMean(0.0d);
        double double17 = normalDistributionImpl0.density((java.lang.Double) 1.4866698082023473d);
        double double18 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl0.cumulativeProbability(0.5301815628459023d, 1.7763568394002505E-15d);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.POSITIVE_INFINITY + "'", double18 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        double double13 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.24197072451914337d + "'", double11 == 0.24197072451914337d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability((double) (byte) 0);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.011452691720483021d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.NEGATIVE_INFINITY + "'", double9 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.39891611779725694d + "'", double11 == 0.39891611779725694d);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setMean(55.1999999998222d);
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.cumulativeProbability(0.1586552539314552d);
        double double10 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 55.1999999998222d + "'", double7 == 55.1999999998222d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 55.1999999998222d + "'", double10 == 55.1999999998222d);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01945305528714028d, (double) ' ');
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01945305528714028d + "'", double3 == 0.01945305528714028d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4997574798200302d + "'", double5 == 0.4997574798200302d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        normalDistributionImpl0.setMean(96.65780841917969d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl0.cumulativeProbability(99.71461122256248d, 0.003439130075321901d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.1102230246251565E-16d) + "'", double13 == (-1.1102230246251565E-16d));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003447496149865155d, 0.2419707245191438d);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.0d, 0.1096616106907986d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.02151428054220411d);
        double double7 = normalDistributionImpl2.inverseCumulativeProbability(0.39891611779725694d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 96.97190978062507d + "'", double7 == 96.97190978062507d);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.3164209905295682d);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.003391125823206404d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003970761836563756d + "'", double8 == 0.003970761836563756d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-260.7350958165562d) + "'", double11 == (-260.7350958165562d));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, 0.8385529758034967d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.cumulativeProbability(100.96481902940684d, 0.003976677061955973d);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.005745855155042334d, 5.22818092574262E-6d);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.cumulativeProbability(2.7581570254009424E-5d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05208137124318141d + "'", double9 == 0.05208137124318141d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4774954927042859E-22d + "'", double4 == 1.4774954927042859E-22d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.NEGATIVE_INFINITY + "'", double7 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setStandardDeviation(101.0d);
        double double10 = normalDistributionImpl0.cumulativeProbability((-23.019820521106425d));
        normalDistributionImpl0.setStandardDeviation(0.003976677061955973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.40985459992980544d + "'", double10 == 0.40985459992980544d);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.1096616106907986d);
        normalDistributionImpl0.setStandardDeviation(0.8413447460685395d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean((double) (short) 0);
        normalDistributionImpl0.setMean(0.0d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        double double18 = normalDistributionImpl0.cumulativeProbability((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5d + "'", double18 == 0.5d);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.6179114221889526d);
        normalDistributionImpl2.setMean(0.38767317623584496d);
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.005383918863507501d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-25.11376863225348d) + "'", double12 == (-25.11376863225348d));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.002359870124408081d, 32.0d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.002359870124408081d + "'", double3 == 0.002359870124408081d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl0.cumulativeProbability(96.65780841917969d, (double) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.026109053048334d + "'", double15 == 9.026109053048334d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.621390715929835E-27d + "'", double17 == 3.621390715929835E-27d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.24463748165229704d, Double.NaN);
        normalDistributionImpl0.setStandardDeviation(0.50000402809845d);
        double double8 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-209.999668607858d));
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.6148878559046674d);
        double double14 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.43147049479370425d, 3.533930913758865E-4d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.43147049479370425d + "'", double3 == 0.43147049479370425d);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        double double21 = normalDistributionImpl0.getMean();
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 11.0d + "'", double21 == 11.0d);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.5057533770708286d, 0.5000744304523199d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((-1.1102230246251565E-15d));
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.8511172425430698d);
        double double14 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.04123693179952d + "'", double13 == 101.04123693179952d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.cumulativeProbability(0.0d, (-0.3823439839379167d));
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.003970761836563756d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.inverseCumulativeProbability(101.04123693179952d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        normalDistributionImpl0.setMean(0.004112807014447759d);
        double double17 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.cumulativeProbability(0.5047652121381858d, 42.867561125735264d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.16865538677429714d + "'", double6 == 0.16865538677429714d);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.9949360047253046d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(2.275957200481571E-15d);
        double double16 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 92.00000215d + "'", double15 == 92.00000215d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double5 = normalDistributionImpl0.cumulativeProbability(0.27083010383549005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation(97.0d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) (-1.0d));
        normalDistributionImpl2.setMean(0.004112805055412701d);
        double double11 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.004112807014447759d + "'", double8 == 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.004112805055412701d + "'", double11 == 0.004112805055412701d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.cumulativeProbability(6.186529907183186E-4d, 8.723175385778642d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.cumulativeProbability(100.0d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        normalDistributionImpl2.setStandardDeviation(0.4062051513498445d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.05208127941521934d, 2.7581570254009424E-5d);
        normalDistributionImpl2.setMean(0.2300923061989596d);
        double double7 = normalDistributionImpl2.cumulativeProbability(1.4774954927042859E-22d, 0.0018084020582365135d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.010954846709518419d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.38767317623584496d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.inverseCumulativeProbability(0.001349898031630159d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MathException; message: org.apache.commons.math.ConvergenceException: number of iterations=64, maximum iterations=2,147,483,647, initial=20, lower bound=-179,769,313,486,231,570,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000, upper bound=52, final a value=-44, final b value=52, f(a)=0, f(b)=0.499");
        } catch (org.apache.commons.math.MathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 42.867561125735264d + "'", double5 == 42.867561125735264d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.density((java.lang.Double) 1.0d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.005268537016191098d, 0.15865525393145702d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.1597791228150634d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.834941009514711d + "'", double4 == 0.834941009514711d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.003391125823206404d, 0.11693498857496193d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.669560777217363E-4d + "'", double5 == 4.669560777217363E-4d);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.2906118579297512E-137d, 0.05208137124318141d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5041291410139574d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.390634484996413E-4d + "'", double4 == 5.390634484996413E-4d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.691462461274013d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(96.97190978062507d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.2419707245191438d, (double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.inverseCumulativeProbability((double) 100);
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
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003713014007658319d, 0.4999999999999999d);
        normalDistributionImpl2.setStandardDeviation(0.24463748165229704d);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.30855485436716207d, 0.19557940522778383d);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.8413447460685395d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.0021142574024273783d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9597790821736437d + "'", double6 == 0.9597790821736437d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.004982565585890275d + "'", double8 == 0.004982565585890275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.07608250205524576d) + "'", double10 == (-0.07608250205524576d));
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.003713014007658319d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.8206667139258397d, (double) ' ');
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, 9.041047069588415E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0161707293151494E-11d + "'", double5 == 4.0161707293151494E-11d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.2212453270876722E-15d) + "'", double8 == (-1.2212453270876722E-15d));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.25536251834768864d, 35.0d);
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.03980208177438576d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.cumulativeProbability(69.14708754420747d, 2.485032182693982E-21d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0985721653937312d + "'", double12 == 0.0985721653937312d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-75.29874369961907d) + "'", double14 == (-75.29874369961907d));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.039846824608907386d, 0.4850139316775809d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.011397187830924622d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.50000402809845d);
        normalDistributionImpl2.setMean(0.6509972405365397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8211239448342376d + "'", double4 == 0.8211239448342376d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5244398111854908d + "'", double6 == 0.5244398111854908d);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.6179114221889526d);
        normalDistributionImpl2.setMean((double) 100);
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.5009719973078852d);
        double double15 = normalDistributionImpl2.cumulativeProbability((-0.07608250205524576d), 0.5331888748664452d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.2682660406701413E-23d + "'", double12 == 1.2682660406701413E-23d);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.992007221626409E-16d + "'", double15 == 9.992007221626409E-16d);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.13212396732606452d, 0.24197072451914683d);
        double double3 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(99.03989407290815d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.13212396732606452d + "'", double3 == 0.13212396732606452d);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.1096616106907986d);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.25536251834768864d, 0.5013282015108043d);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.003989422801720462d);
        normalDistributionImpl2.setMean((double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5045637245140185d + "'", double5 == 0.5045637245140185d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8511172425430698d + "'", double7 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0010115069907344898d + "'", double10 == 0.0010115069907344898d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5041291410139574d + "'", double12 == 0.5041291410139574d);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        normalDistributionImpl2.setStandardDeviation(0.011398350795231223d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.011398350795231223d + "'", double5 == 0.011398350795231223d);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        double double16 = normalDistributionImpl0.getMean();
        double double17 = normalDistributionImpl0.getStandardDeviation();
        double double18 = normalDistributionImpl0.getMean();
        double double20 = normalDistributionImpl0.inverseCumulativeProbability(0.003989422804014327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.026109053048334d + "'", double15 == 9.026109053048334d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 11.0d + "'", double16 == 11.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 11.0d + "'", double18 == 11.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.347036338244843d + "'", double20 == 8.347036338244843d);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.011397187830924622d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0039695706906738215d + "'", double8 == 0.0039695706906738215d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation(97.0d);
        double double7 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.4999999999999999d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.inverseCumulativeProbability((-1.000415598348515d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability((double) (byte) 0);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.density((java.lang.Double) 9.189674862301045E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.NEGATIVE_INFINITY + "'", double9 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3989421119478429d + "'", double12 == 0.3989421119478429d);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.539827837277029d);
        double double8 = normalDistributionImpl2.cumulativeProbability((-1.312499901071692d), 0.5009719973078852d);
        normalDistributionImpl2.setMean(0.003859293226999287d);
        double double11 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 55.1999999998222d + "'", double5 == 55.1999999998222d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.005915351705566119d + "'", double8 == 0.005915351705566119d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003859293226999287d + "'", double11 == 0.003859293226999287d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.26831686462225557d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(32.0d, (-43.42007985654189d));
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3848369645341492d + "'", double10 == 0.3848369645341492d);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1), 0.039846824608907386d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.1102230246251565E-16d), 96.84849763215512d);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, (double) 1L);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.cumulativeProbability(6.186529907183186E-4d, 1.8656947736106488E-4d);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(4.703838883365341E-4d, 4.703838883365341E-4d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double5 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.703838883365341E-4d + "'", double5 == 4.703838883365341E-4d);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.05208127941521934d, 2.7581570254009424E-5d);
        normalDistributionImpl2.setMean(0.15993344388391528d);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(7.230419748435191E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability(99.03989407290815d, (-3.3869331096402027d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 69.14708754420747d + "'", double13 == 69.14708754420747d);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.POSITIVE_INFINITY, 0.27389214325950473d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.24463748165229704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.6914624627096684d) + "'", double13 == (-0.6914624627096684d));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 10L);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.003859293226999287d);
        normalDistributionImpl0.setStandardDeviation(0.39891611779725694d);
        double double14 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-26.641381163946413d) + "'", double11 == (-26.641381163946413d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.100000163096063d, 0.005723383913933699d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.27083010383549005d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 101.04123693179952d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.5020563944007155d, Double.POSITIVE_INFINITY);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.4999999999999999d);
        normalDistributionImpl0.setStandardDeviation(0.463391164310498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.003713014007658319d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(52.0d, 0.003949913404973262d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5013282015108043d, 0.25820249755352387d);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(11.0d, 0.3700968566970246d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability((double) 100L, 0.7168223047536362d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(4.703838883365341E-4d, 4.703838883365341E-4d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.49999999999998457d);
        normalDistributionImpl2.setMean(0.24197066910440684d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        normalDistributionImpl0.setStandardDeviation(0.01666635779967479d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, 0.3989422804014327d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.0d);
        normalDistributionImpl2.setMean(0.02151428054220411d);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26831686462225557d + "'", double4 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.43147049479370425d + "'", double7 == 0.43147049479370425d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.26831686462225557d + "'", double12 == 0.26831686462225557d);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.50000402809845d);
        normalDistributionImpl0.setMean(0.5009719973078852d);
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35261690698442966d + "'", double9 == 0.35261690698442966d);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(4.703838883365341E-4d, 0.09467574302164261d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.cumulativeProbability(0.3684295859056615d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 18.0000005d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.011397187830924622d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.3511030636567253d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.23921277642240243d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.26480951088062704d, (double) 100);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25820249755352387d + "'", double4 == 0.25820249755352387d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.298693554355323d + "'", double6 == 0.298693554355323d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.768888254738703d + "'", double9 == 0.768888254738703d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999999999857d + "'", double10 == 0.9999999999999857d);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, 0.39891637076145464d);
        normalDistributionImpl2.setStandardDeviation(0.04100846842391914d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.003949881050253595d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.67058236195435E-15d + "'", double6 == 2.67058236195435E-15d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(42.867561125735264d, 36.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.011398350799319024d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(7.267167198656892E-9d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11693498857496193d + "'", double4 == 0.11693498857496193d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-161.1434197887031d) + "'", double8 == (-161.1434197887031d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(2.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0024364383453520616d + "'", double11 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.7581570254009424E-5d + "'", double14 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.8656947736106488E-4d + "'", double18 == 1.8656947736106488E-4d);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(3.621390715929835E-27d, (double) '#');
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double12 = normalDistributionImpl0.cumulativeProbability(10.0d, 55.1999999998222d);
        double double13 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.density((java.lang.Double) 7.267167198656892E-9d);
        double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.1685009918038774d);
        double double19 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999982d);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.03989407290815d + "'", double17 == 99.03989407290815d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.5095890191126843d);
        double double9 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.5122507886537644d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003971497250408449d + "'", double8 == 0.003971497250408449d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 10L);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.003859293226999287d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.35049274541515896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-26.641381163946413d) + "'", double11 == (-26.641381163946413d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.03986973149906884d + "'", double13 == 0.03986973149906884d);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.3989422804014327d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.39276307230455315d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) (-23.019820521106425d));
        double double10 = normalDistributionImpl2.density((java.lang.Double) 0.23921277642240243d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003859293226999287d + "'", double4 == 0.003859293226999287d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.603904923161464d + "'", double6 == 8.603904923161464d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003439130075321901d + "'", double8 == 0.003439130075321901d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0038570217295531735d + "'", double10 == 0.0038570217295531735d);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.36348329932713447d);
        double double18 = normalDistributionImpl0.cumulativeProbability(2.8278868567633342E-24d, 8.603904923161464d);
        double double19 = normalDistributionImpl0.getStandardDeviation();
        double double21 = normalDistributionImpl0.cumulativeProbability((-209.999668607858d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.49999999999998457d + "'", double18 == 0.49999999999998457d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.36348329932713447d + "'", double19 == 0.36348329932713447d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.39891637076145464d, 0.00411206605241144d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 4.703838883365341E-4d);
        normalDistributionImpl2.setStandardDeviation(2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 8.723175385641783d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl0.cumulativeProbability(0.3220907394873098d, (double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3989422804014327d + "'", double2 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1949611129156012E-17d + "'", double4 == 1.1949611129156012E-17d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double12 = normalDistributionImpl0.cumulativeProbability(1.4203249534089945E-25d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double8 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-220.8518389289271d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6930673530947105d, 0.49999999999999883d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.1685009918038774d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14705851874594073d + "'", double4 == 0.14705851874594073d);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.50000402809845d);
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.4850139316775809d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.003439130075321901d, 0.4562046874576832d);
        double double11 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3988974611574716d + "'", double7 == 0.3988974611574716d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.17278422051147885d + "'", double10 == 0.17278422051147885d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.50000402809845d + "'", double11 == 0.50000402809845d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.024933565222190875d, 2.972322388217208E-11d);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 0.003971497250408449d);
        double double12 = normalDistributionImpl2.cumulativeProbability(35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8278868567633342E-24d + "'", double10 == 2.8278868567633342E-24d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0558110769286486E-11d + "'", double12 == 2.0558110769286486E-11d);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 1);
        normalDistributionImpl0.setStandardDeviation(1.4774954927042859E-22d);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6550225868958235d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999998557845271d, 7.230419748435191E-4d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        normalDistributionImpl0.setMean(0.5095890191126843d);
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
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double10 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.298693554355323d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability(0.1939162683106727d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5768792773921276d + "'", double8 == 0.5768792773921276d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.cumulativeProbability(0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 101.0d + "'", double10 == 101.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0547118733938987E-15d + "'", double12 == 1.0547118733938987E-15d);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setMean(97.0d);
        double double12 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(2.972322388217208E-11d);
        double double18 = normalDistributionImpl0.cumulativeProbability((-29.19446450367986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999999857d + "'", double8 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.44476622630561513d, (double) 1L);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011394981174247374d, 0.1096616106907986d);
        normalDistributionImpl2.setMean(99.71682230475363d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.003976677061955973d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1096616106907986d + "'", double7 == 0.1096616106907986d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 99.71682230475363d + "'", double8 == 99.71682230475363d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.cumulativeProbability(0.8206667139258397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.5095890191126843d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003971497250408449d + "'", double8 == 0.003971497250408449d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 101.0000002290142d);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.26831686462225557d, 0.5009719973078852d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8385529758034967d + "'", double4 == 0.8385529758034967d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.189674862301045E-4d + "'", double7 == 9.189674862301045E-4d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.24463748165229704d);
        normalDistributionImpl2.setMean(10.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.011394981174247374d);
        normalDistributionImpl2.setStandardDeviation(0.5184936385071415d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011398072438227633d + "'", double9 == 0.011398072438227633d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.38767317623584496d + "'", double13 == 0.38767317623584496d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.481506861492858d + "'", double17 == 4.481506861492858d);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(42.630353990821625d, 0.4062051513498445d);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(2.7581570254009424E-5d, 1.4866698082023473d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.33901596247314525d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.6171637425034306d) + "'", double4 == (-0.6171637425034306d));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d);
        normalDistributionImpl0.setStandardDeviation(0.49202168628309806d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((double) (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.inverseCumulativeProbability(4.669560777217363E-4d);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.NEGATIVE_INFINITY + "'", double12 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.15865525393145702d);
        double double11 = normalDistributionImpl0.cumulativeProbability(10.0d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setStandardDeviation(0.9999999999999857d);
        double double13 = normalDistributionImpl0.cumulativeProbability((double) (byte) 100);
        normalDistributionImpl0.setMean((double) 1L);
        normalDistributionImpl0.setStandardDeviation(9.189674862301045E-4d);
        normalDistributionImpl0.setMean(0.003989391072013627d);
        java.lang.Class<?> wildcardClass20 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.36348329932713447d);
        normalDistributionImpl0.setMean((double) (short) 1);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.3491633383337742d) + "'", double6 == (-0.3491633383337742d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.1096616106907986d);
        normalDistributionImpl0.setStandardDeviation(0.8413447460685395d);
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.039846824608907386d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(0.3989391683525467d, 3.782510087634035E-20d);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 98.52557187804089d + "'", double12 == 98.52557187804089d);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1096616106907986d, 0.3511030636567253d);
        normalDistributionImpl2.setStandardDeviation(0.02419707245191434d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability(4.481506861492858d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.004112723567028872d);
        normalDistributionImpl2.setMean((-1.312499901071692d));
        normalDistributionImpl2.setMean(0.0039695706906738215d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011398350789919569d + "'", double12 == 0.011398350789919569d);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.387432573590388d, 0.007465462625309283d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.0014324330216118556d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3651715500477512d + "'", double4 == 0.3651715500477512d);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.1096616106907986d);
        normalDistributionImpl0.setStandardDeviation(0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 101.0000002290142d);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.26831686462225557d, 0.5009719973078852d);
        normalDistributionImpl2.setMean(0.341284693435295d);
        normalDistributionImpl2.setMean(0.04100846842391914d);
        double double13 = normalDistributionImpl2.density((java.lang.Double) 0.3989421119478429d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8385529758034967d + "'", double4 == 0.8385529758034967d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.189674862301045E-4d + "'", double7 == 9.189674862301045E-4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.00394989875549451d + "'", double13 == 0.00394989875549451d);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.0d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.6527527593302829d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.inverseCumulativeProbability(54.943905406602084d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003987627967620997d + "'", double11 == 0.003987627967620997d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (short) -1);
        normalDistributionImpl0.setStandardDeviation(0.003447496149865155d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.007224929106763151d, 1.2989609388114332E-14d);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setMean(55.1999999998222d);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability(0.3989389075407833d);
        double double9 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 54.943905406602084d + "'", double8 == 54.943905406602084d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 55.1999999998222d + "'", double9 == 55.1999999998222d);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.005996816717407816d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4774954927042859E-22d + "'", double4 == 1.4774954927042859E-22d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 71.87668407982403d + "'", double6 == 71.87668407982403d);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(11.0d, 0.003971497250408449d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.003971497250408449d + "'", double3 == 0.003971497250408449d);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl0.setMean((double) 100);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.09467574302164261d);
        double double16 = normalDistributionImpl0.getMean();
        double double18 = normalDistributionImpl0.cumulativeProbability((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-266.9999995d));
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5d + "'", double18 == 0.5d);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.024933565222190875d, 0.005745855155042334d);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.539827837277029d);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.inverseCumulativeProbability(96.84849763215512d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 55.1999999998222d + "'", double5 == 55.1999999998222d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.04883560073156118d + "'", double7 == 0.04883560073156118d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double11 = normalDistributionImpl2.density((java.lang.Double) 0.2738700294039217d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.35375207302115724d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0113980019225466d + "'", double11 == 0.0113980019225466d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5040321215980881d + "'", double13 == 0.5040321215980881d);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(9.617656016062085d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(1.7907416280995573E-73d);
        double double9 = normalDistributionImpl2.cumulativeProbability(98.99999977098578d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.539827837277029d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.cumulativeProbability(101.04123693179952d, 0.0539057471196433d);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.3448500548141074d + "'", double14 == 0.3448500548141074d);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.02419707245191434d, 35.0d);
        normalDistributionImpl2.setMean(1.6653345369377348E-16d);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.26831686462225557d);
        double double4 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl0.inverseCumulativeProbability(98.52557187804089d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability(0.8206667139258397d, 9.617656016062085d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 4.0161707293151494E-11d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.24197072451914337d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-0.6841976624611501d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5955985761504836d + "'", double3 == 0.5955985761504836d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.24692517906509798d + "'", double5 == 0.24692517906509798d);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.9980260175983502d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 102.8822897425016d + "'", double13 == 102.8822897425016d);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        normalDistributionImpl0.setMean((-9.992007221626409E-16d));
        double double19 = normalDistributionImpl0.inverseCumulativeProbability(0.035024460672673785d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999999857d + "'", double12 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999999999999857d + "'", double13 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.5210055437364645E-14d) + "'", double15 == (-1.5210055437364645E-14d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.8115941962627518d) + "'", double19 == (-1.8115941962627518d));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5041127341632511d, 99.71682230475363d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5041127341632511d + "'", double3 == 0.5041127341632511d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.71682230475363d + "'", double4 == 99.71682230475363d);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.004982565585890275d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.03986973149906884d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', 0.02419707245191434d);
        normalDistributionImpl2.setStandardDeviation((double) 1L);
        double double5 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.36348329932713447d);
        normalDistributionImpl0.setMean(0.46080199849299264d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl0.cumulativeProbability(2.0d, 0.003987627967620997d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.03986973149906884d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 18.0000005d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.011398350789919569d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.2430421583241883d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-40.982844046802896d) + "'", double4 == (-40.982844046802896d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.022161439152763612d + "'", double6 == 0.022161439152763612d);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean(32.0d);
        normalDistributionImpl0.setStandardDeviation(0.24197072451914337d);
        double double13 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.9949360047253046d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.24197072451914337d + "'", double16 == 0.24197072451914337d);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.0000000000000073d, 0.4730144282666813d);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.691462461274013d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.834941009514711d, 0.003447496149865155d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.17278422051147885d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.9949360047253046d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.cumulativeProbability((-1.7134509881791207d));
        normalDistributionImpl0.setMean(0.0d);
        double double18 = normalDistributionImpl0.cumulativeProbability(0.5047652121381858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6931381238825d + "'", double18 == 0.6931381238825d);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.0d);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(18.0000005d);
        normalDistributionImpl0.setMean(52.0d);
        double double12 = normalDistributionImpl0.cumulativeProbability((-1.8115941962627518d), 0.011398350799319024d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989389075407833d + "'", double4 == 0.3989389075407833d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999999999999993d + "'", double7 == 0.9999999999999993d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5045637245140185d, 0.015559785378119362d);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 4.669560777217363E-4d);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.24197072451914337d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((-1.2561529682171768d));
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.557907301394329d), 0.5007975396572893d);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        double double17 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-266.9999995d) + "'", double14 == (-266.9999995d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.539827837277029d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.7615143478152635d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.02151428054220411d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.inverseCumulativeProbability((-0.9953663079612478d));
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003949913404973262d, (-209.999668607858d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setStandardDeviation(0.6549981199955597d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0033293208790807836d);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.0d, 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6549981199955597d + "'", double10 == 0.6549981199955597d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.13212396732606452d, 0.24197072451914683d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(100.64532182054896d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.13212396732606452d + "'", double3 == 0.13212396732606452d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(9.189674862301045E-4d, 0.4850139316775809d);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.15865525393145702d);
        normalDistributionImpl0.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl0.setMean(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl0.cumulativeProbability(0.04883560073156118d, 9.206924786140221E-28d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 98.99999977098578d + "'", double11 == 98.99999977098578d);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.inverseCumulativeProbability(0.012462652646205209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.242558404238784d) + "'", double5 == (-2.242558404238784d));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.8511172425430698d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(1.2989609388114332E-14d);
        double double15 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.40985459992980544d);
        double double19 = normalDistributionImpl2.density((java.lang.Double) 0.003447496149865155d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-266.9999995d) + "'", double14 == (-266.9999995d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-7.977165358279764d) + "'", double17 == (-7.977165358279764d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.011398350813317663d + "'", double19 == 0.011398350813317663d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.03626707353288911d, 0.35375207302115724d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0013711354501702022d, 0.05208137124318141d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.34044931186123606d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999625606d + "'", double4 == 0.9999999999625606d);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.24463748165229704d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 99.30853753729033d + "'", double11 == 99.30853753729033d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.23921277642240243d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability(0.38767317623584496d);
        double double6 = normalDistributionImpl0.cumulativeProbability(0.7615143478152635d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.04100846842391914d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.011397187830924622d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.2430421583241883d, (-25.11376863225348d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.359740967898311d + "'", double4 == 9.359740967898311d);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(4.703838883365341E-4d, 4.703838883365341E-4d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        normalDistributionImpl2.setMean(0.4997574798200302d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.04883560073156118d, 0.38767317623584496d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.5000162450984852d, 0.49999999999998457d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0019606880995698406d, 0.19557940522778383d);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.05208127941521934d, 2.7581570254009424E-5d);
        normalDistributionImpl2.setMean(0.2300923061989596d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.7581570254009424E-5d + "'", double5 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5000000000000052d);
        double double14 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.inverseCumulativeProbability((-3.241851231905457E-14d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5000000000000052d + "'", double14 == 0.5000000000000052d);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(2.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(0.40985459992980544d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.39276307230455315d);
        normalDistributionImpl2.setMean(0.4562046874576832d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.4003238434786596E-5d + "'", double6 == 4.4003238434786596E-5d);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NaN, (double) 1.0f);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.04883560073156118d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.13212396732606452d);
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.density((java.lang.Double) 100.88014208468009d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5331888748664452d + "'", double7 == 0.5331888748664452d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.04883560073156118d + "'", double8 == 0.04883560073156118d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.0d, 0.1096616106907986d);
        double double4 = normalDistributionImpl2.cumulativeProbability((-2.557907301394329d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.cumulativeProbability(0.25536251834768864d, 0.09431369582611149d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.cumulativeProbability(0.3684295859056615d);
        normalDistributionImpl0.setMean((-1.5260952666245327d));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.1586552539314552d);
        double double6 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (-1.0f));
        double double11 = normalDistributionImpl0.cumulativeProbability(0.39891637076145464d);
        double double13 = normalDistributionImpl0.cumulativeProbability((-1.5260952666245327d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.15865525393145702d + "'", double9 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6550225868958235d + "'", double11 == 0.6550225868958235d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.06349307036251645d + "'", double13 == 0.06349307036251645d);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1), 101.0000002290142d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.834941009514711d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.36150278271104d + "'", double4 == 97.36150278271104d);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 101.0000002290142d);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(1.1949611129156012E-17d, 0.5768792773921276d);
        double double9 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8385529758034967d + "'", double4 == 0.8385529758034967d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0022786240701070937d + "'", double7 == 0.0022786240701070937d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.NEGATIVE_INFINITY + "'", double9 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        normalDistributionImpl0.setMean(0.39884996302130266d);
        double double8 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.39884996302130266d + "'", double8 == 0.39884996302130266d);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        normalDistributionImpl0.setStandardDeviation(0.8413447460685395d);
        double double14 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.691462461274013d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.38134713065470394d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 31.791216817920393d + "'", double4 == 31.791216817920393d);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.38767317623584496d, 0.5020563944007155d);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.703838883365341E-4d + "'", double5 == 4.703838883365341E-4d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl0.cumulativeProbability(0.4999999999999999d, 0.020379329894292586d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.36348329932713447d, 0.5d);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, 0.3989422804014327d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26831686462225557d + "'", double4 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.43147049479370425d + "'", double7 == 0.43147049479370425d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) 10L);
        normalDistributionImpl0.setStandardDeviation(0.003391125823206404d);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1586552539314552d + "'", double10 == 0.1586552539314552d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', 97.0d);
        double double3 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.39276307230455315d);
        normalDistributionImpl0.setMean(0.35049274541515896d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6527527593302829d + "'", double5 == 0.6527527593302829d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.539827837277029d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.24197072451914683d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.8511172425430698d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(1.2989609388114332E-14d);
        double double16 = normalDistributionImpl2.inverseCumulativeProbability(0.691462461274013d);
        double double17 = normalDistributionImpl2.getStandardDeviation();
        double double19 = normalDistributionImpl2.inverseCumulativeProbability(0.5045637245140185d);
        double double20 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass21 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-266.9999995d) + "'", double14 == (-266.9999995d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 36.0d + "'", double16 == 36.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 36.0d + "'", double19 == 36.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.0d);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(18.0000005d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.46080199849299264d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989389075407833d + "'", double4 == 0.3989389075407833d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999999999999993d + "'", double7 == 0.9999999999999993d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6775296661049677d + "'", double9 == 0.6775296661049677d);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        normalDistributionImpl0.setMean(0.2300923061989596d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.0018084020582365135d, 100.9968985579339d);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.039528187199597005d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.inverseCumulativeProbability(9.359740967898311d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.39891637076145464d + "'", double3 == 0.39891637076145464d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5902872315713317d + "'", double8 == 0.5902872315713317d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2300923061989596d + "'", double9 == 0.2300923061989596d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.5260952666245327d) + "'", double11 == (-1.5260952666245327d));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double11 = normalDistributionImpl2.density((java.lang.Double) 0.003859293226999287d);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        double double14 = normalDistributionImpl2.cumulativeProbability(0.3517027765833526d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.011398350799319024d + "'", double11 == 0.011398350799319024d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5040087641844329d + "'", double14 == 0.5040087641844329d);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, 0.3989422804014327d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.0d);
        normalDistributionImpl2.setMean(0.02151428054220411d);
        normalDistributionImpl2.setStandardDeviation(97.4423124760719d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26831686462225557d + "'", double4 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.43147049479370425d + "'", double7 == 0.43147049479370425d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.1102230246251565E-16d), 9.539394167099525E-23d);
        normalDistributionImpl2.setStandardDeviation(11.0d);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.0024364383453520616d);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.0539057471196433d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.5095890191126843d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(0.039846824608907386d, 9.041047069588415E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003971497250408449d + "'", double8 == 0.003971497250408449d);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6931381238825d, 1.7907416280995573E-73d);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.8511172425430698d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(1.2989609388114332E-14d);
        double double16 = normalDistributionImpl2.inverseCumulativeProbability(0.691462461274013d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl2.cumulativeProbability(0.3989421119478429d, 2.275957200481571E-15d);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 36.0d + "'", double16 == 36.0d);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double10 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(55.1999999998222d);
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.3071300107938131d);
        double double16 = normalDistributionImpl0.inverseCumulativeProbability(Double.NaN);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 54.695998068151596d + "'", double14 == 54.695998068151596d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 56.1999999998222d + "'", double16 == 56.1999999998222d);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        normalDistributionImpl0.setMean(0.30446746012271947d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.5d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) (-28.79778829638325d));
        normalDistributionImpl0.setMean(0.49545415860167485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setMean(55.1999999998222d);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability(0.3989389075407833d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 54.943905406602084d + "'", double8 == 54.943905406602084d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5095890191126843d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.003391125823206404d);
        normalDistributionImpl0.setStandardDeviation(4.155983485151227E-4d);
        double double12 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.3796360778440238d) + "'", double9 == (-1.3796360778440238d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.26480951088062704d);
        normalDistributionImpl2.setMean((-1.312499901071692d));
        double double8 = normalDistributionImpl2.cumulativeProbability(100.9968985579339d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.30446746012271947d + "'", double4 == 0.30446746012271947d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5095890191126843d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.003391125823206404d);
        normalDistributionImpl0.setStandardDeviation(4.155983485151227E-4d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.8106088131500386d);
        double double16 = normalDistributionImpl0.inverseCumulativeProbability(0.2300923061989596d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.3796360778440238d) + "'", double9 == (-1.3796360778440238d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.155983485151227E-4d + "'", double12 == 4.155983485151227E-4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.8103019879415457d + "'", double16 == 0.8103019879415457d);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5013282015108043d, 0.16865538677429714d);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.38134713065470394d, 0.38767317623584496d);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) -1, 55.1999999998222d);
        double double4 = normalDistributionImpl2.cumulativeProbability((-3.3306690738754696E-16d));
        double double6 = normalDistributionImpl2.density((java.lang.Double) 6.661338147750939E-16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5072268199307045d + "'", double4 == 0.5072268199307045d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.007226029381657778d + "'", double6 == 0.007226029381657778d);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 1);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 9.189674862301045E-4d);
        normalDistributionImpl0.setStandardDeviation(0.14471422838183567d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.38767317623584496d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.011398350799319024d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.49845245813971395d + "'", double8 == 0.49845245813971395d);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.5040019287905985d);
        normalDistributionImpl0.setStandardDeviation(0.5d);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double8 = normalDistributionImpl0.cumulativeProbability((-40.982844046802896d), 0.003391125823206404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.16368519086556366d + "'", double8 == 0.16368519086556366d);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8410709021576761d, 2.485032182693982E-21d);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.004982565585890275d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.003447496149865155d, 0.0d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) -1, 55.1999999998222d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.8405931241353324d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.003439130075321901d, 0.004112807010969372d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 55.1999999998222d + "'", double3 == 55.1999999998222d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.868248769440697E-6d + "'", double8 == 4.868248769440697E-6d);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 1L, Double.POSITIVE_INFINITY);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.cumulativeProbability(0.24377533629588963d, 0.25536251834768864d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        normalDistributionImpl0.setStandardDeviation(0.5000744304523199d);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability(3.497202527569243E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.39891637076145464d + "'", double4 == 0.39891637076145464d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.499371909342156d) + "'", double8 == (-4.499371909342156d));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.8511172425430698d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(1.2989609388114332E-14d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-266.9999995d) + "'", double14 == (-266.9999995d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setStandardDeviation(0.9999999999999857d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        double double17 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999999857d + "'", double12 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999999999999857d + "'", double13 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9999999999999857d + "'", double17 == 0.9999999999999857d);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        normalDistributionImpl0.setStandardDeviation(0.15993344388391528d);
        normalDistributionImpl0.setMean(0.6775296661049677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability((double) (byte) 0);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.NEGATIVE_INFINITY + "'", double9 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6148878559046674d, 0.3448500548141074d);
    }
}
