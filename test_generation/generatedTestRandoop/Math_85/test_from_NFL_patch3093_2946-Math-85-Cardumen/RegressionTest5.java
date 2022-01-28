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
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 0.8413447460685395d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(4.155983485151227E-4d, 0.6550225868958235d);
        normalDistributionImpl2.setMean(3.2850427658138308E-24d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8413447460685395d + "'", double4 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7763568394002505E-15d + "'", double8 == 1.7763568394002505E-15d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5690794135429529d, 0.8385529758034967d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999999999999982d, 1.0000000000000073d);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.15865525393145702d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.25536251834768864d, 1.4774954927042859E-22d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.691462461274013d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.density((java.lang.Double) 8.519001487952361E-24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.25536251834768864d + "'", double5 == 0.25536251834768864d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(4.703838883365341E-4d, 4.703838883365341E-4d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.703838883365341E-4d + "'", double5 == 4.703838883365341E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.703838883365341E-4d + "'", double6 == 4.703838883365341E-4d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.0014324330216118912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.1102230246251565E-16d) + "'", double13 == (-1.1102230246251565E-16d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 67.97913638109047d + "'", double17 == 67.97913638109047d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.cumulativeProbability(2.7581570254009424E-5d);
        double double11 = normalDistributionImpl2.density((java.lang.Double) (-26.42666130238155d));
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.4777305744093183d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05208137124318141d + "'", double9 == 0.05208137124318141d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.186529907183186E-4d + "'", double11 == 6.186529907183186E-4d);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setStandardDeviation(91.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01666635779967479d, 0.5071410812221328d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.25820249755352387d);
        normalDistributionImpl0.setStandardDeviation(0.23921277642240243d);
        double double18 = normalDistributionImpl0.inverseCumulativeProbability(0.3885026417343065d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003987627967620997d + "'", double11 == 0.003987627967620997d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.19045174515364183d + "'", double18 == 0.19045174515364183d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        double double16 = normalDistributionImpl0.cumulativeProbability(0.46080199849299264d);
        normalDistributionImpl0.setStandardDeviation(0.022163459275164162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999999999999983d, (-0.5054425098724011d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(2.0d, 91.0d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, (double) (byte) 10);
        double double5 = normalDistributionImpl2.cumulativeProbability((-2.242558404238784d), 0.9999821313291566d);
        double double7 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1276987863971613d + "'", double5 == 0.1276987863971613d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.NEGATIVE_INFINITY + "'", double7 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.691462461274013d + "'", double8 == 0.691462461274013d);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.8511172425430698d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 2.8165665442762825E-24d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 35.0d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(31.9929198068016d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((-1.1102230246251565E-15d));
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.8511172425430698d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.04123693179952d + "'", double13 == 101.04123693179952d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.13212396732606452d, (-2.942091015256665E-15d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(3.621390715929835E-27d, 0.001377074466333561d);
        normalDistributionImpl2.setStandardDeviation(99.30853753729033d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.612107631496008d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003987627967620997d + "'", double11 == 0.003987627967620997d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.16014090820204835d + "'", double15 == 0.16014090820204835d);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0L, 0.5039893563146316d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(70.1316726671765d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.39276307230455315d);
        double double14 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.27212473236588863d) + "'", double13 == (-0.27212473236588863d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 0.24463748165229704d);
        normalDistributionImpl2.setStandardDeviation(0.5323355511013016d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.1096616106907986d);
        double double7 = normalDistributionImpl2.cumulativeProbability(1.0793856131536207E-20d);
        normalDistributionImpl2.setMean((-1.3100631690576847E-14d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5045637245140185d + "'", double5 == 0.5045637245140185d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5041127341632512d + "'", double7 == 0.5041127341632512d);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', 97.0d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.004112713891356671d);
        normalDistributionImpl2.setStandardDeviation(96.65780841917969d);
        normalDistributionImpl2.setStandardDeviation(0.2300923061989596d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.37075494931537706d + "'", double5 == 0.37075494931537706d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 0.003971497250408449d);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 0L, 0.13212396732606452d);
        double double6 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7302208489873937d + "'", double5 == 0.7302208489873937d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0024364383453520616d + "'", double6 == 0.0024364383453520616d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((-29.19446450367986d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.4687259604030156d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003987627967620997d + "'", double11 == 0.003987627967620997d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.15979209162122815d + "'", double13 == 0.15979209162122815d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        normalDistributionImpl0.setStandardDeviation(11.0d);
        double double7 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.007669665116947154d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.3306690738754696E-16d) + "'", double4 == (-3.3306690738754696E-16d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 72.75733169691365d + "'", double6 == 72.75733169691365d);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setStandardDeviation(0.9999999999999857d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(35.99999999962154d);
        normalDistributionImpl0.setStandardDeviation(0.011398350813317663d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999999857d + "'", double12 == 0.9999999999999857d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(3.155475305604421E-27d, 1.897375280211193E-22d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(1.4203249534089945E-25d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.155475305604421E-27d + "'", double3 == 3.155475305604421E-27d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double7 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        double double15 = normalDistributionImpl0.cumulativeProbability(0.039889190554138386d, 99.71682230475363d);
        normalDistributionImpl0.setMean(97.47124441052901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.38852031274078025d + "'", double15 == 0.38852031274078025d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        normalDistributionImpl2.setMean(0.0d);
        double double13 = normalDistributionImpl2.getMean();
        double double14 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.cumulativeProbability((double) 1.0f, 0.1586552539314552d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-266.9999995d), 0.44476622630561513d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.39891611779725694d);
        normalDistributionImpl2.setMean(0.8413447460685395d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(1.0547118733938987E-15d, (-25.11376863225348d));
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
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.26831686462225557d, 0.001349898031630159d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(54.943905406602084d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
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
            double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.8387304421312531d);
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
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.8413447460685395d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.011452691720483021d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        normalDistributionImpl0.setMean((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-108.65624978119396d));
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
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.8511172425430698d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 2.8165665442762825E-24d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 35.0d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.3988499631105d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        normalDistributionImpl2.setStandardDeviation(0.003971497250408449d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.26831686462225557d + "'", double5 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.05372313980725889d + "'", double7 == 0.05372313980725889d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.39893931295678914d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7763568394002505E-15d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.007226029381657778d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.05208127941521934d, 99.99999909703612d);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.11693498857496193d, (-0.25632498330402864d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.50000402809845d);
        normalDistributionImpl0.setMean(0.5009719973078852d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-266.9999995d));
        double double12 = normalDistributionImpl0.density((java.lang.Double) 93.11907455240363d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        normalDistributionImpl2.setStandardDeviation(1.6653345369377348E-16d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(78.8675611267685d, (-7.977165358279764d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 35.0d);
        double double17 = normalDistributionImpl0.density((java.lang.Double) 1.897375280211193E-22d);
        double double19 = normalDistributionImpl0.cumulativeProbability(69.14708754420747d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = normalDistributionImpl0.cumulativeProbability(0.24197072451914556d, 0.039837239966761334d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.1096616106907986d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.0038536028656297734d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(9.359740967898311d, (-5.445166607068674d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        normalDistributionImpl0.setMean((double) (short) 10);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.298693554355323d);
        normalDistributionImpl0.setMean(0.49987215670055946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.6653345369377348E-16d + "'", double15 == 1.6653345369377348E-16d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((-1.2561529682171768d));
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.inverseCumulativeProbability(0.00394988272520803d);
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
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
        normalDistributionImpl0.setStandardDeviation(0.004982565585890275d);
        double double19 = normalDistributionImpl0.getMean();
        double double20 = normalDistributionImpl0.getMean();
        double double21 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.004982565585890275d + "'", double21 == 0.004982565585890275d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setStandardDeviation(0.6549981199955597d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.3848369645341492d, 3.533930913758865E-4d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6549981199955597d + "'", double10 == 0.6549981199955597d);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.3511030636567253d);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.5006140082113839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3989422804014327d + "'", double8 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.3823439839379167d) + "'", double10 == (-0.3823439839379167d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6916785990827132d + "'", double12 == 0.6916785990827132d);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.656004283871861d, 0.8227616423487579d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 31.999231689805978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.25820249755352387d, 0.15961290136753353d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.003439130075321901d);
        double double11 = normalDistributionImpl0.cumulativeProbability(3.497202527569243E-15d);
        double double12 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-2.702681590440559d) + "'", double9 == (-2.702681590440559d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5000000000000014d + "'", double11 == 0.5000000000000014d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011394981174247374d, 0.1096616106907986d);
        normalDistributionImpl2.setMean(99.71682230475363d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.003976677061955973d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1096616106907986d + "'", double7 == 0.1096616106907986d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.NEGATIVE_INFINITY + "'", double9 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        double double18 = normalDistributionImpl0.cumulativeProbability(0.035024460672673785d);
        double double21 = normalDistributionImpl0.cumulativeProbability((-43.77648420718779d), 0.34340215960618364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.1513720156799293d + "'", double18 == 0.1513720156799293d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08297967796440348d + "'", double21 == 0.08297967796440348d);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.539827837277029d);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) (-1L));
        normalDistributionImpl2.setMean(0.39891637076145464d);
        double double10 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.inverseCumulativeProbability((-23.019820521106425d));
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.39891637076145464d + "'", double10 == 0.39891637076145464d);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(0.07708266654516854d, 0.49997707735442853d);
        double double9 = normalDistributionImpl2.inverseCumulativeProbability(0.9806030178703576d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26831686462225557d + "'", double4 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35574391306842956d + "'", double7 == 0.35574391306842956d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.2683168646222556d + "'", double9 == 1.2683168646222556d);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.cumulativeProbability(0.0027737855665379008d, 0.005383918863507501d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0010412835720897684d + "'", double7 == 0.0010412835720897684d);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.cumulativeProbability(100.0d);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.003987627967620997d, 0.6179114221889526d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.inverseCumulativeProbability((-0.6914624627096684d));
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
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) -1, 55.1999999998222d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.8405931241353324d);
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0025136092583758485d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 55.1999999998222d + "'", double3 == 55.1999999998222d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8405931241353324d + "'", double6 == 0.8405931241353324d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.49394325166300607d + "'", double8 == 0.49394325166300607d);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8468032419723991d, 9.64480942297585d);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean(32.0d);
        normalDistributionImpl0.setStandardDeviation(0.24197072451914337d);
        normalDistributionImpl0.setStandardDeviation(0.011397187830924622d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.011397187830924622d + "'", double15 == 0.011397187830924622d);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, 0.3989422804014327d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.0d);
        normalDistributionImpl2.setMean(2.8278868567633342E-24d);
        double double13 = normalDistributionImpl2.density((java.lang.Double) 0.9999999999999982d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.007507297482889052d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26831686462225557d + "'", double4 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.43147049479370425d + "'", double7 == 0.43147049479370425d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0014324330216118912d + "'", double13 == 0.0014324330216118912d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5111606389866273d + "'", double15 == 0.5111606389866273d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1096616106907986d, 0.3511030636567253d);
        normalDistributionImpl2.setStandardDeviation(0.02419707245191434d);
        normalDistributionImpl2.setMean(2.8278868567633342E-24d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02419707245191434d + "'", double7 == 0.02419707245191434d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setMean(100.0d);
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.38134713065470394d);
        double double10 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.49845245813971395d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.002428934684568244d + "'", double9 == 0.002428934684568244d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0024317682354228947d + "'", double12 == 0.0024317682354228947d);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 101.0000002290142d);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.26831686462225557d, 0.5009719973078852d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.38767317623584496d);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.007669665116947154d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8385529758034967d + "'", double4 == 0.8385529758034967d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.189674862301045E-4d + "'", double7 == 9.189674862301045E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.003949913404973262d + "'", double9 == 0.003949913404973262d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.49940361868774236d + "'", double11 == 0.49940361868774236d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.3989422804014327d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.39276307230455315d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) (-23.019820521106425d));
        double double9 = normalDistributionImpl2.getMean();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003859293226999287d + "'", double4 == 0.003859293226999287d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.603904923161464d + "'", double6 == 8.603904923161464d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003439130075321901d + "'", double8 == 0.003439130075321901d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.2906118579297512E-137d, 0.045012461786327285d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        normalDistributionImpl0.setMean(3.272960077837867E-21d);
        normalDistributionImpl0.setStandardDeviation(0.5295573167386503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.039528187199597005d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.03989391637217564d + "'", double9 == 0.03989391637217564d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.50000402809845d);
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.4850139316775809d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.9015863634979064d);
        double double10 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3988974611574716d + "'", double7 == 0.3988974611574716d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.656004283871861d + "'", double9 == 0.656004283871861d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.50000402809845d + "'", double10 == 0.50000402809845d);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        normalDistributionImpl2.setStandardDeviation(0.011398343468162608d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011394981174247374d, 0.1096616106907986d);
        normalDistributionImpl2.setMean(99.71682230475363d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.05247175082918987d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5244398111854908d, 1.4774954927042859E-22d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.04088732234835524d, 0.49986471365568913d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1586552539314552d, 1.7143132971519925E-6d);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NaN, (double) 1.0f);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.04883560073156118d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.13212396732606452d);
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability(0.37861586634525224d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5331888748664452d + "'", double7 == 0.5331888748664452d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.04883560073156118d + "'", double8 == 0.04883560073156118d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6292170001316091d + "'", double10 == 0.6292170001316091d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0038570217295531735d, 0.03989391637217564d);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setMean(Double.POSITIVE_INFINITY);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        normalDistributionImpl0.setStandardDeviation(0.3989389075407833d);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.49229907449655663d, 0.04127402674722432d);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0);
        normalDistributionImpl0.setStandardDeviation(0.17278422051147885d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.17278422051147885d + "'", double13 == 0.17278422051147885d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        normalDistributionImpl0.setMean(0.2300923061989596d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.0018084020582365135d, 100.9968985579339d);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.039528187199597005d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.cumulativeProbability(0.3989421119478429d, 7.782792010140924E-24d);
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
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.50000402809845d);
        normalDistributionImpl0.setMean(0.5009719973078852d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.04100846817829612d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-40.982844046802896d), 0.6931381238825d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.004174161551541489d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.005268537016191098d, 100.96481902940684d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, 0.341284693435295d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) -1, 55.1999999998222d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.8405931241353324d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 55.1999999998222d + "'", double3 == 55.1999999998222d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.49392508736784974d + "'", double7 == 0.49392508736784974d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(848.1206314532849d, 0.004089417306525428d);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        normalDistributionImpl2.setStandardDeviation(9.000281888165388E-172d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011398350789919569d + "'", double12 == 0.011398350789919569d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.011398350853397575d + "'", double14 == 0.011398350853397575d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-4.452663364258869E-4d) + "'", double18 == (-4.452663364258869E-4d));
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.cumulativeProbability(0.3684295859056615d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.007507297482889052d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.cumulativeProbability(35.0d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getStandardDeviation();
        double double16 = normalDistributionImpl0.density((java.lang.Double) (-4.596323321948148E-14d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(35.99999999962154d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 1);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 9.189674862301045E-4d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) (-266.9999995d));
        double double16 = normalDistributionImpl0.cumulativeProbability((-2.652966346597469d));
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        java.lang.Class<?> wildcardClass20 = normalDistributionImpl0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        normalDistributionImpl0.setStandardDeviation(0.30713001079381186d);
        double double17 = normalDistributionImpl0.cumulativeProbability((-1.5210055437364645E-14d));
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl0.cumulativeProbability(0.39276307230455315d, 0.00188963667909825d);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.49999999999998024d + "'", double17 == 0.49999999999998024d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setStandardDeviation(101.0d);
        double double10 = normalDistributionImpl0.cumulativeProbability((-23.019820521106425d));
        double double11 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.40985459992980544d + "'", double10 == 0.40985459992980544d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.3989422804014327d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.39276307230455315d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) (-23.019820521106425d));
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.density((java.lang.Double) 0.4997574798200302d);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        double double14 = normalDistributionImpl2.density((java.lang.Double) 4.868248769440697E-6d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003859293226999287d + "'", double4 == 0.003859293226999287d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.603904923161464d + "'", double6 == 8.603904923161464d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003439130075321901d + "'", double8 == 0.003439130075321901d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0038607222095865005d + "'", double11 == 0.0038607222095865005d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0038536029354151245d + "'", double14 == 0.0038536029354151245d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.49034770664643224d);
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.24463748165229704d);
        normalDistributionImpl0.setStandardDeviation(0.07708266654516854d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.002431572128965361d + "'", double12 == 0.002431572128965361d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.85375387259873d + "'", double14 == 30.85375387259873d);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.05208127941521934d, 2.7581570254009424E-5d);
        normalDistributionImpl2.setMean(0.2300923061989596d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.3223937625031809d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.7581570254009424E-5d + "'", double7 == 2.7581570254009424E-5d);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(4.703838883365341E-4d, 4.703838883365341E-4d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.49999999999998457d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.3989422804012685d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.1102230246251565E-16d);
        double double11 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 514.4111661113775d + "'", double10 == 514.4111661113775d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.703838883365341E-4d + "'", double11 == 4.703838883365341E-4d);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.691462461274013d);
        normalDistributionImpl2.setStandardDeviation(0.15993344388391528d);
        double double9 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003447496149865155d + "'", double6 == 0.003447496149865155d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-81.9999995d), 0.35574391306842956d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.003989391072013627d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.1809444580274137d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 0.8413447460685395d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.46080199849299264d);
        normalDistributionImpl2.setStandardDeviation(0.4062051513498445d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.917200250088689d + "'", double4 == 9.917200250088689d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.03989422627407296d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.33901596247314525d, 1.897375280211193E-22d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.5184936385071415d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        normalDistributionImpl0.setMean(0.0d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.9727648049862614d);
        normalDistributionImpl0.setStandardDeviation(0.035024460672673785d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability(101.0000002290142d);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5000037795359233d, 54.695998068151596d);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, 0.00411206605241144d);
        normalDistributionImpl0.setStandardDeviation(0.0018084020582365135d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.4913922052082546d);
        normalDistributionImpl0.setMean(0.5000744304523199d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setStandardDeviation(101.0d);
        double double10 = normalDistributionImpl0.cumulativeProbability((-23.019820521106425d));
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.24197072451914337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.40985459992980544d + "'", double10 == 0.40985459992980544d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation(97.0d);
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.cumulativeProbability(0.5009719973078852d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5061729618128646d + "'", double9 == 0.5061729618128646d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.8413447460685395d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.004112805055412701d);
        normalDistributionImpl0.setStandardDeviation(0.15993344388391528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 35.0d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.35206532676430224d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 31.791216817920393d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl0.inverseCumulativeProbability((-1.4777305744093183d));
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.POSITIVE_INFINITY + "'", double18 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation(102.8822897425016d);
        normalDistributionImpl2.setMean(5.514051569672565E-73d);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.27389214325950473d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-61.84086009316348d) + "'", double10 == (-61.84086009316348d));
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(0.5000037795359233d, 5.390634484996413E-4d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.0d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.5005714579007384d);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.004112752250576381d + "'", double8 == 0.004112752250576381d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.NEGATIVE_INFINITY + "'", double10 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(42.867561125735264d, 36.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.011398350799319024d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        normalDistributionImpl2.setMean(0.571107425038754d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11693498857496193d + "'", double4 == 0.11693498857496193d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 36.0d + "'", double9 == 36.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 36.0d + "'", double10 == 36.0d);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.039846824608907386d, 0.5045637245140185d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.5157653595311964d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-26.42666130238155d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8272178032210007d + "'", double4 == 0.8272178032210007d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.0000000000000073d, 8.603904923161464d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.603904923161464d + "'", double3 == 8.603904923161464d);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.6549981199955597d);
        normalDistributionImpl2.setMean(9.026109053048334d);
        normalDistributionImpl2.setMean(97.36150278271104d);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6549981199955597d + "'", double12 == 0.6549981199955597d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setStandardDeviation((double) 10L);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(2.8165665442762825E-24d);
        double double12 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 18.0000005d + "'", double11 == 18.0000005d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        normalDistributionImpl2.setMean(0.8511172425430698d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.36348329932713447d);
        double double7 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.039846824608907386d + "'", double6 == 0.039846824608907386d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8511172425430698d + "'", double7 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.8206667139258397d, (double) ' ');
        double double7 = normalDistributionImpl2.cumulativeProbability(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation(0.03938712228709878d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0161707293151494E-11d + "'", double5 == 4.0161707293151494E-11d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.6527527593302829d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.6549981199955597d);
        normalDistributionImpl2.setMean(9.026109053048334d);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.6179114221889526d);
        normalDistributionImpl2.setMean((-3.241851231905457E-14d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 9.222608503211344d + "'", double11 == 9.222608503211344d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003391125823206404d, (double) 10L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5095890191126843d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.3799365150373838d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 0.19045174515364183d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.24377533629588963d + "'", double4 == 0.24377533629588963d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003391125823206404d + "'", double6 == 0.003391125823206404d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.0530841394224146d) + "'", double8 == (-3.0530841394224146d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03988724882132699d + "'", double10 == 0.03988724882132699d);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5000000000000052d + "'", double12 == 0.5000000000000052d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
        double double13 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.2738700294039217d, 99.99999909265232d);
        normalDistributionImpl0.setStandardDeviation((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.0d, 0.24463748165229704d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        double double16 = normalDistributionImpl0.cumulativeProbability(0.9999519056761452d, 102.8822897425016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.1102230246251565E-16d) + "'", double13 == (-1.1102230246251565E-16d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6177921716464413d + "'", double16 == 0.6177921716464413d);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(1.7143132971519925E-6d);
        normalDistributionImpl0.setMean(0.4062051513498445d);
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.0010115069907344898d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.density((java.lang.Double) 7.782792010140924E-24d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.5157653595311964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3989422804014327d + "'", double13 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.0d + "'", double15 == 2.0d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.cumulativeProbability(6.186529907183186E-4d, 8.723175385778642d);
        double double10 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(51.97416448455644d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setMean(100.64532182054896d);
        normalDistributionImpl0.setStandardDeviation(0.7130685382849511d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4774954927042859E-22d + "'", double4 == 1.4774954927042859E-22d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.0d, 0.1096616106907986d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.02151428054220411d);
        normalDistributionImpl2.setMean(99.99999909265232d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 56.1999999998222d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.43147049479370425d);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability(0.003859293226999287d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.36348329932713447d + "'", double6 == 0.36348329932713447d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.664138109742823d) + "'", double8 == (-2.664138109742823d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1939162683106727d, 0.23921277642240243d);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double10 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.6527527593302829d);
        normalDistributionImpl0.setMean(0.49392508736784974d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setMean(Double.POSITIVE_INFINITY);
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.0000000000000073d, 8.603904923161464d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.4173336454418454d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.7958018992949997d) + "'", double4 == (-0.7958018992949997d));
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.47337428360028555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.6148878559046674d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0034342841464280022d + "'", double8 == 0.0034342841464280022d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 18.0000005d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.011398350789919569d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.5072268199307045d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-40.982844046802896d) + "'", double4 == (-40.982844046802896d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.022154661472147886d + "'", double7 == 0.022154661472147886d);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(42.867561125735264d, (-81.9999995d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        double double18 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003987627967620997d + "'", double11 == 0.003987627967620997d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.34044931186123606d + "'", double17 == 0.34044931186123606d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4381863462467048d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.cumulativeProbability(0.5d);
        double double10 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.45348201731096344d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5020563944007155d + "'", double9 == 0.5020563944007155d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(4.703838883365341E-4d, 4.703838883365341E-4d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.0977872677871649d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.383453212637637E-4d) + "'", double6 == (-1.383453212637637E-4d));
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999999999912207d, (-3.3306690738754696E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        normalDistributionImpl0.setMean(0.0033293208790807836d);
        normalDistributionImpl0.setMean(100.9968985579339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 92.00000215d + "'", double15 == 92.00000215d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.0000000000000073d, 0.43147049479370425d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.43147049479370425d + "'", double3 == 0.43147049479370425d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1096616106907986d, 0.3511030636567253d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(9.444556359996114E-5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.201156325652825d) + "'", double4 == (-1.201156325652825d));
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.39891637076145464d, 0.00411206605241144d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.07708266654516854d);
        normalDistributionImpl2.setStandardDeviation(0.2085005561060929d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3930568015437984d + "'", double4 == 0.3930568015437984d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.005915351705566119d);
        normalDistributionImpl0.setStandardDeviation(10.100000163096063d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.7615143478152635d);
        double double9 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3989422804014327d + "'", double2 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03938712228709878d + "'", double8 == 0.03938712228709878d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.011394981174247374d, (double) 10.0f);
        double double11 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.04100846842391914d + "'", double10 == 0.04100846842391914d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4999999999999999d, 7.230419748435191E-4d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.00453983869274166d);
        normalDistributionImpl2.setStandardDeviation(0.6179114221889526d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.004112723567028872d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        double double14 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011398350789919569d + "'", double12 == 0.011398350789919569d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 1);
        double double11 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.cumulativeProbability(0.011398350868612364d, 0.7787313192378611d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.inverseCumulativeProbability((-81.9999995d));
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 9.617656016062085d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.272960077837867E-21d + "'", double9 == 3.272960077837867E-21d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        normalDistributionImpl0.setStandardDeviation(0.004982565585890275d);
        double double20 = normalDistributionImpl0.inverseCumulativeProbability(0.7302208489873937d);
        double double22 = normalDistributionImpl0.cumulativeProbability((double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0030566557997d + "'", double20 == 100.0030566557997d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4913922052082546d, 0.3651715500477512d);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.cumulativeProbability(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.15865525393145702d + "'", double12 == 0.15865525393145702d);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.691462461274013d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.cumulativeProbability(0.03986973149906884d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.cumulativeProbability((-3.885780586188048E-15d));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.0d, 0.1096616106907986d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.02151428054220411d);
        normalDistributionImpl2.setMean(99.99999909265232d);
        double double9 = normalDistributionImpl2.cumulativeProbability((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.2837953360225208d, (-0.9960503222521656d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 0.0f, 101.0d);
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.3885026417343065d);
        normalDistributionImpl2.setMean(0.005915351705566119d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.39276307230455315d + "'", double5 == 0.39276307230455315d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.5272911811617975d + "'", double8 == 7.5272911811617975d);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setMean(52.0d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.04883560073156118d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5020563944007155d + "'", double9 == 0.5020563944007155d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-108.65624978119396d) + "'", double13 == (-108.65624978119396d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        normalDistributionImpl0.setMean(0.01945305528714028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.09467574302164261d + "'", double14 == 0.09467574302164261d);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 32.0d);
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.5009700559741737d);
        double double12 = normalDistributionImpl0.cumulativeProbability(4.526657609591474E-5d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.density((java.lang.Double) (-209.999668607858d));
        double double11 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-3.885780586188048E-15d));
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(1.7907416280995573E-73d);
        double double9 = normalDistributionImpl2.cumulativeProbability(3.497202527569243E-15d);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5040087641844329d);
        normalDistributionImpl2.setMean(0.005996816717407816d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10.0f, 0.07223569176415257d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.0038536028656297734d);
        normalDistributionImpl2.setStandardDeviation(1.486658076023932d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.807518179365436d + "'", double4 == 9.807518179365436d);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl0.cumulativeProbability(0.02419707245191434d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.49967791011510215d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.015559785378119362d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double8 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.463391164310498d);
        normalDistributionImpl0.setMean(9.450661066961605E-5d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.NEGATIVE_INFINITY + "'", double7 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5095890191126843d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.003391125823206404d);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.16865538677429714d, 0.43147049479370425d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(0.011395296569593559d, Double.NEGATIVE_INFINITY);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.1717556381740022d + "'", double12 == 0.1717556381740022d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setStandardDeviation(35.0d);
        double double7 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.8511172425430698d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.05216434382131924d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        normalDistributionImpl0.setStandardDeviation(0.011398350799319024d);
        normalDistributionImpl0.setMean(99.71682230475363d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl0.cumulativeProbability(99.45533075104642d, 0.011398350866831749d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999999982d + "'", double11 == 0.9999999999999982d);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        normalDistributionImpl0.setStandardDeviation(11.0d);
        normalDistributionImpl0.setMean(0.003391125823206404d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.100000163096063d, 0.02419707245191434d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.003447496149865155d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.034622716827194d + "'", double4 == 10.034622716827194d);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0000002290142d, 2.8165665442762825E-24d);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.508076258511588d, 0.9949360047253046d);
        double double7 = normalDistributionImpl2.inverseCumulativeProbability(0.47337428360028555d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0000002290142d + "'", double7 == 101.0000002290142d);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.003447496149865155d, 101.0d);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.004982565585890275d);
        normalDistributionImpl2.setStandardDeviation(1.2682660406701413E-23d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3511030636567253d + "'", double5 == 0.3511030636567253d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 101.0000002290142d);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.26831686462225557d, 0.5009719973078852d);
        normalDistributionImpl2.setStandardDeviation(0.30446746012271947d);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(3.1733830417701725E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8385529758034967d + "'", double4 == 0.8385529758034967d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.189674862301045E-4d + "'", double7 == 9.189674862301045E-4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.8815107759608598d) + "'", double11 == (-0.8815107759608598d));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.02151428054220411d, 0.39276307230455315d);
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability(2.972322388217208E-11d);
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.25820249755352387d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.0985721653937312d, 0.25820249755352387d);
        double double17 = normalDistributionImpl2.cumulativeProbability(0.26383381213934287d);
        double double19 = normalDistributionImpl2.density((java.lang.Double) 0.5000086955326744d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.3306690738754696E-16d) + "'", double4 == (-3.3306690738754696E-16d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.106226635438361E-16d + "'", double7 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.992007221626409E-16d) + "'", double10 == (-9.992007221626409E-16d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.897375280211193E-22d + "'", double12 == 1.897375280211193E-22d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-7.216449660063518E-16d) + "'", double15 == (-7.216449660063518E-16d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0547118733938987E-15d + "'", double17 == 1.0547118733938987E-15d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.3967336012145E-22d + "'", double19 == 2.3967336012145E-22d);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0038536029354151245d, 54.695998068151596d);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999999999999982d, (double) (short) 1);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.49777933271089825d, Double.NaN);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        normalDistributionImpl0.setStandardDeviation((double) 10);
        normalDistributionImpl0.setMean(1.4866698082023473d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.9015863634979064d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.39891611779725694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.039826002957502736d + "'", double10 == 0.039826002957502736d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003989422804014327d, 0.49202168628309806d);
        normalDistributionImpl2.setStandardDeviation(3.621390715929835E-27d);
        normalDistributionImpl2.setStandardDeviation(0.39862584413045266d);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        normalDistributionImpl2.setMean(0.035024460672673785d);
        double double10 = normalDistributionImpl2.cumulativeProbability(99.03989407290815d);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.005463398338535415d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05208127941521934d + "'", double6 == 0.05208127941521934d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9990122869492701d + "'", double10 == 0.9990122869492701d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.49963146387683316d + "'", double12 == 0.49963146387683316d);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.020379329894292586d, 78.8675611267685d);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 1.0d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.3511030636567253d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.02151428054220411d);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(1.7907416280995573E-73d);
        double double11 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.617656016062085d + "'", double6 == 9.617656016062085d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.539394167099525E-23d + "'", double8 == 9.539394167099525E-23d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        normalDistributionImpl0.setMean((double) (short) 10);
        normalDistributionImpl0.setStandardDeviation(0.9999998557845271d);
        normalDistributionImpl0.setMean(0.49940361868774236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 1.0975294233375232d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        double double17 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double19 = normalDistributionImpl0.inverseCumulativeProbability(0.0010412835720897684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 96.92180231515643d + "'", double19 == 96.92180231515643d);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 100.88014208468009d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.3223937625031809d);
        normalDistributionImpl0.setMean(Double.NaN);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.27083010383549005d + "'", double8 == 0.27083010383549005d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 1.4774954927042859E-22d);
        normalDistributionImpl0.setMean(0.002067536556647376d);
        double double15 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3989389075407833d + "'", double12 == 0.3989389075407833d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.002067536556647376d + "'", double15 == 0.002067536556647376d);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.0024364383453520616d);
        normalDistributionImpl0.setMean(5.390634484996413E-4d);
        normalDistributionImpl0.setMean(0.003329563061815601d);
        normalDistributionImpl0.setMean(0.49229907449655663d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5041127341632512d, 0.5020563944007155d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.014217580937552432d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.9015863634979064d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.596008235386093d) + "'", double4 == (-0.596008235386093d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.1520886255047014d + "'", double6 == 1.1520886255047014d);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
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
        double double14 = normalDistributionImpl0.cumulativeProbability(0.5438030652648341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.706711500367154d + "'", double14 == 0.706711500367154d);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.0d, 0.1096616106907986d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.02151428054220411d);
        normalDistributionImpl2.setMean(99.99999909265232d);
        normalDistributionImpl2.setMean(0.0d);
        double double12 = normalDistributionImpl2.cumulativeProbability((-2.6172672787634723d), 0.5769438134336734d);
        double double13 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999284129937d + "'", double12 == 0.9999999284129937d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1), 101.0000002290142d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.04100846817829612d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-176.64923725977445d) + "'", double4 == (-176.64923725977445d));
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        normalDistributionImpl0.setStandardDeviation(0.30713001079381186d);
        normalDistributionImpl0.setMean((-1.1102230246251565E-15d));
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
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, 0.3989422804014327d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.00411206605241144d);
        double double10 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.24197072451914337d);
        double double15 = normalDistributionImpl2.cumulativeProbability((-0.3823439839379167d));
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26831686462225557d + "'", double4 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.43147049479370425d + "'", double7 == 0.43147049479370425d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.486658076023932d + "'", double9 == 1.486658076023932d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3164209905295682d + "'", double13 == 0.3164209905295682d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.07708266654516854d + "'", double15 == 0.07708266654516854d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double3 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.6509972405365397d);
        normalDistributionImpl2.setStandardDeviation(0.9976704985076454d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.004112807010969372d, 0.003989422711686265d);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15892074841832593d, 56.1999999998222d);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        normalDistributionImpl0.setStandardDeviation(0.011398350799319024d);
        normalDistributionImpl0.setMean(99.71682230475363d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3989422804014327d + "'", double8 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999999982d + "'", double11 == 0.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.011398350799319024d + "'", double16 == 0.011398350799319024d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.25820249755352387d);
        normalDistributionImpl0.setStandardDeviation(0.23921277642240243d);
        double double18 = normalDistributionImpl0.density((java.lang.Double) 4.868248769440697E-6d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003987627967620997d + "'", double11 == 0.003987627967620997d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9314154363270937d + "'", double18 == 0.9314154363270937d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) '#');
        double double9 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.24377533629588963d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 72.75733169691365d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.010101628555089406d + "'", double8 == 0.010101628555089406d);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation(97.0d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) (-1.0d));
        double double10 = normalDistributionImpl2.cumulativeProbability(0.1586552539314552d);
        double double12 = normalDistributionImpl2.cumulativeProbability(58.83350011594982d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.004112807014447759d + "'", double8 == 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5047652121381858d + "'", double10 == 0.5047652121381858d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7313299356821351d + "'", double12 == 0.7313299356821351d);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        normalDistributionImpl2.setStandardDeviation(0.691462461274013d);
        normalDistributionImpl2.setMean(100.96481902940684d);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        normalDistributionImpl2.setMean(0.8511172425430698d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.36348329932713447d);
        normalDistributionImpl2.setStandardDeviation(3.533930913758865E-4d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-161.1434197887031d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.039846824608907386d + "'", double6 == 0.039846824608907386d);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.density((java.lang.Double) (-157.44388116860097d));
        double double7 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.5261749688099898d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        normalDistributionImpl0.setMean(0.8385529758034967d);
        normalDistributionImpl0.setMean(1.0000000000000073d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.004174978630675064d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.4960272986110288d + "'", double15 == 0.4960272986110288d);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
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
        double double24 = normalDistributionImpl0.cumulativeProbability(1.1657341758564144E-15d);
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-4.440892098500626E-16d) + "'", double24 == (-4.440892098500626E-16d));
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 101.0000002290142d);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.26831686462225557d, 0.5009719973078852d);
        normalDistributionImpl2.setMean(0.341284693435295d);
        normalDistributionImpl2.setMean(0.04100846842391914d);
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.5000000000000014d);
        normalDistributionImpl2.setStandardDeviation(89.16733128943515d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8385529758034967d + "'", double4 == 0.8385529758034967d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.189674862301045E-4d + "'", double7 == 9.189674862301045E-4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.04100846817829612d + "'", double13 == 0.04100846817829612d);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.0024364383453520616d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.3989389075407833d);
        normalDistributionImpl0.setStandardDeviation((double) 1L);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.density((java.lang.Double) 2.8165665442762825E-24d);
        normalDistributionImpl0.setMean(0.3511030636567253d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.1208129155306007d);
        double double16 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3989422804014327d + "'", double11 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3885026417343065d + "'", double15 == 0.3885026417343065d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3511030636567253d + "'", double16 == 0.3511030636567253d);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.cumulativeProbability(6.186529907183186E-4d, 8.723175385778642d);
        double double10 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.11693498857496193d, 0.0d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5020563944007155d);
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.7828539196651155d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.1102230246251565E-15d) + "'", double11 == (-1.1102230246251565E-15d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 108.81867986801336d + "'", double13 == 108.81867986801336d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.24377533629588963d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.24377533629588963d + "'", double3 == 0.24377533629588963d);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(2.0d, 91.0d);
        normalDistributionImpl2.setStandardDeviation(0.13686927466582383d);
        normalDistributionImpl2.setStandardDeviation(0.4966568473177966d);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(96.97190978062507d, 2.8278868567633342E-24d);
        normalDistributionImpl2.setStandardDeviation(9.992007221626409E-16d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.10183238123444827d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.3989391683525467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0018210708460281188d + "'", double12 == 0.0018210708460281188d);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.1597791228150634d);
        double double18 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.9953663079612478d) + "'", double17 == (-0.9953663079612478d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.5009719973078852d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9 == 2.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        double double17 = normalDistributionImpl0.cumulativeProbability(0.039799286795740366d);
        double double18 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.24197072451914337d + "'", double18 == 0.24197072451914337d);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.6148878559046674d);
        double double15 = normalDistributionImpl0.cumulativeProbability((-10.131257918593757d));
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
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.27389214325950473d, 0.38852033512092876d);
        normalDistributionImpl2.setMean(0.03986973149906884d);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double9 = normalDistributionImpl0.cumulativeProbability((-1.383453212637637E-4d), 8.542184725969929E-16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011398350799319024d, 0.011398350868612364d);
        normalDistributionImpl2.setMean(0.00411206605241144d);
        double double6 = normalDistributionImpl2.cumulativeProbability(100.96481902940684d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.09467574302164261d, 0.6104871705771893d);
        double double18 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        normalDistributionImpl0.setStandardDeviation(9.359740967898311d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.NEGATIVE_INFINITY + "'", double18 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, (-0.7958018992949997d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.cumulativeProbability(0.39884996302130266d, (double) 1);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.501444015989837d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((-23.019820521106425d));
        double double12 = normalDistributionImpl0.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4062051513498445d + "'", double10 == 0.4062051513498445d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.486658076023932d, 0.3520653267642967d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability((-26.641381163946413d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        normalDistributionImpl0.setMean(0.2300923061989596d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.0018084020582365135d, 100.9968985579339d);
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.9999999999625606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.39891637076145464d + "'", double3 == 0.39891637076145464d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5902872315713317d + "'", double8 == 0.5902872315713317d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2300923061989596d + "'", double9 == 0.2300923061989596d);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
        double double17 = normalDistributionImpl0.cumulativeProbability(0.004982565440835918d);
        double double19 = normalDistributionImpl0.cumulativeProbability(0.31410967765319847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.09467574302164261d + "'", double14 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.09467574302164261d + "'", double15 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.46426551879628153d + "'", double17 == 0.46426551879628153d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5868439809517689d + "'", double19 == 0.5868439809517689d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3989422804014327d, 0.8385529758034967d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.341284693435295d);
        double double5 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.472590953478856d + "'", double4 == 0.472590953478856d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3989422804014327d + "'", double5 == 0.3989422804014327d);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        normalDistributionImpl0.setStandardDeviation(9.617656016062085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8385529758034967d, 0.40985459992980544d);
        normalDistributionImpl2.setMean(0.0023956230879392023d);
        normalDistributionImpl2.setMean(0.38767317623584496d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.656004283871861d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.743668988279632d + "'", double8 == 0.743668988279632d);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.9949360047253046d);
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.039846824608907386d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 98.24753371595683d + "'", double14 == 98.24753371595683d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-3.3056022565708365d), 0.3517027765833526d);
        normalDistributionImpl2.setStandardDeviation(0.025824796099961855d);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        double double11 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(100.64532182054896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double14 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) (byte) 100);
        double double15 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.8413447460685395d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.002359870124408081d);
        normalDistributionImpl0.setStandardDeviation(0.8467644501817054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.1744356189002d + "'", double13 == 97.1744356189002d);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8511172425430698d, 0.00411206605241144d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.14489999812567278d);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8511172425430698d + "'", double3 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8467644501817054d + "'", double5 == 0.8467644501817054d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, 0.39891637076145464d);
        double double5 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, (double) (byte) 10);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double9 = normalDistributionImpl2.cumulativeProbability(0.006616941033833418d);
        double double11 = normalDistributionImpl2.cumulativeProbability(97.34703633824485d);
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.49229907449655663d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8106088131500386d + "'", double5 == 0.8106088131500386d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.533930913758865E-4d + "'", double7 == 3.533930913758865E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1939162683106727d + "'", double9 == 0.1939162683106727d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.34340215960618364d + "'", double13 == 0.34340215960618364d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.39891637076145464d + "'", double14 == 0.39891637076145464d);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setMean(1.2989609388114332E-14d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.387432573590388d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.49999999999999883d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.3684295859056615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3700968566970246d + "'", double6 == 0.3700968566970246d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6914624612740081d + "'", double8 == 0.6914624612740081d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.37276439299305697d + "'", double10 == 0.37276439299305697d);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.3989415253831241d);
        normalDistributionImpl2.setStandardDeviation(0.17567111172148175d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5395477934177719d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5057533770708286d + "'", double6 == 0.5057533770708286d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.17567111172148175d + "'", double9 == 0.17567111172148175d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999999984d + "'", double11 == 0.9999999999999984d);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.039846824608907386d, 0.5045637245140185d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.897375280211193E-22d, 0.053102810653298804d);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((-23.019820521106425d));
        double double12 = normalDistributionImpl0.cumulativeProbability((-28.79778829638325d));
        double double15 = normalDistributionImpl0.cumulativeProbability(1.50000402809845d, (double) 100.0f);
        double double17 = normalDistributionImpl0.cumulativeProbability(9.189674862301045E-4d);
        normalDistributionImpl0.setStandardDeviation(5.390634484996413E-4d);
        normalDistributionImpl0.setMean(0.5301815628459023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4062051513498445d + "'", double10 == 0.4062051513498445d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.38327737736684997d + "'", double12 == 0.38327737736684997d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.34254368759136156d + "'", double15 == 0.34254368759136156d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5000037795359233d + "'", double17 == 0.5000037795359233d);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.density((java.lang.Double) 1.5543122344752192E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3989422804014327d + "'", double10 == 0.3989422804014327d);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.004112723567028872d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.0025136092583758485d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        double double18 = normalDistributionImpl0.density((java.lang.Double) 0.38327737736684997d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        normalDistributionImpl0.setMean(0.8385529758034967d);
        normalDistributionImpl0.setStandardDeviation(0.3511030636567253d);
        normalDistributionImpl0.setStandardDeviation(1.7907416280995573E-73d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 1.0d);
        normalDistributionImpl0.setStandardDeviation(0.24000666364139017d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.03989391637217564d, 0.398941135636211d);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.8511172425430698d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 2.8165665442762825E-24d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 35.0d);
        normalDistributionImpl0.setStandardDeviation(0.49202168628309806d);
        normalDistributionImpl0.setMean(99.03989407290815d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
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
        normalDistributionImpl0.setMean(0.2300923061989596d);
        normalDistributionImpl0.setMean((-61.84086009316348d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.cumulativeProbability(2.7581570254009424E-5d);
        normalDistributionImpl2.setMean(0.003970761836563756d);
        normalDistributionImpl2.setMean(0.5041127341632512d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05208137124318141d + "'", double9 == 0.05208137124318141d);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.3796360778440238d), 100.9968985579339d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.12607967267962028d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003949605910941429d + "'", double4 == 0.003949605910941429d);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.2918674664154666d), 97.36150278271104d);
        normalDistributionImpl2.setMean(0.4562046874576832d);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.100000163096063d, 0.005723383913933699d);
        double double5 = normalDistributionImpl2.cumulativeProbability((-0.2561132864414737d), 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3164209905295682d, 6.186529907183186E-4d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.16849482818554234d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.5216839156249465d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4308145720794943d, 0.003439130075321901d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.00394988272520803d, 0.01945305528714028d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setStandardDeviation(0.6549981199955597d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5955985761504836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6549981199955597d + "'", double10 == 0.6549981199955597d);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
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
        double double17 = normalDistributionImpl0.cumulativeProbability(0.007669665116947154d);
        double double19 = normalDistributionImpl0.cumulativeProbability(0.05921361970278555d);
        double double20 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.026109053048334d + "'", double15 == 9.026109053048334d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 6.106226635438361E-16d + "'", double17 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-3.3306690738754696E-16d) + "'", double19 == (-3.3306690738754696E-16d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 11.0d + "'", double20 == 11.0d);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5000000000000052d);
        double double16 = normalDistributionImpl2.cumulativeProbability(0.03626707353288911d, 99.99999909265232d);
        double double18 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5184936385071415d + "'", double16 == 0.5184936385071415d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.039844391409476404d + "'", double18 == 0.039844391409476404d);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.cumulativeProbability(6.186529907183186E-4d, 8.723175385778642d);
        double double10 = normalDistributionImpl0.getMean();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(9.807518179365436d, 0.010101628555089406d);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5041127341632511d, 99.71682230475363d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.0044318484119380075d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 99.71682230475363d + "'", double3 == 99.71682230475363d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, (double) (byte) 10);
        normalDistributionImpl2.setMean(0.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.3451469510989622d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.0033286283517448E-18d, 0.07708266654516854d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.0d);
        normalDistributionImpl2.setMean(0.003989391072013627d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.5247740780939647d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.217926519520654d + "'", double8 == 6.217926519520654d);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setStandardDeviation(99.71682230475363d);
        double double14 = normalDistributionImpl0.cumulativeProbability((-7.977165358279764d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4681193475199583d + "'", double14 == 0.4681193475199583d);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        normalDistributionImpl0.setStandardDeviation(0.6179114221889526d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.02419707245191434d);
        double double15 = normalDistributionImpl0.cumulativeProbability(99.71461122256248d);
        double double17 = normalDistributionImpl0.cumulativeProbability(0.17567111172148175d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3220907394873098d + "'", double15 == 0.3220907394873098d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 1.0d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.3511030636567253d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.02151428054220411d);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(1.7907416280995573E-73d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.617656016062085d + "'", double6 == 9.617656016062085d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.539394167099525E-23d + "'", double8 == 9.539394167099525E-23d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
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
        double double19 = normalDistributionImpl0.inverseCumulativeProbability(0.5095890191126843d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl0.inverseCumulativeProbability(1.486658076023932d);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.723175385778642d + "'", double17 == 8.723175385778642d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.024038421047269d + "'", double19 == 11.024038421047269d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.539827837277029d);
        double double8 = normalDistributionImpl2.cumulativeProbability((-1.312499901071692d), 0.5009719973078852d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.04100846817829612d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 55.1999999998222d + "'", double5 == 55.1999999998222d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.005915351705566119d + "'", double8 == 0.005915351705566119d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.00411206605241144d);
        double double18 = normalDistributionImpl0.cumulativeProbability(0.01666635779967479d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.505008306218074d + "'", double18 == 0.505008306218074d);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) (byte) -1, 0.0d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.3989389075407833d);
        double double11 = normalDistributionImpl2.density((java.lang.Double) 0.9988689163583906d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.004982565440835918d + "'", double7 == 0.004982565440835918d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8206667139258397d + "'", double9 == 0.8206667139258397d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7713228294861834d + "'", double11 == 0.7713228294861834d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1), 0.00411206605241144d);
        normalDistributionImpl2.setMean(0.6179114221889526d);
        normalDistributionImpl2.setMean(3.784863435160563E-24d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.26480951088062704d);
        normalDistributionImpl2.setMean((-1.312499901071692d));
        normalDistributionImpl2.setMean(1.2906118579297512E-137d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.30446746012271947d + "'", double4 == 0.30446746012271947d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.002630236126780588d, 100.0d);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
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
        double double15 = normalDistributionImpl0.cumulativeProbability(0.039889190554138386d, 99.71682230475363d);
        double double17 = normalDistributionImpl0.density((java.lang.Double) 2.576279703865435E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.38852031274078025d + "'", double15 == 0.38852031274078025d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.2929905121210513d, 514.4111661113775d);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(2.275957200481571E-15d, 9.026109053048334d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.50000402809845d);
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.005383918863507501d);
        double double9 = normalDistributionImpl0.density((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3530085295059213d + "'", double7 == 0.3530085295059213d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.12951681310276567d + "'", double9 == 0.12951681310276567d);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4774954927042859E-22d + "'", double4 == 1.4774954927042859E-22d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-3.3056022565708365d), 0.3517027765833526d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 2.275957200481571E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.452317652009683E-20d + "'", double4 == 7.452317652009683E-20d);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011394981174247374d, 0.1096616106907986d);
        normalDistributionImpl2.setMean(99.71682230475363d);
        double double7 = normalDistributionImpl2.cumulativeProbability(1.0d, 1.0d);
        double double10 = normalDistributionImpl2.cumulativeProbability((-26.641381163946413d), 0.39884996302130266d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1096616106907986d + "'", double11 == 0.1096616106907986d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.1096616106907986d + "'", double12 == 0.1096616106907986d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.49999035942305375d, 5.867585377943257E-15d);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, 0.39891637076145464d);
        normalDistributionImpl2.setMean(0.003949921231149102d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NaN, (double) 1.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 1);
        double double7 = normalDistributionImpl2.cumulativeProbability(9.687755967937495E-5d, 0.38327737736684997d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.46080199849299264d, 0.387432573590388d);
        normalDistributionImpl2.setStandardDeviation(5.81377356523935E-36d);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(42.867561125735264d, 36.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.011398350799319024d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(7.267167198656892E-9d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 99.7653478476549d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.0014324330216118556d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11693498857496193d + "'", double4 == 0.11693498857496193d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-161.1434197887031d) + "'", double8 == (-161.1434197887031d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0031782065058061286d + "'", double10 == 0.0031782065058061286d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 36.0d + "'", double11 == 36.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-64.48002877536926d) + "'", double13 == (-64.48002877536926d));
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.9727648049862614d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9727648049862614d + "'", double3 == 0.9727648049862614d);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.004112723567028872d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability((double) 1L);
        double double17 = normalDistributionImpl0.density((java.lang.Double) 0.5047652121381858d);
        double double18 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.3989415253831241d);
        normalDistributionImpl2.setStandardDeviation(0.17567111172148175d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.5868439809517689d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5057533770708286d + "'", double6 == 0.5057533770708286d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.17567111172148175d + "'", double9 == 0.17567111172148175d);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.38852033512092876d, 35.0d);
        normalDistributionImpl2.setMean(0.6549981199955597d);
        double double5 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6549981199955597d + "'", double5 == 0.6549981199955597d);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        double double11 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.004982565440835918d, 100.9968985579339d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8405931241353324d + "'", double15 == 0.8405931241353324d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, 0.00411206605241144d);
        normalDistributionImpl0.setStandardDeviation(0.5301815628459023d);
        double double12 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(88.0180622223085d, 0.625169930649095d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.011398350813317663d, 8.881784197001252E-16d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.33901596247314525d, 0.7168223047536362d);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.001349898031630159d, 0.00411206605241144d);
        normalDistributionImpl2.setStandardDeviation(0.7713228294861834d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.001377074466333561d + "'", double5 == 0.001377074466333561d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
        double double19 = normalDistributionImpl0.cumulativeProbability(5.390634484996413E-4d);
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.09467574302164261d + "'", double14 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.09467574302164261d + "'", double15 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.46250029182707436d + "'", double19 == 0.46250029182707436d);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.02419707245191434d, 0.05208137124318141d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 101.0d);
        double double5 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.inverseCumulativeProbability((-3.3306690738754696E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.02419707245191434d + "'", double5 == 0.02419707245191434d);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', 97.0d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.039826002957502736d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003895512098276584d + "'", double4 == 0.003895512098276584d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, 101.04123693179952d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(100.0030566557997d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5009719973078852d, 101.0d);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.003971497250408449d, 0.3511030636567253d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.003369916363094223d, 35.99999999962154d);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.463391164310498d, 0.9597790821736437d);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0013711354501702022d + "'", double5 == 0.0013711354501702022d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.13934966669526672d + "'", double8 == 0.13934966669526672d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0019606880995698406d + "'", double11 == 0.0019606880995698406d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.0d + "'", double12 == 101.0d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.691462461274013d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.039799286795740366d);
        double double7 = normalDistributionImpl2.density((java.lang.Double) 1.9432970451699338E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        normalDistributionImpl0.setStandardDeviation((double) '#');
        normalDistributionImpl0.setStandardDeviation(0.4997574798200302d);
        normalDistributionImpl0.setMean(0.0113980019225466d);
        double double16 = normalDistributionImpl0.inverseCumulativeProbability(0.5000744304523199d);
        normalDistributionImpl0.setStandardDeviation(0.24197072451914683d);
        double double19 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3989422804014327d + "'", double8 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.01149129841951357d + "'", double16 == 0.01149129841951357d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.24197072451914683d + "'", double19 == 0.24197072451914683d);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
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
        normalDistributionImpl0.setMean(0.2300923061989596d);
        double double17 = normalDistributionImpl0.cumulativeProbability(1.5543122344752192E-15d, 100.3988499631105d);
        normalDistributionImpl0.setMean((double) (short) 100);
        double double22 = normalDistributionImpl0.cumulativeProbability((-24.82893083470349d), 72.75733169691365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.590989978358155d + "'", double17 == 0.590989978358155d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-7.438494264988549E-15d) + "'", double22 == (-7.438494264988549E-15d));
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 0.003971497250408449d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.003970761836563756d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 93.2278681486537d + "'", double4 == 93.2278681486537d);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 100, (double) (short) 100);
        normalDistributionImpl2.setStandardDeviation(0.5422900550736289d);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double12 = normalDistributionImpl0.cumulativeProbability(10.0d, 55.1999999998222d);
        double double13 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.3448500548141074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
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
        normalDistributionImpl0.setMean(3.9701063468838365E-24d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5041127341632512d, 0.5020563944007155d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.002359870124408081d);
        normalDistributionImpl2.setStandardDeviation(0.39891611779725694d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.48225063253425554d + "'", double4 == 0.48225063253425554d);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        normalDistributionImpl2.setMean(0.00411206605241144d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.5769438134336734d);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.34254368759136156d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5071410812221328d + "'", double8 == 0.5071410812221328d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-12.972874042380251d) + "'", double10 == (-12.972874042380251d));
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
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
        normalDistributionImpl0.setMean(0.8405931241353324d);
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
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.3511030636567253d);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.039528187199597005d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.004112805055412701d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3989422804014327d + "'", double8 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.3823439839379167d) + "'", double10 == (-0.3823439839379167d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5157653595311964d + "'", double12 == 0.5157653595311964d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.3989389063283672d + "'", double14 == 0.3989389063283672d);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-9.992007221626409E-16d), 100.88014208468009d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.011394981174247374d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.003713014007658319d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5000450627811498d + "'", double4 == 0.5000450627811498d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-270.0672235122814d) + "'", double6 == (-270.0672235122814d));
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double5 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
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
        double double17 = normalDistributionImpl0.density((java.lang.Double) (-43.77648420718779d));
        double double19 = normalDistributionImpl0.density((java.lang.Double) 2.034906530007112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.782792010140924E-24d + "'", double14 == 7.782792010140924E-24d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.163365985644871E-47d + "'", double17 == 5.163365985644871E-47d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.766906604818892E-23d + "'", double19 == 5.766906604818892E-23d);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.003987627967620997d, 0.004112805055412701d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0977872677871649d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NaN, 0.003949881050253595d);
        double double3 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(Double.NEGATIVE_INFINITY);
        double double8 = normalDistributionImpl2.cumulativeProbability(1.50000402809845d, 89.16733128943515d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.3511030636567253d);
        normalDistributionImpl2.setMean(97.4423124760719d);
        normalDistributionImpl2.setMean(0.0021142574024273783d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(0.39671514126355933d, 0.039844391409476404d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25820249755352387d + "'", double4 == 0.25820249755352387d);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.3164209905295682d);
        double double9 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean((-0.25632498330402864d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003970761836563756d + "'", double8 == 0.003970761836563756d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, (double) 1L);
        double double13 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.cumulativeProbability(0.4960272986110288d, 0.002359870124408081d);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.022161439152763612d, 0.48225063253425554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.17634563238942036d + "'", double10 == 0.17634563238942036d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
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
            normalDistributionImpl0.setStandardDeviation((-49.62465476117713d));
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
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation(0.3989422804014327d);
        normalDistributionImpl2.setMean((-2.709432947234d));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.004112723567028872d);
        double double14 = normalDistributionImpl2.density((java.lang.Double) 0.0018084020582365135d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011398350789919569d + "'", double12 == 0.011398350789919569d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.011398350853397575d + "'", double14 == 0.011398350853397575d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setMean(0.9999999999999982d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.46080199849299264d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 6.629471037444856E-24d);
        double double15 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9015863634979064d + "'", double11 == 0.9015863634979064d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2419707245191438d + "'", double13 == 0.2419707245191438d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5000000000000007d + "'", double15 == 0.5000000000000007d);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.1096616106907986d);
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.8511172425430698d);
        normalDistributionImpl0.setMean(9.617656016062085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.23921277642240243d);
        normalDistributionImpl2.setStandardDeviation(5.22818092574262E-6d);
        normalDistributionImpl2.setMean(0.12951681310276567d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05208127941521934d + "'", double6 == 0.05208127941521934d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.003369916363094223d + "'", double9 == 0.003369916363094223d);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.011397187830924622d);
        normalDistributionImpl0.setMean(101.0d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.0010115069907344898d);
        double double17 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double19 = normalDistributionImpl0.inverseCumulativeProbability(0.590989978358155d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.96481902940684d + "'", double15 == 100.96481902940684d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 101.00262240443683d + "'", double19 == 101.00262240443683d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.density((java.lang.Double) 0.8511172425430698d);
        normalDistributionImpl2.setStandardDeviation(0.37861586634525224d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 101.0d + "'", double9 == 101.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.629471037444856E-24d + "'", double11 == 6.629471037444856E-24d);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
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
        double double22 = normalDistributionImpl0.cumulativeProbability(0.7632581264314935d);
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8385529758034967d, 0.40985459992980544d);
        normalDistributionImpl2.setMean(0.0023956230879392023d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double12 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(4.4003238434786596E-5d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.inverseCumulativeProbability((-24.82893083470349d));
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
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
        double double19 = normalDistributionImpl0.cumulativeProbability(0.5208011281288356d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5d + "'", double19 == 0.5d);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(2.8165665442762825E-24d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(3.621390715929835E-27d);
        normalDistributionImpl0.setMean(0.3651715500477512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 91.0d + "'", double10 == 91.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6534818342543749d, (double) 1);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.011143143245466003d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.32457519946685764d + "'", double4 == 0.32457519946685764d);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setStandardDeviation((double) (byte) 1);
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(1.6653345369377348E-16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-8.9999995d) + "'", double9 == (-8.9999995d));
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
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
        normalDistributionImpl0.setMean(0.2300923061989596d);
        double double15 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2300923061989596d + "'", double15 == 0.2300923061989596d);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        double double15 = normalDistributionImpl0.getMean();
        double double16 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5006140082113839d, 0.14489999812567278d);
        normalDistributionImpl2.setStandardDeviation(97.00447696498394d);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 101.0000002290142d);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.26831686462225557d, 0.5009719973078852d);
        normalDistributionImpl2.setMean(0.341284693435295d);
        normalDistributionImpl2.setStandardDeviation((double) 100);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.3989422840492259d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8385529758034967d + "'", double4 == 0.8385529758034967d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.189674862301045E-4d + "'", double7 == 9.189674862301045E-4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5002300204940751d + "'", double13 == 0.5002300204940751d);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.cumulativeProbability(0.1208129155306007d, 7.230419748435191E-4d);
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
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.6527527593302829d);
        double double15 = normalDistributionImpl2.density((java.lang.Double) 3.9701063468838365E-24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.9954228387216588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.24197072451914683d + "'", double7 == 0.24197072451914683d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9 == 2.0d);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.density((java.lang.Double) 1.2906118579297512E-137d);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.3885026417343065d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3989422804014327d + "'", double2 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.36994324221786334d + "'", double4 == 0.36994324221786334d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3989422804014327d + "'", double6 == 0.3989422804014327d);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.2300923061989596d, 1.294671063348154E-23d);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.0024317682354228947d, 0.5000037795359233d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999519056761452d, 0.39671514126355933d);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-25.11376863225348d), 31.999231689805978d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
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
        double double17 = normalDistributionImpl0.cumulativeProbability(0.004982565440835918d);
        normalDistributionImpl0.setStandardDeviation(0.0013299371964596851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.09467574302164261d + "'", double14 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.09467574302164261d + "'", double15 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.46426551879628153d + "'", double17 == 0.46426551879628153d);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.0d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.5005714579007384d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.004112752250576381d + "'", double8 == 0.004112752250576381d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01945305528714028d, (double) ' ');
        double double3 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.4999999999999999d);
        normalDistributionImpl2.setMean(0.24197066910440684d);
        normalDistributionImpl2.setMean(0.5041127341632512d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01945305528714028d + "'", double3 == 0.01945305528714028d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.006233247950937437d + "'", double6 == 0.006233247950937437d);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8106088131500386d, 0.005268537016191098d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.625169930649095d);
        normalDistributionImpl2.setMean(0.0041123726136819555d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.321873949909011E-268d + "'", double4 == 7.321873949909011E-268d);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5041127341632512d, 0.5020563944007155d);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.1949611129156012E-17d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1576662115843654d + "'", double4 == 0.1576662115843654d);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.0d, 0.1096616106907986d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.02151428054220411d);
        normalDistributionImpl2.setMean(99.99999909265232d);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.1096616106907986d + "'", double8 == 0.1096616106907986d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1096616106907986d + "'", double9 == 0.1096616106907986d);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        normalDistributionImpl0.setMean(0.30446746012271947d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.cumulativeProbability(0.004112807010969372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3819533246336677d + "'", double13 == 0.3819533246336677d);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-3.3306690738754696E-16d), 0.3684295859056615d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(31.919763271402783d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3684295859056615d + "'", double3 == 0.3684295859056615d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
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
        double double18 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.003976677061955973d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, 0.3989422804014327d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.00411206605241144d);
        double double10 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.24197072451914337d);
        double double15 = normalDistributionImpl2.cumulativeProbability((-0.3823439839379167d));
        double double16 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.039846824608907386d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26831686462225557d + "'", double4 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.43147049479370425d + "'", double7 == 0.43147049479370425d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.486658076023932d + "'", double9 == 1.486658076023932d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3164209905295682d + "'", double13 == 0.3164209905295682d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.07708266654516854d + "'", double15 == 0.07708266654516854d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
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
        double double17 = normalDistributionImpl0.density((java.lang.Double) 99.99999909265232d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.cumulativeProbability(0.12958017852405082d);
        double double15 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 0.8413447460685395d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.density((java.lang.Double) 0.8211239448342376d);
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.5020563944007155d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.02151428054220411d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.767237638966325E-27d + "'", double5 == 6.767237638966325E-27d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0054148269404342E-28d + "'", double7 == 1.0054148269404342E-28d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.3528607971727943E-31d + "'", double9 == 1.3528607971727943E-31d);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
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
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability((-0.6171637425034306d));
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double12 = normalDistributionImpl0.cumulativeProbability(10.0d, 55.1999999998222d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.005996816717407816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.003713014007658319d);
        normalDistributionImpl2.setStandardDeviation(0.01945305528714028d);
        double double5 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 1.0d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.3511030636567253d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.02151428054220411d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(0.24463748165229704d, (-0.6841976624611501d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.617656016062085d + "'", double6 == 9.617656016062085d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.539394167099525E-23d + "'", double8 == 9.539394167099525E-23d);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(Double.NaN);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.09467574302164261d);
        double double16 = normalDistributionImpl0.inverseCumulativeProbability(0.38852033512092876d);
        double double18 = normalDistributionImpl0.density((java.lang.Double) (-1.312499901071692d));
        normalDistributionImpl0.setStandardDeviation(0.5001591549387787d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.0d + "'", double12 == 101.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.71682230475363d + "'", double16 == 99.71682230475363d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(11.0d, 4.703838883365341E-4d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.8405931241353324d);
        normalDistributionImpl2.setStandardDeviation(0.3848369645341492d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setMean(100.64532182054896d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
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
        double double21 = normalDistributionImpl0.density((java.lang.Double) (-218.52912411964806d));
        double double22 = normalDistributionImpl0.getMean();
        double double23 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = normalDistributionImpl0.inverseCumulativeProbability(99.71461122256248d);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6511844957867805d + "'", double15 == 0.6511844957867805d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-2.6643361475831204d) + "'", double17 == (-2.6643361475831204d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.34876520096819874d + "'", double19 == 0.34876520096819874d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3164209905295682d, 6.186529907183186E-4d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(8.881784197001252E-16d);
        double double5 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.6841976624611501d) + "'", double4 == (-0.6841976624611501d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3164209905295682d + "'", double5 == 0.3164209905295682d);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.9949360047253046d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 6.106226635438361E-16d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.13934966669526672d);
        double double9 = normalDistributionImpl2.cumulativeProbability((-8.145164570864665d), 1.486658076023932d);
        normalDistributionImpl2.setStandardDeviation(0.4850139316775809d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.010954846709518419d + "'", double6 == 0.010954846709518419d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.10183238123444827d + "'", double9 == 0.10183238123444827d);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.003970761836563756d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 91.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
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
        normalDistributionImpl0.setMean(1.8656947736106488E-4d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        double double18 = normalDistributionImpl0.density((java.lang.Double) 0.5041286058447934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.1102230246251565E-16d) + "'", double13 == (-1.1102230246251565E-16d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.617656016062085d + "'", double16 == 9.617656016062085d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.041423295434243064d + "'", double18 == 0.041423295434243064d);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) (byte) -1, 0.0d);
        double double9 = normalDistributionImpl2.inverseCumulativeProbability(0.38767317623584496d);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.6119088732813208d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.004982565440835918d + "'", double7 == 0.004982565440835918d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6148878559046674d + "'", double9 == 0.6148878559046674d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.767744079086461d + "'", double11 == 0.767744079086461d);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double9 = normalDistributionImpl0.density((java.lang.Double) 1.0d);
        normalDistributionImpl0.setStandardDeviation(0.0021142574024273783d);
        normalDistributionImpl0.setStandardDeviation(0.3071300107938131d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.24197072451914683d + "'", double7 == 0.24197072451914683d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.24197072451914337d + "'", double9 == 0.24197072451914337d);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.11693498857496193d, 10.0d);
        normalDistributionImpl2.setStandardDeviation(8.22771251574621E-21d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.3819533246336677d, 1.0793856131536207E-20d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        normalDistributionImpl0.setStandardDeviation(0.0024364383453520616d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.inverseCumulativeProbability(69.14708754420747d);
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
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
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
        double double20 = normalDistributionImpl0.cumulativeProbability(9.030251659510436E-4d, 0.8211239448342376d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        normalDistributionImpl2.setStandardDeviation(98.69487139525737d);
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.691462461274013d + "'", double7 == 0.691462461274013d);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.39891637076145464d, 0.00411206605241144d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.1096616106907986d, Double.NaN);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.002359870124408081d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.00411206605241144d + "'", double5 == 0.00411206605241144d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.00411206605241144d + "'", double9 == 0.00411206605241144d);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
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
        normalDistributionImpl0.setStandardDeviation(0.49602705037232253d);
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
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
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
        double double17 = normalDistributionImpl0.density((java.lang.Double) 0.003989391072013627d);
        double double19 = normalDistributionImpl0.inverseCumulativeProbability(0.004112588463181002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 92.00000215d + "'", double15 == 92.00000215d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.35731607516219d + "'", double19 == 97.35731607516219d);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        double double7 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.5d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.04981084998249394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.cumulativeProbability(0.007224929106763151d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(0.0014324330216118912d, (-28.79778829638325d));
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003391125823206404d, (double) 10L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5095890191126843d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.3799365150373838d);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.003949921231149102d);
        normalDistributionImpl2.setStandardDeviation(2.692839319102378E-155d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.24377533629588963d + "'", double4 == 0.24377533629588963d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003391125823206404d + "'", double6 == 0.003391125823206404d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.0530841394224146d) + "'", double8 == (-3.0530841394224146d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5000222927114206d + "'", double10 == 0.5000222927114206d);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.5040019287905985d);
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.13390324353657285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3848369645341492d, 97.4423124760719d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4984244284315258d + "'", double4 == 0.4984244284315258d);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.04100846817829612d, 0.1513720156799293d);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double11 = normalDistributionImpl2.cumulativeProbability(101.0d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-260.7350958165562d));
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9980473674631738d + "'", double11 == 0.9980473674631738d);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-75.29874369961907d), 0.0539057471196433d);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(91.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.039846824608907386d, 0.5045637245140185d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.cumulativeProbability(0.39891611779725694d, 4.468156777929553d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5045637245140185d + "'", double3 == 0.5045637245140185d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.23834290523944346d + "'", double6 == 0.23834290523944346d);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5153812473242257d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003391125823206404d, (double) 10L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5095890191126843d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.3799365150373838d);
        double double10 = normalDistributionImpl2.cumulativeProbability(1.8656947736106488E-4d);
        normalDistributionImpl2.setStandardDeviation(0.04981084998249394d);
        double double14 = normalDistributionImpl2.density((java.lang.Double) 0.39276307230455315d);
        double double16 = normalDistributionImpl2.density((java.lang.Double) 0.003988768218667045d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.24377533629588963d + "'", double4 == 0.24377533629588963d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003391125823206404d + "'", double6 == 0.003391125823206404d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.0530841394224146d) + "'", double8 == (-3.0530841394224146d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.49987215670055946d + "'", double10 == 0.49987215670055946d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.311828706998708E-13d + "'", double14 == 4.311828706998708E-13d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.008567735123956d + "'", double16 == 8.008567735123956d);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.689863752939426d, 0.9999999999999988d);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.4850139316775809d);
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
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4960272986110288d, 3.155475305604421E-27d);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setMean(Double.POSITIVE_INFINITY);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        normalDistributionImpl0.setStandardDeviation(0.3989389075407833d);
        normalDistributionImpl0.setMean(1.5543122344752192E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
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
        double double19 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass20 = normalDistributionImpl0.getClass();
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.02419707245191434d, 0.05208137124318141d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 101.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.39884996302130266d);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.15993344388391528d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(0.5184936385071415d, 0.011398350813317663d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.02419707245191434d + "'", double5 == 0.02419707245191434d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6788914971324447d + "'", double8 == 0.6788914971324447d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9954228387216588d + "'", double10 == 0.9954228387216588d);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
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
        // The following exception was thrown during execution in test generation
        try {
            double double22 = normalDistributionImpl0.inverseCumulativeProbability(0.49545415860167485d);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.003369916363094223d);
        normalDistributionImpl0.setMean(0.27574252188645465d);
        double double13 = normalDistributionImpl0.cumulativeProbability(42.630353990821625d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.0d);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability(Double.NaN);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 1.7332537096131306E-8d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3989422804014327d + "'", double6 == 0.3989422804014327d);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setStandardDeviation(101.0d);
        normalDistributionImpl0.setMean(58.20532058556991d);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.47337428360028555d);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2837953360225208d + "'", double12 == 0.2837953360225208d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.003447496149865155d, 101.0d);
        normalDistributionImpl2.setMean(3.820885790758915d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3511030636567253d + "'", double5 == 0.3511030636567253d);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.004112807014447759d);
        normalDistributionImpl0.setMean(0.9727648049862614d);
        double double18 = normalDistributionImpl0.cumulativeProbability(2.8278868567633342E-24d, 0.33901596247314525d);
        double double19 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0977872677871649d + "'", double18 == 0.0977872677871649d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9727648049862614d + "'", double19 == 0.9727648049862614d);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double3 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.density((java.lang.Double) (-0.27212473236588863d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(67.97913638109047d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.004112807014447759d);
        normalDistributionImpl0.setMean(0.9727648049862614d);
        normalDistributionImpl0.setMean((double) 100.0f);
        double double19 = normalDistributionImpl0.cumulativeProbability(18.0000005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-23.019820521106425d), 2.034906530007112d);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6148878559046674d, 0.24197072451914683d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.24197072451914683d + "'", double3 == 0.24197072451914683d);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5061729618128646d, 96.7626822507217d);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011398350868612364d + "'", double12 == 0.011398350868612364d);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-3.3306690738754696E-15d), 0.341284693435295d);
        double double3 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.5000000000000052d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.3306690738754696E-15d) + "'", double3 == (-3.3306690738754696E-15d));
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        normalDistributionImpl0.setMean((double) (byte) 10);
        normalDistributionImpl0.setMean(0.003987627967620997d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.007224929106763151d);
        double double17 = normalDistributionImpl0.cumulativeProbability(0.5071410812221328d);
        double double19 = normalDistributionImpl0.density((java.lang.Double) 0.9015863634979064d);
        double double21 = normalDistributionImpl0.density((java.lang.Double) 9.992007221626409E-16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.003989422801923846d + "'", double15 == 0.003989422801923846d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5020072833908171d + "'", double17 == 0.5020072833908171d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.003989262096646935d + "'", double19 == 0.003989262096646935d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.003989422800842501d + "'", double21 == 0.003989422800842501d);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(2.972339041562577E-11d, 0.25820249755352387d);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.5041291410139574d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.cumulativeProbability(0.24197066910440684d);
        double double16 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.396599634279215d + "'", double14 == 0.396599634279215d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.NEGATIVE_INFINITY + "'", double16 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
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
        double double24 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.NEGATIVE_INFINITY + "'", double18 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.5040019287905985d);
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
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability(0.0044318484119380075d);
        double double3 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.inverseCumulativeProbability(0.003369916363094223d);
        normalDistributionImpl0.setMean(0.5009700559741737d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.6172672787634723d) + "'", double2 == (-2.6172672787634723d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.709432947234d) + "'", double5 == (-2.709432947234d));
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) (byte) -1, 0.0d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.3989389075407833d);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.27389214325950473d);
        double double13 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.004982565440835918d + "'", double7 == 0.004982565440835918d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8206667139258397d + "'", double9 == 0.8206667139258397d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5301815628459023d + "'", double11 == 0.5301815628459023d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(7.67165393861376E-17d, (-0.0037696481588829506d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setMean(0.004112807014447759d);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) Double.NEGATIVE_INFINITY);
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.49202168628309806d);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.44476622630561513d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.486658076023932d, 0.5184936385071415d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.00767185267524473d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.486658076023932d + "'", double3 == 1.486658076023932d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5184936385071415d + "'", double4 == 0.5184936385071415d);
    }
}
