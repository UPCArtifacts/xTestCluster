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
        double double31 = simpleRegression0.getSlopeStdErr();
        double double32 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.predict(9.022002373111071d);
        double double7 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass8 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        double double40 = simpleRegression0.getSlope();
        double double41 = simpleRegression0.getInterceptStdErr();
        double double42 = simpleRegression0.getTotalSumSquares();
        double double43 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData(0.116507100294446d, (double) 0.0f);
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
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
        double double52 = simpleRegression0.getRegressionSumSquares();
        double double53 = simpleRegression0.getTotalSumSquares();
        double double54 = simpleRegression0.getSlopeStdErr();
        double double55 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData((-0.33210220848722394d), (-99.99999999999994d));
        double double60 = simpleRegression0.predict(1.0503000000000313d);
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
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-13.243429298487133d) + "'", double60 == (-13.243429298487133d));
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getIntercept();
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
        simpleRegression0.addData(doubleArray53);
        double double58 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
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
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getSumSquaredErrors();
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
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        double double4 = simpleRegression0.getRegressionSumSquares();
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        simpleRegression0.clear();
        double double8 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        double double61 = simpleRegression0.getSumSquaredErrors();
        double double62 = simpleRegression0.getSlope();
        double double63 = simpleRegression0.getRSquare();
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
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
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
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getIntercept();
        double double13 = simpleRegression0.getR();
        double double15 = simpleRegression0.predict(551.4054054054056d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
        double double63 = simpleRegression0.getSignificance();
        double double64 = simpleRegression0.getMeanSquareError();
        long long65 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 7L + "'", long65 == 7L);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData(0.9999999999999998d, (double) 100L);
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getTotalSumSquares();
        simpleRegression11.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long15 = simpleRegression14.getN();
        double double16 = simpleRegression14.getSumSquaredErrors();
        double double18 = simpleRegression14.predict((double) 10L);
        double double19 = simpleRegression14.getMeanSquareError();
        double double20 = simpleRegression14.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression21 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long22 = simpleRegression21.getN();
        double double23 = simpleRegression21.getSumSquaredErrors();
        double double24 = simpleRegression21.getRegressionSumSquares();
        simpleRegression21.addData(0.0d, (-1.0d));
        double double28 = simpleRegression21.getR();
        double double30 = simpleRegression21.predict(10.0d);
        double double32 = simpleRegression21.predict(100.0d);
        double double34 = simpleRegression21.predict((double) (short) 0);
        long long35 = simpleRegression21.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression36 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long37 = simpleRegression36.getN();
        double double38 = simpleRegression36.getSumSquaredErrors();
        double double40 = simpleRegression36.predict((double) 10L);
        double double41 = simpleRegression36.getIntercept();
        double double42 = simpleRegression36.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression43 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long44 = simpleRegression43.getN();
        double double45 = simpleRegression43.getSumSquaredErrors();
        long long46 = simpleRegression43.getN();
        long long47 = simpleRegression43.getN();
        double[][] doubleArray48 = new double[][] {};
        simpleRegression43.addData(doubleArray48);
        simpleRegression36.addData(doubleArray48);
        simpleRegression21.addData(doubleArray48);
        simpleRegression14.addData(doubleArray48);
        simpleRegression11.addData(doubleArray48);
        simpleRegression0.addData(doubleArray48);
        double double55 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        double double93 = simpleRegression0.getInterceptStdErr();
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
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 100.0d + "'", double90 == 100.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression5 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long6 = simpleRegression5.getN();
        double double7 = simpleRegression5.getSumSquaredErrors();
        long long8 = simpleRegression5.getN();
        double double9 = simpleRegression5.getRSquare();
        double[] doubleArray14 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray19 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray24 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[][] doubleArray25 = new double[][] { doubleArray14, doubleArray19, doubleArray24 };
        simpleRegression5.addData(doubleArray25);
        simpleRegression0.addData(doubleArray25);
        double double28 = simpleRegression0.getSumSquaredErrors();
        double double29 = simpleRegression0.getTotalSumSquares();
        double double30 = simpleRegression0.getRegressionSumSquares();
        double double31 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(1.6746918727301837E-8d, 6.031565971695669E-7d);
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.predict((double) (byte) 10);
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getR();
        double double7 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double8 = simpleRegression0.predict((double) (byte) 100);
        long long9 = simpleRegression0.getN();
        long long10 = simpleRegression0.getN();
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
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
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double9 = simpleRegression0.predict(0.9999999999999998d);
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
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
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getIntercept();
        double double12 = simpleRegression0.getTotalSumSquares();
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double16 = simpleRegression0.getIntercept();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
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
        simpleRegression0.clear();
        double double9 = simpleRegression0.predict(182.0d);
        double double10 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        double double11 = simpleRegression0.predict((-0.9999999999999838d));
        long long12 = simpleRegression0.getN();
        simpleRegression0.addData(8400.857142857143d, (double) 100.0f);
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
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
        simpleRegression0.addData((double) 10.0f, (double) (short) 10);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long16 = simpleRegression15.getN();
        double double17 = simpleRegression15.getSumSquaredErrors();
        long long18 = simpleRegression15.getN();
        long long19 = simpleRegression15.getN();
        double[][] doubleArray20 = new double[][] {};
        simpleRegression15.addData(doubleArray20);
        simpleRegression0.addData(doubleArray20);
        double double23 = simpleRegression0.getR();
        double double24 = simpleRegression0.getR();
        double double25 = simpleRegression0.getTotalSumSquares();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getRegressionSumSquares();
        double double9 = simpleRegression0.getMeanSquareError();
        double double10 = simpleRegression0.getInterceptStdErr();
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getInterceptStdErr();
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long10 = simpleRegression0.getN();
        double double11 = simpleRegression0.getInterceptStdErr();
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        double double11 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.getInterceptStdErr();
        double double13 = simpleRegression0.getInterceptStdErr();
        double double14 = simpleRegression0.getIntercept();
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
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        double double13 = simpleRegression0.getSumSquaredErrors();
        double double15 = simpleRegression0.predict((double) ' ');
        java.lang.Class<?> wildcardClass16 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        simpleRegression0.addData((-1.0d), (double) 100L);
        simpleRegression0.addData(0.5d, 0.0d);
        double double8 = simpleRegression0.getSlope();
        long long9 = simpleRegression0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-200.0d) + "'", double8 == (-200.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double14 = simpleRegression13.getSumSquaredErrors();
        double double15 = simpleRegression13.getSumSquaredErrors();
        simpleRegression13.clear();
        simpleRegression13.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long19 = simpleRegression18.getN();
        double double20 = simpleRegression18.getSumSquaredErrors();
        long long21 = simpleRegression18.getN();
        double double22 = simpleRegression18.getRSquare();
        double[] doubleArray27 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray32 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray37 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[][] doubleArray38 = new double[][] { doubleArray27, doubleArray32, doubleArray37 };
        simpleRegression18.addData(doubleArray38);
        simpleRegression13.addData(doubleArray38);
        simpleRegression0.addData(doubleArray38);
        simpleRegression0.addData(2926.4846611894172d, 6734.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getSumSquaredErrors();
        long long11 = simpleRegression0.getN();
        double double12 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long12 = simpleRegression11.getN();
        double double13 = simpleRegression11.getSumSquaredErrors();
        double double15 = simpleRegression11.predict((double) 10L);
        double double16 = simpleRegression11.getIntercept();
        simpleRegression11.addData((double) (byte) 100, (double) 100.0f);
        double double21 = simpleRegression11.predict((double) 100L);
        double double22 = simpleRegression11.getMeanSquareError();
        long long23 = simpleRegression11.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression24 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long25 = simpleRegression24.getN();
        double double26 = simpleRegression24.getRSquare();
        double double27 = simpleRegression24.getTotalSumSquares();
        double[] doubleArray32 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray37 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray38 = new double[][] { doubleArray32, doubleArray37 };
        simpleRegression24.addData(doubleArray38);
        simpleRegression11.addData(doubleArray38);
        simpleRegression0.addData(doubleArray38);
        double double42 = simpleRegression0.getSignificance();
        double double43 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        double double11 = simpleRegression0.getSlope();
        double double12 = simpleRegression0.getRSquare();
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
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double8 = simpleRegression0.predict((double) 7L);
        simpleRegression0.addData((double) 1.0f, 3.637978807091713E-13d);
        double double12 = simpleRegression0.getSlope();
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        long long11 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double13 = simpleRegression0.getSlope();
        double double14 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval((-7356.750000000001d));
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
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
        double double44 = simpleRegression0.getInterceptStdErr();
        double double45 = simpleRegression0.getSlope();
        double double47 = simpleRegression0.predict(96.97d);
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
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 6.031565971695669E-7d + "'", double44 == 6.031565971695669E-7d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0099999999999998d + "'", double45 == 1.0099999999999998d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 96.93969999999999d + "'", double47 == 96.93969999999999d);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getRSquare();
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getRSquare();
        double double13 = simpleRegression0.getSlope();
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getMeanSquareError();
        double double10 = simpleRegression0.predict(18.28564393939351d);
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
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getMeanSquareError();
        double double13 = simpleRegression0.getMeanSquareError();
        double double15 = simpleRegression0.predict((-9.8d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        double double10 = simpleRegression0.getMeanSquareError();
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSlopeConfidenceInterval(7356.75d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
        simpleRegression0.addData(10.0d, (-1.0d));
        double double35 = simpleRegression0.getMeanSquareError();
        double double36 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(1.6536267304962332E-13d, (double) 8L);
        double double40 = simpleRegression0.getInterceptStdErr();
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
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 19.094696969696543d + "'", double35 == 19.094696969696543d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 7318.560606060606d + "'", double36 == 7318.560606060606d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 25.138632610638815d + "'", double40 == 25.138632610638815d);
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
        simpleRegression0.clear();
        double double8 = simpleRegression0.getRegressionSumSquares();
        double double9 = simpleRegression0.getRegressionSumSquares();
        long long10 = simpleRegression0.getN();
        double double11 = simpleRegression0.getRegressionSumSquares();
        double double12 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.predict(100.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getTotalSumSquares();
        long long10 = simpleRegression0.getN();
        long long11 = simpleRegression0.getN();
        double double13 = simpleRegression0.predict((double) '#');
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
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
        double double11 = simpleRegression0.getSumSquaredErrors();
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
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getSumSquaredErrors();
        double double13 = simpleRegression0.getInterceptStdErr();
        double double14 = simpleRegression0.getIntercept();
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
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        double double41 = simpleRegression0.getSignificance();
        double double42 = simpleRegression0.getSumSquaredErrors();
        double double43 = simpleRegression0.getIntercept();
        double double44 = simpleRegression0.getRSquare();
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
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.8189894035458565E-12d + "'", double42 == 1.8189894035458565E-12d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.9999999999999838d) + "'", double43 == (-0.9999999999999838d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.9999999999999998d + "'", double44 == 0.9999999999999998d);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression30 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long31 = simpleRegression30.getN();
        double double32 = simpleRegression30.getSumSquaredErrors();
        double double34 = simpleRegression30.predict((double) 10L);
        double double35 = simpleRegression30.getIntercept();
        double double36 = simpleRegression30.getRegressionSumSquares();
        double double37 = simpleRegression30.getSumSquaredErrors();
        double double38 = simpleRegression30.getMeanSquareError();
        double double39 = simpleRegression30.getRegressionSumSquares();
        double double40 = simpleRegression30.getSumSquaredErrors();
        double double41 = simpleRegression30.getSlope();
        simpleRegression30.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression43 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long44 = simpleRegression43.getN();
        double double45 = simpleRegression43.getSumSquaredErrors();
        long long46 = simpleRegression43.getN();
        double double47 = simpleRegression43.getTotalSumSquares();
        double double48 = simpleRegression43.getSlopeStdErr();
        double double49 = simpleRegression43.getR();
        double double51 = simpleRegression43.predict((double) 100);
        double[] doubleArray58 = new double[] { 100, 1, 100, (-1L), '4', 6L };
        double[] doubleArray65 = new double[] { 100, 1, 100, (-1L), '4', 6L };
        double[][] doubleArray66 = new double[][] { doubleArray58, doubleArray65 };
        simpleRegression43.addData(doubleArray66);
        simpleRegression30.addData(doubleArray66);
        simpleRegression0.addData(doubleArray66);
        double double70 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 1.0, 100.0, -1.0, 52.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.0, 1.0, 100.0, -1.0, 52.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.02789624778520351d + "'", double70 == 0.02789624778520351d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getTotalSumSquares();
        long long10 = simpleRegression0.getN();
        long long11 = simpleRegression0.getN();
        double double13 = simpleRegression0.predict((double) '#');
        double double14 = simpleRegression0.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long16 = simpleRegression15.getN();
        double double17 = simpleRegression15.getSumSquaredErrors();
        double double19 = simpleRegression15.predict((double) 10L);
        double double20 = simpleRegression15.getIntercept();
        double double21 = simpleRegression15.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long23 = simpleRegression22.getN();
        double double24 = simpleRegression22.getSumSquaredErrors();
        long long25 = simpleRegression22.getN();
        long long26 = simpleRegression22.getN();
        double[][] doubleArray27 = new double[][] {};
        simpleRegression22.addData(doubleArray27);
        simpleRegression15.addData(doubleArray27);
        double double31 = simpleRegression15.predict((double) (-1L));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression32 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long33 = simpleRegression32.getN();
        double double34 = simpleRegression32.getSumSquaredErrors();
        double double36 = simpleRegression32.predict((double) 10L);
        double double37 = simpleRegression32.getIntercept();
        simpleRegression32.addData((double) (byte) 100, (double) 100.0f);
        double double42 = simpleRegression32.predict((double) 100L);
        double double43 = simpleRegression32.getR();
        double[] doubleArray46 = new double[] { 100L, 100.0d };
        double[] doubleArray49 = new double[] { 100L, 100.0d };
        double[] doubleArray52 = new double[] { 100L, 100.0d };
        double[] doubleArray55 = new double[] { 100L, 100.0d };
        double[] doubleArray58 = new double[] { 100L, 100.0d };
        double[] doubleArray61 = new double[] { 100L, 100.0d };
        double[][] doubleArray62 = new double[][] { doubleArray46, doubleArray49, doubleArray52, doubleArray55, doubleArray58, doubleArray61 };
        simpleRegression32.addData(doubleArray62);
        simpleRegression15.addData(doubleArray62);
        simpleRegression0.addData(doubleArray62);
        double double66 = simpleRegression0.getSignificance();
        double double68 = simpleRegression0.getSlopeConfidenceInterval(0.49525318089709414d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getR();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlope();
        double double4 = simpleRegression0.getIntercept();
        double double5 = simpleRegression0.getR();
        simpleRegression0.addData((double) (-1), 0.5366294777987983d);
        simpleRegression0.addData((double) (-1), 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        java.lang.Class<?> wildcardClass96 = simpleRegression0.getClass();
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
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        double double42 = simpleRegression0.getSignificance();
        double double43 = simpleRegression0.getTotalSumSquares();
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
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 8743.714285714286d + "'", double43 == 8743.714285714286d);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        double double26 = simpleRegression0.predict(0.0d);
        double double27 = simpleRegression0.getRSquare();
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
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        simpleRegression0.addData(10.0d, (-1.0d));
        double double35 = simpleRegression0.getMeanSquareError();
        double double37 = simpleRegression0.getSlopeConfidenceInterval(0.0035355339059384605d);
        double double39 = simpleRegression0.predict(8571.428571428569d);
        double double40 = simpleRegression0.getMeanSquareError();
        simpleRegression0.addData((-0.010833333333333332d), 8743.714285714283d);
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
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 19.094696969696543d + "'", double35 == 19.094696969696543d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 9.022002373111071d + "'", double37 == 9.022002373111071d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-89891.64177489174d) + "'", double39 == (-89891.64177489174d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 19.094696969696543d + "'", double40 == 19.094696969696543d);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSumSquaredErrors();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
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
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long12 = simpleRegression11.getN();
        double double13 = simpleRegression11.getSumSquaredErrors();
        double double15 = simpleRegression11.predict((double) 10L);
        double double16 = simpleRegression11.getIntercept();
        simpleRegression11.addData((double) (byte) 100, (double) 100.0f);
        double double21 = simpleRegression11.predict((double) 100L);
        double double22 = simpleRegression11.getMeanSquareError();
        long long23 = simpleRegression11.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression24 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long25 = simpleRegression24.getN();
        double double26 = simpleRegression24.getRSquare();
        double double27 = simpleRegression24.getTotalSumSquares();
        double[] doubleArray32 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray37 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray38 = new double[][] { doubleArray32, doubleArray37 };
        simpleRegression24.addData(doubleArray38);
        simpleRegression11.addData(doubleArray38);
        simpleRegression0.addData(doubleArray38);
        double double42 = simpleRegression0.getSignificance();
        double double43 = simpleRegression0.getInterceptStdErr();
        double double44 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double47 = simpleRegression0.predict((-0.760096079737063d));
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
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
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
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getSlopeStdErr();
        long long12 = simpleRegression0.getN();
        double double13 = simpleRegression0.getMeanSquareError();
        double double14 = simpleRegression0.getR();
        simpleRegression0.addData(9416.307692307693d, (double) (short) 10);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
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
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        double double11 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getRegressionSumSquares();
        double double9 = simpleRegression0.getMeanSquareError();
        double double10 = simpleRegression0.getInterceptStdErr();
        double double11 = simpleRegression0.getRegressionSumSquares();
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
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getMeanSquareError();
        simpleRegression0.addData(Double.NaN, (double) 7L);
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getIntercept();
        double double12 = simpleRegression0.getR();
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
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getTotalSumSquares();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.predict(6527.7024165291805d);
        double double11 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(1.6746918727301837E-8d, 6.031565971695669E-7d);
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getRSquare();
        double double12 = simpleRegression0.predict(8400.857142857143d);
        double double13 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        double double14 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        double double16 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        simpleRegression0.addData((double) 10, (-1.0d));
        long long33 = simpleRegression0.getN();
        double double34 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(38.189393939393085d, (double) 7L);
        double double38 = simpleRegression0.getSlope();
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 4L + "'", long33 == 4L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.5378787878787817d + "'", double34 == 0.5378787878787817d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-2.4228219473740116d) + "'", double38 == (-2.4228219473740116d));
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        simpleRegression0.addData((double) 6L, (double) (byte) 0);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getSumSquaredErrors();
        double double13 = simpleRegression11.getSumSquaredErrors();
        simpleRegression11.clear();
        simpleRegression11.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long17 = simpleRegression16.getN();
        double double18 = simpleRegression16.getSumSquaredErrors();
        long long19 = simpleRegression16.getN();
        double double20 = simpleRegression16.getRSquare();
        double[] doubleArray25 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray30 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray35 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[][] doubleArray36 = new double[][] { doubleArray25, doubleArray30, doubleArray35 };
        simpleRegression16.addData(doubleArray36);
        simpleRegression11.addData(doubleArray36);
        simpleRegression0.addData(doubleArray36);
        double double40 = simpleRegression0.getSlope();
        double double41 = simpleRegression0.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression42 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long43 = simpleRegression42.getN();
        double double44 = simpleRegression42.getSumSquaredErrors();
        double double46 = simpleRegression42.predict((double) 10L);
        simpleRegression42.clear();
        double double48 = simpleRegression42.getSlope();
        double double49 = simpleRegression42.getIntercept();
        double double50 = simpleRegression42.getInterceptStdErr();
        long long51 = simpleRegression42.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression52 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double53 = simpleRegression52.getTotalSumSquares();
        simpleRegression52.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression55 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long56 = simpleRegression55.getN();
        double double57 = simpleRegression55.getSumSquaredErrors();
        double double59 = simpleRegression55.predict((double) 10L);
        double double60 = simpleRegression55.getMeanSquareError();
        double double61 = simpleRegression55.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression62 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long63 = simpleRegression62.getN();
        double double64 = simpleRegression62.getSumSquaredErrors();
        double double65 = simpleRegression62.getRegressionSumSquares();
        simpleRegression62.addData(0.0d, (-1.0d));
        double double69 = simpleRegression62.getR();
        double double71 = simpleRegression62.predict(10.0d);
        double double73 = simpleRegression62.predict(100.0d);
        double double75 = simpleRegression62.predict((double) (short) 0);
        long long76 = simpleRegression62.getN();
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
        simpleRegression62.addData(doubleArray89);
        simpleRegression55.addData(doubleArray89);
        simpleRegression52.addData(doubleArray89);
        simpleRegression42.addData(doubleArray89);
        simpleRegression0.addData(doubleArray89);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.1875d + "'", double40 == 1.1875d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.8155120481927711d + "'", double41 == 0.8155120481927711d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1L + "'", long76 == 1L);
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
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        double double11 = simpleRegression0.getIntercept();
        double double12 = simpleRegression0.getInterceptStdErr();
        double double13 = simpleRegression0.getSlope();
        double double14 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.predict(0.0d);
        double double5 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.predict(964.4545454545455d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getRSquare();
        double double11 = simpleRegression0.getSumSquaredErrors();
        double double12 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
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
        double double43 = simpleRegression0.getSlope();
        double double44 = simpleRegression0.getSlopeStdErr();
        double double45 = simpleRegression0.getSlopeStdErr();
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
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getSlopeStdErr();
        double double13 = simpleRegression0.predict(0.9999999999999998d);
        long long14 = simpleRegression0.getN();
        double double15 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.predict((double) (byte) 10);
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
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
        double double8 = simpleRegression0.getIntercept();
        double double9 = simpleRegression0.getSlope();
        simpleRegression0.clear();
        double double11 = simpleRegression0.getIntercept();
        double double12 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        double double93 = simpleRegression0.getSlopeConfidenceInterval();
        double double94 = simpleRegression0.getRSquare();
        double double96 = simpleRegression0.predict((double) 1);
        simpleRegression0.addData(0.6466625544128879d, (double) 0);
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
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 100.0d + "'", double90 == 100.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double94));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 100.0d + "'", double96 == 100.0d);
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
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getTotalSumSquares();
        long long10 = simpleRegression0.getN();
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getR();
        double double13 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getR();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict(3.1802735762866683d);
        double double6 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        double double9 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
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
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getMeanSquareError();
        double double13 = simpleRegression0.getInterceptStdErr();
        double double14 = simpleRegression0.getInterceptStdErr();
        double double15 = simpleRegression0.getMeanSquareError();
        double double16 = simpleRegression0.getSlopeStdErr();
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
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        double double8 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        long long5 = simpleRegression0.getN();
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getR();
        simpleRegression0.addData((double) (byte) -1, (double) 3L);
        simpleRegression0.addData((double) (-1L), (double) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getIntercept();
        long long9 = simpleRegression0.getN();
        double double11 = simpleRegression0.predict(0.40124884413619255d);
        double double12 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
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
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getSlopeStdErr();
        double double13 = simpleRegression0.predict((double) 0);
        double double14 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = simpleRegression0.getSlopeConfidenceInterval((double) 1.0f);
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
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        double double12 = simpleRegression0.getInterceptStdErr();
        long long13 = simpleRegression0.getN();
        double double15 = simpleRegression0.predict(7318.560606060606d);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long17 = simpleRegression16.getN();
        double double18 = simpleRegression16.getSumSquaredErrors();
        double double20 = simpleRegression16.predict((double) 10L);
        double double21 = simpleRegression16.getIntercept();
        simpleRegression16.addData((double) (byte) 100, (double) 100.0f);
        double double26 = simpleRegression16.predict((double) 100L);
        double double27 = simpleRegression16.getMeanSquareError();
        long long28 = simpleRegression16.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression29 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long30 = simpleRegression29.getN();
        double double31 = simpleRegression29.getRSquare();
        double double32 = simpleRegression29.getTotalSumSquares();
        double[] doubleArray37 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray42 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray43 = new double[][] { doubleArray37, doubleArray42 };
        simpleRegression29.addData(doubleArray43);
        simpleRegression16.addData(doubleArray43);
        simpleRegression0.addData(doubleArray43);
        java.lang.Class<?> wildcardClass47 = doubleArray43.getClass();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(wildcardClass47);
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
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.getInterceptStdErr();
        long long13 = simpleRegression0.getN();
        simpleRegression0.addData((double) 10.0f, (double) (short) 10);
        double double17 = simpleRegression0.getRSquare();
        double double18 = simpleRegression0.getInterceptStdErr();
        long long19 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getR();
        simpleRegression0.clear();
        double double6 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.predict(9.022002373111071d);
        double double7 = simpleRegression0.getR();
        double double9 = simpleRegression0.predict(0.8558214893124607d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getTotalSumSquares();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlopeStdErr();
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
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getRSquare();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval();
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
        long long33 = simpleRegression0.getN();
        double double34 = simpleRegression0.getTotalSumSquares();
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 6L + "'", long33 == 6L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
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
        double double7 = simpleRegression0.getR();
        simpleRegression0.addData((double) 6L, (double) (byte) 0);
        double double11 = simpleRegression0.getR();
        simpleRegression0.addData(2.0300000000000153d, (double) 100L);
        double double15 = simpleRegression0.getSlopeConfidenceInterval();
        double double16 = simpleRegression0.getSumSquaredErrors();
        double double17 = simpleRegression0.getR();
        double double18 = simpleRegression0.getSlopeStdErr();
        double double19 = simpleRegression0.getRSquare();
        double double20 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 237.8600243518896d + "'", double15 == 237.8600243518896d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6527.7024165291805d + "'", double16 == 6527.7024165291805d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.17502920265098187d) + "'", double17 == (-0.17502920265098187d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 18.719989804325845d + "'", double18 == 18.719989804325845d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.030635221780638478d + "'", double19 == 0.030635221780638478d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6734.0d + "'", double20 == 6734.0d);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
        double double11 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.getRegressionSumSquares();
        double double13 = simpleRegression0.getSumSquaredErrors();
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double4 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getIntercept();
        double double4 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        simpleRegression0.clear();
        double double60 = simpleRegression0.getSlope();
        simpleRegression0.clear();
        double double62 = simpleRegression0.getIntercept();
        double double63 = simpleRegression0.getRegressionSumSquares();
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
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
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
        double double40 = simpleRegression0.getRegressionSumSquares();
        double double41 = simpleRegression0.getSlopeStdErr();
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
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8743.714285714283d + "'", double40 == 8743.714285714283d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 6.514835844650013E-9d + "'", double41 == 6.514835844650013E-9d);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
        simpleRegression0.addData(38.189393939393085d, (double) (-1L));
        double double16 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData(0.008651139811367564d, 1353.1804738671963d);
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
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
        double double33 = simpleRegression0.getSlopeStdErr();
        double double34 = simpleRegression0.getInterceptStdErr();
        double double35 = simpleRegression0.getIntercept();
        simpleRegression0.addData(0.030635221780638478d, 2472.6584673604534d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
        simpleRegression0.addData(20.57675335994694d, 797.2971376003962d);
        double double15 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
        double double85 = simpleRegression0.predict(97.0d);
        long long86 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 96.97d + "'", double85 == 96.97d);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 13L + "'", long86 == 13L);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
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
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long10 = simpleRegression9.getN();
        double double11 = simpleRegression9.getSumSquaredErrors();
        double double13 = simpleRegression9.predict((double) 10L);
        double double14 = simpleRegression9.getIntercept();
        simpleRegression9.addData((double) (byte) 100, (double) 100.0f);
        double double19 = simpleRegression9.predict((double) 100L);
        double double20 = simpleRegression9.getMeanSquareError();
        long long21 = simpleRegression9.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long23 = simpleRegression22.getN();
        double double24 = simpleRegression22.getRSquare();
        double double25 = simpleRegression22.getTotalSumSquares();
        double[] doubleArray30 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray35 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray36 = new double[][] { doubleArray30, doubleArray35 };
        simpleRegression22.addData(doubleArray36);
        simpleRegression9.addData(doubleArray36);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression39 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long40 = simpleRegression39.getN();
        double double41 = simpleRegression39.getSumSquaredErrors();
        long long42 = simpleRegression39.getN();
        long long43 = simpleRegression39.getN();
        double[][] doubleArray44 = new double[][] {};
        simpleRegression39.addData(doubleArray44);
        simpleRegression9.addData(doubleArray44);
        simpleRegression0.addData(doubleArray44);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        double double31 = simpleRegression0.getSlope();
        double double32 = simpleRegression0.getR();
        double double33 = simpleRegression0.getInterceptStdErr();
        double double35 = simpleRegression0.predict((-10.53030303030303d));
        double double36 = simpleRegression0.getTotalSumSquares();
        double double37 = simpleRegression0.getRSquare();
        double double39 = simpleRegression0.predict((-200.0d));
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
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
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
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double10 = simpleRegression9.getSumSquaredErrors();
        double double11 = simpleRegression9.getSumSquaredErrors();
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
        double double28 = simpleRegression26.getRSquare();
        double double29 = simpleRegression26.getTotalSumSquares();
        double[] doubleArray34 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray39 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray40 = new double[][] { doubleArray34, doubleArray39 };
        simpleRegression26.addData(doubleArray40);
        simpleRegression13.addData(doubleArray40);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression43 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long44 = simpleRegression43.getN();
        double double45 = simpleRegression43.getSumSquaredErrors();
        long long46 = simpleRegression43.getN();
        long long47 = simpleRegression43.getN();
        double[][] doubleArray48 = new double[][] {};
        simpleRegression43.addData(doubleArray48);
        simpleRegression13.addData(doubleArray48);
        simpleRegression9.addData(doubleArray48);
        simpleRegression0.addData(doubleArray48);
        double double53 = simpleRegression0.getTotalSumSquares();
        double double54 = simpleRegression0.getSlopeStdErr();
        double double55 = simpleRegression0.getR();
        double double56 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
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
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
        simpleRegression0.clear();
        double double52 = simpleRegression0.getRSquare();
        double double53 = simpleRegression0.getIntercept();
        double double54 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double56 = simpleRegression0.getSlopeConfidenceInterval(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) 3L, (double) 0);
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        double double12 = simpleRegression0.getSlopeStdErr();
        double double13 = simpleRegression0.getMeanSquareError();
        double double14 = simpleRegression0.getIntercept();
        double double15 = simpleRegression0.getInterceptStdErr();
        double double16 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        long long18 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
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
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        simpleRegression0.addData((double) ' ', 6.514835844650013E-7d);
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
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getSlope();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getSlope();
        long long11 = simpleRegression0.getN();
        double double12 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getR();
        double double6 = simpleRegression0.getTotalSumSquares();
        double double7 = simpleRegression0.getIntercept();
        double double9 = simpleRegression0.predict(1.0503000000000313d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRSquare();
        long long6 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        simpleRegression0.addData(0.9999999999999998d, (double) ' ');
        double double13 = simpleRegression0.getSumSquaredErrors();
        double double14 = simpleRegression0.getInterceptStdErr();
        double double15 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3500.000000000001d + "'", double15 == 3500.000000000001d);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getR();
        long long3 = simpleRegression0.getN();
        simpleRegression0.addData((double) ' ', (double) 8L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        simpleRegression0.addData(0.9999999999999998d, (double) ' ');
        simpleRegression0.addData(200.0d, (double) 0);
        double double17 = simpleRegression0.predict(Double.NaN);
        double double18 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.29374495492801495d + "'", double18 == 0.29374495492801495d);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        double double15 = simpleRegression0.getR();
        double double17 = simpleRegression0.predict(43.81818181818182d);
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
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData(0.0d, (-200.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double14 = simpleRegression13.getSumSquaredErrors();
        double double15 = simpleRegression13.getSumSquaredErrors();
        simpleRegression13.clear();
        simpleRegression13.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long19 = simpleRegression18.getN();
        double double20 = simpleRegression18.getSumSquaredErrors();
        long long21 = simpleRegression18.getN();
        double double22 = simpleRegression18.getRSquare();
        double[] doubleArray27 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray32 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray37 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[][] doubleArray38 = new double[][] { doubleArray27, doubleArray32, doubleArray37 };
        simpleRegression18.addData(doubleArray38);
        simpleRegression13.addData(doubleArray38);
        simpleRegression0.addData(doubleArray38);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
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
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(1.6746918727301837E-8d, 6.031565971695669E-7d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval(0.030635221780638478d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getInterceptStdErr();
        double double3 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        double double9 = simpleRegression0.predict(10.0d);
        double double11 = simpleRegression0.predict(100.0d);
        double double12 = simpleRegression0.getMeanSquareError();
        double double13 = simpleRegression0.getSumSquaredErrors();
        double double14 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
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
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double9 = simpleRegression0.predict(0.9999999999999998d);
        double double10 = simpleRegression0.getIntercept();
        simpleRegression0.addData((-0.9974010885284709d), (double) '4');
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long15 = simpleRegression14.getN();
        double double16 = simpleRegression14.getRSquare();
        double double17 = simpleRegression14.getRegressionSumSquares();
        double double18 = simpleRegression14.getSlope();
        simpleRegression14.addData((double) (byte) 10, (double) (-1.0f));
        simpleRegression14.addData((double) 0L, (double) 'a');
        double double25 = simpleRegression14.getSlopeStdErr();
        simpleRegression14.clear();
        double double27 = simpleRegression14.getTotalSumSquares();
        double double29 = simpleRegression14.predict((double) (-1));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression30 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double31 = simpleRegression30.getTotalSumSquares();
        simpleRegression30.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression33 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long34 = simpleRegression33.getN();
        double double35 = simpleRegression33.getSumSquaredErrors();
        double double37 = simpleRegression33.predict((double) 10L);
        double double38 = simpleRegression33.getMeanSquareError();
        double double39 = simpleRegression33.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression40 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long41 = simpleRegression40.getN();
        double double42 = simpleRegression40.getSumSquaredErrors();
        double double43 = simpleRegression40.getRegressionSumSquares();
        simpleRegression40.addData(0.0d, (-1.0d));
        double double47 = simpleRegression40.getR();
        double double49 = simpleRegression40.predict(10.0d);
        double double51 = simpleRegression40.predict(100.0d);
        double double53 = simpleRegression40.predict((double) (short) 0);
        long long54 = simpleRegression40.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression55 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long56 = simpleRegression55.getN();
        double double57 = simpleRegression55.getSumSquaredErrors();
        double double59 = simpleRegression55.predict((double) 10L);
        double double60 = simpleRegression55.getIntercept();
        double double61 = simpleRegression55.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression62 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long63 = simpleRegression62.getN();
        double double64 = simpleRegression62.getSumSquaredErrors();
        long long65 = simpleRegression62.getN();
        long long66 = simpleRegression62.getN();
        double[][] doubleArray67 = new double[][] {};
        simpleRegression62.addData(doubleArray67);
        simpleRegression55.addData(doubleArray67);
        simpleRegression40.addData(doubleArray67);
        simpleRegression33.addData(doubleArray67);
        simpleRegression30.addData(doubleArray67);
        simpleRegression14.addData(doubleArray67);
        simpleRegression0.addData(doubleArray67);
        double double75 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        simpleRegression0.clear();
        double double16 = simpleRegression0.getRegressionSumSquares();
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
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        double double10 = simpleRegression0.getRSquare();
        double double11 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double9 = simpleRegression0.predict((double) 0);
        double double10 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.getSlope();
        double double12 = simpleRegression0.getMeanSquareError();
        double double13 = simpleRegression0.getRegressionSumSquares();
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
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData(1.0099999999999998d, (-0.9999999999996163d));
        double double6 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
        double double31 = simpleRegression0.getSlope();
        double double32 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double34 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict((double) (short) -1);
        double double6 = simpleRegression0.getR();
        double double7 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        double double9 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double[] doubleArray8 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray13 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray14 = new double[][] { doubleArray8, doubleArray13 };
        simpleRegression0.addData(doubleArray14);
        double double16 = simpleRegression0.getSlopeStdErr();
        double double17 = simpleRegression0.getSlope();
        double double18 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
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
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval(41.90772484543353d);
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
        double double30 = simpleRegression0.getSignificance();
        double double31 = simpleRegression0.getRSquare();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        long long6 = simpleRegression0.getN();
        simpleRegression0.addData((double) (short) 10, 1.0d);
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval((-0.9999999999981628d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        simpleRegression0.clear();
        double double6 = simpleRegression0.getSlope();
        simpleRegression0.addData(0.416666666666656d, 25.138632610638815d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
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
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getInterceptStdErr();
        double double11 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData((double) 10.0f, (double) (short) 10);
        double double15 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue(Double.isNaN(double15));
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
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getIntercept();
        double double12 = simpleRegression0.getTotalSumSquares();
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getRegressionSumSquares();
        long long15 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long17 = simpleRegression16.getN();
        long long18 = simpleRegression16.getN();
        double double19 = simpleRegression16.getRSquare();
        simpleRegression16.clear();
        double double21 = simpleRegression16.getSlope();
        simpleRegression16.addData((double) 3L, (double) 0);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long26 = simpleRegression25.getN();
        double double27 = simpleRegression25.getSumSquaredErrors();
        double double29 = simpleRegression25.predict((double) 10L);
        double double30 = simpleRegression25.getIntercept();
        double double31 = simpleRegression25.getRegressionSumSquares();
        long long32 = simpleRegression25.getN();
        double double33 = simpleRegression25.getR();
        double double34 = simpleRegression25.getR();
        double double35 = simpleRegression25.getSumSquaredErrors();
        double double36 = simpleRegression25.getTotalSumSquares();
        double double38 = simpleRegression25.predict((double) (short) -1);
        double double39 = simpleRegression25.getTotalSumSquares();
        double double40 = simpleRegression25.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression41 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long42 = simpleRegression41.getN();
        double double43 = simpleRegression41.getSumSquaredErrors();
        double double45 = simpleRegression41.predict((double) 10L);
        double double46 = simpleRegression41.getIntercept();
        simpleRegression41.addData((double) (byte) 100, (double) 100.0f);
        double double51 = simpleRegression41.predict((double) 100L);
        double double52 = simpleRegression41.getMeanSquareError();
        long long53 = simpleRegression41.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression54 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long55 = simpleRegression54.getN();
        double double56 = simpleRegression54.getRSquare();
        double double57 = simpleRegression54.getTotalSumSquares();
        double[] doubleArray62 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray67 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray68 = new double[][] { doubleArray62, doubleArray67 };
        simpleRegression54.addData(doubleArray68);
        simpleRegression41.addData(doubleArray68);
        simpleRegression25.addData(doubleArray68);
        simpleRegression16.addData(doubleArray68);
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
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        long long14 = simpleRegression0.getN();
        double double15 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long18 = simpleRegression17.getN();
        long long19 = simpleRegression17.getN();
        double double20 = simpleRegression17.getRSquare();
        long long21 = simpleRegression17.getN();
        long long22 = simpleRegression17.getN();
        double double23 = simpleRegression17.getSlope();
        double double24 = simpleRegression17.getInterceptStdErr();
        double double25 = simpleRegression17.getR();
        simpleRegression17.addData((double) (byte) -1, (double) 3L);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression29 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long30 = simpleRegression29.getN();
        double double31 = simpleRegression29.getSumSquaredErrors();
        double double32 = simpleRegression29.getRegressionSumSquares();
        double double33 = simpleRegression29.getR();
        simpleRegression29.addData(1.0099999999999998d, (double) ' ');
        double double37 = simpleRegression29.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression38 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long39 = simpleRegression38.getN();
        double double40 = simpleRegression38.getSumSquaredErrors();
        double double42 = simpleRegression38.predict((double) 10L);
        double double43 = simpleRegression38.getIntercept();
        simpleRegression38.addData((double) (byte) 100, (double) 100.0f);
        double double48 = simpleRegression38.predict((double) 100L);
        double double49 = simpleRegression38.getMeanSquareError();
        long long50 = simpleRegression38.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression51 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long52 = simpleRegression51.getN();
        double double53 = simpleRegression51.getSumSquaredErrors();
        double double55 = simpleRegression51.predict((double) 10L);
        double double56 = simpleRegression51.getIntercept();
        simpleRegression51.addData((double) (byte) 100, (double) 100.0f);
        double double61 = simpleRegression51.predict((double) 100L);
        double double62 = simpleRegression51.getMeanSquareError();
        long long63 = simpleRegression51.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression64 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long65 = simpleRegression64.getN();
        double double66 = simpleRegression64.getRSquare();
        double double67 = simpleRegression64.getTotalSumSquares();
        double[] doubleArray72 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray77 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray78 = new double[][] { doubleArray72, doubleArray77 };
        simpleRegression64.addData(doubleArray78);
        simpleRegression51.addData(doubleArray78);
        simpleRegression38.addData(doubleArray78);
        simpleRegression29.addData(doubleArray78);
        simpleRegression17.addData(doubleArray78);
        simpleRegression0.addData(doubleArray78);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData(1.0d, Double.NaN);
        double double14 = simpleRegression0.getSlopeStdErr();
        double double15 = simpleRegression0.getRegressionSumSquares();
        double double16 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getRegressionSumSquares();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.getR();
        simpleRegression0.addData(0.9999999999999999d, 0.0d);
        simpleRegression0.addData((double) (byte) 0, 7356.75d);
        double double18 = simpleRegression0.getSlope();
        double double19 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7356.750000000001d) + "'", double18 == (-7356.750000000001d));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
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
        double double11 = simpleRegression0.predict(0.29374495492801495d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        simpleRegression0.clear();
        double double8 = simpleRegression0.getRegressionSumSquares();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getSumSquaredErrors();
        double double12 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getInterceptStdErr();
        long long11 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        simpleRegression0.addData(10.0d, 0.0d);
        double double18 = simpleRegression0.getRSquare();
        java.lang.Class<?> wildcardClass19 = simpleRegression0.getClass();
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        double double12 = simpleRegression0.getTotalSumSquares();
        double double13 = simpleRegression0.getSlope();
        double double14 = simpleRegression0.getSlopeStdErr();
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
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        long long5 = simpleRegression0.getN();
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getR();
        simpleRegression0.addData((double) (byte) -1, (double) 3L);
        double double13 = simpleRegression0.predict(3513.007091486856d);
        double double14 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getMeanSquareError();
        double double8 = simpleRegression0.getSlope();
        double double9 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
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
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        simpleRegression0.clear();
        double double13 = simpleRegression0.getSlopeStdErr();
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
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(wildcardClass14);
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
        simpleRegression0.addData(0.16666666666666666d, (double) (-1));
        double double65 = simpleRegression0.getSlopeConfidenceInterval();
        double double66 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getTotalSumSquares();
        double double11 = simpleRegression0.getRSquare();
        double double12 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        simpleRegression0.clear();
        double double8 = simpleRegression0.getTotalSumSquares();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.getR();
        long long13 = simpleRegression0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) (byte) 10, (double) (-1.0f));
        simpleRegression0.addData((double) 0L, (double) 'a');
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long12 = simpleRegression11.getN();
        double double13 = simpleRegression11.getSumSquaredErrors();
        double double15 = simpleRegression11.predict((double) 10L);
        double double16 = simpleRegression11.getIntercept();
        double double17 = simpleRegression11.getRegressionSumSquares();
        double double18 = simpleRegression11.getSumSquaredErrors();
        double double19 = simpleRegression11.getMeanSquareError();
        double double20 = simpleRegression11.getRegressionSumSquares();
        double double21 = simpleRegression11.getSumSquaredErrors();
        double[] doubleArray25 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray29 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray33 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray37 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray41 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray45 = new double[] { (byte) 1, 0L, 'a' };
        double[][] doubleArray46 = new double[][] { doubleArray25, doubleArray29, doubleArray33, doubleArray37, doubleArray41, doubleArray45 };
        simpleRegression11.addData(doubleArray46);
        simpleRegression0.addData(doubleArray46);
        double double49 = simpleRegression0.getSignificance();
        simpleRegression0.addData((double) (-1L), (double) 8L);
        double double53 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData(551.4054054054056d, 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.5366294777987983d + "'", double49 == 0.5366294777987983d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 8272.222222222223d + "'", double53 == 8272.222222222223d);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        double double50 = simpleRegression0.getSlopeStdErr();
        double double51 = simpleRegression0.getInterceptStdErr();
        double double52 = simpleRegression0.getMeanSquareError();
        double double53 = simpleRegression0.getIntercept();
        double double55 = simpleRegression0.predict((double) 0L);
        double double56 = simpleRegression0.getTotalSumSquares();
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
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
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
        double double64 = simpleRegression0.getR();
        double double65 = simpleRegression0.getR();
        double double66 = simpleRegression0.getSlope();
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
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getRSquare();
        simpleRegression0.addData((double) (byte) 100, 8571.428571428569d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getRegressionSumSquares();
        double double8 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
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
        simpleRegression0.clear();
        double double52 = simpleRegression0.getRSquare();
        double double53 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        double double55 = simpleRegression0.getIntercept();
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
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRSquare();
        double double6 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        double double96 = simpleRegression0.getIntercept();
        double double97 = simpleRegression0.getSignificance();
        double double98 = simpleRegression0.getRegressionSumSquares();
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
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 100.0d + "'", double96 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double97));
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 0.0d + "'", double98 == 0.0d);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.getSumSquaredErrors();
        double double12 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
        double double14 = simpleRegression0.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long16 = simpleRegression15.getN();
        double double17 = simpleRegression15.getSumSquaredErrors();
        double double19 = simpleRegression15.predict((double) 10L);
        double double20 = simpleRegression15.getIntercept();
        double double21 = simpleRegression15.getRegressionSumSquares();
        long long22 = simpleRegression15.getN();
        double double23 = simpleRegression15.getR();
        double double24 = simpleRegression15.getR();
        double double25 = simpleRegression15.getSumSquaredErrors();
        double double26 = simpleRegression15.getTotalSumSquares();
        double double28 = simpleRegression15.predict((double) (short) -1);
        double double29 = simpleRegression15.getTotalSumSquares();
        double double30 = simpleRegression15.getRegressionSumSquares();
        double double31 = simpleRegression15.getRegressionSumSquares();
        double double32 = simpleRegression15.getSlopeStdErr();
        double double33 = simpleRegression15.getInterceptStdErr();
        simpleRegression15.clear();
        double double35 = simpleRegression15.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression36 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long37 = simpleRegression36.getN();
        double double38 = simpleRegression36.getSumSquaredErrors();
        double double39 = simpleRegression36.getRegressionSumSquares();
        simpleRegression36.addData(0.0d, (-1.0d));
        double double43 = simpleRegression36.getR();
        simpleRegression36.addData((double) 6L, (double) (byte) 0);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression47 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double48 = simpleRegression47.getSumSquaredErrors();
        double double49 = simpleRegression47.getSumSquaredErrors();
        simpleRegression47.clear();
        simpleRegression47.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression52 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long53 = simpleRegression52.getN();
        double double54 = simpleRegression52.getSumSquaredErrors();
        long long55 = simpleRegression52.getN();
        double double56 = simpleRegression52.getRSquare();
        double[] doubleArray61 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray66 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray71 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[][] doubleArray72 = new double[][] { doubleArray61, doubleArray66, doubleArray71 };
        simpleRegression52.addData(doubleArray72);
        simpleRegression47.addData(doubleArray72);
        simpleRegression36.addData(doubleArray72);
        simpleRegression15.addData(doubleArray72);
        simpleRegression0.addData(doubleArray72);
        double double78 = simpleRegression0.getRegressionSumSquares();
        double double79 = simpleRegression0.getSlope();
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
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
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
        double double40 = simpleRegression0.getSlope();
        double double41 = simpleRegression0.getInterceptStdErr();
        double double42 = simpleRegression0.getInterceptStdErr();
        double double43 = simpleRegression0.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression44 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long45 = simpleRegression44.getN();
        double double46 = simpleRegression44.getSumSquaredErrors();
        double double47 = simpleRegression44.getRegressionSumSquares();
        simpleRegression44.addData(0.0d, (-1.0d));
        double double51 = simpleRegression44.getR();
        double double52 = simpleRegression44.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression53 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double54 = simpleRegression53.getSumSquaredErrors();
        double double55 = simpleRegression53.getMeanSquareError();
        long long56 = simpleRegression53.getN();
        long long57 = simpleRegression53.getN();
        double double58 = simpleRegression53.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression59 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double60 = simpleRegression59.getR();
        double double61 = simpleRegression59.getRegressionSumSquares();
        double double62 = simpleRegression59.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression63 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long64 = simpleRegression63.getN();
        double double65 = simpleRegression63.getSumSquaredErrors();
        double double67 = simpleRegression63.predict((double) 10L);
        double double68 = simpleRegression63.getIntercept();
        double double69 = simpleRegression63.getRegressionSumSquares();
        long long70 = simpleRegression63.getN();
        double double71 = simpleRegression63.getRSquare();
        double double72 = simpleRegression63.getRSquare();
        double double73 = simpleRegression63.getInterceptStdErr();
        double double74 = simpleRegression63.getTotalSumSquares();
        simpleRegression63.addData((double) 10.0f, (double) (short) 10);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression78 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long79 = simpleRegression78.getN();
        double double80 = simpleRegression78.getSumSquaredErrors();
        long long81 = simpleRegression78.getN();
        long long82 = simpleRegression78.getN();
        double[][] doubleArray83 = new double[][] {};
        simpleRegression78.addData(doubleArray83);
        simpleRegression63.addData(doubleArray83);
        simpleRegression59.addData(doubleArray83);
        simpleRegression53.addData(doubleArray83);
        simpleRegression44.addData(doubleArray83);
        simpleRegression0.addData(doubleArray83);
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
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(doubleArray83);
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
        double double9 = simpleRegression0.getInterceptStdErr();
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData(0.9999999999999998d, (double) 100L);
        double double10 = simpleRegression0.predict((double) (byte) 100);
        simpleRegression0.addData((double) 100.0f, 4802.0d);
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getRegressionSumSquares();
        double double8 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long10 = simpleRegression9.getN();
        double double11 = simpleRegression9.getSumSquaredErrors();
        double double13 = simpleRegression9.predict((double) 10L);
        double double14 = simpleRegression9.getIntercept();
        double double15 = simpleRegression9.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long17 = simpleRegression16.getN();
        double double18 = simpleRegression16.getSumSquaredErrors();
        long long19 = simpleRegression16.getN();
        long long20 = simpleRegression16.getN();
        double[][] doubleArray21 = new double[][] {};
        simpleRegression16.addData(doubleArray21);
        simpleRegression9.addData(doubleArray21);
        double double25 = simpleRegression9.predict((double) (-1L));
        double double26 = simpleRegression9.getSumSquaredErrors();
        long long27 = simpleRegression9.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long29 = simpleRegression28.getN();
        double double30 = simpleRegression28.getRSquare();
        double double31 = simpleRegression28.getTotalSumSquares();
        double[] doubleArray36 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray41 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray42 = new double[][] { doubleArray36, doubleArray41 };
        simpleRegression28.addData(doubleArray42);
        simpleRegression9.addData(doubleArray42);
        simpleRegression0.addData(doubleArray42);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        simpleRegression0.clear();
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getIntercept();
        double double8 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getIntercept();
        long long11 = simpleRegression0.getN();
        double double12 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlope();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData(0.9999999999999998d, (double) 100L);
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getTotalSumSquares();
        simpleRegression11.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long15 = simpleRegression14.getN();
        double double16 = simpleRegression14.getSumSquaredErrors();
        double double18 = simpleRegression14.predict((double) 10L);
        double double19 = simpleRegression14.getMeanSquareError();
        double double20 = simpleRegression14.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression21 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long22 = simpleRegression21.getN();
        double double23 = simpleRegression21.getSumSquaredErrors();
        double double24 = simpleRegression21.getRegressionSumSquares();
        simpleRegression21.addData(0.0d, (-1.0d));
        double double28 = simpleRegression21.getR();
        double double30 = simpleRegression21.predict(10.0d);
        double double32 = simpleRegression21.predict(100.0d);
        double double34 = simpleRegression21.predict((double) (short) 0);
        long long35 = simpleRegression21.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression36 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long37 = simpleRegression36.getN();
        double double38 = simpleRegression36.getSumSquaredErrors();
        double double40 = simpleRegression36.predict((double) 10L);
        double double41 = simpleRegression36.getIntercept();
        double double42 = simpleRegression36.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression43 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long44 = simpleRegression43.getN();
        double double45 = simpleRegression43.getSumSquaredErrors();
        long long46 = simpleRegression43.getN();
        long long47 = simpleRegression43.getN();
        double[][] doubleArray48 = new double[][] {};
        simpleRegression43.addData(doubleArray48);
        simpleRegression36.addData(doubleArray48);
        simpleRegression21.addData(doubleArray48);
        simpleRegression14.addData(doubleArray48);
        simpleRegression11.addData(doubleArray48);
        simpleRegression0.addData(doubleArray48);
        double double55 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
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
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getInterceptStdErr();
        double double11 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData((double) 10.0f, (double) (short) 10);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long16 = simpleRegression15.getN();
        double double17 = simpleRegression15.getSumSquaredErrors();
        long long18 = simpleRegression15.getN();
        long long19 = simpleRegression15.getN();
        double[][] doubleArray20 = new double[][] {};
        simpleRegression15.addData(doubleArray20);
        simpleRegression0.addData(doubleArray20);
        double double23 = simpleRegression0.getR();
        double double24 = simpleRegression0.getR();
        double double26 = simpleRegression0.predict(6.514835844650013E-9d);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        double double40 = simpleRegression0.getSlope();
        double double41 = simpleRegression0.getInterceptStdErr();
        double double42 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double43 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        simpleRegression7.addData((double) (byte) 100, (double) 100.0f);
        double double17 = simpleRegression7.predict((double) 100L);
        double double18 = simpleRegression7.getMeanSquareError();
        double double19 = simpleRegression7.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression20 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long21 = simpleRegression20.getN();
        double double22 = simpleRegression20.getSumSquaredErrors();
        double double24 = simpleRegression20.predict((double) 10L);
        double double25 = simpleRegression20.getIntercept();
        simpleRegression20.addData((double) (byte) 100, (double) 100.0f);
        double double30 = simpleRegression20.predict((double) 100L);
        double double31 = simpleRegression20.getMeanSquareError();
        long long32 = simpleRegression20.getN();
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
        simpleRegression20.addData(doubleArray60);
        simpleRegression7.addData(doubleArray60);
        simpleRegression0.addData(doubleArray60);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
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
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getRSquare();
        simpleRegression0.addData((double) 1, 100.0d);
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getIntercept();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        double double11 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getMeanSquareError();
        simpleRegression0.addData((-200.0d), (-200.0d));
        double double11 = simpleRegression0.predict(5000.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
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
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.predict((double) (byte) 1);
        double double13 = simpleRegression0.getMeanSquareError();
        double double14 = simpleRegression0.getMeanSquareError();
        double double15 = simpleRegression0.getTotalSumSquares();
        double double16 = simpleRegression0.getSlope();
        double double17 = simpleRegression0.getTotalSumSquares();
        double double18 = simpleRegression0.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression19 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long20 = simpleRegression19.getN();
        double double21 = simpleRegression19.getSumSquaredErrors();
        double double23 = simpleRegression19.predict((double) 10L);
        double double24 = simpleRegression19.getIntercept();
        double double25 = simpleRegression19.getRegressionSumSquares();
        long long26 = simpleRegression19.getN();
        double double27 = simpleRegression19.getR();
        double double28 = simpleRegression19.getSlope();
        double double29 = simpleRegression19.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression30 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long31 = simpleRegression30.getN();
        double double32 = simpleRegression30.getSumSquaredErrors();
        double double34 = simpleRegression30.predict((double) 10L);
        double double35 = simpleRegression30.getIntercept();
        simpleRegression30.addData((double) (byte) 100, (double) 100.0f);
        double double40 = simpleRegression30.predict((double) 100L);
        double double41 = simpleRegression30.getMeanSquareError();
        long long42 = simpleRegression30.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression43 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long44 = simpleRegression43.getN();
        double double45 = simpleRegression43.getSumSquaredErrors();
        double double47 = simpleRegression43.predict((double) 10L);
        double double48 = simpleRegression43.getIntercept();
        simpleRegression43.addData((double) (byte) 100, (double) 100.0f);
        double double53 = simpleRegression43.predict((double) 100L);
        double double54 = simpleRegression43.getMeanSquareError();
        long long55 = simpleRegression43.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression56 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long57 = simpleRegression56.getN();
        double double58 = simpleRegression56.getRSquare();
        double double59 = simpleRegression56.getTotalSumSquares();
        double[] doubleArray64 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray69 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray70 = new double[][] { doubleArray64, doubleArray69 };
        simpleRegression56.addData(doubleArray70);
        simpleRegression43.addData(doubleArray70);
        simpleRegression30.addData(doubleArray70);
        simpleRegression19.addData(doubleArray70);
        simpleRegression0.addData(doubleArray70);
        // The following exception was thrown during execution in test generation
        try {
            double double77 = simpleRegression0.getSlopeConfidenceInterval((double) 100);
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
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
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
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
        double double8 = simpleRegression0.getRSquare();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData(5.176737169062406d, (-108.27272727272725d));
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
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        double double9 = simpleRegression0.predict(10.0d);
        double double11 = simpleRegression0.predict(100.0d);
        double double13 = simpleRegression0.predict((double) (short) 0);
        double double14 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getInterceptStdErr();
        double double9 = simpleRegression0.predict((double) 0L);
        double double10 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
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
        double double15 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double4 = simpleRegression0.predict((-0.9999999999999838d));
        long long5 = simpleRegression0.getN();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getSlopeStdErr();
        double double13 = simpleRegression0.predict(0.9999999999999998d);
        long long14 = simpleRegression0.getN();
        double double15 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
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
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRegressionSumSquares();
        double double9 = simpleRegression0.getSumSquaredErrors();
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getRegressionSumSquares();
        double double12 = simpleRegression0.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long14 = simpleRegression13.getN();
        double double15 = simpleRegression13.getSumSquaredErrors();
        long long16 = simpleRegression13.getN();
        double double18 = simpleRegression13.predict(100.0d);
        double double20 = simpleRegression13.predict(0.9999999999999999d);
        double double21 = simpleRegression13.getR();
        double double22 = simpleRegression13.getTotalSumSquares();
        double double23 = simpleRegression13.getSlopeStdErr();
        double double24 = simpleRegression13.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long26 = simpleRegression25.getN();
        double double27 = simpleRegression25.getSumSquaredErrors();
        double double28 = simpleRegression25.getMeanSquareError();
        double double29 = simpleRegression25.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression30 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long31 = simpleRegression30.getN();
        double double32 = simpleRegression30.getSumSquaredErrors();
        double double33 = simpleRegression30.getRegressionSumSquares();
        simpleRegression30.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression37 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long38 = simpleRegression37.getN();
        double double39 = simpleRegression37.getSumSquaredErrors();
        double double41 = simpleRegression37.predict((double) 10L);
        double double42 = simpleRegression37.getIntercept();
        simpleRegression37.addData((double) (byte) 100, (double) 100.0f);
        double double47 = simpleRegression37.predict((double) 100L);
        double double48 = simpleRegression37.getR();
        double[] doubleArray51 = new double[] { 100L, 100.0d };
        double[] doubleArray54 = new double[] { 100L, 100.0d };
        double[] doubleArray57 = new double[] { 100L, 100.0d };
        double[] doubleArray60 = new double[] { 100L, 100.0d };
        double[] doubleArray63 = new double[] { 100L, 100.0d };
        double[] doubleArray66 = new double[] { 100L, 100.0d };
        double[][] doubleArray67 = new double[][] { doubleArray51, doubleArray54, doubleArray57, doubleArray60, doubleArray63, doubleArray66 };
        simpleRegression37.addData(doubleArray67);
        simpleRegression30.addData(doubleArray67);
        simpleRegression25.addData(doubleArray67);
        simpleRegression13.addData(doubleArray67);
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getRegressionSumSquares();
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.getR();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval(0.06286087062319567d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) 'a', (double) (byte) 100);
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getMeanSquareError();
        long long11 = simpleRegression0.getN();
        double double12 = simpleRegression0.getRegressionSumSquares();
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
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
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
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        simpleRegression0.addData(0.9999999999999998d, (double) ' ');
        simpleRegression0.addData(200.0d, (double) 0);
        double double16 = simpleRegression0.getSlopeConfidenceInterval();
        double double17 = simpleRegression0.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long19 = simpleRegression18.getN();
        double double20 = simpleRegression18.getSumSquaredErrors();
        long long21 = simpleRegression18.getN();
        double double22 = simpleRegression18.getRSquare();
        double[] doubleArray27 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray32 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray37 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[][] doubleArray38 = new double[][] { doubleArray27, doubleArray32, doubleArray37 };
        simpleRegression18.addData(doubleArray38);
        simpleRegression0.addData(doubleArray38);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.732383556975903d + "'", double16 == 3.732383556975903d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2926.4846611894172d + "'", double17 == 2926.4846611894172d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
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
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long12 = simpleRegression11.getN();
        double double13 = simpleRegression11.getSumSquaredErrors();
        double double14 = simpleRegression11.getRegressionSumSquares();
        simpleRegression11.addData(0.0d, (-1.0d));
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
        simpleRegression11.addData(doubleArray48);
        double double51 = simpleRegression11.getRSquare();
        double double52 = simpleRegression11.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression53 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long54 = simpleRegression53.getN();
        double double55 = simpleRegression53.getSumSquaredErrors();
        double double57 = simpleRegression53.predict((double) 10L);
        double double58 = simpleRegression53.getIntercept();
        double double59 = simpleRegression53.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression60 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long61 = simpleRegression60.getN();
        double double62 = simpleRegression60.getSumSquaredErrors();
        long long63 = simpleRegression60.getN();
        long long64 = simpleRegression60.getN();
        double[][] doubleArray65 = new double[][] {};
        simpleRegression60.addData(doubleArray65);
        simpleRegression53.addData(doubleArray65);
        simpleRegression11.addData(doubleArray65);
        simpleRegression0.addData(doubleArray65);
        double double70 = simpleRegression0.getRSquare();
        double double71 = simpleRegression0.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression72 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long73 = simpleRegression72.getN();
        double double74 = simpleRegression72.getSumSquaredErrors();
        long long75 = simpleRegression72.getN();
        double double77 = simpleRegression72.predict(100.0d);
        double double78 = simpleRegression72.getInterceptStdErr();
        double double79 = simpleRegression72.getRSquare();
        double double80 = simpleRegression72.getSumSquaredErrors();
        double double81 = simpleRegression72.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression82 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long83 = simpleRegression82.getN();
        double double84 = simpleRegression82.getTotalSumSquares();
        double double85 = simpleRegression82.getSlopeStdErr();
        long long86 = simpleRegression82.getN();
        double double87 = simpleRegression82.getTotalSumSquares();
        double[][] doubleArray88 = new double[][] {};
        simpleRegression82.addData(doubleArray88);
        simpleRegression72.addData(doubleArray88);
        simpleRegression0.addData(doubleArray88);
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
        org.junit.Assert.assertTrue(Double.isNaN(double14));
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
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.9999999999999998d + "'", double51 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.9999999999999999d + "'", double52 == 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertNotNull(doubleArray88);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData((-3.0d), (double) 100L);
        double double8 = simpleRegression0.getTotalSumSquares();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getRSquare();
        double double13 = simpleRegression0.predict((-0.23231251964342317d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
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
        double double13 = simpleRegression0.predict(6.031565971695669E-7d);
        double double14 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval(0.008651139811367564d);
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
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
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
        double double52 = simpleRegression0.getRegressionSumSquares();
        double double53 = simpleRegression0.getTotalSumSquares();
        double double54 = simpleRegression0.getIntercept();
        double double55 = simpleRegression0.getSignificance();
        double double56 = simpleRegression0.getSumSquaredErrors();
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
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 100.0d + "'", double54 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        double double41 = simpleRegression39.getRSquare();
        double double42 = simpleRegression39.getRegressionSumSquares();
        double double43 = simpleRegression39.getRSquare();
        double double44 = simpleRegression39.getTotalSumSquares();
        double double45 = simpleRegression39.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression46 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long47 = simpleRegression46.getN();
        double double48 = simpleRegression46.getSumSquaredErrors();
        double double50 = simpleRegression46.predict((double) 10L);
        double double51 = simpleRegression46.getIntercept();
        simpleRegression46.addData((double) (byte) 100, (double) 100.0f);
        double double55 = simpleRegression46.getIntercept();
        double double56 = simpleRegression46.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression57 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long58 = simpleRegression57.getN();
        double double59 = simpleRegression57.getSumSquaredErrors();
        double double61 = simpleRegression57.predict((double) 10L);
        double double62 = simpleRegression57.getIntercept();
        simpleRegression57.addData((double) (byte) 100, (double) 100.0f);
        double double67 = simpleRegression57.predict((double) 100L);
        double double68 = simpleRegression57.getMeanSquareError();
        long long69 = simpleRegression57.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression70 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long71 = simpleRegression70.getN();
        double double72 = simpleRegression70.getRSquare();
        double double73 = simpleRegression70.getTotalSumSquares();
        double[] doubleArray78 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray83 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray84 = new double[][] { doubleArray78, doubleArray83 };
        simpleRegression70.addData(doubleArray84);
        simpleRegression57.addData(doubleArray84);
        simpleRegression46.addData(doubleArray84);
        simpleRegression39.addData(doubleArray84);
        simpleRegression0.addData(doubleArray84);
        // The following exception was thrown during execution in test generation
        try {
            double double90 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getR();
        double double6 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.getRegressionSumSquares();
        double double8 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) (byte) 10, (double) (-1.0f));
        simpleRegression0.addData((double) 0L, (double) 'a');
        double double11 = simpleRegression0.getSlopeStdErr();
        double double12 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.getRSquare();
        double double6 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.getIntercept();
        double double9 = simpleRegression0.predict((double) 0.0f);
        double double10 = simpleRegression0.getSlope();
        double double11 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
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
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
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
        double double10 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.getSlope();
        long long12 = simpleRegression0.getN();
        double double13 = simpleRegression0.getSumSquaredErrors();
        double double14 = simpleRegression0.getSumSquaredErrors();
        double double15 = simpleRegression0.getInterceptStdErr();
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
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
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
        double double48 = simpleRegression0.getRegressionSumSquares();
        double double49 = simpleRegression0.getInterceptStdErr();
        double double50 = simpleRegression0.getRegressionSumSquares();
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
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 4142.092174397623d + "'", double48 == 4142.092174397623d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 20.57675335994694d + "'", double49 == 20.57675335994694d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4142.092174397623d + "'", double50 == 4142.092174397623d);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
        double double40 = simpleRegression0.getRegressionSumSquares();
        double double41 = simpleRegression0.getTotalSumSquares();
        double double42 = simpleRegression0.getSlope();
        double double43 = simpleRegression0.getSlopeStdErr();
        double double44 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData(0.0d, (double) 1);
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
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8743.714285714283d + "'", double40 == 8743.714285714283d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 8743.714285714286d + "'", double41 == 8743.714285714286d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0099999999999998d + "'", double42 == 1.0099999999999998d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 6.514835844650013E-9d + "'", double43 == 6.514835844650013E-9d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 8743.714285714286d + "'", double44 == 8743.714285714286d);
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
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getInterceptStdErr();
        double double11 = simpleRegression0.getSlopeStdErr();
        double double12 = simpleRegression0.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long14 = simpleRegression13.getN();
        double double15 = simpleRegression13.getSumSquaredErrors();
        double double17 = simpleRegression13.predict((double) 10L);
        double double18 = simpleRegression13.getIntercept();
        double double19 = simpleRegression13.getRegressionSumSquares();
        long long20 = simpleRegression13.getN();
        double double21 = simpleRegression13.getR();
        double double22 = simpleRegression13.getR();
        double double23 = simpleRegression13.getMeanSquareError();
        double double25 = simpleRegression13.predict((double) (byte) 1);
        double double26 = simpleRegression13.getMeanSquareError();
        double double27 = simpleRegression13.getMeanSquareError();
        double double28 = simpleRegression13.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression29 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long30 = simpleRegression29.getN();
        double double31 = simpleRegression29.getRSquare();
        double double32 = simpleRegression29.getRegressionSumSquares();
        double double33 = simpleRegression29.getRSquare();
        double double34 = simpleRegression29.getTotalSumSquares();
        double double35 = simpleRegression29.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression36 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long37 = simpleRegression36.getN();
        double double38 = simpleRegression36.getSumSquaredErrors();
        double double40 = simpleRegression36.predict((double) 10L);
        double double41 = simpleRegression36.getIntercept();
        simpleRegression36.addData((double) (byte) 100, (double) 100.0f);
        double double45 = simpleRegression36.getIntercept();
        double double46 = simpleRegression36.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression47 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long48 = simpleRegression47.getN();
        double double49 = simpleRegression47.getSumSquaredErrors();
        double double51 = simpleRegression47.predict((double) 10L);
        double double52 = simpleRegression47.getIntercept();
        simpleRegression47.addData((double) (byte) 100, (double) 100.0f);
        double double57 = simpleRegression47.predict((double) 100L);
        double double58 = simpleRegression47.getMeanSquareError();
        long long59 = simpleRegression47.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression60 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long61 = simpleRegression60.getN();
        double double62 = simpleRegression60.getRSquare();
        double double63 = simpleRegression60.getTotalSumSquares();
        double[] doubleArray68 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray73 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray74 = new double[][] { doubleArray68, doubleArray73 };
        simpleRegression60.addData(doubleArray74);
        simpleRegression47.addData(doubleArray74);
        simpleRegression36.addData(doubleArray74);
        simpleRegression29.addData(doubleArray74);
        simpleRegression13.addData(doubleArray74);
        simpleRegression0.addData(doubleArray74);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.getR();
        double double8 = simpleRegression0.predict((double) 100);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double10 = simpleRegression9.getR();
        double double11 = simpleRegression9.getTotalSumSquares();
        double double12 = simpleRegression9.getSlopeStdErr();
        double double13 = simpleRegression9.getSlopeStdErr();
        double double14 = simpleRegression9.getSlopeStdErr();
        simpleRegression9.addData((-2.009999999999984d), (-1.0d));
        double double18 = simpleRegression9.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression19 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long20 = simpleRegression19.getN();
        double double21 = simpleRegression19.getSumSquaredErrors();
        long long22 = simpleRegression19.getN();
        double double23 = simpleRegression19.getTotalSumSquares();
        double double24 = simpleRegression19.getSlopeStdErr();
        double double25 = simpleRegression19.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long27 = simpleRegression26.getN();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) 10L);
        double double31 = simpleRegression26.getIntercept();
        double double32 = simpleRegression26.getRegressionSumSquares();
        long long33 = simpleRegression26.getN();
        double double34 = simpleRegression26.getR();
        double double35 = simpleRegression26.getSlope();
        double double36 = simpleRegression26.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression37 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long38 = simpleRegression37.getN();
        double double39 = simpleRegression37.getSumSquaredErrors();
        double double41 = simpleRegression37.predict((double) 10L);
        double double42 = simpleRegression37.getIntercept();
        simpleRegression37.addData((double) (byte) 100, (double) 100.0f);
        double double47 = simpleRegression37.predict((double) 100L);
        double double48 = simpleRegression37.getMeanSquareError();
        long long49 = simpleRegression37.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression50 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long51 = simpleRegression50.getN();
        double double52 = simpleRegression50.getSumSquaredErrors();
        double double54 = simpleRegression50.predict((double) 10L);
        double double55 = simpleRegression50.getIntercept();
        simpleRegression50.addData((double) (byte) 100, (double) 100.0f);
        double double60 = simpleRegression50.predict((double) 100L);
        double double61 = simpleRegression50.getMeanSquareError();
        long long62 = simpleRegression50.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression63 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long64 = simpleRegression63.getN();
        double double65 = simpleRegression63.getRSquare();
        double double66 = simpleRegression63.getTotalSumSquares();
        double[] doubleArray71 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray76 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray77 = new double[][] { doubleArray71, doubleArray76 };
        simpleRegression63.addData(doubleArray77);
        simpleRegression50.addData(doubleArray77);
        simpleRegression37.addData(doubleArray77);
        simpleRegression26.addData(doubleArray77);
        simpleRegression19.addData(doubleArray77);
        simpleRegression9.addData(doubleArray77);
        simpleRegression0.addData(doubleArray77);
        double double85 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double9 = simpleRegression0.predict((double) 0);
        double double10 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double5 = simpleRegression0.predict(2.0300000000000153d);
        double double6 = simpleRegression0.getTotalSumSquares();
        double double7 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression5 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long6 = simpleRegression5.getN();
        double double7 = simpleRegression5.getSumSquaredErrors();
        long long8 = simpleRegression5.getN();
        double double9 = simpleRegression5.getRSquare();
        double[] doubleArray14 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray19 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray24 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[][] doubleArray25 = new double[][] { doubleArray14, doubleArray19, doubleArray24 };
        simpleRegression5.addData(doubleArray25);
        simpleRegression0.addData(doubleArray25);
        double double28 = simpleRegression0.getSumSquaredErrors();
        long long29 = simpleRegression0.getN();
        double double30 = simpleRegression0.getSumSquaredErrors();
        double double31 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 3L + "'", long29 == 3L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getR();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double4 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData((-2.009999999999984d), (-1.0d));
        simpleRegression0.addData((double) 10.0f, (-0.9974010885284709d));
        long long12 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getSlopeStdErr();
        double double12 = simpleRegression0.getIntercept();
        double double13 = simpleRegression0.getSumSquaredErrors();
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
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
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
        double double42 = simpleRegression0.getRegressionSumSquares();
        double double43 = simpleRegression0.getSlopeStdErr();
        double double44 = simpleRegression0.getSumSquaredErrors();
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
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 8743.714285714283d + "'", double42 == 8743.714285714283d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 6.514835844650013E-9d + "'", double43 == 6.514835844650013E-9d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.8189894035458565E-12d + "'", double44 == 1.8189894035458565E-12d);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
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
        simpleRegression0.clear();
        simpleRegression0.clear();
        double double17 = simpleRegression0.getInterceptStdErr();
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
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
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
        double double40 = simpleRegression0.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression41 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double42 = simpleRegression41.getSumSquaredErrors();
        double double43 = simpleRegression41.getTotalSumSquares();
        double double44 = simpleRegression41.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression45 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long46 = simpleRegression45.getN();
        double double47 = simpleRegression45.getSumSquaredErrors();
        double double48 = simpleRegression45.getRegressionSumSquares();
        simpleRegression45.addData(0.0d, (-1.0d));
        double double52 = simpleRegression45.getR();
        double double54 = simpleRegression45.predict(10.0d);
        double double56 = simpleRegression45.predict(100.0d);
        double double58 = simpleRegression45.predict((double) (short) 0);
        long long59 = simpleRegression45.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression60 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long61 = simpleRegression60.getN();
        double double62 = simpleRegression60.getSumSquaredErrors();
        double double64 = simpleRegression60.predict((double) 10L);
        double double65 = simpleRegression60.getIntercept();
        double double66 = simpleRegression60.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression67 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long68 = simpleRegression67.getN();
        double double69 = simpleRegression67.getSumSquaredErrors();
        long long70 = simpleRegression67.getN();
        long long71 = simpleRegression67.getN();
        double[][] doubleArray72 = new double[][] {};
        simpleRegression67.addData(doubleArray72);
        simpleRegression60.addData(doubleArray72);
        simpleRegression45.addData(doubleArray72);
        simpleRegression41.addData(doubleArray72);
        simpleRegression0.addData(doubleArray72);
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
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(doubleArray72);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict(4.066480948555191E-7d);
        double double6 = simpleRegression0.getRegressionSumSquares();
        java.lang.Class<?> wildcardClass7 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
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
        double double9 = simpleRegression0.getIntercept();
        simpleRegression0.addData(0.9999999999999998d, (double) ' ');
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long14 = simpleRegression13.getN();
        double double15 = simpleRegression13.getRSquare();
        double double16 = simpleRegression13.getRegressionSumSquares();
        simpleRegression13.addData((double) (short) 10, (double) 7L);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression20 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long21 = simpleRegression20.getN();
        double double22 = simpleRegression20.getSumSquaredErrors();
        double double24 = simpleRegression20.predict((double) 10L);
        double double25 = simpleRegression20.getIntercept();
        double double26 = simpleRegression20.getRegressionSumSquares();
        long long27 = simpleRegression20.getN();
        double double28 = simpleRegression20.getR();
        double double29 = simpleRegression20.getR();
        double double31 = simpleRegression20.predict((double) 13L);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression32 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long33 = simpleRegression32.getN();
        double double34 = simpleRegression32.getSumSquaredErrors();
        double double36 = simpleRegression32.predict((double) 10L);
        double double37 = simpleRegression32.getIntercept();
        double double38 = simpleRegression32.getRegressionSumSquares();
        double double39 = simpleRegression32.getSumSquaredErrors();
        double double40 = simpleRegression32.getMeanSquareError();
        double double41 = simpleRegression32.getRegressionSumSquares();
        double double42 = simpleRegression32.getSumSquaredErrors();
        double[] doubleArray46 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray50 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray54 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray58 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray62 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray66 = new double[] { (byte) 1, 0L, 'a' };
        double[][] doubleArray67 = new double[][] { doubleArray46, doubleArray50, doubleArray54, doubleArray58, doubleArray62, doubleArray66 };
        simpleRegression32.addData(doubleArray67);
        simpleRegression20.addData(doubleArray67);
        simpleRegression13.addData(doubleArray67);
        simpleRegression0.addData(doubleArray67);
        double double72 = simpleRegression0.getSignificance();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 3.173438185100075E-4d + "'", double72 == 3.173438185100075E-4d);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.predict((double) 1);
        double double9 = simpleRegression0.getSlopeStdErr();
        double double11 = simpleRegression0.predict((double) (-1.0f));
        double double12 = simpleRegression0.getSlope();
        double double13 = simpleRegression0.getInterceptStdErr();
        double double14 = simpleRegression0.getSlopeStdErr();
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
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
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
        double double41 = simpleRegression0.getSlopeConfidenceInterval();
        double double42 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double44 = simpleRegression0.getInterceptStdErr();
        double double45 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.6746918727301837E-8d + "'", double41 == 1.6746918727301837E-8d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.8189894035458565E-12d + "'", double42 == 1.8189894035458565E-12d);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double10 = simpleRegression9.getSumSquaredErrors();
        double double11 = simpleRegression9.getSumSquaredErrors();
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
        double double28 = simpleRegression26.getRSquare();
        double double29 = simpleRegression26.getTotalSumSquares();
        double[] doubleArray34 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray39 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray40 = new double[][] { doubleArray34, doubleArray39 };
        simpleRegression26.addData(doubleArray40);
        simpleRegression13.addData(doubleArray40);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression43 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long44 = simpleRegression43.getN();
        double double45 = simpleRegression43.getSumSquaredErrors();
        long long46 = simpleRegression43.getN();
        long long47 = simpleRegression43.getN();
        double[][] doubleArray48 = new double[][] {};
        simpleRegression43.addData(doubleArray48);
        simpleRegression13.addData(doubleArray48);
        simpleRegression9.addData(doubleArray48);
        simpleRegression0.addData(doubleArray48);
        double double53 = simpleRegression0.getSumSquaredErrors();
        double double54 = simpleRegression0.getRSquare();
        double double55 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
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
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        simpleRegression0.addData((double) 6L, (double) (byte) 0);
        double double11 = simpleRegression0.getSumSquaredErrors();
        double double12 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
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
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getRSquare();
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getTotalSumSquares();
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
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getTotalSumSquares();
        double double7 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.predict(1.2989609388114332E-13d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlope();
        double double4 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.predict(4.492039526641522E-8d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
        simpleRegression0.clear();
        double double12 = simpleRegression0.getInterceptStdErr();
        double double13 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, 3513.007091486856d);
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
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) 3L, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }
}

