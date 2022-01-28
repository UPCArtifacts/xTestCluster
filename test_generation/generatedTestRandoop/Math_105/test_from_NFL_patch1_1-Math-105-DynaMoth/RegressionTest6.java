import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        long long10 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double12 = simpleRegression0.getTotalSumSquares();
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        simpleRegression0.addData(93.71511627906978d, 35.09364059557591d);
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        double double9 = simpleRegression0.predict(10.0d);
        double double11 = simpleRegression0.predict(100.0d);
        double double13 = simpleRegression0.predict((double) (short) 0);
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getMeanSquareError();
        double double16 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlope();
        double double4 = simpleRegression0.getIntercept();
        double double5 = simpleRegression0.getR();
        simpleRegression0.addData((double) (-1), 0.5366294777987983d);
        long long9 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        simpleRegression0.clear();
        double double8 = simpleRegression0.getTotalSumSquares();
        long long9 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double11 = simpleRegression0.getSlopeStdErr();
        double double12 = simpleRegression0.getInterceptStdErr();
        double double13 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long10 = simpleRegression9.getN();
        double double11 = simpleRegression9.getSumSquaredErrors();
        double double13 = simpleRegression9.predict((double) 10L);
        double double14 = simpleRegression9.getIntercept();
        simpleRegression9.addData((double) (byte) 100, (double) 100.0f);
        double double19 = simpleRegression9.predict((double) 100L);
        double double20 = simpleRegression9.getR();
        double[] doubleArray23 = new double[] { 100L, 100.0d };
        double[] doubleArray26 = new double[] { 100L, 100.0d };
        double[] doubleArray29 = new double[] { 100L, 100.0d };
        double[] doubleArray32 = new double[] { 100L, 100.0d };
        double[] doubleArray35 = new double[] { 100L, 100.0d };
        double[] doubleArray38 = new double[] { 100L, 100.0d };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        simpleRegression9.addData(doubleArray39);
        simpleRegression0.addData(doubleArray39);
        double double42 = simpleRegression0.getTotalSumSquares();
        double double43 = simpleRegression0.getMeanSquareError();
        double double44 = simpleRegression0.getMeanSquareError();
        simpleRegression0.addData(7.199999999999999d, 1.5555555555555556d);
        simpleRegression0.clear();
        double double49 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double51 = simpleRegression0.getSlopeConfidenceInterval(0.05205160064383614d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getR();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRSquare();
        simpleRegression0.addData((double) (short) 10, 7949.394557823129d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.getRSquare();
        simpleRegression0.addData((double) 6L, 6.0d);
        simpleRegression0.clear();
        double double12 = simpleRegression0.getIntercept();
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(0.030303030303030304d, (double) 10L);
        double double14 = simpleRegression0.getInterceptStdErr();
        double double15 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.predict((double) 1);
        double double9 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.predict((double) (-1.0f));
        long long12 = simpleRegression0.getN();
        simpleRegression0.addData((double) 100, (double) (short) 100);
        double double16 = simpleRegression0.getSlopeStdErr();
        double double17 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double12 = simpleRegression0.predict(0.7234138327186037d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double10 = simpleRegression7.getRegressionSumSquares();
        simpleRegression7.addData(0.0d, (-1.0d));
        double double14 = simpleRegression7.getR();
        double double16 = simpleRegression7.predict(10.0d);
        double double18 = simpleRegression7.predict(100.0d);
        double double20 = simpleRegression7.predict((double) (short) 0);
        long long21 = simpleRegression7.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long23 = simpleRegression22.getN();
        double double24 = simpleRegression22.getSumSquaredErrors();
        double double26 = simpleRegression22.predict((double) 10L);
        double double27 = simpleRegression22.getIntercept();
        double double28 = simpleRegression22.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression29 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long30 = simpleRegression29.getN();
        double double31 = simpleRegression29.getSumSquaredErrors();
        long long32 = simpleRegression29.getN();
        long long33 = simpleRegression29.getN();
        double[][] doubleArray34 = new double[][] {};
        simpleRegression29.addData(doubleArray34);
        simpleRegression22.addData(doubleArray34);
        simpleRegression7.addData(doubleArray34);
        simpleRegression0.addData(doubleArray34);
        double double39 = simpleRegression0.getSumSquaredErrors();
        double double40 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        long long10 = simpleRegression7.getN();
        long long11 = simpleRegression7.getN();
        double[][] doubleArray12 = new double[][] {};
        simpleRegression7.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double16 = simpleRegression0.predict((double) (-1L));
        double double17 = simpleRegression0.getIntercept();
        double double18 = simpleRegression0.getR();
        double double19 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double17 = simpleRegression7.predict((double) 100L);
        double double18 = simpleRegression7.getR();
        double[] doubleArray21 = new double[] { 100L, 100.0d };
        double[] doubleArray24 = new double[] { 100L, 100.0d };
        double[] doubleArray27 = new double[] { 100L, 100.0d };
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        simpleRegression7.addData(doubleArray37);
        simpleRegression0.addData(doubleArray37);
        double double40 = simpleRegression0.getSlope();
        double double41 = simpleRegression0.getRegressionSumSquares();
        double double42 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0099999999999998d + "'", double40 == 1.0099999999999998d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 8743.714285714283d + "'", double41 == 8743.714285714283d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-0.9999999999999838d) + "'", double42 == (-0.9999999999999838d));
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        java.lang.Class<?> wildcardClass3 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double17 = simpleRegression7.predict((double) 100L);
        double double18 = simpleRegression7.getR();
        double[] doubleArray21 = new double[] { 100L, 100.0d };
        double[] doubleArray24 = new double[] { 100L, 100.0d };
        double[] doubleArray27 = new double[] { 100L, 100.0d };
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        simpleRegression7.addData(doubleArray37);
        simpleRegression0.addData(doubleArray37);
        double double40 = simpleRegression0.getRSquare();
        double double41 = simpleRegression0.getRSquare();
        double double42 = simpleRegression0.getInterceptStdErr();
        double double43 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9999999999999998d + "'", double40 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.9999999999999998d + "'", double41 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 6.031565971695669E-7d + "'", double42 == 6.031565971695669E-7d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.9999999999999998d + "'", double43 == 0.9999999999999998d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long7 = simpleRegression6.getN();
        double double8 = simpleRegression6.getSumSquaredErrors();
        double double9 = simpleRegression6.getRegressionSumSquares();
        simpleRegression6.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long14 = simpleRegression13.getN();
        double double15 = simpleRegression13.getSumSquaredErrors();
        double double17 = simpleRegression13.predict((double) 10L);
        double double18 = simpleRegression13.getIntercept();
        simpleRegression13.addData((double) (byte) 100, (double) 100.0f);
        double double23 = simpleRegression13.predict((double) 100L);
        double double24 = simpleRegression13.getR();
        double[] doubleArray27 = new double[] { 100L, 100.0d };
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[] doubleArray39 = new double[] { 100L, 100.0d };
        double[] doubleArray42 = new double[] { 100L, 100.0d };
        double[][] doubleArray43 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42 };
        simpleRegression13.addData(doubleArray43);
        simpleRegression6.addData(doubleArray43);
        double double46 = simpleRegression6.getRSquare();
        double double47 = simpleRegression6.getR();
        double double49 = simpleRegression6.predict((double) (byte) 0);
        simpleRegression6.addData(0.0d, (double) ' ');
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression53 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long54 = simpleRegression53.getN();
        double double55 = simpleRegression53.getSumSquaredErrors();
        double double57 = simpleRegression53.predict((double) 10L);
        double double58 = simpleRegression53.getIntercept();
        double double59 = simpleRegression53.getRegressionSumSquares();
        double double60 = simpleRegression53.getSumSquaredErrors();
        double double61 = simpleRegression53.getMeanSquareError();
        double double62 = simpleRegression53.getRegressionSumSquares();
        double double63 = simpleRegression53.getSumSquaredErrors();
        double[] doubleArray67 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray71 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray75 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray79 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray83 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray87 = new double[] { (byte) 1, 0L, 'a' };
        double[][] doubleArray88 = new double[][] { doubleArray67, doubleArray71, doubleArray75, doubleArray79, doubleArray83, doubleArray87 };
        simpleRegression53.addData(doubleArray88);
        simpleRegression6.addData(doubleArray88);
        simpleRegression0.addData(doubleArray88);
        simpleRegression0.clear();
        java.lang.Class<?> wildcardClass93 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.9999999999999998d + "'", double46 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.9999999999999999d + "'", double47 == 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-0.9999999999999838d) + "'", double49 == (-0.9999999999999838d));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        long long10 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double12 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        long long14 = simpleRegression0.getN();
        simpleRegression0.addData(4.066480948555191E-7d, 0.5366294777987983d);
        double double18 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getIntercept();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        double double13 = simpleRegression0.predict(4.066480948555191E-7d);
        double double14 = simpleRegression0.getMeanSquareError();
        simpleRegression0.addData((double) 13L, 9.31573003924374E-9d);
        double double18 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getTotalSumSquares();
        double double2 = simpleRegression0.getRegressionSumSquares();
        double double3 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getInterceptStdErr();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getRSquare();
        simpleRegression0.addData(0.23752863392368403d, 1.6536267304962332E-13d);
        double double17 = simpleRegression0.predict((double) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getR();
        double double2 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.predict((double) 1);
        double double9 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression10 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long11 = simpleRegression10.getN();
        double double12 = simpleRegression10.getTotalSumSquares();
        double double13 = simpleRegression10.getSlopeStdErr();
        double double15 = simpleRegression10.predict((double) 3L);
        double double16 = simpleRegression10.getRegressionSumSquares();
        double double17 = simpleRegression10.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long19 = simpleRegression18.getN();
        double double20 = simpleRegression18.getSumSquaredErrors();
        double double22 = simpleRegression18.predict((double) 10L);
        double double23 = simpleRegression18.getMeanSquareError();
        double double24 = simpleRegression18.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long26 = simpleRegression25.getN();
        double double27 = simpleRegression25.getSumSquaredErrors();
        double double28 = simpleRegression25.getRegressionSumSquares();
        simpleRegression25.addData(0.0d, (-1.0d));
        double double32 = simpleRegression25.getR();
        double double34 = simpleRegression25.predict(10.0d);
        double double36 = simpleRegression25.predict(100.0d);
        double double38 = simpleRegression25.predict((double) (short) 0);
        long long39 = simpleRegression25.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression40 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long41 = simpleRegression40.getN();
        double double42 = simpleRegression40.getSumSquaredErrors();
        double double44 = simpleRegression40.predict((double) 10L);
        double double45 = simpleRegression40.getIntercept();
        double double46 = simpleRegression40.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression47 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long48 = simpleRegression47.getN();
        double double49 = simpleRegression47.getSumSquaredErrors();
        long long50 = simpleRegression47.getN();
        long long51 = simpleRegression47.getN();
        double[][] doubleArray52 = new double[][] {};
        simpleRegression47.addData(doubleArray52);
        simpleRegression40.addData(doubleArray52);
        simpleRegression25.addData(doubleArray52);
        simpleRegression18.addData(doubleArray52);
        simpleRegression10.addData(doubleArray52);
        simpleRegression0.addData(doubleArray52);
        double double59 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(9.31573003924374E-9d, 0.23752863392368403d);
        // The following exception was thrown during execution in test generation
        try {
            double double63 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double16 = simpleRegression7.getIntercept();
        double double17 = simpleRegression7.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long19 = simpleRegression18.getN();
        double double20 = simpleRegression18.getSumSquaredErrors();
        double double22 = simpleRegression18.predict((double) 10L);
        double double23 = simpleRegression18.getIntercept();
        simpleRegression18.addData((double) (byte) 100, (double) 100.0f);
        double double28 = simpleRegression18.predict((double) 100L);
        double double29 = simpleRegression18.getMeanSquareError();
        long long30 = simpleRegression18.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression31 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long32 = simpleRegression31.getN();
        double double33 = simpleRegression31.getRSquare();
        double double34 = simpleRegression31.getTotalSumSquares();
        double[] doubleArray39 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray44 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray45 = new double[][] { doubleArray39, doubleArray44 };
        simpleRegression31.addData(doubleArray45);
        simpleRegression18.addData(doubleArray45);
        simpleRegression7.addData(doubleArray45);
        simpleRegression0.addData(doubleArray45);
        double double50 = simpleRegression0.getMeanSquareError();
        double double52 = simpleRegression0.predict((double) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getSumSquaredErrors();
        double double12 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double8 = simpleRegression0.getTotalSumSquares();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getMeanSquareError();
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getR();
        double double13 = simpleRegression0.getR();
        double double15 = simpleRegression0.predict(65.29134366925075d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.predict((double) 9L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        long long10 = simpleRegression7.getN();
        long long11 = simpleRegression7.getN();
        double[][] doubleArray12 = new double[][] {};
        simpleRegression7.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double16 = simpleRegression0.predict((double) (-1L));
        double double17 = simpleRegression0.getIntercept();
        double double18 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.predict((double) (byte) 10);
        simpleRegression0.addData((double) '#', 4142.092174397623d);
        simpleRegression0.clear();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getSlope();
        double double13 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.predict(0.7234138327186037d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        long long12 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long14 = simpleRegression13.getN();
        double double15 = simpleRegression13.getSumSquaredErrors();
        double double17 = simpleRegression13.predict((double) 10L);
        double double18 = simpleRegression13.getIntercept();
        simpleRegression13.addData((double) (byte) 100, (double) 100.0f);
        double double23 = simpleRegression13.predict((double) 100L);
        double double24 = simpleRegression13.getMeanSquareError();
        long long25 = simpleRegression13.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long27 = simpleRegression26.getN();
        double double28 = simpleRegression26.getRSquare();
        double double29 = simpleRegression26.getTotalSumSquares();
        double[] doubleArray34 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray39 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray40 = new double[][] { doubleArray34, doubleArray39 };
        simpleRegression26.addData(doubleArray40);
        simpleRegression13.addData(doubleArray40);
        simpleRegression0.addData(doubleArray40);
        java.lang.Class<?> wildcardClass44 = doubleArray40.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double17 = simpleRegression7.predict((double) 100L);
        double double18 = simpleRegression7.getR();
        double[] doubleArray21 = new double[] { 100L, 100.0d };
        double[] doubleArray24 = new double[] { 100L, 100.0d };
        double[] doubleArray27 = new double[] { 100L, 100.0d };
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        simpleRegression7.addData(doubleArray37);
        simpleRegression0.addData(doubleArray37);
        double double40 = simpleRegression0.getRSquare();
        double double41 = simpleRegression0.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression42 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long43 = simpleRegression42.getN();
        double double44 = simpleRegression42.getSumSquaredErrors();
        double double46 = simpleRegression42.predict((double) 10L);
        double double47 = simpleRegression42.getIntercept();
        double double48 = simpleRegression42.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression49 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long50 = simpleRegression49.getN();
        double double51 = simpleRegression49.getSumSquaredErrors();
        long long52 = simpleRegression49.getN();
        long long53 = simpleRegression49.getN();
        double[][] doubleArray54 = new double[][] {};
        simpleRegression49.addData(doubleArray54);
        simpleRegression42.addData(doubleArray54);
        simpleRegression0.addData(doubleArray54);
        simpleRegression0.clear();
        double double59 = simpleRegression0.getSlope();
        double double60 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        java.lang.Class<?> wildcardClass62 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9999999999999998d + "'", double40 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.9999999999999999d + "'", double41 == 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        double double9 = simpleRegression0.predict(10.0d);
        double double11 = simpleRegression0.predict(100.0d);
        double double12 = simpleRegression0.getRegressionSumSquares();
        double double13 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getR();
        double double2 = simpleRegression0.getRegressionSumSquares();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.getR();
        double double8 = simpleRegression0.predict((double) 100);
        double[] doubleArray15 = new double[] { 100, 1, 100, (-1L), '4', 6L };
        double[] doubleArray22 = new double[] { 100, 1, 100, (-1L), '4', 6L };
        double[][] doubleArray23 = new double[][] { doubleArray15, doubleArray22 };
        simpleRegression0.addData(doubleArray23);
        double double25 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0, 100.0, -1.0, 52.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 1.0, 100.0, -1.0, 52.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double7 = simpleRegression0.predict((-2.009999999999984d));
        double double8 = simpleRegression0.getInterceptStdErr();
        double double10 = simpleRegression0.predict(1.8189894035458565E-12d);
        double double11 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getTotalSumSquares();
        long long4 = simpleRegression0.getN();
        double double6 = simpleRegression0.predict(0.0d);
        double double7 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict((double) (short) -1);
        double double6 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSlope();
        simpleRegression0.addData(0.0d, 0.0d);
        double double14 = simpleRegression0.getMeanSquareError();
        double double15 = simpleRegression0.getRSquare();
        double double16 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getRSquare();
        double double12 = simpleRegression0.getTotalSumSquares();
        long long13 = simpleRegression0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double9 = simpleRegression0.predict(65.00710594315245d);
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getSumSquaredErrors();
        double double12 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long12 = simpleRegression11.getN();
        double double13 = simpleRegression11.getSumSquaredErrors();
        double double15 = simpleRegression11.predict((double) 10L);
        double double16 = simpleRegression11.getIntercept();
        double double17 = simpleRegression11.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long19 = simpleRegression18.getN();
        double double20 = simpleRegression18.getSumSquaredErrors();
        long long21 = simpleRegression18.getN();
        long long22 = simpleRegression18.getN();
        double[][] doubleArray23 = new double[][] {};
        simpleRegression18.addData(doubleArray23);
        simpleRegression11.addData(doubleArray23);
        double double27 = simpleRegression11.predict((double) (-1L));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long29 = simpleRegression28.getN();
        double double30 = simpleRegression28.getSumSquaredErrors();
        double double32 = simpleRegression28.predict((double) 10L);
        double double33 = simpleRegression28.getIntercept();
        simpleRegression28.addData((double) (byte) 100, (double) 100.0f);
        double double38 = simpleRegression28.predict((double) 100L);
        double double39 = simpleRegression28.getR();
        double[] doubleArray42 = new double[] { 100L, 100.0d };
        double[] doubleArray45 = new double[] { 100L, 100.0d };
        double[] doubleArray48 = new double[] { 100L, 100.0d };
        double[] doubleArray51 = new double[] { 100L, 100.0d };
        double[] doubleArray54 = new double[] { 100L, 100.0d };
        double[] doubleArray57 = new double[] { 100L, 100.0d };
        double[][] doubleArray58 = new double[][] { doubleArray42, doubleArray45, doubleArray48, doubleArray51, doubleArray54, doubleArray57 };
        simpleRegression28.addData(doubleArray58);
        simpleRegression11.addData(doubleArray58);
        simpleRegression0.addData(doubleArray58);
        double double62 = simpleRegression0.getSlopeStdErr();
        double double63 = simpleRegression0.getTotalSumSquares();
        double double64 = simpleRegression0.getInterceptStdErr();
        double double65 = simpleRegression0.getTotalSumSquares();
        double double67 = simpleRegression0.getSlopeConfidenceInterval(2.2737367544323207E-14d);
        double double68 = simpleRegression0.getSlope();
        double double69 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double17 = simpleRegression7.predict((double) 100L);
        double double18 = simpleRegression7.getR();
        double[] doubleArray21 = new double[] { 100L, 100.0d };
        double[] doubleArray24 = new double[] { 100L, 100.0d };
        double[] doubleArray27 = new double[] { 100L, 100.0d };
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        simpleRegression7.addData(doubleArray37);
        simpleRegression0.addData(doubleArray37);
        double double40 = simpleRegression0.getRSquare();
        double double41 = simpleRegression0.getR();
        double double43 = simpleRegression0.predict((double) (byte) 0);
        simpleRegression0.addData(6.0d, (double) 100);
        double double47 = simpleRegression0.getSlope();
        double double48 = simpleRegression0.getSlope();
        double double49 = simpleRegression0.getSlope();
        simpleRegression0.addData(0.23791906001465818d, 1.4004436411137005E7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9999999999999998d + "'", double40 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.9999999999999999d + "'", double41 == 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.9999999999999838d) + "'", double43 == (-0.9999999999999838d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.541396879312175d + "'", double47 == 0.541396879312175d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.541396879312175d + "'", double48 == 0.541396879312175d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.541396879312175d + "'", double49 == 0.541396879312175d);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        simpleRegression0.clear();
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) 0.0f, 97.0d);
        simpleRegression0.addData(2100.214285714552d, 0.007549314087103909d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        simpleRegression0.clear();
        simpleRegression0.addData(0.007549314087103909d, (double) 'a');
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getMeanSquareError();
        double double11 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double13 = simpleRegression0.predict((double) (short) -1);
        double double14 = simpleRegression0.getMeanSquareError();
        double double15 = simpleRegression0.getInterceptStdErr();
        double double16 = simpleRegression0.getSumSquaredErrors();
        double double17 = simpleRegression0.getSumSquaredErrors();
        double double18 = simpleRegression0.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression19 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long20 = simpleRegression19.getN();
        double double21 = simpleRegression19.getSumSquaredErrors();
        double double23 = simpleRegression19.predict((double) 10L);
        double double24 = simpleRegression19.getIntercept();
        simpleRegression19.addData((double) (byte) 100, (double) 100.0f);
        double double29 = simpleRegression19.predict((double) 100L);
        double double30 = simpleRegression19.getMeanSquareError();
        long long31 = simpleRegression19.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression32 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long33 = simpleRegression32.getN();
        double double34 = simpleRegression32.getRSquare();
        double double35 = simpleRegression32.getTotalSumSquares();
        double[] doubleArray40 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray45 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray46 = new double[][] { doubleArray40, doubleArray45 };
        simpleRegression32.addData(doubleArray46);
        simpleRegression19.addData(doubleArray46);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression49 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long50 = simpleRegression49.getN();
        double double51 = simpleRegression49.getSumSquaredErrors();
        long long52 = simpleRegression49.getN();
        long long53 = simpleRegression49.getN();
        double[][] doubleArray54 = new double[][] {};
        simpleRegression49.addData(doubleArray54);
        simpleRegression19.addData(doubleArray54);
        simpleRegression0.addData(doubleArray54);
        double double58 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.predict((double) 100.0f);
        double double7 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getTotalSumSquares();
        double double11 = simpleRegression0.getRSquare();
        double double12 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getR();
        double double7 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getSumSquaredErrors();
        double double13 = simpleRegression11.getMeanSquareError();
        simpleRegression11.addData(0.23791906001465818d, 0.0d);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long18 = simpleRegression17.getN();
        double double19 = simpleRegression17.getSumSquaredErrors();
        double double21 = simpleRegression17.predict((double) 10L);
        double double22 = simpleRegression17.getIntercept();
        simpleRegression17.addData((double) (byte) 100, (double) 100.0f);
        double double27 = simpleRegression17.predict((double) 100L);
        double double28 = simpleRegression17.getMeanSquareError();
        long long29 = simpleRegression17.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression30 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long31 = simpleRegression30.getN();
        double double32 = simpleRegression30.getRSquare();
        double double33 = simpleRegression30.getTotalSumSquares();
        double[] doubleArray38 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray43 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray44 = new double[][] { doubleArray38, doubleArray43 };
        simpleRegression30.addData(doubleArray44);
        simpleRegression17.addData(doubleArray44);
        simpleRegression11.addData(doubleArray44);
        simpleRegression0.addData(doubleArray44);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        long long12 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long14 = simpleRegression13.getN();
        double double15 = simpleRegression13.getRSquare();
        double double16 = simpleRegression13.getTotalSumSquares();
        double[] doubleArray21 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray26 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray27 = new double[][] { doubleArray21, doubleArray26 };
        simpleRegression13.addData(doubleArray27);
        simpleRegression0.addData(doubleArray27);
        long long30 = simpleRegression0.getN();
        long long31 = simpleRegression0.getN();
        double double32 = simpleRegression0.getInterceptStdErr();
        double double33 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3L + "'", long30 == 3L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 3L + "'", long31 == 3L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        simpleRegression0.addData((double) 6L, (double) (byte) 0);
        double double11 = simpleRegression0.getR();
        simpleRegression0.addData(0.6983204134366925d, (double) (byte) -1);
        double double15 = simpleRegression0.getSlopeConfidenceInterval();
        double double16 = simpleRegression0.getSlope();
        double double17 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23791906001465818d + "'", double15 == 0.23791906001465818d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.17496090227947925d + "'", double16 == 0.17496090227947925d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6666666666666666d + "'", double17 == 0.6666666666666666d);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.predict((double) 1);
        double double9 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.predict((double) (-1.0f));
        long long12 = simpleRegression0.getN();
        simpleRegression0.addData((-0.4531891518946872d), (-1.2976433462532138d));
        double double16 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double11 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        long long10 = simpleRegression7.getN();
        long long11 = simpleRegression7.getN();
        double[][] doubleArray12 = new double[][] {};
        simpleRegression7.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double16 = simpleRegression0.predict((double) (-1L));
        double double17 = simpleRegression0.getTotalSumSquares();
        double double18 = simpleRegression0.getTotalSumSquares();
        double double19 = simpleRegression0.getRSquare();
        long long20 = simpleRegression0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getRegressionSumSquares();
        double double2 = simpleRegression0.getInterceptStdErr();
        double double3 = simpleRegression0.getSlope();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.clear();
        double double9 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        simpleRegression0.clear();
        simpleRegression0.addData(0.5366294777987983d, 0.0764999079314125d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        long long10 = simpleRegression7.getN();
        long long11 = simpleRegression7.getN();
        double[][] doubleArray12 = new double[][] {};
        simpleRegression7.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double16 = simpleRegression0.predict((double) (-1L));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long18 = simpleRegression17.getN();
        double double19 = simpleRegression17.getSumSquaredErrors();
        double double21 = simpleRegression17.predict((double) 10L);
        double double22 = simpleRegression17.getIntercept();
        simpleRegression17.addData((double) (byte) 100, (double) 100.0f);
        double double27 = simpleRegression17.predict((double) 100L);
        double double28 = simpleRegression17.getR();
        double[] doubleArray31 = new double[] { 100L, 100.0d };
        double[] doubleArray34 = new double[] { 100L, 100.0d };
        double[] doubleArray37 = new double[] { 100L, 100.0d };
        double[] doubleArray40 = new double[] { 100L, 100.0d };
        double[] doubleArray43 = new double[] { 100L, 100.0d };
        double[] doubleArray46 = new double[] { 100L, 100.0d };
        double[][] doubleArray47 = new double[][] { doubleArray31, doubleArray34, doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        simpleRegression17.addData(doubleArray47);
        simpleRegression0.addData(doubleArray47);
        double double50 = simpleRegression0.getSlope();
        long long51 = simpleRegression0.getN();
        double double53 = simpleRegression0.predict(0.07778174593052023d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 6L + "'", long51 == 6L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getInterceptStdErr();
        double double11 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.clear();
        double double13 = simpleRegression0.getRSquare();
        double double14 = simpleRegression0.getMeanSquareError();
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getInterceptStdErr();
        double double17 = simpleRegression0.getSlope();
        double double18 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getMeanSquareError();
        double double11 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long10 = simpleRegression9.getN();
        double double11 = simpleRegression9.getSumSquaredErrors();
        double double13 = simpleRegression9.predict((double) 10L);
        double double14 = simpleRegression9.getIntercept();
        double double15 = simpleRegression9.getRegressionSumSquares();
        long long16 = simpleRegression9.getN();
        double double17 = simpleRegression9.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long19 = simpleRegression18.getN();
        double double20 = simpleRegression18.getSumSquaredErrors();
        double double22 = simpleRegression18.predict((double) 10L);
        double double23 = simpleRegression18.getIntercept();
        simpleRegression18.addData((double) (byte) 100, (double) 100.0f);
        double double28 = simpleRegression18.predict((double) 100L);
        double double29 = simpleRegression18.getR();
        double[] doubleArray32 = new double[] { 100L, 100.0d };
        double[] doubleArray35 = new double[] { 100L, 100.0d };
        double[] doubleArray38 = new double[] { 100L, 100.0d };
        double[] doubleArray41 = new double[] { 100L, 100.0d };
        double[] doubleArray44 = new double[] { 100L, 100.0d };
        double[] doubleArray47 = new double[] { 100L, 100.0d };
        double[][] doubleArray48 = new double[][] { doubleArray32, doubleArray35, doubleArray38, doubleArray41, doubleArray44, doubleArray47 };
        simpleRegression18.addData(doubleArray48);
        simpleRegression9.addData(doubleArray48);
        simpleRegression0.addData(doubleArray48);
        double double52 = simpleRegression0.getR();
        double double53 = simpleRegression0.getInterceptStdErr();
        double double54 = simpleRegression0.getInterceptStdErr();
        long long55 = simpleRegression0.getN();
        double double56 = simpleRegression0.getSignificance();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 6L + "'", long55 == 6L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        long long12 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long14 = simpleRegression13.getN();
        double double15 = simpleRegression13.getRSquare();
        double double16 = simpleRegression13.getTotalSumSquares();
        double[] doubleArray21 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray26 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray27 = new double[][] { doubleArray21, doubleArray26 };
        simpleRegression13.addData(doubleArray27);
        simpleRegression0.addData(doubleArray27);
        long long30 = simpleRegression0.getN();
        long long31 = simpleRegression0.getN();
        double double32 = simpleRegression0.getInterceptStdErr();
        long long33 = simpleRegression0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3L + "'", long30 == 3L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 3L + "'", long31 == 3L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 3L + "'", long33 == 3L);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSlope();
        double double11 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double13 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict((-3.7252902984619143E-10d));
        java.lang.Class<?> wildcardClass6 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getRegressionSumSquares();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getIntercept();
        double double12 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData(562.7906976744185d, 8743.714285714286d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression5 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long6 = simpleRegression5.getN();
        double double7 = simpleRegression5.getSumSquaredErrors();
        double double9 = simpleRegression5.predict((double) 10L);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression10 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long11 = simpleRegression10.getN();
        double double12 = simpleRegression10.getSumSquaredErrors();
        double double13 = simpleRegression10.getRegressionSumSquares();
        simpleRegression10.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long18 = simpleRegression17.getN();
        double double19 = simpleRegression17.getSumSquaredErrors();
        double double21 = simpleRegression17.predict((double) 10L);
        double double22 = simpleRegression17.getIntercept();
        simpleRegression17.addData((double) (byte) 100, (double) 100.0f);
        double double27 = simpleRegression17.predict((double) 100L);
        double double28 = simpleRegression17.getR();
        double[] doubleArray31 = new double[] { 100L, 100.0d };
        double[] doubleArray34 = new double[] { 100L, 100.0d };
        double[] doubleArray37 = new double[] { 100L, 100.0d };
        double[] doubleArray40 = new double[] { 100L, 100.0d };
        double[] doubleArray43 = new double[] { 100L, 100.0d };
        double[] doubleArray46 = new double[] { 100L, 100.0d };
        double[][] doubleArray47 = new double[][] { doubleArray31, doubleArray34, doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        simpleRegression17.addData(doubleArray47);
        simpleRegression10.addData(doubleArray47);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression50 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long51 = simpleRegression50.getN();
        double double52 = simpleRegression50.getSumSquaredErrors();
        double double54 = simpleRegression50.predict((double) 10L);
        double double55 = simpleRegression50.getIntercept();
        double double56 = simpleRegression50.getRegressionSumSquares();
        long long57 = simpleRegression50.getN();
        double double58 = simpleRegression50.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression59 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long60 = simpleRegression59.getN();
        double double61 = simpleRegression59.getSumSquaredErrors();
        double double63 = simpleRegression59.predict((double) 10L);
        double double64 = simpleRegression59.getIntercept();
        simpleRegression59.addData((double) (byte) 100, (double) 100.0f);
        double double69 = simpleRegression59.predict((double) 100L);
        double double70 = simpleRegression59.getR();
        double[] doubleArray73 = new double[] { 100L, 100.0d };
        double[] doubleArray76 = new double[] { 100L, 100.0d };
        double[] doubleArray79 = new double[] { 100L, 100.0d };
        double[] doubleArray82 = new double[] { 100L, 100.0d };
        double[] doubleArray85 = new double[] { 100L, 100.0d };
        double[] doubleArray88 = new double[] { 100L, 100.0d };
        double[][] doubleArray89 = new double[][] { doubleArray73, doubleArray76, doubleArray79, doubleArray82, doubleArray85, doubleArray88 };
        simpleRegression59.addData(doubleArray89);
        simpleRegression50.addData(doubleArray89);
        simpleRegression10.addData(doubleArray89);
        simpleRegression5.addData(doubleArray89);
        simpleRegression0.addData(doubleArray89);
        double double95 = simpleRegression0.getSlopeStdErr();
        double double96 = simpleRegression0.getTotalSumSquares();
        long long97 = simpleRegression0.getN();
        double double99 = simpleRegression0.predict((double) 1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertTrue(Double.isNaN(double95));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 6L + "'", long97 == 6L);
        org.junit.Assert.assertTrue(Double.isNaN(double99));
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getTotalSumSquares();
        long long4 = simpleRegression0.getN();
        double double6 = simpleRegression0.predict(0.0d);
        long long7 = simpleRegression0.getN();
        double double9 = simpleRegression0.predict((double) 100.0f);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression10 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long11 = simpleRegression10.getN();
        double double12 = simpleRegression10.getSumSquaredErrors();
        double double14 = simpleRegression10.predict((double) 10L);
        double double15 = simpleRegression10.getIntercept();
        simpleRegression10.addData((double) (byte) 100, (double) 100.0f);
        double double20 = simpleRegression10.predict((double) 100L);
        double double21 = simpleRegression10.getMeanSquareError();
        double double22 = simpleRegression10.getRSquare();
        simpleRegression10.clear();
        double double24 = simpleRegression10.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long26 = simpleRegression25.getN();
        double double27 = simpleRegression25.getSumSquaredErrors();
        double double29 = simpleRegression25.predict((double) 10L);
        double double30 = simpleRegression25.getIntercept();
        double double31 = simpleRegression25.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression32 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long33 = simpleRegression32.getN();
        double double34 = simpleRegression32.getSumSquaredErrors();
        long long35 = simpleRegression32.getN();
        long long36 = simpleRegression32.getN();
        double[][] doubleArray37 = new double[][] {};
        simpleRegression32.addData(doubleArray37);
        simpleRegression25.addData(doubleArray37);
        double double41 = simpleRegression25.predict((double) (-1L));
        double double42 = simpleRegression25.getSumSquaredErrors();
        long long43 = simpleRegression25.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression44 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long45 = simpleRegression44.getN();
        double double46 = simpleRegression44.getSumSquaredErrors();
        double double48 = simpleRegression44.predict((double) 10L);
        double double49 = simpleRegression44.getIntercept();
        double double50 = simpleRegression44.getRegressionSumSquares();
        long long51 = simpleRegression44.getN();
        double double52 = simpleRegression44.getR();
        double double53 = simpleRegression44.getR();
        double double54 = simpleRegression44.getSumSquaredErrors();
        double double55 = simpleRegression44.getTotalSumSquares();
        double double57 = simpleRegression44.predict((double) (short) -1);
        double double58 = simpleRegression44.getTotalSumSquares();
        long long59 = simpleRegression44.getN();
        double double60 = simpleRegression44.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression61 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long62 = simpleRegression61.getN();
        double double63 = simpleRegression61.getSumSquaredErrors();
        double double65 = simpleRegression61.predict((double) 10L);
        double double66 = simpleRegression61.getIntercept();
        double double67 = simpleRegression61.getRegressionSumSquares();
        long long68 = simpleRegression61.getN();
        double double69 = simpleRegression61.getR();
        double double70 = simpleRegression61.getSlope();
        double double71 = simpleRegression61.getRegressionSumSquares();
        double[] doubleArray74 = new double[] { 1L, ' ' };
        double[] doubleArray77 = new double[] { 1L, ' ' };
        double[] doubleArray80 = new double[] { 1L, ' ' };
        double[] doubleArray83 = new double[] { 1L, ' ' };
        double[] doubleArray86 = new double[] { 1L, ' ' };
        double[] doubleArray89 = new double[] { 1L, ' ' };
        double[][] doubleArray90 = new double[][] { doubleArray74, doubleArray77, doubleArray80, doubleArray83, doubleArray86, doubleArray89 };
        simpleRegression61.addData(doubleArray90);
        simpleRegression44.addData(doubleArray90);
        simpleRegression25.addData(doubleArray90);
        simpleRegression10.addData(doubleArray90);
        simpleRegression0.addData(doubleArray90);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) (byte) -1, (double) (-1L));
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getIntercept();
        long long11 = simpleRegression0.getN();
        double double12 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double11 = simpleRegression0.getSlope();
        double double12 = simpleRegression0.getIntercept();
        double double13 = simpleRegression0.getMeanSquareError();
        double double15 = simpleRegression0.predict(6.514835844650013E-9d);
        double double16 = simpleRegression0.getR();
        double double17 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        long long10 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double12 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long15 = simpleRegression14.getN();
        double double16 = simpleRegression14.getSumSquaredErrors();
        double double18 = simpleRegression14.predict((double) 10L);
        double double19 = simpleRegression14.getIntercept();
        double double20 = simpleRegression14.getRegressionSumSquares();
        long long21 = simpleRegression14.getN();
        double double22 = simpleRegression14.getRSquare();
        double double23 = simpleRegression14.getRSquare();
        double double24 = simpleRegression14.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long26 = simpleRegression25.getN();
        double double27 = simpleRegression25.getSumSquaredErrors();
        long long28 = simpleRegression25.getN();
        double double30 = simpleRegression25.predict(100.0d);
        double double31 = simpleRegression25.getInterceptStdErr();
        double double33 = simpleRegression25.predict((double) 1);
        simpleRegression25.clear();
        double double35 = simpleRegression25.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression36 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long37 = simpleRegression36.getN();
        double double38 = simpleRegression36.getSumSquaredErrors();
        double double40 = simpleRegression36.predict((double) 10L);
        double double41 = simpleRegression36.getIntercept();
        double double42 = simpleRegression36.getRegressionSumSquares();
        long long43 = simpleRegression36.getN();
        double double44 = simpleRegression36.getR();
        double double45 = simpleRegression36.getR();
        double double46 = simpleRegression36.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression47 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long48 = simpleRegression47.getN();
        double double49 = simpleRegression47.getSumSquaredErrors();
        double double51 = simpleRegression47.predict((double) 10L);
        double double52 = simpleRegression47.getIntercept();
        double double53 = simpleRegression47.getRegressionSumSquares();
        long long54 = simpleRegression47.getN();
        double double55 = simpleRegression47.getR();
        double double56 = simpleRegression47.getSlope();
        double double57 = simpleRegression47.getRegressionSumSquares();
        double[] doubleArray60 = new double[] { 1L, ' ' };
        double[] doubleArray63 = new double[] { 1L, ' ' };
        double[] doubleArray66 = new double[] { 1L, ' ' };
        double[] doubleArray69 = new double[] { 1L, ' ' };
        double[] doubleArray72 = new double[] { 1L, ' ' };
        double[] doubleArray75 = new double[] { 1L, ' ' };
        double[][] doubleArray76 = new double[][] { doubleArray60, doubleArray63, doubleArray66, doubleArray69, doubleArray72, doubleArray75 };
        simpleRegression47.addData(doubleArray76);
        simpleRegression36.addData(doubleArray76);
        simpleRegression25.addData(doubleArray76);
        simpleRegression14.addData(doubleArray76);
        simpleRegression0.addData(doubleArray76);
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getIntercept();
        simpleRegression0.addData(6793.959302325581d, (double) (-1L));
        double double16 = simpleRegression0.getTotalSumSquares();
        double double18 = simpleRegression0.predict(0.4738681978612443d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) (byte) 10, (double) (-1.0f));
        simpleRegression0.addData((double) 0L, (double) 'a');
        double double11 = simpleRegression0.getInterceptStdErr();
        long long12 = simpleRegression0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double11 = simpleRegression0.getSlope();
        double double12 = simpleRegression0.getIntercept();
        double double13 = simpleRegression0.getRegressionSumSquares();
        double double14 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getInterceptStdErr();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getRSquare();
        double double14 = simpleRegression0.predict((-1.0d));
        double double15 = simpleRegression0.getMeanSquareError();
        double double16 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getMeanSquareError();
        simpleRegression0.addData(0.541396879312175d, (double) 1.0f);
        double double14 = simpleRegression0.getMeanSquareError();
        double double15 = simpleRegression0.getIntercept();
        double double16 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSlope();
        double double11 = simpleRegression0.getRegressionSumSquares();
        double double12 = simpleRegression0.getRSquare();
        double double13 = simpleRegression0.getMeanSquareError();
        double double14 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) (byte) 10, (double) (-1.0f));
        simpleRegression0.addData((double) 0L, (double) 'a');
        double double11 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.getR();
        double double13 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSumSquaredErrors();
        long long11 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getR();
        double double5 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double14 = simpleRegression0.getTotalSumSquares();
        double double15 = simpleRegression0.getTotalSumSquares();
        double double16 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getIntercept();
        double double12 = simpleRegression0.getTotalSumSquares();
        double double13 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        simpleRegression0.clear();
        double double8 = simpleRegression0.getTotalSumSquares();
        long long9 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double11 = simpleRegression0.getSlopeStdErr();
        double double12 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getIntercept();
        double double13 = simpleRegression0.getSlope();
        double double14 = simpleRegression0.getRegressionSumSquares();
        double double15 = simpleRegression0.getSlopeStdErr();
        double double16 = simpleRegression0.getRegressionSumSquares();
        double double17 = simpleRegression0.getSlopeStdErr();
        double double18 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double17 = simpleRegression7.predict((double) 100L);
        double double18 = simpleRegression7.getR();
        double[] doubleArray21 = new double[] { 100L, 100.0d };
        double[] doubleArray24 = new double[] { 100L, 100.0d };
        double[] doubleArray27 = new double[] { 100L, 100.0d };
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        simpleRegression7.addData(doubleArray37);
        simpleRegression0.addData(doubleArray37);
        double double40 = simpleRegression0.getRSquare();
        double double41 = simpleRegression0.getR();
        double double43 = simpleRegression0.predict((double) (byte) 0);
        simpleRegression0.addData(6.0d, (double) 100);
        double double47 = simpleRegression0.getSlope();
        double double48 = simpleRegression0.getSlope();
        double double49 = simpleRegression0.getMeanSquareError();
        double double50 = simpleRegression0.getSlope();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9999999999999998d + "'", double40 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.9999999999999999d + "'", double41 == 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.9999999999999838d) + "'", double43 == (-0.9999999999999838d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.541396879312175d + "'", double47 == 0.541396879312175d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.541396879312175d + "'", double48 == 0.541396879312175d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 797.2971376003962d + "'", double49 == 797.2971376003962d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.541396879312175d + "'", double50 == 0.541396879312175d);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getSlopeStdErr();
        double double12 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        double double14 = simpleRegression0.getInterceptStdErr();
        double double15 = simpleRegression0.getSlope();
        double double17 = simpleRegression0.predict(6272.666666119261d);
        double double18 = simpleRegression0.getIntercept();
        double double19 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getTotalSumSquares();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getInterceptStdErr();
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double14 = simpleRegression0.getSlopeStdErr();
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict((-3.7252902984619143E-10d));
        double double7 = simpleRegression0.predict((-2.7284841053187847E-12d));
        java.lang.Class<?> wildcardClass8 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.predict(4.232527564042065E-9d);
        long long9 = simpleRegression0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getMeanSquareError();
        double double11 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.getRegressionSumSquares();
        double double13 = simpleRegression0.getRSquare();
        double double14 = simpleRegression0.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long16 = simpleRegression15.getN();
        double double17 = simpleRegression15.getSumSquaredErrors();
        long long18 = simpleRegression15.getN();
        double double20 = simpleRegression15.predict(100.0d);
        double double21 = simpleRegression15.getInterceptStdErr();
        double double23 = simpleRegression15.predict((double) 1);
        double double24 = simpleRegression15.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long26 = simpleRegression25.getN();
        double double27 = simpleRegression25.getSumSquaredErrors();
        double double29 = simpleRegression25.predict((double) 10L);
        double double30 = simpleRegression25.getIntercept();
        double double31 = simpleRegression25.getRegressionSumSquares();
        long long32 = simpleRegression25.getN();
        double double33 = simpleRegression25.getR();
        double double34 = simpleRegression25.getSlope();
        double double35 = simpleRegression25.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression36 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long37 = simpleRegression36.getN();
        double double38 = simpleRegression36.getSumSquaredErrors();
        double double39 = simpleRegression36.getRegressionSumSquares();
        simpleRegression36.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression43 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long44 = simpleRegression43.getN();
        double double45 = simpleRegression43.getSumSquaredErrors();
        double double47 = simpleRegression43.predict((double) 10L);
        double double48 = simpleRegression43.getIntercept();
        simpleRegression43.addData((double) (byte) 100, (double) 100.0f);
        double double53 = simpleRegression43.predict((double) 100L);
        double double54 = simpleRegression43.getR();
        double[] doubleArray57 = new double[] { 100L, 100.0d };
        double[] doubleArray60 = new double[] { 100L, 100.0d };
        double[] doubleArray63 = new double[] { 100L, 100.0d };
        double[] doubleArray66 = new double[] { 100L, 100.0d };
        double[] doubleArray69 = new double[] { 100L, 100.0d };
        double[] doubleArray72 = new double[] { 100L, 100.0d };
        double[][] doubleArray73 = new double[][] { doubleArray57, doubleArray60, doubleArray63, doubleArray66, doubleArray69, doubleArray72 };
        simpleRegression43.addData(doubleArray73);
        simpleRegression36.addData(doubleArray73);
        double double76 = simpleRegression36.getRSquare();
        double double77 = simpleRegression36.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression78 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long79 = simpleRegression78.getN();
        double double80 = simpleRegression78.getSumSquaredErrors();
        double double82 = simpleRegression78.predict((double) 10L);
        double double83 = simpleRegression78.getIntercept();
        double double84 = simpleRegression78.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression85 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long86 = simpleRegression85.getN();
        double double87 = simpleRegression85.getSumSquaredErrors();
        long long88 = simpleRegression85.getN();
        long long89 = simpleRegression85.getN();
        double[][] doubleArray90 = new double[][] {};
        simpleRegression85.addData(doubleArray90);
        simpleRegression78.addData(doubleArray90);
        simpleRegression36.addData(doubleArray90);
        simpleRegression25.addData(doubleArray90);
        simpleRegression15.addData(doubleArray90);
        simpleRegression0.addData(doubleArray90);
        simpleRegression0.addData((double) 'a', 4.267242227290615E-9d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.9999999999999998d + "'", double76 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.9999999999999999d + "'", double77 == 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertNotNull(doubleArray90);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double17 = simpleRegression7.predict((double) 100L);
        double double18 = simpleRegression7.getR();
        double[] doubleArray21 = new double[] { 100L, 100.0d };
        double[] doubleArray24 = new double[] { 100L, 100.0d };
        double[] doubleArray27 = new double[] { 100L, 100.0d };
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        simpleRegression7.addData(doubleArray37);
        simpleRegression0.addData(doubleArray37);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression40 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long41 = simpleRegression40.getN();
        double double42 = simpleRegression40.getSumSquaredErrors();
        double double44 = simpleRegression40.predict((double) 10L);
        double double45 = simpleRegression40.getIntercept();
        double double46 = simpleRegression40.getRegressionSumSquares();
        long long47 = simpleRegression40.getN();
        double double48 = simpleRegression40.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression49 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long50 = simpleRegression49.getN();
        double double51 = simpleRegression49.getSumSquaredErrors();
        double double53 = simpleRegression49.predict((double) 10L);
        double double54 = simpleRegression49.getIntercept();
        simpleRegression49.addData((double) (byte) 100, (double) 100.0f);
        double double59 = simpleRegression49.predict((double) 100L);
        double double60 = simpleRegression49.getR();
        double[] doubleArray63 = new double[] { 100L, 100.0d };
        double[] doubleArray66 = new double[] { 100L, 100.0d };
        double[] doubleArray69 = new double[] { 100L, 100.0d };
        double[] doubleArray72 = new double[] { 100L, 100.0d };
        double[] doubleArray75 = new double[] { 100L, 100.0d };
        double[] doubleArray78 = new double[] { 100L, 100.0d };
        double[][] doubleArray79 = new double[][] { doubleArray63, doubleArray66, doubleArray69, doubleArray72, doubleArray75, doubleArray78 };
        simpleRegression49.addData(doubleArray79);
        simpleRegression40.addData(doubleArray79);
        simpleRegression0.addData(doubleArray79);
        double double83 = simpleRegression0.getRegressionSumSquares();
        double double84 = simpleRegression0.getInterceptStdErr();
        double double85 = simpleRegression0.getSlope();
        double double86 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 9416.307692307693d + "'", double83 == 9416.307692307693d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 4.066480948555191E-7d + "'", double84 == 4.066480948555191E-7d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 1.01d + "'", double85 == 1.01d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 9416.307692307693d + "'", double86 == 9416.307692307693d);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double17 = simpleRegression7.predict((double) 100L);
        double double18 = simpleRegression7.getR();
        double[] doubleArray21 = new double[] { 100L, 100.0d };
        double[] doubleArray24 = new double[] { 100L, 100.0d };
        double[] doubleArray27 = new double[] { 100L, 100.0d };
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        simpleRegression7.addData(doubleArray37);
        simpleRegression0.addData(doubleArray37);
        double double40 = simpleRegression0.getRSquare();
        double double41 = simpleRegression0.getSlope();
        double double42 = simpleRegression0.getInterceptStdErr();
        double double43 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9999999999999998d + "'", double40 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0099999999999998d + "'", double41 == 1.0099999999999998d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 6.031565971695669E-7d + "'", double42 == 6.031565971695669E-7d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.6746918727301837E-8d + "'", double43 == 1.6746918727301837E-8d);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getR();
        double double8 = simpleRegression0.getR();
        double double10 = simpleRegression0.predict(1.4004436411137009E7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getRegressionSumSquares();
        double double9 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval(9292.28665227061d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        simpleRegression0.clear();
        double double8 = simpleRegression0.getRegressionSumSquares();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double10 = simpleRegression7.getRegressionSumSquares();
        simpleRegression7.addData(0.0d, (-1.0d));
        double double14 = simpleRegression7.getR();
        double double16 = simpleRegression7.predict(10.0d);
        double double18 = simpleRegression7.predict(100.0d);
        double double20 = simpleRegression7.predict((double) (short) 0);
        long long21 = simpleRegression7.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long23 = simpleRegression22.getN();
        double double24 = simpleRegression22.getSumSquaredErrors();
        double double26 = simpleRegression22.predict((double) 10L);
        double double27 = simpleRegression22.getIntercept();
        double double28 = simpleRegression22.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression29 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long30 = simpleRegression29.getN();
        double double31 = simpleRegression29.getSumSquaredErrors();
        long long32 = simpleRegression29.getN();
        long long33 = simpleRegression29.getN();
        double[][] doubleArray34 = new double[][] {};
        simpleRegression29.addData(doubleArray34);
        simpleRegression22.addData(doubleArray34);
        simpleRegression7.addData(doubleArray34);
        simpleRegression0.addData(doubleArray34);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression39 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long40 = simpleRegression39.getN();
        double double41 = simpleRegression39.getSumSquaredErrors();
        long long42 = simpleRegression39.getN();
        double double43 = simpleRegression39.getTotalSumSquares();
        double double44 = simpleRegression39.getSlopeStdErr();
        double double45 = simpleRegression39.getR();
        double double47 = simpleRegression39.predict((double) 100);
        double[] doubleArray54 = new double[] { 100, 1, 100, (-1L), '4', 6L };
        double[] doubleArray61 = new double[] { 100, 1, 100, (-1L), '4', 6L };
        double[][] doubleArray62 = new double[][] { doubleArray54, doubleArray61 };
        simpleRegression39.addData(doubleArray62);
        simpleRegression0.addData(doubleArray62);
        double double65 = simpleRegression0.getSlopeStdErr();
        double double66 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 1.0, 100.0, -1.0, 52.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 1.0, 100.0, -1.0, 52.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getSlope();
        simpleRegression0.clear();
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getTotalSumSquares();
        double double16 = simpleRegression0.predict((double) (short) 1);
        double double18 = simpleRegression0.predict((double) '#');
        double double20 = simpleRegression0.predict((double) (short) -1);
        double double21 = simpleRegression0.getSlope();
        double double23 = simpleRegression0.predict((double) (-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getR();
        double double2 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression5 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long6 = simpleRegression5.getN();
        double double7 = simpleRegression5.getSumSquaredErrors();
        double double9 = simpleRegression5.predict((double) 10L);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression10 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long11 = simpleRegression10.getN();
        double double12 = simpleRegression10.getSumSquaredErrors();
        double double13 = simpleRegression10.getRegressionSumSquares();
        simpleRegression10.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long18 = simpleRegression17.getN();
        double double19 = simpleRegression17.getSumSquaredErrors();
        double double21 = simpleRegression17.predict((double) 10L);
        double double22 = simpleRegression17.getIntercept();
        simpleRegression17.addData((double) (byte) 100, (double) 100.0f);
        double double27 = simpleRegression17.predict((double) 100L);
        double double28 = simpleRegression17.getR();
        double[] doubleArray31 = new double[] { 100L, 100.0d };
        double[] doubleArray34 = new double[] { 100L, 100.0d };
        double[] doubleArray37 = new double[] { 100L, 100.0d };
        double[] doubleArray40 = new double[] { 100L, 100.0d };
        double[] doubleArray43 = new double[] { 100L, 100.0d };
        double[] doubleArray46 = new double[] { 100L, 100.0d };
        double[][] doubleArray47 = new double[][] { doubleArray31, doubleArray34, doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        simpleRegression17.addData(doubleArray47);
        simpleRegression10.addData(doubleArray47);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression50 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long51 = simpleRegression50.getN();
        double double52 = simpleRegression50.getSumSquaredErrors();
        double double54 = simpleRegression50.predict((double) 10L);
        double double55 = simpleRegression50.getIntercept();
        double double56 = simpleRegression50.getRegressionSumSquares();
        long long57 = simpleRegression50.getN();
        double double58 = simpleRegression50.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression59 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long60 = simpleRegression59.getN();
        double double61 = simpleRegression59.getSumSquaredErrors();
        double double63 = simpleRegression59.predict((double) 10L);
        double double64 = simpleRegression59.getIntercept();
        simpleRegression59.addData((double) (byte) 100, (double) 100.0f);
        double double69 = simpleRegression59.predict((double) 100L);
        double double70 = simpleRegression59.getR();
        double[] doubleArray73 = new double[] { 100L, 100.0d };
        double[] doubleArray76 = new double[] { 100L, 100.0d };
        double[] doubleArray79 = new double[] { 100L, 100.0d };
        double[] doubleArray82 = new double[] { 100L, 100.0d };
        double[] doubleArray85 = new double[] { 100L, 100.0d };
        double[] doubleArray88 = new double[] { 100L, 100.0d };
        double[][] doubleArray89 = new double[][] { doubleArray73, doubleArray76, doubleArray79, doubleArray82, doubleArray85, doubleArray88 };
        simpleRegression59.addData(doubleArray89);
        simpleRegression50.addData(doubleArray89);
        simpleRegression10.addData(doubleArray89);
        simpleRegression5.addData(doubleArray89);
        simpleRegression0.addData(doubleArray89);
        double double95 = simpleRegression0.getSlopeStdErr();
        double double96 = simpleRegression0.getSignificance();
        double double97 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertTrue(Double.isNaN(double95));
        org.junit.Assert.assertTrue(Double.isNaN(double96));
        org.junit.Assert.assertTrue(Double.isNaN(double97));
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) (byte) 10, (double) (-1.0f));
        double double9 = simpleRegression0.predict(0.0d);
        double double10 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getIntercept();
        double double13 = simpleRegression0.getSlope();
        double double14 = simpleRegression0.getRegressionSumSquares();
        double double15 = simpleRegression0.getSlopeStdErr();
        double double16 = simpleRegression0.getRegressionSumSquares();
        double double17 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getMeanSquareError();
        double double10 = simpleRegression0.predict(0.23791906001465818d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long10 = simpleRegression9.getN();
        double double11 = simpleRegression9.getSumSquaredErrors();
        double double13 = simpleRegression9.predict((double) 10L);
        double double14 = simpleRegression9.getIntercept();
        double double15 = simpleRegression9.getRegressionSumSquares();
        long long16 = simpleRegression9.getN();
        double double17 = simpleRegression9.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long19 = simpleRegression18.getN();
        double double20 = simpleRegression18.getSumSquaredErrors();
        double double22 = simpleRegression18.predict((double) 10L);
        double double23 = simpleRegression18.getIntercept();
        simpleRegression18.addData((double) (byte) 100, (double) 100.0f);
        double double28 = simpleRegression18.predict((double) 100L);
        double double29 = simpleRegression18.getR();
        double[] doubleArray32 = new double[] { 100L, 100.0d };
        double[] doubleArray35 = new double[] { 100L, 100.0d };
        double[] doubleArray38 = new double[] { 100L, 100.0d };
        double[] doubleArray41 = new double[] { 100L, 100.0d };
        double[] doubleArray44 = new double[] { 100L, 100.0d };
        double[] doubleArray47 = new double[] { 100L, 100.0d };
        double[][] doubleArray48 = new double[][] { doubleArray32, doubleArray35, doubleArray38, doubleArray41, doubleArray44, doubleArray47 };
        simpleRegression18.addData(doubleArray48);
        simpleRegression9.addData(doubleArray48);
        simpleRegression0.addData(doubleArray48);
        double double52 = simpleRegression0.getR();
        double double53 = simpleRegression0.getTotalSumSquares();
        double double55 = simpleRegression0.predict(0.007254766457202081d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getTotalSumSquares();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getSlopeStdErr();
        long long10 = simpleRegression0.getN();
        double double12 = simpleRegression0.predict(0.0d);
        double double13 = simpleRegression0.getSumSquaredErrors();
        double double15 = simpleRegression0.predict(797.2971376003962d);
        double double16 = simpleRegression0.getTotalSumSquares();
        double double17 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        simpleRegression0.clear();
        double double8 = simpleRegression0.getTotalSumSquares();
        long long9 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double11 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSlopeConfidenceInterval((double) 9L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getSlopeStdErr();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData(1.0d, Double.NaN);
        double double14 = simpleRegression0.getInterceptStdErr();
        double double15 = simpleRegression0.getR();
        double double16 = simpleRegression0.getIntercept();
        double double17 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        simpleRegression0.addData((double) 6L, (double) (byte) 0);
        double double11 = simpleRegression0.getR();
        simpleRegression0.addData(0.6983204134366925d, (double) (byte) -1);
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double17 = simpleRegression0.predict(13690.473878853938d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.007549314087103909d + "'", double15 == 0.007549314087103909d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2394.240347750163d + "'", double17 == 2394.240347750163d);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict(0.007254766457202081d);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long7 = simpleRegression6.getN();
        double double8 = simpleRegression6.getSumSquaredErrors();
        double double10 = simpleRegression6.predict((double) 10L);
        double double11 = simpleRegression6.getIntercept();
        simpleRegression6.addData((double) (byte) 100, (double) 100.0f);
        double double15 = simpleRegression6.getIntercept();
        double double16 = simpleRegression6.getRegressionSumSquares();
        double double17 = simpleRegression6.getR();
        double double18 = simpleRegression6.getIntercept();
        double double19 = simpleRegression6.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression20 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long21 = simpleRegression20.getN();
        double double22 = simpleRegression20.getTotalSumSquares();
        double double23 = simpleRegression20.getSlopeStdErr();
        double double25 = simpleRegression20.predict((double) 3L);
        double double26 = simpleRegression20.getRegressionSumSquares();
        long long27 = simpleRegression20.getN();
        long long28 = simpleRegression20.getN();
        double double29 = simpleRegression20.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression30 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long31 = simpleRegression30.getN();
        double double32 = simpleRegression30.getSumSquaredErrors();
        double double34 = simpleRegression30.predict((double) 10L);
        double double35 = simpleRegression30.getIntercept();
        double double36 = simpleRegression30.getMeanSquareError();
        long long37 = simpleRegression30.getN();
        double double38 = simpleRegression30.getR();
        double double39 = simpleRegression30.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression40 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long41 = simpleRegression40.getN();
        double double42 = simpleRegression40.getSumSquaredErrors();
        double double43 = simpleRegression40.getTotalSumSquares();
        double double44 = simpleRegression40.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression45 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double46 = simpleRegression45.getSumSquaredErrors();
        double double47 = simpleRegression45.getSumSquaredErrors();
        simpleRegression45.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression49 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long50 = simpleRegression49.getN();
        double double51 = simpleRegression49.getSumSquaredErrors();
        double double53 = simpleRegression49.predict((double) 10L);
        double double54 = simpleRegression49.getIntercept();
        simpleRegression49.addData((double) (byte) 100, (double) 100.0f);
        double double59 = simpleRegression49.predict((double) 100L);
        double double60 = simpleRegression49.getMeanSquareError();
        long long61 = simpleRegression49.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression62 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long63 = simpleRegression62.getN();
        double double64 = simpleRegression62.getRSquare();
        double double65 = simpleRegression62.getTotalSumSquares();
        double[] doubleArray70 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray75 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray76 = new double[][] { doubleArray70, doubleArray75 };
        simpleRegression62.addData(doubleArray76);
        simpleRegression49.addData(doubleArray76);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression79 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long80 = simpleRegression79.getN();
        double double81 = simpleRegression79.getSumSquaredErrors();
        long long82 = simpleRegression79.getN();
        long long83 = simpleRegression79.getN();
        double[][] doubleArray84 = new double[][] {};
        simpleRegression79.addData(doubleArray84);
        simpleRegression49.addData(doubleArray84);
        simpleRegression45.addData(doubleArray84);
        simpleRegression40.addData(doubleArray84);
        simpleRegression30.addData(doubleArray84);
        simpleRegression20.addData(doubleArray84);
        simpleRegression6.addData(doubleArray84);
        simpleRegression0.addData(doubleArray84);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(doubleArray84);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        long long10 = simpleRegression7.getN();
        long long11 = simpleRegression7.getN();
        double[][] doubleArray12 = new double[][] {};
        simpleRegression7.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double16 = simpleRegression0.predict((double) (-1L));
        double double17 = simpleRegression0.getTotalSumSquares();
        double double18 = simpleRegression0.getTotalSumSquares();
        double double19 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getIntercept();
        simpleRegression0.addData(6793.959302325581d, (double) (-1L));
        double double16 = simpleRegression0.getRegressionSumSquares();
        double double17 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.clear();
        simpleRegression0.addData(0.29496726124856915d, 0.17496090227947925d);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long9 = simpleRegression8.getN();
        double double10 = simpleRegression8.getRSquare();
        double double11 = simpleRegression8.getRegressionSumSquares();
        double double12 = simpleRegression8.getRSquare();
        double double13 = simpleRegression8.getTotalSumSquares();
        double double14 = simpleRegression8.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long16 = simpleRegression15.getN();
        double double17 = simpleRegression15.getSumSquaredErrors();
        double double19 = simpleRegression15.predict((double) 10L);
        double double20 = simpleRegression15.getIntercept();
        simpleRegression15.addData((double) (byte) 100, (double) 100.0f);
        double double24 = simpleRegression15.getIntercept();
        double double25 = simpleRegression15.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long27 = simpleRegression26.getN();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) 10L);
        double double31 = simpleRegression26.getIntercept();
        simpleRegression26.addData((double) (byte) 100, (double) 100.0f);
        double double36 = simpleRegression26.predict((double) 100L);
        double double37 = simpleRegression26.getMeanSquareError();
        long long38 = simpleRegression26.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression39 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long40 = simpleRegression39.getN();
        double double41 = simpleRegression39.getRSquare();
        double double42 = simpleRegression39.getTotalSumSquares();
        double[] doubleArray47 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray52 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray53 = new double[][] { doubleArray47, doubleArray52 };
        simpleRegression39.addData(doubleArray53);
        simpleRegression26.addData(doubleArray53);
        simpleRegression15.addData(doubleArray53);
        simpleRegression8.addData(doubleArray53);
        simpleRegression0.addData(doubleArray53);
        double double59 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 2.8694394137009966E-6d + "'", double59 == 2.8694394137009966E-6d);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double7 = simpleRegression0.predict((-2.009999999999984d));
        double double8 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long10 = simpleRegression9.getN();
        double double11 = simpleRegression9.getSlope();
        simpleRegression9.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long14 = simpleRegression13.getN();
        double double15 = simpleRegression13.getSumSquaredErrors();
        double double17 = simpleRegression13.predict((double) 10L);
        double double18 = simpleRegression13.getIntercept();
        simpleRegression13.addData((double) (byte) 100, (double) 100.0f);
        double double23 = simpleRegression13.predict((double) 100L);
        double double24 = simpleRegression13.getMeanSquareError();
        long long25 = simpleRegression13.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long27 = simpleRegression26.getN();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) 10L);
        double double31 = simpleRegression26.getIntercept();
        simpleRegression26.addData((double) (byte) 100, (double) 100.0f);
        double double36 = simpleRegression26.predict((double) 100L);
        double double37 = simpleRegression26.getMeanSquareError();
        long long38 = simpleRegression26.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression39 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long40 = simpleRegression39.getN();
        double double41 = simpleRegression39.getRSquare();
        double double42 = simpleRegression39.getTotalSumSquares();
        double[] doubleArray47 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray52 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray53 = new double[][] { doubleArray47, doubleArray52 };
        simpleRegression39.addData(doubleArray53);
        simpleRegression26.addData(doubleArray53);
        simpleRegression13.addData(doubleArray53);
        simpleRegression9.addData(doubleArray53);
        simpleRegression0.addData(doubleArray53);
        double double59 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getIntercept();
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval(1.9431632708055285E-10d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlope();
        double double4 = simpleRegression0.getIntercept();
        double double5 = simpleRegression0.getR();
        simpleRegression0.addData((double) (-1), 0.5366294777987983d);
        simpleRegression0.addData(1.6746918727301837E-8d, 17.45945945945946d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData((double) 100, Double.NaN);
        java.lang.Class<?> wildcardClass14 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.addData(0.9999999999999999d, 6.0d);
        double double14 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression5 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long6 = simpleRegression5.getN();
        double double7 = simpleRegression5.getSumSquaredErrors();
        double double8 = simpleRegression5.getRegressionSumSquares();
        simpleRegression5.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression12 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long13 = simpleRegression12.getN();
        double double14 = simpleRegression12.getSumSquaredErrors();
        double double16 = simpleRegression12.predict((double) 10L);
        double double17 = simpleRegression12.getIntercept();
        simpleRegression12.addData((double) (byte) 100, (double) 100.0f);
        double double22 = simpleRegression12.predict((double) 100L);
        double double23 = simpleRegression12.getR();
        double[] doubleArray26 = new double[] { 100L, 100.0d };
        double[] doubleArray29 = new double[] { 100L, 100.0d };
        double[] doubleArray32 = new double[] { 100L, 100.0d };
        double[] doubleArray35 = new double[] { 100L, 100.0d };
        double[] doubleArray38 = new double[] { 100L, 100.0d };
        double[] doubleArray41 = new double[] { 100L, 100.0d };
        double[][] doubleArray42 = new double[][] { doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38, doubleArray41 };
        simpleRegression12.addData(doubleArray42);
        simpleRegression5.addData(doubleArray42);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression45 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long46 = simpleRegression45.getN();
        double double47 = simpleRegression45.getSumSquaredErrors();
        double double49 = simpleRegression45.predict((double) 10L);
        double double50 = simpleRegression45.getIntercept();
        double double51 = simpleRegression45.getRegressionSumSquares();
        long long52 = simpleRegression45.getN();
        double double53 = simpleRegression45.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression54 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long55 = simpleRegression54.getN();
        double double56 = simpleRegression54.getSumSquaredErrors();
        double double58 = simpleRegression54.predict((double) 10L);
        double double59 = simpleRegression54.getIntercept();
        simpleRegression54.addData((double) (byte) 100, (double) 100.0f);
        double double64 = simpleRegression54.predict((double) 100L);
        double double65 = simpleRegression54.getR();
        double[] doubleArray68 = new double[] { 100L, 100.0d };
        double[] doubleArray71 = new double[] { 100L, 100.0d };
        double[] doubleArray74 = new double[] { 100L, 100.0d };
        double[] doubleArray77 = new double[] { 100L, 100.0d };
        double[] doubleArray80 = new double[] { 100L, 100.0d };
        double[] doubleArray83 = new double[] { 100L, 100.0d };
        double[][] doubleArray84 = new double[][] { doubleArray68, doubleArray71, doubleArray74, doubleArray77, doubleArray80, doubleArray83 };
        simpleRegression54.addData(doubleArray84);
        simpleRegression45.addData(doubleArray84);
        simpleRegression5.addData(doubleArray84);
        simpleRegression0.addData(doubleArray84);
        double double89 = simpleRegression0.getRSquare();
        double double90 = simpleRegression0.getIntercept();
        double double91 = simpleRegression0.getTotalSumSquares();
        double double92 = simpleRegression0.getSlopeConfidenceInterval();
        long long93 = simpleRegression0.getN();
        double double94 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double92));
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 6L + "'", long93 == 6L);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        simpleRegression0.clear();
        double double8 = simpleRegression0.getTotalSumSquares();
        double double9 = simpleRegression0.getMeanSquareError();
        double double10 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getR();
        double double8 = simpleRegression0.predict(1.6746918727301837E-8d);
        simpleRegression0.addData((-1.862645149230957E-9d), 1.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        double double5 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.predict(99.99999999999997d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getSlopeStdErr();
        double double12 = simpleRegression0.getInterceptStdErr();
        double double13 = simpleRegression0.getSumSquaredErrors();
        double double14 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.addData(100.0d, 6.031565971695669E-7d);
        simpleRegression0.clear();
        double double19 = simpleRegression0.getSlopeStdErr();
        double double20 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData(6.0d, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getIntercept();
        simpleRegression0.addData(6793.959302325581d, (double) (-1L));
        double double16 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double9 = simpleRegression0.predict((double) 0);
        double double10 = simpleRegression0.getSlopeStdErr();
        double double12 = simpleRegression0.predict((double) 1);
        double double13 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRegressionSumSquares();
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSlope();
        double double11 = simpleRegression0.getRegressionSumSquares();
        double double12 = simpleRegression0.getInterceptStdErr();
        double double13 = simpleRegression0.getR();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData((double) 100, Double.NaN);
        double double14 = simpleRegression0.getSumSquaredErrors();
        double double15 = simpleRegression0.getRegressionSumSquares();
        double double16 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double18 = simpleRegression0.getSlope();
        double double19 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        long long10 = simpleRegression7.getN();
        long long11 = simpleRegression7.getN();
        double[][] doubleArray12 = new double[][] {};
        simpleRegression7.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double16 = simpleRegression0.predict((double) 10);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long18 = simpleRegression17.getN();
        double double19 = simpleRegression17.getSumSquaredErrors();
        double double21 = simpleRegression17.predict((double) 10L);
        double double22 = simpleRegression17.getIntercept();
        double double23 = simpleRegression17.getRegressionSumSquares();
        long long24 = simpleRegression17.getN();
        double double25 = simpleRegression17.getR();
        double double26 = simpleRegression17.getSlope();
        double double27 = simpleRegression17.getRegressionSumSquares();
        double[] doubleArray30 = new double[] { 1L, ' ' };
        double[] doubleArray33 = new double[] { 1L, ' ' };
        double[] doubleArray36 = new double[] { 1L, ' ' };
        double[] doubleArray39 = new double[] { 1L, ' ' };
        double[] doubleArray42 = new double[] { 1L, ' ' };
        double[] doubleArray45 = new double[] { 1L, ' ' };
        double[][] doubleArray46 = new double[][] { doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42, doubleArray45 };
        simpleRegression17.addData(doubleArray46);
        simpleRegression0.addData(doubleArray46);
        double double49 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double14 = simpleRegression0.getMeanSquareError();
        double double15 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getR();
        double double13 = simpleRegression0.getMeanSquareError();
        double double14 = simpleRegression0.getSlopeStdErr();
        double double15 = simpleRegression0.getIntercept();
        double double16 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData(0.23791906001465818d, 9416.307692307693d);
        double double11 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long14 = simpleRegression13.getN();
        double double15 = simpleRegression13.getInterceptStdErr();
        double double16 = simpleRegression13.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long18 = simpleRegression17.getN();
        double double19 = simpleRegression17.getSumSquaredErrors();
        double double21 = simpleRegression17.predict((double) 10L);
        double double22 = simpleRegression17.getMeanSquareError();
        double double23 = simpleRegression17.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression24 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long25 = simpleRegression24.getN();
        double double26 = simpleRegression24.getSumSquaredErrors();
        double double27 = simpleRegression24.getRegressionSumSquares();
        simpleRegression24.addData(0.0d, (-1.0d));
        double double31 = simpleRegression24.getR();
        double double33 = simpleRegression24.predict(10.0d);
        double double35 = simpleRegression24.predict(100.0d);
        double double37 = simpleRegression24.predict((double) (short) 0);
        long long38 = simpleRegression24.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression39 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long40 = simpleRegression39.getN();
        double double41 = simpleRegression39.getSumSquaredErrors();
        double double43 = simpleRegression39.predict((double) 10L);
        double double44 = simpleRegression39.getIntercept();
        double double45 = simpleRegression39.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression46 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long47 = simpleRegression46.getN();
        double double48 = simpleRegression46.getSumSquaredErrors();
        long long49 = simpleRegression46.getN();
        long long50 = simpleRegression46.getN();
        double[][] doubleArray51 = new double[][] {};
        simpleRegression46.addData(doubleArray51);
        simpleRegression39.addData(doubleArray51);
        simpleRegression24.addData(doubleArray51);
        simpleRegression17.addData(doubleArray51);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression56 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long57 = simpleRegression56.getN();
        double double58 = simpleRegression56.getSumSquaredErrors();
        long long59 = simpleRegression56.getN();
        double double60 = simpleRegression56.getTotalSumSquares();
        double double61 = simpleRegression56.getSlopeStdErr();
        double double62 = simpleRegression56.getR();
        double double64 = simpleRegression56.predict((double) 100);
        double[] doubleArray71 = new double[] { 100, 1, 100, (-1L), '4', 6L };
        double[] doubleArray78 = new double[] { 100, 1, 100, (-1L), '4', 6L };
        double[][] doubleArray79 = new double[][] { doubleArray71, doubleArray78 };
        simpleRegression56.addData(doubleArray79);
        simpleRegression17.addData(doubleArray79);
        simpleRegression13.addData(doubleArray79);
        simpleRegression0.addData(doubleArray79);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[100.0, 1.0, 100.0, -1.0, 52.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[100.0, 1.0, 100.0, -1.0, 52.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getSlopeStdErr();
        double double12 = simpleRegression0.getSumSquaredErrors();
        double double13 = simpleRegression0.getRSquare();
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getMeanSquareError();
        double double16 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.predict((double) (byte) 1);
        double double13 = simpleRegression0.getMeanSquareError();
        double double14 = simpleRegression0.getMeanSquareError();
        double double15 = simpleRegression0.getTotalSumSquares();
        double double16 = simpleRegression0.getR();
        simpleRegression0.clear();
        double double18 = simpleRegression0.getR();
        double double20 = simpleRegression0.predict(2.2737367544323207E-14d);
        double double22 = simpleRegression0.predict((double) 6L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        long long12 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long14 = simpleRegression13.getN();
        double double15 = simpleRegression13.getSumSquaredErrors();
        double double17 = simpleRegression13.predict((double) 10L);
        double double18 = simpleRegression13.getIntercept();
        simpleRegression13.addData((double) (byte) 100, (double) 100.0f);
        double double23 = simpleRegression13.predict((double) 100L);
        double double24 = simpleRegression13.getMeanSquareError();
        long long25 = simpleRegression13.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long27 = simpleRegression26.getN();
        double double28 = simpleRegression26.getRSquare();
        double double29 = simpleRegression26.getTotalSumSquares();
        double[] doubleArray34 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray39 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray40 = new double[][] { doubleArray34, doubleArray39 };
        simpleRegression26.addData(doubleArray40);
        simpleRegression13.addData(doubleArray40);
        simpleRegression0.addData(doubleArray40);
        double double45 = simpleRegression0.predict((-1.0d));
        double double46 = simpleRegression0.getSlopeConfidenceInterval();
        double double47 = simpleRegression0.getIntercept();
        double double48 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 96.93939393939395d + "'", double45 == 96.93939393939395d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 96.96969696969698d + "'", double47 == 96.96969696969698d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getRSquare();
        double double12 = simpleRegression0.getTotalSumSquares();
        double double13 = simpleRegression0.getInterceptStdErr();
        double double14 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getSlopeStdErr();
        double double12 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        double double14 = simpleRegression0.getInterceptStdErr();
        double double15 = simpleRegression0.getSlopeStdErr();
        long long16 = simpleRegression0.getN();
        double double17 = simpleRegression0.getSlopeStdErr();
        double double18 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double17 = simpleRegression7.predict((double) 100L);
        double double18 = simpleRegression7.getR();
        double[] doubleArray21 = new double[] { 100L, 100.0d };
        double[] doubleArray24 = new double[] { 100L, 100.0d };
        double[] doubleArray27 = new double[] { 100L, 100.0d };
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        simpleRegression7.addData(doubleArray37);
        simpleRegression0.addData(doubleArray37);
        double double40 = simpleRegression0.getRSquare();
        double double41 = simpleRegression0.getR();
        double double43 = simpleRegression0.predict((double) (byte) 0);
        simpleRegression0.addData(0.0d, (double) ' ');
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression47 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long48 = simpleRegression47.getN();
        double double49 = simpleRegression47.getSumSquaredErrors();
        double double51 = simpleRegression47.predict((double) 10L);
        double double52 = simpleRegression47.getIntercept();
        double double53 = simpleRegression47.getRegressionSumSquares();
        double double54 = simpleRegression47.getSumSquaredErrors();
        double double55 = simpleRegression47.getMeanSquareError();
        double double56 = simpleRegression47.getRegressionSumSquares();
        double double57 = simpleRegression47.getSumSquaredErrors();
        double[] doubleArray61 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray65 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray69 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray73 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray77 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray81 = new double[] { (byte) 1, 0L, 'a' };
        double[][] doubleArray82 = new double[][] { doubleArray61, doubleArray65, doubleArray69, doubleArray73, doubleArray77, doubleArray81 };
        simpleRegression47.addData(doubleArray82);
        simpleRegression0.addData(doubleArray82);
        double double85 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9999999999999998d + "'", double40 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.9999999999999999d + "'", double41 == 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.9999999999999838d) + "'", double43 == (-0.9999999999999838d));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.048447495599589066d + "'", double85 == 0.048447495599589066d);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        simpleRegression0.clear();
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getSumSquaredErrors();
        double double10 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        simpleRegression0.clear();
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData(4142.092174397623d, 0.17496090227947925d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        simpleRegression0.clear();
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getR();
        double double8 = simpleRegression0.getInterceptStdErr();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        long long10 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double12 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long15 = simpleRegression14.getN();
        double double16 = simpleRegression14.getSumSquaredErrors();
        double double18 = simpleRegression14.predict((double) 10L);
        double double19 = simpleRegression14.getIntercept();
        double double20 = simpleRegression14.getRegressionSumSquares();
        long long21 = simpleRegression14.getN();
        double double22 = simpleRegression14.getRSquare();
        double double23 = simpleRegression14.getRSquare();
        double double24 = simpleRegression14.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long26 = simpleRegression25.getN();
        double double27 = simpleRegression25.getSumSquaredErrors();
        long long28 = simpleRegression25.getN();
        double double30 = simpleRegression25.predict(100.0d);
        double double31 = simpleRegression25.getInterceptStdErr();
        double double33 = simpleRegression25.predict((double) 1);
        simpleRegression25.clear();
        double double35 = simpleRegression25.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression36 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long37 = simpleRegression36.getN();
        double double38 = simpleRegression36.getSumSquaredErrors();
        double double40 = simpleRegression36.predict((double) 10L);
        double double41 = simpleRegression36.getIntercept();
        double double42 = simpleRegression36.getRegressionSumSquares();
        long long43 = simpleRegression36.getN();
        double double44 = simpleRegression36.getR();
        double double45 = simpleRegression36.getR();
        double double46 = simpleRegression36.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression47 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long48 = simpleRegression47.getN();
        double double49 = simpleRegression47.getSumSquaredErrors();
        double double51 = simpleRegression47.predict((double) 10L);
        double double52 = simpleRegression47.getIntercept();
        double double53 = simpleRegression47.getRegressionSumSquares();
        long long54 = simpleRegression47.getN();
        double double55 = simpleRegression47.getR();
        double double56 = simpleRegression47.getSlope();
        double double57 = simpleRegression47.getRegressionSumSquares();
        double[] doubleArray60 = new double[] { 1L, ' ' };
        double[] doubleArray63 = new double[] { 1L, ' ' };
        double[] doubleArray66 = new double[] { 1L, ' ' };
        double[] doubleArray69 = new double[] { 1L, ' ' };
        double[] doubleArray72 = new double[] { 1L, ' ' };
        double[] doubleArray75 = new double[] { 1L, ' ' };
        double[][] doubleArray76 = new double[][] { doubleArray60, doubleArray63, doubleArray66, doubleArray69, doubleArray72, doubleArray75 };
        simpleRegression47.addData(doubleArray76);
        simpleRegression36.addData(doubleArray76);
        simpleRegression25.addData(doubleArray76);
        simpleRegression14.addData(doubleArray76);
        simpleRegression0.addData(doubleArray76);
        double double82 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertTrue(Double.isNaN(double82));
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.getMeanSquareError();
        double double13 = simpleRegression0.predict((double) 0L);
        double double15 = simpleRegression0.predict(7949.394557823129d);
        long long16 = simpleRegression0.getN();
        double double17 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getInterceptStdErr();
        double double11 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.clear();
        double double13 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) (byte) 10, (double) (-1.0f));
        simpleRegression0.addData((double) 0L, (double) 'a');
        double double11 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData(558.6347397176643d, 0.06530188411098745d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getSlopeStdErr();
        double double13 = simpleRegression0.getMeanSquareError();
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double9 = simpleRegression0.predict(65.00710594315245d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval(8743.714285714283d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.getMeanSquareError();
        double double13 = simpleRegression0.predict((double) 0L);
        simpleRegression0.addData(0.030303030303030304d, 0.5366294777987983d);
        double double17 = simpleRegression0.getTotalSumSquares();
        double double18 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        simpleRegression0.addData((double) 6L, (double) (byte) 0);
        double double11 = simpleRegression0.getR();
        simpleRegression0.addData(0.6983204134366925d, (double) (byte) -1);
        double double15 = simpleRegression0.getSlopeConfidenceInterval();
        double double16 = simpleRegression0.getInterceptStdErr();
        double double18 = simpleRegression0.predict(3.1717916607777656d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23791906001465818d + "'", double15 == 0.23791906001465818d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.06530188411098745d + "'", double16 == 0.06530188411098745d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.5023751969517736d) + "'", double18 == (-0.5023751969517736d));
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getTotalSumSquares();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double13 = simpleRegression0.predict((double) (short) -1);
        double double14 = simpleRegression0.getTotalSumSquares();
        long long15 = simpleRegression0.getN();
        double double16 = simpleRegression0.getR();
        double double17 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getRSquare();
        long long13 = simpleRegression0.getN();
        simpleRegression0.addData(0.06787386507806925d, 9.100000000000014d);
        double double18 = simpleRegression0.predict((double) 100);
        double double19 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getSlope();
        simpleRegression0.clear();
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getTotalSumSquares();
        double double13 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double13 = simpleRegression0.predict((double) (short) -1);
        double double14 = simpleRegression0.getTotalSumSquares();
        double double15 = simpleRegression0.getRegressionSumSquares();
        double double16 = simpleRegression0.getRegressionSumSquares();
        double double17 = simpleRegression0.getSlopeStdErr();
        double double18 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        double double21 = simpleRegression0.predict((-0.9999999999999838d));
        double double22 = simpleRegression0.getRegressionSumSquares();
        double double23 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression10 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long11 = simpleRegression10.getN();
        double double12 = simpleRegression10.getSumSquaredErrors();
        double double14 = simpleRegression10.predict((double) 10L);
        double double15 = simpleRegression10.getIntercept();
        double double16 = simpleRegression10.getRegressionSumSquares();
        long long17 = simpleRegression10.getN();
        double double18 = simpleRegression10.getR();
        double double19 = simpleRegression10.getR();
        double double20 = simpleRegression10.getSumSquaredErrors();
        double double21 = simpleRegression10.getSlopeStdErr();
        double double22 = simpleRegression10.getSumSquaredErrors();
        double double23 = simpleRegression10.getRSquare();
        double double24 = simpleRegression10.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long26 = simpleRegression25.getN();
        double double27 = simpleRegression25.getSumSquaredErrors();
        double double29 = simpleRegression25.predict((double) 10L);
        double double30 = simpleRegression25.getIntercept();
        double double31 = simpleRegression25.getRegressionSumSquares();
        long long32 = simpleRegression25.getN();
        double double33 = simpleRegression25.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression34 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long35 = simpleRegression34.getN();
        double double36 = simpleRegression34.getSumSquaredErrors();
        double double38 = simpleRegression34.predict((double) 10L);
        double double39 = simpleRegression34.getIntercept();
        double double40 = simpleRegression34.getRegressionSumSquares();
        long long41 = simpleRegression34.getN();
        double double42 = simpleRegression34.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression43 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long44 = simpleRegression43.getN();
        double double45 = simpleRegression43.getSumSquaredErrors();
        double double47 = simpleRegression43.predict((double) 10L);
        double double48 = simpleRegression43.getIntercept();
        simpleRegression43.addData((double) (byte) 100, (double) 100.0f);
        double double53 = simpleRegression43.predict((double) 100L);
        double double54 = simpleRegression43.getR();
        double[] doubleArray57 = new double[] { 100L, 100.0d };
        double[] doubleArray60 = new double[] { 100L, 100.0d };
        double[] doubleArray63 = new double[] { 100L, 100.0d };
        double[] doubleArray66 = new double[] { 100L, 100.0d };
        double[] doubleArray69 = new double[] { 100L, 100.0d };
        double[] doubleArray72 = new double[] { 100L, 100.0d };
        double[][] doubleArray73 = new double[][] { doubleArray57, doubleArray60, doubleArray63, doubleArray66, doubleArray69, doubleArray72 };
        simpleRegression43.addData(doubleArray73);
        simpleRegression34.addData(doubleArray73);
        simpleRegression25.addData(doubleArray73);
        simpleRegression10.addData(doubleArray73);
        simpleRegression0.addData(doubleArray73);
        simpleRegression0.addData(96.93939393939395d, 0.5366294777987983d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        simpleRegression0.clear();
        double double6 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        long long10 = simpleRegression7.getN();
        double double11 = simpleRegression7.getRSquare();
        double[] doubleArray16 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray21 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray26 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[][] doubleArray27 = new double[][] { doubleArray16, doubleArray21, doubleArray26 };
        simpleRegression7.addData(doubleArray27);
        simpleRegression0.addData(doubleArray27);
        double double30 = simpleRegression0.getSlope();
        double double31 = simpleRegression0.getTotalSumSquares();
        double double32 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData(98.0d, 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        double double4 = simpleRegression0.getRegressionSumSquares();
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        simpleRegression0.clear();
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        double double5 = simpleRegression0.getSlope();
        long long6 = simpleRegression0.getN();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getMeanSquareError();
        long long9 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double7 = simpleRegression0.predict(0.5d);
        double double8 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double13 = simpleRegression0.predict((double) (short) -1);
        double double14 = simpleRegression0.getTotalSumSquares();
        double double15 = simpleRegression0.getRegressionSumSquares();
        double double16 = simpleRegression0.getRegressionSumSquares();
        double double17 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSlope();
        double double11 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression12 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long13 = simpleRegression12.getN();
        long long14 = simpleRegression12.getN();
        double double15 = simpleRegression12.getTotalSumSquares();
        simpleRegression12.clear();
        simpleRegression12.addData(0.29496726124856915d, 0.17496090227947925d);
        double double20 = simpleRegression12.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression21 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long22 = simpleRegression21.getN();
        double double23 = simpleRegression21.getSumSquaredErrors();
        double double25 = simpleRegression21.predict((double) 10L);
        double double26 = simpleRegression21.getIntercept();
        double double27 = simpleRegression21.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long29 = simpleRegression28.getN();
        double double30 = simpleRegression28.getSumSquaredErrors();
        long long31 = simpleRegression28.getN();
        long long32 = simpleRegression28.getN();
        double[][] doubleArray33 = new double[][] {};
        simpleRegression28.addData(doubleArray33);
        simpleRegression21.addData(doubleArray33);
        double double37 = simpleRegression21.predict((double) 10);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression38 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long39 = simpleRegression38.getN();
        double double40 = simpleRegression38.getSumSquaredErrors();
        double double42 = simpleRegression38.predict((double) 10L);
        double double43 = simpleRegression38.getIntercept();
        double double44 = simpleRegression38.getRegressionSumSquares();
        long long45 = simpleRegression38.getN();
        double double46 = simpleRegression38.getR();
        double double47 = simpleRegression38.getSlope();
        double double48 = simpleRegression38.getRegressionSumSquares();
        double[] doubleArray51 = new double[] { 1L, ' ' };
        double[] doubleArray54 = new double[] { 1L, ' ' };
        double[] doubleArray57 = new double[] { 1L, ' ' };
        double[] doubleArray60 = new double[] { 1L, ' ' };
        double[] doubleArray63 = new double[] { 1L, ' ' };
        double[] doubleArray66 = new double[] { 1L, ' ' };
        double[][] doubleArray67 = new double[][] { doubleArray51, doubleArray54, doubleArray57, doubleArray60, doubleArray63, doubleArray66 };
        simpleRegression38.addData(doubleArray67);
        simpleRegression21.addData(doubleArray67);
        simpleRegression12.addData(doubleArray67);
        simpleRegression0.addData(doubleArray67);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long12 = simpleRegression11.getN();
        double double13 = simpleRegression11.getSumSquaredErrors();
        double double15 = simpleRegression11.predict((double) 10L);
        double double16 = simpleRegression11.getIntercept();
        double double17 = simpleRegression11.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long19 = simpleRegression18.getN();
        double double20 = simpleRegression18.getSumSquaredErrors();
        long long21 = simpleRegression18.getN();
        long long22 = simpleRegression18.getN();
        double[][] doubleArray23 = new double[][] {};
        simpleRegression18.addData(doubleArray23);
        simpleRegression11.addData(doubleArray23);
        double double27 = simpleRegression11.predict((double) (-1L));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long29 = simpleRegression28.getN();
        double double30 = simpleRegression28.getSumSquaredErrors();
        double double32 = simpleRegression28.predict((double) 10L);
        double double33 = simpleRegression28.getIntercept();
        simpleRegression28.addData((double) (byte) 100, (double) 100.0f);
        double double38 = simpleRegression28.predict((double) 100L);
        double double39 = simpleRegression28.getR();
        double[] doubleArray42 = new double[] { 100L, 100.0d };
        double[] doubleArray45 = new double[] { 100L, 100.0d };
        double[] doubleArray48 = new double[] { 100L, 100.0d };
        double[] doubleArray51 = new double[] { 100L, 100.0d };
        double[] doubleArray54 = new double[] { 100L, 100.0d };
        double[] doubleArray57 = new double[] { 100L, 100.0d };
        double[][] doubleArray58 = new double[][] { doubleArray42, doubleArray45, doubleArray48, doubleArray51, doubleArray54, doubleArray57 };
        simpleRegression28.addData(doubleArray58);
        simpleRegression11.addData(doubleArray58);
        simpleRegression0.addData(doubleArray58);
        double double62 = simpleRegression0.getSlopeStdErr();
        double double63 = simpleRegression0.getTotalSumSquares();
        double double65 = simpleRegression0.predict(1.8189894035458565E-12d);
        double double66 = simpleRegression0.getSlope();
        double double68 = simpleRegression0.predict(0.2842377260981912d);
        double double69 = simpleRegression0.getRegressionSumSquares();
        double double71 = simpleRegression0.predict(0.23791906001465818d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double17 = simpleRegression7.predict((double) 100L);
        double double18 = simpleRegression7.getR();
        double[] doubleArray21 = new double[] { 100L, 100.0d };
        double[] doubleArray24 = new double[] { 100L, 100.0d };
        double[] doubleArray27 = new double[] { 100L, 100.0d };
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        simpleRegression7.addData(doubleArray37);
        simpleRegression0.addData(doubleArray37);
        double double40 = simpleRegression0.getRSquare();
        double double41 = simpleRegression0.getR();
        double double43 = simpleRegression0.predict((double) (byte) 0);
        double double44 = simpleRegression0.getRegressionSumSquares();
        double double45 = simpleRegression0.getIntercept();
        double double46 = simpleRegression0.getSlope();
        double double47 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9999999999999998d + "'", double40 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.9999999999999999d + "'", double41 == 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.9999999999999838d) + "'", double43 == (-0.9999999999999838d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 8743.714285714283d + "'", double44 == 8743.714285714283d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-0.9999999999999838d) + "'", double45 == (-0.9999999999999838d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0099999999999998d + "'", double46 == 1.0099999999999998d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.9999999999999998d + "'", double47 == 0.9999999999999998d);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double17 = simpleRegression7.predict((double) 100L);
        double double18 = simpleRegression7.getR();
        double[] doubleArray21 = new double[] { 100L, 100.0d };
        double[] doubleArray24 = new double[] { 100L, 100.0d };
        double[] doubleArray27 = new double[] { 100L, 100.0d };
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        simpleRegression7.addData(doubleArray37);
        simpleRegression0.addData(doubleArray37);
        double double40 = simpleRegression0.getRSquare();
        double double41 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double43 = simpleRegression0.getSlopeConfidenceInterval(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9999999999999998d + "'", double40 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.9999999999999998d + "'", double41 == 0.9999999999999998d);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.predict(3.637978807091713E-13d);
        double double5 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double11 = simpleRegression0.getTotalSumSquares();
        long long12 = simpleRegression0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getR();
        double double6 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getInterceptStdErr();
        double double11 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getSumSquaredErrors();
        double double10 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(562.7906976744185d, 0.5366294777987983d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.predict((double) (byte) 1);
        double double13 = simpleRegression0.getMeanSquareError();
        double double14 = simpleRegression0.getMeanSquareError();
        double double15 = simpleRegression0.getTotalSumSquares();
        double double16 = simpleRegression0.getSlope();
        double double17 = simpleRegression0.getTotalSumSquares();
        double double18 = simpleRegression0.getInterceptStdErr();
        double double19 = simpleRegression0.getSlope();
        double double20 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double13 = simpleRegression0.predict((double) (short) -1);
        double double14 = simpleRegression0.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long16 = simpleRegression15.getN();
        double double17 = simpleRegression15.getSumSquaredErrors();
        double double19 = simpleRegression15.predict((double) 10L);
        double double20 = simpleRegression15.getIntercept();
        simpleRegression15.addData((double) (byte) 100, (double) 100.0f);
        double double24 = simpleRegression15.getIntercept();
        double double25 = simpleRegression15.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long27 = simpleRegression26.getN();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) 10L);
        double double31 = simpleRegression26.getIntercept();
        simpleRegression26.addData((double) (byte) 100, (double) 100.0f);
        double double36 = simpleRegression26.predict((double) 100L);
        double double37 = simpleRegression26.getMeanSquareError();
        long long38 = simpleRegression26.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression39 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long40 = simpleRegression39.getN();
        double double41 = simpleRegression39.getRSquare();
        double double42 = simpleRegression39.getTotalSumSquares();
        double[] doubleArray47 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray52 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray53 = new double[][] { doubleArray47, doubleArray52 };
        simpleRegression39.addData(doubleArray53);
        simpleRegression26.addData(doubleArray53);
        simpleRegression15.addData(doubleArray53);
        simpleRegression0.addData(doubleArray53);
        double double58 = simpleRegression0.getRegressionSumSquares();
        double double59 = simpleRegression0.getRegressionSumSquares();
        double double60 = simpleRegression0.getSumSquaredErrors();
        double double62 = simpleRegression0.predict((-1.1666666666666667d));
        double double64 = simpleRegression0.predict(0.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getRegressionSumSquares();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double4 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getIntercept();
        double double12 = simpleRegression0.getMeanSquareError();
        double double13 = simpleRegression0.getRegressionSumSquares();
        double double14 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.predict((double) 1);
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getRSquare();
        double double11 = simpleRegression0.getIntercept();
        double double12 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        simpleRegression0.addData((double) 'a', 0.23791906001465818d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double16 = simpleRegression7.getIntercept();
        double double17 = simpleRegression7.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long19 = simpleRegression18.getN();
        double double20 = simpleRegression18.getSumSquaredErrors();
        double double22 = simpleRegression18.predict((double) 10L);
        double double23 = simpleRegression18.getIntercept();
        simpleRegression18.addData((double) (byte) 100, (double) 100.0f);
        double double28 = simpleRegression18.predict((double) 100L);
        double double29 = simpleRegression18.getMeanSquareError();
        long long30 = simpleRegression18.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression31 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long32 = simpleRegression31.getN();
        double double33 = simpleRegression31.getRSquare();
        double double34 = simpleRegression31.getTotalSumSquares();
        double[] doubleArray39 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray44 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray45 = new double[][] { doubleArray39, doubleArray44 };
        simpleRegression31.addData(doubleArray45);
        simpleRegression18.addData(doubleArray45);
        simpleRegression7.addData(doubleArray45);
        simpleRegression0.addData(doubleArray45);
        simpleRegression0.addData(0.541396879312175d, 0.5d);
        double double53 = simpleRegression0.getSignificance();
        double double54 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0897164948175941E-8d + "'", double53 == 1.0897164948175941E-8d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 3.6018341249220255E-6d + "'", double54 == 3.6018341249220255E-6d);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression3 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long4 = simpleRegression3.getN();
        double double5 = simpleRegression3.getSumSquaredErrors();
        double double7 = simpleRegression3.predict((double) 10L);
        double double8 = simpleRegression3.getMeanSquareError();
        double double9 = simpleRegression3.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression10 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long11 = simpleRegression10.getN();
        double double12 = simpleRegression10.getSumSquaredErrors();
        double double13 = simpleRegression10.getRegressionSumSquares();
        simpleRegression10.addData(0.0d, (-1.0d));
        double double17 = simpleRegression10.getR();
        double double19 = simpleRegression10.predict(10.0d);
        double double21 = simpleRegression10.predict(100.0d);
        double double23 = simpleRegression10.predict((double) (short) 0);
        long long24 = simpleRegression10.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long26 = simpleRegression25.getN();
        double double27 = simpleRegression25.getSumSquaredErrors();
        double double29 = simpleRegression25.predict((double) 10L);
        double double30 = simpleRegression25.getIntercept();
        double double31 = simpleRegression25.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression32 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long33 = simpleRegression32.getN();
        double double34 = simpleRegression32.getSumSquaredErrors();
        long long35 = simpleRegression32.getN();
        long long36 = simpleRegression32.getN();
        double[][] doubleArray37 = new double[][] {};
        simpleRegression32.addData(doubleArray37);
        simpleRegression25.addData(doubleArray37);
        simpleRegression10.addData(doubleArray37);
        simpleRegression3.addData(doubleArray37);
        simpleRegression0.addData(doubleArray37);
        double double43 = simpleRegression0.getRegressionSumSquares();
        double double44 = simpleRegression0.getSumSquaredErrors();
        double double46 = simpleRegression0.predict((double) 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.predict((-1.1666666666666667d));
        double double9 = simpleRegression0.getInterceptStdErr();
        double double10 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData(0.0d, (-10.884599342802874d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long15 = simpleRegression14.getN();
        double double16 = simpleRegression14.getSumSquaredErrors();
        long long17 = simpleRegression14.getN();
        double double19 = simpleRegression14.predict(100.0d);
        double double20 = simpleRegression14.getInterceptStdErr();
        double double22 = simpleRegression14.predict((double) 1);
        double double23 = simpleRegression14.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression24 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long25 = simpleRegression24.getN();
        double double26 = simpleRegression24.getSumSquaredErrors();
        double double28 = simpleRegression24.predict((double) 10L);
        double double29 = simpleRegression24.getIntercept();
        double double30 = simpleRegression24.getRegressionSumSquares();
        long long31 = simpleRegression24.getN();
        double double32 = simpleRegression24.getR();
        double double33 = simpleRegression24.getSlope();
        double double34 = simpleRegression24.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression35 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long36 = simpleRegression35.getN();
        double double37 = simpleRegression35.getSumSquaredErrors();
        double double38 = simpleRegression35.getRegressionSumSquares();
        simpleRegression35.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression42 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long43 = simpleRegression42.getN();
        double double44 = simpleRegression42.getSumSquaredErrors();
        double double46 = simpleRegression42.predict((double) 10L);
        double double47 = simpleRegression42.getIntercept();
        simpleRegression42.addData((double) (byte) 100, (double) 100.0f);
        double double52 = simpleRegression42.predict((double) 100L);
        double double53 = simpleRegression42.getR();
        double[] doubleArray56 = new double[] { 100L, 100.0d };
        double[] doubleArray59 = new double[] { 100L, 100.0d };
        double[] doubleArray62 = new double[] { 100L, 100.0d };
        double[] doubleArray65 = new double[] { 100L, 100.0d };
        double[] doubleArray68 = new double[] { 100L, 100.0d };
        double[] doubleArray71 = new double[] { 100L, 100.0d };
        double[][] doubleArray72 = new double[][] { doubleArray56, doubleArray59, doubleArray62, doubleArray65, doubleArray68, doubleArray71 };
        simpleRegression42.addData(doubleArray72);
        simpleRegression35.addData(doubleArray72);
        double double75 = simpleRegression35.getRSquare();
        double double76 = simpleRegression35.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression77 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long78 = simpleRegression77.getN();
        double double79 = simpleRegression77.getSumSquaredErrors();
        double double81 = simpleRegression77.predict((double) 10L);
        double double82 = simpleRegression77.getIntercept();
        double double83 = simpleRegression77.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression84 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long85 = simpleRegression84.getN();
        double double86 = simpleRegression84.getSumSquaredErrors();
        long long87 = simpleRegression84.getN();
        long long88 = simpleRegression84.getN();
        double[][] doubleArray89 = new double[][] {};
        simpleRegression84.addData(doubleArray89);
        simpleRegression77.addData(doubleArray89);
        simpleRegression35.addData(doubleArray89);
        simpleRegression24.addData(doubleArray89);
        simpleRegression14.addData(doubleArray89);
        simpleRegression0.addData(doubleArray89);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.9999999999999998d + "'", double75 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.9999999999999999d + "'", double76 == 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertNotNull(doubleArray89);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData((double) 100, (double) 6L);
        double double13 = simpleRegression0.getMeanSquareError();
        double double14 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.getSlope();
        double double12 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval((-9.8d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getInterceptStdErr();
        double double3 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        double double9 = simpleRegression0.predict(10.0d);
        double double11 = simpleRegression0.predict(100.0d);
        double double13 = simpleRegression0.predict((double) (short) 0);
        long long14 = simpleRegression0.getN();
        double double15 = simpleRegression0.getRSquare();
        double double17 = simpleRegression0.predict((double) 8L);
        double double18 = simpleRegression0.getSlopeStdErr();
        double double19 = simpleRegression0.getRSquare();
        double double20 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        long long10 = simpleRegression7.getN();
        long long11 = simpleRegression7.getN();
        double[][] doubleArray12 = new double[][] {};
        simpleRegression7.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double16 = simpleRegression0.predict((double) (-1L));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long18 = simpleRegression17.getN();
        double double19 = simpleRegression17.getSumSquaredErrors();
        double double21 = simpleRegression17.predict((double) 10L);
        double double22 = simpleRegression17.getIntercept();
        simpleRegression17.addData((double) (byte) 100, (double) 100.0f);
        double double27 = simpleRegression17.predict((double) 100L);
        double double28 = simpleRegression17.getR();
        double[] doubleArray31 = new double[] { 100L, 100.0d };
        double[] doubleArray34 = new double[] { 100L, 100.0d };
        double[] doubleArray37 = new double[] { 100L, 100.0d };
        double[] doubleArray40 = new double[] { 100L, 100.0d };
        double[] doubleArray43 = new double[] { 100L, 100.0d };
        double[] doubleArray46 = new double[] { 100L, 100.0d };
        double[][] doubleArray47 = new double[][] { doubleArray31, doubleArray34, doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        simpleRegression17.addData(doubleArray47);
        simpleRegression0.addData(doubleArray47);
        double double50 = simpleRegression0.getIntercept();
        double double51 = simpleRegression0.getInterceptStdErr();
        double double52 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double8 = simpleRegression0.getTotalSumSquares();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getIntercept();
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.predict(4.232527564042065E-9d);
        double double9 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) (byte) 10, (double) (-1.0f));
        simpleRegression0.addData((double) 0L, (double) 'a');
        double double11 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.getIntercept();
        double double13 = simpleRegression0.getSlope();
        double double14 = simpleRegression0.getSlopeStdErr();
        double double15 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.8d) + "'", double13 == (-9.8d));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4802.000000000001d + "'", double15 == 4802.000000000001d);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.predict((double) 1);
        double double9 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.predict((double) (-1.0f));
        double double12 = simpleRegression0.getSlopeStdErr();
        double double13 = simpleRegression0.getRSquare();
        double double14 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.getSlope();
        long long12 = simpleRegression0.getN();
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getSlopeStdErr();
        double double15 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getIntercept();
        double double12 = simpleRegression0.getIntercept();
        double double14 = simpleRegression0.predict(3.637978807091713E-13d);
        simpleRegression0.addData(13690.473878853938d, 1.9431632708055285E-10d);
        double double18 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.73580951548276d + "'", double18 == 100.73580951548276d);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double13 = simpleRegression0.predict((double) (short) -1);
        double double14 = simpleRegression0.getTotalSumSquares();
        double double15 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(6.031565971695669E-7d, (double) 0.0f);
        double double19 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = simpleRegression0.getSlopeConfidenceInterval(0.6666666666666666d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        simpleRegression0.clear();
        double double8 = simpleRegression0.getTotalSumSquares();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getTotalSumSquares();
        double double11 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getTotalSumSquares();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSlopeConfidenceInterval((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double[] doubleArray13 = new double[] { 1L, ' ' };
        double[] doubleArray16 = new double[] { 1L, ' ' };
        double[] doubleArray19 = new double[] { 1L, ' ' };
        double[] doubleArray22 = new double[] { 1L, ' ' };
        double[] doubleArray25 = new double[] { 1L, ' ' };
        double[] doubleArray28 = new double[] { 1L, ' ' };
        double[][] doubleArray29 = new double[][] { doubleArray13, doubleArray16, doubleArray19, doubleArray22, doubleArray25, doubleArray28 };
        simpleRegression0.addData(doubleArray29);
        double double32 = simpleRegression0.predict((double) (short) 100);
        double double33 = simpleRegression0.getMeanSquareError();
        simpleRegression0.addData((double) 1L, 0.0d);
        double double37 = simpleRegression0.getIntercept();
        double double38 = simpleRegression0.getSlopeConfidenceInterval();
        double double39 = simpleRegression0.getIntercept();
        simpleRegression0.addData(0.6812154343391408d, (double) 13L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        double double4 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getMeanSquareError();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getMeanSquareError();
        double double10 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long12 = simpleRegression11.getN();
        double double13 = simpleRegression11.getSumSquaredErrors();
        double double15 = simpleRegression11.predict((double) 10L);
        double double16 = simpleRegression11.getIntercept();
        double double17 = simpleRegression11.getRegressionSumSquares();
        long long18 = simpleRegression11.getN();
        double double19 = simpleRegression11.getRSquare();
        long long20 = simpleRegression11.getN();
        double double21 = simpleRegression11.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long23 = simpleRegression22.getN();
        double double24 = simpleRegression22.getSumSquaredErrors();
        double double26 = simpleRegression22.predict((double) 10L);
        double double27 = simpleRegression22.getIntercept();
        simpleRegression22.addData((double) (byte) 100, (double) 100.0f);
        double double31 = simpleRegression22.getIntercept();
        double double32 = simpleRegression22.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression33 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long34 = simpleRegression33.getN();
        double double35 = simpleRegression33.getSumSquaredErrors();
        double double37 = simpleRegression33.predict((double) 10L);
        double double38 = simpleRegression33.getIntercept();
        simpleRegression33.addData((double) (byte) 100, (double) 100.0f);
        double double43 = simpleRegression33.predict((double) 100L);
        double double44 = simpleRegression33.getMeanSquareError();
        long long45 = simpleRegression33.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression46 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long47 = simpleRegression46.getN();
        double double48 = simpleRegression46.getRSquare();
        double double49 = simpleRegression46.getTotalSumSquares();
        double[] doubleArray54 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray59 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray60 = new double[][] { doubleArray54, doubleArray59 };
        simpleRegression46.addData(doubleArray60);
        simpleRegression33.addData(doubleArray60);
        simpleRegression22.addData(doubleArray60);
        simpleRegression11.addData(doubleArray60);
        simpleRegression0.addData(doubleArray60);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getSlope();
        simpleRegression0.clear();
        double double13 = simpleRegression0.getSlopeStdErr();
        double double14 = simpleRegression0.getR();
        double double15 = simpleRegression0.getRegressionSumSquares();
        double double16 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        simpleRegression0.addData(6.0d, (double) (short) 1);
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getInterceptStdErr();
        double double10 = simpleRegression0.getRSquare();
        double double11 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double17 = simpleRegression7.predict((double) 100L);
        double double18 = simpleRegression7.getR();
        double[] doubleArray21 = new double[] { 100L, 100.0d };
        double[] doubleArray24 = new double[] { 100L, 100.0d };
        double[] doubleArray27 = new double[] { 100L, 100.0d };
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        simpleRegression7.addData(doubleArray37);
        simpleRegression0.addData(doubleArray37);
        double double40 = simpleRegression0.getRSquare();
        double double41 = simpleRegression0.getR();
        double double43 = simpleRegression0.predict((double) (byte) 0);
        double double44 = simpleRegression0.getRegressionSumSquares();
        double double45 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9999999999999998d + "'", double40 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.9999999999999999d + "'", double41 == 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.9999999999999838d) + "'", double43 == (-0.9999999999999838d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 8743.714285714283d + "'", double44 == 8743.714285714283d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-0.9999999999999838d) + "'", double45 == (-0.9999999999999838d));
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getSlope();
        simpleRegression0.clear();
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getTotalSumSquares();
        double double16 = simpleRegression0.predict((double) (short) 1);
        double double17 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double19 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double17 = simpleRegression7.predict((double) 100L);
        double double18 = simpleRegression7.getR();
        double[] doubleArray21 = new double[] { 100L, 100.0d };
        double[] doubleArray24 = new double[] { 100L, 100.0d };
        double[] doubleArray27 = new double[] { 100L, 100.0d };
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        simpleRegression7.addData(doubleArray37);
        simpleRegression0.addData(doubleArray37);
        double double40 = simpleRegression0.getRSquare();
        double double41 = simpleRegression0.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression42 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long43 = simpleRegression42.getN();
        double double44 = simpleRegression42.getSumSquaredErrors();
        double double46 = simpleRegression42.predict((double) 10L);
        double double47 = simpleRegression42.getIntercept();
        double double48 = simpleRegression42.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression49 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long50 = simpleRegression49.getN();
        double double51 = simpleRegression49.getSumSquaredErrors();
        long long52 = simpleRegression49.getN();
        long long53 = simpleRegression49.getN();
        double[][] doubleArray54 = new double[][] {};
        simpleRegression49.addData(doubleArray54);
        simpleRegression42.addData(doubleArray54);
        simpleRegression0.addData(doubleArray54);
        simpleRegression0.clear();
        double double59 = simpleRegression0.getSlope();
        double double60 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9999999999999998d + "'", double40 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.9999999999999999d + "'", double41 == 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getSumSquaredErrors();
        double double10 = simpleRegression0.predict(4.066480948555191E-7d);
        double double11 = simpleRegression0.getInterceptStdErr();
        double double13 = simpleRegression0.predict(78.47392290249432d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getR();
        double[] doubleArray14 = new double[] { 100L, 100.0d };
        double[] doubleArray17 = new double[] { 100L, 100.0d };
        double[] doubleArray20 = new double[] { 100L, 100.0d };
        double[] doubleArray23 = new double[] { 100L, 100.0d };
        double[] doubleArray26 = new double[] { 100L, 100.0d };
        double[] doubleArray29 = new double[] { 100L, 100.0d };
        double[][] doubleArray30 = new double[][] { doubleArray14, doubleArray17, doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        simpleRegression0.addData(doubleArray30);
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double33 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        simpleRegression0.addData((double) (-1.0f), 3396.9796511627906d);
        simpleRegression0.addData((double) (-1L), (double) (byte) -1);
        double double11 = simpleRegression0.getTotalSumSquares();
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5773132.8548582d + "'", double11 == 5773132.8548582d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long10 = simpleRegression9.getN();
        double double11 = simpleRegression9.getSumSquaredErrors();
        double double13 = simpleRegression9.predict((double) 10L);
        double double14 = simpleRegression9.getIntercept();
        simpleRegression9.addData((double) (byte) 100, (double) 100.0f);
        double double19 = simpleRegression9.predict((double) 100L);
        double double20 = simpleRegression9.getR();
        double[] doubleArray23 = new double[] { 100L, 100.0d };
        double[] doubleArray26 = new double[] { 100L, 100.0d };
        double[] doubleArray29 = new double[] { 100L, 100.0d };
        double[] doubleArray32 = new double[] { 100L, 100.0d };
        double[] doubleArray35 = new double[] { 100L, 100.0d };
        double[] doubleArray38 = new double[] { 100L, 100.0d };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        simpleRegression9.addData(doubleArray39);
        simpleRegression0.addData(doubleArray39);
        double double42 = simpleRegression0.getTotalSumSquares();
        double double43 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        simpleRegression0.clear();
        double double46 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long7 = simpleRegression6.getN();
        double double8 = simpleRegression6.getSumSquaredErrors();
        double double10 = simpleRegression6.predict((double) 10L);
        double double11 = simpleRegression6.getIntercept();
        simpleRegression6.addData((double) (byte) 100, (double) 100.0f);
        double double15 = simpleRegression6.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long17 = simpleRegression16.getN();
        double double18 = simpleRegression16.getSumSquaredErrors();
        double double20 = simpleRegression16.predict((double) 10L);
        double double21 = simpleRegression16.getIntercept();
        double double22 = simpleRegression16.getRegressionSumSquares();
        long long23 = simpleRegression16.getN();
        double double24 = simpleRegression16.getR();
        double double25 = simpleRegression16.getR();
        double double26 = simpleRegression16.getSumSquaredErrors();
        double double27 = simpleRegression16.getSlopeStdErr();
        double double28 = simpleRegression16.getSumSquaredErrors();
        double double29 = simpleRegression16.getRSquare();
        double double30 = simpleRegression16.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression31 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long32 = simpleRegression31.getN();
        double double33 = simpleRegression31.getSumSquaredErrors();
        double double35 = simpleRegression31.predict((double) 10L);
        double double36 = simpleRegression31.getIntercept();
        double double37 = simpleRegression31.getRegressionSumSquares();
        long long38 = simpleRegression31.getN();
        double double39 = simpleRegression31.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression40 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long41 = simpleRegression40.getN();
        double double42 = simpleRegression40.getSumSquaredErrors();
        double double44 = simpleRegression40.predict((double) 10L);
        double double45 = simpleRegression40.getIntercept();
        double double46 = simpleRegression40.getRegressionSumSquares();
        long long47 = simpleRegression40.getN();
        double double48 = simpleRegression40.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression49 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long50 = simpleRegression49.getN();
        double double51 = simpleRegression49.getSumSquaredErrors();
        double double53 = simpleRegression49.predict((double) 10L);
        double double54 = simpleRegression49.getIntercept();
        simpleRegression49.addData((double) (byte) 100, (double) 100.0f);
        double double59 = simpleRegression49.predict((double) 100L);
        double double60 = simpleRegression49.getR();
        double[] doubleArray63 = new double[] { 100L, 100.0d };
        double[] doubleArray66 = new double[] { 100L, 100.0d };
        double[] doubleArray69 = new double[] { 100L, 100.0d };
        double[] doubleArray72 = new double[] { 100L, 100.0d };
        double[] doubleArray75 = new double[] { 100L, 100.0d };
        double[] doubleArray78 = new double[] { 100L, 100.0d };
        double[][] doubleArray79 = new double[][] { doubleArray63, doubleArray66, doubleArray69, doubleArray72, doubleArray75, doubleArray78 };
        simpleRegression49.addData(doubleArray79);
        simpleRegression40.addData(doubleArray79);
        simpleRegression31.addData(doubleArray79);
        simpleRegression16.addData(doubleArray79);
        simpleRegression6.addData(doubleArray79);
        simpleRegression0.addData(doubleArray79);
        double double86 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        long long12 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long14 = simpleRegression13.getN();
        double double15 = simpleRegression13.getRSquare();
        double double16 = simpleRegression13.getTotalSumSquares();
        double[] doubleArray21 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray26 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray27 = new double[][] { doubleArray21, doubleArray26 };
        simpleRegression13.addData(doubleArray27);
        simpleRegression0.addData(doubleArray27);
        long long30 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression31 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long32 = simpleRegression31.getN();
        double double33 = simpleRegression31.getSumSquaredErrors();
        double double35 = simpleRegression31.predict((double) 10L);
        double double36 = simpleRegression31.getIntercept();
        simpleRegression31.addData((double) (byte) 100, (double) 100.0f);
        double double41 = simpleRegression31.predict((double) 100L);
        double double42 = simpleRegression31.getMeanSquareError();
        long long43 = simpleRegression31.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression44 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long45 = simpleRegression44.getN();
        double double46 = simpleRegression44.getRSquare();
        double double47 = simpleRegression44.getTotalSumSquares();
        double[] doubleArray52 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray57 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray58 = new double[][] { doubleArray52, doubleArray57 };
        simpleRegression44.addData(doubleArray58);
        simpleRegression31.addData(doubleArray58);
        simpleRegression0.addData(doubleArray58);
        double double62 = simpleRegression0.getSlopeStdErr();
        double double63 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3L + "'", long30 == 3L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.9431632708055285E-10d + "'", double62 == 1.9431632708055285E-10d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0303030303030303d + "'", double63 == 0.0303030303030303d);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getSlope();
        double double12 = simpleRegression0.getR();
        double double13 = simpleRegression0.getIntercept();
        double double14 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double13 = simpleRegression0.predict((double) (short) -1);
        double double14 = simpleRegression0.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long16 = simpleRegression15.getN();
        double double17 = simpleRegression15.getSumSquaredErrors();
        double double19 = simpleRegression15.predict((double) 10L);
        double double20 = simpleRegression15.getIntercept();
        simpleRegression15.addData((double) (byte) 100, (double) 100.0f);
        double double24 = simpleRegression15.getIntercept();
        double double25 = simpleRegression15.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long27 = simpleRegression26.getN();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) 10L);
        double double31 = simpleRegression26.getIntercept();
        simpleRegression26.addData((double) (byte) 100, (double) 100.0f);
        double double36 = simpleRegression26.predict((double) 100L);
        double double37 = simpleRegression26.getMeanSquareError();
        long long38 = simpleRegression26.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression39 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long40 = simpleRegression39.getN();
        double double41 = simpleRegression39.getRSquare();
        double double42 = simpleRegression39.getTotalSumSquares();
        double[] doubleArray47 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray52 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray53 = new double[][] { doubleArray47, doubleArray52 };
        simpleRegression39.addData(doubleArray53);
        simpleRegression26.addData(doubleArray53);
        simpleRegression15.addData(doubleArray53);
        simpleRegression0.addData(doubleArray53);
        double double58 = simpleRegression0.getRegressionSumSquares();
        double double59 = simpleRegression0.getRegressionSumSquares();
        double double61 = simpleRegression0.predict((double) 6L);
        double double62 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double63 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getR();
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getTotalSumSquares();
        long long7 = simpleRegression0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getSlopeStdErr();
        double double12 = simpleRegression0.getInterceptStdErr();
        double double13 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        simpleRegression0.addData(4.166196710774793d, 83.88194205860624d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getSlopeStdErr();
        double double12 = simpleRegression0.getSlope();
        double double13 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getMeanSquareError();
        double double11 = simpleRegression0.getInterceptStdErr();
        double double13 = simpleRegression0.predict((double) 10.0f);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long15 = simpleRegression14.getN();
        double double16 = simpleRegression14.getRSquare();
        double double17 = simpleRegression14.getRegressionSumSquares();
        double double18 = simpleRegression14.getRSquare();
        double double19 = simpleRegression14.getTotalSumSquares();
        double double20 = simpleRegression14.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression21 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long22 = simpleRegression21.getN();
        double double23 = simpleRegression21.getSumSquaredErrors();
        double double25 = simpleRegression21.predict((double) 10L);
        double double26 = simpleRegression21.getIntercept();
        simpleRegression21.addData((double) (byte) 100, (double) 100.0f);
        double double30 = simpleRegression21.getIntercept();
        double double31 = simpleRegression21.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression32 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long33 = simpleRegression32.getN();
        double double34 = simpleRegression32.getSumSquaredErrors();
        double double36 = simpleRegression32.predict((double) 10L);
        double double37 = simpleRegression32.getIntercept();
        simpleRegression32.addData((double) (byte) 100, (double) 100.0f);
        double double42 = simpleRegression32.predict((double) 100L);
        double double43 = simpleRegression32.getMeanSquareError();
        long long44 = simpleRegression32.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression45 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long46 = simpleRegression45.getN();
        double double47 = simpleRegression45.getRSquare();
        double double48 = simpleRegression45.getTotalSumSquares();
        double[] doubleArray53 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray58 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray59 = new double[][] { doubleArray53, doubleArray58 };
        simpleRegression45.addData(doubleArray59);
        simpleRegression32.addData(doubleArray59);
        simpleRegression21.addData(doubleArray59);
        simpleRegression14.addData(doubleArray59);
        simpleRegression0.addData(doubleArray59);
        double double65 = simpleRegression0.getR();
        double double66 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        simpleRegression0.addData(65.29134366925075d, (-3.7252902984619143E-10d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getR();
        double[] doubleArray14 = new double[] { 100L, 100.0d };
        double[] doubleArray17 = new double[] { 100L, 100.0d };
        double[] doubleArray20 = new double[] { 100L, 100.0d };
        double[] doubleArray23 = new double[] { 100L, 100.0d };
        double[] doubleArray26 = new double[] { 100L, 100.0d };
        double[] doubleArray29 = new double[] { 100L, 100.0d };
        double[][] doubleArray30 = new double[][] { doubleArray14, doubleArray17, doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        simpleRegression0.addData(doubleArray30);
        double double32 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getRegressionSumSquares();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) (byte) -1, (double) (-1L));
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        double double17 = simpleRegression0.getSumSquaredErrors();
        double double19 = simpleRegression0.predict(8743.714285714286d);
        double double20 = simpleRegression0.getTotalSumSquares();
        double double21 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double17 = simpleRegression7.predict((double) 100L);
        double double18 = simpleRegression7.getR();
        double[] doubleArray21 = new double[] { 100L, 100.0d };
        double[] doubleArray24 = new double[] { 100L, 100.0d };
        double[] doubleArray27 = new double[] { 100L, 100.0d };
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        simpleRegression7.addData(doubleArray37);
        simpleRegression0.addData(doubleArray37);
        double double40 = simpleRegression0.getRSquare();
        double double41 = simpleRegression0.getRSquare();
        double double42 = simpleRegression0.getInterceptStdErr();
        double double43 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9999999999999998d + "'", double40 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.9999999999999998d + "'", double41 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 6.031565971695669E-7d + "'", double42 == 6.031565971695669E-7d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.8189894035458565E-12d + "'", double43 == 1.8189894035458565E-12d);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double13 = simpleRegression0.predict((double) (short) -1);
        double double14 = simpleRegression0.getR();
        double double15 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double13 = simpleRegression0.predict((double) (short) -1);
        double double14 = simpleRegression0.getTotalSumSquares();
        double double15 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(6.031565971695669E-7d, (double) 0.0f);
        double double19 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression21 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long23 = simpleRegression22.getN();
        double double24 = simpleRegression22.getRSquare();
        double double25 = simpleRegression22.getTotalSumSquares();
        double[] doubleArray30 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray35 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray36 = new double[][] { doubleArray30, doubleArray35 };
        simpleRegression22.addData(doubleArray36);
        simpleRegression21.addData(doubleArray36);
        simpleRegression0.addData(doubleArray36);
        double double40 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long12 = simpleRegression11.getN();
        double double13 = simpleRegression11.getSumSquaredErrors();
        double double15 = simpleRegression11.predict((double) 10L);
        double double16 = simpleRegression11.getIntercept();
        double double17 = simpleRegression11.getRegressionSumSquares();
        long long18 = simpleRegression11.getN();
        simpleRegression11.clear();
        double double20 = simpleRegression11.getSlopeStdErr();
        double double21 = simpleRegression11.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long23 = simpleRegression22.getN();
        double double24 = simpleRegression22.getSumSquaredErrors();
        double double26 = simpleRegression22.predict((double) 10L);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression27 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long28 = simpleRegression27.getN();
        double double29 = simpleRegression27.getSumSquaredErrors();
        double double31 = simpleRegression27.predict((double) 10L);
        double double32 = simpleRegression27.getIntercept();
        simpleRegression27.addData((double) (byte) 100, (double) 100.0f);
        double double37 = simpleRegression27.predict((double) 100L);
        double double38 = simpleRegression27.getMeanSquareError();
        long long39 = simpleRegression27.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression40 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long41 = simpleRegression40.getN();
        double double42 = simpleRegression40.getSumSquaredErrors();
        double double44 = simpleRegression40.predict((double) 10L);
        double double45 = simpleRegression40.getIntercept();
        simpleRegression40.addData((double) (byte) 100, (double) 100.0f);
        double double50 = simpleRegression40.predict((double) 100L);
        double double51 = simpleRegression40.getMeanSquareError();
        long long52 = simpleRegression40.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression53 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long54 = simpleRegression53.getN();
        double double55 = simpleRegression53.getRSquare();
        double double56 = simpleRegression53.getTotalSumSquares();
        double[] doubleArray61 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray66 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray67 = new double[][] { doubleArray61, doubleArray66 };
        simpleRegression53.addData(doubleArray67);
        simpleRegression40.addData(doubleArray67);
        simpleRegression27.addData(doubleArray67);
        simpleRegression22.addData(doubleArray67);
        simpleRegression11.addData(doubleArray67);
        simpleRegression0.addData(doubleArray67);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSlope();
        double double11 = simpleRegression0.getRegressionSumSquares();
        double double12 = simpleRegression0.getRSquare();
        double double13 = simpleRegression0.getSlopeStdErr();
        double double14 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long7 = simpleRegression6.getN();
        double double8 = simpleRegression6.getSumSquaredErrors();
        double double9 = simpleRegression6.getRegressionSumSquares();
        simpleRegression6.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long14 = simpleRegression13.getN();
        double double15 = simpleRegression13.getSumSquaredErrors();
        double double17 = simpleRegression13.predict((double) 10L);
        double double18 = simpleRegression13.getIntercept();
        simpleRegression13.addData((double) (byte) 100, (double) 100.0f);
        double double23 = simpleRegression13.predict((double) 100L);
        double double24 = simpleRegression13.getR();
        double[] doubleArray27 = new double[] { 100L, 100.0d };
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[] doubleArray39 = new double[] { 100L, 100.0d };
        double[] doubleArray42 = new double[] { 100L, 100.0d };
        double[][] doubleArray43 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42 };
        simpleRegression13.addData(doubleArray43);
        simpleRegression6.addData(doubleArray43);
        double double46 = simpleRegression6.getRSquare();
        double double47 = simpleRegression6.getR();
        double double49 = simpleRegression6.predict((double) (byte) 0);
        simpleRegression6.addData(0.0d, (double) ' ');
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression53 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long54 = simpleRegression53.getN();
        double double55 = simpleRegression53.getSumSquaredErrors();
        double double57 = simpleRegression53.predict((double) 10L);
        double double58 = simpleRegression53.getIntercept();
        double double59 = simpleRegression53.getRegressionSumSquares();
        double double60 = simpleRegression53.getSumSquaredErrors();
        double double61 = simpleRegression53.getMeanSquareError();
        double double62 = simpleRegression53.getRegressionSumSquares();
        double double63 = simpleRegression53.getSumSquaredErrors();
        double[] doubleArray67 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray71 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray75 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray79 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray83 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray87 = new double[] { (byte) 1, 0L, 'a' };
        double[][] doubleArray88 = new double[][] { doubleArray67, doubleArray71, doubleArray75, doubleArray79, doubleArray83, doubleArray87 };
        simpleRegression53.addData(doubleArray88);
        simpleRegression6.addData(doubleArray88);
        simpleRegression0.addData(doubleArray88);
        double double92 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.9999999999999998d + "'", double46 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.9999999999999999d + "'", double47 == 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-0.9999999999999838d) + "'", double49 == (-0.9999999999999838d));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertTrue(Double.isNaN(double92));
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getIntercept();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) '#', 0.9999999999999998d);
        double double14 = simpleRegression0.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long16 = simpleRegression15.getN();
        double double17 = simpleRegression15.getSumSquaredErrors();
        double double19 = simpleRegression15.predict((double) 10L);
        double double20 = simpleRegression15.getIntercept();
        simpleRegression15.addData((double) (byte) 100, (double) 100.0f);
        double double25 = simpleRegression15.predict((double) 100L);
        double double26 = simpleRegression15.getR();
        double double27 = simpleRegression15.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long29 = simpleRegression28.getN();
        double double30 = simpleRegression28.getSumSquaredErrors();
        double double32 = simpleRegression28.predict((double) 10L);
        double double33 = simpleRegression28.getIntercept();
        double double34 = simpleRegression28.getRegressionSumSquares();
        long long35 = simpleRegression28.getN();
        double double36 = simpleRegression28.getR();
        double double37 = simpleRegression28.getR();
        double double38 = simpleRegression28.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression39 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long40 = simpleRegression39.getN();
        double double41 = simpleRegression39.getSumSquaredErrors();
        double double43 = simpleRegression39.predict((double) 10L);
        double double44 = simpleRegression39.getIntercept();
        double double45 = simpleRegression39.getRegressionSumSquares();
        long long46 = simpleRegression39.getN();
        double double47 = simpleRegression39.getR();
        double double48 = simpleRegression39.getSlope();
        double double49 = simpleRegression39.getRegressionSumSquares();
        double[] doubleArray52 = new double[] { 1L, ' ' };
        double[] doubleArray55 = new double[] { 1L, ' ' };
        double[] doubleArray58 = new double[] { 1L, ' ' };
        double[] doubleArray61 = new double[] { 1L, ' ' };
        double[] doubleArray64 = new double[] { 1L, ' ' };
        double[] doubleArray67 = new double[] { 1L, ' ' };
        double[][] doubleArray68 = new double[][] { doubleArray52, doubleArray55, doubleArray58, doubleArray61, doubleArray64, doubleArray67 };
        simpleRegression39.addData(doubleArray68);
        simpleRegression28.addData(doubleArray68);
        simpleRegression15.addData(doubleArray68);
        simpleRegression0.addData(doubleArray68);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double16 = simpleRegression7.getIntercept();
        double double17 = simpleRegression7.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long19 = simpleRegression18.getN();
        double double20 = simpleRegression18.getSumSquaredErrors();
        double double22 = simpleRegression18.predict((double) 10L);
        double double23 = simpleRegression18.getIntercept();
        simpleRegression18.addData((double) (byte) 100, (double) 100.0f);
        double double28 = simpleRegression18.predict((double) 100L);
        double double29 = simpleRegression18.getMeanSquareError();
        long long30 = simpleRegression18.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression31 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long32 = simpleRegression31.getN();
        double double33 = simpleRegression31.getRSquare();
        double double34 = simpleRegression31.getTotalSumSquares();
        double[] doubleArray39 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray44 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray45 = new double[][] { doubleArray39, doubleArray44 };
        simpleRegression31.addData(doubleArray45);
        simpleRegression18.addData(doubleArray45);
        simpleRegression7.addData(doubleArray45);
        simpleRegression0.addData(doubleArray45);
        double double51 = simpleRegression0.predict(100.0d);
        double double52 = simpleRegression0.getRegressionSumSquares();
        double double53 = simpleRegression0.getTotalSumSquares();
        long long54 = simpleRegression0.getN();
        double double55 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 2L + "'", long54 == 2L);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }
}

