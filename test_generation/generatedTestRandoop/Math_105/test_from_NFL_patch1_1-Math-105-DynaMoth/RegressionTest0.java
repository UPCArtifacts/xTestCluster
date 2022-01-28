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
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        java.lang.Class<?> wildcardClass5 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double[][] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleRegression0.addData(doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[] doubleArray2 = new double[] { 1L };
        double[][] doubleArray3 = new double[][] { doubleArray2 };
        // The following exception was thrown during execution in test generation
        try {
            simpleRegression0.addData(doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
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
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass10 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval(0.0d);
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        // The following exception was thrown during execution in test generation
        try {
            double double1 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
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
        java.lang.Class<?> wildcardClass42 = doubleArray39.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass4 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
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
        java.lang.Class<?> wildcardClass40 = doubleArray37.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        java.lang.Class<?> wildcardClass6 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
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
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        long long9 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval(100.0d);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        long long12 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass13 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double9 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval();
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
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        long long9 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass10 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
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
        // The following exception was thrown during execution in test generation
        try {
            double double17 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        long long9 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.predict((double) 1);
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        java.lang.Class<?> wildcardClass3 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRegressionSumSquares();
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass3 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) 'a', (double) (byte) 100);
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
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        java.lang.Class<?> wildcardClass40 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval();
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
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
        java.lang.Class<?> wildcardClass30 = doubleArray27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getRSquare();
        java.lang.Class<?> wildcardClass5 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        java.lang.Class<?> wildcardClass5 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        double double4 = simpleRegression0.getRegressionSumSquares();
        double double5 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval(Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        // The following exception was thrown during execution in test generation
        try {
            double double1 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
        java.lang.Class<?> wildcardClass41 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        java.lang.Class<?> wildcardClass7 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
        long long42 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double44 = simpleRegression0.getSlopeConfidenceInterval((double) 1);
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
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.9999999999999999d + "'", double41 == 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 7L + "'", long42 == 7L);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        long long12 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval();
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
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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
        // The following exception was thrown during execution in test generation
        try {
            double double31 = simpleRegression0.getSlopeConfidenceInterval(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval();
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
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        double double30 = simpleRegression0.getSlope();
        double double31 = simpleRegression0.getTotalSumSquares();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.030303030303030304d + "'", double30 == 0.030303030303030304d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 6.0d + "'", double31 == 6.0d);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getRSquare();
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        double[][] doubleArray18 = new double[][] { doubleArray13, doubleArray14, doubleArray15, doubleArray16, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            simpleRegression0.addData(doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval((-0.9999999999999838d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        long long5 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval(0.9999999999999999d);
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getMeanSquareError();
        java.lang.Class<?> wildcardClass7 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        long long6 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval((double) 10L);
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
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
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval((double) 3L);
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
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        java.lang.Class<?> wildcardClass2 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getRSquare();
        java.lang.Class<?> wildcardClass13 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getTotalSumSquares();
        double double8 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        java.lang.Class<?> wildcardClass44 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double4 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.predict((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        long long12 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        // The following exception was thrown during execution in test generation
        try {
            double double25 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.predict((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getTotalSumSquares();
        long long4 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) 'a', (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        simpleRegression0.addData((-1.0d), (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        double double10 = simpleRegression0.getSlope();
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
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval();
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
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getIntercept();
        long long11 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double4 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.predict((double) '#');
        java.lang.Class<?> wildcardClass7 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        double[] doubleArray14 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray18 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray22 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray26 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray30 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray34 = new double[] { (byte) 1, 0L, 'a' };
        double[][] doubleArray35 = new double[][] { doubleArray14, doubleArray18, doubleArray22, doubleArray26, doubleArray30, doubleArray34 };
        simpleRegression0.addData(doubleArray35);
        double double37 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double8 = simpleRegression0.predict((double) (byte) 100);
        double double9 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        long long8 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.6983204134366925d + "'", double34 == 0.6983204134366925d);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        double double42 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double44 = simpleRegression0.getSlopeConfidenceInterval(1.0d);
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
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.9999999999999998d + "'", double42 == 0.9999999999999998d);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval((double) 0.0f);
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
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getRSquare();
        java.lang.Class<?> wildcardClass8 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getMeanSquareError();
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        java.lang.Class<?> wildcardClass62 = doubleArray58.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        java.lang.Class<?> wildcardClass10 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.predict((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval(6.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double9 = simpleRegression0.predict((double) 0);
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSlopeConfidenceInterval((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        double double4 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getIntercept();
        long long11 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSlopeConfidenceInterval((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) (byte) 10, (double) (-1.0f));
        simpleRegression0.addData((double) 0L, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval();
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
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval();
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
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.predict((double) (byte) 10);
        long long7 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        java.lang.Class<?> wildcardClass17 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        double double4 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        // The following exception was thrown during execution in test generation
        try {
            double double96 = simpleRegression0.getSlopeConfidenceInterval((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        java.lang.Class<?> wildcardClass3 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        java.lang.Class<?> wildcardClass3 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval((double) 6L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        double double12 = simpleRegression0.predict((double) 0.0f);
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
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        // The following exception was thrown during execution in test generation
        try {
            double double41 = simpleRegression0.getSlopeConfidenceInterval((double) 'a');
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
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getRSquare();
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
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        simpleRegression0.clear();
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getIntercept();
        double double8 = simpleRegression0.getInterceptStdErr();
        long long9 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        java.lang.Class<?> wildcardClass5 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getIntercept();
        long long11 = simpleRegression0.getN();
        double double12 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        simpleRegression0.addData(0.9999999999999998d, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSlopeConfidenceInterval((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        double double7 = simpleRegression0.getTotalSumSquares();
        java.lang.Class<?> wildcardClass8 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSlopeConfidenceInterval(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval(9416.307692307693d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval((-0.2946963824289245d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        // The following exception was thrown during execution in test generation
        try {
            double double41 = simpleRegression0.getSlopeConfidenceInterval(1.0099999999999998d);
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
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getMeanSquareError();
        long long7 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval();
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
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getSumSquaredErrors();
        double double9 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        java.lang.Class<?> wildcardClass14 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getTotalSumSquares();
        double double2 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        double double59 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double60 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
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
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        double double13 = simpleRegression0.getSlope();
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
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        long long11 = simpleRegression0.getN();
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
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        double double48 = simpleRegression0.getSlopeStdErr();
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
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.23752863392368403d + "'", double48 == 0.23752863392368403d);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getTotalSumSquares();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval(8743.714285714283d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        long long12 = simpleRegression0.getN();
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
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        double double15 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double11 = simpleRegression0.predict((double) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval();
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
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        double double15 = simpleRegression0.getInterceptStdErr();
        java.lang.Class<?> wildcardClass16 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        // The following exception was thrown during execution in test generation
        try {
            double double17 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        double double16 = simpleRegression0.predict((double) 0L);
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
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) (byte) 10, (double) (-1.0f));
        simpleRegression0.addData((double) 0L, (double) 'a');
        double double11 = simpleRegression0.getInterceptStdErr();
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
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        simpleRegression0.addData((double) 0L, 10.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
            double double43 = simpleRegression0.getSlopeConfidenceInterval((double) 1);
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
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getTotalSumSquares();
        long long4 = simpleRegression0.getN();
        double double6 = simpleRegression0.predict(0.0d);
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        double double16 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        simpleRegression0.clear();
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.addData(1.0d, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval(8743.714285714283d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        // The following exception was thrown during execution in test generation
        try {
            double double60 = simpleRegression0.getSlopeConfidenceInterval((double) (short) 1);
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
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getR();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval((-0.2946963824289245d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getTotalSumSquares();
        double double2 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval(1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getMeanSquareError();
        simpleRegression0.addData(Double.NaN, (double) 7L);
        double double9 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        double double66 = simpleRegression64.getSumSquaredErrors();
        double double68 = simpleRegression64.predict((double) 10L);
        double double69 = simpleRegression64.getIntercept();
        simpleRegression64.addData((double) (byte) 100, (double) 100.0f);
        double double74 = simpleRegression64.predict((double) 100L);
        double double75 = simpleRegression64.getMeanSquareError();
        long long76 = simpleRegression64.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression77 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long78 = simpleRegression77.getN();
        double double79 = simpleRegression77.getRSquare();
        double double80 = simpleRegression77.getTotalSumSquares();
        double[] doubleArray85 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray90 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray91 = new double[][] { doubleArray85, doubleArray90 };
        simpleRegression77.addData(doubleArray91);
        simpleRegression64.addData(doubleArray91);
        simpleRegression51.addData(doubleArray91);
        simpleRegression0.addData(doubleArray91);
        java.lang.Class<?> wildcardClass96 = simpleRegression0.getClass();
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
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1L + "'", long76 == 1L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        double double42 = simpleRegression0.getRSquare();
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
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.9999999999999998d + "'", double42 == 0.9999999999999998d);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getTotalSumSquares();
        long long4 = simpleRegression0.getN();
        double double6 = simpleRegression0.predict(0.0d);
        long long7 = simpleRegression0.getN();
        double double9 = simpleRegression0.predict((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getSumSquaredErrors();
        double double10 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getRSquare();
        double double13 = simpleRegression0.getIntercept();
        double double14 = simpleRegression0.getR();
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long14 = simpleRegression13.getN();
        double double15 = simpleRegression13.getSumSquaredErrors();
        long long16 = simpleRegression13.getN();
        double double17 = simpleRegression13.getTotalSumSquares();
        double double18 = simpleRegression13.getSlopeStdErr();
        double double19 = simpleRegression13.getR();
        double double21 = simpleRegression13.predict((double) 100);
        double[] doubleArray28 = new double[] { 100, 1, 100, (-1L), '4', 6L };
        double[] doubleArray35 = new double[] { 100, 1, 100, (-1L), '4', 6L };
        double[][] doubleArray36 = new double[][] { doubleArray28, doubleArray35 };
        simpleRegression13.addData(doubleArray36);
        simpleRegression0.addData(doubleArray36);
        double double39 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 1.0, 100.0, -1.0, 52.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 1.0, 100.0, -1.0, 52.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval(1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getIntercept();
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        simpleRegression0.addData((double) 6L, (double) (byte) 0);
        double double12 = simpleRegression0.predict((double) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.1666666666666667d) + "'", double12 == (-1.1666666666666667d));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        java.lang.Class<?> wildcardClass18 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        double double15 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        double double12 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double[][] doubleArray5 = new double[][] {};
        simpleRegression0.addData(doubleArray5);
        simpleRegression0.addData((double) (byte) 1, 1.8189894035458565E-12d);
        double double10 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.predict((double) 1);
        long long9 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass10 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        // The following exception was thrown during execution in test generation
        try {
            double double60 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        double double35 = simpleRegression0.predict((double) (short) -1);
        double double37 = simpleRegression0.predict((double) (short) 100);
        java.lang.Class<?> wildcardClass38 = simpleRegression0.getClass();
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
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 65.00710594315245d + "'", double35 == 65.00710594315245d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 93.71511627906978d + "'", double37 == 93.71511627906978d);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        // The following exception was thrown during execution in test generation
        try {
            double double17 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        double double42 = simpleRegression0.predict((double) 10L);
        double double43 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 9.100000000000014d + "'", double42 == 9.100000000000014d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 3.637978807091713E-13d + "'", double43 == 3.637978807091713E-13d);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval(0.2842377260981912d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        double double12 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        // The following exception was thrown during execution in test generation
        try {
            double double61 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
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
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        java.lang.Class<?> wildcardClass2 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        double double14 = simpleRegression0.getSlope();
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
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        double double15 = simpleRegression0.getSumSquaredErrors();
        double[][] doubleArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleRegression0.addData(doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.predict((double) 1);
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        java.lang.Class<?> wildcardClass54 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        double double12 = simpleRegression0.getMeanSquareError();
        double double13 = simpleRegression0.getSlopeStdErr();
        double double14 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSlopeConfidenceInterval(6.0d);
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
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval(0.5366294777987983d);
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
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        double double50 = simpleRegression0.getIntercept();
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
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double[] doubleArray8 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray13 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray14 = new double[][] { doubleArray8, doubleArray13 };
        simpleRegression0.addData(doubleArray14);
        double double16 = simpleRegression0.getRegressionSumSquares();
        double double17 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = simpleRegression0.getSlopeConfidenceInterval((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        double double9 = simpleRegression0.predict(10.0d);
        double double11 = simpleRegression0.predict(100.0d);
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        double double15 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getRegressionSumSquares();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        double double11 = simpleRegression0.getIntercept();
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
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        simpleRegression0.clear();
        double double8 = simpleRegression0.getTotalSumSquares();
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        simpleRegression0.clear();
        simpleRegression0.addData((double) 1.0f, 0.23791906001465818d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getRSquare();
        double double13 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSlopeConfidenceInterval((-0.9999999999999838d));
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        simpleRegression0.clear();
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getIntercept();
        double double8 = simpleRegression0.getInterceptStdErr();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getRegressionSumSquares();
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getRSquare();
        double double13 = simpleRegression0.getMeanSquareError();
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
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        long long33 = simpleRegression30.getN();
        long long34 = simpleRegression30.getN();
        double[][] doubleArray35 = new double[][] {};
        simpleRegression30.addData(doubleArray35);
        simpleRegression0.addData(doubleArray35);
        simpleRegression0.addData((double) 0, 0.23791906001465818d);
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(doubleArray35);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        double double35 = simpleRegression0.predict((double) (short) -1);
        double double37 = simpleRegression0.predict((double) (short) 100);
        double double38 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 65.00710594315245d + "'", double35 == 65.00710594315245d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 93.71511627906978d + "'", double37 == 93.71511627906978d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.27658616728139623d + "'", double38 == 0.27658616728139623d);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getInterceptStdErr();
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        // The following exception was thrown during execution in test generation
        try {
            double double17 = simpleRegression0.getSlopeConfidenceInterval(0.6983204134366925d);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        double double12 = simpleRegression0.getIntercept();
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
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        simpleRegression0.clear();
        double double6 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        double double33 = simpleRegression0.getSlopeConfidenceInterval();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double35 = simpleRegression0.getSlopeConfidenceInterval();
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
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSlopeConfidenceInterval((double) 8L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        double double13 = simpleRegression0.getSumSquaredErrors();
        double double14 = simpleRegression0.getMeanSquareError();
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval();
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
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        java.lang.Class<?> wildcardClass14 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        java.lang.Class<?> wildcardClass22 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        double double33 = simpleRegression0.predict(1.6536267304962332E-13d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval();
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
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlope();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) 100L, (double) (byte) 0);
        double double12 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        simpleRegression0.addData((double) 0, 0.0d);
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
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval(0.0d);
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        // The following exception was thrown during execution in test generation
        try {
            double double61 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue(Double.isNaN(double60));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        simpleRegression0.addData((double) 10L, (double) (-1.0f));
        java.lang.Class<?> wildcardClass8 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        simpleRegression0.addData(doubleArray27);
        java.lang.Class<?> wildcardClass31 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval((double) 2L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval(0.9999999999999999d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getTotalSumSquares();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        java.lang.Class<?> wildcardClass4 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double6 = simpleRegression0.predict(5000.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        long long42 = simpleRegression0.getN();
        double double43 = simpleRegression0.getSlope();
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
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 7L + "'", long42 == 7L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0099999999999998d + "'", double43 == 1.0099999999999998d);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getSlope();
        long long12 = simpleRegression0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        double double48 = simpleRegression0.getInterceptStdErr();
        double double49 = simpleRegression0.getRegressionSumSquares();
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
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 20.57675335994694d + "'", double48 == 20.57675335994694d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4142.092174397623d + "'", double49 == 4142.092174397623d);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long5 = simpleRegression4.getN();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double8 = simpleRegression4.predict((double) 10L);
        double double9 = simpleRegression4.getIntercept();
        simpleRegression4.addData((double) (byte) 100, (double) 100.0f);
        double double14 = simpleRegression4.predict((double) 100L);
        double double15 = simpleRegression4.getMeanSquareError();
        long long16 = simpleRegression4.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long18 = simpleRegression17.getN();
        double double19 = simpleRegression17.getRSquare();
        double double20 = simpleRegression17.getTotalSumSquares();
        double[] doubleArray25 = new double[] { 1L, 'a', 0L, 10.0d };
        double[] doubleArray30 = new double[] { 1L, 'a', 0L, 10.0d };
        double[][] doubleArray31 = new double[][] { doubleArray25, doubleArray30 };
        simpleRegression17.addData(doubleArray31);
        simpleRegression4.addData(doubleArray31);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression34 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long35 = simpleRegression34.getN();
        double double36 = simpleRegression34.getSumSquaredErrors();
        long long37 = simpleRegression34.getN();
        long long38 = simpleRegression34.getN();
        double[][] doubleArray39 = new double[][] {};
        simpleRegression34.addData(doubleArray39);
        simpleRegression4.addData(doubleArray39);
        simpleRegression0.addData(doubleArray39);
        // The following exception was thrown during execution in test generation
        try {
            double double44 = simpleRegression0.getSlopeConfidenceInterval((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(doubleArray39);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.predict((-0.9999999999999838d));
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        double double51 = simpleRegression0.getMeanSquareError();
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
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.getRSquare();
        simpleRegression0.addData((double) 6L, 6.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval();
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getInterceptStdErr();
        double double3 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getRSquare();
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
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getTotalSumSquares();
        long long10 = simpleRegression0.getN();
        long long11 = simpleRegression0.getN();
        double double12 = simpleRegression0.getIntercept();
        double double13 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        simpleRegression0.clear();
        double double8 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        // The following exception was thrown during execution in test generation
        try {
            double double20 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getTotalSumSquares();
        double double11 = simpleRegression0.predict((double) (-1.0f));
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        // The following exception was thrown during execution in test generation
        try {
            double double19 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getIntercept();
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
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getRegressionSumSquares();
        double double5 = simpleRegression0.getR();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
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
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getR();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double4 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.predict((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) 3L, (double) 0);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long10 = simpleRegression9.getN();
        double double11 = simpleRegression9.getSumSquaredErrors();
        double double12 = simpleRegression9.getRegressionSumSquares();
        simpleRegression9.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long17 = simpleRegression16.getN();
        double double18 = simpleRegression16.getSumSquaredErrors();
        double double20 = simpleRegression16.predict((double) 10L);
        double double21 = simpleRegression16.getIntercept();
        simpleRegression16.addData((double) (byte) 100, (double) 100.0f);
        double double26 = simpleRegression16.predict((double) 100L);
        double double27 = simpleRegression16.getR();
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[] doubleArray39 = new double[] { 100L, 100.0d };
        double[] doubleArray42 = new double[] { 100L, 100.0d };
        double[] doubleArray45 = new double[] { 100L, 100.0d };
        double[][] doubleArray46 = new double[][] { doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42, doubleArray45 };
        simpleRegression16.addData(doubleArray46);
        simpleRegression9.addData(doubleArray46);
        simpleRegression0.addData(doubleArray46);
        java.lang.Class<?> wildcardClass50 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
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
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        double double13 = simpleRegression0.getSumSquaredErrors();
        double double15 = simpleRegression0.predict((double) 100L);
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
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval((double) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        simpleRegression0.addData(6.0d, 0.5366294777987983d);
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
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression60 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long61 = simpleRegression60.getN();
        double double62 = simpleRegression60.getSumSquaredErrors();
        double double64 = simpleRegression60.predict((double) 10L);
        double double65 = simpleRegression60.getIntercept();
        double double66 = simpleRegression60.getRegressionSumSquares();
        double double67 = simpleRegression60.getSumSquaredErrors();
        double double68 = simpleRegression60.getMeanSquareError();
        double double69 = simpleRegression60.getRegressionSumSquares();
        double double70 = simpleRegression60.getSumSquaredErrors();
        double double71 = simpleRegression60.getSlope();
        simpleRegression60.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression73 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long74 = simpleRegression73.getN();
        double double75 = simpleRegression73.getSumSquaredErrors();
        long long76 = simpleRegression73.getN();
        double double77 = simpleRegression73.getTotalSumSquares();
        double double78 = simpleRegression73.getSlopeStdErr();
        double double79 = simpleRegression73.getR();
        double double81 = simpleRegression73.predict((double) 100);
        double[] doubleArray88 = new double[] { 100, 1, 100, (-1L), '4', 6L };
        double[] doubleArray95 = new double[] { 100, 1, 100, (-1L), '4', 6L };
        double[][] doubleArray96 = new double[][] { doubleArray88, doubleArray95 };
        simpleRegression73.addData(doubleArray96);
        simpleRegression60.addData(doubleArray96);
        simpleRegression0.addData(doubleArray96);
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
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[100.0, 1.0, 100.0, -1.0, 52.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[100.0, 1.0, 100.0, -1.0, 52.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray96);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        double double39 = simpleRegression0.getR();
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
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        double double34 = simpleRegression0.getRegressionSumSquares();
        double double35 = simpleRegression0.getR();
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        simpleRegression0.clear();
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlope();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRSquare();
        double double6 = simpleRegression0.getMeanSquareError();
        double double8 = simpleRegression0.predict((double) 'a');
        double double9 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) 3L, (double) 0);
        simpleRegression0.addData((double) '4', (double) ' ');
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getIntercept();
        long long11 = simpleRegression0.getN();
        double double13 = simpleRegression0.predict(6.031565971695669E-7d);
        double double14 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        double double13 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        java.lang.Class<?> wildcardClass10 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass8 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRSquare();
        long long6 = simpleRegression0.getN();
        double double7 = simpleRegression0.getR();
        long long8 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        double double14 = simpleRegression0.getSlope();
        java.lang.Class<?> wildcardClass15 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getRSquare();
        double[] doubleArray9 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray14 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[] doubleArray19 = new double[] { 10, (byte) 10, 100.0f, 7L };
        double[][] doubleArray20 = new double[][] { doubleArray9, doubleArray14, doubleArray19 };
        simpleRegression0.addData(doubleArray20);
        double double22 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 100.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        double double11 = simpleRegression0.getSlope();
        double double12 = simpleRegression0.getMeanSquareError();
        double double13 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSlopeConfidenceInterval(0.6983204134366925d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        simpleRegression0.addData(0.030303030303030304d, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = simpleRegression0.getSignificance();
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.predict((double) (byte) 10);
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        double double85 = simpleRegression0.getSignificance();
        double double86 = simpleRegression0.getR();
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
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.9999999999999999d + "'", double86 == 0.9999999999999999d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval((double) 8L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        // The following exception was thrown during execution in test generation
        try {
            double double18 = simpleRegression0.getSlopeConfidenceInterval((double) 10.0f);
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
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        double double15 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass16 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        double double17 = simpleRegression0.getSumSquaredErrors();
        double double19 = simpleRegression0.predict((double) 6L);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = simpleRegression0.getSlopeConfidenceInterval(4142.092174397623d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval((double) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        java.lang.Class<?> wildcardClass97 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getR();
        double double5 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        java.lang.Class<?> wildcardClass5 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlope();
        double double4 = simpleRegression0.getIntercept();
        double double5 = simpleRegression0.getR();
        long long6 = simpleRegression0.getN();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double9 = simpleRegression0.predict(0.030303030303030304d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.predict((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval();
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
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getRSquare();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getIntercept();
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getR();
        simpleRegression0.clear();
        double double8 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData(9.100000000000014d, 100.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        simpleRegression0.addData(0.9999999999999998d, 6.031565971695669E-7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getTotalSumSquares();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval();
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getTotalSumSquares();
        long long10 = simpleRegression0.getN();
        double double12 = simpleRegression0.predict((double) 7L);
        double double13 = simpleRegression0.getR();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.predict((double) 1L);
        long long12 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval(5000.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.predict((double) (byte) 10);
        simpleRegression0.addData((double) '#', 4142.092174397623d);
        simpleRegression0.clear();
        double double11 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        double double15 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long17 = simpleRegression16.getN();
        long long18 = simpleRegression16.getN();
        double double19 = simpleRegression16.getRSquare();
        simpleRegression16.clear();
        double double21 = simpleRegression16.getSlope();
        double double22 = simpleRegression16.getMeanSquareError();
        simpleRegression16.clear();
        long long24 = simpleRegression16.getN();
        double double25 = simpleRegression16.getSlope();
        double double26 = simpleRegression16.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression27 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long28 = simpleRegression27.getN();
        double double29 = simpleRegression27.getTotalSumSquares();
        double double30 = simpleRegression27.getSlopeStdErr();
        double double32 = simpleRegression27.predict((double) 3L);
        double double33 = simpleRegression27.getRegressionSumSquares();
        double double34 = simpleRegression27.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression35 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long36 = simpleRegression35.getN();
        double double37 = simpleRegression35.getSumSquaredErrors();
        double double39 = simpleRegression35.predict((double) 10L);
        double double40 = simpleRegression35.getMeanSquareError();
        double double41 = simpleRegression35.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression42 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long43 = simpleRegression42.getN();
        double double44 = simpleRegression42.getSumSquaredErrors();
        double double45 = simpleRegression42.getRegressionSumSquares();
        simpleRegression42.addData(0.0d, (-1.0d));
        double double49 = simpleRegression42.getR();
        double double51 = simpleRegression42.predict(10.0d);
        double double53 = simpleRegression42.predict(100.0d);
        double double55 = simpleRegression42.predict((double) (short) 0);
        long long56 = simpleRegression42.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression57 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long58 = simpleRegression57.getN();
        double double59 = simpleRegression57.getSumSquaredErrors();
        double double61 = simpleRegression57.predict((double) 10L);
        double double62 = simpleRegression57.getIntercept();
        double double63 = simpleRegression57.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression64 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long65 = simpleRegression64.getN();
        double double66 = simpleRegression64.getSumSquaredErrors();
        long long67 = simpleRegression64.getN();
        long long68 = simpleRegression64.getN();
        double[][] doubleArray69 = new double[][] {};
        simpleRegression64.addData(doubleArray69);
        simpleRegression57.addData(doubleArray69);
        simpleRegression42.addData(doubleArray69);
        simpleRegression35.addData(doubleArray69);
        simpleRegression27.addData(doubleArray69);
        simpleRegression16.addData(doubleArray69);
        simpleRegression0.addData(doubleArray69);
        // The following exception was thrown during execution in test generation
        try {
            double double77 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertNotNull(doubleArray69);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getRSquare();
        long long12 = simpleRegression0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) (byte) 10, (double) (-1.0f));
        simpleRegression0.addData((double) 0L, (double) 'a');
        double double11 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.getTotalSumSquares();
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
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4802.0d + "'", double12 == 4802.0d);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        double double13 = simpleRegression0.getSlope();
        java.lang.Class<?> wildcardClass14 = simpleRegression0.getClass();
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
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getRegressionSumSquares();
        double[] doubleArray9 = new double[] { 0.5d };
        double[] doubleArray11 = new double[] { 0.5d };
        double[] doubleArray13 = new double[] { 0.5d };
        double[] doubleArray15 = new double[] { 0.5d };
        double[][] doubleArray16 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            simpleRegression0.addData(doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.5]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.5]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.5]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.5]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        double double4 = simpleRegression0.getRegressionSumSquares();
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        simpleRegression0.clear();
        double double8 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval(0.23752863392368403d);
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlope();
        double double10 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval((double) 'a');
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.predict((double) 1);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long10 = simpleRegression9.getN();
        double double11 = simpleRegression9.getSumSquaredErrors();
        double double12 = simpleRegression9.getRegressionSumSquares();
        simpleRegression9.addData(0.0d, (-1.0d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long17 = simpleRegression16.getN();
        double double18 = simpleRegression16.getSumSquaredErrors();
        double double20 = simpleRegression16.predict((double) 10L);
        double double21 = simpleRegression16.getIntercept();
        simpleRegression16.addData((double) (byte) 100, (double) 100.0f);
        double double26 = simpleRegression16.predict((double) 100L);
        double double27 = simpleRegression16.getR();
        double[] doubleArray30 = new double[] { 100L, 100.0d };
        double[] doubleArray33 = new double[] { 100L, 100.0d };
        double[] doubleArray36 = new double[] { 100L, 100.0d };
        double[] doubleArray39 = new double[] { 100L, 100.0d };
        double[] doubleArray42 = new double[] { 100L, 100.0d };
        double[] doubleArray45 = new double[] { 100L, 100.0d };
        double[][] doubleArray46 = new double[][] { doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42, doubleArray45 };
        simpleRegression16.addData(doubleArray46);
        simpleRegression9.addData(doubleArray46);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression49 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long50 = simpleRegression49.getN();
        double double51 = simpleRegression49.getSumSquaredErrors();
        double double53 = simpleRegression49.predict((double) 10L);
        double double54 = simpleRegression49.getIntercept();
        double double55 = simpleRegression49.getRegressionSumSquares();
        long long56 = simpleRegression49.getN();
        double double57 = simpleRegression49.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression58 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long59 = simpleRegression58.getN();
        double double60 = simpleRegression58.getSumSquaredErrors();
        double double62 = simpleRegression58.predict((double) 10L);
        double double63 = simpleRegression58.getIntercept();
        simpleRegression58.addData((double) (byte) 100, (double) 100.0f);
        double double68 = simpleRegression58.predict((double) 100L);
        double double69 = simpleRegression58.getR();
        double[] doubleArray72 = new double[] { 100L, 100.0d };
        double[] doubleArray75 = new double[] { 100L, 100.0d };
        double[] doubleArray78 = new double[] { 100L, 100.0d };
        double[] doubleArray81 = new double[] { 100L, 100.0d };
        double[] doubleArray84 = new double[] { 100L, 100.0d };
        double[] doubleArray87 = new double[] { 100L, 100.0d };
        double[][] doubleArray88 = new double[][] { doubleArray72, doubleArray75, doubleArray78, doubleArray81, doubleArray84, doubleArray87 };
        simpleRegression58.addData(doubleArray88);
        simpleRegression49.addData(doubleArray88);
        simpleRegression9.addData(doubleArray88);
        simpleRegression0.addData(doubleArray88);
        java.lang.Class<?> wildcardClass93 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
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
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        double double12 = simpleRegression0.getSlopeStdErr();
        double double13 = simpleRegression0.getSlopeStdErr();
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
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        double double14 = simpleRegression0.getRegressionSumSquares();
        java.lang.Class<?> wildcardClass15 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        simpleRegression0.addData((double) 6L, (double) (byte) 0);
        double double11 = simpleRegression0.getR();
        simpleRegression0.addData(0.6983204134366925d, (double) (byte) -1);
        double double15 = simpleRegression0.getSignificance();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.06787386507806925d + "'", double15 == 0.06787386507806925d);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSignificance();
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 100, (-0.2946963824289245d));
        double double9 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long8 = simpleRegression7.getN();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) 10L);
        double double12 = simpleRegression7.getIntercept();
        double double13 = simpleRegression7.getRegressionSumSquares();
        long long14 = simpleRegression7.getN();
        double double15 = simpleRegression7.getR();
        double double16 = simpleRegression7.getSlope();
        double double17 = simpleRegression7.getRegressionSumSquares();
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
        simpleRegression18.addData(doubleArray58);
        simpleRegression7.addData(doubleArray58);
        simpleRegression0.addData(doubleArray58);
        double double64 = simpleRegression0.getSlopeStdErr();
        java.lang.Class<?> wildcardClass65 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
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
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getSlope();
        java.lang.Class<?> wildcardClass5 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        double double14 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval(5000.0d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        double double53 = simpleRegression0.getMeanSquareError();
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
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        simpleRegression0.addData(4.066480948555191E-7d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass15 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData(0.9999999999999998d, (double) 100L);
        double double9 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        double double4 = simpleRegression0.getRegressionSumSquares();
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        simpleRegression0.clear();
        double double8 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval(Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        simpleRegression0.clear();
        double double13 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSignificance();
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getR();
        double double2 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData(65.00710594315245d, 6.0d);
        double double6 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        double double13 = simpleRegression0.getRegressionSumSquares();
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
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        double double90 = simpleRegression0.getMeanSquareError();
        double double91 = simpleRegression0.getSumSquaredErrors();
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
        org.junit.Assert.assertTrue(Double.isNaN(double91));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getSlope();
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long9 = simpleRegression8.getN();
        double double10 = simpleRegression8.getSumSquaredErrors();
        double double12 = simpleRegression8.predict((double) 10L);
        double double13 = simpleRegression8.getMeanSquareError();
        double double14 = simpleRegression8.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long16 = simpleRegression15.getN();
        double double17 = simpleRegression15.getSumSquaredErrors();
        double double18 = simpleRegression15.getRegressionSumSquares();
        simpleRegression15.addData(0.0d, (-1.0d));
        double double22 = simpleRegression15.getR();
        double double24 = simpleRegression15.predict(10.0d);
        double double26 = simpleRegression15.predict(100.0d);
        double double28 = simpleRegression15.predict((double) (short) 0);
        long long29 = simpleRegression15.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression30 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long31 = simpleRegression30.getN();
        double double32 = simpleRegression30.getSumSquaredErrors();
        double double34 = simpleRegression30.predict((double) 10L);
        double double35 = simpleRegression30.getIntercept();
        double double36 = simpleRegression30.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression37 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long38 = simpleRegression37.getN();
        double double39 = simpleRegression37.getSumSquaredErrors();
        long long40 = simpleRegression37.getN();
        long long41 = simpleRegression37.getN();
        double[][] doubleArray42 = new double[][] {};
        simpleRegression37.addData(doubleArray42);
        simpleRegression30.addData(doubleArray42);
        simpleRegression15.addData(doubleArray42);
        simpleRegression8.addData(doubleArray42);
        simpleRegression0.addData(doubleArray42);
        java.lang.Class<?> wildcardClass48 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        double double13 = simpleRegression0.predict((double) (short) 1);
        double double14 = simpleRegression0.getInterceptStdErr();
        double double15 = simpleRegression0.getInterceptStdErr();
        double double16 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        // The following exception was thrown during execution in test generation
        try {
            double double18 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        double double9 = simpleRegression0.predict(10.0d);
        double double11 = simpleRegression0.predict(100.0d);
        double double12 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.addData(1.0d, 0.23752863392368403d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        long long42 = simpleRegression0.getN();
        double double43 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression44 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long45 = simpleRegression44.getN();
        double double46 = simpleRegression44.getSumSquaredErrors();
        double double47 = simpleRegression44.getRegressionSumSquares();
        simpleRegression44.addData(0.0d, (-1.0d));
        double double51 = simpleRegression44.getR();
        simpleRegression44.addData((double) 6L, (double) (byte) 0);
        double double55 = simpleRegression44.getR();
        simpleRegression44.addData(0.6983204134366925d, (double) (byte) -1);
        double double59 = simpleRegression44.getSlopeConfidenceInterval();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression60 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long61 = simpleRegression60.getN();
        double double62 = simpleRegression60.getSumSquaredErrors();
        double double64 = simpleRegression60.predict((double) 10L);
        double double65 = simpleRegression60.getIntercept();
        double double66 = simpleRegression60.getRegressionSumSquares();
        double double67 = simpleRegression60.getSumSquaredErrors();
        double double68 = simpleRegression60.getMeanSquareError();
        double double69 = simpleRegression60.getRegressionSumSquares();
        double double70 = simpleRegression60.getSumSquaredErrors();
        double[] doubleArray74 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray78 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray82 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray86 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray90 = new double[] { (byte) 1, 0L, 'a' };
        double[] doubleArray94 = new double[] { (byte) 1, 0L, 'a' };
        double[][] doubleArray95 = new double[][] { doubleArray74, doubleArray78, doubleArray82, doubleArray86, doubleArray90, doubleArray94 };
        simpleRegression60.addData(doubleArray95);
        simpleRegression44.addData(doubleArray95);
        simpleRegression0.addData(doubleArray95);
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
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 7L + "'", long42 == 7L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 6.514835844650013E-9d + "'", double43 == 6.514835844650013E-9d);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.23791906001465818d + "'", double59 == 0.23791906001465818d);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray95);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        double double15 = simpleRegression0.getMeanSquareError();
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getRSquare();
        simpleRegression0.addData(93.71511627906978d, (double) (short) 100);
        double double16 = simpleRegression0.getTotalSumSquares();
        java.lang.Class<?> wildcardClass17 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long12 = simpleRegression11.getN();
        double double13 = simpleRegression11.getSumSquaredErrors();
        double double15 = simpleRegression11.predict((double) 10L);
        double double16 = simpleRegression11.getIntercept();
        double double17 = simpleRegression11.getRegressionSumSquares();
        long long18 = simpleRegression11.getN();
        double double19 = simpleRegression11.getR();
        double double20 = simpleRegression11.getSlope();
        double double21 = simpleRegression11.getRegressionSumSquares();
        double[] doubleArray24 = new double[] { 1L, ' ' };
        double[] doubleArray27 = new double[] { 1L, ' ' };
        double[] doubleArray30 = new double[] { 1L, ' ' };
        double[] doubleArray33 = new double[] { 1L, ' ' };
        double[] doubleArray36 = new double[] { 1L, ' ' };
        double[] doubleArray39 = new double[] { 1L, ' ' };
        double[][] doubleArray40 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36, doubleArray39 };
        simpleRegression11.addData(doubleArray40);
        simpleRegression0.addData(doubleArray40);
        // The following exception was thrown during execution in test generation
        try {
            double double44 = simpleRegression0.getSlopeConfidenceInterval((double) (-1.0f));
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        double double4 = simpleRegression0.getRegressionSumSquares();
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        simpleRegression0.clear();
        double double8 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        double double15 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        double double58 = simpleRegression0.getTotalSumSquares();
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
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.predict((double) (byte) 10);
        double double5 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getR();
        double double6 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.addData((double) 100L, 0.0d);
        simpleRegression0.clear();
        simpleRegression0.addData((double) 10, 1.6536267304962332E-13d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        simpleRegression0.addData((double) 6L, (double) (byte) 0);
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getRSquare();
        double double13 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.16666666666666666d + "'", double13 == 0.16666666666666666d);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 100, (-0.2946963824289245d));
        double double9 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval(0.0d);
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
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        double double58 = simpleRegression0.getTotalSumSquares();
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
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 8743.714285714286d + "'", double58 == 8743.714285714286d);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        double double11 = simpleRegression0.getSlope();
        double double12 = simpleRegression0.getMeanSquareError();
        double double13 = simpleRegression0.getSlope();
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
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        double double14 = simpleRegression0.predict(0.5366294777987983d);
        java.lang.Class<?> wildcardClass15 = simpleRegression0.getClass();
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
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        double double13 = simpleRegression0.predict((double) (short) 1);
        simpleRegression0.clear();
        double double15 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        double double58 = simpleRegression0.getIntercept();
        double double59 = simpleRegression0.getInterceptStdErr();
        double double60 = simpleRegression0.getSlopeStdErr();
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
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-0.9999999999999838d) + "'", double58 == (-0.9999999999999838d));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 6.031565971695669E-7d + "'", double59 == 6.031565971695669E-7d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 6.514835844650013E-9d + "'", double60 == 6.514835844650013E-9d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = simpleRegression0.getSlopeConfidenceInterval(6.514835844650013E-9d);
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
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getRegressionSumSquares();
        double double2 = simpleRegression0.getInterceptStdErr();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict(1.0099999999999998d);
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
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        long long50 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double52 = simpleRegression0.getSlopeConfidenceInterval((-0.9999999999999838d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 8L + "'", long50 == 8L);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        double double11 = simpleRegression0.getSlope();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        double double11 = simpleRegression0.getMeanSquareError();
        simpleRegression0.addData((double) 1, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.predict((double) 1);
        simpleRegression0.clear();
        double double10 = simpleRegression0.getSumSquaredErrors();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long12 = simpleRegression11.getN();
        double double13 = simpleRegression11.getSumSquaredErrors();
        double double15 = simpleRegression11.predict((double) 10L);
        double double16 = simpleRegression11.getIntercept();
        double double17 = simpleRegression11.getRegressionSumSquares();
        long long18 = simpleRegression11.getN();
        double double19 = simpleRegression11.getR();
        double double20 = simpleRegression11.getR();
        double double21 = simpleRegression11.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long23 = simpleRegression22.getN();
        double double24 = simpleRegression22.getSumSquaredErrors();
        double double26 = simpleRegression22.predict((double) 10L);
        double double27 = simpleRegression22.getIntercept();
        double double28 = simpleRegression22.getRegressionSumSquares();
        long long29 = simpleRegression22.getN();
        double double30 = simpleRegression22.getR();
        double double31 = simpleRegression22.getSlope();
        double double32 = simpleRegression22.getRegressionSumSquares();
        double[] doubleArray35 = new double[] { 1L, ' ' };
        double[] doubleArray38 = new double[] { 1L, ' ' };
        double[] doubleArray41 = new double[] { 1L, ' ' };
        double[] doubleArray44 = new double[] { 1L, ' ' };
        double[] doubleArray47 = new double[] { 1L, ' ' };
        double[] doubleArray50 = new double[] { 1L, ' ' };
        double[][] doubleArray51 = new double[][] { doubleArray35, doubleArray38, doubleArray41, doubleArray44, doubleArray47, doubleArray50 };
        simpleRegression22.addData(doubleArray51);
        simpleRegression11.addData(doubleArray51);
        simpleRegression0.addData(doubleArray51);
        double double55 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        simpleRegression0.addData((double) 6L, (double) (byte) 0);
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getRSquare();
        java.lang.Class<?> wildcardClass13 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval();
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
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        double double9 = simpleRegression0.predict(10.0d);
        double double11 = simpleRegression0.predict(100.0d);
        double double12 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.addData((double) ' ', 4.066480948555191E-7d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        double double14 = simpleRegression0.getRSquare();
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
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getSumSquaredErrors();
        double double10 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        long long6 = simpleRegression0.getN();
        simpleRegression0.addData((double) (short) 10, 1.0d);
        double double10 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getSumSquaredErrors();
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
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        java.lang.Class<?> wildcardClass13 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        long long52 = simpleRegression0.getN();
        double[][] doubleArray53 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleRegression0.addData(doubleArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        simpleRegression0.addData((double) (-1), (double) 1L);
        simpleRegression0.clear();
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
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        simpleRegression0.addData(0.9999999999999999d, 100.0d);
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getTotalSumSquares();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getRSquare();
        double double12 = simpleRegression0.getMeanSquareError();
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlope();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.predict(4802.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass7 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        double double58 = simpleRegression0.getIntercept();
        double double59 = simpleRegression0.getR();
        simpleRegression0.clear();
        double double62 = simpleRegression0.predict((double) 1);
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
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-0.9999999999999838d) + "'", double58 == (-0.9999999999999838d));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.9999999999999999d + "'", double59 == 0.9999999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSignificance();
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getR();
        simpleRegression0.addData((double) 6L, (double) (byte) 0);
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getRSquare();
        double double13 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSlopeConfidenceInterval((-0.4531891518946872d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        double double13 = simpleRegression0.getSlope();
        double double14 = simpleRegression0.getSumSquaredErrors();
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getTotalSumSquares();
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData(0.9999999999999998d, (double) 100L);
        double double9 = simpleRegression0.getSumSquaredErrors();
        double double10 = simpleRegression0.getR();
        double double11 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSignificance();
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        double double84 = simpleRegression0.getMeanSquareError();
        java.lang.Class<?> wildcardClass85 = simpleRegression0.getClass();
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
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 1.6536267304962332E-13d + "'", double84 == 1.6536267304962332E-13d);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData(0.9999999999999998d, (double) 100L);
        double double9 = simpleRegression0.getIntercept();
        java.lang.Class<?> wildcardClass10 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getR();
        double double12 = simpleRegression0.getIntercept();
        double double13 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSignificance();
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRSquare();
        long long6 = simpleRegression0.getN();
        double double7 = simpleRegression0.getR();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double9 = simpleRegression0.predict((double) 0);
        java.lang.Class<?> wildcardClass10 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getRegressionSumSquares();
        double double9 = simpleRegression0.getInterceptStdErr();
        double double10 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getR();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSumSquaredErrors();
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        long long34 = simpleRegression0.getN();
        double double35 = simpleRegression0.getMeanSquareError();
        double double36 = simpleRegression0.getRSquare();
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 4L + "'", long34 == 4L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 3396.9796511627906d + "'", double35 == 3396.9796511627906d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0764999079314125d + "'", double36 == 0.0764999079314125d);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        double double12 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        double double14 = simpleRegression0.predict((-0.4531891518946872d));
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
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double11 = simpleRegression0.getSlopeStdErr();
        double double12 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getRegressionSumSquares();
        double double8 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        // The following exception was thrown during execution in test generation
        try {
            double double19 = simpleRegression0.getSlopeConfidenceInterval(8743.714285714283d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.predict((double) (byte) 10);
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getR();
        simpleRegression0.addData((double) (-1.0f), (double) 0.0f);
        java.lang.Class<?> wildcardClass10 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval();
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
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        double double17 = simpleRegression0.getRegressionSumSquares();
        double double18 = simpleRegression0.getSlopeStdErr();
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
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRSquare();
        java.lang.Class<?> wildcardClass6 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRSquare();
        long long6 = simpleRegression0.getN();
        double double7 = simpleRegression0.getR();
        double double8 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
            double double10 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.predict((double) 1);
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getRSquare();
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getRSquare();
        double double13 = simpleRegression0.getMeanSquareError();
        double double15 = simpleRegression0.predict((double) 7L);
        double double16 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double8 = simpleRegression0.predict((double) (byte) 100);
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        simpleRegression0.addData(1.6536267304962332E-13d, (double) (byte) 1);
        double double25 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double26 = simpleRegression0.getSlopeConfidenceInterval();
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getRegressionSumSquares();
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long9 = simpleRegression8.getN();
        long long10 = simpleRegression8.getN();
        double double11 = simpleRegression8.getRSquare();
        simpleRegression8.clear();
        double double13 = simpleRegression8.getSlope();
        double double14 = simpleRegression8.getMeanSquareError();
        simpleRegression8.clear();
        long long16 = simpleRegression8.getN();
        double double17 = simpleRegression8.getIntercept();
        double double18 = simpleRegression8.getR();
        double double19 = simpleRegression8.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression20 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long21 = simpleRegression20.getN();
        double double22 = simpleRegression20.getSumSquaredErrors();
        long long23 = simpleRegression20.getN();
        double double24 = simpleRegression20.getTotalSumSquares();
        double double25 = simpleRegression20.getSlopeStdErr();
        double double26 = simpleRegression20.getR();
        double double28 = simpleRegression20.predict((double) 100);
        double[] doubleArray35 = new double[] { 100, 1, 100, (-1L), '4', 6L };
        double[] doubleArray42 = new double[] { 100, 1, 100, (-1L), '4', 6L };
        double[][] doubleArray43 = new double[][] { doubleArray35, doubleArray42 };
        simpleRegression20.addData(doubleArray43);
        simpleRegression8.addData(doubleArray43);
        simpleRegression0.addData(doubleArray43);
        // The following exception was thrown during execution in test generation
        try {
            double double48 = simpleRegression0.getSlopeConfidenceInterval(0.29496726124856915d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 1.0, 100.0, -1.0, 52.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 1.0, 100.0, -1.0, 52.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRSquare();
        long long6 = simpleRegression0.getN();
        double double7 = simpleRegression0.getR();
        long long8 = simpleRegression0.getN();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(0.0d, (-1.0d));
        double double8 = simpleRegression0.predict(6.514835844650013E-9d);
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        double double4 = simpleRegression0.getRegressionSumSquares();
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.predict((double) 1);
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getRSquare();
        double double12 = simpleRegression0.predict(0.06787386507806925d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSignificance();
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        double double91 = simpleRegression0.getSignificance();
        double double92 = simpleRegression0.getRegressionSumSquares();
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
        org.junit.Assert.assertTrue(Double.isNaN(double91));
        org.junit.Assert.assertTrue(Double.isNaN(double92));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlope();
        long long4 = simpleRegression0.getN();
        long long5 = simpleRegression0.getN();
        double double6 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        long long2 = simpleRegression0.getN();
        double double3 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        simpleRegression0.addData((double) 10L, (double) (-1.0f));
        double double8 = simpleRegression0.getSlope();
        double double9 = simpleRegression0.getTotalSumSquares();
        long long10 = simpleRegression0.getN();
        double double12 = simpleRegression0.predict((-2.009999999999984d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        double double12 = simpleRegression0.getMeanSquareError();
        double double13 = simpleRegression0.getRegressionSumSquares();
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
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        double double33 = simpleRegression0.getSlope();
        double double34 = simpleRegression0.getSlopeStdErr();
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
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.predict((double) 3L);
        double double6 = simpleRegression0.getRegressionSumSquares();
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getSlopeStdErr();
        long long9 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass10 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSlopeConfidenceInterval(7.199999999999999d);
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
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        java.lang.Class<?> wildcardClass51 = simpleRegression0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        // The following exception was thrown during execution in test generation
        try {
            double double20 = simpleRegression0.getSlopeConfidenceInterval((double) 3L);
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
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 10L);
        double double5 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 100.0f);
        double double10 = simpleRegression0.predict((double) 100L);
        double double11 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSignificance();
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
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getSumSquaredErrors();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long5 = simpleRegression4.getN();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getRegressionSumSquares();
        simpleRegression4.addData(0.0d, (-1.0d));
        double double11 = simpleRegression4.getR();
        double double13 = simpleRegression4.predict(10.0d);
        double double15 = simpleRegression4.predict(100.0d);
        double double17 = simpleRegression4.predict((double) (short) 0);
        long long18 = simpleRegression4.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression19 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long20 = simpleRegression19.getN();
        double double21 = simpleRegression19.getSumSquaredErrors();
        double double23 = simpleRegression19.predict((double) 10L);
        double double24 = simpleRegression19.getIntercept();
        double double25 = simpleRegression19.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long27 = simpleRegression26.getN();
        double double28 = simpleRegression26.getSumSquaredErrors();
        long long29 = simpleRegression26.getN();
        long long30 = simpleRegression26.getN();
        double[][] doubleArray31 = new double[][] {};
        simpleRegression26.addData(doubleArray31);
        simpleRegression19.addData(doubleArray31);
        simpleRegression4.addData(doubleArray31);
        simpleRegression0.addData(doubleArray31);
        // The following exception was thrown during execution in test generation
        try {
            double double36 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(doubleArray31);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getRSquare();
        double double3 = simpleRegression0.getTotalSumSquares();
        double double4 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long1 = simpleRegression0.getN();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getIntercept();
        double double4 = simpleRegression0.getTotalSumSquares();
        java.lang.Class<?> wildcardClass5 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}

