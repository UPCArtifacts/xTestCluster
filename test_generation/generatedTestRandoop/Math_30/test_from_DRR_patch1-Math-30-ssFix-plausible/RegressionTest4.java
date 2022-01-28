import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        double[] doubleArray15 = new double[] { 10.0d };
        double double16 = mannWhitneyUTest1.mannWhitneyU(doubleArray8, doubleArray15);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray24 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray28 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double29 = mannWhitneyUTest18.mannWhitneyU(doubleArray24, doubleArray28);
        double[] doubleArray31 = new double[] { 10.0d };
        double double32 = mannWhitneyUTest17.mannWhitneyU(doubleArray24, doubleArray31);
        double double33 = mannWhitneyUTest0.mannWhitneyU(doubleArray15, doubleArray31);
        double[] doubleArray34 = null;
        double[] doubleArray35 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double36 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray34, doubleArray35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.5d + "'", double16 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.5d + "'", double32 == 4.5d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        double[] doubleArray15 = new double[] { 10.0d };
        double double16 = mannWhitneyUTest1.mannWhitneyU(doubleArray8, doubleArray15);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray24 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray28 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double29 = mannWhitneyUTest18.mannWhitneyU(doubleArray24, doubleArray28);
        double[] doubleArray31 = new double[] { 10.0d };
        double double32 = mannWhitneyUTest17.mannWhitneyU(doubleArray24, doubleArray31);
        double double33 = mannWhitneyUTest0.mannWhitneyU(doubleArray15, doubleArray31);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest34 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest35 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray41 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray45 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double46 = mannWhitneyUTest35.mannWhitneyU(doubleArray41, doubleArray45);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest47 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray53 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray57 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double58 = mannWhitneyUTest47.mannWhitneyU(doubleArray53, doubleArray57);
        double double59 = mannWhitneyUTest34.mannWhitneyUTest(doubleArray41, doubleArray57);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest60 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray66 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray70 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double71 = mannWhitneyUTest60.mannWhitneyU(doubleArray66, doubleArray70);
        double double72 = mannWhitneyUTest0.mannWhitneyU(doubleArray41, doubleArray70);
        double[] doubleArray73 = null;
        double[] doubleArray74 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double75 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray73, doubleArray74);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.5d + "'", double16 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.5d + "'", double32 == 4.5d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.4560565402502561d + "'", double59 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        double[] doubleArray14 = new double[] { 10.0d };
        double double15 = mannWhitneyUTest0.mannWhitneyU(doubleArray7, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray22 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray26 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double27 = mannWhitneyUTest16.mannWhitneyU(doubleArray22, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        double[] doubleArray42 = new double[] { 10.0d };
        double double43 = mannWhitneyUTest28.mannWhitneyU(doubleArray35, doubleArray42);
        double double44 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray26, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray51 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray55 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double56 = mannWhitneyUTest45.mannWhitneyU(doubleArray51, doubleArray55);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray64 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray68 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double69 = mannWhitneyUTest58.mannWhitneyU(doubleArray64, doubleArray68);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest70 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray76 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray80 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double81 = mannWhitneyUTest70.mannWhitneyU(doubleArray76, doubleArray80);
        double double82 = mannWhitneyUTest57.mannWhitneyUTest(doubleArray64, doubleArray80);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest83 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray89 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray93 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double94 = mannWhitneyUTest83.mannWhitneyU(doubleArray89, doubleArray93);
        double double95 = mannWhitneyUTest45.mannWhitneyUTest(doubleArray64, doubleArray93);
        double[] doubleArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double97 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray93, doubleArray96);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5d + "'", double15 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.5d + "'", double43 == 4.5d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.4560565402502561d + "'", double44 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.4560565402502561d + "'", double82 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 10.0d + "'", double94 == 10.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.4560565402502561d + "'", double95 == 0.4560565402502561d);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray21 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray25 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double26 = mannWhitneyUTest15.mannWhitneyU(doubleArray21, doubleArray25);
        double[] doubleArray28 = new double[] { 10.0d };
        double double29 = mannWhitneyUTest14.mannWhitneyU(doubleArray21, doubleArray28);
        double double30 = mannWhitneyUTest1.mannWhitneyU(doubleArray12, doubleArray21);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray42 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double43 = mannWhitneyUTest32.mannWhitneyU(doubleArray38, doubleArray42);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray50 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray54 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double55 = mannWhitneyUTest44.mannWhitneyU(doubleArray50, doubleArray54);
        double double56 = mannWhitneyUTest31.mannWhitneyUTest(doubleArray38, doubleArray54);
        double double57 = mannWhitneyUTest0.mannWhitneyU(doubleArray12, doubleArray54);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray65 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray69 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double70 = mannWhitneyUTest59.mannWhitneyU(doubleArray65, doubleArray69);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest71 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray77 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray81 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double82 = mannWhitneyUTest71.mannWhitneyU(doubleArray77, doubleArray81);
        double double83 = mannWhitneyUTest58.mannWhitneyUTest(doubleArray65, doubleArray81);
        double[] doubleArray84 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double85 = mannWhitneyUTest0.mannWhitneyU(doubleArray65, doubleArray84);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.5d + "'", double29 == 4.5d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.4560565402502561d + "'", double56 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.5d + "'", double57 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 10.0d + "'", double82 == 10.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.4560565402502561d + "'", double83 == 0.4560565402502561d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray13 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double14 = mannWhitneyUTest3.mannWhitneyU(doubleArray9, doubleArray13);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray21 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray25 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double26 = mannWhitneyUTest15.mannWhitneyU(doubleArray21, doubleArray25);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest27 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray37 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double38 = mannWhitneyUTest27.mannWhitneyU(doubleArray33, doubleArray37);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest39 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray46 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray50 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double51 = mannWhitneyUTest40.mannWhitneyU(doubleArray46, doubleArray50);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest53 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray59 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray63 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double64 = mannWhitneyUTest53.mannWhitneyU(doubleArray59, doubleArray63);
        double[] doubleArray66 = new double[] { 10.0d };
        double double67 = mannWhitneyUTest52.mannWhitneyU(doubleArray59, doubleArray66);
        double double68 = mannWhitneyUTest39.mannWhitneyU(doubleArray50, doubleArray59);
        double double69 = mannWhitneyUTest15.mannWhitneyU(doubleArray33, doubleArray59);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest70 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray76 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray80 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double81 = mannWhitneyUTest70.mannWhitneyU(doubleArray76, doubleArray80);
        double[] doubleArray85 = new double[] { 100.0d, 10.0f, (-1L) };
        double double86 = mannWhitneyUTest15.mannWhitneyU(doubleArray80, doubleArray85);
        // The following exception was thrown during execution in test generation
        try {
            double double87 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray9, doubleArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 4.5d + "'", double67 == 4.5d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 12.5d + "'", double69 == 12.5d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 5.5d + "'", double86 == 5.5d);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray22 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double23 = mannWhitneyUTest12.mannWhitneyU(doubleArray18, doubleArray22);
        double[] doubleArray26 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double27 = mannWhitneyUTest0.mannWhitneyU(doubleArray18, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        double[] doubleArray42 = new double[] { 10.0d };
        double double43 = mannWhitneyUTest28.mannWhitneyU(doubleArray35, doubleArray42);
        double[] doubleArray47 = new double[] { (short) 10, 0.617075077451974d, (byte) 10 };
        double double48 = mannWhitneyUTest0.mannWhitneyU(doubleArray35, doubleArray47);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest49 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest50 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray56 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray60 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double61 = mannWhitneyUTest50.mannWhitneyU(doubleArray56, doubleArray60);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest62 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest63 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray69 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray73 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double74 = mannWhitneyUTest63.mannWhitneyU(doubleArray69, doubleArray73);
        double[] doubleArray76 = new double[] { 10.0d };
        double double77 = mannWhitneyUTest62.mannWhitneyU(doubleArray69, doubleArray76);
        double double78 = mannWhitneyUTest49.mannWhitneyU(doubleArray60, doubleArray69);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest79 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray85 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray89 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double90 = mannWhitneyUTest79.mannWhitneyU(doubleArray85, doubleArray89);
        double double91 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray60, doubleArray89);
        java.lang.Class<?> wildcardClass92 = doubleArray89.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6.0d + "'", double27 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.5d + "'", double43 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 0.617075077451974, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 13.0d + "'", double48 == 13.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[10.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 4.5d + "'", double77 == 4.5d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 10.0d + "'", double90 == 10.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.0d + "'", double91 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray22 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double23 = mannWhitneyUTest12.mannWhitneyU(doubleArray18, doubleArray22);
        double[] doubleArray26 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double27 = mannWhitneyUTest0.mannWhitneyU(doubleArray18, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        double[] doubleArray42 = new double[] { 10.0d };
        double double43 = mannWhitneyUTest28.mannWhitneyU(doubleArray35, doubleArray42);
        double[] doubleArray47 = new double[] { (short) 10, 0.617075077451974d, (byte) 10 };
        double double48 = mannWhitneyUTest0.mannWhitneyU(doubleArray35, doubleArray47);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest49 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest50 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray56 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray60 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double61 = mannWhitneyUTest50.mannWhitneyU(doubleArray56, doubleArray60);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest62 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest63 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray69 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray73 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double74 = mannWhitneyUTest63.mannWhitneyU(doubleArray69, doubleArray73);
        double[] doubleArray76 = new double[] { 10.0d };
        double double77 = mannWhitneyUTest62.mannWhitneyU(doubleArray69, doubleArray76);
        double double78 = mannWhitneyUTest49.mannWhitneyU(doubleArray60, doubleArray69);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest79 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray85 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray89 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double90 = mannWhitneyUTest79.mannWhitneyU(doubleArray85, doubleArray89);
        double double91 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray60, doubleArray89);
        java.lang.Class<?> wildcardClass92 = doubleArray60.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6.0d + "'", double27 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.5d + "'", double43 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 0.617075077451974, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 13.0d + "'", double48 == 13.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[10.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 4.5d + "'", double77 == 4.5d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 10.0d + "'", double90 == 10.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.0d + "'", double91 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray22 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double23 = mannWhitneyUTest12.mannWhitneyU(doubleArray18, doubleArray22);
        double[] doubleArray26 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double27 = mannWhitneyUTest0.mannWhitneyU(doubleArray18, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        double[] doubleArray42 = new double[] { 10.0d };
        double double43 = mannWhitneyUTest28.mannWhitneyU(doubleArray35, doubleArray42);
        double[] doubleArray47 = new double[] { (short) 10, 0.617075077451974d, (byte) 10 };
        double double48 = mannWhitneyUTest0.mannWhitneyU(doubleArray35, doubleArray47);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest49 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest50 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray56 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray60 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double61 = mannWhitneyUTest50.mannWhitneyU(doubleArray56, doubleArray60);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest62 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest63 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray69 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray73 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double74 = mannWhitneyUTest63.mannWhitneyU(doubleArray69, doubleArray73);
        double[] doubleArray76 = new double[] { 10.0d };
        double double77 = mannWhitneyUTest62.mannWhitneyU(doubleArray69, doubleArray76);
        double double78 = mannWhitneyUTest49.mannWhitneyU(doubleArray60, doubleArray69);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest79 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray85 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray89 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double90 = mannWhitneyUTest79.mannWhitneyU(doubleArray85, doubleArray89);
        double double91 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray60, doubleArray89);
        java.lang.Class<?> wildcardClass92 = mannWhitneyUTest0.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6.0d + "'", double27 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.5d + "'", double43 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 0.617075077451974, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 13.0d + "'", double48 == 13.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[10.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 4.5d + "'", double77 == 4.5d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 10.0d + "'", double90 == 10.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.0d + "'", double91 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray32 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray36 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double37 = mannWhitneyUTest26.mannWhitneyU(doubleArray32, doubleArray36);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray44 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray48 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double49 = mannWhitneyUTest38.mannWhitneyU(doubleArray44, doubleArray48);
        double double50 = mannWhitneyUTest25.mannWhitneyUTest(doubleArray32, doubleArray48);
        double double51 = mannWhitneyUTest1.mannWhitneyU(doubleArray23, doubleArray32);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest53 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray59 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray63 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double64 = mannWhitneyUTest53.mannWhitneyU(doubleArray59, doubleArray63);
        double[] doubleArray66 = new double[] { 10.0d };
        double double67 = mannWhitneyUTest52.mannWhitneyU(doubleArray59, doubleArray66);
        double double68 = mannWhitneyUTest0.mannWhitneyU(doubleArray23, doubleArray66);
        double[] doubleArray69 = null;
        double[] doubleArray71 = new double[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            double double72 = mannWhitneyUTest0.mannWhitneyU(doubleArray69, doubleArray71);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.4560565402502561d + "'", double50 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 4.5d + "'", double67 == 4.5d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 2.0d + "'", double68 == 2.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0]");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        double double25 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray7, doubleArray23);
        double[] doubleArray26 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest27 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray37 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double38 = mannWhitneyUTest27.mannWhitneyU(doubleArray33, doubleArray37);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest39 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray45 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray49 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double50 = mannWhitneyUTest39.mannWhitneyU(doubleArray45, doubleArray49);
        double[] doubleArray53 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double54 = mannWhitneyUTest27.mannWhitneyU(doubleArray45, doubleArray53);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest55 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest56 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray62 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray66 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double67 = mannWhitneyUTest56.mannWhitneyU(doubleArray62, doubleArray66);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest68 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest69 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray75 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray79 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double80 = mannWhitneyUTest69.mannWhitneyU(doubleArray75, doubleArray79);
        double[] doubleArray82 = new double[] { 10.0d };
        double double83 = mannWhitneyUTest68.mannWhitneyU(doubleArray75, doubleArray82);
        double double84 = mannWhitneyUTest55.mannWhitneyU(doubleArray66, doubleArray75);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest85 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray91 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray95 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double96 = mannWhitneyUTest85.mannWhitneyU(doubleArray91, doubleArray95);
        double double97 = mannWhitneyUTest27.mannWhitneyU(doubleArray66, doubleArray91);
        // The following exception was thrown during execution in test generation
        try {
            double double98 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray26, doubleArray91);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.4560565402502561d + "'", double25 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 6.0d + "'", double54 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[10.0]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 4.5d + "'", double83 == 4.5d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 10.0d + "'", double96 == 10.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 10.0d + "'", double97 == 10.0d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest6 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray12 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray16 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double17 = mannWhitneyUTest6.mannWhitneyU(doubleArray12, doubleArray16);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray24 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray28 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double29 = mannWhitneyUTest18.mannWhitneyU(doubleArray24, doubleArray28);
        double double30 = mannWhitneyUTest5.mannWhitneyUTest(doubleArray12, doubleArray28);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray42 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double43 = mannWhitneyUTest32.mannWhitneyU(doubleArray38, doubleArray42);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray51 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray55 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double56 = mannWhitneyUTest45.mannWhitneyU(doubleArray51, doubleArray55);
        double[] doubleArray58 = new double[] { 10.0d };
        double double59 = mannWhitneyUTest44.mannWhitneyU(doubleArray51, doubleArray58);
        double double60 = mannWhitneyUTest31.mannWhitneyU(doubleArray42, doubleArray51);
        double double61 = mannWhitneyUTest4.mannWhitneyUTest(doubleArray12, doubleArray51);
        double[] doubleArray64 = new double[] { (byte) 100, 12.0d };
        double double65 = mannWhitneyUTest3.mannWhitneyUTest(doubleArray51, doubleArray64);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray73 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray77 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double78 = mannWhitneyUTest67.mannWhitneyU(doubleArray73, doubleArray77);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest79 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray85 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray89 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double90 = mannWhitneyUTest79.mannWhitneyU(doubleArray85, doubleArray89);
        double double91 = mannWhitneyUTest66.mannWhitneyUTest(doubleArray73, doubleArray89);
        // The following exception was thrown during execution in test generation
        try {
            double double92 = mannWhitneyUTest2.mannWhitneyU(doubleArray64, doubleArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.4560565402502561d + "'", double30 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4.5d + "'", double59 == 4.5d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 12.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.052807511416113506d + "'", double65 == 0.052807511416113506d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 10.0d + "'", double90 == 10.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.4560565402502561d + "'", double91 == 0.4560565402502561d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        double[] doubleArray27 = new double[] { 10.0d };
        double double28 = mannWhitneyUTest13.mannWhitneyU(doubleArray20, doubleArray27);
        double double29 = mannWhitneyUTest0.mannWhitneyU(doubleArray11, doubleArray20);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray42 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double43 = mannWhitneyUTest32.mannWhitneyU(doubleArray38, doubleArray42);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray51 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray55 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double56 = mannWhitneyUTest45.mannWhitneyU(doubleArray51, doubleArray55);
        double[] doubleArray58 = new double[] { 10.0d };
        double double59 = mannWhitneyUTest44.mannWhitneyU(doubleArray51, doubleArray58);
        double double60 = mannWhitneyUTest31.mannWhitneyU(doubleArray42, doubleArray51);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest61 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest62 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray68 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray72 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double73 = mannWhitneyUTest62.mannWhitneyU(doubleArray68, doubleArray72);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest74 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray80 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray84 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double85 = mannWhitneyUTest74.mannWhitneyU(doubleArray80, doubleArray84);
        double double86 = mannWhitneyUTest61.mannWhitneyUTest(doubleArray68, doubleArray84);
        double double87 = mannWhitneyUTest30.mannWhitneyUTest(doubleArray42, doubleArray68);
        double[] doubleArray88 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double89 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray68, doubleArray88);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.5d + "'", double28 == 4.5d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4.5d + "'", double59 == 4.5d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.4560565402502561d + "'", double86 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.4560565402502561d + "'", double87 == 0.4560565402502561d);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray32 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray36 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double37 = mannWhitneyUTest26.mannWhitneyU(doubleArray32, doubleArray36);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest39 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray45 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray49 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double50 = mannWhitneyUTest39.mannWhitneyU(doubleArray45, doubleArray49);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest51 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray57 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray61 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double62 = mannWhitneyUTest51.mannWhitneyU(doubleArray57, doubleArray61);
        double double63 = mannWhitneyUTest38.mannWhitneyUTest(doubleArray45, doubleArray61);
        double double64 = mannWhitneyUTest14.mannWhitneyU(doubleArray36, doubleArray45);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest65 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray72 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray76 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double77 = mannWhitneyUTest66.mannWhitneyU(doubleArray72, doubleArray76);
        double[] doubleArray79 = new double[] { 10.0d };
        double double80 = mannWhitneyUTest65.mannWhitneyU(doubleArray72, doubleArray79);
        double double81 = mannWhitneyUTest13.mannWhitneyU(doubleArray36, doubleArray79);
        double[] doubleArray88 = new double[] { 0.0d, (-1), 4.5d, 100, 100L, (-1.0f) };
        double double89 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray79, doubleArray88);
        double[] doubleArray90 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double91 = mannWhitneyUTest0.mannWhitneyU(doubleArray79, doubleArray90);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.4560565402502561d + "'", double63 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[10.0]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 4.5d + "'", double80 == 4.5d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 2.0d + "'", double81 == 2.0d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[0.0, -1.0, 4.5, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.617075077451974d + "'", double89 == 0.617075077451974d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        double[] doubleArray3 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest6 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray12 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray16 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double17 = mannWhitneyUTest6.mannWhitneyU(doubleArray12, doubleArray16);
        double[] doubleArray19 = new double[] { 10.0d };
        double double20 = mannWhitneyUTest5.mannWhitneyU(doubleArray12, doubleArray19);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest21 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray27 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray31 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double32 = mannWhitneyUTest21.mannWhitneyU(doubleArray27, doubleArray31);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest33 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest34 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray40 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray44 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double45 = mannWhitneyUTest34.mannWhitneyU(doubleArray40, doubleArray44);
        double[] doubleArray47 = new double[] { 10.0d };
        double double48 = mannWhitneyUTest33.mannWhitneyU(doubleArray40, doubleArray47);
        double double49 = mannWhitneyUTest5.mannWhitneyUTest(doubleArray31, doubleArray40);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest50 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest51 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray57 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray61 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double62 = mannWhitneyUTest51.mannWhitneyU(doubleArray57, doubleArray61);
        double[] doubleArray64 = new double[] { 10.0d };
        double double65 = mannWhitneyUTest50.mannWhitneyU(doubleArray57, doubleArray64);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray72 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray76 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double77 = mannWhitneyUTest66.mannWhitneyU(doubleArray72, doubleArray76);
        double double78 = mannWhitneyUTest5.mannWhitneyU(doubleArray64, doubleArray72);
        double[] doubleArray82 = new double[] { (byte) -1, 0, (-1.0d) };
        double double83 = mannWhitneyUTest4.mannWhitneyUTest(doubleArray64, doubleArray82);
        // The following exception was thrown during execution in test generation
        try {
            double double84 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray3, doubleArray82);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.5d + "'", double20 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 4.5d + "'", double48 == 4.5d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.4560565402502561d + "'", double49 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 4.5d + "'", double65 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 4.5d + "'", double78 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.17971249487899976d + "'", double83 == 0.17971249487899976d);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        double[] doubleArray3 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest6 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray12 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray16 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double17 = mannWhitneyUTest6.mannWhitneyU(doubleArray12, doubleArray16);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest19 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray25 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray29 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double30 = mannWhitneyUTest19.mannWhitneyU(doubleArray25, doubleArray29);
        double[] doubleArray32 = new double[] { 10.0d };
        double double33 = mannWhitneyUTest18.mannWhitneyU(doubleArray25, doubleArray32);
        double double34 = mannWhitneyUTest5.mannWhitneyU(doubleArray16, doubleArray25);
        double[] doubleArray38 = new double[] { 0.617075077451974d, 0.617075077451974d, (short) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest39 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray46 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray50 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double51 = mannWhitneyUTest40.mannWhitneyU(doubleArray46, doubleArray50);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray58 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray62 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double63 = mannWhitneyUTest52.mannWhitneyU(doubleArray58, doubleArray62);
        double double64 = mannWhitneyUTest39.mannWhitneyUTest(doubleArray46, doubleArray62);
        double double65 = mannWhitneyUTest5.mannWhitneyU(doubleArray38, doubleArray62);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray73 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray77 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double78 = mannWhitneyUTest67.mannWhitneyU(doubleArray73, doubleArray77);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest79 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest80 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray86 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray90 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double91 = mannWhitneyUTest80.mannWhitneyU(doubleArray86, doubleArray90);
        double[] doubleArray93 = new double[] { 10.0d };
        double double94 = mannWhitneyUTest79.mannWhitneyU(doubleArray86, doubleArray93);
        double double95 = mannWhitneyUTest66.mannWhitneyU(doubleArray77, doubleArray86);
        double double96 = mannWhitneyUTest4.mannWhitneyU(doubleArray62, doubleArray86);
        // The following exception was thrown during execution in test generation
        try {
            double double97 = mannWhitneyUTest2.mannWhitneyU(doubleArray3, doubleArray86);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.5d + "'", double33 == 4.5d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.617075077451974, 0.617075077451974, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.4560565402502561d + "'", double64 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 6.5d + "'", double65 == 6.5d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 10.0d + "'", double91 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[10.0]");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 4.5d + "'", double94 == 4.5d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 10.0d + "'", double95 == 10.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 10.0d + "'", double96 == 10.0d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        double[] doubleArray26 = new double[] { 10.0d };
        double double27 = mannWhitneyUTest12.mannWhitneyU(doubleArray19, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray34 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray38 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double39 = mannWhitneyUTest28.mannWhitneyU(doubleArray34, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray46 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray50 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double51 = mannWhitneyUTest40.mannWhitneyU(doubleArray46, doubleArray50);
        double[] doubleArray54 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double55 = mannWhitneyUTest28.mannWhitneyU(doubleArray46, doubleArray54);
        double double56 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray19, doubleArray46);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray65 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray69 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double70 = mannWhitneyUTest59.mannWhitneyU(doubleArray65, doubleArray69);
        double[] doubleArray72 = new double[] { 10.0d };
        double double73 = mannWhitneyUTest58.mannWhitneyU(doubleArray65, doubleArray72);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest74 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest75 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray81 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray85 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double86 = mannWhitneyUTest75.mannWhitneyU(doubleArray81, doubleArray85);
        double[] doubleArray88 = new double[] { 10.0d };
        double double89 = mannWhitneyUTest74.mannWhitneyU(doubleArray81, doubleArray88);
        double double90 = mannWhitneyUTest57.mannWhitneyU(doubleArray72, doubleArray88);
        double[] doubleArray91 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double92 = mannWhitneyUTest0.mannWhitneyU(doubleArray88, doubleArray91);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.5d + "'", double27 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 6.0d + "'", double55 == 6.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 4.5d + "'", double73 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[10.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 4.5d + "'", double89 == 4.5d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.5d + "'", double90 == 0.5d);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        double[] doubleArray3 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest6 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray12 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray16 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double17 = mannWhitneyUTest6.mannWhitneyU(doubleArray12, doubleArray16);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray24 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray28 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double29 = mannWhitneyUTest18.mannWhitneyU(doubleArray24, doubleArray28);
        double double30 = mannWhitneyUTest5.mannWhitneyUTest(doubleArray12, doubleArray28);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray37 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray41 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double42 = mannWhitneyUTest31.mannWhitneyU(doubleArray37, doubleArray41);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest43 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray50 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray54 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double55 = mannWhitneyUTest44.mannWhitneyU(doubleArray50, doubleArray54);
        double[] doubleArray57 = new double[] { 10.0d };
        double double58 = mannWhitneyUTest43.mannWhitneyU(doubleArray50, doubleArray57);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray65 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray69 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double70 = mannWhitneyUTest59.mannWhitneyU(doubleArray65, doubleArray69);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest71 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray77 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray81 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double82 = mannWhitneyUTest71.mannWhitneyU(doubleArray77, doubleArray81);
        double[] doubleArray85 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double86 = mannWhitneyUTest59.mannWhitneyU(doubleArray77, doubleArray85);
        double double87 = mannWhitneyUTest31.mannWhitneyUTest(doubleArray50, doubleArray77);
        double double88 = mannWhitneyUTest4.mannWhitneyU(doubleArray12, doubleArray77);
        // The following exception was thrown during execution in test generation
        try {
            double double89 = mannWhitneyUTest2.mannWhitneyU(doubleArray3, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.4560565402502561d + "'", double30 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 4.5d + "'", double58 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 10.0d + "'", double82 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 6.0d + "'", double86 == 6.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 1.0d + "'", double87 == 1.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 12.5d + "'", double88 == 12.5d);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray13 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double14 = mannWhitneyUTest3.mannWhitneyU(doubleArray9, doubleArray13);
        double[] doubleArray16 = new double[] { 10.0d };
        double double17 = mannWhitneyUTest2.mannWhitneyU(doubleArray9, doubleArray16);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest19 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray25 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray29 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double30 = mannWhitneyUTest19.mannWhitneyU(doubleArray25, doubleArray29);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray37 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray41 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double42 = mannWhitneyUTest31.mannWhitneyU(doubleArray37, doubleArray41);
        double double43 = mannWhitneyUTest18.mannWhitneyUTest(doubleArray25, doubleArray41);
        double double44 = mannWhitneyUTest1.mannWhitneyU(doubleArray16, doubleArray25);
        double[] doubleArray45 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double46 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray16, doubleArray45);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.5d + "'", double17 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.4560565402502561d + "'", double43 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 4.5d + "'", double44 == 4.5d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray13 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double14 = mannWhitneyUTest3.mannWhitneyU(doubleArray9, doubleArray13);
        double[] doubleArray16 = new double[] { 10.0d };
        double double17 = mannWhitneyUTest2.mannWhitneyU(doubleArray9, doubleArray16);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest19 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray25 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray29 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double30 = mannWhitneyUTest19.mannWhitneyU(doubleArray25, doubleArray29);
        double[] doubleArray32 = new double[] { 10.0d };
        double double33 = mannWhitneyUTest18.mannWhitneyU(doubleArray25, doubleArray32);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest34 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray40 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray44 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double45 = mannWhitneyUTest34.mannWhitneyU(doubleArray40, doubleArray44);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest47 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray53 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray57 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double58 = mannWhitneyUTest47.mannWhitneyU(doubleArray53, doubleArray57);
        double[] doubleArray60 = new double[] { 10.0d };
        double double61 = mannWhitneyUTest46.mannWhitneyU(doubleArray53, doubleArray60);
        double double62 = mannWhitneyUTest18.mannWhitneyUTest(doubleArray44, doubleArray53);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest63 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest64 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray70 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray74 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double75 = mannWhitneyUTest64.mannWhitneyU(doubleArray70, doubleArray74);
        double[] doubleArray77 = new double[] { 10.0d };
        double double78 = mannWhitneyUTest63.mannWhitneyU(doubleArray70, doubleArray77);
        double double79 = mannWhitneyUTest2.mannWhitneyU(doubleArray53, doubleArray77);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest80 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest81 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray87 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray91 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double92 = mannWhitneyUTest81.mannWhitneyU(doubleArray87, doubleArray91);
        double[] doubleArray94 = new double[] { 10.0d };
        double double95 = mannWhitneyUTest80.mannWhitneyU(doubleArray87, doubleArray94);
        double double96 = mannWhitneyUTest1.mannWhitneyU(doubleArray77, doubleArray94);
        double[] doubleArray97 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double98 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray94, doubleArray97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.5d + "'", double17 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.5d + "'", double33 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 4.5d + "'", double61 == 4.5d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.4560565402502561d + "'", double62 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[10.0]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 4.5d + "'", double78 == 4.5d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 4.5d + "'", double79 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 10.0d + "'", double92 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[10.0]");
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 4.5d + "'", double95 == 4.5d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.5d + "'", double96 == 0.5d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        double[] doubleArray15 = new double[] { 10.0d };
        double double16 = mannWhitneyUTest1.mannWhitneyU(doubleArray8, doubleArray15);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray24 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray28 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double29 = mannWhitneyUTest18.mannWhitneyU(doubleArray24, doubleArray28);
        double[] doubleArray31 = new double[] { 10.0d };
        double double32 = mannWhitneyUTest17.mannWhitneyU(doubleArray24, doubleArray31);
        double double33 = mannWhitneyUTest0.mannWhitneyU(doubleArray15, doubleArray31);
        double[] doubleArray34 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest35 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray41 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray45 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double46 = mannWhitneyUTest35.mannWhitneyU(doubleArray41, doubleArray45);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest47 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest48 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray54 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray58 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double59 = mannWhitneyUTest48.mannWhitneyU(doubleArray54, doubleArray58);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest60 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray66 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray70 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double71 = mannWhitneyUTest60.mannWhitneyU(doubleArray66, doubleArray70);
        double double72 = mannWhitneyUTest47.mannWhitneyUTest(doubleArray54, doubleArray70);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest73 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray79 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray83 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double84 = mannWhitneyUTest73.mannWhitneyU(doubleArray79, doubleArray83);
        double double85 = mannWhitneyUTest35.mannWhitneyUTest(doubleArray54, doubleArray83);
        // The following exception was thrown during execution in test generation
        try {
            double double86 = mannWhitneyUTest0.mannWhitneyU(doubleArray34, doubleArray54);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.5d + "'", double16 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.5d + "'", double32 == 4.5d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.4560565402502561d + "'", double72 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.4560565402502561d + "'", double85 == 0.4560565402502561d);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        double[] doubleArray14 = new double[] { 10.0d };
        double double15 = mannWhitneyUTest0.mannWhitneyU(doubleArray7, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray23 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray27 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double28 = mannWhitneyUTest17.mannWhitneyU(doubleArray23, doubleArray27);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        double double41 = mannWhitneyUTest16.mannWhitneyUTest(doubleArray23, doubleArray39);
        double[] doubleArray46 = new double[] { (short) 1, 10.0f, 0.06619257972219339d, (byte) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest47 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray53 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray57 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double58 = mannWhitneyUTest47.mannWhitneyU(doubleArray53, doubleArray57);
        double double59 = mannWhitneyUTest16.mannWhitneyU(doubleArray46, doubleArray53);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest60 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray66 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray70 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double71 = mannWhitneyUTest60.mannWhitneyU(doubleArray66, doubleArray70);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest72 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest73 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray79 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray83 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double84 = mannWhitneyUTest73.mannWhitneyU(doubleArray79, doubleArray83);
        double[] doubleArray86 = new double[] { 10.0d };
        double double87 = mannWhitneyUTest72.mannWhitneyU(doubleArray79, doubleArray86);
        double double88 = mannWhitneyUTest16.mannWhitneyU(doubleArray70, doubleArray79);
        double[] doubleArray89 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double90 = mannWhitneyUTest0.mannWhitneyU(doubleArray79, doubleArray89);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5d + "'", double15 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.4560565402502561d + "'", double41 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 10.0, 0.06619257972219339, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 17.5d + "'", double59 == 17.5d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[10.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 4.5d + "'", double87 == 4.5d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 10.0d + "'", double88 == 10.0d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray10 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray14 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double15 = mannWhitneyUTest4.mannWhitneyU(doubleArray10, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray22 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray26 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double27 = mannWhitneyUTest16.mannWhitneyU(doubleArray22, doubleArray26);
        double double28 = mannWhitneyUTest3.mannWhitneyUTest(doubleArray10, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray36 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray40 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double41 = mannWhitneyUTest30.mannWhitneyU(doubleArray36, doubleArray40);
        double[] doubleArray43 = new double[] { 10.0d };
        double double44 = mannWhitneyUTest29.mannWhitneyU(doubleArray36, doubleArray43);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray51 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray55 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double56 = mannWhitneyUTest45.mannWhitneyU(doubleArray51, doubleArray55);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray64 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray68 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double69 = mannWhitneyUTest58.mannWhitneyU(doubleArray64, doubleArray68);
        double[] doubleArray71 = new double[] { 10.0d };
        double double72 = mannWhitneyUTest57.mannWhitneyU(doubleArray64, doubleArray71);
        double double73 = mannWhitneyUTest29.mannWhitneyUTest(doubleArray55, doubleArray64);
        double double74 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray10, doubleArray64);
        // The following exception was thrown during execution in test generation
        try {
            double double75 = mannWhitneyUTest0.mannWhitneyU(doubleArray1, doubleArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.4560565402502561d + "'", double28 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 4.5d + "'", double44 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[10.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 4.5d + "'", double72 == 4.5d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.4560565402502561d + "'", double73 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        double[] doubleArray27 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double28 = mannWhitneyUTest1.mannWhitneyU(doubleArray19, doubleArray27);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray36 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray40 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double41 = mannWhitneyUTest30.mannWhitneyU(doubleArray36, doubleArray40);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest42 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray48 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray52 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double53 = mannWhitneyUTest42.mannWhitneyU(doubleArray48, doubleArray52);
        double double54 = mannWhitneyUTest29.mannWhitneyUTest(doubleArray36, doubleArray52);
        double double55 = mannWhitneyUTest0.mannWhitneyU(doubleArray27, doubleArray52);
        double[] doubleArray56 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray64 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray68 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double69 = mannWhitneyUTest58.mannWhitneyU(doubleArray64, doubleArray68);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest70 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray76 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray80 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double81 = mannWhitneyUTest70.mannWhitneyU(doubleArray76, doubleArray80);
        double double82 = mannWhitneyUTest57.mannWhitneyUTest(doubleArray64, doubleArray80);
        // The following exception was thrown during execution in test generation
        try {
            double double83 = mannWhitneyUTest0.mannWhitneyU(doubleArray56, doubleArray64);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 6.0d + "'", double28 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.4560565402502561d + "'", double54 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 3.0d + "'", double55 == 3.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.4560565402502561d + "'", double82 == 0.4560565402502561d);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        double[] doubleArray14 = new double[] { 10.0d };
        double double15 = mannWhitneyUTest0.mannWhitneyU(doubleArray7, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray22 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray26 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double27 = mannWhitneyUTest16.mannWhitneyU(doubleArray22, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        double[] doubleArray42 = new double[] { 10.0d };
        double double43 = mannWhitneyUTest28.mannWhitneyU(doubleArray35, doubleArray42);
        double double44 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray26, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray51 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray55 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double56 = mannWhitneyUTest45.mannWhitneyU(doubleArray51, doubleArray55);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray63 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray67 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double68 = mannWhitneyUTest57.mannWhitneyU(doubleArray63, doubleArray67);
        double[] doubleArray71 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double72 = mannWhitneyUTest45.mannWhitneyU(doubleArray63, doubleArray71);
        double[] doubleArray73 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double74 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray71, doubleArray73);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5d + "'", double15 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.5d + "'", double43 == 4.5d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.4560565402502561d + "'", double44 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 6.0d + "'", double72 == 6.0d);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray21 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray25 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double26 = mannWhitneyUTest15.mannWhitneyU(doubleArray21, doubleArray25);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest27 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray34 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray38 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double39 = mannWhitneyUTest28.mannWhitneyU(doubleArray34, doubleArray38);
        double[] doubleArray41 = new double[] { 10.0d };
        double double42 = mannWhitneyUTest27.mannWhitneyU(doubleArray34, doubleArray41);
        double double43 = mannWhitneyUTest14.mannWhitneyU(doubleArray25, doubleArray34);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray51 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray55 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double56 = mannWhitneyUTest45.mannWhitneyU(doubleArray51, doubleArray55);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray63 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray67 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double68 = mannWhitneyUTest57.mannWhitneyU(doubleArray63, doubleArray67);
        double double69 = mannWhitneyUTest44.mannWhitneyUTest(doubleArray51, doubleArray67);
        double double70 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray25, doubleArray51);
        double double71 = mannWhitneyUTest0.mannWhitneyU(doubleArray11, doubleArray51);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest72 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest73 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray79 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray83 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double84 = mannWhitneyUTest73.mannWhitneyU(doubleArray79, doubleArray83);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest85 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray91 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray95 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double96 = mannWhitneyUTest85.mannWhitneyU(doubleArray91, doubleArray95);
        double double97 = mannWhitneyUTest72.mannWhitneyUTest(doubleArray79, doubleArray95);
        double[] doubleArray98 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double99 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray79, doubleArray98);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4.5d + "'", double42 == 4.5d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.4560565402502561d + "'", double69 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.4560565402502561d + "'", double70 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 10.0d + "'", double96 == 10.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.4560565402502561d + "'", double97 == 0.4560565402502561d);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        double[] doubleArray14 = new double[] { 10.0d };
        double double15 = mannWhitneyUTest0.mannWhitneyU(doubleArray7, doubleArray14);
        double[] doubleArray20 = new double[] { 6.5d, (short) 1, 100, 0.06619257972219339d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest21 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest22 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest23 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray29 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray33 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double34 = mannWhitneyUTest23.mannWhitneyU(doubleArray29, doubleArray33);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest35 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest36 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray42 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray46 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double47 = mannWhitneyUTest36.mannWhitneyU(doubleArray42, doubleArray46);
        double[] doubleArray49 = new double[] { 10.0d };
        double double50 = mannWhitneyUTest35.mannWhitneyU(doubleArray42, doubleArray49);
        double double51 = mannWhitneyUTest22.mannWhitneyU(doubleArray33, doubleArray42);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray58 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray62 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double63 = mannWhitneyUTest52.mannWhitneyU(doubleArray58, doubleArray62);
        double double64 = mannWhitneyUTest21.mannWhitneyUTest(doubleArray33, doubleArray58);
        double double65 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray20, doubleArray58);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray73 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray77 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double78 = mannWhitneyUTest67.mannWhitneyU(doubleArray73, doubleArray77);
        double[] doubleArray80 = new double[] { 10.0d };
        double double81 = mannWhitneyUTest66.mannWhitneyU(doubleArray73, doubleArray80);
        double[] doubleArray82 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double83 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray80, doubleArray82);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5d + "'", double15 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[6.5, 1.0, 100.0, 0.06619257972219339]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4.5d + "'", double50 == 4.5d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.4560565402502561d + "'", double64 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.08641073297370006d + "'", double65 == 0.08641073297370006d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[10.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 4.5d + "'", double81 == 4.5d);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray31 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray35 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double36 = mannWhitneyUTest25.mannWhitneyU(doubleArray31, doubleArray35);
        double[] doubleArray39 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double40 = mannWhitneyUTest13.mannWhitneyU(doubleArray31, doubleArray39);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest41 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest42 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray48 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray52 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double53 = mannWhitneyUTest42.mannWhitneyU(doubleArray48, doubleArray52);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray60 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray64 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double65 = mannWhitneyUTest54.mannWhitneyU(doubleArray60, doubleArray64);
        double double66 = mannWhitneyUTest41.mannWhitneyUTest(doubleArray48, doubleArray64);
        double double67 = mannWhitneyUTest12.mannWhitneyU(doubleArray39, doubleArray64);
        double[] doubleArray72 = new double[] { 4.5d, 10.5d, 0.17971249487899976d, (byte) 0 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest73 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray79 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray83 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double84 = mannWhitneyUTest73.mannWhitneyU(doubleArray79, doubleArray83);
        double double85 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray72, doubleArray79);
        double[] doubleArray86 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double87 = mannWhitneyUTest0.mannWhitneyU(doubleArray72, doubleArray86);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 6.0d + "'", double40 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.4560565402502561d + "'", double66 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 3.0d + "'", double67 == 3.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[4.5, 10.5, 0.17971249487899976, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.22067136191984704d + "'", double85 == 0.22067136191984704d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray13 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double14 = mannWhitneyUTest3.mannWhitneyU(doubleArray9, doubleArray13);
        double[] doubleArray16 = new double[] { 10.0d };
        double double17 = mannWhitneyUTest2.mannWhitneyU(doubleArray9, doubleArray16);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray24 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray28 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double29 = mannWhitneyUTest18.mannWhitneyU(doubleArray24, doubleArray28);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray37 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray41 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double42 = mannWhitneyUTest31.mannWhitneyU(doubleArray37, doubleArray41);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest43 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray50 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray54 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double55 = mannWhitneyUTest44.mannWhitneyU(doubleArray50, doubleArray54);
        double[] doubleArray57 = new double[] { 10.0d };
        double double58 = mannWhitneyUTest43.mannWhitneyU(doubleArray50, doubleArray57);
        double double59 = mannWhitneyUTest30.mannWhitneyU(doubleArray41, doubleArray50);
        double[] doubleArray66 = new double[] { ' ', 10.5d, 0.31731050786291404d, 10, 100.0d, '#' };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest68 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray74 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray78 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double79 = mannWhitneyUTest68.mannWhitneyU(doubleArray74, doubleArray78);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest80 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray86 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray90 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double91 = mannWhitneyUTest80.mannWhitneyU(doubleArray86, doubleArray90);
        double double92 = mannWhitneyUTest67.mannWhitneyUTest(doubleArray74, doubleArray90);
        double double93 = mannWhitneyUTest30.mannWhitneyU(doubleArray66, doubleArray90);
        double double94 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray24, doubleArray66);
        // The following exception was thrown during execution in test generation
        try {
            double double95 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray1, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.5d + "'", double17 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 4.5d + "'", double58 == 4.5d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[32.0, 10.5, 0.31731050786291404, 10.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 10.0d + "'", double91 == 10.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.4560565402502561d + "'", double92 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 12.5d + "'", double93 == 12.5d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.01371083007813323d + "'", double94 == 0.01371083007813323d);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        double[] doubleArray28 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double29 = mannWhitneyUTest2.mannWhitneyU(doubleArray20, doubleArray28);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray37 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray41 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double42 = mannWhitneyUTest31.mannWhitneyU(doubleArray37, doubleArray41);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest43 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray49 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray53 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double54 = mannWhitneyUTest43.mannWhitneyU(doubleArray49, doubleArray53);
        double double55 = mannWhitneyUTest30.mannWhitneyUTest(doubleArray37, doubleArray53);
        double double56 = mannWhitneyUTest1.mannWhitneyU(doubleArray28, doubleArray53);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray63 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray67 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double68 = mannWhitneyUTest57.mannWhitneyU(doubleArray63, doubleArray67);
        double double69 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray28, doubleArray67);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest70 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest71 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray77 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray81 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double82 = mannWhitneyUTest71.mannWhitneyU(doubleArray77, doubleArray81);
        double[] doubleArray84 = new double[] { 10.0d };
        double double85 = mannWhitneyUTest70.mannWhitneyU(doubleArray77, doubleArray84);
        double[] doubleArray86 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double87 = mannWhitneyUTest0.mannWhitneyU(doubleArray77, doubleArray86);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 6.0d + "'", double29 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.4560565402502561d + "'", double55 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 3.0d + "'", double56 == 3.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 10.0d + "'", double82 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[10.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 4.5d + "'", double85 == 4.5d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray13 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double14 = mannWhitneyUTest3.mannWhitneyU(doubleArray9, doubleArray13);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray21 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray25 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double26 = mannWhitneyUTest15.mannWhitneyU(doubleArray21, doubleArray25);
        double double27 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray9, doubleArray25);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest41 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest42 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray48 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray52 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double53 = mannWhitneyUTest42.mannWhitneyU(doubleArray48, doubleArray52);
        double[] doubleArray55 = new double[] { 10.0d };
        double double56 = mannWhitneyUTest41.mannWhitneyU(doubleArray48, doubleArray55);
        double double57 = mannWhitneyUTest28.mannWhitneyU(doubleArray39, doubleArray48);
        double double58 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray9, doubleArray48);
        double[] doubleArray61 = new double[] { (byte) 100, 12.0d };
        double double62 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray48, doubleArray61);
        double[] doubleArray63 = null;
        double[] doubleArray64 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double65 = mannWhitneyUTest0.mannWhitneyU(doubleArray63, doubleArray64);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.4560565402502561d + "'", double27 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 4.5d + "'", double56 == 4.5d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 12.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.052807511416113506d + "'", double62 == 0.052807511416113506d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray13 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double14 = mannWhitneyUTest3.mannWhitneyU(doubleArray9, doubleArray13);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray22 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray26 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double27 = mannWhitneyUTest16.mannWhitneyU(doubleArray22, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        double[] doubleArray42 = new double[] { 10.0d };
        double double43 = mannWhitneyUTest28.mannWhitneyU(doubleArray35, doubleArray42);
        double double44 = mannWhitneyUTest15.mannWhitneyU(doubleArray26, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray51 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray55 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double56 = mannWhitneyUTest45.mannWhitneyU(doubleArray51, doubleArray55);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray63 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray67 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double68 = mannWhitneyUTest57.mannWhitneyU(doubleArray63, doubleArray67);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest69 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest70 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray76 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray80 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double81 = mannWhitneyUTest70.mannWhitneyU(doubleArray76, doubleArray80);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest82 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray88 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray92 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double93 = mannWhitneyUTest82.mannWhitneyU(doubleArray88, doubleArray92);
        double double94 = mannWhitneyUTest69.mannWhitneyUTest(doubleArray76, doubleArray92);
        double double95 = mannWhitneyUTest45.mannWhitneyU(doubleArray67, doubleArray76);
        double double96 = mannWhitneyUTest3.mannWhitneyU(doubleArray35, doubleArray67);
        double[] doubleArray97 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double98 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray35, doubleArray97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.5d + "'", double43 == 4.5d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 10.0d + "'", double93 == 10.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.4560565402502561d + "'", double94 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 10.0d + "'", double95 == 10.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 10.0d + "'", double96 == 10.0d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray22 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double23 = mannWhitneyUTest12.mannWhitneyU(doubleArray18, doubleArray22);
        double[] doubleArray26 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double27 = mannWhitneyUTest0.mannWhitneyU(doubleArray18, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest41 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray47 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray51 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double52 = mannWhitneyUTest41.mannWhitneyU(doubleArray47, doubleArray51);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest53 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray60 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray64 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double65 = mannWhitneyUTest54.mannWhitneyU(doubleArray60, doubleArray64);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray72 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray76 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double77 = mannWhitneyUTest66.mannWhitneyU(doubleArray72, doubleArray76);
        double double78 = mannWhitneyUTest53.mannWhitneyUTest(doubleArray60, doubleArray76);
        double double79 = mannWhitneyUTest29.mannWhitneyU(doubleArray51, doubleArray60);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest80 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray86 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray90 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double91 = mannWhitneyUTest80.mannWhitneyU(doubleArray86, doubleArray90);
        double double92 = mannWhitneyUTest28.mannWhitneyU(doubleArray51, doubleArray90);
        double[] doubleArray93 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double94 = mannWhitneyUTest0.mannWhitneyU(doubleArray90, doubleArray93);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6.0d + "'", double27 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.4560565402502561d + "'", double78 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 10.0d + "'", double91 == 10.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 4.5d + "'", double92 == 4.5d);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        double[] doubleArray28 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double29 = mannWhitneyUTest2.mannWhitneyU(doubleArray20, doubleArray28);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray37 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray41 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double42 = mannWhitneyUTest31.mannWhitneyU(doubleArray37, doubleArray41);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest43 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray49 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray53 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double54 = mannWhitneyUTest43.mannWhitneyU(doubleArray49, doubleArray53);
        double double55 = mannWhitneyUTest30.mannWhitneyUTest(doubleArray37, doubleArray53);
        double double56 = mannWhitneyUTest1.mannWhitneyU(doubleArray28, doubleArray53);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray63 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray67 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double68 = mannWhitneyUTest57.mannWhitneyU(doubleArray63, doubleArray67);
        double double69 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray28, doubleArray67);
        double[] doubleArray70 = null;
        double[] doubleArray71 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double72 = mannWhitneyUTest0.mannWhitneyU(doubleArray70, doubleArray71);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 6.0d + "'", double29 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.4560565402502561d + "'", double55 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 3.0d + "'", double56 == 3.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        double[] doubleArray14 = new double[] { 10.0d };
        double double15 = mannWhitneyUTest0.mannWhitneyU(doubleArray7, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray22 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray26 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double27 = mannWhitneyUTest16.mannWhitneyU(doubleArray22, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray34 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray38 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double39 = mannWhitneyUTest28.mannWhitneyU(doubleArray34, doubleArray38);
        double[] doubleArray42 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double43 = mannWhitneyUTest16.mannWhitneyU(doubleArray34, doubleArray42);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray51 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray55 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double56 = mannWhitneyUTest45.mannWhitneyU(doubleArray51, doubleArray55);
        double[] doubleArray58 = new double[] { 10.0d };
        double double59 = mannWhitneyUTest44.mannWhitneyU(doubleArray51, doubleArray58);
        double[] doubleArray63 = new double[] { (short) 10, 0.617075077451974d, (byte) 10 };
        double double64 = mannWhitneyUTest16.mannWhitneyU(doubleArray51, doubleArray63);
        double[] doubleArray65 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double66 = mannWhitneyUTest0.mannWhitneyU(doubleArray63, doubleArray65);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5d + "'", double15 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 6.0d + "'", double43 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4.5d + "'", double59 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 0.617075077451974, 10.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 13.0d + "'", double64 == 13.0d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        double[] doubleArray14 = new double[] { 10.0d };
        double double15 = mannWhitneyUTest0.mannWhitneyU(doubleArray7, doubleArray14);
        double[] doubleArray16 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray23 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray27 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double28 = mannWhitneyUTest17.mannWhitneyU(doubleArray23, doubleArray27);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray36 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray40 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double41 = mannWhitneyUTest30.mannWhitneyU(doubleArray36, doubleArray40);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest42 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest43 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray49 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray53 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double54 = mannWhitneyUTest43.mannWhitneyU(doubleArray49, doubleArray53);
        double[] doubleArray56 = new double[] { 10.0d };
        double double57 = mannWhitneyUTest42.mannWhitneyU(doubleArray49, doubleArray56);
        double double58 = mannWhitneyUTest29.mannWhitneyU(doubleArray40, doubleArray49);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray65 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray69 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double70 = mannWhitneyUTest59.mannWhitneyU(doubleArray65, doubleArray69);
        double double71 = mannWhitneyUTest17.mannWhitneyUTest(doubleArray49, doubleArray69);
        // The following exception was thrown during execution in test generation
        try {
            double double72 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray16, doubleArray49);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5d + "'", double15 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.5d + "'", double57 == 4.5d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.4560565402502561d + "'", double71 == 0.4560565402502561d);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        double[] doubleArray15 = new double[] { 10.0d };
        double double16 = mannWhitneyUTest1.mannWhitneyU(doubleArray8, doubleArray15);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray24 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray28 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double29 = mannWhitneyUTest18.mannWhitneyU(doubleArray24, doubleArray28);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray36 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray40 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double41 = mannWhitneyUTest30.mannWhitneyU(doubleArray36, doubleArray40);
        double double42 = mannWhitneyUTest17.mannWhitneyUTest(doubleArray24, doubleArray40);
        double double43 = mannWhitneyUTest0.mannWhitneyU(doubleArray15, doubleArray24);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray50 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray54 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double55 = mannWhitneyUTest44.mannWhitneyU(doubleArray50, doubleArray54);
        double[] doubleArray61 = new double[] { 10L, (-1L), 0.617075077451974d, 0.052807511416113506d, ' ' };
        double double62 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray54, doubleArray61);
        double[] doubleArray63 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest64 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest65 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray71 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray75 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double76 = mannWhitneyUTest65.mannWhitneyU(doubleArray71, doubleArray75);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest77 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest78 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray84 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray88 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double89 = mannWhitneyUTest78.mannWhitneyU(doubleArray84, doubleArray88);
        double[] doubleArray91 = new double[] { 10.0d };
        double double92 = mannWhitneyUTest77.mannWhitneyU(doubleArray84, doubleArray91);
        double double93 = mannWhitneyUTest64.mannWhitneyU(doubleArray75, doubleArray84);
        // The following exception was thrown during execution in test generation
        try {
            double double94 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray63, doubleArray84);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.5d + "'", double16 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.4560565402502561d + "'", double42 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.5d + "'", double43 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, -1.0, 0.617075077451974, 0.052807511416113506, 32.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.6547208460185768d + "'", double62 == 0.6547208460185768d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 10.0d + "'", double76 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 10.0d + "'", double89 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[10.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 4.5d + "'", double92 == 4.5d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 10.0d + "'", double93 == 10.0d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray22 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double23 = mannWhitneyUTest12.mannWhitneyU(doubleArray18, doubleArray22);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest24 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray31 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray35 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double36 = mannWhitneyUTest25.mannWhitneyU(doubleArray31, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray44 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray48 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double49 = mannWhitneyUTest38.mannWhitneyU(doubleArray44, doubleArray48);
        double[] doubleArray51 = new double[] { 10.0d };
        double double52 = mannWhitneyUTest37.mannWhitneyU(doubleArray44, doubleArray51);
        double double53 = mannWhitneyUTest24.mannWhitneyU(doubleArray35, doubleArray44);
        double double54 = mannWhitneyUTest0.mannWhitneyU(doubleArray18, doubleArray44);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest55 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray61 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray65 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double66 = mannWhitneyUTest55.mannWhitneyU(doubleArray61, doubleArray65);
        double[] doubleArray70 = new double[] { 100.0d, 10.0f, (-1L) };
        double double71 = mannWhitneyUTest0.mannWhitneyU(doubleArray65, doubleArray70);
        double[] doubleArray72 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest73 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray79 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray83 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double84 = mannWhitneyUTest73.mannWhitneyU(doubleArray79, doubleArray83);
        // The following exception was thrown during execution in test generation
        try {
            double double85 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray72, doubleArray83);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 4.5d + "'", double52 == 4.5d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 12.5d + "'", double54 == 12.5d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 5.5d + "'", double71 == 5.5d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        double[] doubleArray28 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double29 = mannWhitneyUTest2.mannWhitneyU(doubleArray20, doubleArray28);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray37 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray41 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double42 = mannWhitneyUTest31.mannWhitneyU(doubleArray37, doubleArray41);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest43 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray49 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray53 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double54 = mannWhitneyUTest43.mannWhitneyU(doubleArray49, doubleArray53);
        double double55 = mannWhitneyUTest30.mannWhitneyUTest(doubleArray37, doubleArray53);
        double double56 = mannWhitneyUTest1.mannWhitneyU(doubleArray28, doubleArray53);
        double[] doubleArray57 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double58 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray53, doubleArray57);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 6.0d + "'", double29 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.4560565402502561d + "'", double55 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 3.0d + "'", double56 == 3.0d);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray13 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double14 = mannWhitneyUTest3.mannWhitneyU(doubleArray9, doubleArray13);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray21 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray25 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double26 = mannWhitneyUTest15.mannWhitneyU(doubleArray21, doubleArray25);
        double double27 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray9, doubleArray25);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        double[] doubleArray42 = new double[] { 10.0d };
        double double43 = mannWhitneyUTest28.mannWhitneyU(doubleArray35, doubleArray42);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray50 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray54 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double55 = mannWhitneyUTest44.mannWhitneyU(doubleArray50, doubleArray54);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest56 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray63 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray67 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double68 = mannWhitneyUTest57.mannWhitneyU(doubleArray63, doubleArray67);
        double[] doubleArray70 = new double[] { 10.0d };
        double double71 = mannWhitneyUTest56.mannWhitneyU(doubleArray63, doubleArray70);
        double double72 = mannWhitneyUTest28.mannWhitneyUTest(doubleArray54, doubleArray63);
        double double73 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray9, doubleArray63);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest74 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray80 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray84 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double85 = mannWhitneyUTest74.mannWhitneyU(doubleArray80, doubleArray84);
        double double86 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray9, doubleArray80);
        double[] doubleArray91 = new double[] { 1L, 100.0d, '4', 0.4385780260809997d };
        double[] doubleArray92 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double93 = mannWhitneyUTest0.mannWhitneyU(doubleArray91, doubleArray92);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.4560565402502561d + "'", double27 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.5d + "'", double43 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[10.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 4.5d + "'", double71 == 4.5d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.4560565402502561d + "'", double72 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1.0d + "'", double73 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 1.0d + "'", double86 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[1.0, 100.0, 52.0, 0.4385780260809997]");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        double[] doubleArray12 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray32 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray36 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double37 = mannWhitneyUTest26.mannWhitneyU(doubleArray32, doubleArray36);
        double double38 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray20, doubleArray36);
        double[] doubleArray43 = new double[] { (short) 1, 10.0f, 0.06619257972219339d, (byte) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray50 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray54 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double55 = mannWhitneyUTest44.mannWhitneyU(doubleArray50, doubleArray54);
        double double56 = mannWhitneyUTest13.mannWhitneyU(doubleArray43, doubleArray50);
        // The following exception was thrown during execution in test generation
        try {
            double double57 = mannWhitneyUTest0.mannWhitneyU(doubleArray12, doubleArray50);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.4560565402502561d + "'", double38 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 10.0, 0.06619257972219339, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 17.5d + "'", double56 == 17.5d);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        double[] doubleArray3 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest6 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray12 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray16 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double17 = mannWhitneyUTest6.mannWhitneyU(doubleArray12, doubleArray16);
        double[] doubleArray19 = new double[] { 10.0d };
        double double20 = mannWhitneyUTest5.mannWhitneyU(doubleArray12, doubleArray19);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest21 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest22 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray28 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray32 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double33 = mannWhitneyUTest22.mannWhitneyU(doubleArray28, doubleArray32);
        double[] doubleArray35 = new double[] { 10.0d };
        double double36 = mannWhitneyUTest21.mannWhitneyU(doubleArray28, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray44 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray48 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double49 = mannWhitneyUTest38.mannWhitneyU(doubleArray44, doubleArray48);
        double[] doubleArray51 = new double[] { 10.0d };
        double double52 = mannWhitneyUTest37.mannWhitneyU(doubleArray44, doubleArray51);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest53 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray59 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray63 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double64 = mannWhitneyUTest53.mannWhitneyU(doubleArray59, doubleArray63);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest65 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray72 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray76 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double77 = mannWhitneyUTest66.mannWhitneyU(doubleArray72, doubleArray76);
        double[] doubleArray79 = new double[] { 10.0d };
        double double80 = mannWhitneyUTest65.mannWhitneyU(doubleArray72, doubleArray79);
        double double81 = mannWhitneyUTest37.mannWhitneyUTest(doubleArray63, doubleArray72);
        double double82 = mannWhitneyUTest5.mannWhitneyU(doubleArray28, doubleArray72);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest83 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray89 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray93 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double94 = mannWhitneyUTest83.mannWhitneyU(doubleArray89, doubleArray93);
        double double95 = mannWhitneyUTest4.mannWhitneyUTest(doubleArray28, doubleArray89);
        // The following exception was thrown during execution in test generation
        try {
            double double96 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray3, doubleArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.5d + "'", double20 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4.5d + "'", double36 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 4.5d + "'", double52 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[10.0]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 4.5d + "'", double80 == 4.5d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.4560565402502561d + "'", double81 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 12.5d + "'", double82 == 12.5d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 10.0d + "'", double94 == 10.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 1.0d + "'", double95 == 1.0d);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        double double25 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray7, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray32 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray36 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double37 = mannWhitneyUTest26.mannWhitneyU(doubleArray32, doubleArray36);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray44 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray48 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double49 = mannWhitneyUTest38.mannWhitneyU(doubleArray44, doubleArray48);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest50 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest51 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray57 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray61 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double62 = mannWhitneyUTest51.mannWhitneyU(doubleArray57, doubleArray61);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest63 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray69 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray73 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double74 = mannWhitneyUTest63.mannWhitneyU(doubleArray69, doubleArray73);
        double double75 = mannWhitneyUTest50.mannWhitneyUTest(doubleArray57, doubleArray73);
        double double76 = mannWhitneyUTest26.mannWhitneyU(doubleArray48, doubleArray57);
        double[] doubleArray82 = new double[] { 0.3767591178115821d, 0.3767591178115821d, 100, 3.0d, 0.3767591178115821d };
        double double83 = mannWhitneyUTest0.mannWhitneyU(doubleArray48, doubleArray82);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest84 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray90 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray94 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double95 = mannWhitneyUTest84.mannWhitneyU(doubleArray90, doubleArray94);
        double[] doubleArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double97 = mannWhitneyUTest0.mannWhitneyU(doubleArray94, doubleArray96);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.4560565402502561d + "'", double25 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.4560565402502561d + "'", double75 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 10.0d + "'", double76 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[0.3767591178115821, 0.3767591178115821, 100.0, 3.0, 0.3767591178115821]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.5d + "'", double83 == 10.5d);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 10.0d + "'", double95 == 10.0d);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray22 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double23 = mannWhitneyUTest12.mannWhitneyU(doubleArray18, doubleArray22);
        double[] doubleArray26 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double27 = mannWhitneyUTest0.mannWhitneyU(doubleArray18, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        double[] doubleArray42 = new double[] { 10.0d };
        double double43 = mannWhitneyUTest28.mannWhitneyU(doubleArray35, doubleArray42);
        double[] doubleArray47 = new double[] { (short) 10, 0.617075077451974d, (byte) 10 };
        double double48 = mannWhitneyUTest0.mannWhitneyU(doubleArray35, doubleArray47);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest49 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest50 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray56 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray60 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double61 = mannWhitneyUTest50.mannWhitneyU(doubleArray56, doubleArray60);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest62 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest63 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray69 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray73 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double74 = mannWhitneyUTest63.mannWhitneyU(doubleArray69, doubleArray73);
        double[] doubleArray76 = new double[] { 10.0d };
        double double77 = mannWhitneyUTest62.mannWhitneyU(doubleArray69, doubleArray76);
        double double78 = mannWhitneyUTest49.mannWhitneyU(doubleArray60, doubleArray69);
        double[] doubleArray79 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double80 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray69, doubleArray79);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6.0d + "'", double27 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.5d + "'", double43 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 0.617075077451974, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 13.0d + "'", double48 == 13.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[10.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 4.5d + "'", double77 == 4.5d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        double[] doubleArray26 = new double[] { 10.0d };
        double double27 = mannWhitneyUTest12.mannWhitneyU(doubleArray19, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        double[] doubleArray42 = new double[] { 10.0d };
        double double43 = mannWhitneyUTest28.mannWhitneyU(doubleArray35, doubleArray42);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray50 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray54 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double55 = mannWhitneyUTest44.mannWhitneyU(doubleArray50, doubleArray54);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest56 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray63 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray67 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double68 = mannWhitneyUTest57.mannWhitneyU(doubleArray63, doubleArray67);
        double[] doubleArray70 = new double[] { 10.0d };
        double double71 = mannWhitneyUTest56.mannWhitneyU(doubleArray63, doubleArray70);
        double double72 = mannWhitneyUTest28.mannWhitneyUTest(doubleArray54, doubleArray63);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest73 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray79 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray83 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double84 = mannWhitneyUTest73.mannWhitneyU(doubleArray79, doubleArray83);
        double[] doubleArray87 = new double[] { 0.0f, '4' };
        double double88 = mannWhitneyUTest28.mannWhitneyU(doubleArray83, doubleArray87);
        double double89 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray19, doubleArray87);
        double[] doubleArray90 = null;
        double[] doubleArray91 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double92 = mannWhitneyUTest0.mannWhitneyU(doubleArray90, doubleArray91);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.5d + "'", double27 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.5d + "'", double43 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[10.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 4.5d + "'", double71 == 4.5d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.4560565402502561d + "'", double72 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[0.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 4.0d + "'", double88 == 4.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.4385780260809997d + "'", double89 == 0.4385780260809997d);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray22 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double23 = mannWhitneyUTest12.mannWhitneyU(doubleArray18, doubleArray22);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest24 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray31 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray35 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double36 = mannWhitneyUTest25.mannWhitneyU(doubleArray31, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray44 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray48 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double49 = mannWhitneyUTest38.mannWhitneyU(doubleArray44, doubleArray48);
        double[] doubleArray51 = new double[] { 10.0d };
        double double52 = mannWhitneyUTest37.mannWhitneyU(doubleArray44, doubleArray51);
        double double53 = mannWhitneyUTest24.mannWhitneyU(doubleArray35, doubleArray44);
        double double54 = mannWhitneyUTest0.mannWhitneyU(doubleArray18, doubleArray44);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest55 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray61 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray65 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double66 = mannWhitneyUTest55.mannWhitneyU(doubleArray61, doubleArray65);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest68 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray74 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray78 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double79 = mannWhitneyUTest68.mannWhitneyU(doubleArray74, doubleArray78);
        double[] doubleArray81 = new double[] { 10.0d };
        double double82 = mannWhitneyUTest67.mannWhitneyU(doubleArray74, doubleArray81);
        double double83 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray65, doubleArray81);
        double[] doubleArray84 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest85 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray91 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray95 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double96 = mannWhitneyUTest85.mannWhitneyU(doubleArray91, doubleArray95);
        // The following exception was thrown during execution in test generation
        try {
            double double97 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray84, doubleArray95);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 4.5d + "'", double52 == 4.5d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 12.5d + "'", double54 == 12.5d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[10.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 4.5d + "'", double82 == 4.5d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.6547208460185768d + "'", double83 == 0.6547208460185768d);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 10.0d + "'", double96 == 10.0d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        double double26 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray8, doubleArray24);
        double[] doubleArray31 = new double[] { (short) 1, 10.0f, 0.06619257972219339d, (byte) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray42 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double43 = mannWhitneyUTest32.mannWhitneyU(doubleArray38, doubleArray42);
        double double44 = mannWhitneyUTest1.mannWhitneyU(doubleArray31, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray52 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray56 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double57 = mannWhitneyUTest46.mannWhitneyU(doubleArray52, doubleArray56);
        double[] doubleArray59 = new double[] { 10.0d };
        double double60 = mannWhitneyUTest45.mannWhitneyU(doubleArray52, doubleArray59);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest61 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray67 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray71 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double72 = mannWhitneyUTest61.mannWhitneyU(doubleArray67, doubleArray71);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest73 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest74 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray80 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray84 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double85 = mannWhitneyUTest74.mannWhitneyU(doubleArray80, doubleArray84);
        double[] doubleArray87 = new double[] { 10.0d };
        double double88 = mannWhitneyUTest73.mannWhitneyU(doubleArray80, doubleArray87);
        double double89 = mannWhitneyUTest45.mannWhitneyUTest(doubleArray71, doubleArray80);
        double double90 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray38, doubleArray71);
        java.lang.Class<?> wildcardClass91 = doubleArray71.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.4560565402502561d + "'", double26 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0, 0.06619257972219339, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 17.5d + "'", double44 == 17.5d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 4.5d + "'", double60 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[10.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 4.5d + "'", double88 == 4.5d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.4560565402502561d + "'", double89 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.4560565402502561d + "'", double90 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        double[] doubleArray3 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray11 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray15 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double16 = mannWhitneyUTest5.mannWhitneyU(doubleArray11, doubleArray15);
        double[] doubleArray18 = new double[] { 10.0d };
        double double19 = mannWhitneyUTest4.mannWhitneyU(doubleArray11, doubleArray18);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest20 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray26 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray30 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double31 = mannWhitneyUTest20.mannWhitneyU(doubleArray26, doubleArray30);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest33 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray39 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray43 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double44 = mannWhitneyUTest33.mannWhitneyU(doubleArray39, doubleArray43);
        double[] doubleArray46 = new double[] { 10.0d };
        double double47 = mannWhitneyUTest32.mannWhitneyU(doubleArray39, doubleArray46);
        double double48 = mannWhitneyUTest4.mannWhitneyUTest(doubleArray30, doubleArray39);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest49 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray55 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray59 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double60 = mannWhitneyUTest49.mannWhitneyU(doubleArray55, doubleArray59);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest61 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest62 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray68 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray72 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double73 = mannWhitneyUTest62.mannWhitneyU(doubleArray68, doubleArray72);
        double[] doubleArray75 = new double[] { 10.0d };
        double double76 = mannWhitneyUTest61.mannWhitneyU(doubleArray68, doubleArray75);
        double double77 = mannWhitneyUTest4.mannWhitneyU(doubleArray59, doubleArray75);
        // The following exception was thrown during execution in test generation
        try {
            double double78 = mannWhitneyUTest2.mannWhitneyU(doubleArray3, doubleArray75);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.5d + "'", double19 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 4.5d + "'", double47 == 4.5d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.4560565402502561d + "'", double48 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 4.5d + "'", double76 == 4.5d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 2.0d + "'", double77 == 2.0d);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        double double26 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray8, doubleArray24);
        double[] doubleArray31 = new double[] { (short) 1, 10.0f, 0.06619257972219339d, (byte) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray42 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double43 = mannWhitneyUTest32.mannWhitneyU(doubleArray38, doubleArray42);
        double double44 = mannWhitneyUTest1.mannWhitneyU(doubleArray31, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray52 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray56 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double57 = mannWhitneyUTest46.mannWhitneyU(doubleArray52, doubleArray56);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray64 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray68 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double69 = mannWhitneyUTest58.mannWhitneyU(doubleArray64, doubleArray68);
        double double70 = mannWhitneyUTest45.mannWhitneyUTest(doubleArray52, doubleArray68);
        double[] doubleArray75 = new double[] { (short) 1, 10.0f, 0.06619257972219339d, (byte) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest76 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray82 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray86 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double87 = mannWhitneyUTest76.mannWhitneyU(doubleArray82, doubleArray86);
        double double88 = mannWhitneyUTest45.mannWhitneyU(doubleArray75, doubleArray82);
        double double89 = mannWhitneyUTest0.mannWhitneyU(doubleArray31, doubleArray82);
        double[] doubleArray90 = null;
        double[] doubleArray91 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double92 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray90, doubleArray91);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.4560565402502561d + "'", double26 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0, 0.06619257972219339, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 17.5d + "'", double44 == 17.5d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.4560565402502561d + "'", double70 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 10.0, 0.06619257972219339, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 10.0d + "'", double87 == 10.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 17.5d + "'", double88 == 17.5d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 17.5d + "'", double89 == 17.5d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        double[] doubleArray3 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray11 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray15 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double16 = mannWhitneyUTest5.mannWhitneyU(doubleArray11, doubleArray15);
        double[] doubleArray18 = new double[] { 10.0d };
        double double19 = mannWhitneyUTest4.mannWhitneyU(doubleArray11, doubleArray18);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest20 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray26 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray30 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double31 = mannWhitneyUTest20.mannWhitneyU(doubleArray26, doubleArray30);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest33 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray39 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray43 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double44 = mannWhitneyUTest33.mannWhitneyU(doubleArray39, doubleArray43);
        double[] doubleArray46 = new double[] { 10.0d };
        double double47 = mannWhitneyUTest32.mannWhitneyU(doubleArray39, doubleArray46);
        double double48 = mannWhitneyUTest4.mannWhitneyUTest(doubleArray30, doubleArray39);
        double[] doubleArray50 = new double[] { 0L };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest51 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray57 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray61 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double62 = mannWhitneyUTest51.mannWhitneyU(doubleArray57, doubleArray61);
        double double63 = mannWhitneyUTest4.mannWhitneyU(doubleArray50, doubleArray61);
        // The following exception was thrown during execution in test generation
        try {
            double double64 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray3, doubleArray50);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.5d + "'", double19 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 4.5d + "'", double47 == 4.5d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.4560565402502561d + "'", double48 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 2.0d + "'", double63 == 2.0d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray31 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray35 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double36 = mannWhitneyUTest25.mannWhitneyU(doubleArray31, doubleArray35);
        double double37 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray19, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray44 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray48 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double49 = mannWhitneyUTest38.mannWhitneyU(doubleArray44, doubleArray48);
        double double50 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray19, doubleArray48);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest51 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray57 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray61 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double62 = mannWhitneyUTest51.mannWhitneyU(doubleArray57, doubleArray61);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest63 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest64 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray70 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray74 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double75 = mannWhitneyUTest64.mannWhitneyU(doubleArray70, doubleArray74);
        double[] doubleArray77 = new double[] { 10.0d };
        double double78 = mannWhitneyUTest63.mannWhitneyU(doubleArray70, doubleArray77);
        double double79 = mannWhitneyUTest0.mannWhitneyU(doubleArray61, doubleArray77);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest80 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest81 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray87 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray91 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double92 = mannWhitneyUTest81.mannWhitneyU(doubleArray87, doubleArray91);
        double[] doubleArray94 = new double[] { 10.0d };
        double double95 = mannWhitneyUTest80.mannWhitneyU(doubleArray87, doubleArray94);
        double[] doubleArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double97 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray94, doubleArray96);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.4560565402502561d + "'", double37 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.4560565402502561d + "'", double50 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[10.0]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 4.5d + "'", double78 == 4.5d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 2.0d + "'", double79 == 2.0d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 10.0d + "'", double92 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[10.0]");
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 4.5d + "'", double95 == 4.5d);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        double[] doubleArray26 = new double[] { 10.0d };
        double double27 = mannWhitneyUTest12.mannWhitneyU(doubleArray19, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray34 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray38 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double39 = mannWhitneyUTest28.mannWhitneyU(doubleArray34, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray46 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray50 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double51 = mannWhitneyUTest40.mannWhitneyU(doubleArray46, doubleArray50);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest53 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray59 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray63 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double64 = mannWhitneyUTest53.mannWhitneyU(doubleArray59, doubleArray63);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest65 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray71 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray75 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double76 = mannWhitneyUTest65.mannWhitneyU(doubleArray71, doubleArray75);
        double double77 = mannWhitneyUTest52.mannWhitneyUTest(doubleArray59, doubleArray75);
        double double78 = mannWhitneyUTest28.mannWhitneyU(doubleArray50, doubleArray59);
        double double79 = mannWhitneyUTest0.mannWhitneyU(doubleArray26, doubleArray50);
        double[] doubleArray80 = null;
        double[] doubleArray81 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double82 = mannWhitneyUTest0.mannWhitneyU(doubleArray80, doubleArray81);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.5d + "'", double27 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 10.0d + "'", double76 == 10.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.4560565402502561d + "'", double77 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 2.0d + "'", double79 == 2.0d);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray32 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray36 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double37 = mannWhitneyUTest26.mannWhitneyU(doubleArray32, doubleArray36);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray44 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray48 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double49 = mannWhitneyUTest38.mannWhitneyU(doubleArray44, doubleArray48);
        double double50 = mannWhitneyUTest25.mannWhitneyUTest(doubleArray32, doubleArray48);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest51 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray57 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray61 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double62 = mannWhitneyUTest51.mannWhitneyU(doubleArray57, doubleArray61);
        double double63 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray32, doubleArray61);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest64 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest65 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray71 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray75 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double76 = mannWhitneyUTest65.mannWhitneyU(doubleArray71, doubleArray75);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest77 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest78 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray84 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray88 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double89 = mannWhitneyUTest78.mannWhitneyU(doubleArray84, doubleArray88);
        double[] doubleArray91 = new double[] { 10.0d };
        double double92 = mannWhitneyUTest77.mannWhitneyU(doubleArray84, doubleArray91);
        double double93 = mannWhitneyUTest64.mannWhitneyU(doubleArray75, doubleArray84);
        double double94 = mannWhitneyUTest1.mannWhitneyU(doubleArray61, doubleArray75);
        double[] doubleArray95 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double96 = mannWhitneyUTest0.mannWhitneyU(doubleArray61, doubleArray95);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.4560565402502561d + "'", double50 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.4560565402502561d + "'", double63 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 10.0d + "'", double76 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 10.0d + "'", double89 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[10.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 4.5d + "'", double92 == 4.5d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 10.0d + "'", double93 == 10.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 4.5d + "'", double94 == 4.5d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        double[] doubleArray14 = new double[] { 10.0d };
        double double15 = mannWhitneyUTest0.mannWhitneyU(doubleArray7, doubleArray14);
        double[] doubleArray20 = new double[] { 6.5d, (short) 1, 100, 0.06619257972219339d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest21 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest22 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest23 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray29 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray33 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double34 = mannWhitneyUTest23.mannWhitneyU(doubleArray29, doubleArray33);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest35 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest36 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray42 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray46 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double47 = mannWhitneyUTest36.mannWhitneyU(doubleArray42, doubleArray46);
        double[] doubleArray49 = new double[] { 10.0d };
        double double50 = mannWhitneyUTest35.mannWhitneyU(doubleArray42, doubleArray49);
        double double51 = mannWhitneyUTest22.mannWhitneyU(doubleArray33, doubleArray42);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray58 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray62 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double63 = mannWhitneyUTest52.mannWhitneyU(doubleArray58, doubleArray62);
        double double64 = mannWhitneyUTest21.mannWhitneyUTest(doubleArray33, doubleArray58);
        double double65 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray20, doubleArray58);
        double[] doubleArray66 = null;
        double[] doubleArray67 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double68 = mannWhitneyUTest0.mannWhitneyU(doubleArray66, doubleArray67);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5d + "'", double15 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[6.5, 1.0, 100.0, 0.06619257972219339]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4.5d + "'", double50 == 4.5d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.4560565402502561d + "'", double64 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.08641073297370006d + "'", double65 == 0.08641073297370006d);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest27 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray37 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double38 = mannWhitneyUTest27.mannWhitneyU(doubleArray33, doubleArray37);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest39 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray46 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray50 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double51 = mannWhitneyUTest40.mannWhitneyU(doubleArray46, doubleArray50);
        double[] doubleArray53 = new double[] { 10.0d };
        double double54 = mannWhitneyUTest39.mannWhitneyU(doubleArray46, doubleArray53);
        double double55 = mannWhitneyUTest26.mannWhitneyU(doubleArray37, doubleArray46);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest56 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray62 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray66 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double67 = mannWhitneyUTest56.mannWhitneyU(doubleArray62, doubleArray66);
        double double68 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray46, doubleArray66);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest69 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray75 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray79 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double80 = mannWhitneyUTest69.mannWhitneyU(doubleArray75, doubleArray79);
        double double81 = mannWhitneyUTest2.mannWhitneyU(doubleArray66, doubleArray79);
        // The following exception was thrown during execution in test generation
        try {
            double double82 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray1, doubleArray79);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 4.5d + "'", double54 == 4.5d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.4560565402502561d + "'", double68 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 4.5d + "'", double81 == 4.5d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        double[] doubleArray14 = new double[] { 10.0d };
        double double15 = mannWhitneyUTest0.mannWhitneyU(doubleArray7, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray22 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray26 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double27 = mannWhitneyUTest16.mannWhitneyU(doubleArray22, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        double[] doubleArray42 = new double[] { 10.0d };
        double double43 = mannWhitneyUTest28.mannWhitneyU(doubleArray35, doubleArray42);
        double double44 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray26, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray52 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray56 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double57 = mannWhitneyUTest46.mannWhitneyU(doubleArray52, doubleArray56);
        double[] doubleArray59 = new double[] { 10.0d };
        double double60 = mannWhitneyUTest45.mannWhitneyU(doubleArray52, doubleArray59);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest61 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest62 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray68 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray72 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double73 = mannWhitneyUTest62.mannWhitneyU(doubleArray68, doubleArray72);
        double[] doubleArray75 = new double[] { 10.0d };
        double double76 = mannWhitneyUTest61.mannWhitneyU(doubleArray68, doubleArray75);
        double double77 = mannWhitneyUTest0.mannWhitneyU(doubleArray52, doubleArray75);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest78 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray84 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray88 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double89 = mannWhitneyUTest78.mannWhitneyU(doubleArray84, doubleArray88);
        double[] doubleArray90 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double91 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray88, doubleArray90);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5d + "'", double15 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.5d + "'", double43 == 4.5d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.4560565402502561d + "'", double44 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 4.5d + "'", double60 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 4.5d + "'", double76 == 4.5d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 4.5d + "'", double77 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 10.0d + "'", double89 == 10.0d);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        double double26 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray8, doubleArray24);
        double[] doubleArray31 = new double[] { (short) 1, 10.0f, 0.06619257972219339d, (byte) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray42 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double43 = mannWhitneyUTest32.mannWhitneyU(doubleArray38, doubleArray42);
        double double44 = mannWhitneyUTest1.mannWhitneyU(doubleArray31, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray52 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray56 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double57 = mannWhitneyUTest46.mannWhitneyU(doubleArray52, doubleArray56);
        double[] doubleArray59 = new double[] { 10.0d };
        double double60 = mannWhitneyUTest45.mannWhitneyU(doubleArray52, doubleArray59);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest61 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray67 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray71 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double72 = mannWhitneyUTest61.mannWhitneyU(doubleArray67, doubleArray71);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest73 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest74 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray80 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray84 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double85 = mannWhitneyUTest74.mannWhitneyU(doubleArray80, doubleArray84);
        double[] doubleArray87 = new double[] { 10.0d };
        double double88 = mannWhitneyUTest73.mannWhitneyU(doubleArray80, doubleArray87);
        double double89 = mannWhitneyUTest45.mannWhitneyUTest(doubleArray71, doubleArray80);
        double double90 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray38, doubleArray71);
        java.lang.Class<?> wildcardClass91 = mannWhitneyUTest0.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.4560565402502561d + "'", double26 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0, 0.06619257972219339, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 17.5d + "'", double44 == 17.5d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 4.5d + "'", double60 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[10.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 4.5d + "'", double88 == 4.5d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.4560565402502561d + "'", double89 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.4560565402502561d + "'", double90 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        double double25 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray7, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest27 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray37 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double38 = mannWhitneyUTest27.mannWhitneyU(doubleArray33, doubleArray37);
        double[] doubleArray40 = new double[] { 10.0d };
        double double41 = mannWhitneyUTest26.mannWhitneyU(doubleArray33, doubleArray40);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest42 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray48 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray52 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double53 = mannWhitneyUTest42.mannWhitneyU(doubleArray48, doubleArray52);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest55 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray61 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray65 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double66 = mannWhitneyUTest55.mannWhitneyU(doubleArray61, doubleArray65);
        double[] doubleArray68 = new double[] { 10.0d };
        double double69 = mannWhitneyUTest54.mannWhitneyU(doubleArray61, doubleArray68);
        double double70 = mannWhitneyUTest26.mannWhitneyUTest(doubleArray52, doubleArray61);
        double[] doubleArray72 = new double[] { 0L };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest73 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray79 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray83 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double84 = mannWhitneyUTest73.mannWhitneyU(doubleArray79, doubleArray83);
        double double85 = mannWhitneyUTest26.mannWhitneyU(doubleArray72, doubleArray83);
        double[] doubleArray86 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double87 = mannWhitneyUTest0.mannWhitneyU(doubleArray83, doubleArray86);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.4560565402502561d + "'", double25 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4.5d + "'", double41 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 4.5d + "'", double69 == 4.5d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.4560565402502561d + "'", double70 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 2.0d + "'", double85 == 2.0d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        double double26 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray8, doubleArray24);
        double[] doubleArray31 = new double[] { (short) 1, 10.0f, 0.06619257972219339d, (byte) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray42 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double43 = mannWhitneyUTest32.mannWhitneyU(doubleArray38, doubleArray42);
        double double44 = mannWhitneyUTest1.mannWhitneyU(doubleArray31, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray52 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray56 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double57 = mannWhitneyUTest46.mannWhitneyU(doubleArray52, doubleArray56);
        double[] doubleArray59 = new double[] { 10.0d };
        double double60 = mannWhitneyUTest45.mannWhitneyU(doubleArray52, doubleArray59);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest61 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray67 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray71 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double72 = mannWhitneyUTest61.mannWhitneyU(doubleArray67, doubleArray71);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest73 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest74 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray80 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray84 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double85 = mannWhitneyUTest74.mannWhitneyU(doubleArray80, doubleArray84);
        double[] doubleArray87 = new double[] { 10.0d };
        double double88 = mannWhitneyUTest73.mannWhitneyU(doubleArray80, doubleArray87);
        double double89 = mannWhitneyUTest45.mannWhitneyUTest(doubleArray71, doubleArray80);
        double double90 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray38, doubleArray71);
        java.lang.Class<?> wildcardClass91 = doubleArray38.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.4560565402502561d + "'", double26 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0, 0.06619257972219339, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 17.5d + "'", double44 == 17.5d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 4.5d + "'", double60 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[10.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 4.5d + "'", double88 == 4.5d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.4560565402502561d + "'", double89 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.4560565402502561d + "'", double90 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray13 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double14 = mannWhitneyUTest3.mannWhitneyU(doubleArray9, doubleArray13);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray21 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray25 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double26 = mannWhitneyUTest15.mannWhitneyU(doubleArray21, doubleArray25);
        double double27 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray9, doubleArray25);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest41 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest42 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray48 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray52 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double53 = mannWhitneyUTest42.mannWhitneyU(doubleArray48, doubleArray52);
        double[] doubleArray55 = new double[] { 10.0d };
        double double56 = mannWhitneyUTest41.mannWhitneyU(doubleArray48, doubleArray55);
        double double57 = mannWhitneyUTest28.mannWhitneyU(doubleArray39, doubleArray48);
        double double58 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray9, doubleArray48);
        double[] doubleArray61 = new double[] { (byte) 100, 12.0d };
        double double62 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray48, doubleArray61);
        double[] doubleArray63 = null;
        double[] doubleArray64 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double65 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray63, doubleArray64);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.4560565402502561d + "'", double27 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 4.5d + "'", double56 == 4.5d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 12.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.052807511416113506d + "'", double62 == 0.052807511416113506d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        double[] doubleArray14 = new double[] { 10.0d };
        double double15 = mannWhitneyUTest0.mannWhitneyU(doubleArray7, doubleArray14);
        double[] doubleArray16 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest19 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray25 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray29 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double30 = mannWhitneyUTest19.mannWhitneyU(doubleArray25, doubleArray29);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray42 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double43 = mannWhitneyUTest32.mannWhitneyU(doubleArray38, doubleArray42);
        double[] doubleArray45 = new double[] { 10.0d };
        double double46 = mannWhitneyUTest31.mannWhitneyU(doubleArray38, doubleArray45);
        double double47 = mannWhitneyUTest18.mannWhitneyU(doubleArray29, doubleArray38);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest48 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest49 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray55 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray59 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double60 = mannWhitneyUTest49.mannWhitneyU(doubleArray55, doubleArray59);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest61 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray67 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray71 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double72 = mannWhitneyUTest61.mannWhitneyU(doubleArray67, doubleArray71);
        double double73 = mannWhitneyUTest48.mannWhitneyUTest(doubleArray55, doubleArray71);
        double double74 = mannWhitneyUTest17.mannWhitneyU(doubleArray29, doubleArray71);
        // The following exception was thrown during execution in test generation
        try {
            double double75 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray16, doubleArray71);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5d + "'", double15 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 4.5d + "'", double46 == 4.5d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.4560565402502561d + "'", double73 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 4.5d + "'", double74 == 4.5d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        double[] doubleArray12 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray31 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray35 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double36 = mannWhitneyUTest25.mannWhitneyU(doubleArray31, doubleArray35);
        double[] doubleArray39 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double40 = mannWhitneyUTest13.mannWhitneyU(doubleArray31, doubleArray39);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest41 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest42 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray48 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray52 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double53 = mannWhitneyUTest42.mannWhitneyU(doubleArray48, doubleArray52);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray60 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray64 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double65 = mannWhitneyUTest54.mannWhitneyU(doubleArray60, doubleArray64);
        double double66 = mannWhitneyUTest41.mannWhitneyUTest(doubleArray48, doubleArray64);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray73 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray77 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double78 = mannWhitneyUTest67.mannWhitneyU(doubleArray73, doubleArray77);
        double double79 = mannWhitneyUTest13.mannWhitneyU(doubleArray64, doubleArray73);
        // The following exception was thrown during execution in test generation
        try {
            double double80 = mannWhitneyUTest0.mannWhitneyU(doubleArray12, doubleArray64);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 6.0d + "'", double40 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.4560565402502561d + "'", double66 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray22 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double23 = mannWhitneyUTest12.mannWhitneyU(doubleArray18, doubleArray22);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest24 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray31 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray35 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double36 = mannWhitneyUTest25.mannWhitneyU(doubleArray31, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray44 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray48 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double49 = mannWhitneyUTest38.mannWhitneyU(doubleArray44, doubleArray48);
        double[] doubleArray51 = new double[] { 10.0d };
        double double52 = mannWhitneyUTest37.mannWhitneyU(doubleArray44, doubleArray51);
        double double53 = mannWhitneyUTest24.mannWhitneyU(doubleArray35, doubleArray44);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray60 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray64 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double65 = mannWhitneyUTest54.mannWhitneyU(doubleArray60, doubleArray64);
        double double66 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray44, doubleArray64);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray73 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray77 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double78 = mannWhitneyUTest67.mannWhitneyU(doubleArray73, doubleArray77);
        double double79 = mannWhitneyUTest0.mannWhitneyU(doubleArray64, doubleArray77);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest80 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest81 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray87 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray91 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double92 = mannWhitneyUTest81.mannWhitneyU(doubleArray87, doubleArray91);
        double[] doubleArray94 = new double[] { 10.0d };
        double double95 = mannWhitneyUTest80.mannWhitneyU(doubleArray87, doubleArray94);
        double[] doubleArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double97 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray94, doubleArray96);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 4.5d + "'", double52 == 4.5d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.4560565402502561d + "'", double66 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 4.5d + "'", double79 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 10.0d + "'", double92 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[10.0]");
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 4.5d + "'", double95 == 4.5d);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest27 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray37 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double38 = mannWhitneyUTest27.mannWhitneyU(doubleArray33, doubleArray37);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest39 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray45 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray49 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double50 = mannWhitneyUTest39.mannWhitneyU(doubleArray45, doubleArray49);
        double double51 = mannWhitneyUTest26.mannWhitneyUTest(doubleArray33, doubleArray49);
        double double52 = mannWhitneyUTest2.mannWhitneyU(doubleArray24, doubleArray33);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest53 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray60 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray64 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double65 = mannWhitneyUTest54.mannWhitneyU(doubleArray60, doubleArray64);
        double[] doubleArray67 = new double[] { 10.0d };
        double double68 = mannWhitneyUTest53.mannWhitneyU(doubleArray60, doubleArray67);
        double double69 = mannWhitneyUTest1.mannWhitneyU(doubleArray24, doubleArray67);
        double[] doubleArray76 = new double[] { 0.0d, (-1), 4.5d, 100, 100L, (-1.0f) };
        double double77 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray67, doubleArray76);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest78 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray84 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray88 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double89 = mannWhitneyUTest78.mannWhitneyU(doubleArray84, doubleArray88);
        double[] doubleArray90 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double91 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray84, doubleArray90);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.4560565402502561d + "'", double51 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 4.5d + "'", double68 == 4.5d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 2.0d + "'", double69 == 2.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, -1.0, 4.5, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.617075077451974d + "'", double77 == 0.617075077451974d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 10.0d + "'", double89 == 10.0d);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        double[] doubleArray3 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest6 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray12 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray16 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double17 = mannWhitneyUTest6.mannWhitneyU(doubleArray12, doubleArray16);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest19 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray25 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray29 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double30 = mannWhitneyUTest19.mannWhitneyU(doubleArray25, doubleArray29);
        double[] doubleArray32 = new double[] { 10.0d };
        double double33 = mannWhitneyUTest18.mannWhitneyU(doubleArray25, doubleArray32);
        double double34 = mannWhitneyUTest5.mannWhitneyU(doubleArray16, doubleArray25);
        double[] doubleArray38 = new double[] { 0.617075077451974d, 0.617075077451974d, (short) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest39 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest40 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray46 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray50 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double51 = mannWhitneyUTest40.mannWhitneyU(doubleArray46, doubleArray50);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray58 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray62 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double63 = mannWhitneyUTest52.mannWhitneyU(doubleArray58, doubleArray62);
        double double64 = mannWhitneyUTest39.mannWhitneyUTest(doubleArray46, doubleArray62);
        double double65 = mannWhitneyUTest5.mannWhitneyU(doubleArray38, doubleArray62);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest67 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray73 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray77 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double78 = mannWhitneyUTest67.mannWhitneyU(doubleArray73, doubleArray77);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest79 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest80 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray86 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray90 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double91 = mannWhitneyUTest80.mannWhitneyU(doubleArray86, doubleArray90);
        double[] doubleArray93 = new double[] { 10.0d };
        double double94 = mannWhitneyUTest79.mannWhitneyU(doubleArray86, doubleArray93);
        double double95 = mannWhitneyUTest66.mannWhitneyU(doubleArray77, doubleArray86);
        double double96 = mannWhitneyUTest4.mannWhitneyU(doubleArray62, doubleArray86);
        // The following exception was thrown during execution in test generation
        try {
            double double97 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray3, doubleArray62);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.5d + "'", double33 == 4.5d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.617075077451974, 0.617075077451974, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.4560565402502561d + "'", double64 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 6.5d + "'", double65 == 6.5d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 10.0d + "'", double91 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[10.0]");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 4.5d + "'", double94 == 4.5d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 10.0d + "'", double95 == 10.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 10.0d + "'", double96 == 10.0d);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray22 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double23 = mannWhitneyUTest12.mannWhitneyU(doubleArray18, doubleArray22);
        double[] doubleArray26 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double27 = mannWhitneyUTest0.mannWhitneyU(doubleArray18, doubleArray26);
        double[] doubleArray28 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray37 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray41 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double42 = mannWhitneyUTest31.mannWhitneyU(doubleArray37, doubleArray41);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest43 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray49 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray53 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double54 = mannWhitneyUTest43.mannWhitneyU(doubleArray49, doubleArray53);
        double double55 = mannWhitneyUTest30.mannWhitneyUTest(doubleArray37, doubleArray53);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest56 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest57 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray63 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray67 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double68 = mannWhitneyUTest57.mannWhitneyU(doubleArray63, doubleArray67);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest69 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest70 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray76 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray80 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double81 = mannWhitneyUTest70.mannWhitneyU(doubleArray76, doubleArray80);
        double[] doubleArray83 = new double[] { 10.0d };
        double double84 = mannWhitneyUTest69.mannWhitneyU(doubleArray76, doubleArray83);
        double double85 = mannWhitneyUTest56.mannWhitneyU(doubleArray67, doubleArray76);
        double double86 = mannWhitneyUTest29.mannWhitneyUTest(doubleArray37, doubleArray76);
        // The following exception was thrown during execution in test generation
        try {
            double double87 = mannWhitneyUTest0.mannWhitneyU(doubleArray28, doubleArray76);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6.0d + "'", double27 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.4560565402502561d + "'", double55 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[10.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 4.5d + "'", double84 == 4.5d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 1.0d + "'", double86 == 1.0d);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        double double25 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray7, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest27 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray37 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double38 = mannWhitneyUTest27.mannWhitneyU(doubleArray33, doubleArray37);
        double[] doubleArray40 = new double[] { 10.0d };
        double double41 = mannWhitneyUTest26.mannWhitneyU(doubleArray33, doubleArray40);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest42 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest43 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray49 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray53 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double54 = mannWhitneyUTest43.mannWhitneyU(doubleArray49, doubleArray53);
        double[] doubleArray56 = new double[] { 10.0d };
        double double57 = mannWhitneyUTest42.mannWhitneyU(doubleArray49, doubleArray56);
        double double58 = mannWhitneyUTest0.mannWhitneyU(doubleArray33, doubleArray49);
        double[] doubleArray59 = null;
        double[] doubleArray60 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double61 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray59, doubleArray60);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.4560565402502561d + "'", double25 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4.5d + "'", double41 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.5d + "'", double57 == 4.5d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 12.5d + "'", double58 == 12.5d);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        double[] doubleArray15 = new double[] { 10.0d };
        double double16 = mannWhitneyUTest1.mannWhitneyU(doubleArray8, doubleArray15);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray23 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray27 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double28 = mannWhitneyUTest17.mannWhitneyU(doubleArray23, doubleArray27);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray36 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray40 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double41 = mannWhitneyUTest30.mannWhitneyU(doubleArray36, doubleArray40);
        double[] doubleArray43 = new double[] { 10.0d };
        double double44 = mannWhitneyUTest29.mannWhitneyU(doubleArray36, doubleArray43);
        double double45 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray27, doubleArray36);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray52 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray56 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double57 = mannWhitneyUTest46.mannWhitneyU(doubleArray52, doubleArray56);
        double[] doubleArray60 = new double[] { 0.0f, '4' };
        double double61 = mannWhitneyUTest1.mannWhitneyU(doubleArray56, doubleArray60);
        double[] doubleArray62 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double63 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray56, doubleArray62);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.5d + "'", double16 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 4.5d + "'", double44 == 4.5d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.4560565402502561d + "'", double45 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 4.0d + "'", double61 == 4.0d);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray13 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double14 = mannWhitneyUTest3.mannWhitneyU(doubleArray9, doubleArray13);
        double[] doubleArray16 = new double[] { 10.0d };
        double double17 = mannWhitneyUTest2.mannWhitneyU(doubleArray9, doubleArray16);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest19 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray25 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray29 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double30 = mannWhitneyUTest19.mannWhitneyU(doubleArray25, doubleArray29);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray37 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray41 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double42 = mannWhitneyUTest31.mannWhitneyU(doubleArray37, doubleArray41);
        double double43 = mannWhitneyUTest18.mannWhitneyUTest(doubleArray25, doubleArray41);
        double double44 = mannWhitneyUTest1.mannWhitneyU(doubleArray16, doubleArray25);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest47 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray53 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray57 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double58 = mannWhitneyUTest47.mannWhitneyU(doubleArray53, doubleArray57);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest60 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray66 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray70 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double71 = mannWhitneyUTest60.mannWhitneyU(doubleArray66, doubleArray70);
        double[] doubleArray73 = new double[] { 10.0d };
        double double74 = mannWhitneyUTest59.mannWhitneyU(doubleArray66, doubleArray73);
        double double75 = mannWhitneyUTest46.mannWhitneyU(doubleArray57, doubleArray66);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest76 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray82 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray86 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double87 = mannWhitneyUTest76.mannWhitneyU(doubleArray82, doubleArray86);
        double double88 = mannWhitneyUTest45.mannWhitneyUTest(doubleArray57, doubleArray82);
        double double89 = mannWhitneyUTest0.mannWhitneyU(doubleArray16, doubleArray57);
        double[] doubleArray90 = new double[] {};
        double[] doubleArray91 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double92 = mannWhitneyUTest0.mannWhitneyU(doubleArray90, doubleArray91);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.5d + "'", double17 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.4560565402502561d + "'", double43 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 4.5d + "'", double44 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 4.5d + "'", double74 == 4.5d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 10.0d + "'", double87 == 10.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.4560565402502561d + "'", double88 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 2.0d + "'", double89 == 2.0d);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[]");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray13 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double14 = mannWhitneyUTest3.mannWhitneyU(doubleArray9, doubleArray13);
        double[] doubleArray16 = new double[] { 10.0d };
        double double17 = mannWhitneyUTest2.mannWhitneyU(doubleArray9, doubleArray16);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray24 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray28 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double29 = mannWhitneyUTest18.mannWhitneyU(doubleArray24, doubleArray28);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray37 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray41 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double42 = mannWhitneyUTest31.mannWhitneyU(doubleArray37, doubleArray41);
        double[] doubleArray44 = new double[] { 10.0d };
        double double45 = mannWhitneyUTest30.mannWhitneyU(doubleArray37, doubleArray44);
        double double46 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray28, doubleArray37);
        double[] doubleArray48 = new double[] { 0L };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest49 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray55 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray59 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double60 = mannWhitneyUTest49.mannWhitneyU(doubleArray55, doubleArray59);
        double double61 = mannWhitneyUTest2.mannWhitneyU(doubleArray48, doubleArray59);
        // The following exception was thrown during execution in test generation
        try {
            double double62 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray1, doubleArray48);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.5d + "'", double17 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4.5d + "'", double45 == 4.5d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.4560565402502561d + "'", double46 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 2.0d + "'", double61 == 2.0d);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest27 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray33 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray37 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double38 = mannWhitneyUTest27.mannWhitneyU(doubleArray33, doubleArray37);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest39 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray45 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray49 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double50 = mannWhitneyUTest39.mannWhitneyU(doubleArray45, doubleArray49);
        double double51 = mannWhitneyUTest26.mannWhitneyUTest(doubleArray33, doubleArray49);
        double double52 = mannWhitneyUTest2.mannWhitneyU(doubleArray24, doubleArray33);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest53 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest54 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray60 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray64 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double65 = mannWhitneyUTest54.mannWhitneyU(doubleArray60, doubleArray64);
        double[] doubleArray67 = new double[] { 10.0d };
        double double68 = mannWhitneyUTest53.mannWhitneyU(doubleArray60, doubleArray67);
        double double69 = mannWhitneyUTest1.mannWhitneyU(doubleArray24, doubleArray67);
        double[] doubleArray76 = new double[] { 0.0d, (-1), 4.5d, 100, 100L, (-1.0f) };
        double double77 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray67, doubleArray76);
        double[] doubleArray80 = new double[] { 1.0f, 3.0d };
        double[] doubleArray81 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double82 = mannWhitneyUTest0.mannWhitneyU(doubleArray80, doubleArray81);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.4560565402502561d + "'", double51 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 4.5d + "'", double68 == 4.5d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 2.0d + "'", double69 == 2.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, -1.0, 4.5, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.617075077451974d + "'", double77 == 0.617075077451974d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0, 3.0]");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        double[] doubleArray14 = new double[] { 10.0d };
        double double15 = mannWhitneyUTest0.mannWhitneyU(doubleArray7, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray23 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray27 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double28 = mannWhitneyUTest17.mannWhitneyU(doubleArray23, doubleArray27);
        double[] doubleArray30 = new double[] { 10.0d };
        double double31 = mannWhitneyUTest16.mannWhitneyU(doubleArray23, doubleArray30);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest33 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray39 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray43 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double44 = mannWhitneyUTest33.mannWhitneyU(doubleArray39, doubleArray43);
        double[] doubleArray46 = new double[] { 10.0d };
        double double47 = mannWhitneyUTest32.mannWhitneyU(doubleArray39, doubleArray46);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest48 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray54 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray58 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double59 = mannWhitneyUTest48.mannWhitneyU(doubleArray54, doubleArray58);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest60 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray66 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray70 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double71 = mannWhitneyUTest60.mannWhitneyU(doubleArray66, doubleArray70);
        double[] doubleArray74 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double75 = mannWhitneyUTest48.mannWhitneyU(doubleArray66, doubleArray74);
        double double76 = mannWhitneyUTest16.mannWhitneyUTest(doubleArray46, doubleArray66);
        double[] doubleArray83 = new double[] { (short) 0, (byte) 1, 4.0d, 10.0f, 0.37977547484094887d, 0.6985353583033387d };
        double double84 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray66, doubleArray83);
        double[] doubleArray85 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest86 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray92 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray96 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double97 = mannWhitneyUTest86.mannWhitneyU(doubleArray92, doubleArray96);
        // The following exception was thrown during execution in test generation
        try {
            double double98 = mannWhitneyUTest0.mannWhitneyU(doubleArray85, doubleArray96);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5d + "'", double15 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.5d + "'", double31 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 4.5d + "'", double47 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 6.0d + "'", double75 == 6.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.2415665869689726d + "'", double76 == 0.2415665869689726d);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[0.0, 1.0, 4.0, 10.0, 0.37977547484094887, 0.6985353583033387]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.17090352023079736d + "'", double84 == 0.17090352023079736d);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray96), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 10.0d + "'", double97 == 10.0d);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray32 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray36 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double37 = mannWhitneyUTest26.mannWhitneyU(doubleArray32, doubleArray36);
        double[] doubleArray39 = new double[] { 10.0d };
        double double40 = mannWhitneyUTest25.mannWhitneyU(doubleArray32, doubleArray39);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest41 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray47 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray51 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double52 = mannWhitneyUTest41.mannWhitneyU(doubleArray47, doubleArray51);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest53 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray59 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray63 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double64 = mannWhitneyUTest53.mannWhitneyU(doubleArray59, doubleArray63);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest65 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray72 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray76 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double77 = mannWhitneyUTest66.mannWhitneyU(doubleArray72, doubleArray76);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest78 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray84 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray88 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double89 = mannWhitneyUTest78.mannWhitneyU(doubleArray84, doubleArray88);
        double double90 = mannWhitneyUTest65.mannWhitneyUTest(doubleArray72, doubleArray88);
        double double91 = mannWhitneyUTest41.mannWhitneyU(doubleArray63, doubleArray72);
        double double92 = mannWhitneyUTest13.mannWhitneyU(doubleArray39, doubleArray63);
        double double93 = mannWhitneyUTest0.mannWhitneyU(doubleArray11, doubleArray39);
        double[] doubleArray94 = null;
        double[] doubleArray95 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double96 = mannWhitneyUTest0.mannWhitneyU(doubleArray94, doubleArray95);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 4.5d + "'", double40 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 10.0d + "'", double89 == 10.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.4560565402502561d + "'", double90 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 10.0d + "'", double91 == 10.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 2.0d + "'", double92 == 2.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 2.0d + "'", double93 == 2.0d);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        double[] doubleArray27 = new double[] { 10.0d };
        double double28 = mannWhitneyUTest13.mannWhitneyU(doubleArray20, doubleArray27);
        double double29 = mannWhitneyUTest0.mannWhitneyU(doubleArray11, doubleArray20);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray42 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double43 = mannWhitneyUTest32.mannWhitneyU(doubleArray38, doubleArray42);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray51 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray55 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double56 = mannWhitneyUTest45.mannWhitneyU(doubleArray51, doubleArray55);
        double[] doubleArray58 = new double[] { 10.0d };
        double double59 = mannWhitneyUTest44.mannWhitneyU(doubleArray51, doubleArray58);
        double double60 = mannWhitneyUTest31.mannWhitneyU(doubleArray42, doubleArray51);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest61 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray67 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray71 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double72 = mannWhitneyUTest61.mannWhitneyU(doubleArray67, doubleArray71);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest73 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray79 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray83 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double84 = mannWhitneyUTest73.mannWhitneyU(doubleArray79, doubleArray83);
        double[] doubleArray87 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double88 = mannWhitneyUTest61.mannWhitneyU(doubleArray79, doubleArray87);
        double double89 = mannWhitneyUTest30.mannWhitneyU(doubleArray51, doubleArray79);
        double[] doubleArray90 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double91 = mannWhitneyUTest0.mannWhitneyU(doubleArray51, doubleArray90);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.5d + "'", double28 == 4.5d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4.5d + "'", double59 == 4.5d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 6.0d + "'", double88 == 6.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 12.5d + "'", double89 == 12.5d);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray9 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray13 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double14 = mannWhitneyUTest3.mannWhitneyU(doubleArray9, doubleArray13);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray21 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray25 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double26 = mannWhitneyUTest15.mannWhitneyU(doubleArray21, doubleArray25);
        double[] doubleArray29 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double30 = mannWhitneyUTest3.mannWhitneyU(doubleArray21, doubleArray29);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray42 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double43 = mannWhitneyUTest32.mannWhitneyU(doubleArray38, doubleArray42);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray51 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray55 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double56 = mannWhitneyUTest45.mannWhitneyU(doubleArray51, doubleArray55);
        double[] doubleArray58 = new double[] { 10.0d };
        double double59 = mannWhitneyUTest44.mannWhitneyU(doubleArray51, doubleArray58);
        double double60 = mannWhitneyUTest31.mannWhitneyU(doubleArray42, doubleArray51);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest61 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray67 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray71 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double72 = mannWhitneyUTest61.mannWhitneyU(doubleArray67, doubleArray71);
        double double73 = mannWhitneyUTest3.mannWhitneyU(doubleArray42, doubleArray67);
        double[] doubleArray74 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double75 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray42, doubleArray74);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 6.0d + "'", double30 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4.5d + "'", double59 == 4.5d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        double[] doubleArray14 = new double[] { 10.0d };
        double double15 = mannWhitneyUTest0.mannWhitneyU(doubleArray7, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray24 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray28 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double29 = mannWhitneyUTest18.mannWhitneyU(doubleArray24, doubleArray28);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray37 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray41 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double42 = mannWhitneyUTest31.mannWhitneyU(doubleArray37, doubleArray41);
        double[] doubleArray44 = new double[] { 10.0d };
        double double45 = mannWhitneyUTest30.mannWhitneyU(doubleArray37, doubleArray44);
        double double46 = mannWhitneyUTest17.mannWhitneyU(doubleArray28, doubleArray37);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest47 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray53 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray57 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double58 = mannWhitneyUTest47.mannWhitneyU(doubleArray53, doubleArray57);
        double double59 = mannWhitneyUTest16.mannWhitneyUTest(doubleArray28, doubleArray53);
        double[] doubleArray60 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double61 = mannWhitneyUTest0.mannWhitneyU(doubleArray28, doubleArray60);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5d + "'", double15 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4.5d + "'", double45 == 4.5d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.4560565402502561d + "'", double59 == 0.4560565402502561d);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        double[] doubleArray27 = new double[] { 10.0d };
        double double28 = mannWhitneyUTest13.mannWhitneyU(doubleArray20, doubleArray27);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray36 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray40 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double41 = mannWhitneyUTest30.mannWhitneyU(doubleArray36, doubleArray40);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest42 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray48 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray52 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double53 = mannWhitneyUTest42.mannWhitneyU(doubleArray48, doubleArray52);
        double double54 = mannWhitneyUTest29.mannWhitneyUTest(doubleArray36, doubleArray52);
        double double55 = mannWhitneyUTest12.mannWhitneyU(doubleArray27, doubleArray36);
        double[] doubleArray57 = new double[] { 18.5d };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray65 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray69 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double70 = mannWhitneyUTest59.mannWhitneyU(doubleArray65, doubleArray69);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest71 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest72 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray78 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray82 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double83 = mannWhitneyUTest72.mannWhitneyU(doubleArray78, doubleArray82);
        double[] doubleArray85 = new double[] { 10.0d };
        double double86 = mannWhitneyUTest71.mannWhitneyU(doubleArray78, doubleArray85);
        double double87 = mannWhitneyUTest58.mannWhitneyU(doubleArray69, doubleArray78);
        double double88 = mannWhitneyUTest12.mannWhitneyUTest(doubleArray57, doubleArray78);
        double[] doubleArray89 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double90 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray57, doubleArray89);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.5d + "'", double28 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.4560565402502561d + "'", double54 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 4.5d + "'", double55 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[18.5]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[10.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 4.5d + "'", double86 == 4.5d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 10.0d + "'", double87 == 10.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.1432349075246695d + "'", double88 == 0.1432349075246695d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        double[] doubleArray14 = new double[] { 10.0d };
        double double15 = mannWhitneyUTest0.mannWhitneyU(doubleArray7, doubleArray14);
        double[] doubleArray16 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray24 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray28 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double29 = mannWhitneyUTest18.mannWhitneyU(doubleArray24, doubleArray28);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray36 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray40 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double41 = mannWhitneyUTest30.mannWhitneyU(doubleArray36, doubleArray40);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest42 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest43 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray49 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray53 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double54 = mannWhitneyUTest43.mannWhitneyU(doubleArray49, doubleArray53);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest55 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray61 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray65 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double66 = mannWhitneyUTest55.mannWhitneyU(doubleArray61, doubleArray65);
        double double67 = mannWhitneyUTest42.mannWhitneyUTest(doubleArray49, doubleArray65);
        double double68 = mannWhitneyUTest18.mannWhitneyU(doubleArray40, doubleArray49);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest69 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest70 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray76 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray80 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double81 = mannWhitneyUTest70.mannWhitneyU(doubleArray76, doubleArray80);
        double[] doubleArray83 = new double[] { 10.0d };
        double double84 = mannWhitneyUTest69.mannWhitneyU(doubleArray76, doubleArray83);
        double double85 = mannWhitneyUTest17.mannWhitneyU(doubleArray40, doubleArray83);
        // The following exception was thrown during execution in test generation
        try {
            double double86 = mannWhitneyUTest0.mannWhitneyU(doubleArray16, doubleArray83);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5d + "'", double15 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.4560565402502561d + "'", double67 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[10.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 4.5d + "'", double84 == 4.5d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 2.0d + "'", double85 == 2.0d);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        double[] doubleArray15 = new double[] { 10.0d };
        double double16 = mannWhitneyUTest1.mannWhitneyU(doubleArray8, doubleArray15);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest18 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray24 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray28 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double29 = mannWhitneyUTest18.mannWhitneyU(doubleArray24, doubleArray28);
        double[] doubleArray31 = new double[] { 10.0d };
        double double32 = mannWhitneyUTest17.mannWhitneyU(doubleArray24, doubleArray31);
        double double33 = mannWhitneyUTest0.mannWhitneyU(doubleArray15, doubleArray31);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest34 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest35 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray41 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray45 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double46 = mannWhitneyUTest35.mannWhitneyU(doubleArray41, doubleArray45);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest47 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray53 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray57 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double58 = mannWhitneyUTest47.mannWhitneyU(doubleArray53, doubleArray57);
        double double59 = mannWhitneyUTest34.mannWhitneyUTest(doubleArray41, doubleArray57);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest60 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray66 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray70 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double71 = mannWhitneyUTest60.mannWhitneyU(doubleArray66, doubleArray70);
        double double72 = mannWhitneyUTest0.mannWhitneyU(doubleArray41, doubleArray70);
        double[] doubleArray73 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest74 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray80 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray84 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double85 = mannWhitneyUTest74.mannWhitneyU(doubleArray80, doubleArray84);
        // The following exception was thrown during execution in test generation
        try {
            double double86 = mannWhitneyUTest0.mannWhitneyU(doubleArray73, doubleArray80);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.5d + "'", double16 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.5d + "'", double32 == 4.5d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.4560565402502561d + "'", double59 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        double[] doubleArray14 = new double[] { 10.0d };
        double double15 = mannWhitneyUTest0.mannWhitneyU(doubleArray7, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray22 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray26 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double27 = mannWhitneyUTest16.mannWhitneyU(doubleArray22, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        double[] doubleArray42 = new double[] { 10.0d };
        double double43 = mannWhitneyUTest28.mannWhitneyU(doubleArray35, doubleArray42);
        double double44 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray26, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray52 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray56 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double57 = mannWhitneyUTest46.mannWhitneyU(doubleArray52, doubleArray56);
        double[] doubleArray59 = new double[] { 10.0d };
        double double60 = mannWhitneyUTest45.mannWhitneyU(doubleArray52, doubleArray59);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest61 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest62 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray68 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray72 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double73 = mannWhitneyUTest62.mannWhitneyU(doubleArray68, doubleArray72);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest74 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray80 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray84 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double85 = mannWhitneyUTest74.mannWhitneyU(doubleArray80, doubleArray84);
        double double86 = mannWhitneyUTest61.mannWhitneyUTest(doubleArray68, doubleArray84);
        double double87 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray52, doubleArray68);
        double[] doubleArray88 = null;
        double[] doubleArray89 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double90 = mannWhitneyUTest0.mannWhitneyU(doubleArray88, doubleArray89);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5d + "'", double15 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.5d + "'", double43 == 4.5d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.4560565402502561d + "'", double44 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 4.5d + "'", double60 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.4560565402502561d + "'", double86 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 1.0d + "'", double87 == 1.0d);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        double[] doubleArray14 = new double[] { 10.0d };
        double double15 = mannWhitneyUTest0.mannWhitneyU(doubleArray7, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray23 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray27 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double28 = mannWhitneyUTest17.mannWhitneyU(doubleArray23, doubleArray27);
        double[] doubleArray30 = new double[] { 10.0d };
        double double31 = mannWhitneyUTest16.mannWhitneyU(doubleArray23, doubleArray30);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray42 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double43 = mannWhitneyUTest32.mannWhitneyU(doubleArray38, doubleArray42);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest44 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray50 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray54 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double55 = mannWhitneyUTest44.mannWhitneyU(doubleArray50, doubleArray54);
        double[] doubleArray58 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double59 = mannWhitneyUTest32.mannWhitneyU(doubleArray50, doubleArray58);
        double double60 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray30, doubleArray50);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest61 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest62 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray68 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray72 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double73 = mannWhitneyUTest62.mannWhitneyU(doubleArray68, doubleArray72);
        double[] doubleArray75 = new double[] { 10.0d };
        double double76 = mannWhitneyUTest61.mannWhitneyU(doubleArray68, doubleArray75);
        double[] doubleArray77 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double78 = mannWhitneyUTest0.mannWhitneyU(doubleArray75, doubleArray77);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5d + "'", double15 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.5d + "'", double31 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 6.0d + "'", double59 == 6.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.2415665869689726d + "'", double60 == 0.2415665869689726d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 4.5d + "'", double76 == 4.5d);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        double[] doubleArray12 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray21 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray25 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double26 = mannWhitneyUTest15.mannWhitneyU(doubleArray21, doubleArray25);
        double[] doubleArray28 = new double[] { 10.0d };
        double double29 = mannWhitneyUTest14.mannWhitneyU(doubleArray21, doubleArray28);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray36 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray40 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double41 = mannWhitneyUTest30.mannWhitneyU(doubleArray36, doubleArray40);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest42 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest43 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray49 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray53 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double54 = mannWhitneyUTest43.mannWhitneyU(doubleArray49, doubleArray53);
        double[] doubleArray56 = new double[] { 10.0d };
        double double57 = mannWhitneyUTest42.mannWhitneyU(doubleArray49, doubleArray56);
        double double58 = mannWhitneyUTest14.mannWhitneyUTest(doubleArray40, doubleArray49);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest60 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray66 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray70 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double71 = mannWhitneyUTest60.mannWhitneyU(doubleArray66, doubleArray70);
        double[] doubleArray73 = new double[] { 10.0d };
        double double74 = mannWhitneyUTest59.mannWhitneyU(doubleArray66, doubleArray73);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest75 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray81 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray85 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double86 = mannWhitneyUTest75.mannWhitneyU(doubleArray81, doubleArray85);
        double double87 = mannWhitneyUTest14.mannWhitneyU(doubleArray73, doubleArray81);
        double[] doubleArray91 = new double[] { (byte) -1, 0, (-1.0d) };
        double double92 = mannWhitneyUTest13.mannWhitneyUTest(doubleArray73, doubleArray91);
        // The following exception was thrown during execution in test generation
        try {
            double double93 = mannWhitneyUTest0.mannWhitneyU(doubleArray12, doubleArray91);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.5d + "'", double29 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.5d + "'", double57 == 4.5d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.4560565402502561d + "'", double58 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 4.5d + "'", double74 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 4.5d + "'", double87 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[-1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.17971249487899976d + "'", double92 == 0.17971249487899976d);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray20 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray24 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double25 = mannWhitneyUTest14.mannWhitneyU(doubleArray20, doubleArray24);
        double double26 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray8, doubleArray24);
        double[] doubleArray31 = new double[] { (short) 1, 10.0f, 0.06619257972219339d, (byte) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest32 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray38 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray42 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double43 = mannWhitneyUTest32.mannWhitneyU(doubleArray38, doubleArray42);
        double double44 = mannWhitneyUTest1.mannWhitneyU(doubleArray31, doubleArray38);
        double[] doubleArray45 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double46 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray38, doubleArray45);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.4560565402502561d + "'", double26 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0, 0.06619257972219339, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 17.5d + "'", double44 == 17.5d);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        double[] doubleArray3 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray10 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray14 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double15 = mannWhitneyUTest4.mannWhitneyU(doubleArray10, doubleArray14);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray3, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray22 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double23 = mannWhitneyUTest12.mannWhitneyU(doubleArray18, doubleArray22);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest24 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray31 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray35 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double36 = mannWhitneyUTest25.mannWhitneyU(doubleArray31, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray43 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray47 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double48 = mannWhitneyUTest37.mannWhitneyU(doubleArray43, doubleArray47);
        double double49 = mannWhitneyUTest24.mannWhitneyUTest(doubleArray31, doubleArray47);
        double double50 = mannWhitneyUTest0.mannWhitneyU(doubleArray22, doubleArray31);
        double[] doubleArray51 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest53 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray59 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray63 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double64 = mannWhitneyUTest53.mannWhitneyU(doubleArray59, doubleArray63);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest65 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray71 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray75 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double76 = mannWhitneyUTest65.mannWhitneyU(doubleArray71, doubleArray75);
        double double77 = mannWhitneyUTest52.mannWhitneyUTest(doubleArray59, doubleArray75);
        // The following exception was thrown during execution in test generation
        try {
            double double78 = mannWhitneyUTest0.mannWhitneyU(doubleArray51, doubleArray75);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.4560565402502561d + "'", double49 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 10.0d + "'", double76 == 10.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.4560565402502561d + "'", double77 == 0.4560565402502561d);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest26 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray32 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray36 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double37 = mannWhitneyUTest26.mannWhitneyU(doubleArray32, doubleArray36);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray44 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray48 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double49 = mannWhitneyUTest38.mannWhitneyU(doubleArray44, doubleArray48);
        double double50 = mannWhitneyUTest25.mannWhitneyUTest(doubleArray32, doubleArray48);
        double double51 = mannWhitneyUTest1.mannWhitneyU(doubleArray23, doubleArray32);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest52 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest53 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray59 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray63 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double64 = mannWhitneyUTest53.mannWhitneyU(doubleArray59, doubleArray63);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest65 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest66 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray72 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray76 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double77 = mannWhitneyUTest66.mannWhitneyU(doubleArray72, doubleArray76);
        double[] doubleArray79 = new double[] { 10.0d };
        double double80 = mannWhitneyUTest65.mannWhitneyU(doubleArray72, doubleArray79);
        double double81 = mannWhitneyUTest52.mannWhitneyU(doubleArray63, doubleArray72);
        double[] doubleArray88 = new double[] { 100.0f, 6.5d, 0.3767591178115821d, (byte) 0, (short) 10, 10L };
        double double89 = mannWhitneyUTest1.mannWhitneyUTest(doubleArray63, doubleArray88);
        double[] doubleArray90 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double91 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray88, doubleArray90);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.4560565402502561d + "'", double50 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[10.0]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 4.5d + "'", double80 == 4.5d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[100.0, 6.5, 0.3767591178115821, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.3661565601940604d + "'", double89 == 0.3661565601940604d);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.math3.stat.ranking.NaNStrategy naNStrategy0 = null;
        org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy1 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(naNStrategy0, tiesStrategy1);
        double[] doubleArray3 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray10 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray14 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double15 = mannWhitneyUTest4.mannWhitneyU(doubleArray10, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest17 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray23 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray27 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double28 = mannWhitneyUTest17.mannWhitneyU(doubleArray23, doubleArray27);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        double double41 = mannWhitneyUTest16.mannWhitneyUTest(doubleArray23, doubleArray39);
        double[] doubleArray46 = new double[] { (short) 1, 10.0f, 0.06619257972219339d, (byte) 100 };
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest47 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray53 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray57 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double58 = mannWhitneyUTest47.mannWhitneyU(doubleArray53, doubleArray57);
        double double59 = mannWhitneyUTest16.mannWhitneyU(doubleArray46, doubleArray53);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest60 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest61 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray67 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray71 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double72 = mannWhitneyUTest61.mannWhitneyU(doubleArray67, doubleArray71);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest73 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest74 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray80 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray84 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double85 = mannWhitneyUTest74.mannWhitneyU(doubleArray80, doubleArray84);
        double[] doubleArray87 = new double[] { 10.0d };
        double double88 = mannWhitneyUTest73.mannWhitneyU(doubleArray80, doubleArray87);
        double double89 = mannWhitneyUTest60.mannWhitneyU(doubleArray71, doubleArray80);
        double double90 = mannWhitneyUTest4.mannWhitneyUTest(doubleArray53, doubleArray80);
        // The following exception was thrown during execution in test generation
        try {
            double double91 = mannWhitneyUTest2.mannWhitneyUTest(doubleArray3, doubleArray80);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.4560565402502561d + "'", double41 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 10.0, 0.06619257972219339, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 17.5d + "'", double59 == 17.5d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[10.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 4.5d + "'", double88 == 4.5d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 10.0d + "'", double89 == 10.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 1.0d + "'", double90 == 1.0d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        double[] doubleArray14 = new double[] { 10.0d };
        double double15 = mannWhitneyUTest0.mannWhitneyU(doubleArray7, doubleArray14);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest16 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray22 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray26 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double27 = mannWhitneyUTest16.mannWhitneyU(doubleArray22, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        double[] doubleArray42 = new double[] { 10.0d };
        double double43 = mannWhitneyUTest28.mannWhitneyU(doubleArray35, doubleArray42);
        double double44 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray26, doubleArray35);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest45 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest46 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray52 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray56 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double57 = mannWhitneyUTest46.mannWhitneyU(doubleArray52, doubleArray56);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray65 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray69 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double70 = mannWhitneyUTest59.mannWhitneyU(doubleArray65, doubleArray69);
        double[] doubleArray72 = new double[] { 10.0d };
        double double73 = mannWhitneyUTest58.mannWhitneyU(doubleArray65, doubleArray72);
        double double74 = mannWhitneyUTest45.mannWhitneyU(doubleArray56, doubleArray65);
        double[] doubleArray75 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double76 = mannWhitneyUTest0.mannWhitneyU(doubleArray56, doubleArray75);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5d + "'", double15 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.5d + "'", double43 == 4.5d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.4560565402502561d + "'", double44 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 4.5d + "'", double73 == 4.5d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray7 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double12 = mannWhitneyUTest1.mannWhitneyU(doubleArray7, doubleArray11);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray21 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray25 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double26 = mannWhitneyUTest15.mannWhitneyU(doubleArray21, doubleArray25);
        double[] doubleArray28 = new double[] { 10.0d };
        double double29 = mannWhitneyUTest14.mannWhitneyU(doubleArray21, doubleArray28);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray36 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray40 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double41 = mannWhitneyUTest30.mannWhitneyU(doubleArray36, doubleArray40);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest42 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest43 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray49 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray53 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double54 = mannWhitneyUTest43.mannWhitneyU(doubleArray49, doubleArray53);
        double[] doubleArray56 = new double[] { 10.0d };
        double double57 = mannWhitneyUTest42.mannWhitneyU(doubleArray49, doubleArray56);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest58 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray64 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray68 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double69 = mannWhitneyUTest58.mannWhitneyU(doubleArray64, doubleArray68);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest70 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray76 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray80 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double81 = mannWhitneyUTest70.mannWhitneyU(doubleArray76, doubleArray80);
        double[] doubleArray84 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double85 = mannWhitneyUTest58.mannWhitneyU(doubleArray76, doubleArray84);
        double double86 = mannWhitneyUTest30.mannWhitneyUTest(doubleArray49, doubleArray76);
        double double87 = mannWhitneyUTest13.mannWhitneyU(doubleArray28, doubleArray49);
        double double88 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray7, doubleArray49);
        java.lang.Class<?> wildcardClass89 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.5d + "'", double29 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.5d + "'", double57 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 6.0d + "'", double85 == 6.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 1.0d + "'", double86 == 1.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 4.5d + "'", double87 == 4.5d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 1.0d + "'", double88 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest1 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double13 = mannWhitneyUTest2.mannWhitneyU(doubleArray8, doubleArray12);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest14 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest15 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray21 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray25 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double26 = mannWhitneyUTest15.mannWhitneyU(doubleArray21, doubleArray25);
        double[] doubleArray28 = new double[] { 10.0d };
        double double29 = mannWhitneyUTest14.mannWhitneyU(doubleArray21, doubleArray28);
        double double30 = mannWhitneyUTest1.mannWhitneyU(doubleArray12, doubleArray21);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest31 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray37 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray41 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double42 = mannWhitneyUTest31.mannWhitneyU(doubleArray37, doubleArray41);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest43 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray49 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray53 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double54 = mannWhitneyUTest43.mannWhitneyU(doubleArray49, doubleArray53);
        double[] doubleArray57 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double58 = mannWhitneyUTest31.mannWhitneyU(doubleArray49, doubleArray57);
        double double59 = mannWhitneyUTest0.mannWhitneyU(doubleArray21, doubleArray49);
        double[] doubleArray60 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest61 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest62 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray68 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray72 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double73 = mannWhitneyUTest62.mannWhitneyU(doubleArray68, doubleArray72);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest74 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest75 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray81 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray85 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double86 = mannWhitneyUTest75.mannWhitneyU(doubleArray81, doubleArray85);
        double[] doubleArray88 = new double[] { 10.0d };
        double double89 = mannWhitneyUTest74.mannWhitneyU(doubleArray81, doubleArray88);
        double double90 = mannWhitneyUTest61.mannWhitneyU(doubleArray72, doubleArray81);
        // The following exception was thrown during execution in test generation
        try {
            double double91 = mannWhitneyUTest0.mannWhitneyU(doubleArray60, doubleArray72);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.5d + "'", double29 == 4.5d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 6.0d + "'", double58 == 6.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 12.5d + "'", double59 == 12.5d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[10.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 4.5d + "'", double89 == 4.5d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 10.0d + "'", double90 == 10.0d);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray19 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray23 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double24 = mannWhitneyUTest13.mannWhitneyU(doubleArray19, doubleArray23);
        double[] doubleArray26 = new double[] { 10.0d };
        double double27 = mannWhitneyUTest12.mannWhitneyU(doubleArray19, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray36 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray40 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double41 = mannWhitneyUTest30.mannWhitneyU(doubleArray36, doubleArray40);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest42 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest43 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray49 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray53 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double54 = mannWhitneyUTest43.mannWhitneyU(doubleArray49, doubleArray53);
        double[] doubleArray56 = new double[] { 10.0d };
        double double57 = mannWhitneyUTest42.mannWhitneyU(doubleArray49, doubleArray56);
        double double58 = mannWhitneyUTest29.mannWhitneyU(doubleArray40, doubleArray49);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest60 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray66 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray70 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double71 = mannWhitneyUTest60.mannWhitneyU(doubleArray66, doubleArray70);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest72 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray78 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray82 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double83 = mannWhitneyUTest72.mannWhitneyU(doubleArray78, doubleArray82);
        double double84 = mannWhitneyUTest59.mannWhitneyUTest(doubleArray66, doubleArray82);
        double double85 = mannWhitneyUTest28.mannWhitneyU(doubleArray40, doubleArray82);
        double double86 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray19, doubleArray40);
        java.lang.Class<?> wildcardClass87 = doubleArray40.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.5d + "'", double27 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.5d + "'", double57 == 4.5d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.4560565402502561d + "'", double84 == 0.4560565402502561d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 4.5d + "'", double85 == 4.5d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.4560565402502561d + "'", double86 == 0.4560565402502561d);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray6 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double11 = mannWhitneyUTest0.mannWhitneyU(doubleArray6, doubleArray10);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest12 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray18 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray22 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double23 = mannWhitneyUTest12.mannWhitneyU(doubleArray18, doubleArray22);
        double[] doubleArray26 = new double[] { 0.06619257972219339d, (-1.0d) };
        double double27 = mannWhitneyUTest0.mannWhitneyU(doubleArray18, doubleArray26);
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest28 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray35 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray39 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double40 = mannWhitneyUTest29.mannWhitneyU(doubleArray35, doubleArray39);
        double[] doubleArray42 = new double[] { 10.0d };
        double double43 = mannWhitneyUTest28.mannWhitneyU(doubleArray35, doubleArray42);
        double[] doubleArray47 = new double[] { (short) 10, 0.617075077451974d, (byte) 10 };
        double double48 = mannWhitneyUTest0.mannWhitneyU(doubleArray35, doubleArray47);
        double[] doubleArray49 = null;
        org.apache.commons.math3.stat.inference.MannWhitneyUTest mannWhitneyUTest50 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
        double[] doubleArray56 = new double[] { (byte) 0, 0.0d, 0L, (short) 0, 10.0d };
        double[] doubleArray60 = new double[] { (-1.0f), (short) -1, 100.0f };
        double double61 = mannWhitneyUTest50.mannWhitneyU(doubleArray56, doubleArray60);
        // The following exception was thrown during execution in test generation
        try {
            double double62 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray49, doubleArray60);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.06619257972219339, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6.0d + "'", double27 == 6.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.5d + "'", double43 == 4.5d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 0.617075077451974, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 13.0d + "'", double48 == 13.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
    }
}

