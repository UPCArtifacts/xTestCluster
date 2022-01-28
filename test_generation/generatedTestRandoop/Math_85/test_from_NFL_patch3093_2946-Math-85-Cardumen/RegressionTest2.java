import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.011398350868612364d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) -1, 52.0d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.27389214325950473d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability((-22.76824609551198d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.007669665116947154d + "'", double4 == 0.007669665116947154d);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double12 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 1.0f);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.004112751329122643d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003987627967620997d + "'", double11 == 0.003987627967620997d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.49602705037232253d + "'", double16 == 0.49602705037232253d);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) (byte) -1, 0.0d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.004982565440835918d + "'", double7 == 0.004982565440835918d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-9.612770517507248E-7d), 0.3988974611574716d);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        normalDistributionImpl2.setMean(0.8511172425430698d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.02419707245191434d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.25820249755352387d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8511172425430698d + "'", double5 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.03988330678708569d + "'", double9 == 0.03988330678708569d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.01666635779967479d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003989422748607731d + "'", double4 == 0.003989422748607731d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.39894227645996516d);
        double double12 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.0014324330216118912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5005714579007384d + "'", double5 == 0.5005714579007384d);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        double double11 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.cumulativeProbability(0.0d, (-209.999668607858d));
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
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.003971497250408449d);
        normalDistributionImpl2.setStandardDeviation(0.011398350795231223d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4866698082023473d + "'", double4 == 1.4866698082023473d);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.49999999999999883d, (-161.1434197887031d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.49034770664643224d);
        normalDistributionImpl0.setMean(0.5301815628459023d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        double double17 = normalDistributionImpl0.density((java.lang.Double) (-7.977165358279764d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35375207302115724d + "'", double12 == 0.35375207302115724d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 7.67165393861376E-17d + "'", double17 == 7.67165393861376E-17d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.cumulativeProbability(0.004112807010969372d, 35.99999999962154d);
        normalDistributionImpl2.setStandardDeviation(0.002431572128965361d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14471422838183567d + "'", double6 == 0.14471422838183567d);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.6534818342543749d);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.05247175082918987d, 0.3700968566970246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.1824217772952328d + "'", double12 == 0.1824217772952328d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        double double19 = normalDistributionImpl0.density((java.lang.Double) 96.7626822507217d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.27389214325950473d + "'", double14 == 0.27389214325950473d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
            double double17 = normalDistributionImpl0.cumulativeProbability(0.0021142574024273783d, (-2.557907301394329d));
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.cumulativeProbability(97.34703633824485d, 3.533930913758865E-4d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(9.617656016062085d);
        normalDistributionImpl0.setStandardDeviation(0.003989422711686265d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.0d);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(18.0000005d);
        normalDistributionImpl0.setMean(52.0d);
        double double10 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989389075407833d + "'", double4 == 0.3989389075407833d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999999999999993d + "'", double7 == 0.9999999999999993d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double8 = normalDistributionImpl0.inverseCumulativeProbability(0.003989391072013627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.652966346597469d) + "'", double8 == (-2.652966346597469d));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.003447496149865155d, 101.0d);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.density((java.lang.Double) 0.50000402809845d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3511030636567253d + "'", double5 == 0.3511030636567253d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.004112752374661897d + "'", double10 == 0.004112752374661897d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 1);
        normalDistributionImpl0.setStandardDeviation(1.4774954927042859E-22d);
        normalDistributionImpl0.setStandardDeviation(0.8511172425430698d);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.24197066910440684d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6119088732813208d + "'", double16 == 0.6119088732813208d);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 101.0000002290142d);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.26831686462225557d, 0.5009719973078852d);
        normalDistributionImpl2.setStandardDeviation(0.30446746012271947d);
        double double11 = normalDistributionImpl2.density((java.lang.Double) 1.486658076023932d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8385529758034967d + "'", double4 == 0.8385529758034967d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.189674862301045E-4d + "'", double7 == 9.189674862301045E-4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 9.687755967937495E-5d + "'", double11 == 9.687755967937495E-5d);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.539827837277029d);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) (-1L));
        normalDistributionImpl2.setMean(0.39891637076145464d);
        double double10 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.cumulativeProbability((-2.2918674664154666d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 55.1999999998222d + "'", double5 == 55.1999999998222d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.04883560073156118d + "'", double7 == 0.04883560073156118d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.39891637076145464d + "'", double10 == 0.39891637076145464d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.46649363228968105d + "'", double12 == 0.46649363228968105d);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', 97.0d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.004112713891356671d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.004112807010969372d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.37075494931537706d + "'", double5 == 0.37075494931537706d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3707549496780816d + "'", double7 == 0.3707549496780816d);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.3989389075407833d, 0.5d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.155983485151227E-4d + "'", double7 == 4.155983485151227E-4d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 'a');
        double double11 = normalDistributionImpl0.cumulativeProbability((-22.76824609551198d));
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.inverseCumulativeProbability((-2.2918674664154666d));
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) Double.NEGATIVE_INFINITY);
        double double13 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10);
        normalDistributionImpl0.setMean(0.02151428054220411d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.024746719397949448d);
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
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.46250029182707436d, 0.004112751329122643d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.004112751329122643d + "'", double3 == 0.004112751329122643d);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(9.617656016062085d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.011398072438227633d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.003439130075321901d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(98.99999977098578d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(2.8165665442762825E-24d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 91.0d + "'", double10 == 91.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.5009719973078852d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-83.76480972721147d));
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9 == 2.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5000000000000052d, 0.9597790821736437d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double7 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability(0.24197072451914337d, (double) (short) 100);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.003989422801720462d);
        normalDistributionImpl2.setStandardDeviation(0.011398350813317663d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.49034770664643224d + "'", double10 == 0.49034770664643224d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5001591549387787d + "'", double12 == 0.5001591549387787d);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        normalDistributionImpl0.setMean((-0.25632498330402864d));
        normalDistributionImpl0.setStandardDeviation(0.04883560073156118d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.8413447460685395d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, (double) 1L);
        double double13 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.5095890191126843d);
        double double17 = normalDistributionImpl0.density((java.lang.Double) 0.9949360047253046d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setMean(100.0d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-83.76480972721147d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        java.lang.Class<?> wildcardClass23 = normalDistributionImpl0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        double double20 = normalDistributionImpl0.cumulativeProbability(4.996003610813204E-16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0024364383453520616d + "'", double11 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.7581570254009424E-5d + "'", double14 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1597791228150634d + "'", double16 == 0.1597791228150634d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.49997707735442853d + "'", double20 == 0.49997707735442853d);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5301815628459023d);
        normalDistributionImpl2.setStandardDeviation(0.0033303210636190686d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability(0.4850139316775809d, 6.767237638966325E-27d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-3.3306690738754696E-16d) + "'", double11 == (-3.3306690738754696E-16d));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.005915351705566119d);
        normalDistributionImpl0.setStandardDeviation(10.100000163096063d);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3989422804014327d + "'", double2 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability(0.39884996302130266d);
        normalDistributionImpl0.setMean(0.5040019287905985d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 8.723175385641783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6549981199955597d + "'", double6 == 0.6549981199955597d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.542184725969929E-16d + "'", double10 == 8.542184725969929E-16d);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3885026417343065d, 0.011398350853397575d);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 0, 0.539827837277029d);
        double double4 = normalDistributionImpl2.cumulativeProbability(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        double double6 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.30855485436716207d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.3306690738754696E-16d) + "'", double4 == (-3.3306690738754696E-16d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.996003610813204E-16d + "'", double6 == 4.996003610813204E-16d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.551115123125783E-16d) + "'", double8 == (-5.551115123125783E-16d));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.27389214325950473d, 0.5902872315713317d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation(97.0d);
        double double7 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.4999999999999999d);
        normalDistributionImpl2.setMean(98.52557187804089d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9949360047253046d, 0.00411206605241144d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 96.65780841917969d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double14 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) (byte) 100);
        normalDistributionImpl0.setStandardDeviation(0.5955985761504836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.0024364383453520616d);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.3989389075407833d);
        normalDistributionImpl0.setStandardDeviation((double) 1L);
        double double12 = normalDistributionImpl0.cumulativeProbability(11.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0000000000000004d + "'", double12 == 1.0000000000000004d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003971497250408449d, (double) 100.0f);
        normalDistributionImpl2.setMean(0.011398350795231223d);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        normalDistributionImpl0.setStandardDeviation((double) 10);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 6.767237638966325E-27d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.039894228040143274d + "'", double8 == 0.039894228040143274d);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.9949360047253046d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.density((java.lang.Double) (-1.000415598348515d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        double double16 = normalDistributionImpl0.cumulativeProbability(0.38852033512092876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 54.695998068151596d + "'", double14 == 54.695998068151596d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, 0.00411206605241144d);
        double double10 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.004982565585890275d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability(0.9988689163583906d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.004982565585890275d + "'", double13 == 0.004982565585890275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 100, (double) (short) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.18525877776317726d, 0.15865525393145702d);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.005268537016191098d);
        normalDistributionImpl0.setMean(0.003713014007658319d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) (-3.3306690738754696E-16d));
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.02419707245191434d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.004112807014447759d + "'", double9 == 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.004112807014447759d + "'", double11 == 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0041128068864829635d + "'", double13 == 0.0041128068864829635d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.005996816717407816d, 0.16865538677429714d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.inverseCumulativeProbability((-161.1434197887031d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05208127941521934d + "'", double6 == 0.05208127941521934d);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.09467574302164261d, 0.02151428054220411d);
        normalDistributionImpl2.setStandardDeviation(52.0d);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.1102230246251565E-16d), 0.5041127341632511d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.004112723567028872d);
        normalDistributionImpl2.setMean((-1.312499901071692d));
        double double16 = normalDistributionImpl2.density((java.lang.Double) 0.0023956230879392023d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011398350789919569d + "'", double12 == 0.011398350789919569d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.011390309958620738d + "'", double16 == 0.011390309958620738d);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(3.497202527569243E-15d, 0.011398350813317663d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0013711354501702022d, 0.26831686462225557d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.8206667139258397d);
        normalDistributionImpl2.setStandardDeviation(42.630353990821625d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.inverseCumulativeProbability((-0.25632498330402864d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9988689163583906d + "'", double4 == 0.9988689163583906d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        normalDistributionImpl2.setStandardDeviation(0.691462461274013d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.26831686462225557d, (double) 1.0f);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.39884996302130266d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.27574252188645465d + "'", double7 == 0.27574252188645465d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.48952145673858083d + "'", double9 == 0.48952145673858083d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        double double21 = normalDistributionImpl2.cumulativeProbability(4.262705371416836E-21d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-266.9999995d) + "'", double14 == (-266.9999995d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 36.0d + "'", double16 == 36.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 36.0d + "'", double19 == 36.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.5d + "'", double21 == 0.5d);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (short) 100);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        normalDistributionImpl2.setMean(0.8511172425430698d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.3164209905295682d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8511172425430698d + "'", double5 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.039837239966761334d + "'", double9 == 0.039837239966761334d);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        double double16 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        double double18 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3989422804014327d + "'", double8 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.NEGATIVE_INFINITY + "'", double10 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999999999999857d, 0.35261690698442966d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999999999999857d + "'", double3 == 0.9999999999999857d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-157.44388116860097d), 99.72787526763412d);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getMean();
        double double16 = normalDistributionImpl0.cumulativeProbability(9.992007221626409E-16d, 0.8410709021576761d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.6534818342543749d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 9.687755967937495E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6104871705771893d + "'", double11 == 0.6104871705771893d);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        double double11 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.cumulativeProbability(0.5041127341632512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        normalDistributionImpl2.setStandardDeviation(0.691462461274013d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.26831686462225557d, (double) 1.0f);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.39884996302130266d);
        double double11 = normalDistributionImpl2.density((java.lang.Double) 35.99999999962154d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.27574252188645465d + "'", double7 == 0.27574252188645465d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.48952145673858083d + "'", double9 == 0.48952145673858083d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        normalDistributionImpl0.setStandardDeviation(0.8413447460685395d);
        normalDistributionImpl0.setMean((double) 100.0f);
        normalDistributionImpl0.setStandardDeviation(0.039894228040143274d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.49034770664643224d);
        normalDistributionImpl0.setMean(0.5301815628459023d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        double double17 = normalDistributionImpl0.cumulativeProbability(0.463391164310498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35375207302115724d + "'", double12 == 0.35375207302115724d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.47337428360028555d + "'", double17 == 0.47337428360028555d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.3511030636567253d);
        normalDistributionImpl2.setMean(97.4423124760719d);
        normalDistributionImpl2.setMean(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25820249755352387d + "'", double4 == 0.25820249755352387d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(36.0d, 0.012462652646205209d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-7.977165358279764d), 0.656004283871861d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 0.8413447460685395d);
        double double3 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(99.71461122256248d);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-0.839660072847429d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 99.71461122256248d + "'", double6 == 99.71461122256248d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        normalDistributionImpl2.setStandardDeviation(1.0000000000000073d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(2.67058236195435E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.3306690738754696E-16d) + "'", double4 == (-3.3306690738754696E-16d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 89.16733128943515d + "'", double8 == 89.16733128943515d);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.004112723567028872d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.cumulativeProbability((double) 1L);
        double double17 = normalDistributionImpl0.density((java.lang.Double) 0.13212396732606452d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl0.cumulativeProbability(2.0d, 0.3988974611574716d);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(1.7143132971519925E-6d);
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.01945305528714028d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        normalDistributionImpl0.setStandardDeviation(0.3989415253831241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9015863634979064d, 0.07223569176415257d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        normalDistributionImpl0.setMean(97.0d);
        double double12 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.4062051513498445d);
        double double16 = normalDistributionImpl0.cumulativeProbability((-0.839660072847429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999999857d + "'", double8 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 96.7626822507217d + "'", double14 == 96.7626822507217d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl0.cumulativeProbability((double) 10, 0.07223569176415257d);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.617656016062085d + "'", double16 == 9.617656016062085d);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NaN, (double) 1.0f);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.04883560073156118d);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        normalDistributionImpl0.setStandardDeviation(0.8413447460685395d);
        normalDistributionImpl0.setMean((double) 100.0f);
        double double16 = normalDistributionImpl0.getMean();
        double double17 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.8413447460685395d + "'", double17 == 0.8413447460685395d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        double double25 = normalDistributionImpl0.cumulativeProbability(6.106226635438361E-16d, 1.486658076023932d);
        java.lang.Class<?> wildcardClass26 = normalDistributionImpl0.getClass();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5295573167386503d + "'", double25 == 0.5295573167386503d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 0.003971497250408449d);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 0L, 0.13212396732606452d);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7302208489873937d + "'", double5 == 0.7302208489873937d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0024364383453520616d + "'", double8 == 0.0024364383453520616d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.3989422804014327d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003859293226999287d + "'", double4 == 0.003859293226999287d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(42.867561125735264d, 36.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.011398350799319024d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(7.267167198656892E-9d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 0.05247175082918987d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11693498857496193d + "'", double4 == 0.11693498857496193d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-161.1434197887031d) + "'", double8 == (-161.1434197887031d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.005463398338535415d + "'", double10 == 0.005463398338535415d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.5d);
        double double4 = normalDistributionImpl2.cumulativeProbability(97.0d);
        normalDistributionImpl2.setStandardDeviation(0.02151428054220411d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(0.039826002957502736d, (-40.982844046802896d));
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
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003391125823206404d, (double) 10L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5095890191126843d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.24377533629588963d + "'", double4 == 0.24377533629588963d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003391125823206404d + "'", double6 == 0.003391125823206404d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.003391125823206404d + "'", double7 == 0.003391125823206404d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003391125823206404d + "'", double8 == 0.003391125823206404d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9949360047253046d, 0.00411206605241144d);
        double double4 = normalDistributionImpl2.cumulativeProbability(8.603904923161464d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.656004283871861d, 0.5040321215980881d);
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
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) -1, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability((-1.1102230246251565E-15d), (-1.2561529682171768d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 100, (double) (short) 100);
        normalDistributionImpl2.setMean(0.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5039893563146316d + "'", double6 == 0.5039893563146316d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-28.79778829638325d), 0.36348329932713447d);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8511172425430698d, 0.00411206605241144d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00411206605241144d + "'", double3 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.00411206605241144d + "'", double5 == 0.00411206605241144d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.24463748165229704d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 99.30853753729033d + "'", double11 == 99.30853753729033d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 32.0d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) (short) 1);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.09467574302164261d);
        double double13 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.26480951088062704d + "'", double12 == 0.26480951088062704d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation(97.0d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.46250029182707436d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.131257918593757d) + "'", double8 == (-10.131257918593757d));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability((double) (byte) 0);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability((double) '4', 0.039837239966761334d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8385529758034967d, 0.40985459992980544d);
        double double4 = normalDistributionImpl2.cumulativeProbability(6.106226635438361E-16d);
        double double5 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.020379329894292586d + "'", double4 == 0.020379329894292586d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8385529758034967d + "'", double5 == 0.8385529758034967d);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.011394981174247374d, (double) 10.0f);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.003989391072013627d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0039653596604568575d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.04100846842391914d + "'", double10 == 0.04100846842391914d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.004112807010969372d + "'", double12 == 0.004112807010969372d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5000163087590218d + "'", double14 == 0.5000163087590218d);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        // The following exception was thrown during execution in test generation
        try {
            double double22 = normalDistributionImpl2.inverseCumulativeProbability((double) (-1));
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 36.0d + "'", double19 == 36.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setStandardDeviation(10.0d);
        double double6 = normalDistributionImpl0.cumulativeProbability(0.30713001079381186d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5122507886537644d + "'", double6 == 0.5122507886537644d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, 0.39891637076145464d);
        double double5 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, (double) (byte) 10);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.5000744304523199d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8106088131500386d + "'", double5 == 0.8106088131500386d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.39891637076145464d + "'", double6 == 0.39891637076145464d);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        double double7 = normalDistributionImpl2.inverseCumulativeProbability(0.003949921231149102d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004112807014447759d + "'", double5 == 0.004112807014447759d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-257.663117521717d) + "'", double7 == (-257.663117521717d));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 0.8413447460685395d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getMean();
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8413447460685395d + "'", double4 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.003447496149865155d, 0.9949360047253046d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.1096616106907986d);
        double double18 = normalDistributionImpl2.inverseCumulativeProbability(0.035024460672673785d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-2.942091015256665E-15d) + "'", double13 == (-2.942091015256665E-15d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.80133765617596d + "'", double18 == 100.80133765617596d);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.0024364383453520616d);
        normalDistributionImpl0.setMean(2.7581570254009424E-5d);
        double double10 = normalDistributionImpl0.cumulativeProbability(101.0000002290142d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) -1, 4.0161707293151494E-11d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.02151428054220411d, (-43.42007985654189d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.004112723567028872d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.0020678144699498024d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.cumulativeProbability((-3.241851231905457E-14d));
        normalDistributionImpl2.setMean(0.0d);
        double double12 = normalDistributionImpl2.cumulativeProbability(98.52557187804089d, 101.0000002290142d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.13934966669526672d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5041127341632511d + "'", double7 == 0.5041127341632511d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.005996816717407816d + "'", double12 == 0.005996816717407816d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5005731180895113d + "'", double14 == 0.5005731180895113d);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability(7.782792010140924E-24d, 0.004112713891356671d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 4.996003610813204E-16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, 0.39891637076145464d);
        normalDistributionImpl2.setStandardDeviation(0.04100846842391914d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.04100846842391914d + "'", double5 == 0.04100846842391914d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.04100846842391914d + "'", double6 == 0.04100846842391914d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.04100846842391914d + "'", double7 == 0.04100846842391914d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setStandardDeviation(0.9999999999999857d);
        double double13 = normalDistributionImpl0.cumulativeProbability((double) (byte) 100);
        double double15 = normalDistributionImpl0.cumulativeProbability(1.4866698082023473d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-2.3203661214665772E-14d) + "'", double15 == (-2.3203661214665772E-14d));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        normalDistributionImpl0.setMean((double) (byte) 10);
        normalDistributionImpl0.setMean(0.003987627967620997d);
        double double16 = normalDistributionImpl0.cumulativeProbability(1.4203249534089945E-25d, 0.17567111172148175d);
        double double18 = normalDistributionImpl0.inverseCumulativeProbability(0.03980208177438576d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.008260026356572E-4d + "'", double16 == 7.008260026356572E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-175.29475607165153d) + "'", double18 == (-175.29475607165153d));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        double double16 = normalDistributionImpl0.cumulativeProbability(1.6653345369377348E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1), 101.0000002290142d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability((-1.7134509881791207d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 101.0000002290142d + "'", double4 == 101.0000002290142d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.003447496149865155d, 0.9949360047253046d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double18 = normalDistributionImpl2.cumulativeProbability(0.005383918863507501d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-2.942091015256665E-15d) + "'", double13 == (-2.942091015256665E-15d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.275957200481571E-15d) + "'", double18 == (-2.275957200481571E-15d));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getMean();
        double double16 = normalDistributionImpl0.density((java.lang.Double) 0.0023956230879392023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.398941135636211d + "'", double16 == 0.398941135636211d);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.24463748165229704d, Double.NaN);
        normalDistributionImpl0.setStandardDeviation(0.50000402809845d);
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.8405931241353324d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.50000402809845d + "'", double10 == 1.50000402809845d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.50000402809845d + "'", double11 == 0.50000402809845d);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.005915351705566119d);
        double double6 = normalDistributionImpl0.cumulativeProbability(0.0032766542929493826d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3989422804014327d + "'", double2 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7101845133435983d + "'", double6 == 0.7101845133435983d);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(4.4003238434786596E-5d, 0.06349307036251645d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.003989422711686265d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5247740780939647d + "'", double4 == 0.5247740780939647d);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        normalDistributionImpl0.setStandardDeviation(0.0039695706906738215d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5d + "'", double17 == 0.5d);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.005268537016191098d, 0.15865525393145702d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 32.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.inverseCumulativeProbability((-5.551115123125783E-16d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.01945305528714028d + "'", double4 == 0.01945305528714028d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.15865525393145702d + "'", double7 == 0.15865525393145702d);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 100, (double) (short) 1);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.463391164310498d, 9.807518179365436d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5020563944007155d, 0.9988689163583906d);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.33048081834283766d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.1096616106907986d);
        normalDistributionImpl0.setStandardDeviation(0.8413447460685395d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.inverseCumulativeProbability(42.867924615772125d);
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
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.100000163096063d, 0.02419707245191434d);
        normalDistributionImpl2.setMean(0.38767317623584496d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.1102230246251565E-15d), 0.2929905121210513d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 32.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability(0.011398350813317663d, 9.041047069588415E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.691462461274013d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.0014324330216118912d);
        double double9 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003447496149865155d + "'", double6 == 0.003447496149865155d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-43.42007985654189d) + "'", double8 == (-43.42007985654189d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0013711354501702022d, 0.26831686462225557d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.8206667139258397d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9988689163583906d + "'", double4 == 0.9988689163583906d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        double double21 = normalDistributionImpl0.cumulativeProbability(0.2738700294039217d);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.571107425038754d + "'", double21 == 0.571107425038754d);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, 0.00411206605241144d);
        double double10 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.004982565585890275d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double15 = normalDistributionImpl0.density((java.lang.Double) 0.5000162450984852d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.004982565585890275d + "'", double13 == 0.004982565585890275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.0d);
        normalDistributionImpl0.setStandardDeviation(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl0.inverseCumulativeProbability(101.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.011398350853397575d);
        double double16 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.011398350853397575d + "'", double16 == 0.011398350853397575d);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) (-26.42666130238155d));
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.inverseCumulativeProbability(100.3988499631105d);
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
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.005915351705566119d);
        normalDistributionImpl0.setStandardDeviation(10.100000163096063d);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3989422804014327d + "'", double2 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.100000163096063d + "'", double7 == 10.100000163096063d);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(42.867561125735264d, 36.0d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 42.867561125735264d + "'", double3 == 42.867561125735264d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.cumulativeProbability(2.7581570254009424E-5d);
        double double11 = normalDistributionImpl2.density((java.lang.Double) (-26.42666130238155d));
        double double12 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05208137124318141d + "'", double9 == 0.05208137124318141d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.186529907183186E-4d + "'", double11 == 6.186529907183186E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        normalDistributionImpl0.setStandardDeviation(0.5040087641844329d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setMean(100.0d);
        double double7 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.density((java.lang.Double) 0.39894227645996516d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.002429360429096111d + "'", double10 == 0.002429360429096111d);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.17567111172148175d, 0.0016640454911561742d);
        double double4 = normalDistributionImpl2.cumulativeProbability(2.972322388217208E-11d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setMean(0.004112807014447759d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.inverseCumulativeProbability(99.71461122256248d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(55.1999999998222d);
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(4.0161707293151494E-11d, 7.267167198656892E-9d);
        normalDistributionImpl0.setStandardDeviation(0.9999999999999993d);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.972322388217208E-11d + "'", double10 == 2.972322388217208E-11d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.cumulativeProbability((-3.241851231905457E-14d));
        double double9 = normalDistributionImpl2.cumulativeProbability(0.004982565440835918d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5041127341632511d + "'", double7 == 0.5041127341632511d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5041332253989657d + "'", double9 == 0.5041332253989657d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setMean(55.1999999998222d);
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.cumulativeProbability(0.1586552539314552d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.0977872677871649d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 55.1999999998222d + "'", double7 == 55.1999999998222d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 53.905736894585544d + "'", double11 == 53.905736894585544d);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        double double18 = normalDistributionImpl0.cumulativeProbability((-83.76480972721147d));
        normalDistributionImpl0.setStandardDeviation(0.1096616106907986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.100000163096063d + "'", double15 == 10.100000163096063d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9980473674631738d, (-0.12378651771055364d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.8413447460685395d);
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.002431572128965361d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 0.003971497250408449d);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 0L, 0.13212396732606452d);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7302208489873937d + "'", double5 == 0.7302208489873937d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.01666635779967479d + "'", double15 == 0.01666635779967479d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.4062051513498445d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(11.0d, 0.003971497250408449d);
        double double4 = normalDistributionImpl2.cumulativeProbability(8.603904923161464d);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(2.8165665442762825E-24d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.1939162683106727d, 0.0024364383453520616d);
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
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setMean(100.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.cumulativeProbability(0.5047652121381858d, 0.005996816717407816d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        normalDistributionImpl2.setStandardDeviation(0.691462461274013d);
        normalDistributionImpl2.setMean((-266.9999995d));
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-266.9999995d) + "'", double7 == (-266.9999995d));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.13212396732606452d, 0.24197072451914683d);
        double double3 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.8410709021576761d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.13212396732606452d + "'", double3 == 0.13212396732606452d);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double8 = normalDistributionImpl0.cumulativeProbability(3.533930913758865E-4d);
        double double9 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.inverseCumulativeProbability(99.03989407290815d);
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
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.3989422804014327d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.39276307230455315d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003859293226999287d + "'", double4 == 0.003859293226999287d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.603904923161464d + "'", double6 == 8.603904923161464d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.cumulativeProbability(4.0161707293151494E-11d, 100.88014208468009d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(0.0013711354501702022d, (-75.29874369961907d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4774954927042859E-22d + "'", double4 == 1.4774954927042859E-22d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6509972405365397d + "'", double8 == 0.6509972405365397d);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
            double double14 = normalDistributionImpl0.inverseCumulativeProbability(8.347036338244843d);
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
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0977872677871649d + "'", double18 == 0.0977872677871649d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.691462461274013d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.3848369645341492d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(5.22818092574262E-6d, 2.8165665442762825E-24d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003447496149865155d + "'", double6 == 0.003447496149865155d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 42.630353990821625d + "'", double8 == 42.630353990821625d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 10L);
        double double15 = normalDistributionImpl0.cumulativeProbability((-1.2561529682171768d), 2.0d);
        normalDistributionImpl0.setMean(0.004112723567028872d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.011398350853397575d);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setStandardDeviation(0.9999999999999857d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.5040019287905985d);
        double double14 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.5898808682478716E-259d + "'", double13 == 1.5898808682478716E-259d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4173336454418454d, 0.5000000000000052d);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 0.003971497250408449d);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 0L, 0.13212396732606452d);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.inverseCumulativeProbability((-0.016813778839715805d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7302208489873937d + "'", double5 == 0.7302208489873937d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d);
        normalDistributionImpl0.setMean(102.8822897425016d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.004982565585890275d);
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
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (byte) -1);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 0);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(2.8165665442762825E-24d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 91.0d + "'", double10 == 91.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.691462461274013d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.density((java.lang.Double) 2.8165665442762825E-24d);
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.37075494931537706d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 0.0f);
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.cumulativeProbability(0.49999999999998024d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 100, (double) (short) 100);
        double double3 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.2738700294039217d, 99.99999909265232d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.8511172425430698d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(1.2989609388114332E-14d);
        double double16 = normalDistributionImpl2.cumulativeProbability(3.533930913758865E-4d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-266.9999995d) + "'", double14 == (-266.9999995d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.50000402809845d + "'", double16 == 0.50000402809845d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', 0.5045637245140185d);
        normalDistributionImpl2.setMean(0.5000162450984852d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.486658076023932d, 0.14489999812567278d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.486658076023932d + "'", double3 == 1.486658076023932d);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        normalDistributionImpl0.setStandardDeviation(0.38134713065470394d);
        double double24 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8410709021576761d, 0.0539057471196433d);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.691462461274013d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.539827837277029d);
        double double6 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.312499901071692d), (-257.663117521717d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-7.977165358279764d), 0.656004283871861d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.3989389075407833d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-8.145164570864665d) + "'", double4 == (-8.145164570864665d));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8385529758034967d, 0.40985459992980544d);
        double double4 = normalDistributionImpl2.cumulativeProbability(6.106226635438361E-16d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.0038536028656297734d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.007226029381657778d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.020379329894292586d + "'", double4 == 0.020379329894292586d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12235809905798467d + "'", double6 == 0.12235809905798467d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.1638802027473609d) + "'", double8 == (-0.1638802027473609d));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.02151428054220411d, 0.39276307230455315d);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.13686927466582383d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.3306690738754696E-16d) + "'", double4 == (-3.3306690738754696E-16d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.106226635438361E-16d + "'", double7 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        double double19 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0024364383453520616d + "'", double11 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.7581570254009424E-5d + "'", double14 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.004112723567028872d, 0.005383918863507501d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability(0.50000402809845d, 0.015559785378119362d);
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
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
            double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.011398350813317663d);
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
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NaN, 0.003949881050253595d);
        double double3 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 1);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(Double.NaN);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.09467574302164261d);
        double double15 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.0d + "'", double12 == 101.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.3164209905295682d);
        double double9 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.49967791011510215d);
        normalDistributionImpl2.setStandardDeviation(0.9999998557845271d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003970761836563756d + "'", double8 == 0.003970761836563756d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        normalDistributionImpl0.setStandardDeviation(0.011397187830924622d);
        normalDistributionImpl0.setMean(0.003369916363094223d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003391125823206404d, (double) 10L);
        double double3 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.003391125823206404d + "'", double3 == 0.003391125823206404d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(54.943905406602084d, 0.463391164310498d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double10 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.6509972405365397d);
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
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double9 = normalDistributionImpl0.density((java.lang.Double) 1.0d);
        normalDistributionImpl0.setStandardDeviation(0.0021142574024273783d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-5.551115123125783E-16d));
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.24197072451914683d + "'", double7 == 0.24197072451914683d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.24197072451914337d + "'", double9 == 0.24197072451914337d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setMean(0.9999999999999982d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.3684295859056615d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2419707245191438d + "'", double11 == 0.2419707245191438d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.26383381213934287d + "'", double13 == 0.26383381213934287d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.004112723567028872d);
        normalDistributionImpl2.setMean(0.011398350799319024d);
        normalDistributionImpl2.setStandardDeviation(100.3988499631105d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011398350789919569d + "'", double12 == 0.011398350789919569d);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((-1.000415598348515d), 0.27574252188645465d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        normalDistributionImpl2.setStandardDeviation(0.691462461274013d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.3511030636567253d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0024364383453520616d + "'", double5 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.508076258511588d + "'", double7 == 0.508076258511588d);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0014324330216118912d, 0.7302208489873937d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability((-34.82724682411482d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) (-26.42666130238155d));
        double double12 = normalDistributionImpl0.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.25536251834768864d, 1.4774954927042859E-22d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.691462461274013d);
        normalDistributionImpl2.setStandardDeviation(0.02419707245191434d);
        double double8 = normalDistributionImpl2.cumulativeProbability((-75.29874369961907d));
        normalDistributionImpl2.setStandardDeviation(4.262705371416836E-21d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4997574798200302d, (-43.77648420718779d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        normalDistributionImpl2.setStandardDeviation(0.15865525393145702d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(2.034906530007112d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15865525393145702d + "'", double11 == 0.15865525393145702d);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        double double19 = normalDistributionImpl0.density((java.lang.Double) 0.6930673530947105d);
        double double21 = normalDistributionImpl0.cumulativeProbability((-0.839660072847429d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.33901596247314525d + "'", double19 == 0.33901596247314525d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.15803064154104046d + "'", double21 == 0.15803064154104046d);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003447496149865155d, 0.09467574302164261d);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.03980208177438576d, 101.0000002290142d);
        double double6 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35049274541515896d + "'", double5 == 0.35049274541515896d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003447496149865155d + "'", double6 == 0.003447496149865155d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.0024364383453520616d);
        normalDistributionImpl0.setMean(5.390634484996413E-4d);
        double double9 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.390634484996413E-4d + "'", double9 == 5.390634484996413E-4d);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.38767317623584496d);
        normalDistributionImpl2.setStandardDeviation(0.5041291410139574d);
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 42.867561125735264d + "'", double5 == 42.867561125735264d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        normalDistributionImpl0.setStandardDeviation(0.5040087641844329d);
        normalDistributionImpl0.setStandardDeviation(0.38327737736684997d);
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
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NaN, 0.003949881050253595d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        normalDistributionImpl0.setStandardDeviation(2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.NEGATIVE_INFINITY + "'", double12 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        normalDistributionImpl0.setMean(0.039837239966761334d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.8165665442762825E-24d + "'", double15 == 2.8165665442762825E-24d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(100.9968985579339d, 0.38852033512092876d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(9.807518179365436d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        double double15 = normalDistributionImpl0.getStandardDeviation();
        double double16 = normalDistributionImpl0.getStandardDeviation();
        double double17 = normalDistributionImpl0.getStandardDeviation();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        double double20 = normalDistributionImpl0.cumulativeProbability(0.0033293208790807836d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0024364383453520616d + "'", double11 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.7581570254009424E-5d + "'", double14 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1597791228150634d + "'", double16 == 0.1597791228150634d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.49999035942305375d + "'", double20 == 0.49999035942305375d);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.0d, 0.003989422748607731d);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(32.0d, 0.691462461274013d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.density((java.lang.Double) 2.8165665442762825E-24d);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.0d, 0.1096616106907986d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1096616106907986d + "'", double4 == 0.1096616106907986d);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8106088131500386d, 0.8511172425430698d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-4.499371909342156d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        normalDistributionImpl2.setStandardDeviation(1.0000000000000073d);
        double double7 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean((-0.3319024716718828d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.3306690738754696E-16d) + "'", double4 == (-3.3306690738754696E-16d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5955985761504836d, 0.03969485302638689d);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(8.723175385778642d, 101.0000002290142d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 101.0000002290142d + "'", double3 == 101.0000002290142d);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(11.0d, 0.3700968566970246d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.6119088732813208d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.000281888165388E-172d + "'", double4 == 9.000281888165388E-172d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 92.00000215d + "'", double15 == 92.00000215d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5095890191126843d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.003391125823206404d);
        normalDistributionImpl0.setStandardDeviation(4.155983485151227E-4d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.3796360778440238d) + "'", double9 == (-1.3796360778440238d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.155983485151227E-4d + "'", double12 == 4.155983485151227E-4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(3.533930913758865E-4d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl0.cumulativeProbability((double) (byte) 100, 0.6148878559046674d);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 11.0d + "'", double18 == 11.0d);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.24463748165229704d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 35.99999999962154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 99.30853753729033d + "'", double11 == 99.30853753729033d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(42.867561125735264d, 36.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.011398350799319024d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11693498857496193d + "'", double4 == 0.11693498857496193d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 78.8675611267685d + "'", double8 == 78.8675611267685d);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 1);
        normalDistributionImpl0.setStandardDeviation(1.4774954927042859E-22d);
        normalDistributionImpl0.setStandardDeviation(0.8511172425430698d);
        double double16 = normalDistributionImpl0.density((java.lang.Double) 0.002359870124408081d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4687259604030156d + "'", double16 == 0.4687259604030156d);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 0, 0.012462652646205209d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.003976677061955973d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.625169930649095d + "'", double4 == 0.625169930649095d);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(4.703838883365341E-4d, 4.703838883365341E-4d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.703838883365341E-4d + "'", double5 == 4.703838883365341E-4d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        normalDistributionImpl2.setStandardDeviation(1.0000000000000073d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(0.14705851874594073d, 0.004112807010969372d);
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
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.3989389075407833d, 0.5d);
        normalDistributionImpl2.setMean(0.011394981174247374d);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.3989422804012685d);
        double double12 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.155983485151227E-4d + "'", double7 == 4.155983485151227E-4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-24.82893083470349d) + "'", double11 == (-24.82893083470349d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        normalDistributionImpl0.setStandardDeviation(11.0d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.05208137124318141d);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.cumulativeProbability(0.5020563944007155d, (-25.11376863225348d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03626707353288911d + "'", double8 == 0.03626707353288911d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 11.0d + "'", double9 == 11.0d);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability((-220.8518389289271d));
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.4203249534089945E-25d, 8.326672684688674E-16d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double9 = normalDistributionImpl0.getMean();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.539827837277029d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.14489999812567278d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        normalDistributionImpl0.setMean(0.0d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.9727648049862614d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 101.0000002290142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.36348329932713447d, (-3.0530841394224146d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.07223569176415257d, 1.4203249534089945E-25d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(36.0d, 0.40985459992980544d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation(97.0d);
        double double7 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        double double17 = normalDistributionImpl0.getStandardDeviation();
        double double18 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999999857d + "'", double8 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.972322388217208E-11d + "'", double17 == 2.972322388217208E-11d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.972322388217208E-11d + "'", double18 == 2.972322388217208E-11d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.0d, 0.1096616106907986d);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) Double.NEGATIVE_INFINITY);
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.691462461274013d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.0014324330216118912d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003447496149865155d + "'", double6 == 0.003447496149865155d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-43.42007985654189d) + "'", double8 == (-43.42007985654189d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl0.setStandardDeviation((double) '4');
        normalDistributionImpl0.setStandardDeviation((double) 'a');
        double double7 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.cumulativeProbability(0.1939162683106727d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5007975396572893d + "'", double9 == 0.5007975396572893d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double3 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double9 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        double double12 = normalDistributionImpl0.cumulativeProbability((-2.557907301394329d), 0.0014324330216118912d);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.cumulativeProbability(2.7581570254009424E-5d);
        normalDistributionImpl2.setMean(0.003970761836563756d);
        double double12 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05208137124318141d + "'", double9 == 0.05208137124318141d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003970761836563756d + "'", double12 == 0.003970761836563756d);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double11 = normalDistributionImpl2.density((java.lang.Double) 0.003859293226999287d);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.04100846842391914d);
        double double17 = normalDistributionImpl2.density((java.lang.Double) 0.005383918863507501d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.011398350799319024d + "'", double11 == 0.011398350799319024d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 9.64480942297585d + "'", double17 == 9.64480942297585d);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        double double21 = normalDistributionImpl0.cumulativeProbability(0.003989391072013627d, 0.035024460672673785d);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.034003325810914586d + "'", double21 == 0.034003325810914586d);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
            double double18 = normalDistributionImpl0.cumulativeProbability(0.005463398338535415d, 9.206924786140221E-28d);
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
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double14 = normalDistributionImpl2.cumulativeProbability(0.07223569176415257d, 0.11693498857496193d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setMean(55.1999999998222d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.486658076023932d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.0000000000000073d, 1.0000000000000004d);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        normalDistributionImpl2.setStandardDeviation(8.542184725969929E-16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.2906118579297512E-137d, 1.0d);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        double double21 = normalDistributionImpl0.inverseCumulativeProbability(0.6527527593302829d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.00195697928612d + "'", double21 == 100.00195697928612d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setMean(0.9999999999999982d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.0024364383453520616d);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.inverseCumulativeProbability(1.0793856131536207E-20d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(42.867561125735264d, 36.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.011398350799319024d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11693498857496193d + "'", double4 == 0.11693498857496193d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.1685009918038774d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0032766542929493826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0033303210636190686d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0);
        double double12 = normalDistributionImpl0.cumulativeProbability(1.2989609388114332E-14d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        double double16 = normalDistributionImpl0.cumulativeProbability(2.972322388217208E-11d, 0.005915351705566119d);
        double double19 = normalDistributionImpl0.cumulativeProbability(0.039799286795740366d, 0.13934966669526672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5000000000000052d + "'", double12 == 0.5000000000000052d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.002359870124408081d + "'", double16 == 0.002359870124408081d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.03953965024231809d + "'", double19 == 0.03953965024231809d);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        normalDistributionImpl0.setMean(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.inverseCumulativeProbability((double) (byte) 100);
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
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d);
        normalDistributionImpl0.setMean(0.0d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.9727648049862614d);
        double double15 = normalDistributionImpl0.cumulativeProbability(0.5041286058447934d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.6549981199955597d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.inverseCumulativeProbability(93.45487690387074d);
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.3988499631105d + "'", double9 == 100.3988499631105d);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8511172425430698d, 0.00411206605241144d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.14705851874594073d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00411206605241144d + "'", double3 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8468032419723991d + "'", double6 == 0.8468032419723991d);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.39884996302130266d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.011398350813317663d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6534818342543749d + "'", double12 == 0.6534818342543749d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.39893169063000056d + "'", double14 == 0.39893169063000056d);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        normalDistributionImpl2.setMean(0.02151428054220411d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) (-1.1102230246251565E-16d));
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.inverseCumulativeProbability(89.16733128943515d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003989422711686265d + "'", double10 == 0.003989422711686265d);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.6148878559046674d);
        normalDistributionImpl0.setStandardDeviation((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10.0f, (double) (short) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.26831686462225557d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.4999999999999999d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.820885790758915d + "'", double4 == 3.820885790758915d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.025405905646918903d + "'", double6 == 0.025405905646918903d);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.cumulativeProbability(0.1586552539314552d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.6148878559046674d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.inverseCumulativeProbability((-0.3319024716718828d));
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        normalDistributionImpl2.setMean(8.881784197001252E-16d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 266.5371216315712d + "'", double6 == 266.5371216315712d);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5095890191126843d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.003391125823206404d);
        normalDistributionImpl0.setStandardDeviation(4.155983485151227E-4d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.8106088131500386d);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.3796360778440238d) + "'", double9 == (-1.3796360778440238d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.155983485151227E-4d + "'", double12 == 4.155983485151227E-4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) 1.0f);
        normalDistributionImpl0.setMean((double) 'a');
        normalDistributionImpl0.setStandardDeviation(0.49202168628309806d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        double double17 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.00453983869274166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.8511172425430698d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(1.2989609388114332E-14d);
        double double16 = normalDistributionImpl2.density((java.lang.Double) 0.6148878559046674d);
        normalDistributionImpl2.setMean(0.46080199849299264d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-266.9999995d) + "'", double14 == (-266.9999995d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.011396591996517814d + "'", double16 == 0.011396591996517814d);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, 0.39891637076145464d);
        double double5 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, (double) (byte) 10);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double9 = normalDistributionImpl2.cumulativeProbability(0.006616941033833418d);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.11693498857496193d);
        normalDistributionImpl2.setMean(8.326672684688674E-16d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8106088131500386d + "'", double5 == 0.8106088131500386d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.533930913758865E-4d + "'", double7 == 3.533930913758865E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1939162683106727d + "'", double9 == 0.1939162683106727d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.12378651771055364d) + "'", double11 == (-0.12378651771055364d));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6930673530947105d, 0.5902872315713317d);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.density((java.lang.Double) 2.485032182693982E-21d);
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
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.27083010383549005d, 0.5015840382524221d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.6148878559046674d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.656004283871861d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4173336454418454d + "'", double4 == 0.4173336454418454d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7787313192378611d + "'", double6 == 0.7787313192378611d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3164209905295682d, 6.186529907183186E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(1.4203249534089945E-25d, 9.206924786140221E-28d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.cumulativeProbability((-220.8518389289271d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.003713014007658319d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.5040019287905985d, 0.23921277642240243d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 0, 0.539827837277029d);
        normalDistributionImpl2.setStandardDeviation(0.8385529758034967d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.003329563061815601d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5015840382524221d + "'", double6 == 0.5015840382524221d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8385529758034967d + "'", double7 == 0.8385529758034967d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10.0f, (double) (short) 10);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.30446746012271947d);
        normalDistributionImpl2.setMean(1.4866698082023473d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02419707245191434d + "'", double4 == 0.02419707245191434d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.024933565222190875d + "'", double6 == 0.024933565222190875d);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, 0.3989422804014327d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.00411206605241144d);
        double double10 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.4850139316775809d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26831686462225557d + "'", double4 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.43147049479370425d + "'", double7 == 0.43147049479370425d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.486658076023932d + "'", double9 == 1.486658076023932d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.26831686462225557d + "'", double13 == 0.26831686462225557d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 97.0d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.25820249755352387d);
        double double17 = normalDistributionImpl0.cumulativeProbability(0.003369916363094223d, 0.05208127941521934d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003987627967620997d + "'", double11 == 0.003987627967620997d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.9432970451699338E-4d + "'", double17 == 1.9432970451699338E-4d);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(96.84849763215512d, 0.007507297482889052d);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.003447496149865155d, 0.9949360047253046d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.density((java.lang.Double) 0.2929905121210513d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.463391164310498d, 2.034906530007112d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-2.942091015256665E-15d) + "'", double13 == (-2.942091015256665E-15d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.784863435160563E-24d + "'", double16 == 3.784863435160563E-24d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.609024107869118E-15d + "'", double19 == 2.609024107869118E-15d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        normalDistributionImpl0.setMean(100.3988499631105d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.NEGATIVE_INFINITY + "'", double9 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double9 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.cumulativeProbability(96.65780841917969d, (-220.8518389289271d));
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
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability((-4.499371909342156d), (-108.65624978119396d));
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
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0024364383453520616d + "'", double11 == 0.0024364383453520616d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.7581570254009424E-5d + "'", double14 == 2.7581570254009424E-5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1597791228150634d + "'", double16 == 0.1597791228150634d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        normalDistributionImpl0.setMean(Double.NEGATIVE_INFINITY);
        normalDistributionImpl0.setMean((double) '#');
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.003971497250408449d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4866698082023473d + "'", double4 == 1.4866698082023473d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double9 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.04100846842391914d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.inverseCumulativeProbability(1.6286257345981352d);
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
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        double double21 = normalDistributionImpl0.density((java.lang.Double) 0.2738700294039217d);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.15096904407401E-26d + "'", double21 == 4.15096904407401E-26d);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability(71.87668407982403d, 0.5041332253989657d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.05208127941521934d, 2.7581570254009424E-5d);
        double double4 = normalDistributionImpl2.cumulativeProbability((-1.5210055437364645E-14d));
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.003976677061955973d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.05208127941521934d + "'", double5 == 0.05208127941521934d);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        double double7 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003989422804014327d + "'", double6 == 0.003989422804014327d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.003713014007658319d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double10 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(55.1999999998222d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.035024460672673785d + "'", double14 == 0.035024460672673785d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 55.1999999998222d + "'", double15 == 55.1999999998222d);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.36348329932713447d);
        normalDistributionImpl2.setMean(4.0161707293151494E-11d);
        normalDistributionImpl2.setStandardDeviation(0.005463398338535415d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.003391125823206404d + "'", double7 == 0.003391125823206404d);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.005915351705566119d);
        normalDistributionImpl0.setStandardDeviation(10.100000163096063d);
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.0033303210636190686d, 0.3989422804012685d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3989422804014327d + "'", double2 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0156222731740836d + "'", double10 == 0.0156222731740836d);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.6179114221889526d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.26480951088062704d, 36.0d);
        normalDistributionImpl2.setMean(35.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.27574252188645465d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.167381942818698d + "'", double6 == 0.167381942818698d);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.4423124760719d, 2.8165665442762825E-24d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.4423124760719d + "'", double3 == 97.4423124760719d);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999999999999857d, 0.49202168628309806d);
        normalDistributionImpl2.setMean(0.6104871705771893d);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(99.99999909265232d, 91.0d);
        normalDistributionImpl2.setMean(0.2419707245191438d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.1685009918038774d);
        normalDistributionImpl2.setMean(0.4687259604030156d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.49967791011510215d + "'", double6 == 0.49967791011510215d);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1), 0.00411206605241144d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.691462461274013d);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9259408601040021d + "'", double4 == 0.9259408601040021d);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, 0.39891637076145464d);
        normalDistributionImpl2.setStandardDeviation(0.04100846842391914d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.003949881050253595d);
        double double9 = normalDistributionImpl2.cumulativeProbability((-3.0530841394224146d), 0.011398350789919569d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.67058236195435E-15d + "'", double6 == 2.67058236195435E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.1102230246251565E-16d + "'", double9 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setMean(55.1999999998222d);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        double double17 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999999857d + "'", double8 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.005915351705566119d);
        normalDistributionImpl0.setStandardDeviation(10.100000163096063d);
        double double7 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.inverseCumulativeProbability((-2.702681590440559d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3989422804014327d + "'", double2 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, 0.39891637076145464d);
        normalDistributionImpl2.setStandardDeviation(0.04100846842391914d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.011398350795231223d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2223904013319585E-14d + "'", double6 == 1.2223904013319585E-14d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.02151428054220411d, 0.39276307230455315d);
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability(52.0d);
        normalDistributionImpl2.setMean(6.767237638966325E-27d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.3306690738754696E-16d) + "'", double4 == (-3.3306690738754696E-16d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.106226635438361E-16d + "'", double7 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.397673124960754E-6d + "'", double10 == 3.397673124960754E-6d);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6179114221889526d, (double) 100.0f);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 0.49034770664643224d);
        double double13 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.26831686462225557d + "'", double10 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35375207302115724d + "'", double12 == 0.35375207302115724d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setMean(100.0d);
        double double8 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.inverseCumulativeProbability((-1.2212453270876722E-15d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003447496149865155d, 0.09467574302164261d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5095890191126843d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005723383913933699d + "'", double4 == 0.005723383913933699d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.003447496149865155d + "'", double5 == 0.003447496149865155d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.09467574302164261d + "'", double6 == 0.09467574302164261d);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003447496149865155d, 0.09467574302164261d);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.03980208177438576d, 101.0000002290142d);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35049274541515896d + "'", double5 == 0.35049274541515896d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.005268537016191098d, 0.15865525393145702d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 32.0d);
        normalDistributionImpl2.setMean((-24.45881256477745d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.01945305528714028d + "'", double4 == 0.01945305528714028d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L), (double) (-1L));
        double double9 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.0d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(3.533930913758865E-4d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-3.3869331096402027d) + "'", double13 == (-3.3869331096402027d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        normalDistributionImpl0.setMean(0.006233247950937437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.24197072451914337d + "'", double11 == 0.24197072451914337d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
            double double18 = normalDistributionImpl0.cumulativeProbability(0.9259408601040021d, (-1.5260952666245327d));
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
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 0.6527527593302829d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.density((java.lang.Double) 8.723175385778642d);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 0.011398072438227633d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-3.3306690738754696E-16d), 0.5095890191126843d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) (-22.76824609551198d));
        double double6 = normalDistributionImpl2.cumulativeProbability(0.5041127341632511d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8387304421312531d + "'", double6 == 0.8387304421312531d);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-3.3306690738754696E-16d), 0.5095890191126843d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) (-22.76824609551198d));
        normalDistributionImpl2.setMean(0.19557940522778383d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, 0.3989422804014327d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.00411206605241144d);
        double double10 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26831686462225557d + "'", double4 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.43147049479370425d + "'", double7 == 0.43147049479370425d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.486658076023932d + "'", double9 == 1.486658076023932d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setMean(55.1999999998222d);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.inverseCumulativeProbability(0.34044931186123606d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.inverseCumulativeProbability((-2.2918674664154666d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3989422804014327d + "'", double4 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 54.788762813796204d + "'", double9 == 54.788762813796204d);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.8413447460685395d);
        double double12 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0000002290142d + "'", double11 == 101.0000002290142d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
            double double17 = normalDistributionImpl0.inverseCumulativeProbability(1.6286257345981352d);
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
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 10.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d);
        normalDistributionImpl2.setMean(0.035024460672673785d);
        double double9 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.005268537016191098d + "'", double4 == 0.005268537016191098d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05208127941521934d + "'", double6 == 0.05208127941521934d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.035024460672673785d + "'", double9 == 0.035024460672673785d);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, (double) 1L);
        double double13 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.7563873439666164d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability((double) (byte) 0);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.9968985579339d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.cumulativeProbability(0.0d, (-0.016813778839715805d));
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(31.791216817920393d, (-24.82893083470349d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        normalDistributionImpl2.setStandardDeviation(1.6653345369377348E-16d);
        normalDistributionImpl2.setMean(0.12235809905798467d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.6653345369377348E-16d + "'", double9 == 1.6653345369377348E-16d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12235809905798467d + "'", double10 == 0.12235809905798467d);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.50000402809845d);
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.4850139316775809d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.003439130075321901d, 0.4562046874576832d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3988974611574716d + "'", double7 == 0.3988974611574716d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.17278422051147885d + "'", double10 == 0.17278422051147885d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        double double18 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011394981174247374d + "'", double12 == 0.011394981174247374d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-266.9999995d) + "'", double14 == (-266.9999995d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 36.0d + "'", double16 == 36.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) '#');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
        normalDistributionImpl2.setMean(0.02151428054220411d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(0.5769438134336734d, 0.002419867355792806d);
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
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, (-3.7277411409078445E-6d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 1.0d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.3511030636567253d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.02151428054220411d);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.003976677061955973d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.617656016062085d + "'", double6 == 9.617656016062085d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.539394167099525E-23d + "'", double8 == 9.539394167099525E-23d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.220446049250313E-16d + "'", double10 == 2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.cumulativeProbability(0.3511030636567253d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.501444015989837d + "'", double6 == 0.501444015989837d);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double7 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability(0.24197072451914337d, (double) (short) 100);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.003989422801720462d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.49034770664643224d + "'", double10 == 0.49034770664643224d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5001591549387787d + "'", double12 == 0.5001591549387787d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.6148878559046674d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability((-24.82893083470349d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.2300923061989596d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double13 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.NEGATIVE_INFINITY + "'", double12 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        normalDistributionImpl0.setStandardDeviation(11.0d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.05208137124318141d);
        normalDistributionImpl0.setStandardDeviation(0.9999999284129937d);
        double double12 = normalDistributionImpl0.density((java.lang.Double) 3.533930913758865E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03626707353288911d + "'", double8 == 0.03626707353288911d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3989422840492259d + "'", double12 == 0.3989422840492259d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.0d);
        normalDistributionImpl2.setStandardDeviation(0.3700968566970246d);
        normalDistributionImpl2.setMean(0.6179114221889526d);
        double double19 = normalDistributionImpl2.cumulativeProbability(42.630353990821625d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3517027765833526d, 97.1744356189002d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.1744356189002d + "'", double3 == 97.1744356189002d);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double3 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.inverseCumulativeProbability(0.004112807010969372d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-92.49330897918233d) + "'", double7 == (-92.49330897918233d));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.cumulativeProbability(0.1586552539314552d);
        double double13 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.cumulativeProbability(100.96481902940684d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-15.216116946311248d));
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.003976677061955973d, 0.9980260175983502d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.002417358818369797d + "'", double12 == 0.002417358818369797d);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.3796360778440238d), 0.6534818342543749d);
        normalDistributionImpl2.setStandardDeviation(0.24197072451914683d);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.9949360047253046d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.504091908029112d + "'", double5 == 0.504091908029112d);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0038536028656297734d, 5.514051569672565E-73d);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.24197072451914683d);
        double double7 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(8.542184725969929E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.387432573590388d + "'", double6 == 0.387432573590388d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        double double6 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.3306690738754696E-16d) + "'", double4 == (-3.3306690738754696E-16d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.996003610813204E-16d + "'", double6 == 4.996003610813204E-16d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        normalDistributionImpl0.setStandardDeviation(2.8165665442762825E-24d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.8206667139258397d, (double) (byte) 1);
        normalDistributionImpl0.setMean(0.3684295859056615d);
        double double17 = normalDistributionImpl0.getStandardDeviation();
        double double20 = normalDistributionImpl0.cumulativeProbability(0.3071300107938131d, 0.3988499538048309d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.8165665442762825E-24d + "'", double17 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003391125823206404d, 0.5009719973078852d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 32.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.inverseCumulativeProbability(848.1206314532849d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100.0f);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 1L, Double.POSITIVE_INFINITY);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.cumulativeProbability(0.24377533629588963d, 0.25536251834768864d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.cumulativeProbability(0.38327737736684997d, 0.003987627967620997d);
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
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0, 0.691462461274013d);
        normalDistributionImpl0.setStandardDeviation(0.571107425038754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.25536251834768864d + "'", double5 == 0.25536251834768864d);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(98.99999977098578d, 0.6527527593302829d);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.cumulativeProbability((double) ' ');
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 10L);
        double double10 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999857d + "'", double6 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        double double18 = normalDistributionImpl0.cumulativeProbability(0.27389214325950473d);
        normalDistributionImpl0.setStandardDeviation(2.275957200481571E-15d);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 1.2989609388114332E-14d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.39891637076145464d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.1939162683106727d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3989422804014327d + "'", double8 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3684295859056615d + "'", double10 == 0.3684295859056615d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3915115379838461d + "'", double13 == 0.3915115379838461d);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NaN, (double) 1.0f);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.04883560073156118d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.13212396732606452d);
        double double8 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(8.22771251574621E-21d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5331888748664452d + "'", double7 == 0.5331888748664452d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.04883560073156118d + "'", double8 == 0.04883560073156118d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8511172425430698d, 0.00411206605241144d);
        normalDistributionImpl2.setMean(0.0d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.004112805055412701d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 58.83350011594982d + "'", double6 == 58.83350011594982d);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6527527593302829d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003971497250408449d, 0.834941009514711d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.27389214325950473d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.45348201731096344d + "'", double4 == 0.45348201731096344d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.38767317623584496d);
        normalDistributionImpl2.setStandardDeviation(0.003989422804014327d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9949360047253046d, 0.00411206605241144d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.6104871705771893d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1208129155306007d, 0.11693498857496193d);
        normalDistributionImpl2.setMean(0.002428934684568244d);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.9999999999999857d);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(0.7615143478152635d);
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setStandardDeviation((double) (byte) 1);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.cumulativeProbability(0.1586552539314552d);
        double double13 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.cumulativeProbability(100.96481902940684d);
        double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        double double20 = normalDistributionImpl0.cumulativeProbability(0.01945305528714028d, 0.49999999999999883d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.NEGATIVE_INFINITY + "'", double17 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011398350799319024d, 0.011398350868612364d);
        normalDistributionImpl2.setMean(0.00411206605241144d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.24463748165229704d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.0037696481588829506d) + "'", double6 == (-0.0037696481588829506d));
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
            double double17 = normalDistributionImpl0.cumulativeProbability(0.9980473674631738d, 0.001349898031630159d);
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
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.0d);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.691462461274013d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.004112805055412701d);
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
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.36348329932713447d);
        normalDistributionImpl0.setMean((double) (short) 1);
        double double11 = normalDistributionImpl0.cumulativeProbability(9.687755967937495E-5d, 53.905736894585544d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.3491633383337742d) + "'", double6 == (-0.3491633383337742d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8413213033997585d + "'", double11 == 0.8413213033997585d);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(Double.NaN);
        double double14 = normalDistributionImpl0.density((java.lang.Double) 98.99999977098578d);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.0d + "'", double12 == 101.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.24197066910440684d + "'", double14 == 0.24197066910440684d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.7101845133435983d, 0.6996783115565639d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4774954927042859E-22d + "'", double4 == 1.4774954927042859E-22d);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.03980208177438576d, 0.012462652646205209d);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        double double18 = normalDistributionImpl0.getStandardDeviation();
        double double20 = normalDistributionImpl0.cumulativeProbability(4.0161707293151494E-11d);
        double double22 = normalDistributionImpl0.density((java.lang.Double) 0.03626707353288911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.026109053048334d + "'", double15 == 9.026109053048334d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.621390715929835E-27d + "'", double17 == 3.621390715929835E-27d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.661338147750939E-16d + "'", double20 == 6.661338147750939E-16d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.155475305604421E-27d + "'", double22 == 3.155475305604421E-27d);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) 1, (double) 1.0f);
        double double11 = normalDistributionImpl0.density((java.lang.Double) 0.007507297482889052d);
        double double13 = normalDistributionImpl0.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(42.867561125735264d, 36.0d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.50000402809845d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 42.867924615772125d + "'", double4 == 42.867924615772125d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 36.0d + "'", double5 == 36.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0024364383453520616d, 2.8165665442762825E-24d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.8165665442762825E-24d + "'", double3 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.8165665442762825E-24d + "'", double4 == 2.8165665442762825E-24d);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.cumulativeProbability(0.004112807010969372d, 35.99999999962154d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(0.4999999999999999d, 0.16368519086556366d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14471422838183567d + "'", double6 == 0.14471422838183567d);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        double double18 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-218.52912411964806d));
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.3511030636567253d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.23921277642240243d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.inverseCumulativeProbability((double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25820249755352387d + "'", double4 == 0.25820249755352387d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.298693554355323d + "'", double6 == 0.298693554355323d);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        double double17 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', 0.5041286058447934d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.38767317623584496d, 0.002359870124408081d);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.3989422804014327d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.39276307230455315d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) (-23.019820521106425d));
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.5041127341632511d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003859293226999287d + "'", double4 == 0.003859293226999287d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.603904923161464d + "'", double6 == 8.603904923161464d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003439130075321901d + "'", double8 == 0.003439130075321901d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.99999999962154d + "'", double10 == 35.99999999962154d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability(0.5d);
        normalDistributionImpl0.setMean(0.8413447460685395d);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.691462461274013d + "'", double3 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8413447460685395d + "'", double6 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double12 = normalDistributionImpl0.cumulativeProbability((double) 0.0f, (double) 1L);
        double double13 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.5095890191126843d);
        double double17 = normalDistributionImpl0.cumulativeProbability(0.03986973149906884d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5d + "'", double17 == 0.5d);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.7976708387255201d, (-7.977165358279764d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.005268537016191098d, 0.15865525393145702d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 32.0d);
        normalDistributionImpl2.setMean(4.0161707293151494E-11d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 2.609024107869118E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.01945305528714028d + "'", double4 == 0.01945305528714028d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.5145229705017247d + "'", double10 == 2.5145229705017247d);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(42.867561125735264d, 36.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.011398350799319024d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability(88.0180622223085d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11693498857496193d + "'", double4 == 0.11693498857496193d);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        normalDistributionImpl2.setStandardDeviation(1.6653345369377348E-16d);
        normalDistributionImpl2.setMean(0.12235809905798467d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.44476622630561513d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.6653345369377348E-16d + "'", double9 == 1.6653345369377348E-16d);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5095890191126843d);
        normalDistributionImpl0.setStandardDeviation((double) 100.0f);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.4000658076783735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 99.7468232068838d + "'", double11 == 99.7468232068838d);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 10L);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.02151428054220411d, 0.39276307230455315d);
        double double8 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.007669665116947154d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.3306690738754696E-16d) + "'", double4 == (-3.3306690738754696E-16d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.106226635438361E-16d + "'", double7 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.39891637076145464d, 0.00411206605241144d);
        double double4 = normalDistributionImpl2.density((java.lang.Double) 4.703838883365341E-4d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 9.026109053048334d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.6549981199955597d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.13686927466582383d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.0038607222095865005d, 0.05208137124318141d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.7168914268871843d) + "'", double4 == (-0.7168914268871843d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.029336559489161473d + "'", double7 == 0.029336559489161473d);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        double double10 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((-1.0d));
        double double14 = normalDistributionImpl0.cumulativeProbability((double) 0);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.inverseCumulativeProbability(0.5061729618128646d);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setStandardDeviation((double) 10L);
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(2.8165665442762825E-24d);
        double double13 = normalDistributionImpl0.density((java.lang.Double) 0.03969485302638689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 18.0000005d + "'", double11 == 18.0000005d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.006114644399898E-24d + "'", double13 == 8.006114644399898E-24d);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(Double.NaN);
        double double11 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.3796360778440238d));
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
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8511172425430698d + "'", double4 == 0.8511172425430698d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 0.9999999999999857d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.3511030636567253d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.0033293208790807836d);
        double double9 = normalDistributionImpl2.cumulativeProbability((-1.0d), 0.003976677061955973d);
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25820249755352387d + "'", double4 == 0.25820249755352387d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7134509881791207d) + "'", double6 == (-1.7134509881791207d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.13686927466582383d + "'", double9 == 0.13686927466582383d);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        double double15 = normalDistributionImpl0.density((java.lang.Double) 100.88014208468009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.27083010383549005d + "'", double15 == 0.27083010383549005d);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.26831686462225557d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.density((java.lang.Double) 0.0d);
        normalDistributionImpl2.setStandardDeviation(0.003971497250408449d);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.3989391683525467d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.26831686462225557d + "'", double5 == 0.26831686462225557d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.05372313980725889d + "'", double7 == 0.05372313980725889d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1), 101.0000002290142d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        normalDistributionImpl0.setMean(0.8385529758034967d);
        normalDistributionImpl0.setStandardDeviation(0.3511030636567253d);
        double double14 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.3511030636567253d + "'", double14 == 0.3511030636567253d);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.density((java.lang.Double) Double.POSITIVE_INFINITY);
        double double5 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
        double double9 = normalDistributionImpl0.cumulativeProbability((double) 100);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.cumulativeProbability(0.1586552539314552d);
        double double13 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.cumulativeProbability(100.96481902940684d);
        double double18 = normalDistributionImpl0.cumulativeProbability(0.011398350789919569d, 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.density((java.lang.Double) 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.005915351705566119d);
        normalDistributionImpl0.setStandardDeviation(10.100000163096063d);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 53.905736894585544d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3989422804014327d + "'", double2 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.576279703865435E-8d + "'", double8 == 2.576279703865435E-8d);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100.0f);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 10);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(101.0d);
        double double10 = normalDistributionImpl2.density((java.lang.Double) 1.2989609388114332E-14d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5000000000000052d);
        double double14 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.539827837277029d + "'", double4 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8165665442762825E-24d + "'", double10 == 2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5000000000000052d + "'", double14 == 0.5000000000000052d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.cumulativeProbability(0.9999999999999857d);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((double) (byte) 0);
        double double13 = normalDistributionImpl0.cumulativeProbability(10.0d, 98.52557187804089d);
        double double15 = normalDistributionImpl0.density((java.lang.Double) 3.784863435160563E-24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8413447460685395d + "'", double7 == 0.8413447460685395d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7763568394002505E-15d + "'", double13 == 1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3989422804014327d + "'", double15 == 0.3989422804014327d);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        double double16 = normalDistributionImpl0.cumulativeProbability(0.003970761836563756d);
        double double18 = normalDistributionImpl0.density((java.lang.Double) (-7.216449660063518E-16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.30855485436716207d, (-260.7350958165562d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3511030636567253d, 0.39891637076145464d);
        double double5 = normalDistributionImpl2.cumulativeProbability(1.2989609388114332E-14d, (double) (byte) 10);
        double double7 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double9 = normalDistributionImpl2.cumulativeProbability(2.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8106088131500386d + "'", double5 == 0.8106088131500386d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.533930913758865E-4d + "'", double7 == 3.533930913758865E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9999821313291566d + "'", double9 == 0.9999821313291566d);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.cumulativeProbability((double) (short) -1, 0.8413447460685395d);
        double double11 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.6148878559046674d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(0.2929905121210513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 99.45533075104642d + "'", double15 == 99.45533075104642d);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.26831686462225557d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9999519056761452d, 55.1999999998222d);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation(97.0d);
        normalDistributionImpl2.setMean(71.87668407982403d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        double double7 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.0033303210636190686d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-34.82724682411482d) + "'", double10 == (-34.82724682411482d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, (double) (short) 10);
        normalDistributionImpl2.setMean(0.8103019879415457d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.26383381213934287d, 2.609024107869118E-15d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        double double24 = normalDistributionImpl0.density((java.lang.Double) 1.0000000000000004d);
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.3520653267642967d + "'", double24 == 0.3520653267642967d);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (-1L));
        normalDistributionImpl0.setMean(0.00411206605241144d);
        double double13 = normalDistributionImpl0.cumulativeProbability(0.0d, 0.0d);
        normalDistributionImpl0.setStandardDeviation(0.39891637076145464d);
        double double17 = normalDistributionImpl0.density((java.lang.Double) 0.341284693435295d);
        double double19 = normalDistributionImpl0.density((java.lang.Double) 0.4562046874576832d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145702d + "'", double8 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6996783115565639d + "'", double17 == 0.6996783115565639d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5261749688099898d + "'", double19 == 0.5261749688099898d);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        double double8 = normalDistributionImpl0.density((java.lang.Double) 0.8511172425430698d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 2.8165665442762825E-24d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        double double6 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double7 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double7 = normalDistributionImpl2.cumulativeProbability(0.8413447460685395d);
        double double9 = normalDistributionImpl2.density((java.lang.Double) 0.5d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.density((java.lang.Double) 0.004112723567028872d);
        double double14 = normalDistributionImpl2.density((java.lang.Double) 0.0018084020582365135d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5095890191126843d + "'", double7 == 0.5095890191126843d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.011397187830924622d + "'", double9 == 0.011397187830924622d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.011398350789919569d + "'", double12 == 0.011398350789919569d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.011398350853397575d + "'", double14 == 0.011398350853397575d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.density((java.lang.Double) 0.011397187830924622d);
        double double6 = normalDistributionImpl0.density((java.lang.Double) (-1.5210055437364645E-14d));
        normalDistributionImpl0.setMean(1.2989609388114332E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.39891637076145464d + "'", double4 == 0.39891637076145464d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3989422804014327d + "'", double6 == 0.3989422804014327d);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0013711354501702022d, 0.05208137124318141d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.36348329932713447d);
        normalDistributionImpl2.setStandardDeviation(0.01945305528714028d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.016813778839715805d) + "'", double4 == (-0.016813778839715805d));
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 101.0d);
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.298693554355323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.5281617071790112d) + "'", double10 == (-0.5281617071790112d));
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 0, 0.5768792773921276d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.3885026417343065d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 100, (double) (short) 100);
        double double3 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setStandardDeviation(0.9999999999999857d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(35.99999999962154d);
        double double16 = normalDistributionImpl0.cumulativeProbability(1.2682660406701413E-23d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999999857d + "'", double12 == 0.9999999999999857d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.1102230246251565E-16d) + "'", double16 == (-1.1102230246251565E-16d));
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability((double) (short) 0);
        double double6 = normalDistributionImpl0.getMean();
        double double8 = normalDistributionImpl0.density((java.lang.Double) 101.0d);
        double double10 = normalDistributionImpl0.cumulativeProbability((-23.019820521106425d));
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.104628079763643E-15d) + "'", double10 == (-8.104628079763643E-15d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 'a');
        double double4 = normalDistributionImpl2.density((java.lang.Double) 0.8413447460685395d);
        normalDistributionImpl2.setStandardDeviation(97.0d);
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.density((java.lang.Double) 9.359740967898311d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00411206605241144d + "'", double4 == 0.00411206605241144d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.004089417306525428d + "'", double9 == 0.004089417306525428d);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.691462461274013d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.3848369645341492d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09467574302164261d + "'", double4 == 0.09467574302164261d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003447496149865155d + "'", double6 == 0.003447496149865155d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 42.630353990821625d + "'", double8 == 42.630353990821625d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15865525393145702d, 101.0000002290142d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.3517027765833526d);
        double double6 = normalDistributionImpl2.density((java.lang.Double) 0.26831686462225557d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-38.29480978120667d) + "'", double4 == (-38.29480978120667d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003949921231149102d + "'", double6 == 0.003949921231149102d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setMean((double) 100);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) (byte) 100);
        normalDistributionImpl0.setMean(0.8385529758034967d);
        normalDistributionImpl0.setStandardDeviation(0.3511030636567253d);
        double double15 = normalDistributionImpl0.cumulativeProbability(9.917200250088689d);
        double double17 = normalDistributionImpl0.cumulativeProbability(2.8165665442762825E-24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999999999999964d + "'", double15 == 0.9999999999999964d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.008462371815067593d + "'", double17 == 0.008462371815067593d);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.33901596247314525d, 1.897375280211193E-22d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.3930568015437984d);
        double double7 = normalDistributionImpl2.cumulativeProbability((-5.445166607068674d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.897375280211193E-22d + "'", double3 == 1.897375280211193E-22d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
            double double14 = normalDistributionImpl0.inverseCumulativeProbability(0.0022786240701070937d);
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
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.039846824608907386d);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.25536251834768864d, 0.005723383913933699d);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.656004283871861d, 0.50000402809845d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean((double) 100.0f);
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.density((java.lang.Double) 0.00411206605241144d);
        double double10 = normalDistributionImpl0.cumulativeProbability(0.5020563944007155d, Double.POSITIVE_INFINITY);
        double double12 = normalDistributionImpl0.cumulativeProbability(0.3988974611574716d);
        double double14 = normalDistributionImpl0.cumulativeProbability((-40.982844046802896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        double double16 = normalDistributionImpl0.getStandardDeviation();
        double double17 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.011398350799319024d, 0.011398350868612364d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(100.96481902940684d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9597790821736437d, 0.30855485436716207d);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NaN, 0.003949881050253595d);
        double double3 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.cumulativeProbability(8.22771251574621E-21d, 0.5111606389866273d);
        double double8 = normalDistributionImpl2.density((java.lang.Double) 0.03988330678708569d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) (short) 1);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl0.density((java.lang.Double) 0.2300923061989596d);
        double double8 = normalDistributionImpl0.cumulativeProbability(9.206924786140221E-28d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.039837239966761334d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.38852033512092876d + "'", double6 == 0.38852033512092876d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.39862584413045266d + "'", double10 == 0.39862584413045266d);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8410709021576761d, (double) 1.0f);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8385529758034967d, 0.30446746012271947d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.30446746012271947d + "'", double3 == 0.30446746012271947d);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 'a');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.003447496149865155d, 101.0d);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(98.52557187804089d, 0.5295573167386503d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3511030636567253d + "'", double5 == 0.3511030636567253d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) (-1));
        normalDistributionImpl0.setStandardDeviation((double) (byte) 1);
        normalDistributionImpl0.setMean(101.0d);
        double double10 = normalDistributionImpl0.density((java.lang.Double) 0.007507297482889052d);
        normalDistributionImpl0.setStandardDeviation(0.5041332253989657d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }
}
