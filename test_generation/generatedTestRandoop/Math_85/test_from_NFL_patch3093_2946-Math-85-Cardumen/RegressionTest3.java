import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003391125823206404d, (double) 10L);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.density((java.lang.Double) 4.155983485151227E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.003391125823206404d + "'", double3 == 0.003391125823206404d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.03989422627407296d + "'", double5 == 0.03989422627407296d);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', 0.02419707245191434d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.49034770664643224d);
        double double13 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.3989389075407833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35375207302115724d + "'", double12 == 0.35375207302115724d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.36842627353808527d + "'", double15 == 0.36842627353808527d);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        normalDistributionImpl0.setMean(1.0d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.39891637076145464d);
        double double15 = normalDistributionImpl0.getMean();
        double double17 = normalDistributionImpl0.cumulativeProbability((-40.982844046802896d));
        double double18 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl0.cumulativeProbability(9.917200250088689d, 0.5015840382524221d);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(9.041047069588415E-4d, 100.9968985579339d);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.011398350799319024d);
        double double18 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.026109053048334d + "'", double15 == 9.026109053048334d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.723175385778642d + "'", double17 == 8.723175385778642d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) 10L);
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.010956646484166686d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(0.9999999999999993d, 0.0d);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-2.2918674664154666d) + "'", double12 == (-2.2918674664154666d));
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.14471422838183567d, 0.0010115069907344898d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.0010115069907344898d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        normalDistributionImpl2.setMean(0.8511172425430698d);
        double double6 = normalDistributionImpl2.cumulativeProbability((-1.000415598348515d));
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.2929905121210513d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.426554404687355d + "'", double6 == 0.426554404687355d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.039832140057822554d + "'", double8 == 0.039832140057822554d);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.6148878559046674d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(7.67165393861376E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 91.0d + "'", double15 == 91.0d);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.625169930649095d, 0.024933565222190875d);
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
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.691462461274013d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.039799286795740366d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.13934966669526672d, 0.8413447460685395d);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.004112807014447759d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.4062051513498445d, 0.8405931241353324d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setStandardDeviation(35.0d);
        normalDistributionImpl0.setStandardDeviation(0.38767317623584496d);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.38767317623584496d + "'", double9 == 0.38767317623584496d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.38767317623584496d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.11693498857496193d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.cumulativeProbability(0.5000163087590218d, 0.003989422801720462d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 42.867561125735264d + "'", double5 == 42.867561125735264d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.05247175082918987d + "'", double7 == 0.05247175082918987d);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) 10L);
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.010956646484166686d);
        normalDistributionImpl0.setStandardDeviation(0.005723383913933699d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1586552539314552d + "'", double10 == 0.1586552539314552d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-2.2918674664154666d) + "'", double12 == (-2.2918674664154666d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.005723383913933699d + "'", double15 == 0.005723383913933699d);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-1.2561529682171768d));
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(7.008260026356572E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-3.3306690738754696E-15d), 0.48397938304535315d);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, (double) 1L);
        double double13 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.40985459992980544d);
        double double17 = normalDistributionImpl0.cumulativeProbability(0.003859293226999287d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5d + "'", double17 == 0.5d);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.3989422804014327d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.0021142574024273783d, 0.49202168628309806d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003859293226999287d + "'", double4 == 0.003859293226999287d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.00188963667909825d + "'", double7 == 0.00188963667909825d);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.004982565440835918d, 4.262705371416836E-21d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.3684295859056615d, 1.897375280211193E-22d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        normalDistributionImpl2.setMean((double) (byte) 100);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.006616941033833418d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.450661066961605E-5d + "'", double8 == 9.450661066961605E-5d);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0985721653937312d, (-22.76824609551198d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.02151428054220411d, 0.39276307230455315d);
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability(52.0d);
        normalDistributionImpl2.setStandardDeviation(0.9949360047253046d);
        double double14 = normalDistributionImpl2.density((java.lang.Double) 9.539394167099525E-23d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.cumulativeProbability(0.5007975396572893d, 0.30446746012271947d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.3306690738754696E-16d) + "'", double4 == (-3.3306690738754696E-16d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.106226635438361E-16d + "'", double7 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.397673124960754E-6d + "'", double10 == 3.397673124960754E-6d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.inverseCumulativeProbability(54.943905406602084d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.005268537016191098d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.16368519086556366d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.15993344388391528d + "'", double4 == 0.15993344388391528d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8385529758034967d, 0.40985459992980544d);
        double double3 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8385529758034967d + "'", double3 == 0.8385529758034967d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.25536251834768864d, 1.4774954927042859E-22d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.691462461274013d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.24463748165229704d, Double.NaN);
        double double7 = normalDistributionImpl0.density((java.lang.Double) 91.0d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.003989422748607731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-2.6529636664430827d) + "'", double9 == (-2.6529636664430827d));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        normalDistributionImpl2.setMean(0.01945305528714028d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-266.9999995d) + "'", double14 == (-266.9999995d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 36.0d + "'", double16 == 36.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0);
        double double12 = normalDistributionImpl0.cumulativeProbability(1.2989609388114332E-14d);
        normalDistributionImpl0.setStandardDeviation((double) (short) 100);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.10183238123444827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5000000000000052d + "'", double12 == 0.5000000000000052d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        normalDistributionImpl0.setMean(0.01666635779967479d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6549981199955597d + "'", double6 == 0.6549981199955597d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5013282015108043d + "'", double13 == 0.5013282015108043d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8413213033997585d, 0.0025136092583758485d);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.9949360047253046d);
        double double12 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.34044931186123606d);
        normalDistributionImpl0.setMean(100.9968985579339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.5005714579007384d);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability(99.71461122256248d, 0.2738700294039217d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        normalDistributionImpl0.setStandardDeviation(2.8165665442762825E-24d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.8206667139258397d, (double) (byte) 1);
        normalDistributionImpl0.setMean(0.3684295859056615d);
        normalDistributionImpl0.setStandardDeviation(0.38767317623584496d);
        double double20 = normalDistributionImpl0.cumulativeProbability(0.7976708387255201d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.8659015691448777d + "'", double20 == 0.8659015691448777d);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.0977872677871649d);
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
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(2.972322388217208E-11d);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.024933565222190875d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05208127941521934d + "'", double6 == 0.05208127941521934d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-157.44388116860097d) + "'", double8 == (-157.44388116860097d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.05216434382131924d + "'", double10 == 0.05216434382131924d);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        normalDistributionImpl0.setStandardDeviation(0.6179114221889526d);
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.density((java.lang.Double) Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, 0.3989422804014327d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.00411206605241144d);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.7098790816938819d);
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26831686462225557d + "'", double4 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.43147049479370425d + "'", double7 == 0.43147049479370425d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.486658076023932d + "'", double9 == 1.486658076023932d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.2683168646222556d + "'", double11 == 1.2683168646222556d);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        normalDistributionImpl2.setMean(0.00411206605241144d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.5769438134336734d);
        double double10 = normalDistributionImpl2.cumulativeProbability(18.0000005d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5071410812221328d + "'", double8 == 0.5071410812221328d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7130685382849511d + "'", double10 == 0.7130685382849511d);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double10 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.6527527593302829d);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        double double15 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.cumulativeProbability(0.9015863634979064d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.01945305528714028d, 0.6549981199955597d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.005268537016191098d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.3989421119478429d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.15993344388391528d + "'", double4 == 0.15993344388391528d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        normalDistributionImpl0.setMean(Double.NaN);
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
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-28.79778829638325d), 4.0161707293151494E-11d);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.38767317623584496d);
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.004982565585890275d);
        double double9 = normalDistributionImpl2.inverseCumulativeProbability(0.0041128068864829635d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 42.867561125735264d + "'", double5 == 42.867561125735264d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0033301633330862675d + "'", double7 == 0.0033301633330862675d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-32.56531138062493d) + "'", double9 == (-32.56531138062493d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3989389075407833d, 0.8106088131500386d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-26.641381163946413d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0);
        normalDistributionImpl0.setMean(0.011394981174247374d);
        double double14 = normalDistributionImpl0.cumulativeProbability(1.1949611129156012E-17d);
        double double16 = normalDistributionImpl0.cumulativeProbability(4.0161707293151494E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.49545415860167485d + "'", double14 == 0.49545415860167485d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.495454158617696d + "'", double16 == 0.495454158617696d);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(3.397673124960754E-6d, 0.49202168628309806d);
        normalDistributionImpl2.setStandardDeviation(0.463391164310498d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.463391164310498d + "'", double5 == 0.463391164310498d);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.011397187830924622d);
        normalDistributionImpl0.setMean(101.0d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.0010115069907344898d);
        double double17 = normalDistributionImpl0.density((java.lang.Double) 0.09431369582611149d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.96481902940684d + "'", double15 == 100.96481902940684d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setStandardDeviation((double) (byte) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((-0.25632498330402864d));
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3988499538048309d + "'", double8 == 0.3988499538048309d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, 0.8385529758034967d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3988974611574716d, 4.996003610813204E-16d);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.5009719973078852d);
        normalDistributionImpl0.setStandardDeviation(0.12958017852405082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9 == 2.0d);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-3.3306690738754696E-16d), 0.5095890191126843d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) (-22.76824609551198d));
        double double5 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5095890191126843d + "'", double5 == 0.5095890191126843d);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.16865538677429714d, 0.834941009514711d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability((double) (short) 10, 0.03626707353288911d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003949921231149102d, (-32.56531138062493d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10);
        normalDistributionImpl0.setMean((-1.7134509881791207d));
        double double18 = normalDistributionImpl0.getStandardDeviation();
        double double20 = normalDistributionImpl0.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.POSITIVE_INFINITY + "'", double18 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5d + "'", double20 == 0.5d);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.8511172425430698d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 2.8165665442762825E-24d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 35.0d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getMean();
        double double16 = normalDistributionImpl0.cumulativeProbability((-1.2212453270876722E-15d));
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl0.inverseCumulativeProbability((-0.016813778839715805d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.38767317623584496d, 0.5020563944007155d);
        double double6 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.cumulativeProbability(0.035024460672673785d, (double) (byte) 10);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.703838883365341E-4d + "'", double5 == 4.703838883365341E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.04088732234835524d + "'", double9 == 0.04088732234835524d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.24463748165229704d);
        normalDistributionImpl2.setMean(10.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.011394981174247374d);
        normalDistributionImpl2.setStandardDeviation(0.5184936385071415d);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011398072438227633d + "'", double9 == 0.011398072438227633d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.38767317623584496d + "'", double13 == 0.38767317623584496d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5184936385071415d + "'", double16 == 0.5184936385071415d);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double11 = normalDistributionImpl2.density((java.lang.Double) 0.003859293226999287d);
        double double13 = normalDistributionImpl2.cumulativeProbability((-38.29480978120667d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.011398350799319024d + "'", double11 == 0.011398350799319024d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.1369473559188812d + "'", double13 == 0.1369473559188812d);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        double double18 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.6549981199955597d);
        normalDistributionImpl0.setStandardDeviation((double) (short) 100);
        java.lang.Class<?> wildcardClass23 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.NEGATIVE_INFINITY + "'", double18 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.density((java.lang.Double) 1.0d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(5.514051569672565E-73d, (-0.27212473236588863d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.0038570217295531735d);
        normalDistributionImpl0.setMean(1.0793856131536207E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.39893931295678914d + "'", double9 == 0.39893931295678914d);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability(4.262705371416836E-21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) (-3.3306690738754696E-16d));
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.09467574302164261d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-1.2212453270876722E-15d));
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.004112807014447759d + "'", double11 == 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.004112805055412701d + "'", double13 == 0.004112805055412701d);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.7098790816938819d, 0.34254368759136156d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, (double) (byte) 10);
        double double5 = normalDistributionImpl2.cumulativeProbability((-2.242558404238784d), 0.9999821313291566d);
        double double7 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.003369916363094223d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1276987863971613d + "'", double5 == 0.1276987863971613d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.NEGATIVE_INFINITY + "'", double7 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4725707257657134d + "'", double9 == 0.4725707257657134d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.cumulativeProbability(100.0d);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.003987627967620997d, 0.6179114221889526d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.003949881050253595d);
        normalDistributionImpl0.setMean((-220.8518389289271d));
        normalDistributionImpl0.setStandardDeviation(0.298693554355323d);
        double double20 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999993d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = normalDistributionImpl0.inverseCumulativeProbability(9.617656016062085d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2300923061989596d + "'", double12 == 0.2300923061989596d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.3989391683525467d + "'", double14 == 0.3989391683525467d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.01945305528714028d, 0.6549981199955597d);
        double double17 = normalDistributionImpl0.density((java.lang.Double) 9.026109053048334d);
        double double19 = normalDistributionImpl0.cumulativeProbability(0.00411206605241144d);
        double double22 = normalDistributionImpl0.cumulativeProbability((-83.76480972721147d), 69.14708754420747d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5d + "'", double19 == 0.5d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        normalDistributionImpl0.setMean(18.0000005d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.POSITIVE_INFINITY + "'", double18 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, (double) 1L);
        double double13 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.40985459992980544d);
        double double17 = normalDistributionImpl0.density((java.lang.Double) 0.590989978358155d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability((double) (byte) 0);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.NEGATIVE_INFINITY + "'", double9 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        normalDistributionImpl2.setStandardDeviation(0.691462461274013d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.007507297482889052d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0024364383453520616d + "'", double5 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.691462461274013d + "'", double6 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.6792188216764028d) + "'", double8 == (-1.6792188216764028d));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        normalDistributionImpl0.setMean((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.cumulativeProbability(9.807518179365436d, 0.003989391072013627d);
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
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8511172425430698d, 0.00411206605241144d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.49702986288581713d);
        double double8 = normalDistributionImpl2.cumulativeProbability(3.397673124960754E-6d, 0.010956646484166686d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 3.782510087634035E-20d);
        normalDistributionImpl2.setMean(0.039826002957502736d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00411206605241144d + "'", double3 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0020678144699498024d + "'", double8 == 0.0020678144699498024d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.18525877776317726d + "'", double10 == 0.18525877776317726d);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.09467574302164261d);
        double double17 = normalDistributionImpl0.density((java.lang.Double) 1.8656947736106488E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        double double16 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double18 = normalDistributionImpl0.cumulativeProbability(0.5902872315713317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999999857d + "'", double8 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.24463748165229704d);
        normalDistributionImpl2.setMean(10.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.011394981174247374d);
        double double15 = normalDistributionImpl2.density((java.lang.Double) 0.1597791228150634d);
        double double16 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011398072438227633d + "'", double9 == 0.011398072438227633d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.38767317623584496d + "'", double13 == 0.38767317623584496d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.010956646484166686d + "'", double15 == 0.010956646484166686d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.25536251834768864d, 0.9999999999999857d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(97.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) Double.NEGATIVE_INFINITY);
        double double13 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.11693498857496193d);
        double double17 = normalDistributionImpl0.cumulativeProbability(0.011398350795231223d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl0.inverseCumulativeProbability(0.003949921231149102d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5d + "'", double17 == 0.5d);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        normalDistributionImpl2.setStandardDeviation(1.6653345369377348E-16d);
        normalDistributionImpl2.setMean(0.12235809905798467d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.6653345369377348E-16d + "'", double9 == 1.6653345369377348E-16d);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.3989389075407833d, 0.5d);
        normalDistributionImpl2.setMean(1.4759460734292684E-4d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.155983485151227E-4d + "'", double7 == 4.155983485151227E-4d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-266.9999995d), 0.44476622630561513d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.005383918863507501d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.13934966669526672d, 8.723175385778642d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 1);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.001349898031630159d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-26.030176490030193d) + "'", double6 == (-26.030176490030193d));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', 0.5045637245140185d);
        normalDistributionImpl2.setStandardDeviation(0.004112751329122643d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.042577872948533324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 31.9929198068016d + "'", double6 == 31.9929198068016d);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 0, 0.012462652646205209d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.03938712228709878d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.21696418397435044d + "'", double4 == 0.21696418397435044d);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.8511172425430698d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(1.2989609388114332E-14d);
        double double16 = normalDistributionImpl2.density((java.lang.Double) 0.6148878559046674d);
        double double18 = normalDistributionImpl2.density((java.lang.Double) 0.3989389075407833d);
        normalDistributionImpl2.setMean(92.00000215d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-266.9999995d) + "'", double14 == (-266.9999995d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.011396591996517814d + "'", double16 == 0.011396591996517814d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.011397610454616715d + "'", double18 == 0.011397610454616715d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setMean(55.1999999998222d);
        normalDistributionImpl0.setMean(0.40985459992980544d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 10.0d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.cumulativeProbability(0.011398350853397575d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.262705371416836E-21d + "'", double10 == 4.262705371416836E-21d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3451469510989622d + "'", double13 == 0.3451469510989622d);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        normalDistributionImpl0.setStandardDeviation(0.007507297482889052d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl0.cumulativeProbability(0.05372313980725889d, 0.003391125823206404d);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(2.0558110769286486E-11d, 0.3149149987568516d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.density((java.lang.Double) 1.0d);
        normalDistributionImpl0.setStandardDeviation(0.0023956230879392023d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.24463748165229704d, Double.NaN);
        normalDistributionImpl0.setStandardDeviation(0.50000402809845d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.cumulativeProbability(0.27389214325950473d, 0.003970761836563756d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.50000402809845d + "'", double9 == 0.50000402809845d);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.7615143478152635d, 69.14708754420747d);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setMean(100.0d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.007465462625309283d, 0.5072268199307045d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.8659015691448777d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.007465462625309283d + "'", double3 == 0.007465462625309283d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5690794135429529d + "'", double5 == 0.5690794135429529d);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0000002290142d, 2.8165665442762825E-24d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.7098790816938819d, 0.495454158617696d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.39891637076145464d);
        normalDistributionImpl0.setMean((-257.663117521717d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.2561529682171768d) + "'", double11 == (-1.2561529682171768d));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.004112723567028872d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.0025136092583758485d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability(36.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.inverseCumulativeProbability(96.97190978062507d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.8165665442762825E-24d + "'", double3 == 2.8165665442762825E-24d);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.34703633824485d, 0.49702986288581713d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.691462461274013d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.0014324330216118912d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003447496149865155d + "'", double6 == 0.003447496149865155d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-43.42007985654189d) + "'", double8 == (-43.42007985654189d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, 0.00411206605241144d);
        double double10 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.004982565585890275d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.004982565585890275d + "'", double13 == 0.004982565585890275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 101.0000002290142d);
        double double5 = normalDistributionImpl2.cumulativeProbability(58.83350011594982d, 102.8822897425016d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.12607967267962028d + "'", double5 == 0.12607967267962028d);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) 1.0f);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double14 = normalDistributionImpl0.cumulativeProbability((double) 0, 0.011398072438227633d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0024364383453520616d + "'", double11 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.7581570254009424E-5d + "'", double14 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 35.0d);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.012462652646205209d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4774954927042859E-22d + "'", double4 == 1.4774954927042859E-22d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 74.57441598635477d + "'", double8 == 74.57441598635477d);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.100000163096063d + "'", double15 == 10.100000163096063d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6179114221889526d, 0.11693498857496193d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.11693498857496193d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.168640378476312E-6d + "'", double4 == 9.168640378476312E-6d);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setStandardDeviation(0.571107425038754d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.2906118579297512E-137d, 0.05208137124318141d);
        normalDistributionImpl2.setStandardDeviation(0.0113980019225466d);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0d);
        normalDistributionImpl0.setStandardDeviation(0.5040321215980881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        normalDistributionImpl0.setStandardDeviation(0.5000744304523199d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.39891637076145464d + "'", double4 == 0.39891637076145464d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.004112723567028872d, 0.005383918863507501d);
        double double6 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.22818092574262E-6d + "'", double5 == 5.22818092574262E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double3 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.011398350789919569d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0027737855665379008d + "'", double6 == 0.0027737855665379008d);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        double double18 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003987627967620997d + "'", double11 == 0.003987627967620997d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.34044931186123606d + "'", double17 == 0.34044931186123606d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0021142574024273783d, 99.30853753729033d);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.0d);
        double double14 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.cumulativeProbability((-0.27212473236588863d), 0.007226029381657778d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.011143143245466003d + "'", double17 == 0.011143143245466003d);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8106088131500386d, (-1.1102230246251565E-15d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.cumulativeProbability(0.1586552539314552d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) (-1.1102230246251565E-15d));
        normalDistributionImpl2.setStandardDeviation(0.49202168628309806d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0038536028656297734d + "'", double4 == 0.0038536028656297734d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setStandardDeviation((double) (byte) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((-0.25632498330402864d));
        double double9 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3988499538048309d + "'", double8 == 0.3988499538048309d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0);
        normalDistributionImpl0.setMean(0.011394981174247374d);
        double double14 = normalDistributionImpl0.cumulativeProbability(1.1949611129156012E-17d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.cumulativeProbability(2.0d, 0.6527527593302829d);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.49545415860167485d + "'", double14 == 0.49545415860167485d);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setMean(100.0d);
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.38134713065470394d);
        normalDistributionImpl2.setMean(0.025405905646918903d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.002428934684568244d + "'", double9 == 0.002428934684568244d);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.39891637076145464d, 0.00411206605241144d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.1096616106907986d, Double.NaN);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability(0.36842627353808527d, 0.020379329894292586d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.00411206605241144d + "'", double5 == 0.00411206605241144d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.00411206605241144d + "'", double9 == 0.00411206605241144d);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double11 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0, 97.0d);
        double double12 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(0.03989422627407296d, 0.011398350799319024d);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        normalDistributionImpl0.setStandardDeviation(0.6179114221889526d);
        double double12 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(0.025405905646918903d, (-209.999668607858d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.011398350789919569d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.0032766542929493826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23921277642240243d + "'", double11 == 0.23921277642240243d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.39884996302130266d, 0.5111606389866273d);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.539827837277029d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.inverseCumulativeProbability(97.34703633824485d);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        normalDistributionImpl0.setStandardDeviation(0.0024364383453520616d);
        normalDistributionImpl0.setStandardDeviation(0.2738700294039217d);
        normalDistributionImpl0.setStandardDeviation(0.9999998557845271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.6534818342543749d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.cumulativeProbability(9.64480942297585d, 0.5769438134336734d);
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05208127941521934d + "'", double6 == 0.05208127941521934d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        normalDistributionImpl0.setMean((double) (short) 10);
        normalDistributionImpl0.setStandardDeviation(0.9999998557845271d);
        normalDistributionImpl0.setMean(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.04100846842391914d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.15993344388391528d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999519056761452d + "'", double4 == 0.9999519056761452d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        normalDistributionImpl2.setStandardDeviation(0.691462461274013d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.006616941033833418d);
        normalDistributionImpl2.setStandardDeviation(100.88014208468009d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5769438134336734d + "'", double6 == 0.5769438134336734d);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999999999999982d, (double) (short) 1);
        normalDistributionImpl2.setStandardDeviation(0.508076258511588d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.38767317623584496d);
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.004982565585890275d);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 42.867561125735264d + "'", double5 == 42.867561125735264d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0033301633330862675d + "'", double7 == 0.0033301633330862675d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.2300923061989596d);
        double double8 = normalDistributionImpl0.cumulativeProbability((-3.3306690738754696E-16d));
        normalDistributionImpl0.setMean((double) 1L);
        normalDistributionImpl0.setStandardDeviation(4.155983485151227E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(1.7143132971519925E-6d, (double) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.38852033512092876d + "'", double6 == 0.38852033512092876d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4999999999999999d + "'", double8 == 0.4999999999999999d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
            double double16 = normalDistributionImpl0.cumulativeProbability(0.35206532676430224d, 0.011396591996517814d);
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
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 10.0d);
        double double16 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.NEGATIVE_INFINITY + "'", double16 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, 0.39891637076145464d);
        normalDistributionImpl2.setStandardDeviation(0.04100846842391914d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.003949881050253595d);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.67058236195435E-15d + "'", double6 == 2.67058236195435E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.596323321948148E-14d) + "'", double8 == (-4.596323321948148E-14d));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0044318484119380075d + "'", double13 == 0.0044318484119380075d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        double double16 = normalDistributionImpl0.cumulativeProbability(0.7168223047536362d);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.7632581264314935d + "'", double16 == 0.7632581264314935d);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.005268537016191098d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 8.881784197001252E-16d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(8.347036338244843d, 0.0985721653937312d);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        normalDistributionImpl0.setMean(2.972322388217208E-11d);
        normalDistributionImpl0.setMean(0.020379329894292586d);
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
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 100.88014208468009d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.3223937625031809d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.27083010383549005d + "'", double8 == 0.27083010383549005d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setStandardDeviation((double) 10L);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.27389214325950473d, 0.27389214325950473d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        double double15 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability(54.943905406602084d);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.782792010140924E-24d + "'", double14 == 7.782792010140924E-24d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((-1.1102230246251565E-15d));
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.3989415253831241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        normalDistributionImpl2.setStandardDeviation(1.0000000000000073d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(1.0000000000000004d, (-0.6841976624611501d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.3306690738754696E-16d) + "'", double4 == (-3.3306690738754696E-16d));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.691462461274013d);
        double double12 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.cumulativeProbability(9.450661066961605E-5d, 0.3530085295059213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(100.96481902940684d, (-81.9999995d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.011397187830924622d);
        normalDistributionImpl0.setMean(101.0d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.39276307230455315d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.9968985579339d + "'", double15 == 100.9968985579339d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.011397187830924622d + "'", double16 == 0.011397187830924622d);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 1L, Double.POSITIVE_INFINITY);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        normalDistributionImpl2.setMean(0.00411206605241144d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.5769438134336734d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 0.3651715500477512d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5071410812221328d + "'", double8 == 0.5071410812221328d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.012466152713401303d + "'", double10 == 0.012466152713401303d);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(2.576279703865435E-8d, 0.12607967267962028d);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.1096616106907986d);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.25536251834768864d, 0.5013282015108043d);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.003989422801720462d);
        double double15 = normalDistributionImpl2.cumulativeProbability((-22.76824609551198d), 0.3448500548141074d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5045637245140185d + "'", double5 == 0.5045637245140185d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8511172425430698d + "'", double7 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0010115069907344898d + "'", double10 == 0.0010115069907344898d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5041291410139574d + "'", double12 == 0.5041291410139574d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.09431369582611149d + "'", double15 == 0.09431369582611149d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3164209905295682d, 6.186529907183186E-4d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(8.881784197001252E-16d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.007465462625309283d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.30855485436716207d, 0.3930568015437984d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.6841976624611501d) + "'", double4 == (-0.6841976624611501d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3149149987568516d + "'", double6 == 0.3149149987568516d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0000000000000027d + "'", double9 == 1.0000000000000027d);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.0d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.13934966669526672d);
        double double9 = normalDistributionImpl2.cumulativeProbability((-8.145164570864665d), 1.486658076023932d);
        double double10 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.010954846709518419d + "'", double6 == 0.010954846709518419d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.10183238123444827d + "'", double9 == 0.10183238123444827d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.9949360047253046d);
        double double12 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.34044931186123606d);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.24692517906509798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4627435892576137d + "'", double16 == 0.4627435892576137d);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.50000402809845d);
        normalDistributionImpl0.setMean(0.5009719973078852d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-266.9999995d));
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.9988689163583906d, 1.9432970451699338E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.26831686462225557d);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.3989389075407833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.26831686462225557d + "'", double5 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.49229907449655663d + "'", double7 == 0.49229907449655663d);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.8413447460685395d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 54.695998068151596d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9597790821736437d + "'", double6 == 0.9597790821736437d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.942091015256665E-15d), 0.13934966669526672d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.942091015256665E-15d) + "'", double3 == (-2.942091015256665E-15d));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setStandardDeviation((double) 10L);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.27389214325950473d, 0.27389214325950473d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        normalDistributionImpl0.setMean(0.5247740780939647d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl0.cumulativeProbability(0.463391164310498d, 0.3989389075407833d);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.782792010140924E-24d + "'", double14 == 7.782792010140924E-24d);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 0, 0.012462652646205209d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.0013711354501702022d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5438030652648341d + "'", double4 == 0.5438030652648341d);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.02151428054220411d, 0.39276307230455315d);
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability(2.972322388217208E-11d);
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.25820249755352387d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.0985721653937312d, 0.25820249755352387d);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.3306690738754696E-16d) + "'", double4 == (-3.3306690738754696E-16d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.106226635438361E-16d + "'", double7 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.992007221626409E-16d) + "'", double10 == (-9.992007221626409E-16d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.897375280211193E-22d + "'", double12 == 1.897375280211193E-22d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-7.216449660063518E-16d) + "'", double15 == (-7.216449660063518E-16d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NaN, 0.003949881050253595d);
        normalDistributionImpl2.setStandardDeviation(0.004112713891356671d);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-40.982844046802896d), 0.6931381238825d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double6 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0032766542929493826d, 0.49999999999998024d);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.23921277642240243d);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.36842627353808527d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05208127941521934d + "'", double6 == 0.05208127941521934d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.003369916363094223d + "'", double9 == 0.003369916363094223d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.05331940751963321d + "'", double11 == 0.05331940751963321d);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setMean(52.0d);
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5020563944007155d + "'", double9 == 0.5020563944007155d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2959507759904494d + "'", double14 == 0.2959507759904494d);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.8511172425430698d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(1.2989609388114332E-14d);
        double double16 = normalDistributionImpl2.cumulativeProbability(3.533930913758865E-4d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.005268537016191098d, 35.0d);
        double double21 = normalDistributionImpl2.inverseCumulativeProbability(0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-266.9999995d) + "'", double14 == (-266.9999995d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.50000402809845d + "'", double16 == 0.50000402809845d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.341284693435295d + "'", double19 == 0.341284693435295d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 36.0d + "'", double21 == 36.0d);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.5020563944007155d, Double.POSITIVE_INFINITY);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.4999999999999999d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(1.6286257345981352d, 0.504091908029112d);
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
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.186529907183186E-4d, 0.039799286795740366d);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        normalDistributionImpl2.setStandardDeviation(0.15865525393145702d);
        normalDistributionImpl2.setMean(0.5769438134336734d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setMean(0.9999999999999982d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.46080199849299264d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.004982565440835918d, 0.17567111172148175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9015863634979064d + "'", double11 == 0.9015863634979064d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.045012461786327285d + "'", double14 == 0.045012461786327285d);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        normalDistributionImpl0.setStandardDeviation(0.6179114221889526d);
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.35206532676430224d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 99.7653478476549d + "'", double14 == 99.7653478476549d);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.density((java.lang.Double) 88.0180622223085d);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.039894228040143274d, 58.83350011594982d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05208127941521934d + "'", double6 == 0.05208127941521934d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.006616941033833418d + "'", double9 == 0.006616941033833418d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5323355511013016d + "'", double12 == 0.5323355511013016d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(9.000281888165388E-172d, (-5.551115123125783E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        double double17 = normalDistributionImpl0.getStandardDeviation();
        double double20 = normalDistributionImpl0.cumulativeProbability(0.012466152713401303d, 0.2430421583241883d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (-1.0f));
        double double11 = normalDistributionImpl0.cumulativeProbability(0.39891637076145464d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(4.0161707293151494E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.15865525393145702d + "'", double9 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6550225868958235d + "'", double11 == 0.6550225868958235d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-6.499993432842085d) + "'", double13 == (-6.499993432842085d));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5095890191126843d);
        normalDistributionImpl0.setStandardDeviation((double) 100.0f);
        normalDistributionImpl0.setMean(0.003859293226999287d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double14 = normalDistributionImpl0.cumulativeProbability((double) 0, 0.011398072438227633d);
        normalDistributionImpl0.setStandardDeviation(0.5000000000000052d);
        normalDistributionImpl0.setMean(0.003976677061955973d);
        normalDistributionImpl0.setMean(0.02419707245191434d);
        double double22 = normalDistributionImpl0.cumulativeProbability(0.004112807010969372d);
        double double25 = normalDistributionImpl0.cumulativeProbability(6.186529907183186E-4d, 0.004112723567028872d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0024364383453520616d + "'", double11 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.7581570254009424E-5d + "'", double14 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.48397938304535315d + "'", double22 == 0.48397938304535315d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0027852031320161896d + "'", double25 == 0.0027852031320161896d);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 0, (-1.5260952666245327d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, 0.39891637076145464d);
        double double5 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, (double) (byte) 10);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double9 = normalDistributionImpl2.cumulativeProbability(0.006616941033833418d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.inverseCumulativeProbability(42.867924615772125d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8106088131500386d + "'", double5 == 0.8106088131500386d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.533930913758865E-4d + "'", double7 == 3.533930913758865E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1939162683106727d + "'", double9 == 0.1939162683106727d);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.3457340159129554d), 6.106226635438361E-16d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.03969485302638689d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3457347718377409d) + "'", double4 == (-0.3457347718377409d));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(99.99999909265232d, 91.0d);
        normalDistributionImpl2.setMean(0.2419707245191438d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.834941009514711d, 0.5000162450984852d);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.19557940522778383d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) (-3.3306690738754696E-16d));
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.09467574302164261d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double16 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.004112807014447759d + "'", double9 == 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.004112807014447759d + "'", double11 == 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.004112805055412701d + "'", double13 == 0.004112805055412701d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.density((java.lang.Double) (-161.1434197887031d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999999857d + "'", double8 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 1.0d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.3511030636567253d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-0.6841976624611501d));
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
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        normalDistributionImpl0.setStandardDeviation(0.5000744304523199d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.49229907449655663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.39891637076145464d + "'", double4 == 0.39891637076145464d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4913922052082546d + "'", double8 == 0.4913922052082546d);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, (double) (byte) 10);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.00394989875549451d, 99.30853753729033d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5274061909494141d + "'", double5 == 0.5274061909494141d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, 0.39891637076145464d);
        normalDistributionImpl2.setStandardDeviation(0.04100846842391914d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability(160.19243385882746d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double12 = normalDistributionImpl0.cumulativeProbability(10.0d, 55.1999999998222d);
        normalDistributionImpl0.setMean(0.004112723567028872d);
        normalDistributionImpl0.setMean(2.609024107869118E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
            double double17 = normalDistributionImpl2.cumulativeProbability(0.36348329932713447d, 0.12235809905798467d);
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
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.cumulativeProbability(9.000281888165388E-172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, 0.8385529758034967d);
        double double14 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3848369645341492d, 97.4423124760719d);
        normalDistributionImpl2.setMean(0.13686927466582383d);
        normalDistributionImpl2.setStandardDeviation(0.004112805055412701d);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8511172425430698d, 0.00411206605241144d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.49702986288581713d);
        double double8 = normalDistributionImpl2.cumulativeProbability((-266.9999995d), 0.5000744304523199d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00411206605241144d + "'", double3 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.24000666364139017d + "'", double8 == 0.24000666364139017d);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (-1.0f));
        double double10 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.004112777103271985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.15865525393145702d + "'", double9 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(2.972322388217208E-11d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(9.359740967898311d, 0.011398072438227633d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05208127941521934d + "'", double6 == 0.05208127941521934d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-157.44388116860097d) + "'", double8 == (-157.44388116860097d));
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(53.905736894585544d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        normalDistributionImpl0.setMean(0.2300923061989596d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.0018084020582365135d, 100.9968985579339d);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.039528187199597005d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.37075494931537706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.39891637076145464d + "'", double3 == 0.39891637076145464d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5902872315713317d + "'", double8 == 0.5902872315713317d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2300923061989596d + "'", double9 == 0.2300923061989596d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.5260952666245327d) + "'", double11 == (-1.5260952666245327d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5559317709612265d + "'", double13 == 0.5559317709612265d);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.25536251834768864d);
        normalDistributionImpl2.setStandardDeviation(0.23921277642240243d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-23.019820521106425d) + "'", double12 == (-23.019820521106425d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23921277642240243d + "'", double15 == 0.23921277642240243d);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.27389214325950473d, 0.341284693435295d);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        normalDistributionImpl0.setStandardDeviation(0.463391164310498d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0024364383453520616d + "'", double11 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.7581570254009424E-5d + "'", double14 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1597791228150634d + "'", double16 == 0.1597791228150634d);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.011394981174247374d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.8413447460685395d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 3.155475305604421E-27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 88.0180622223085d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 0.5000000000000014d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.00294263564646465d + "'", double8 == 0.00294263564646465d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003971461090206996d + "'", double10 == 0.003971461090206996d);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        double double19 = normalDistributionImpl0.cumulativeProbability(0.002428934684568244d);
        normalDistributionImpl0.setStandardDeviation(97.34703633824485d);
        double double23 = normalDistributionImpl0.cumulativeProbability(0.025405905646918903d);
        normalDistributionImpl0.setStandardDeviation(0.039832140057822554d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.49600603870331317d + "'", double23 == 0.49600603870331317d);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.039846824608907386d, 0.4850139316775809d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.011397187830924622d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.5020563944007155d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8211239448342376d + "'", double4 == 0.8211239448342376d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4850139316775809d + "'", double5 == 0.4850139316775809d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4850139316775809d + "'", double6 == 0.4850139316775809d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.8297004166758035d + "'", double8 == 0.8297004166758035d);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.0d);
        double double14 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.inverseCumulativeProbability(0.004112805055412701d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-26.42666130238155d) + "'", double16 == (-26.42666130238155d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.36348329932713447d);
        normalDistributionImpl2.setMean(4.0161707293151494E-11d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.inverseCumulativeProbability(18.0000005d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.003391125823206404d + "'", double7 == 0.003391125823206404d);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 0.8413447460685395d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(0.0039695706906738215d, 0.298693554355323d);
        normalDistributionImpl2.setMean((-23.019820521106425d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8413447460685395d + "'", double4 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-3.3306690738754696E-15d) + "'", double7 == (-3.3306690738754696E-15d));
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-2.6643361475831204d));
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
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(2.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(0.40985459992980544d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.39276307230455315d);
        double double8 = normalDistributionImpl2.cumulativeProbability((-157.44388116860097d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.4003238434786596E-5d + "'", double6 == 4.4003238434786596E-5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        normalDistributionImpl0.setStandardDeviation(0.5072268199307045d);
        double double17 = normalDistributionImpl0.cumulativeProbability(0.9999999999999993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-26.641381163946413d) + "'", double11 == (-26.641381163946413d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9756669053305252d + "'", double17 == 0.9756669053305252d);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) 10L);
        normalDistributionImpl0.setMean(1.6286257345981352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1586552539314552d + "'", double10 == 0.1586552539314552d);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.005268537016191098d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.inverseCumulativeProbability(0.5690794135429529d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.15993344388391528d + "'", double4 == 0.15993344388391528d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999999999999857d + "'", double5 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.174030907299809d + "'", double7 == 1.174030907299809d);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(9.617656016062085d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 99.03989407290815d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.04127402674722432d + "'", double13 == 0.04127402674722432d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.39891637076145464d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.49967791011510215d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.2561529682171768d) + "'", double11 == (-1.2561529682171768d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.12958017852405082d + "'", double13 == 0.12958017852405082d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.004112723567028872d);
        double double14 = normalDistributionImpl2.density((java.lang.Double) 0.0018084020582365135d);
        normalDistributionImpl2.setStandardDeviation(0.001349898031630159d);
        double double18 = normalDistributionImpl2.inverseCumulativeProbability(0.3707549496780816d);
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011398350789919569d + "'", double12 == 0.011398350789919569d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.011398350853397575d + "'", double14 == 0.011398350853397575d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-4.452663364258869E-4d) + "'", double18 == (-4.452663364258869E-4d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 101.0000002290142d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.3517027765833526d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.26831686462225557d);
        normalDistributionImpl2.setStandardDeviation(0.5769438134336734d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-38.29480978120667d) + "'", double4 == (-38.29480978120667d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003949921231149102d + "'", double6 == 0.003949921231149102d);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setStandardDeviation(4.703838883365341E-4d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 848.1206314532849d + "'", double6 == 848.1206314532849d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.cumulativeProbability(2.7581570254009424E-5d);
        normalDistributionImpl2.setMean(0.3684295859056615d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05208137124318141d + "'", double9 == 0.05208137124318141d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.02151428054220411d, 0.39276307230455315d);
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability(52.0d);
        normalDistributionImpl2.setStandardDeviation(0.9949360047253046d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.cumulativeProbability(0.01945305528714028d, 7.67165393861376E-17d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.3306690738754696E-16d) + "'", double4 == (-3.3306690738754696E-16d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.106226635438361E-16d + "'", double7 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.397673124960754E-6d + "'", double10 == 3.397673124960754E-6d);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.39891637076145464d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.2837953360225208d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3989422804014327d + "'", double8 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3684295859056615d + "'", double10 == 0.3684295859056615d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.38319609264704513d + "'", double13 == 0.38319609264704513d);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        double double19 = normalDistributionImpl0.cumulativeProbability(0.002428934684568244d);
        normalDistributionImpl0.setStandardDeviation(97.34703633824485d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.5020563944007155d, Double.POSITIVE_INFINITY);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.4999999999999999d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) (-9.992007221626409E-16d));
        double double16 = normalDistributionImpl0.cumulativeProbability(0.5768792773921276d);
        double double18 = normalDistributionImpl0.cumulativeProbability(0.0038570217295531735d);
        normalDistributionImpl0.setMean(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = normalDistributionImpl0.inverseCumulativeProbability(98.99999977098578d);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.7632581264314935d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5005714579007384d, 0.0019606880995698406d);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 100.88014208468009d);
        normalDistributionImpl0.setMean(0.007465462625309283d);
        normalDistributionImpl0.setStandardDeviation(0.39891637076145464d);
        normalDistributionImpl0.setMean((-2.942091015256665E-15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.27083010383549005d + "'", double8 == 0.27083010383549005d);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean(100.64532182054896d);
        double double12 = normalDistributionImpl0.cumulativeProbability(100.88014208468009d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setStandardDeviation(4.703838883365341E-4d);
        normalDistributionImpl2.setStandardDeviation(0.005723383913933699d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(0.00188963667909825d, 7.782792010140924E-24d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (-1.0f));
        double double11 = normalDistributionImpl0.cumulativeProbability(0.39891637076145464d);
        double double13 = normalDistributionImpl0.cumulativeProbability(1.8656947736106488E-4d);
        double double16 = normalDistributionImpl0.cumulativeProbability((-8.145164570864665d), 0.05216434382131924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.15865525393145702d + "'", double9 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6550225868958235d + "'", double11 == 0.6550225868958235d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5000744304523199d + "'", double13 == 0.5000744304523199d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5208011281288356d + "'", double16 == 0.5208011281288356d);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        normalDistributionImpl0.setMean(0.39884996302130266d);
        double double9 = normalDistributionImpl0.cumulativeProbability((-0.9953663079612478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.38767317623584496d);
        normalDistributionImpl2.setStandardDeviation(0.5041291410139574d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 42.867561125735264d + "'", double5 == 42.867561125735264d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.38767317623584496d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.11693498857496193d);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 42.867561125735264d + "'", double5 == 42.867561125735264d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.05247175082918987d + "'", double7 == 0.05247175082918987d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        normalDistributionImpl2.setMean(0.0d);
        double double13 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(9.000281888165388E-172d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double10 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.inverseCumulativeProbability(8.347036338244843d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 100, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.1096616106907986d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.15892074841832593d + "'", double4 == 0.15892074841832593d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.3511030636567253d);
        normalDistributionImpl0.setStandardDeviation(0.5184936385071415d);
        double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.005915351705566119d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 98.69487139525737d + "'", double17 == 98.69487139525737d);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.3511030636567253d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.23921277642240243d);
        normalDistributionImpl2.setMean(0.004112713891356671d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25820249755352387d + "'", double4 == 0.25820249755352387d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.298693554355323d + "'", double6 == 0.298693554355323d);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        double double21 = normalDistributionImpl0.cumulativeProbability((double) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean(32.0d);
        double double11 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-3.3306690738754696E-16d), (-83.76480972721147d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8385529758034967d, 0.40985459992980544d);
        double double4 = normalDistributionImpl2.cumulativeProbability(6.106226635438361E-16d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.0038536028656297734d);
        double double7 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.020379329894292586d + "'", double4 == 0.020379329894292586d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12235809905798467d + "'", double6 == 0.12235809905798467d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8385529758034967d + "'", double7 == 0.8385529758034967d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.6179114221889526d);
        normalDistributionImpl2.setMean((double) 100);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.002359870124408081d, 0.38134713065470394d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.4432899320127035E-15d + "'", double13 == 1.4432899320127035E-15d);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double10 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(55.1999999998222d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.003989391072013627d, 10.100000163096063d);
        normalDistributionImpl0.setMean((-15.216116946311248d));
        double double19 = normalDistributionImpl0.cumulativeProbability(0.5057533770708286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.01666635779967479d + "'", double15 == 0.01666635779967479d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.612107631496008d + "'", double19 == 0.612107631496008d);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double14 = normalDistributionImpl0.cumulativeProbability((double) 0, 0.011398072438227633d);
        normalDistributionImpl0.setStandardDeviation(0.5000000000000052d);
        double double18 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl0.cumulativeProbability(0.9756669053305252d, 0.49034770664643224d);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.3989389075407833d, 0.5d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.007224929106763151d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.155983485151227E-4d + "'", double7 == 4.155983485151227E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5041424473119076d + "'", double9 == 0.5041424473119076d);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability(7.782792010140924E-24d, 0.004112713891356671d);
        double double12 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.inverseCumulativeProbability((-0.12378651771055364d));
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.3989422804014327d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.39276307230455315d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) (-23.019820521106425d));
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.density((java.lang.Double) 0.4997574798200302d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003859293226999287d + "'", double4 == 0.003859293226999287d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.603904923161464d + "'", double6 == 8.603904923161464d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003439130075321901d + "'", double8 == 0.003439130075321901d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0038607222095865005d + "'", double11 == 0.0038607222095865005d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.24463748165229704d, Double.NaN);
        normalDistributionImpl0.setStandardDeviation(0.50000402809845d);
        double double8 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability(0.3989422840492259d, 0.0d);
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
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011394981174247374d, 0.1096616106907986d);
        normalDistributionImpl2.setMean(99.71682230475363d);
        double double7 = normalDistributionImpl2.cumulativeProbability(1.0d, 1.0d);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.0d);
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.002429360429096111d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 99.40798733844947d + "'", double12 == 99.40798733844947d);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(42.867561125735264d, 36.0d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.50000402809845d);
        normalDistributionImpl2.setMean(0.27083010383549005d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(0.003970761836563756d, 0.002417358818369797d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 42.867924615772125d + "'", double4 == 42.867924615772125d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        double double16 = normalDistributionImpl0.cumulativeProbability(0.0d);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.0024364383453520616d);
        normalDistributionImpl0.setMean(2.7581570254009424E-5d);
        normalDistributionImpl0.setMean(10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 1);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.24197072451914337d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean(32.0d);
        normalDistributionImpl0.setStandardDeviation(0.24197072451914337d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.5095890191126843d);
        normalDistributionImpl0.setMean(0.612107631496008d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(100.00195697928612d, (-3.3306690738754696E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.density((java.lang.Double) 1.0d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.25820249755352387d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        double double16 = normalDistributionImpl0.inverseCumulativeProbability(0.3700968566970246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.919763271402783d + "'", double16 == 31.919763271402783d);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.004112723567028872d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-1.1102230246251565E-15d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003971497250408449d, 0.9999999999999857d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 100.0d);
        normalDistributionImpl0.setMean(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability((-24.91634571999382d));
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
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double9 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999999857d + "'", double8 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1096616106907986d, 0.3511030636567253d);
        normalDistributionImpl2.setStandardDeviation(0.02419707245191434d);
        normalDistributionImpl2.setMean(2.8278868567633342E-24d);
        normalDistributionImpl2.setStandardDeviation(101.0d);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.691462461274013d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.039799286795740366d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.13934966669526672d, 0.8413447460685395d);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.49229907449655663d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 31.999231689805978d + "'", double10 == 31.999231689805978d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(100.9968985579339d, 0.38852033512092876d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.6148878559046674d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.38852033512092876d + "'", double3 == 0.38852033512092876d);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.25536251834768864d, 0.9999999999999857d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.25536251834768864d + "'", double3 == 0.25536251834768864d);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5d, 99.45533075104642d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(100.9968985579339d, 4.4003238434786596E-5d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setMean(55.1999999998222d);
        normalDistributionImpl0.setMean(0.40985459992980544d);
        normalDistributionImpl0.setMean(0.004112751329122643d);
        double double12 = normalDistributionImpl0.cumulativeProbability(1.5898808682478716E-259d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.49835925423149724d + "'", double12 == 0.49835925423149724d);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(11.0d, 4.703838883365341E-4d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.8405931241353324d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.703838883365341E-4d + "'", double7 == 4.703838883365341E-4d);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1), 0.00411206605241144d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) (-23.019820521106425d));
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.05208137124318141d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0066821273606819d) + "'", double6 == (-1.0066821273606819d));
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100.0f);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011397187830924622d, 0.0033293208790807836d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0033293208790807836d + "'", double3 == 0.0033293208790807836d);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 0, 0.539827837277029d);
        normalDistributionImpl2.setMean(0.00411206605241144d);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011394981174247374d, 0.1096616106907986d);
        normalDistributionImpl2.setMean(99.71682230475363d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.003976677061955973d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.inverseCumulativeProbability(0.4562046874576832d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1096616106907986d + "'", double7 == 0.1096616106907986d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.70475952936383d + "'", double9 == 99.70475952936383d);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.8413447460685395d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 3.533930913758865E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(0.49202168628309806d, (-25.11376863225348d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9597790821736437d + "'", double6 == 0.9597790821736437d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0539057471196433d + "'", double8 == 0.0539057471196433d);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, 0.39891637076145464d);
        normalDistributionImpl2.setStandardDeviation(0.04100846842391914d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability(0.8387304421312531d, 0.011398350799319024d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.04100846842391914d + "'", double5 == 0.04100846842391914d);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.8206667139258397d, (double) ' ');
        double double7 = normalDistributionImpl2.cumulativeProbability(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setMean(0.9259408601040021d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0161707293151494E-11d + "'", double5 == 4.0161707293151494E-11d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.8413447460685395d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9597790821736437d + "'", double6 == 0.9597790821736437d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        double double20 = normalDistributionImpl0.cumulativeProbability(0.0013711354501702022d, 0.039846824608907386d);
        double double22 = normalDistributionImpl0.inverseCumulativeProbability(9.539394167099525E-23d);
        double double23 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.026109053048334d + "'", double15 == 9.026109053048334d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.621390715929835E-27d + "'", double17 == 3.621390715929835E-27d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.275957200481571E-15d + "'", double20 == 2.275957200481571E-15d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.003447496149865155d, 0.9949360047253046d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.1096616106907986d);
        double double19 = normalDistributionImpl2.cumulativeProbability((-0.1638802027473609d), 0.39891611779725694d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-2.942091015256665E-15d) + "'", double13 == (-2.942091015256665E-15d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.15865525393145702d);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.04883560073156118d, 0.38767317623584496d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.010956646484166686d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.839660072847429d) + "'", double4 == (-0.839660072847429d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.38767317623584496d + "'", double5 == 0.38767317623584496d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.38767317623584496d + "'", double6 == 0.38767317623584496d);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability((double) 100, 0.03938712228709878d);
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
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.8413447460685395d);
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.0014324330216118912d);
        normalDistributionImpl2.setMean(0.24463748165229704d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.012462652646205209d + "'", double7 == 0.012462652646205209d);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        normalDistributionImpl0.setMean(1.0d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.39891637076145464d);
        double double15 = normalDistributionImpl0.getMean();
        double double17 = normalDistributionImpl0.cumulativeProbability(0.03986973149906884d);
        normalDistributionImpl0.setStandardDeviation(3.397673124960754E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.27389214325950473d + "'", double14 == 0.27389214325950473d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.16849482818554234d + "'", double17 == 0.16849482818554234d);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.35574391306842956d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean(32.0d);
        normalDistributionImpl0.setStandardDeviation(0.24197072451914337d);
        double double13 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.04127402674722432d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.39276307230455315d);
        normalDistributionImpl0.setMean(0.35049274541515896d);
        double double9 = normalDistributionImpl0.cumulativeProbability((-15.216116946311248d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6527527593302829d + "'", double5 == 0.6527527593302829d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-3.885780586188048E-15d) + "'", double9 == (-3.885780586188048E-15d));
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setStandardDeviation((double) (byte) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((-0.25632498330402864d));
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.012466152713401303d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3988499538048309d + "'", double8 == 0.3988499538048309d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3989112828004866d + "'", double10 == 0.3989112828004866d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.3989389075407833d, 0.5d);
        normalDistributionImpl2.setMean(1.4759460734292684E-4d);
        normalDistributionImpl2.setMean(0.05372313980725889d);
        normalDistributionImpl2.setStandardDeviation(0.03938712228709878d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.155983485151227E-4d + "'", double7 == 4.155983485151227E-4d);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.7101845133435983d, 0.8297004166758035d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.24463748165229704d);
        normalDistributionImpl2.setMean(10.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.011394981174247374d);
        normalDistributionImpl2.setStandardDeviation(0.5184936385071415d);
        double double17 = normalDistributionImpl2.cumulativeProbability(0.48397938304535315d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011398072438227633d + "'", double9 == 0.011398072438227633d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.38767317623584496d + "'", double13 == 0.38767317623584496d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 7.049916206369744E-15d + "'", double17 == 7.049916206369744E-15d);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.density((java.lang.Double) (-1.8115941962627518d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003989422804014327d + "'", double6 == 0.003989422804014327d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.003988768218667045d + "'", double9 == 0.003988768218667045d);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.3511030636567253d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.23921277642240243d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.298693554355323d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25820249755352387d + "'", double4 == 0.25820249755352387d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.298693554355323d + "'", double6 == 0.298693554355323d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4718382928209965d + "'", double8 == 0.4718382928209965d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.691462461274013d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.039799286795740366d);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation(97.0d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) (-1.0d));
        double double10 = normalDistributionImpl2.density((java.lang.Double) 0.40985459992980544d);
        normalDistributionImpl2.setStandardDeviation(0.011398350795231223d);
        double double14 = normalDistributionImpl2.cumulativeProbability(42.867924615772125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.004112807014447759d + "'", double8 == 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0041123726136819555d + "'", double10 == 0.0041123726136819555d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003859293226999287d, 0.49999999999998024d);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setMean(Double.POSITIVE_INFINITY);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.cumulativeProbability(35.0d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.2300923061989596d);
        double double8 = normalDistributionImpl0.cumulativeProbability((-3.3306690738754696E-16d));
        normalDistributionImpl0.setMean((double) 1L);
        normalDistributionImpl0.setMean(0.003971497250408449d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.38852033512092876d + "'", double6 == 0.38852033512092876d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4999999999999999d + "'", double8 == 0.4999999999999999d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.3989391341973516d + "'", double14 == 0.3989391341973516d);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.38767317623584496d);
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.004982565585890275d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.30446746012271947d);
        normalDistributionImpl2.setMean(0.7615143478152635d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 42.867561125735264d + "'", double5 == 42.867561125735264d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0033301633330862675d + "'", double7 == 0.0033301633330862675d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.053102810653298804d + "'", double9 == 0.053102810653298804d);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 100.0d);
        normalDistributionImpl0.setMean(0.0d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        double double17 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl0.inverseCumulativeProbability(0.8385529758034967d);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        normalDistributionImpl2.setMean(0.8511172425430698d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) (-22.76824609551198d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.00245189214437034d + "'", double6 == 0.00245189214437034d);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation(42.867924615772125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.1096616106907986d);
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.8511172425430698d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.4562046874576832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean(0.3989389075407833d);
        normalDistributionImpl0.setMean((double) (byte) 100);
        double double17 = normalDistributionImpl0.cumulativeProbability(0.34254368759136156d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5d + "'", double17 == 0.5d);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        normalDistributionImpl0.setStandardDeviation(2.8165665442762825E-24d);
        double double12 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        double double17 = normalDistributionImpl0.density((java.lang.Double) 0.5057533770708286d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.8165665442762825E-24d + "'", double15 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        normalDistributionImpl0.setMean(0.2300923061989596d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.0018084020582365135d, 100.9968985579339d);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.039528187199597005d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.cumulativeProbability(69.14708754420747d, 3.155475305604421E-27d);
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
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', 0.5045637245140185d);
        normalDistributionImpl2.setStandardDeviation(0.004112751329122643d);
        normalDistributionImpl2.setMean(7.67165393861376E-17d);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.3989422804014327d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.39276307230455315d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) (-23.019820521106425d));
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.5041127341632511d);
        double double11 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003859293226999287d + "'", double4 == 0.003859293226999287d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.603904923161464d + "'", double6 == 8.603904923161464d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003439130075321901d + "'", double8 == 0.003439130075321901d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.99999999962154d + "'", double10 == 35.99999999962154d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.007465462625309283d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.NEGATIVE_INFINITY + "'", double7 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003989422792897176d + "'", double11 == 0.003989422792897176d);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.05208127941521934d, 2.7581570254009424E-5d);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.5247740780939647d, 18.0000005d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.005745855155042334d, 56.1999999998222d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-0.3319024716718828d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.cumulativeProbability(0.1586552539314552d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.6148878559046674d);
        double double16 = normalDistributionImpl0.density((java.lang.Double) 0.8103019879415457d);
        double double19 = normalDistributionImpl0.cumulativeProbability(0.27083010383549005d, 1.2683168646222556d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.04100846842391914d);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6534818342543749d, (double) 1);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.39893169063000056d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3862245198336976d + "'", double4 == 0.3862245198336976d);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(3.497202527569243E-15d, 0.3149149987568516d);
        normalDistributionImpl2.setStandardDeviation(0.003976677061955973d);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setStandardDeviation(10.0d);
        double double6 = normalDistributionImpl0.cumulativeProbability(0.30713001079381186d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.5438030652648341d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5122507886537644d + "'", double6 == 0.5122507886537644d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5216839156249465d + "'", double8 == 0.5216839156249465d);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.8413447460685395d);
        normalDistributionImpl0.setMean(0.011398040704957353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(0.05372313980725889d);
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.5007975396572893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0033286283517448E-18d + "'", double7 == 1.0033286283517448E-18d);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double10 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-0.1638802027473609d));
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0033301633330862675d, 0.48397938304535315d);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.691462461274013d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(7.267167198656892E-9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        normalDistributionImpl0.setStandardDeviation(2.8165665442762825E-24d);
        double double12 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(2.972322388217208E-11d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        double double16 = normalDistributionImpl0.getMean();
        double double17 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6549981199955597d + "'", double6 == 0.6549981199955597d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5013282015108043d + "'", double13 == 0.5013282015108043d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0033293208790807836d + "'", double16 == 0.0033293208790807836d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0033293208790807836d + "'", double17 == 0.0033293208790807836d);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.39893931295678914d, 0.3989422840492259d);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.49777933271089825d, 0.2300923061989596d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.02419707245191434d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.2085005561060929d + "'", double4 == 0.2085005561060929d);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
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
        double double16 = normalDistributionImpl0.cumulativeProbability(0.35049274541515896d);
        double double18 = normalDistributionImpl0.cumulativeProbability(0.006616941033833418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999999857d + "'", double8 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(Double.NaN);
        double double11 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((-7.216449660063518E-16d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 100, (double) (short) 1);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.9597790821736437d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability((-0.40553081119344797d));
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
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.02151428054220411d);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.39884996302130266d + "'", double6 == 0.39884996302130266d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.36348329932713447d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-15.216116946311248d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-24.91634571999382d) + "'", double8 == (-24.91634571999382d));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(98.52557187804089d, 0.4976017727416613d);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((-23.019820521106425d));
        double double12 = normalDistributionImpl0.cumulativeProbability((-28.79778829638325d));
        double double13 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4062051513498445d + "'", double10 == 0.4062051513498445d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.38327737736684997d + "'", double12 == 0.38327737736684997d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.004982565440835918d, 4.262705371416836E-21d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(27.666782363642714d, 96.97190978062507d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.0024364383453520616d);
        normalDistributionImpl0.setMean(5.390634484996413E-4d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double14 = normalDistributionImpl0.cumulativeProbability((double) 0, 0.011398072438227633d);
        normalDistributionImpl0.setStandardDeviation(0.5000000000000052d);
        double double18 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double20 = normalDistributionImpl0.density((java.lang.Double) 0.25536251834768864d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0024364383453520616d + "'", double11 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.7581570254009424E-5d + "'", double14 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.0024364383453520616d);
        normalDistributionImpl0.setMean(2.7581570254009424E-5d);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.7581570254009424E-5d + "'", double9 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(11.0d, 4.703838883365341E-4d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.3988974611574716d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.999879283074547d + "'", double4 == 10.999879283074547d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        normalDistributionImpl2.setMean(0.0d);
        double double13 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.02151428054220411d, 0.39276307230455315d);
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability(2.972322388217208E-11d);
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.25820249755352387d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.0985721653937312d, 0.25820249755352387d);
        double double17 = normalDistributionImpl2.cumulativeProbability(0.26383381213934287d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.3306690738754696E-16d) + "'", double4 == (-3.3306690738754696E-16d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.106226635438361E-16d + "'", double7 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.992007221626409E-16d) + "'", double10 == (-9.992007221626409E-16d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.897375280211193E-22d + "'", double12 == 1.897375280211193E-22d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-7.216449660063518E-16d) + "'", double15 == (-7.216449660063518E-16d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0547118733938987E-15d + "'", double17 == 1.0547118733938987E-15d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) '#');
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.3799365150373838d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        normalDistributionImpl0.setMean(0.8385529758034967d);
        double double13 = normalDistributionImpl0.cumulativeProbability(5.390634484996413E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4966568473177966d + "'", double13 == 0.4966568473177966d);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5095890191126843d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.0033303210636190686d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7828539196651155d + "'", double11 == 0.7828539196651155d);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.5020563944007155d, Double.POSITIVE_INFINITY);
        normalDistributionImpl0.setMean((double) 1.0f);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.9727648049862614d);
        double double16 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.33048081834283766d + "'", double15 == 0.33048081834283766d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) (-26.42666130238155d));
        double double11 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, (double) 1L);
        double double13 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.38319609264704513d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0);
        normalDistributionImpl0.setMean(0.011394981174247374d);
        double double14 = normalDistributionImpl0.cumulativeProbability(1.1949611129156012E-17d);
        double double17 = normalDistributionImpl0.cumulativeProbability((-0.2561132864414737d), 0.0033293208790807836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.49545415860167485d + "'", double14 == 0.49545415860167485d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.10224337726862165d + "'", double17 == 0.10224337726862165d);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        normalDistributionImpl2.setStandardDeviation(0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011398350868612364d + "'", double9 == 0.011398350868612364d);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, 0.39891637076145464d);
        double double5 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, (double) (byte) 10);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double9 = normalDistributionImpl2.cumulativeProbability(0.006616941033833418d);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.11693498857496193d);
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.49602705037232253d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8106088131500386d + "'", double5 == 0.8106088131500386d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.533930913758865E-4d + "'", double7 == 3.533930913758865E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1939162683106727d + "'", double9 == 0.1939162683106727d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.12378651771055364d) + "'", double11 == (-0.12378651771055364d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3471303574918726d + "'", double13 == 0.3471303574918726d);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.inverseCumulativeProbability(0.34254368759136156d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.00245189214437034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.40553081119344797d) + "'", double5 == (-0.40553081119344797d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.781624632911878E-4d + "'", double8 == 9.781624632911878E-4d);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.9949360047253046d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 6.106226635438361E-16d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((-1.2561529682171768d));
        normalDistributionImpl0.setStandardDeviation(0.0016640454911561742d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double12 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 1.0f);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.3988499538048309d);
        normalDistributionImpl0.setStandardDeviation(0.5013282015108043d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003987627967620997d + "'", double11 == 0.003987627967620997d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4976017727416613d + "'", double16 == 0.4976017727416613d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(4.703838883365341E-4d, 4.703838883365341E-4d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.9980473674631738d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.703838883365341E-4d + "'", double5 == 4.703838883365341E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.703838883365341E-4d + "'", double6 == 4.703838883365341E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-6.499993432842085d), (-2.3203661214665772E-14d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean(32.0d);
        normalDistributionImpl0.setStandardDeviation(0.24197072451914337d);
        normalDistributionImpl0.setStandardDeviation(0.011397187830924622d);
        normalDistributionImpl0.setStandardDeviation(0.007669665116947154d);
        double double18 = normalDistributionImpl0.inverseCumulativeProbability(0.426554404687355d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 31.99858005392779d + "'", double18 == 31.99858005392779d);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.39276307230455315d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.39891637076145464d, 0.8413447460685395d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.6527527593302829d);
        normalDistributionImpl0.setStandardDeviation(0.011398350795231223d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6527527593302829d + "'", double5 == 0.6527527593302829d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14489999812567278d + "'", double8 == 0.14489999812567278d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3223937625031809d + "'", double10 == 0.3223937625031809d);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        double double20 = normalDistributionImpl0.cumulativeProbability((-1.312499901071692d), 0.0d);
        double double21 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.03989407290815d + "'", double17 == 99.03989407290815d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(9.617656016062085d);
        double double12 = normalDistributionImpl0.cumulativeProbability((-0.9953663079612478d));
        double double13 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.cumulativeProbability(2.7581570254009424E-5d);
        normalDistributionImpl2.setMean(0.27574252188645465d);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05208137124318141d + "'", double9 == 0.05208137124318141d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.49835925423149724d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.8413447460685395d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability((-0.5281617071790112d), (-5.445166607068674d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9597790821736437d + "'", double6 == 0.9597790821736437d);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(31.999231689805978d, 0.5000163087590218d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        normalDistributionImpl0.setMean(Double.POSITIVE_INFINITY);
        java.lang.Class<?> wildcardClass22 = normalDistributionImpl0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1096616106907986d, 0.3511030636567253d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.6549981199955597d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1096616106907986d + "'", double3 == 0.1096616106907986d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.24969907832312999d + "'", double5 == 0.24969907832312999d);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.656004283871861d, 0.50000402809845d);
        double double5 = normalDistributionImpl2.cumulativeProbability((-29.19446450367986d), 0.501444015989837d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.37861586634525224d + "'", double5 == 0.37861586634525224d);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.6179114221889526d);
        normalDistributionImpl2.setMean(0.38767317623584496d);
        normalDistributionImpl2.setStandardDeviation(97.4423124760719d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.23921277642240243d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05208127941521934d + "'", double6 == 0.05208127941521934d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.003369916363094223d + "'", double9 == 0.003369916363094223d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) 100);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.2837953360225208d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9727648049862614d + "'", double6 == 0.9727648049862614d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.00767185267524473d + "'", double8 == 0.00767185267524473d);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double7 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability(0.24197072451914337d, (double) (short) 100);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.003989422801720462d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.49034770664643224d + "'", double10 == 0.49034770664643224d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5001591549387787d + "'", double12 == 0.5001591549387787d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 1);
        double double11 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.cumulativeProbability(0.011398350868612364d, 0.7787313192378611d);
        normalDistributionImpl0.setMean(0.3448500548141074d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.167381942818698d, (double) 100);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.15865525393145702d);
        double double11 = normalDistributionImpl0.cumulativeProbability(10.0d);
        double double12 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl0.setMean((double) 100);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.35375207302115724d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.9999999284129937d);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) Double.NEGATIVE_INFINITY);
        double double12 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.039832140057822554d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double11 = normalDistributionImpl2.density((java.lang.Double) 0.2738700294039217d);
        double double13 = normalDistributionImpl2.cumulativeProbability(100.88014208468009d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0113980019225466d + "'", double11 == 0.0113980019225466d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9980260175983502d + "'", double13 == 0.9980260175983502d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6179114221889526d, 0.11693498857496193d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6179114221889526d + "'", double3 == 0.6179114221889526d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6179114221889526d + "'", double4 == 0.6179114221889526d);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.density((java.lang.Double) 1.6286257345981352d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.density((java.lang.Double) 42.867561125735264d);
        double double9 = normalDistributionImpl2.cumulativeProbability(1.7763568394002505E-15d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.005383918863507501d + "'", double7 == 0.005383918863507501d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double10 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(55.1999999998222d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.003989391072013627d, 10.100000163096063d);
        double double17 = normalDistributionImpl0.inverseCumulativeProbability(7.230419748435191E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.01666635779967479d + "'", double15 == 0.01666635779967479d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-75.82807651747223d) + "'", double17 == (-75.82807651747223d));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.3989389075407833d, 0.5d);
        normalDistributionImpl2.setMean(0.011394981174247374d);
        normalDistributionImpl2.setMean(0.3684295859056615d);
        double double13 = normalDistributionImpl2.cumulativeProbability((double) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.155983485151227E-4d + "'", double7 == 4.155983485151227E-4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5395477934177719d + "'", double13 == 0.5395477934177719d);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.39891637076145464d);
        normalDistributionImpl0.setStandardDeviation(2.972322388217208E-11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        double double18 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.6549981199955597d);
        double double21 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((-157.44388116860097d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.NEGATIVE_INFINITY + "'", double18 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + Double.NEGATIVE_INFINITY + "'", double21 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        normalDistributionImpl0.setStandardDeviation(0.003989391072013627d);
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
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.0d, 0.1096616106907986d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.19557940522778383d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.1102230246251565E-15d), 0.00453983869274166d);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.24463748165229704d);
        normalDistributionImpl2.setMean(10.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.011394981174247374d);
        double double15 = normalDistributionImpl2.density((java.lang.Double) 0.1597791228150634d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.6931381238825d);
        normalDistributionImpl2.setStandardDeviation(0.022161439152763612d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011398072438227633d + "'", double9 == 0.011398072438227633d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.38767317623584496d + "'", double13 == 0.38767317623584496d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.010956646484166686d + "'", double15 == 0.010956646484166686d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 27.666782363642714d + "'", double17 == 27.666782363642714d);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double8 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability(0.768888254738703d, 9.041047069588415E-4d);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.13934966669526672d, 8.723175385778642d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 1);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.15892074841832593d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.045733492529693796d + "'", double6 == 0.045733492529693796d);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        normalDistributionImpl2.setStandardDeviation(0.691462461274013d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.006616941033833418d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0041128068864829635d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5769438134336734d + "'", double6 == 0.5769438134336734d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5009671871879009d + "'", double8 == 0.5009671871879009d);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) -1, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.49845245813971395d, 0.003329563061815601d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.0019606880995698406d);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.49999035942305375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 35.0d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.5045637245140185d);
        normalDistributionImpl0.setStandardDeviation(0.8206667139258397d);
        normalDistributionImpl0.setMean((-22.76824609551198d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.POSITIVE_INFINITY, 0.27389214325950473d);
        normalDistributionImpl2.setMean(0.0033293208790807836d);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.density((java.lang.Double) 9.359740967898311d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-2.652966346597469d));
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability((-25.11376863225348d), 0.38852033512092876d);
        double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.0038570217295531735d);
        double double19 = normalDistributionImpl0.density((java.lang.Double) 0.5184936385071415d);
        normalDistributionImpl0.setStandardDeviation(1.5898808682478716E-259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6511844957867805d + "'", double15 == 0.6511844957867805d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-2.6643361475831204d) + "'", double17 == (-2.6643361475831204d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.34876520096819874d + "'", double19 == 0.34876520096819874d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setStandardDeviation(0.6549981199955597d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0033293208790807836d);
        double double14 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6549981199955597d + "'", double10 == 0.6549981199955597d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.3796360778440238d), 0.6534818342543749d);
        normalDistributionImpl2.setMean(99.71682230475363d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double7 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.004112777103271985d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 99.71682230475363d + "'", double7 == 99.71682230475363d);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(2.0d, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(78.8675611267685d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-3.3306690738754696E-15d), 0.341284693435295d);
        double double3 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.3306690738754696E-15d) + "'", double3 == (-3.3306690738754696E-15d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, (double) (short) 10);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 11.0d);
        double double5 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02419707245191434d + "'", double4 == 0.02419707245191434d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        double double14 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.05208137124318141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6930673530947105d + "'", double13 == 0.6930673530947105d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(1.6286257345981352d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.6286257345981352d, 0.1369473559188812d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.3223937625031809d, 0.12958017852405082d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(11.0d, 0.003971497250408449d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.09467574302164261d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) (-8.145164570864665d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        double double19 = normalDistributionImpl2.cumulativeProbability(0.05386818329003201d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-266.9999995d) + "'", double14 == (-266.9999995d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-7.977165358279764d) + "'", double17 == (-7.977165358279764d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5006140082113839d + "'", double19 == 0.5006140082113839d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.3511030636567253d);
        double double11 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.5040019287905985d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3989422804014327d + "'", double8 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.3823439839379167d) + "'", double10 == (-0.3823439839379167d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        normalDistributionImpl2.setStandardDeviation(0.011398350795231223d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8385529758034967d, (-1.5260952666245327d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        normalDistributionImpl0.setStandardDeviation(0.035024460672673785d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003987627967620997d + "'", double11 == 0.003987627967620997d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.34044931186123606d + "'", double17 == 0.34044931186123606d);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.003447496149865155d, 101.0d);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3511030636567253d + "'", double5 == 0.3511030636567253d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.003971497250408449d);
        normalDistributionImpl0.setMean(9.222608503211344d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.39894227645996516d + "'", double15 == 0.39894227645996516d);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setMean(1.2989609388114332E-14d);
        normalDistributionImpl0.setStandardDeviation(9.041047069588415E-4d);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability(0.8410709021576761d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.030251659510436E-4d + "'", double8 == 9.030251659510436E-4d);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.5d);
        double double4 = normalDistributionImpl2.cumulativeProbability(97.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation(0.17567111172148175d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-260.7350958165562d), (-0.2561132864414737d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 0.003971497250408449d);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 0L, 0.13212396732606452d);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        normalDistributionImpl2.setMean((-40.982844046802896d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7302208489873937d + "'", double5 == 0.7302208489873937d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.3511030636567253d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.0033293208790807836d);
        double double9 = normalDistributionImpl2.cumulativeProbability((-1.0d), 0.003976677061955973d);
        normalDistributionImpl2.setMean(10.100000163096063d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.002428934684568244d, 0.004112713891356671d);
        double double15 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25820249755352387d + "'", double4 == 0.25820249755352387d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7134509881791207d) + "'", double6 == (-1.7134509881791207d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.13686927466582383d + "'", double9 == 0.13686927466582383d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.1102230246251565E-16d) + "'", double14 == (-1.1102230246251565E-16d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.100000163096063d + "'", double15 == 10.100000163096063d);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
        double double21 = normalDistributionImpl0.cumulativeProbability(4.4003238434786596E-5d, 0.16849482818554234d);
        double double23 = normalDistributionImpl0.density((java.lang.Double) 8.723175385641783d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0024364383453520616d + "'", double11 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.7581570254009424E-5d + "'", double14 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.8656947736106488E-4d + "'", double18 == 1.8656947736106488E-4d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.0794516497594246E-4d + "'", double21 == 4.0794516497594246E-4d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.002630236126780588d + "'", double23 == 0.002630236126780588d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.15892074841832593d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.039889190554138386d + "'", double8 == 0.039889190554138386d);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(7.230419748435191E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.inverseCumulativeProbability((-0.07608250205524576d));
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-218.52912411964806d) + "'", double14 == (-218.52912411964806d));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((-23.019820521106425d));
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4062051513498445d + "'", double10 == 0.4062051513498445d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.005723383913933699d, 0.3989421119478429d);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.1586552539314552d, 0.7130685382849511d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.31262250466252706d + "'", double5 == 0.31262250466252706d);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(88.0180622223085d);
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        normalDistributionImpl0.setStandardDeviation(0.6179114221889526d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0013711354501702022d, 0.24197072451914683d);
        double double3 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.49999999999998457d);
        double double8 = normalDistributionImpl2.cumulativeProbability(1.4432899320127035E-15d, 35.99999999962154d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0013711354501702022d + "'", double3 == 0.0013711354501702022d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9806030178703576d + "'", double8 == 0.9806030178703576d);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.1096616106907986d);
        normalDistributionImpl0.setStandardDeviation(0.8413447460685395d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.03626707353288911d, 9.041047069588415E-4d);
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
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.020379329894292586d, 0.6179114221889526d);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.density((java.lang.Double) (-0.25632498330402864d));
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.cumulativeProbability((double) ' ', 0.49999999999998457d);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        normalDistributionImpl2.setMean(0.02151428054220411d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) (-1.1102230246251565E-16d));
        normalDistributionImpl2.setStandardDeviation(0.8206667139258397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003989422711686265d + "'", double10 == 0.003989422711686265d);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.04100846842391914d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.011397187830924622d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-0.016813778839715805d));
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
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, 0.3989422804014327d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.00411206605241144d);
        double double10 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.4850139316775809d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.cumulativeProbability(8.326672684688674E-16d, (-1.2561529682171768d));
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        double double17 = normalDistributionImpl0.cumulativeProbability(0.02151428054220411d, (double) 100);
        double double18 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.005268537016191098d);
        java.lang.Class<?> wildcardClass21 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999999857d + "'", double12 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999999999999857d + "'", double13 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0000000000000073d + "'", double17 == 1.0000000000000073d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.24197072451914683d);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.387432573590388d + "'", double6 == 0.387432573590388d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.cumulativeProbability((-3.241851231905457E-14d));
        normalDistributionImpl2.setMean(0.0d);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.0021142574024273783d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5041127341632511d + "'", double7 == 0.5041127341632511d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5000086955326744d + "'", double11 == 0.5000086955326744d);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.50000402809845d);
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.4850139316775809d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.00453983869274166d, 88.0180622223085d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3988974611574716d + "'", double7 == 0.3988974611574716d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.689863752939426d + "'", double10 == 0.689863752939426d);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setStandardDeviation(0.9999999999999857d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999999857d + "'", double12 == 0.9999999999999857d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability(7.782792010140924E-24d, 0.004112713891356671d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.49202168628309806d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.3915115379838461d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.1096616106907986d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.0038536028656297734d);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double14 = normalDistributionImpl0.cumulativeProbability((-1.2561529682171768d));
        double double16 = normalDistributionImpl0.cumulativeProbability((-3.3869331096402027d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        double double19 = normalDistributionImpl0.density((java.lang.Double) (-24.82893083470349d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.782792010140924E-24d + "'", double14 == 7.782792010140924E-24d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.881784197001252E-16d + "'", double17 == 8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.81377356523935E-36d + "'", double19 == 5.81377356523935E-36d);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.4774954927042859E-22d, 18.0000005d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.002428934684568244d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-50.69359027723287d) + "'", double4 == (-50.69359027723287d));
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.03978788906002062d, 0.5768792773921276d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.46649363228968105d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4774954927042859E-22d + "'", double4 == 1.4774954927042859E-22d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.5543122344752192E-15d + "'", double7 == 1.5543122344752192E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.32044542653648E-22d + "'", double9 == 2.32044542653648E-22d);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.539827837277029d);
        double double8 = normalDistributionImpl2.cumulativeProbability((-1.312499901071692d), 0.5009719973078852d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.inverseCumulativeProbability(97.36150278271104d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3651715500477512d, 0.5331888748664452d);
        double double4 = normalDistributionImpl2.cumulativeProbability(31.919763271402783d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.007507297482889052d, 9.030251659510436E-4d);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-157.44388116860097d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003987627967620997d + "'", double11 == 0.003987627967620997d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(9.041047069588415E-4d, 0.39893931295678914d);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NaN, 0.003949881050253595d);
        double double5 = normalDistributionImpl2.cumulativeProbability(2.8165665442762825E-24d, 2.8165665442762825E-24d);
        normalDistributionImpl2.setStandardDeviation(0.5072268199307045d);
        normalDistributionImpl2.setMean(8.603904923161464d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability(9.64480942297585d, 0.5009719973078852d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        double double19 = normalDistributionImpl0.density((java.lang.Double) 0.034003325810914586d);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.3982086741019066d + "'", double19 == 0.3982086741019066d);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(2.8165665442762825E-24d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.4999999999999999d, 0.03843717673575105d);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 91.0d + "'", double10 == 91.0d);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) (-3.3306690738754696E-16d));
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0044318484119380075d, 0.5071410812221328d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.004112807014447759d + "'", double9 == 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.004112807014447759d + "'", double11 == 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.002067536556647376d + "'", double14 == 0.002067536556647376d);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-2.6172672787634723d));
        normalDistributionImpl0.setMean(0.011398350789919569d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003987627967620997d + "'", double11 == 0.003987627967620997d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, 0.03969485302638689d);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        normalDistributionImpl0.setMean(7.230419748435191E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.cumulativeProbability(100.96481902940684d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 31.9929198068016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.1903871789614265E-223d + "'", double8 == 2.1903871789614265E-223d);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.5d);
        double double4 = normalDistributionImpl2.cumulativeProbability(97.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) 10);
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.2837953360225208d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
        double double19 = normalDistributionImpl0.cumulativeProbability(3.621390715929835E-27d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.49817003689787187d + "'", double19 == 0.49817003689787187d);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
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
        double double22 = normalDistributionImpl2.density((java.lang.Double) 0.8103019879415457d);
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.011395296569593559d + "'", double22 == 0.011395296569593559d);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
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
        double double20 = normalDistributionImpl0.getMean();
        double double22 = normalDistributionImpl0.density((java.lang.Double) 0.612107631496008d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 0.003971497250408449d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0024364383453520616d + "'", double3 == 0.0024364383453520616d);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability((double) (byte) 0);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(1.8656947736106488E-4d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.15865525393145702d);
        normalDistributionImpl0.setStandardDeviation(0.30855485436716207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.NEGATIVE_INFINITY + "'", double9 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.26480951088062704d, 36.0d);
        normalDistributionImpl2.setMean(35.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4562046874576832d, 0.8106088131500386d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.3149149987568516d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4308145720794943d + "'", double4 == 0.4308145720794943d);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.24463748165229704d, Double.NaN);
        normalDistributionImpl0.setStandardDeviation(0.50000402809845d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.24463748165229704d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.011398350853397575d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.053102810653298804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.3457340159129554d) + "'", double9 == (-0.3457340159129554d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7976708387255201d + "'", double11 == 0.7976708387255201d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5422900550736289d + "'", double13 == 0.5422900550736289d);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(Double.POSITIVE_INFINITY);
        double double8 = normalDistributionImpl2.cumulativeProbability(10.0d);
        normalDistributionImpl2.setMean(0.005915351705566119d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.09467574302164261d + "'", double8 == 0.09467574302164261d);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.007465462625309283d, 0.5072268199307045d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5072268199307045d + "'", double3 == 0.5072268199307045d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(2.1903871789614265E-223d, 9.807518179365436d);
    }
}

