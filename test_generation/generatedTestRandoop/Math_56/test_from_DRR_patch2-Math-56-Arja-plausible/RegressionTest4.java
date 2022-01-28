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
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        int[] intArray8 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter9 = new org.apache.commons.math.util.MultidimensionalCounter(intArray8);
        int int10 = multidimensionalCounter9.getDimension();
        int int11 = multidimensionalCounter9.getDimension();
        int int12 = multidimensionalCounter9.getSize();
        int int13 = multidimensionalCounter9.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter9.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = multidimensionalCounter9.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intSpliterator14);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int int7 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int[] intArray11 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        java.lang.Class<?> wildcardClass13 = multidimensionalCounter12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int int8 = iterator7.getCount();
        int[] intArray9 = iterator7.getCounts();
        int[] intArray10 = iterator7.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, -1]");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (byte) 10);
        int int11 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        int[] intArray13 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int[] intArray16 = multidimensionalCounter14.getCounts((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator5 = multidimensionalCounter4.iterator();
        int int6 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intSpliterator7);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray9 = iterator8.getCounts();
        int int10 = iterator8.getCount();
        int int12 = iterator8.getCount((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = iterator8.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int int7 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getSizes();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int[] intArray15 = multidimensionalCounter13.getCounts((int) (short) 0);
        int[] intArray17 = multidimensionalCounter13.getCounts((int) '#');
        int[] intArray19 = multidimensionalCounter13.getCounts(10);
        int int20 = multidimensionalCounter4.getCount(intArray19);
        int[] intArray24 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        int int26 = multidimensionalCounter25.getSize();
        int[] intArray27 = multidimensionalCounter25.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter28 = new org.apache.commons.math.util.MultidimensionalCounter(intArray27);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator29 = multidimensionalCounter28.iterator();
        int[] intArray31 = multidimensionalCounter28.getCounts((int) 'a');
        int[] intArray33 = multidimensionalCounter28.getCounts((int) (byte) 100);
        int[] intArray35 = multidimensionalCounter28.getCounts(4);
        int int36 = multidimensionalCounter4.getCount(intArray35);
        java.util.Spliterator<java.lang.Integer> intSpliterator37 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator38 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 4, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(intSpliterator37);
        org.junit.Assert.assertNotNull(iterator38);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getCounts(0);
        int int12 = multidimensionalCounter4.getSize();
        int int13 = multidimensionalCounter4.getSize();
        int[] intArray15 = multidimensionalCounter4.getCounts((int) ' ');
        int[] intArray19 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter20 = new org.apache.commons.math.util.MultidimensionalCounter(intArray19);
        int int21 = multidimensionalCounter20.getDimension();
        int[] intArray23 = multidimensionalCounter20.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter20.iterator();
        int[] intArray25 = multidimensionalCounter20.getSizes();
        int int26 = multidimensionalCounter20.getSize();
        int[] intArray27 = multidimensionalCounter20.getSizes();
        int[] intArray29 = multidimensionalCounter20.getCounts(2);
        int int30 = multidimensionalCounter4.getCount(intArray29);
        int[] intArray32 = multidimensionalCounter4.getCounts((int) 'a');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator33 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 2, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(iterator33);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        int[] intArray9 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        int int11 = multidimensionalCounter10.getSize();
        int int12 = multidimensionalCounter10.getDimension();
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int[] intArray19 = multidimensionalCounter17.getCounts((int) (short) 0);
        int[] intArray21 = multidimensionalCounter17.getCounts(10);
        int int22 = multidimensionalCounter10.getCount(intArray21);
        int int23 = multidimensionalCounter4.getCount(intArray21);
        int int24 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator25 = multidimensionalCounter4.spliterator();
        int int26 = multidimensionalCounter4.getDimension();
        int int27 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intSpliterator25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray5 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        int int8 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = multidimensionalCounter4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int int9 = multidimensionalCounter4.getDimension();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 10);
        int int13 = multidimensionalCounter4.getDimension();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray5 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getDimension();
        int int14 = multidimensionalCounter12.getDimension();
        int int15 = multidimensionalCounter12.getSize();
        int[] intArray19 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter20 = new org.apache.commons.math.util.MultidimensionalCounter(intArray19);
        int int21 = multidimensionalCounter20.getSize();
        int[] intArray22 = multidimensionalCounter20.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter20.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter20.iterator();
        int int25 = multidimensionalCounter20.getSize();
        int[] intArray29 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter30 = new org.apache.commons.math.util.MultidimensionalCounter(intArray29);
        int int31 = multidimensionalCounter30.getSize();
        int[] intArray32 = multidimensionalCounter30.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator33 = multidimensionalCounter30.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator34 = multidimensionalCounter30.iterator();
        int[] intArray38 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter39 = new org.apache.commons.math.util.MultidimensionalCounter(intArray38);
        int int40 = multidimensionalCounter39.getDimension();
        int[] intArray42 = multidimensionalCounter39.getCounts((int) (short) 10);
        int int43 = multidimensionalCounter30.getCount(intArray42);
        int int44 = multidimensionalCounter20.getCount(intArray42);
        int int45 = multidimensionalCounter12.getCount(intArray42);
        int int46 = multidimensionalCounter12.getSize();
        int int47 = multidimensionalCounter12.getSize();
        int[] intArray49 = multidimensionalCounter12.getCounts(10);
        int int50 = multidimensionalCounter4.getCount(intArray49);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator51 = multidimensionalCounter4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator51.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(iterator51);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int13 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        boolean boolean8 = iterator7.hasNext();
        int[] intArray9 = iterator7.getCounts();
        int[] intArray10 = iterator7.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, -1]");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray5 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        int int8 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray12 = multidimensionalCounter4.getCounts(100);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        boolean boolean14 = iterator13.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        int[] intArray12 = multidimensionalCounter10.getCounts((int) (byte) 10);
        int[] intArray14 = multidimensionalCounter10.getCounts(100);
        int int15 = multidimensionalCounter10.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter10.iterator();
        boolean boolean17 = iterator16.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int int7 = multidimensionalCounter4.getDimension();
        int int8 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int int8 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (byte) 10);
        int int12 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter11.iterator();
        int[] intArray13 = multidimensionalCounter11.getSizes();
        int int14 = multidimensionalCounter11.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator15 = multidimensionalCounter11.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter11.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intSpliterator15);
        org.junit.Assert.assertNotNull(intSpliterator16);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        int[] intArray4 = new int[] { 100, (byte) 10, 2, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter5 = new org.apache.commons.math.util.MultidimensionalCounter(intArray4);
        int int6 = multidimensionalCounter5.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter5.spliterator();
        int[] intArray8 = multidimensionalCounter5.getSizes();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 2, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 10, 2, 1]");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        int int6 = multidimensionalCounter4.getSize();
        int int7 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray13 = multidimensionalCounter4.getSizes();
        int[] intArray15 = multidimensionalCounter4.getCounts(100);
        int[] intArray17 = multidimensionalCounter4.getCounts((int) (byte) 0);
        int int18 = multidimensionalCounter4.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter7.spliterator();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        int int11 = multidimensionalCounter10.getSize();
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        int int17 = multidimensionalCounter16.getSize();
        int[] intArray18 = multidimensionalCounter16.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter16.iterator();
        int[] intArray20 = multidimensionalCounter16.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter21 = new org.apache.commons.math.util.MultidimensionalCounter(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = multidimensionalCounter10.getCount(intArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getSize();
        int[] intArray16 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter14.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter14.iterator();
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getDimension();
        int[] intArray26 = multidimensionalCounter23.getCounts((int) (short) 10);
        int int27 = multidimensionalCounter14.getCount(intArray26);
        int int28 = multidimensionalCounter4.getCount(intArray26);
        int int29 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter4.iterator();
        int[] intArray32 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator33 = multidimensionalCounter4.iterator();
        int[] intArray37 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter38 = new org.apache.commons.math.util.MultidimensionalCounter(intArray37);
        int int39 = multidimensionalCounter38.getDimension();
        int int40 = multidimensionalCounter38.getDimension();
        int int41 = multidimensionalCounter38.getSize();
        int[] intArray45 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter46 = new org.apache.commons.math.util.MultidimensionalCounter(intArray45);
        int int47 = multidimensionalCounter46.getSize();
        int[] intArray48 = multidimensionalCounter46.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator49 = multidimensionalCounter46.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator50 = multidimensionalCounter46.iterator();
        int int51 = multidimensionalCounter46.getSize();
        int[] intArray55 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter56 = new org.apache.commons.math.util.MultidimensionalCounter(intArray55);
        int int57 = multidimensionalCounter56.getSize();
        int[] intArray58 = multidimensionalCounter56.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator59 = multidimensionalCounter56.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator60 = multidimensionalCounter56.iterator();
        int[] intArray64 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter65 = new org.apache.commons.math.util.MultidimensionalCounter(intArray64);
        int int66 = multidimensionalCounter65.getDimension();
        int[] intArray68 = multidimensionalCounter65.getCounts((int) (short) 10);
        int int69 = multidimensionalCounter56.getCount(intArray68);
        int int70 = multidimensionalCounter46.getCount(intArray68);
        int int71 = multidimensionalCounter38.getCount(intArray68);
        int int72 = multidimensionalCounter38.getSize();
        int[] intArray73 = multidimensionalCounter38.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int74 = multidimensionalCounter4.getCount(intArray73);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[32, 10, 1]");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter13.iterator();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getDimension();
        int[] intArray25 = multidimensionalCounter22.getCounts((int) (short) 10);
        int int26 = multidimensionalCounter13.getCount(intArray25);
        int int27 = multidimensionalCounter7.getCount(intArray25);
        int int28 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator29 = multidimensionalCounter7.iterator();
        int[] intArray31 = multidimensionalCounter7.getCounts((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 0, 0]");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter13.iterator();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getDimension();
        int[] intArray25 = multidimensionalCounter22.getCounts((int) (short) 10);
        int int26 = multidimensionalCounter13.getCount(intArray25);
        int int27 = multidimensionalCounter7.getCount(intArray25);
        int int28 = multidimensionalCounter7.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator29 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter7.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int32 = iterator30.getCount(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intSpliterator29);
        org.junit.Assert.assertNotNull(iterator30);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        int[] intArray17 = multidimensionalCounter16.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter16.iterator();
        int int19 = multidimensionalCounter16.getSize();
        int[] intArray21 = multidimensionalCounter16.getCounts(10);
        int int22 = multidimensionalCounter4.getCount(intArray21);
        int[] intArray23 = multidimensionalCounter4.getSizes();
        int[] intArray24 = multidimensionalCounter4.getSizes();
        int int25 = multidimensionalCounter4.getSize();
        int[] intArray27 = multidimensionalCounter4.getCounts(3);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator28 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 3, 0]");
        org.junit.Assert.assertNotNull(iterator28);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int[] intArray13 = multidimensionalCounter11.getCounts((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0]");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter7.spliterator();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter11.iterator();
        int int14 = iterator12.getCount((int) (byte) 0);
        int int16 = iterator12.getCount((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray8 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = iterator11.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        int int11 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        int[] intArray13 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getSize();
        int[] intArray16 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter14.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter14.iterator();
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getDimension();
        int[] intArray26 = multidimensionalCounter23.getCounts((int) (short) 10);
        int int27 = multidimensionalCounter14.getCount(intArray26);
        int int28 = multidimensionalCounter4.getCount(intArray26);
        int int29 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator30 = multidimensionalCounter4.spliterator();
        int int31 = multidimensionalCounter4.getDimension();
        int[] intArray33 = multidimensionalCounter4.getCounts(97);
        java.util.Spliterator<java.lang.Integer> intSpliterator34 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator35 = multidimensionalCounter4.spliterator();
        int[] intArray37 = multidimensionalCounter4.getCounts(100);
        int[] intArray41 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter42 = new org.apache.commons.math.util.MultidimensionalCounter(intArray41);
        int int43 = multidimensionalCounter42.getSize();
        int[] intArray44 = multidimensionalCounter42.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter45 = new org.apache.commons.math.util.MultidimensionalCounter(intArray44);
        java.util.Spliterator<java.lang.Integer> intSpliterator46 = multidimensionalCounter45.spliterator();
        int[] intArray47 = multidimensionalCounter45.getSizes();
        int[] intArray48 = multidimensionalCounter45.getSizes();
        int[] intArray52 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter53 = new org.apache.commons.math.util.MultidimensionalCounter(intArray52);
        int int54 = multidimensionalCounter53.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator55 = multidimensionalCounter53.spliterator();
        int int56 = multidimensionalCounter53.getDimension();
        int[] intArray58 = multidimensionalCounter53.getCounts(0);
        int int59 = multidimensionalCounter45.getCount(intArray58);
        int int60 = multidimensionalCounter4.getCount(intArray58);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intSpliterator30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intSpliterator34);
        org.junit.Assert.assertNotNull(intSpliterator35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(intSpliterator55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getSize();
        int int14 = multidimensionalCounter4.getDimension();
        int[] intArray15 = multidimensionalCounter4.getSizes();
        int int16 = multidimensionalCounter4.getSize();
        int int17 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter4.spliterator();
        int int19 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 3, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator5 = multidimensionalCounter4.iterator();
        int int7 = iterator5.getCount(0);
        int[] intArray8 = iterator5.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, -1]");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter10.iterator();
        int int12 = multidimensionalCounter10.getDimension();
        int int13 = multidimensionalCounter10.getDimension();
        int int14 = multidimensionalCounter10.getDimension();
        int[] intArray16 = multidimensionalCounter10.getCounts((int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[3, 2, 0]");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getCounts(0);
        int int12 = multidimensionalCounter4.getSize();
        int int13 = multidimensionalCounter4.getSize();
        int[] intArray15 = multidimensionalCounter4.getCounts((int) ' ');
        int[] intArray19 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter20 = new org.apache.commons.math.util.MultidimensionalCounter(intArray19);
        int int21 = multidimensionalCounter20.getDimension();
        int[] intArray23 = multidimensionalCounter20.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter20.iterator();
        int[] intArray25 = multidimensionalCounter20.getSizes();
        int int26 = multidimensionalCounter20.getSize();
        int[] intArray27 = multidimensionalCounter20.getSizes();
        int[] intArray29 = multidimensionalCounter20.getCounts(2);
        int int30 = multidimensionalCounter4.getCount(intArray29);
        int[] intArray32 = multidimensionalCounter4.getCounts((int) 'a');
        java.util.Spliterator<java.lang.Integer> intSpliterator33 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator34 = multidimensionalCounter4.iterator();
        int[] intArray38 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter39 = new org.apache.commons.math.util.MultidimensionalCounter(intArray38);
        int int40 = multidimensionalCounter39.getSize();
        int[] intArray41 = multidimensionalCounter39.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter42 = new org.apache.commons.math.util.MultidimensionalCounter(intArray41);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator43 = multidimensionalCounter42.iterator();
        int[] intArray44 = iterator43.getCounts();
        int int45 = iterator43.getCount();
        boolean boolean46 = iterator43.hasNext();
        int[] intArray47 = iterator43.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            int int48 = multidimensionalCounter4.getCount(intArray47);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: -1 out of [0, 0] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 2, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intSpliterator33);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, 0, -1]");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray11 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter12.iterator();
        boolean boolean14 = iterator13.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int int10 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        boolean boolean13 = iterator12.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int[] intArray10 = multidimensionalCounter4.getCounts((int) 'a');
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int int13 = multidimensionalCounter4.getSize();
        int int14 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter4.iterator();
        boolean boolean17 = iterator16.hasNext();
        boolean boolean18 = iterator16.hasNext();
        int int19 = iterator16.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter5 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter6 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray7 = multidimensionalCounter6.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter6.iterator();
        int int9 = multidimensionalCounter6.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int int10 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int[] intArray15 = multidimensionalCounter13.getCounts((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0]");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int int7 = multidimensionalCounter4.getSize();
        int int8 = multidimensionalCounter4.getDimension();
        int int9 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) 'a');
        int[] intArray11 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter7.iterator();
        int int13 = multidimensionalCounter7.getDimension();
        int int14 = multidimensionalCounter7.getDimension();
        int[] intArray15 = multidimensionalCounter7.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter7.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator17 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter7.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = multidimensionalCounter7.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator16);
        org.junit.Assert.assertNotNull(intSpliterator17);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int int10 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = iterator12.getCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getDimension();
        int int17 = multidimensionalCounter15.getDimension();
        int int18 = multidimensionalCounter15.getSize();
        int int19 = multidimensionalCounter15.getDimension();
        int[] intArray23 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter24 = new org.apache.commons.math.util.MultidimensionalCounter(intArray23);
        int[] intArray26 = multidimensionalCounter24.getCounts((int) (short) 0);
        int[] intArray28 = multidimensionalCounter24.getCounts((int) '#');
        int[] intArray30 = multidimensionalCounter24.getCounts(10);
        int int31 = multidimensionalCounter15.getCount(intArray30);
        int int32 = multidimensionalCounter4.getCount(intArray30);
        int[] intArray36 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter37 = new org.apache.commons.math.util.MultidimensionalCounter(intArray36);
        int int38 = multidimensionalCounter37.getSize();
        int[] intArray40 = multidimensionalCounter37.getCounts((int) (short) 10);
        int[] intArray41 = multidimensionalCounter37.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter42 = new org.apache.commons.math.util.MultidimensionalCounter(intArray41);
        int int43 = multidimensionalCounter42.getDimension();
        int int44 = multidimensionalCounter42.getDimension();
        int int45 = multidimensionalCounter42.getSize();
        int int46 = multidimensionalCounter42.getSize();
        int[] intArray48 = multidimensionalCounter42.getCounts((int) (byte) 1);
        int int49 = multidimensionalCounter4.getCount(intArray48);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray5 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter6 = new org.apache.commons.math.util.MultidimensionalCounter(intArray5);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray5);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter8 = new org.apache.commons.math.util.MultidimensionalCounter(intArray5);
        java.lang.Class<?> wildcardClass9 = multidimensionalCounter8.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        int[] intArray9 = multidimensionalCounter4.getCounts((int) '4');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        java.lang.Class<?> wildcardClass11 = multidimensionalCounter4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        int[] intArray12 = multidimensionalCounter10.getCounts((int) (byte) 10);
        int[] intArray14 = multidimensionalCounter10.getCounts((int) (short) 100);
        int[] intArray15 = multidimensionalCounter10.getSizes();
        int[] intArray17 = multidimensionalCounter10.getCounts((int) '4');
        int[] intArray18 = multidimensionalCounter10.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = multidimensionalCounter4.getSize();
        int int13 = multidimensionalCounter4.getDimension();
        int int14 = multidimensionalCounter4.getDimension();
        int[] intArray18 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter19 = new org.apache.commons.math.util.MultidimensionalCounter(intArray18);
        int int20 = multidimensionalCounter19.getSize();
        int[] intArray21 = multidimensionalCounter19.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter19.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter19.iterator();
        int int24 = multidimensionalCounter19.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator25 = multidimensionalCounter19.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter19.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator27 = multidimensionalCounter19.spliterator();
        int[] intArray29 = multidimensionalCounter19.getCounts(4);
        int int30 = multidimensionalCounter4.getCount(intArray29);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intSpliterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(intSpliterator27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 4, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter11.iterator();
        int[] intArray13 = multidimensionalCounter11.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter11.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter11.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int13 = multidimensionalCounter4.getSize();
        int int14 = multidimensionalCounter4.getSize();
        int[] intArray18 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter19 = new org.apache.commons.math.util.MultidimensionalCounter(intArray18);
        int int20 = multidimensionalCounter19.getSize();
        int[] intArray21 = multidimensionalCounter19.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter19.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter19.iterator();
        int[] intArray24 = multidimensionalCounter19.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        int int26 = multidimensionalCounter25.getDimension();
        int int27 = multidimensionalCounter25.getSize();
        int[] intArray28 = multidimensionalCounter25.getSizes();
        int[] intArray30 = multidimensionalCounter25.getCounts(0);
        int int31 = multidimensionalCounter4.getCount(intArray30);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        int[] intArray9 = multidimensionalCounter4.getCounts((int) '4');
        int int10 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray7 = multidimensionalCounter4.getSizes();
        int int8 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        int[] intArray8 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter9 = new org.apache.commons.math.util.MultidimensionalCounter(intArray8);
        int int10 = multidimensionalCounter9.getDimension();
        int int11 = multidimensionalCounter9.getDimension();
        int int12 = multidimensionalCounter9.getSize();
        int int13 = multidimensionalCounter9.getSize();
        int[] intArray15 = multidimensionalCounter9.getCounts((int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = multidimensionalCounter9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int int10 = iterator9.getCount();
        int int11 = iterator9.getCount();
        int int12 = iterator9.getCount();
        int int14 = iterator9.getCount(0);
        int[] intArray15 = iterator9.getCounts();
        int[] intArray16 = iterator9.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, -1]");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 0]");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int int10 = multidimensionalCounter4.getSize();
        int int11 = multidimensionalCounter4.getDimension();
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int int10 = multidimensionalCounter4.getDimension();
        int int11 = multidimensionalCounter4.getSize();
        int int12 = multidimensionalCounter4.getSize();
        int[] intArray14 = multidimensionalCounter4.getCounts((int) '4');
        int int15 = multidimensionalCounter4.getDimension();
        int[] intArray17 = multidimensionalCounter4.getCounts((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 0, 0]");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        boolean boolean10 = iterator9.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int int12 = multidimensionalCounter11.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter11.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter11.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter11.iterator();
        int[] intArray16 = multidimensionalCounter11.getSizes();
        int[] intArray18 = multidimensionalCounter11.getCounts(4);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 4, 0]");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getCounts(0);
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        int int17 = multidimensionalCounter16.getDimension();
        int int18 = multidimensionalCounter16.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter16.iterator();
        int[] intArray23 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter24 = new org.apache.commons.math.util.MultidimensionalCounter(intArray23);
        int int25 = multidimensionalCounter24.getSize();
        int[] intArray26 = multidimensionalCounter24.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter27 = new org.apache.commons.math.util.MultidimensionalCounter(intArray26);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator28 = multidimensionalCounter27.iterator();
        int[] intArray32 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter33 = new org.apache.commons.math.util.MultidimensionalCounter(intArray32);
        int int34 = multidimensionalCounter33.getDimension();
        int[] intArray36 = multidimensionalCounter33.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator37 = multidimensionalCounter33.iterator();
        int[] intArray41 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter42 = new org.apache.commons.math.util.MultidimensionalCounter(intArray41);
        int int43 = multidimensionalCounter42.getDimension();
        int[] intArray45 = multidimensionalCounter42.getCounts((int) (short) 10);
        int int46 = multidimensionalCounter33.getCount(intArray45);
        int int47 = multidimensionalCounter27.getCount(intArray45);
        int int48 = multidimensionalCounter16.getCount(intArray45);
        int int49 = multidimensionalCounter4.getCount(intArray45);
        int[] intArray53 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter54 = new org.apache.commons.math.util.MultidimensionalCounter(intArray53);
        int int55 = multidimensionalCounter54.getDimension();
        int[] intArray56 = multidimensionalCounter54.getSizes();
        int[] intArray58 = multidimensionalCounter54.getCounts((int) 'a');
        int int59 = multidimensionalCounter54.getSize();
        int int60 = multidimensionalCounter54.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator61 = multidimensionalCounter54.iterator();
        int[] intArray63 = multidimensionalCounter54.getCounts(3);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator64 = multidimensionalCounter54.iterator();
        int[] intArray66 = multidimensionalCounter54.getCounts(0);
        int int67 = multidimensionalCounter4.getCount(intArray66);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter68 = new org.apache.commons.math.util.MultidimensionalCounter(intArray66);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[0, 3, 0]");
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts(10);
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getDimension();
        int[] intArray17 = multidimensionalCounter15.getSizes();
        int[] intArray19 = multidimensionalCounter15.getCounts((int) 'a');
        int int20 = multidimensionalCounter15.getSize();
        int int21 = multidimensionalCounter15.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter15.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter15.iterator();
        int int24 = multidimensionalCounter15.getDimension();
        int[] intArray26 = multidimensionalCounter15.getCounts(0);
        int int27 = multidimensionalCounter4.getCount(intArray26);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator28 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(iterator28);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getSize();
        int[] intArray14 = multidimensionalCounter12.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter12.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter12.iterator();
        int int17 = multidimensionalCounter12.getSize();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter22.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        int[] intArray30 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter31 = new org.apache.commons.math.util.MultidimensionalCounter(intArray30);
        int int32 = multidimensionalCounter31.getDimension();
        int[] intArray34 = multidimensionalCounter31.getCounts((int) (short) 10);
        int int35 = multidimensionalCounter22.getCount(intArray34);
        int int36 = multidimensionalCounter12.getCount(intArray34);
        int int37 = multidimensionalCounter4.getCount(intArray34);
        int int38 = multidimensionalCounter4.getSize();
        int[] intArray39 = multidimensionalCounter4.getSizes();
        int int40 = multidimensionalCounter4.getSize();
        int[] intArray42 = multidimensionalCounter4.getCounts((int) '4');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator43 = multidimensionalCounter4.iterator();
        int int44 = iterator43.getCount();
        // The following exception was thrown during execution in test generation
        try {
            iterator43.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray9 = multidimensionalCounter4.getCounts(0);
        int[] intArray10 = multidimensionalCounter4.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter13.iterator();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getDimension();
        int[] intArray25 = multidimensionalCounter22.getCounts((int) (short) 10);
        int int26 = multidimensionalCounter13.getCount(intArray25);
        int int27 = multidimensionalCounter7.getCount(intArray25);
        int int28 = multidimensionalCounter7.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator29 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter7.iterator();
        int[] intArray34 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter35 = new org.apache.commons.math.util.MultidimensionalCounter(intArray34);
        int int36 = multidimensionalCounter35.getDimension();
        int[] intArray37 = multidimensionalCounter35.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator38 = multidimensionalCounter35.iterator();
        int[] intArray39 = multidimensionalCounter35.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator40 = multidimensionalCounter35.iterator();
        int[] intArray44 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter45 = new org.apache.commons.math.util.MultidimensionalCounter(intArray44);
        int[] intArray47 = multidimensionalCounter45.getCounts((int) '#');
        java.util.Spliterator<java.lang.Integer> intSpliterator48 = multidimensionalCounter45.spliterator();
        int[] intArray52 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter53 = new org.apache.commons.math.util.MultidimensionalCounter(intArray52);
        int int54 = multidimensionalCounter53.getDimension();
        int int55 = multidimensionalCounter53.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator56 = multidimensionalCounter53.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator57 = multidimensionalCounter53.spliterator();
        int[] intArray59 = multidimensionalCounter53.getCounts((int) (byte) 1);
        int[] intArray63 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter64 = new org.apache.commons.math.util.MultidimensionalCounter(intArray63);
        int int65 = multidimensionalCounter64.getDimension();
        int[] intArray66 = multidimensionalCounter64.getSizes();
        int[] intArray68 = multidimensionalCounter64.getCounts((int) 'a');
        int[] intArray70 = multidimensionalCounter64.getCounts((int) 'a');
        int int71 = multidimensionalCounter53.getCount(intArray70);
        int int72 = multidimensionalCounter45.getCount(intArray70);
        int[] intArray74 = multidimensionalCounter45.getCounts((int) (byte) 0);
        int int75 = multidimensionalCounter35.getCount(intArray74);
        int int76 = multidimensionalCounter7.getCount(intArray74);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intSpliterator29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intSpliterator48);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(intSpliterator57);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 97 + "'", int71 == 97);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int int9 = iterator7.getCount(1);
        boolean boolean10 = iterator7.hasNext();
        boolean boolean11 = iterator7.hasNext();
        int[] intArray12 = iterator7.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, -1]");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        boolean boolean10 = iterator9.hasNext();
        int[] intArray11 = iterator9.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            iterator9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, -1]");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getCounts((int) (byte) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int int11 = multidimensionalCounter4.getSize();
        int int12 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter7.spliterator();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter7.iterator();
        int int12 = multidimensionalCounter7.getDimension();
        int int13 = multidimensionalCounter7.getSize();
        int int14 = multidimensionalCounter7.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) 'a');
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter7.spliterator();
        int[] intArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = multidimensionalCounter7.getCount(intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intSpliterator11);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getSize();
        int[] intArray16 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter14.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter14.iterator();
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getDimension();
        int[] intArray26 = multidimensionalCounter23.getCounts((int) (short) 10);
        int int27 = multidimensionalCounter14.getCount(intArray26);
        int int28 = multidimensionalCounter4.getCount(intArray26);
        int int29 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter4.iterator();
        boolean boolean31 = iterator30.hasNext();
        int int32 = iterator30.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter7.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter7.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intSpliterator12);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter7.spliterator();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        int int12 = multidimensionalCounter11.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = multidimensionalCounter11.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = multidimensionalCounter4.getSize();
        int int13 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter4.iterator();
        int[] intArray17 = iterator16.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, -1]");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getSize();
        int[] intArray14 = multidimensionalCounter12.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter12.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter12.iterator();
        int int17 = multidimensionalCounter12.getSize();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter22.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        int[] intArray30 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter31 = new org.apache.commons.math.util.MultidimensionalCounter(intArray30);
        int int32 = multidimensionalCounter31.getDimension();
        int[] intArray34 = multidimensionalCounter31.getCounts((int) (short) 10);
        int int35 = multidimensionalCounter22.getCount(intArray34);
        int int36 = multidimensionalCounter12.getCount(intArray34);
        int int37 = multidimensionalCounter4.getCount(intArray34);
        int int38 = multidimensionalCounter4.getSize();
        int int39 = multidimensionalCounter4.getSize();
        int[] intArray40 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator41 = multidimensionalCounter4.iterator();
        int[] intArray42 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[32, 10, 1]");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts((int) (short) 10);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        int[] intArray18 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator21 = multidimensionalCounter4.spliterator();
        int int22 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertNotNull(intSpliterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int int10 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter13.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter13.iterator();
        int[] intArray17 = multidimensionalCounter13.getCounts((int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[3, 2, 0]");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray5 = multidimensionalCounter4.getSizes();
        int int6 = multidimensionalCounter4.getSize();
        int[] intArray8 = multidimensionalCounter4.getCounts(4);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 4, 0]");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int13 = multidimensionalCounter4.getSize();
        int int14 = multidimensionalCounter4.getSize();
        int[] intArray16 = multidimensionalCounter4.getCounts((int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[5, 2, 0]");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int[] intArray10 = multidimensionalCounter4.getCounts(10);
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getSize();
        int[] intArray19 = multidimensionalCounter17.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter20 = new org.apache.commons.math.util.MultidimensionalCounter(intArray19);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter20.iterator();
        int[] intArray25 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter26 = new org.apache.commons.math.util.MultidimensionalCounter(intArray25);
        int int27 = multidimensionalCounter26.getDimension();
        int[] intArray29 = multidimensionalCounter26.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter26.iterator();
        int[] intArray34 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter35 = new org.apache.commons.math.util.MultidimensionalCounter(intArray34);
        int int36 = multidimensionalCounter35.getDimension();
        int[] intArray38 = multidimensionalCounter35.getCounts((int) (short) 10);
        int int39 = multidimensionalCounter26.getCount(intArray38);
        int int40 = multidimensionalCounter20.getCount(intArray38);
        int int41 = multidimensionalCounter4.getCount(intArray38);
        int int42 = multidimensionalCounter4.getDimension();
        int[] intArray43 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter44 = new org.apache.commons.math.util.MultidimensionalCounter(intArray43);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[32, 10, 1]");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int int7 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter10.iterator();
        int int12 = multidimensionalCounter10.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter10.iterator();
        boolean boolean14 = iterator13.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = iterator13.getCount(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int[] intArray10 = multidimensionalCounter4.getCounts(10);
        int[] intArray12 = multidimensionalCounter4.getCounts(1);
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter4.iterator();
        int[] intArray16 = multidimensionalCounter4.getCounts((int) '#');
        int[] intArray20 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter21 = new org.apache.commons.math.util.MultidimensionalCounter(intArray20);
        int int22 = multidimensionalCounter21.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter21.iterator();
        int[] intArray24 = multidimensionalCounter21.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = multidimensionalCounter4.getCount(intArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) '4');
        int[] intArray12 = multidimensionalCounter4.getCounts((int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[3, 2, 0]");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray5 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int int7 = iterator6.getCount();
        int int8 = iterator6.getCount();
        int[] intArray9 = iterator6.getCounts();
        int int10 = iterator6.getCount();
        int[] intArray11 = iterator6.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, -1]");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int int13 = multidimensionalCounter4.getSize();
        int int14 = multidimensionalCounter4.getSize();
        int int15 = multidimensionalCounter4.getDimension();
        int[] intArray17 = multidimensionalCounter4.getCounts((int) (byte) 10);
        int int18 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) 'a');
        int[] intArray11 = multidimensionalCounter7.getSizes();
        int[] intArray12 = multidimensionalCounter7.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int int13 = multidimensionalCounter4.getSize();
        int int14 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int int10 = multidimensionalCounter7.getDimension();
        int int11 = multidimensionalCounter7.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int int11 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int[] intArray13 = iterator12.getCounts();
        java.lang.Class<?> wildcardClass14 = iterator12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray8 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter9 = new org.apache.commons.math.util.MultidimensionalCounter(intArray8);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (byte) 10);
        int int11 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getSize();
        int[] intArray19 = multidimensionalCounter17.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter17.spliterator();
        int[] intArray21 = multidimensionalCounter17.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = multidimensionalCounter4.getCount(intArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getCounts((int) (byte) 10);
        int int10 = multidimensionalCounter4.getDimension();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (short) 10);
        int int13 = multidimensionalCounter4.getSize();
        int[] intArray15 = multidimensionalCounter4.getCounts(4);
        int int16 = multidimensionalCounter4.getDimension();
        int[] intArray17 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 4, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getSize();
        int[] intArray14 = multidimensionalCounter12.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter12.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter12.iterator();
        int int17 = multidimensionalCounter12.getSize();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter22.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        int[] intArray30 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter31 = new org.apache.commons.math.util.MultidimensionalCounter(intArray30);
        int int32 = multidimensionalCounter31.getDimension();
        int[] intArray34 = multidimensionalCounter31.getCounts((int) (short) 10);
        int int35 = multidimensionalCounter22.getCount(intArray34);
        int int36 = multidimensionalCounter12.getCount(intArray34);
        int int37 = multidimensionalCounter4.getCount(intArray34);
        int int38 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator39 = multidimensionalCounter4.iterator();
        int int40 = multidimensionalCounter4.getDimension();
        int[] intArray42 = multidimensionalCounter4.getCounts(97);
        int int43 = multidimensionalCounter4.getDimension();
        int int44 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getSize();
        int[] intArray14 = multidimensionalCounter12.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter12.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter12.iterator();
        int int17 = multidimensionalCounter12.getSize();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter22.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        int[] intArray30 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter31 = new org.apache.commons.math.util.MultidimensionalCounter(intArray30);
        int int32 = multidimensionalCounter31.getDimension();
        int[] intArray34 = multidimensionalCounter31.getCounts((int) (short) 10);
        int int35 = multidimensionalCounter22.getCount(intArray34);
        int int36 = multidimensionalCounter12.getCount(intArray34);
        int int37 = multidimensionalCounter4.getCount(intArray34);
        int int38 = multidimensionalCounter4.getSize();
        int int39 = multidimensionalCounter4.getSize();
        int[] intArray40 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator41 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator42 = multidimensionalCounter4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator42.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator41);
        org.junit.Assert.assertNotNull(iterator42);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int int8 = iterator7.getCount();
        int[] intArray9 = iterator7.getCounts();
        int int10 = iterator7.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        int int11 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int13 = multidimensionalCounter4.getDimension();
        int[] intArray15 = multidimensionalCounter4.getCounts(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0]");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int[] intArray12 = multidimensionalCounter11.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter11.spliterator();
        int[] intArray15 = multidimensionalCounter11.getCounts(97);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[9, 7, 0]");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int int13 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        int int15 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int int10 = multidimensionalCounter4.getSize();
        int int11 = multidimensionalCounter4.getDimension();
        int int12 = multidimensionalCounter4.getSize();
        int int13 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        int int15 = multidimensionalCounter4.getDimension();
        int int16 = multidimensionalCounter4.getSize();
        int[] intArray18 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0]");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = iterator11.getCount((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int int8 = iterator7.getCount();
        boolean boolean9 = iterator7.hasNext();
        int int11 = iterator7.getCount((int) (short) 1);
        int[] intArray12 = iterator7.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = iterator7.getCount((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, -1]");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getCounts(0);
        int int12 = multidimensionalCounter4.getSize();
        int[] intArray14 = multidimensionalCounter4.getCounts((int) (byte) 100);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        int int16 = multidimensionalCounter4.getDimension();
        int[] intArray17 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter10.spliterator();
        int int12 = multidimensionalCounter10.getSize();
        int[] intArray13 = multidimensionalCounter10.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter7.spliterator();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter7.iterator();
        int int13 = multidimensionalCounter7.getSize();
        int[] intArray15 = multidimensionalCounter7.getCounts(2);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter7.iterator();
        int[] intArray18 = multidimensionalCounter7.getCounts((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 2, 0]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 0, 0]");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int int10 = multidimensionalCounter4.getSize();
        int int11 = multidimensionalCounter4.getDimension();
        int int12 = multidimensionalCounter4.getSize();
        int int13 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter4.iterator();
        int[] intArray15 = iterator14.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, -1]");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter7.spliterator();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter7.iterator();
        int int12 = multidimensionalCounter7.getDimension();
        int[] intArray13 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.iterator();
        boolean boolean15 = iterator14.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int int12 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter4.spliterator();
        int int14 = multidimensionalCounter4.getSize();
        int int15 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) '4');
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter4.iterator();
        int int15 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        int int8 = multidimensionalCounter4.getSize();
        java.lang.Class<?> wildcardClass9 = multidimensionalCounter4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        int int11 = multidimensionalCounter10.getDimension();
        int[] intArray13 = multidimensionalCounter10.getCounts((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 0]");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter13.iterator();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getDimension();
        int[] intArray25 = multidimensionalCounter22.getCounts((int) (short) 10);
        int int26 = multidimensionalCounter13.getCount(intArray25);
        int int27 = multidimensionalCounter7.getCount(intArray25);
        int int28 = multidimensionalCounter7.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator29 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter7.iterator();
        int int31 = iterator30.getCount();
        int[] intArray32 = iterator30.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intSpliterator29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, -1]");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int int7 = multidimensionalCounter4.getDimension();
        int int8 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(intSpliterator9);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int int11 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int[] intArray14 = multidimensionalCounter4.getCounts((int) (short) 1);
        int int15 = multidimensionalCounter4.getDimension();
        int[] intArray17 = multidimensionalCounter4.getCounts((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 0, 0]");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int int12 = multidimensionalCounter11.getDimension();
        int[] intArray13 = multidimensionalCounter11.getSizes();
        int int14 = multidimensionalCounter11.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter11.iterator();
        int[] intArray17 = multidimensionalCounter11.getCounts(100);
        int[] intArray19 = multidimensionalCounter11.getCounts(32);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[3, 2, 0]");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int int10 = multidimensionalCounter7.getDimension();
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getDimension();
        int[] intArray18 = multidimensionalCounter15.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter15.iterator();
        int[] intArray20 = multidimensionalCounter15.getSizes();
        int int21 = multidimensionalCounter15.getSize();
        int[] intArray22 = multidimensionalCounter15.getSizes();
        int[] intArray23 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter24 = new org.apache.commons.math.util.MultidimensionalCounter(intArray23);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray23);
        int[] intArray29 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter30 = new org.apache.commons.math.util.MultidimensionalCounter(intArray29);
        int int31 = multidimensionalCounter30.getSize();
        int[] intArray32 = multidimensionalCounter30.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator33 = multidimensionalCounter30.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator34 = multidimensionalCounter30.iterator();
        int int35 = multidimensionalCounter30.getSize();
        int[] intArray36 = multidimensionalCounter30.getSizes();
        int[] intArray38 = multidimensionalCounter30.getCounts((int) (byte) 1);
        int int39 = multidimensionalCounter25.getCount(intArray38);
        int int40 = multidimensionalCounter7.getCount(intArray38);
        java.util.Spliterator<java.lang.Integer> intSpliterator41 = multidimensionalCounter7.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray43 = multidimensionalCounter7.getCounts((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: -1 out of [0, 320] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(intSpliterator41);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts((int) (short) 10);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        int[] intArray18 = multidimensionalCounter4.getSizes();
        int[] intArray19 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter20 = new org.apache.commons.math.util.MultidimensionalCounter(intArray19);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        int int11 = multidimensionalCounter4.getSize();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        int[] intArray4 = new int[] { '#', (byte) -1, (short) 1, (short) -1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter5 = new org.apache.commons.math.util.MultidimensionalCounter(intArray4);
        int int6 = multidimensionalCounter5.getDimension();
        int int7 = multidimensionalCounter5.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter5.iterator();
        int int9 = multidimensionalCounter5.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter5.iterator();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, -1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter8 = new org.apache.commons.math.util.MultidimensionalCounter(intArray7);
        int[] intArray10 = multidimensionalCounter8.getCounts((int) 'a');
        int[] intArray12 = multidimensionalCounter8.getCounts(0);
        int int13 = multidimensionalCounter8.getSize();
        int int14 = multidimensionalCounter8.getDimension();
        int[] intArray16 = multidimensionalCounter8.getCounts((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        int int12 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 3, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getSize();
        int[] intArray15 = multidimensionalCounter13.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter13.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter13.iterator();
        int int18 = multidimensionalCounter13.getSize();
        int[] intArray20 = multidimensionalCounter13.getCounts((int) (byte) 1);
        java.util.Spliterator<java.lang.Integer> intSpliterator21 = multidimensionalCounter13.spliterator();
        int[] intArray23 = multidimensionalCounter13.getCounts((int) (byte) 1);
        int int24 = multidimensionalCounter4.getCount(intArray23);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intSpliterator21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray9 = iterator8.getCounts();
        int int10 = iterator8.getCount();
        boolean boolean11 = iterator8.hasNext();
        boolean boolean12 = iterator8.hasNext();
        int int13 = iterator8.getCount();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = iterator8.getCount((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray5 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray9 = multidimensionalCounter4.getCounts(10);
        int int10 = multidimensionalCounter4.getSize();
        int int11 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int[] intArray13 = multidimensionalCounter4.getSizes();
        java.lang.Class<?> wildcardClass14 = multidimensionalCounter4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int int10 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int13 = multidimensionalCounter4.getDimension();
        int[] intArray15 = multidimensionalCounter4.getCounts(0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0]");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter11.iterator();
        int int13 = multidimensionalCounter11.getDimension();
        int int14 = multidimensionalCounter11.getSize();
        int[] intArray15 = multidimensionalCounter11.getSizes();
        int[] intArray17 = multidimensionalCounter11.getCounts(1);
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getDimension();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        int int25 = multidimensionalCounter22.getDimension();
        int[] intArray26 = multidimensionalCounter22.getSizes();
        int[] intArray28 = multidimensionalCounter22.getCounts((int) (byte) 100);
        int int29 = multidimensionalCounter11.getCount(intArray28);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int int12 = multidimensionalCounter11.getDimension();
        int[] intArray13 = multidimensionalCounter11.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter11.spliterator();
        int[] intArray18 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter19 = new org.apache.commons.math.util.MultidimensionalCounter(intArray18);
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter19.spliterator();
        int int21 = multidimensionalCounter19.getSize();
        int[] intArray23 = multidimensionalCounter19.getCounts((int) (short) 100);
        int int24 = multidimensionalCounter11.getCount(intArray23);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getSize();
        int[] intArray14 = multidimensionalCounter12.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter12.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter12.iterator();
        int int17 = multidimensionalCounter12.getSize();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter22.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        int[] intArray30 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter31 = new org.apache.commons.math.util.MultidimensionalCounter(intArray30);
        int int32 = multidimensionalCounter31.getDimension();
        int[] intArray34 = multidimensionalCounter31.getCounts((int) (short) 10);
        int int35 = multidimensionalCounter22.getCount(intArray34);
        int int36 = multidimensionalCounter12.getCount(intArray34);
        int int37 = multidimensionalCounter4.getCount(intArray34);
        int int38 = multidimensionalCounter4.getSize();
        int[] intArray39 = multidimensionalCounter4.getSizes();
        int int40 = multidimensionalCounter4.getSize();
        int[] intArray41 = multidimensionalCounter4.getSizes();
        int[] intArray43 = multidimensionalCounter4.getCounts(0);
        java.util.Spliterator<java.lang.Integer> intSpliterator44 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator45 = multidimensionalCounter4.iterator();
        int[] intArray46 = iterator45.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator44);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, -1]");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getSize();
        int[] intArray14 = multidimensionalCounter12.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter12.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter12.iterator();
        int int17 = multidimensionalCounter12.getSize();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter22.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        int[] intArray30 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter31 = new org.apache.commons.math.util.MultidimensionalCounter(intArray30);
        int int32 = multidimensionalCounter31.getDimension();
        int[] intArray34 = multidimensionalCounter31.getCounts((int) (short) 10);
        int int35 = multidimensionalCounter22.getCount(intArray34);
        int int36 = multidimensionalCounter12.getCount(intArray34);
        int int37 = multidimensionalCounter4.getCount(intArray34);
        java.util.Spliterator<java.lang.Integer> intSpliterator38 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator39 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator40 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(intSpliterator38);
        org.junit.Assert.assertNotNull(intSpliterator39);
        org.junit.Assert.assertNotNull(intSpliterator40);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter7.spliterator();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int int10 = multidimensionalCounter7.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }
}

