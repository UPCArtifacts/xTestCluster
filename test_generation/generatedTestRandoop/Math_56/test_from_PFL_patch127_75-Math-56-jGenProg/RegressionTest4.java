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
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = iterator8.getCount();
        boolean boolean10 = iterator8.hasNext();
        int int11 = iterator8.getCount();
        // The following exception was thrown during execution in test generation
        try {
            iterator8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        int[] intArray14 = multidimensionalCounter4.getCounts(3);
        int[] intArray16 = multidimensionalCounter4.getCounts(0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 3, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0]");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        java.lang.Class<?> wildcardClass13 = iterator12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray8 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter9 = new org.apache.commons.math.util.MultidimensionalCounter(intArray8);
        int int10 = multidimensionalCounter9.getSize();
        int[] intArray11 = multidimensionalCounter9.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter9.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter9.iterator();
        int[] intArray15 = multidimensionalCounter9.getCounts((int) (short) 10);
        int[] intArray17 = multidimensionalCounter9.getCounts((int) (byte) 100);
        int[] intArray19 = multidimensionalCounter9.getCounts(100);
        int int20 = multidimensionalCounter4.getCount(intArray19);
        int[] intArray22 = multidimensionalCounter4.getCounts((int) '4');
        int[] intArray23 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter4.iterator();
        int[] intArray25 = iterator24.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 320 + "'", int10 == 320);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, -1]");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        java.lang.Class<?> wildcardClass14 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
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
        int[] intArray8 = multidimensionalCounter7.getSizes();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int int10 = multidimensionalCounter7.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter7.spliterator();
        java.lang.Class<?> wildcardClass12 = multidimensionalCounter7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter4.spliterator();
        int[] intArray21 = multidimensionalCounter4.getSizes();
        int[] intArray25 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter26 = new org.apache.commons.math.util.MultidimensionalCounter(intArray25);
        int int27 = multidimensionalCounter26.getSize();
        int[] intArray28 = multidimensionalCounter26.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator29 = multidimensionalCounter26.spliterator();
        int int30 = multidimensionalCounter26.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator31 = multidimensionalCounter26.iterator();
        int[] intArray32 = multidimensionalCounter26.getSizes();
        int int33 = multidimensionalCounter26.getSize();
        int[] intArray35 = multidimensionalCounter26.getCounts((int) ' ');
        int int36 = multidimensionalCounter4.getCount(intArray35);
        int[] intArray38 = multidimensionalCounter4.getCounts(2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 320 + "'", int27 == 320);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 320 + "'", int33 == 320);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[3, 2, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 2, 0]");
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
        int[] intArray9 = multidimensionalCounter4.getCounts((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = multidimensionalCounter4.getCounts(10240);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 10,240 out of [0, 320] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[3, 2, 0]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter4.iterator();
        int[] intArray17 = iterator16.getCounts();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, -1]");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int[] intArray8 = multidimensionalCounter7.getSizes();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter7.iterator();
        int int12 = multidimensionalCounter7.getDimension();
        int int13 = multidimensionalCounter7.getDimension();
        int[] intArray14 = multidimensionalCounter7.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray8 = multidimensionalCounter4.getSizes();
        int int9 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intSpliterator10);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int int12 = multidimensionalCounter4.getSize();
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter17.iterator();
        int int22 = multidimensionalCounter17.getDimension();
        int[] intArray24 = multidimensionalCounter17.getCounts((int) '4');
        int int25 = multidimensionalCounter17.getSize();
        int[] intArray27 = multidimensionalCounter17.getCounts(0);
        int[] intArray31 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter32 = new org.apache.commons.math.util.MultidimensionalCounter(intArray31);
        int int33 = multidimensionalCounter32.getDimension();
        int int34 = multidimensionalCounter32.getDimension();
        int[] intArray36 = multidimensionalCounter32.getCounts(0);
        int int37 = multidimensionalCounter32.getSize();
        int[] intArray38 = multidimensionalCounter32.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator39 = multidimensionalCounter32.spliterator();
        int int40 = multidimensionalCounter32.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator41 = multidimensionalCounter32.spliterator();
        int int42 = multidimensionalCounter32.getDimension();
        int[] intArray46 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter47 = new org.apache.commons.math.util.MultidimensionalCounter(intArray46);
        int int48 = multidimensionalCounter47.getDimension();
        int[] intArray50 = multidimensionalCounter47.getCounts((int) (byte) 100);
        int[] intArray54 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter55 = new org.apache.commons.math.util.MultidimensionalCounter(intArray54);
        int int56 = multidimensionalCounter55.getDimension();
        int[] intArray58 = multidimensionalCounter55.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator59 = multidimensionalCounter55.iterator();
        int[] intArray63 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter64 = new org.apache.commons.math.util.MultidimensionalCounter(intArray63);
        int int65 = multidimensionalCounter64.getDimension();
        int[] intArray67 = multidimensionalCounter64.getCounts(1);
        int int68 = multidimensionalCounter55.getCount(intArray67);
        java.util.Spliterator<java.lang.Integer> intSpliterator69 = multidimensionalCounter55.spliterator();
        int[] intArray73 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter74 = new org.apache.commons.math.util.MultidimensionalCounter(intArray73);
        int int75 = multidimensionalCounter74.getSize();
        int[] intArray76 = multidimensionalCounter74.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator77 = multidimensionalCounter74.spliterator();
        int int78 = multidimensionalCounter74.getDimension();
        int[] intArray80 = multidimensionalCounter74.getCounts((int) (byte) 1);
        int int81 = multidimensionalCounter55.getCount(intArray80);
        int[] intArray85 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter86 = new org.apache.commons.math.util.MultidimensionalCounter(intArray85);
        int int87 = multidimensionalCounter86.getSize();
        int[] intArray88 = multidimensionalCounter86.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator89 = multidimensionalCounter86.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator90 = multidimensionalCounter86.iterator();
        int[] intArray92 = multidimensionalCounter86.getCounts((int) (short) 10);
        int[] intArray94 = multidimensionalCounter86.getCounts((int) (byte) 100);
        int int95 = multidimensionalCounter55.getCount(intArray94);
        int int96 = multidimensionalCounter47.getCount(intArray94);
        int int97 = multidimensionalCounter32.getCount(intArray94);
        int int98 = multidimensionalCounter17.getCount(intArray94);
        int int99 = multidimensionalCounter4.getCount(intArray94);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 320 + "'", int12 == 320);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 320 + "'", int25 == 320);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 320 + "'", int37 == 320);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(intSpliterator41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(intSpliterator69);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 320 + "'", int75 == 320);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 3 + "'", int78 == 3);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 320 + "'", int87 == 320);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator89);
        org.junit.Assert.assertNotNull(iterator90);
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 100 + "'", int95 == 100);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 100 + "'", int96 == 100);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 100 + "'", int97 == 100);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 100 + "'", int98 == 100);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 100 + "'", int99 == 100);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (short) 10);
        int[] intArray12 = multidimensionalCounter4.getCounts(0);
        int[] intArray14 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        int[] intArray17 = multidimensionalCounter4.getCounts(2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 2, 0]");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        boolean boolean9 = iterator8.hasNext();
        int int11 = iterator8.getCount((int) (short) 1);
        int[] intArray12 = iterator8.getCounts();
        boolean boolean13 = iterator8.hasNext();
        int[] intArray14 = iterator8.getCounts();
        int[] intArray15 = iterator8.getCounts();
        int int16 = iterator8.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter4.spliterator();
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getSize();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator26 = multidimensionalCounter23.spliterator();
        int int27 = multidimensionalCounter23.getDimension();
        int[] intArray29 = multidimensionalCounter23.getCounts((int) (byte) 1);
        int int30 = multidimensionalCounter4.getCount(intArray29);
        int[] intArray31 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter32 = new org.apache.commons.math.util.MultidimensionalCounter(intArray31);
        java.util.Spliterator<java.lang.Integer> intSpliterator33 = multidimensionalCounter32.spliterator();
        int int34 = multidimensionalCounter32.getSize();
        int[] intArray35 = multidimensionalCounter32.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator36 = multidimensionalCounter32.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 320 + "'", int24 == 320);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 320 + "'", int34 == 320);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator36);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int int6 = multidimensionalCounter4.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 320 + "'", int6 == 320);
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
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int int12 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = iterator13.getCount((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 320 + "'", int12 == 320);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int int12 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        int[] intArray14 = iterator13.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            iterator13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 320 + "'", int12 == 320);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, -1]");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray9 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int13 = multidimensionalCounter4.getSize();
        int[] intArray14 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 320 + "'", int13 == 320);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
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
        int[] intArray12 = multidimensionalCounter4.getCounts((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[3, 5, 0]");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getCounts(52);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        int int14 = multidimensionalCounter4.getDimension();
        int[] intArray16 = multidimensionalCounter4.getCounts(10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = multidimensionalCounter4.getCounts((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: -1 out of [0, 320] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator17);
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
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int int13 = multidimensionalCounter4.getDimension();
        int[] intArray14 = multidimensionalCounter4.getSizes();
        int int15 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getSize();
        int[] intArray16 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter14.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter14.iterator();
        int[] intArray20 = multidimensionalCounter14.getCounts((int) (short) 10);
        int[] intArray22 = multidimensionalCounter14.getCounts((int) (byte) 100);
        int int23 = multidimensionalCounter4.getCount(intArray22);
        int int24 = multidimensionalCounter4.getSize();
        int[] intArray25 = multidimensionalCounter4.getSizes();
        int int26 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 320 + "'", int24 == 320);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 320 + "'", int26 == 320);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        int[] intArray19 = multidimensionalCounter4.getCounts((int) '4');
        int int20 = multidimensionalCounter4.getDimension();
        int int21 = multidimensionalCounter4.getDimension();
        int[] intArray23 = multidimensionalCounter4.getCounts((int) (short) 1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter4.iterator();
        int[] intArray28 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter29 = new org.apache.commons.math.util.MultidimensionalCounter(intArray28);
        int[] intArray33 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter34 = new org.apache.commons.math.util.MultidimensionalCounter(intArray33);
        int int35 = multidimensionalCounter34.getSize();
        int[] intArray36 = multidimensionalCounter34.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator37 = multidimensionalCounter34.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator38 = multidimensionalCounter34.iterator();
        int[] intArray40 = multidimensionalCounter34.getCounts((int) (short) 10);
        int[] intArray42 = multidimensionalCounter34.getCounts((int) (byte) 100);
        int[] intArray44 = multidimensionalCounter34.getCounts(100);
        int int45 = multidimensionalCounter29.getCount(intArray44);
        int[] intArray47 = multidimensionalCounter29.getCounts((int) '4');
        int[] intArray48 = multidimensionalCounter29.getSizes();
        int[] intArray52 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter53 = new org.apache.commons.math.util.MultidimensionalCounter(intArray52);
        int int54 = multidimensionalCounter53.getSize();
        int[] intArray56 = multidimensionalCounter53.getCounts((int) (byte) 1);
        int[] intArray58 = multidimensionalCounter53.getCounts((int) (byte) 100);
        int[] intArray60 = multidimensionalCounter53.getCounts((int) ' ');
        int int61 = multidimensionalCounter29.getCount(intArray60);
        int[] intArray63 = multidimensionalCounter29.getCounts(10);
        int int64 = multidimensionalCounter4.getCount(intArray63);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 320 + "'", int35 == 320);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 320 + "'", int54 == 320);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[3, 2, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 32 + "'", int61 == 32);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int int10 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter13.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter13.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int int10 = multidimensionalCounter4.getDimension();
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getSize();
        int[] intArray17 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter15.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter15.iterator();
        int[] intArray21 = multidimensionalCounter15.getCounts((int) (short) 10);
        int[] intArray23 = multidimensionalCounter15.getCounts((int) (byte) 100);
        int int24 = multidimensionalCounter4.getCount(intArray23);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter4.iterator();
        int[] intArray26 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator27 = multidimensionalCounter4.iterator();
        int int28 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 320 + "'", int16 == 320);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 320 + "'", int28 == 320);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        int[] intArray11 = multidimensionalCounter4.getCounts(4);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 4, 0]");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter5 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator6 = multidimensionalCounter5.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter5.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter5.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        int int10 = multidimensionalCounter7.getSize();
        int int11 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter7.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 320 + "'", int10 == 320);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter7.spliterator();
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getDimension();
        int int17 = multidimensionalCounter15.getDimension();
        int[] intArray19 = multidimensionalCounter15.getCounts(0);
        int int20 = multidimensionalCounter15.getSize();
        int[] intArray21 = multidimensionalCounter15.getSizes();
        int[] intArray22 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getDimension();
        int[] intArray26 = multidimensionalCounter23.getCounts(52);
        int int27 = multidimensionalCounter7.getCount(intArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = multidimensionalCounter7.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 320 + "'", int20 == 320);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getSize();
        int[] intArray19 = multidimensionalCounter17.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter17.iterator();
        int int22 = multidimensionalCounter17.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator23 = multidimensionalCounter17.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter17.iterator();
        int int25 = multidimensionalCounter17.getDimension();
        int int26 = multidimensionalCounter17.getDimension();
        int[] intArray27 = multidimensionalCounter17.getSizes();
        int int28 = multidimensionalCounter17.getDimension();
        int[] intArray30 = multidimensionalCounter17.getCounts(0);
        int int31 = multidimensionalCounter4.getCount(intArray30);
        int[] intArray33 = multidimensionalCounter4.getCounts(0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 320 + "'", int18 == 320);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 320 + "'", int22 == 320);
        org.junit.Assert.assertNotNull(intSpliterator23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0]");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getSize();
        int[] intArray19 = multidimensionalCounter17.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter17.iterator();
        int[] intArray25 = multidimensionalCounter17.getCounts(100);
        int int26 = multidimensionalCounter4.getCount(intArray25);
        int int27 = multidimensionalCounter4.getSize();
        int[] intArray28 = multidimensionalCounter4.getSizes();
        int int29 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator30.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 320 + "'", int18 == 320);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 320 + "'", int27 == 320);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(iterator30);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        boolean boolean12 = iterator11.hasNext();
        int int13 = iterator11.getCount();
        int[] intArray14 = iterator11.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, -1]");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int[] intArray8 = multidimensionalCounter7.getSizes();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter7.iterator();
        int int11 = multidimensionalCounter7.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 320 + "'", int12 == 320);
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(intSpliterator14);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter4.spliterator();
        int[] intArray21 = multidimensionalCounter4.getSizes();
        int[] intArray25 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter26 = new org.apache.commons.math.util.MultidimensionalCounter(intArray25);
        int int27 = multidimensionalCounter26.getSize();
        int[] intArray28 = multidimensionalCounter26.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator29 = multidimensionalCounter26.spliterator();
        int int30 = multidimensionalCounter26.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator31 = multidimensionalCounter26.iterator();
        int[] intArray32 = multidimensionalCounter26.getSizes();
        int int33 = multidimensionalCounter26.getSize();
        int[] intArray35 = multidimensionalCounter26.getCounts((int) ' ');
        int int36 = multidimensionalCounter4.getCount(intArray35);
        int int37 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator38 = multidimensionalCounter4.iterator();
        int[] intArray42 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter43 = new org.apache.commons.math.util.MultidimensionalCounter(intArray42);
        int int44 = multidimensionalCounter43.getDimension();
        int[] intArray46 = multidimensionalCounter43.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator47 = multidimensionalCounter43.iterator();
        int[] intArray51 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter52 = new org.apache.commons.math.util.MultidimensionalCounter(intArray51);
        int int53 = multidimensionalCounter52.getDimension();
        int[] intArray55 = multidimensionalCounter52.getCounts(1);
        int int56 = multidimensionalCounter43.getCount(intArray55);
        java.util.Spliterator<java.lang.Integer> intSpliterator57 = multidimensionalCounter43.spliterator();
        int[] intArray61 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter62 = new org.apache.commons.math.util.MultidimensionalCounter(intArray61);
        int int63 = multidimensionalCounter62.getSize();
        int[] intArray64 = multidimensionalCounter62.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator65 = multidimensionalCounter62.spliterator();
        int int66 = multidimensionalCounter62.getDimension();
        int[] intArray68 = multidimensionalCounter62.getCounts((int) (byte) 1);
        int int69 = multidimensionalCounter43.getCount(intArray68);
        int[] intArray70 = multidimensionalCounter43.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter71 = new org.apache.commons.math.util.MultidimensionalCounter(intArray70);
        java.util.Spliterator<java.lang.Integer> intSpliterator72 = multidimensionalCounter71.spliterator();
        int int73 = multidimensionalCounter71.getSize();
        int[] intArray74 = multidimensionalCounter71.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int75 = multidimensionalCounter4.getCount(intArray74);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 320 + "'", int27 == 320);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 320 + "'", int33 == 320);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[3, 2, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(intSpliterator57);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 320 + "'", int63 == 320);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 320 + "'", int73 == 320);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[32, 10, 1]");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        int[] intArray14 = multidimensionalCounter11.getCounts((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0]");
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
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getSize();
        int[] intArray17 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter15.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter15.iterator();
        int[] intArray21 = multidimensionalCounter15.getCounts((int) (short) 10);
        int int22 = multidimensionalCounter4.getCount(intArray21);
        int[] intArray24 = multidimensionalCounter4.getCounts(0);
        int[] intArray26 = multidimensionalCounter4.getCounts(52);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator27 = multidimensionalCounter4.iterator();
        int int28 = multidimensionalCounter4.getDimension();
        int int29 = multidimensionalCounter4.getDimension();
        int[] intArray31 = multidimensionalCounter4.getCounts((int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 320 + "'", int16 == 320);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[3, 2, 0]");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray8 = iterator7.getCounts();
        int int9 = iterator7.getCount();
        int[] intArray10 = iterator7.getCounts();
        int int12 = iterator7.getCount(2);
        // The following exception was thrown during execution in test generation
        try {
            iterator7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter4.spliterator();
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getSize();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator26 = multidimensionalCounter23.spliterator();
        int int27 = multidimensionalCounter23.getDimension();
        int[] intArray29 = multidimensionalCounter23.getCounts((int) (byte) 1);
        int int30 = multidimensionalCounter4.getCount(intArray29);
        int[] intArray31 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator32 = multidimensionalCounter4.spliterator();
        int[] intArray33 = multidimensionalCounter4.getSizes();
        int[] intArray34 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator35 = multidimensionalCounter4.iterator();
        boolean boolean36 = iterator35.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 320 + "'", int24 == 320);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int13 = iterator11.getCount(0);
        boolean boolean14 = iterator11.hasNext();
        int int15 = iterator11.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int int10 = multidimensionalCounter4.getDimension();
        int int11 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int13 = iterator12.getCount();
        int int15 = iterator12.getCount(1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = iterator12.getCount(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getDimension();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = multidimensionalCounter4.getCounts(320);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 320 out of [0, 320] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getSize();
        int[] intArray15 = multidimensionalCounter13.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter13.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter13.iterator();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getDimension();
        int[] intArray25 = multidimensionalCounter22.getCounts(1);
        int int26 = multidimensionalCounter13.getCount(intArray25);
        int int27 = multidimensionalCounter4.getCount(intArray25);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator28 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator29 = multidimensionalCounter4.spliterator();
        int int30 = multidimensionalCounter4.getDimension();
        int[] intArray31 = multidimensionalCounter4.getSizes();
        int[] intArray32 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 320 + "'", int14 == 320);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(intSpliterator29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[32, 10, 1]");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getDimension();
        int int14 = multidimensionalCounter12.getDimension();
        int[] intArray15 = multidimensionalCounter12.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray9 = multidimensionalCounter4.getCounts(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 0]");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getSize();
        int[] intArray16 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter14.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter14.iterator();
        int[] intArray20 = multidimensionalCounter14.getCounts((int) (short) 10);
        int[] intArray22 = multidimensionalCounter14.getCounts((int) (byte) 100);
        int int23 = multidimensionalCounter4.getCount(intArray22);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter4.iterator();
        int[] intArray28 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter29 = new org.apache.commons.math.util.MultidimensionalCounter(intArray28);
        int int30 = multidimensionalCounter29.getSize();
        int[] intArray31 = multidimensionalCounter29.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator32 = multidimensionalCounter29.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator33 = multidimensionalCounter29.iterator();
        int[] intArray35 = multidimensionalCounter29.getCounts((int) (short) 10);
        int int36 = multidimensionalCounter4.getCount(intArray35);
        int int37 = multidimensionalCounter4.getDimension();
        int[] intArray39 = multidimensionalCounter4.getCounts((int) (short) 0);
        int int40 = multidimensionalCounter4.getSize();
        int int41 = multidimensionalCounter4.getDimension();
        int[] intArray45 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter46 = new org.apache.commons.math.util.MultidimensionalCounter(intArray45);
        int int47 = multidimensionalCounter46.getSize();
        int[] intArray48 = multidimensionalCounter46.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter49 = new org.apache.commons.math.util.MultidimensionalCounter(intArray48);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator50 = multidimensionalCounter49.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator51 = multidimensionalCounter49.iterator();
        int int52 = multidimensionalCounter49.getSize();
        int int53 = multidimensionalCounter49.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator54 = multidimensionalCounter49.iterator();
        int[] intArray55 = iterator54.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            int int56 = multidimensionalCounter4.getCount(intArray55);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: -1 out of [0, 0] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 320 + "'", int30 == 320);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 320 + "'", int40 == 320);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 320 + "'", int47 == 320);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 320 + "'", int52 == 320);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 320 + "'", int53 == 320);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 0, -1]");
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
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        int int18 = multidimensionalCounter4.getSize();
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getSize();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter23.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator27 = multidimensionalCounter23.iterator();
        int[] intArray29 = multidimensionalCounter23.getCounts((int) (short) 10);
        int[] intArray31 = multidimensionalCounter23.getCounts(0);
        int[] intArray33 = multidimensionalCounter23.getCounts(0);
        int int34 = multidimensionalCounter4.getCount(intArray33);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator35 = multidimensionalCounter4.iterator();
        int int36 = multidimensionalCounter4.getDimension();
        int[] intArray38 = multidimensionalCounter4.getCounts(32);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 320 + "'", int18 == 320);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 320 + "'", int24 == 320);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[3, 2, 0]");
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
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getDimension();
        int[] intArray14 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int17 = multidimensionalCounter16.getDimension();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getDimension();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        int[] intArray26 = multidimensionalCounter22.getCounts(0);
        int[] intArray28 = multidimensionalCounter22.getCounts((int) (short) 10);
        int int29 = multidimensionalCounter16.getCount(intArray28);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        int int8 = multidimensionalCounter4.getSize();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray14 = multidimensionalCounter4.getCounts(100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 320 + "'", int8 == 320);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0, 0]");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getCounts((int) (byte) 10);
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        int int12 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        int int14 = iterator13.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 3, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getDimension();
        int int14 = multidimensionalCounter12.getDimension();
        int[] intArray16 = multidimensionalCounter12.getCounts(0);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter4.spliterator();
        int[] intArray19 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter4.iterator();
        int[] intArray21 = iterator20.getCounts();
        int[] intArray22 = iterator20.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, -1]");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = iterator11.getCount();
        int[] intArray13 = iterator11.getCounts();
        java.lang.Class<?> wildcardClass14 = iterator11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        int int17 = multidimensionalCounter16.getDimension();
        int[] intArray19 = multidimensionalCounter16.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter16.iterator();
        int int21 = multidimensionalCounter16.getDimension();
        int[] intArray25 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter26 = new org.apache.commons.math.util.MultidimensionalCounter(intArray25);
        int int27 = multidimensionalCounter26.getSize();
        int[] intArray28 = multidimensionalCounter26.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator29 = multidimensionalCounter26.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter26.iterator();
        int[] intArray32 = multidimensionalCounter26.getCounts((int) (short) 10);
        int[] intArray34 = multidimensionalCounter26.getCounts((int) (byte) 100);
        int int35 = multidimensionalCounter16.getCount(intArray34);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator36 = multidimensionalCounter16.iterator();
        int[] intArray40 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter41 = new org.apache.commons.math.util.MultidimensionalCounter(intArray40);
        int int42 = multidimensionalCounter41.getSize();
        int[] intArray43 = multidimensionalCounter41.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator44 = multidimensionalCounter41.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator45 = multidimensionalCounter41.iterator();
        int[] intArray47 = multidimensionalCounter41.getCounts((int) (short) 10);
        int int48 = multidimensionalCounter16.getCount(intArray47);
        int int49 = multidimensionalCounter16.getDimension();
        int[] intArray51 = multidimensionalCounter16.getCounts((int) (short) 0);
        int int52 = multidimensionalCounter4.getCount(intArray51);
        int[] intArray54 = multidimensionalCounter4.getCounts((int) (byte) 10);
        int[] intArray55 = multidimensionalCounter4.getSizes();
        int[] intArray59 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter60 = new org.apache.commons.math.util.MultidimensionalCounter(intArray59);
        int[] intArray64 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter65 = new org.apache.commons.math.util.MultidimensionalCounter(intArray64);
        int int66 = multidimensionalCounter65.getSize();
        int[] intArray67 = multidimensionalCounter65.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator68 = multidimensionalCounter65.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator69 = multidimensionalCounter65.iterator();
        int[] intArray71 = multidimensionalCounter65.getCounts((int) (short) 10);
        int[] intArray73 = multidimensionalCounter65.getCounts((int) (byte) 100);
        int[] intArray75 = multidimensionalCounter65.getCounts(100);
        int int76 = multidimensionalCounter60.getCount(intArray75);
        int[] intArray78 = multidimensionalCounter60.getCounts((int) '4');
        int[] intArray82 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter83 = new org.apache.commons.math.util.MultidimensionalCounter(intArray82);
        int int84 = multidimensionalCounter83.getDimension();
        int[] intArray86 = multidimensionalCounter83.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator87 = multidimensionalCounter83.iterator();
        int int88 = multidimensionalCounter83.getDimension();
        int[] intArray90 = multidimensionalCounter83.getCounts((int) '4');
        int int91 = multidimensionalCounter60.getCount(intArray90);
        java.util.Spliterator<java.lang.Integer> intSpliterator92 = multidimensionalCounter60.spliterator();
        int int93 = multidimensionalCounter60.getDimension();
        int[] intArray94 = multidimensionalCounter60.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int95 = multidimensionalCounter4.getCount(intArray94);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 320 + "'", int27 == 320);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 320 + "'", int42 == 320);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 320 + "'", int66 == 320);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertNotNull(iterator69);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 3 + "'", int84 == 3);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 3 + "'", int88 == 3);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 52 + "'", int91 == 52);
        org.junit.Assert.assertNotNull(intSpliterator92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 3 + "'", int93 == 3);
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[32, 10, 1]");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getSize();
        int[] intArray16 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter14.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter14.iterator();
        int[] intArray20 = multidimensionalCounter14.getCounts((int) (short) 10);
        int[] intArray22 = multidimensionalCounter14.getCounts((int) (byte) 100);
        int int23 = multidimensionalCounter4.getCount(intArray22);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter4.iterator();
        int[] intArray28 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter29 = new org.apache.commons.math.util.MultidimensionalCounter(intArray28);
        int int30 = multidimensionalCounter29.getSize();
        int[] intArray31 = multidimensionalCounter29.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator32 = multidimensionalCounter29.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator33 = multidimensionalCounter29.iterator();
        int[] intArray35 = multidimensionalCounter29.getCounts((int) (short) 10);
        int int36 = multidimensionalCounter4.getCount(intArray35);
        int int37 = multidimensionalCounter4.getDimension();
        int[] intArray39 = multidimensionalCounter4.getCounts((int) (short) 0);
        int int40 = multidimensionalCounter4.getSize();
        int int41 = multidimensionalCounter4.getDimension();
        int[] intArray45 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter46 = new org.apache.commons.math.util.MultidimensionalCounter(intArray45);
        int int47 = multidimensionalCounter46.getSize();
        int[] intArray48 = multidimensionalCounter46.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator49 = multidimensionalCounter46.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator50 = multidimensionalCounter46.iterator();
        int[] intArray54 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter55 = new org.apache.commons.math.util.MultidimensionalCounter(intArray54);
        int int56 = multidimensionalCounter55.getSize();
        int[] intArray57 = multidimensionalCounter55.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator58 = multidimensionalCounter55.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator59 = multidimensionalCounter55.iterator();
        int[] intArray63 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter64 = new org.apache.commons.math.util.MultidimensionalCounter(intArray63);
        int int65 = multidimensionalCounter64.getDimension();
        int[] intArray67 = multidimensionalCounter64.getCounts(1);
        int int68 = multidimensionalCounter55.getCount(intArray67);
        int int69 = multidimensionalCounter46.getCount(intArray67);
        int int70 = multidimensionalCounter4.getCount(intArray67);
        int int71 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 320 + "'", int30 == 320);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 320 + "'", int40 == 320);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 320 + "'", int47 == 320);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 320 + "'", int56 == 320);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int[] intArray8 = multidimensionalCounter7.getSizes();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        int[] intArray12 = multidimensionalCounter7.getCounts((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0]");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int int10 = multidimensionalCounter4.getDimension();
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getSize();
        int[] intArray17 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter15.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter15.iterator();
        int[] intArray21 = multidimensionalCounter15.getCounts((int) (short) 10);
        int[] intArray23 = multidimensionalCounter15.getCounts((int) (byte) 100);
        int int24 = multidimensionalCounter4.getCount(intArray23);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter4.iterator();
        int[] intArray26 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter27 = new org.apache.commons.math.util.MultidimensionalCounter(intArray26);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 320 + "'", int16 == 320);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 10, 1]");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        int[] intArray15 = multidimensionalCounter4.getCounts((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 0]");
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
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int int13 = multidimensionalCounter4.getSize();
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int int19 = multidimensionalCounter18.getSize();
        int[] intArray20 = multidimensionalCounter18.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter18.iterator();
        int[] intArray23 = multidimensionalCounter18.getCounts((int) (byte) 10);
        int int24 = multidimensionalCounter4.getCount(intArray23);
        int int25 = multidimensionalCounter4.getDimension();
        int[] intArray26 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator27 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 320 + "'", int13 == 320);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 320 + "'", int19 == 320);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator27);
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
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        int int15 = multidimensionalCounter4.getDimension();
        int[] intArray17 = multidimensionalCounter4.getCounts(2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 2, 0]");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        boolean boolean7 = iterator6.hasNext();
        int int9 = iterator6.getCount(0);
        int int10 = iterator6.getCount();
        boolean boolean11 = iterator6.hasNext();
        int int12 = iterator6.getCount();
        boolean boolean13 = iterator6.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int int13 = multidimensionalCounter4.getDimension();
        int[] intArray14 = multidimensionalCounter4.getSizes();
        int int15 = multidimensionalCounter4.getSize();
        int[] intArray16 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int int8 = iterator6.getCount(0);
        boolean boolean9 = iterator6.hasNext();
        java.lang.Class<?> wildcardClass10 = iterator6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        int[] intArray27 = multidimensionalCounter25.getCounts((int) (byte) 10);
        int int28 = multidimensionalCounter4.getCount(intArray27);
        java.util.Spliterator<java.lang.Integer> intSpliterator29 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter4.iterator();
        int int32 = iterator30.getCount((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 320 + "'", int23 == 320);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(intSpliterator29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray9 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray12 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        int[] intArray14 = iterator13.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, -1]");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int int8 = multidimensionalCounter4.getSize();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 320 + "'", int8 == 320);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator10);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter4.spliterator();
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getSize();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator26 = multidimensionalCounter23.spliterator();
        int int27 = multidimensionalCounter23.getDimension();
        int[] intArray29 = multidimensionalCounter23.getCounts((int) (byte) 1);
        int int30 = multidimensionalCounter4.getCount(intArray29);
        int[] intArray31 = multidimensionalCounter4.getSizes();
        int int32 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator33 = multidimensionalCounter4.spliterator();
        int[] intArray37 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter38 = new org.apache.commons.math.util.MultidimensionalCounter(intArray37);
        int int39 = multidimensionalCounter38.getSize();
        int[] intArray41 = multidimensionalCounter38.getCounts((int) (byte) 1);
        int[] intArray43 = multidimensionalCounter38.getCounts((int) (byte) 100);
        int[] intArray45 = multidimensionalCounter38.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator46 = multidimensionalCounter38.iterator();
        int[] intArray47 = multidimensionalCounter38.getSizes();
        int[] intArray49 = multidimensionalCounter38.getCounts((int) (byte) 0);
        int int50 = multidimensionalCounter4.getCount(intArray49);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator51 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator52 = multidimensionalCounter4.spliterator();
        int[] intArray56 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter57 = new org.apache.commons.math.util.MultidimensionalCounter(intArray56);
        int int58 = multidimensionalCounter57.getDimension();
        int[] intArray60 = multidimensionalCounter57.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator61 = multidimensionalCounter57.iterator();
        int[] intArray65 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter66 = new org.apache.commons.math.util.MultidimensionalCounter(intArray65);
        int int67 = multidimensionalCounter66.getDimension();
        int[] intArray69 = multidimensionalCounter66.getCounts(1);
        int int70 = multidimensionalCounter57.getCount(intArray69);
        java.util.Spliterator<java.lang.Integer> intSpliterator71 = multidimensionalCounter57.spliterator();
        int[] intArray75 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter76 = new org.apache.commons.math.util.MultidimensionalCounter(intArray75);
        int int77 = multidimensionalCounter76.getSize();
        int[] intArray78 = multidimensionalCounter76.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator79 = multidimensionalCounter76.spliterator();
        int int80 = multidimensionalCounter76.getDimension();
        int[] intArray82 = multidimensionalCounter76.getCounts((int) (byte) 1);
        int int83 = multidimensionalCounter57.getCount(intArray82);
        int[] intArray84 = multidimensionalCounter57.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator85 = multidimensionalCounter57.spliterator();
        int int86 = multidimensionalCounter57.getSize();
        int[] intArray87 = multidimensionalCounter57.getSizes();
        int[] intArray89 = multidimensionalCounter57.getCounts((int) (short) 1);
        int int90 = multidimensionalCounter4.getCount(intArray89);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 320 + "'", int24 == 320);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(intSpliterator33);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 320 + "'", int39 == 320);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(intSpliterator52);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(intSpliterator71);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 320 + "'", int77 == 320);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 320 + "'", int86 == 320);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int int8 = multidimensionalCounter4.getSize();
        int int9 = multidimensionalCounter4.getDimension();
        int int10 = multidimensionalCounter4.getDimension();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int int13 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 320 + "'", int8 == 320);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 320 + "'", int13 == 320);
        org.junit.Assert.assertNotNull(intSpliterator14);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int[] intArray8 = multidimensionalCounter7.getSizes();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        int[] intArray12 = multidimensionalCounter7.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter7.iterator();
        int int15 = iterator13.getCount(0);
        int int16 = iterator13.getCount();
        // The following exception was thrown during execution in test generation
        try {
            iterator13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getCounts(52);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        int int14 = multidimensionalCounter4.getDimension();
        int int15 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getSize();
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int int19 = multidimensionalCounter18.getSize();
        int[] intArray20 = multidimensionalCounter18.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter18.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter18.iterator();
        int int23 = multidimensionalCounter18.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator24 = multidimensionalCounter18.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter18.iterator();
        int[] intArray26 = multidimensionalCounter18.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator27 = multidimensionalCounter18.iterator();
        int[] intArray31 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter32 = new org.apache.commons.math.util.MultidimensionalCounter(intArray31);
        int int33 = multidimensionalCounter32.getSize();
        int[] intArray34 = multidimensionalCounter32.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter35 = new org.apache.commons.math.util.MultidimensionalCounter(intArray34);
        int[] intArray37 = multidimensionalCounter35.getCounts((int) (byte) 10);
        int int38 = multidimensionalCounter18.getCount(intArray37);
        int int39 = multidimensionalCounter4.getCount(intArray37);
        java.util.Spliterator<java.lang.Integer> intSpliterator40 = multidimensionalCounter4.spliterator();
        int[] intArray41 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator42 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 320 + "'", int13 == 320);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 320 + "'", int19 == 320);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 320 + "'", int23 == 320);
        org.junit.Assert.assertNotNull(intSpliterator24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 320 + "'", int33 == 320);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(intSpliterator40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator42);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        int int11 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 320 + "'", int10 == 320);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertNotNull(intSpliterator12);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 100);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = multidimensionalCounter4.getSize();
        int[] intArray14 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 320 + "'", int12 == 320);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0]");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int int10 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        int int17 = multidimensionalCounter16.getDimension();
        int[] intArray19 = multidimensionalCounter16.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter16.iterator();
        int[] intArray24 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        int int26 = multidimensionalCounter25.getDimension();
        int[] intArray28 = multidimensionalCounter25.getCounts(1);
        int int29 = multidimensionalCounter16.getCount(intArray28);
        java.util.Spliterator<java.lang.Integer> intSpliterator30 = multidimensionalCounter16.spliterator();
        int[] intArray34 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter35 = new org.apache.commons.math.util.MultidimensionalCounter(intArray34);
        int int36 = multidimensionalCounter35.getSize();
        int[] intArray37 = multidimensionalCounter35.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator38 = multidimensionalCounter35.spliterator();
        int int39 = multidimensionalCounter35.getDimension();
        int[] intArray41 = multidimensionalCounter35.getCounts((int) (byte) 1);
        int int42 = multidimensionalCounter16.getCount(intArray41);
        int[] intArray43 = multidimensionalCounter16.getSizes();
        int int44 = multidimensionalCounter16.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator45 = multidimensionalCounter16.spliterator();
        int[] intArray49 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter50 = new org.apache.commons.math.util.MultidimensionalCounter(intArray49);
        int int51 = multidimensionalCounter50.getSize();
        int[] intArray53 = multidimensionalCounter50.getCounts((int) (byte) 1);
        int[] intArray55 = multidimensionalCounter50.getCounts((int) (byte) 100);
        int[] intArray57 = multidimensionalCounter50.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator58 = multidimensionalCounter50.iterator();
        int[] intArray59 = multidimensionalCounter50.getSizes();
        int[] intArray61 = multidimensionalCounter50.getCounts((int) (byte) 0);
        int int62 = multidimensionalCounter16.getCount(intArray61);
        int int63 = multidimensionalCounter4.getCount(intArray61);
        int int64 = multidimensionalCounter4.getSize();
        java.lang.Class<?> wildcardClass65 = multidimensionalCounter4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(intSpliterator30);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 320 + "'", int36 == 320);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(intSpliterator45);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 320 + "'", int51 == 320);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 320 + "'", int64 == 320);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = iterator8.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, -1]");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int13 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 320 + "'", int13 == 320);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int int8 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int int11 = multidimensionalCounter4.getSize();
        int[] intArray13 = multidimensionalCounter4.getCounts((int) ' ');
        int[] intArray14 = multidimensionalCounter4.getSizes();
        int int15 = multidimensionalCounter4.getSize();
        int[] intArray17 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int int19 = multidimensionalCounter18.getSize();
        int[] intArray20 = multidimensionalCounter18.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter21 = new org.apache.commons.math.util.MultidimensionalCounter(intArray20);
        int[] intArray23 = multidimensionalCounter21.getCounts((int) (byte) 10);
        int int24 = multidimensionalCounter4.getCount(intArray23);
        int[] intArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = multidimensionalCounter4.getCount(intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 320 + "'", int19 == 320);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        int int11 = multidimensionalCounter4.getDimension();
        int[] intArray13 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray14 = multidimensionalCounter4.getSizes();
        int[] intArray16 = multidimensionalCounter4.getCounts(32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[3, 2, 0]");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int int8 = multidimensionalCounter4.getSize();
        int int9 = multidimensionalCounter4.getDimension();
        int int10 = multidimensionalCounter4.getDimension();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int[] intArray14 = multidimensionalCounter4.getCounts(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 320 + "'", int8 == 320);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 0]");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int[] intArray8 = multidimensionalCounter7.getSizes();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter7.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter7.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter7.iterator();
        int int14 = multidimensionalCounter7.getSize();
        int[] intArray16 = multidimensionalCounter7.getCounts((int) (short) 1);
        int[] intArray17 = multidimensionalCounter7.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 320 + "'", int14 == 320);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int int8 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (byte) 1);
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int[] intArray14 = multidimensionalCounter4.getCounts(0);
        java.lang.Class<?> wildcardClass15 = multidimensionalCounter4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getSize();
        int[] intArray17 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter15.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter15.iterator();
        int[] intArray21 = multidimensionalCounter15.getCounts((int) (short) 10);
        int int22 = multidimensionalCounter4.getCount(intArray21);
        int[] intArray24 = multidimensionalCounter4.getCounts(0);
        int[] intArray26 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int int27 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 320 + "'", int16 == 320);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 320 + "'", int27 == 320);
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
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter11.spliterator();
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int int19 = multidimensionalCounter17.getDimension();
        int int20 = multidimensionalCounter17.getSize();
        int[] intArray24 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        int int26 = multidimensionalCounter25.getDimension();
        int int27 = multidimensionalCounter25.getDimension();
        int[] intArray29 = multidimensionalCounter25.getCounts(0);
        int int30 = multidimensionalCounter17.getCount(intArray29);
        int[] intArray32 = multidimensionalCounter17.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator33 = multidimensionalCounter17.iterator();
        int int34 = multidimensionalCounter17.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator35 = multidimensionalCounter17.spliterator();
        int[] intArray37 = multidimensionalCounter17.getCounts(10);
        int int38 = multidimensionalCounter11.getCount(intArray37);
        java.util.Spliterator<java.lang.Integer> intSpliterator39 = multidimensionalCounter11.spliterator();
        int[] intArray41 = multidimensionalCounter11.getCounts((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 320 + "'", int20 == 320);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(intSpliterator35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(intSpliterator39);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 0, 0]");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        int int17 = multidimensionalCounter16.getDimension();
        int[] intArray19 = multidimensionalCounter16.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter16.iterator();
        int int21 = multidimensionalCounter16.getDimension();
        int[] intArray25 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter26 = new org.apache.commons.math.util.MultidimensionalCounter(intArray25);
        int int27 = multidimensionalCounter26.getSize();
        int[] intArray28 = multidimensionalCounter26.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator29 = multidimensionalCounter26.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter26.iterator();
        int[] intArray32 = multidimensionalCounter26.getCounts((int) (short) 10);
        int[] intArray34 = multidimensionalCounter26.getCounts((int) (byte) 100);
        int int35 = multidimensionalCounter16.getCount(intArray34);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator36 = multidimensionalCounter16.iterator();
        int[] intArray40 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter41 = new org.apache.commons.math.util.MultidimensionalCounter(intArray40);
        int int42 = multidimensionalCounter41.getSize();
        int[] intArray43 = multidimensionalCounter41.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator44 = multidimensionalCounter41.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator45 = multidimensionalCounter41.iterator();
        int[] intArray47 = multidimensionalCounter41.getCounts((int) (short) 10);
        int int48 = multidimensionalCounter16.getCount(intArray47);
        int int49 = multidimensionalCounter16.getDimension();
        int[] intArray51 = multidimensionalCounter16.getCounts((int) (short) 0);
        int int52 = multidimensionalCounter4.getCount(intArray51);
        int[] intArray56 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter57 = new org.apache.commons.math.util.MultidimensionalCounter(intArray56);
        int int58 = multidimensionalCounter57.getSize();
        int[] intArray59 = multidimensionalCounter57.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator60 = multidimensionalCounter57.spliterator();
        int int61 = multidimensionalCounter57.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator62 = multidimensionalCounter57.iterator();
        int[] intArray63 = multidimensionalCounter57.getSizes();
        int int64 = multidimensionalCounter57.getSize();
        int[] intArray66 = multidimensionalCounter57.getCounts((int) ' ');
        int int67 = multidimensionalCounter4.getCount(intArray66);
        int[] intArray71 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter72 = new org.apache.commons.math.util.MultidimensionalCounter(intArray71);
        int int73 = multidimensionalCounter72.getDimension();
        int[] intArray75 = multidimensionalCounter72.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator76 = multidimensionalCounter72.iterator();
        int int77 = multidimensionalCounter72.getDimension();
        int[] intArray79 = multidimensionalCounter72.getCounts((int) '4');
        int[] intArray80 = multidimensionalCounter72.getSizes();
        int int81 = multidimensionalCounter72.getSize();
        int int82 = multidimensionalCounter72.getDimension();
        int[] intArray84 = multidimensionalCounter72.getCounts(2);
        int int85 = multidimensionalCounter4.getCount(intArray84);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 320 + "'", int27 == 320);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 320 + "'", int42 == 320);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 320 + "'", int58 == 320);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 320 + "'", int64 == 320);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[3, 2, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 32 + "'", int67 == 32);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 3 + "'", int73 == 3);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 320 + "'", int81 == 320);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 3 + "'", int82 == 3);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[0, 2, 0]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 2 + "'", int85 == 2);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int int8 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        boolean boolean10 = iterator9.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 320 + "'", int8 == 320);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int int13 = multidimensionalCounter4.getSize();
        int int14 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        int[] intArray19 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter20 = new org.apache.commons.math.util.MultidimensionalCounter(intArray19);
        int int21 = multidimensionalCounter20.getSize();
        int[] intArray22 = multidimensionalCounter20.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator23 = multidimensionalCounter20.spliterator();
        int int24 = multidimensionalCounter20.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter20.iterator();
        int[] intArray27 = multidimensionalCounter20.getCounts((int) (byte) 0);
        int[] intArray29 = multidimensionalCounter20.getCounts((int) '#');
        int int30 = multidimensionalCounter4.getCount(intArray29);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 320 + "'", int13 == 320);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 320 + "'", int14 == 320);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 320 + "'", int21 == 320);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 320 + "'", int24 == 320);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) ' ');
        int[] intArray11 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = multidimensionalCounter12.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int int8 = multidimensionalCounter4.getDimension();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter13.iterator();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getDimension();
        int[] intArray25 = multidimensionalCounter22.getCounts(1);
        int int26 = multidimensionalCounter13.getCount(intArray25);
        int[] intArray28 = multidimensionalCounter13.getCounts((int) '4');
        int int29 = multidimensionalCounter4.getCount(intArray28);
        java.util.Spliterator<java.lang.Integer> intSpliterator30 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator31 = multidimensionalCounter4.spliterator();
        int int32 = multidimensionalCounter4.getSize();
        int int33 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(intSpliterator30);
        org.junit.Assert.assertNotNull(intSpliterator31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 320 + "'", int32 == 320);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 320 + "'", int33 == 320);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter12.spliterator();
        int[] intArray16 = multidimensionalCounter12.getCounts((int) (byte) 10);
        int int17 = multidimensionalCounter12.getSize();
        int[] intArray19 = multidimensionalCounter12.getCounts((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 320 + "'", int17 == 320);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 1, 0]");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray9 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int[] intArray13 = multidimensionalCounter4.getSizes();
        int[] intArray14 = multidimensionalCounter4.getSizes();
        int int15 = multidimensionalCounter4.getDimension();
        int int16 = multidimensionalCounter4.getSize();
        int[] intArray18 = multidimensionalCounter4.getCounts(3);
        int int19 = multidimensionalCounter4.getDimension();
        int int20 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 320 + "'", int16 == 320);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 3, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 320 + "'", int20 == 320);
        org.junit.Assert.assertNotNull(iterator21);
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
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getSize();
        int[] intArray15 = multidimensionalCounter13.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter13.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter13.iterator();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getDimension();
        int[] intArray25 = multidimensionalCounter22.getCounts(1);
        int int26 = multidimensionalCounter13.getCount(intArray25);
        int int27 = multidimensionalCounter4.getCount(intArray25);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator28 = multidimensionalCounter4.iterator();
        int int29 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 320 + "'", int14 == 320);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 320 + "'", int29 == 320);
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
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int int10 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int13 = iterator11.getCount(0);
        // The following exception was thrown during execution in test generation
        try {
            iterator11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getSize();
        int[] intArray16 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter14.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter14.iterator();
        int[] intArray20 = multidimensionalCounter14.getCounts((int) (short) 10);
        int[] intArray22 = multidimensionalCounter14.getCounts((int) (byte) 100);
        int int23 = multidimensionalCounter4.getCount(intArray22);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter4.iterator();
        int[] intArray26 = iterator25.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, -1]");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray11 = multidimensionalCounter7.getCounts((int) (short) 0);
        int int12 = multidimensionalCounter7.getDimension();
        int int13 = multidimensionalCounter7.getSize();
        int int14 = multidimensionalCounter7.getDimension();
        int[] intArray16 = multidimensionalCounter7.getCounts((int) (short) 10);
        int int17 = multidimensionalCounter7.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 320 + "'", int13 == 320);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 320 + "'", int17 == 320);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getDimension();
        int int14 = multidimensionalCounter12.getDimension();
        int[] intArray16 = multidimensionalCounter12.getCounts(0);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        int[] intArray19 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter4.iterator();
        int int21 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator22 = multidimensionalCounter4.spliterator();
        int[] intArray23 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(intSpliterator22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator24);
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
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter13.iterator();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getDimension();
        int[] intArray25 = multidimensionalCounter22.getCounts(1);
        int int26 = multidimensionalCounter13.getCount(intArray25);
        java.util.Spliterator<java.lang.Integer> intSpliterator27 = multidimensionalCounter13.spliterator();
        int[] intArray31 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter32 = new org.apache.commons.math.util.MultidimensionalCounter(intArray31);
        int int33 = multidimensionalCounter32.getSize();
        int[] intArray34 = multidimensionalCounter32.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator35 = multidimensionalCounter32.spliterator();
        int int36 = multidimensionalCounter32.getDimension();
        int[] intArray38 = multidimensionalCounter32.getCounts((int) (byte) 1);
        int int39 = multidimensionalCounter13.getCount(intArray38);
        int int40 = multidimensionalCounter7.getCount(intArray38);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator41 = multidimensionalCounter7.iterator();
        int int42 = multidimensionalCounter7.getSize();
        int[] intArray43 = multidimensionalCounter7.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator44 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator45 = multidimensionalCounter7.iterator();
        int[] intArray46 = multidimensionalCounter7.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(intSpliterator27);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 320 + "'", int33 == 320);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 320 + "'", int42 == 320);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator44);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[32, 10, 1]");
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
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getSize();
        int[] intArray17 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter15.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter15.iterator();
        int[] intArray21 = multidimensionalCounter15.getCounts((int) (short) 10);
        int int22 = multidimensionalCounter4.getCount(intArray21);
        int[] intArray24 = multidimensionalCounter4.getCounts(0);
        int[] intArray26 = multidimensionalCounter4.getCounts(52);
        int int27 = multidimensionalCounter4.getDimension();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 320 + "'", int16 == 320);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
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
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        int int11 = multidimensionalCounter4.getDimension();
        int[] intArray13 = multidimensionalCounter4.getCounts((int) (short) 0);
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator14);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        boolean boolean9 = iterator8.hasNext();
        int int11 = iterator8.getCount((int) (short) 1);
        int[] intArray12 = iterator8.getCounts();
        int int13 = iterator8.getCount();
        int int14 = iterator8.getCount();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = iterator8.getCount(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        java.lang.Class<?> wildcardClass14 = multidimensionalCounter4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
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
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int[] intArray14 = multidimensionalCounter4.getCounts((int) (short) 100);
        java.util.Spliterator<java.lang.Integer> intSpliterator15 = multidimensionalCounter4.spliterator();
        int[] intArray16 = multidimensionalCounter4.getSizes();
        int[] intArray20 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter21 = new org.apache.commons.math.util.MultidimensionalCounter(intArray20);
        int int22 = multidimensionalCounter21.getSize();
        int[] intArray23 = multidimensionalCounter21.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter24 = new org.apache.commons.math.util.MultidimensionalCounter(intArray23);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter24.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter24.iterator();
        int[] intArray27 = multidimensionalCounter24.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = multidimensionalCounter4.getCount(intArray27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 320 + "'", int22 == 320);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray8 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter9 = new org.apache.commons.math.util.MultidimensionalCounter(intArray8);
        int int10 = multidimensionalCounter9.getSize();
        int[] intArray11 = multidimensionalCounter9.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter9.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter9.iterator();
        int[] intArray15 = multidimensionalCounter9.getCounts((int) (short) 10);
        int[] intArray17 = multidimensionalCounter9.getCounts((int) (byte) 100);
        int[] intArray19 = multidimensionalCounter9.getCounts(100);
        int int20 = multidimensionalCounter4.getCount(intArray19);
        int[] intArray22 = multidimensionalCounter4.getCounts((int) '4');
        int[] intArray23 = multidimensionalCounter4.getSizes();
        int[] intArray27 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter28 = new org.apache.commons.math.util.MultidimensionalCounter(intArray27);
        int int29 = multidimensionalCounter28.getSize();
        int[] intArray31 = multidimensionalCounter28.getCounts((int) (byte) 1);
        int[] intArray33 = multidimensionalCounter28.getCounts((int) (byte) 100);
        int[] intArray35 = multidimensionalCounter28.getCounts((int) ' ');
        int int36 = multidimensionalCounter4.getCount(intArray35);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator37 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator38 = multidimensionalCounter4.iterator();
        java.lang.Class<?> wildcardClass39 = iterator38.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 320 + "'", int10 == 320);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 320 + "'", int29 == 320);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[3, 2, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(wildcardClass39);
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
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray13 = multidimensionalCounter4.getCounts(35);
        int int14 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 320 + "'", int14 == 320);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter4.spliterator();
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getSize();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator26 = multidimensionalCounter23.spliterator();
        int int27 = multidimensionalCounter23.getDimension();
        int[] intArray29 = multidimensionalCounter23.getCounts((int) (byte) 1);
        int int30 = multidimensionalCounter4.getCount(intArray29);
        int[] intArray31 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator32 = multidimensionalCounter4.spliterator();
        int int33 = multidimensionalCounter4.getSize();
        int[] intArray34 = multidimensionalCounter4.getSizes();
        int[] intArray36 = multidimensionalCounter4.getCounts((int) (short) 1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator37 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator38 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator39 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 320 + "'", int24 == 320);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 320 + "'", int33 == 320);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(intSpliterator39);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = iterator8.getCounts();
        int[] intArray10 = iterator8.getCounts();
        boolean boolean11 = iterator8.hasNext();
        int int12 = iterator8.getCount();
        boolean boolean13 = iterator8.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter4.spliterator();
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getSize();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator26 = multidimensionalCounter23.spliterator();
        int int27 = multidimensionalCounter23.getDimension();
        int[] intArray29 = multidimensionalCounter23.getCounts((int) (byte) 1);
        int int30 = multidimensionalCounter4.getCount(intArray29);
        int[] intArray31 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator32 = multidimensionalCounter4.spliterator();
        int int33 = multidimensionalCounter4.getSize();
        int[] intArray34 = multidimensionalCounter4.getSizes();
        int[] intArray36 = multidimensionalCounter4.getCounts((int) (short) 1);
        java.util.Spliterator<java.lang.Integer> intSpliterator37 = multidimensionalCounter4.spliterator();
        int int38 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator39 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 320 + "'", int24 == 320);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 320 + "'", int33 == 320);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intSpliterator37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 320 + "'", int38 == 320);
        org.junit.Assert.assertNotNull(iterator39);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int int8 = iterator7.getCount();
        int[] intArray9 = iterator7.getCounts();
        int int11 = iterator7.getCount(0);
        boolean boolean12 = iterator7.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
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
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getSize();
        int[] intArray19 = multidimensionalCounter17.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter17.iterator();
        int[] intArray25 = multidimensionalCounter17.getCounts(100);
        int int26 = multidimensionalCounter4.getCount(intArray25);
        int int27 = multidimensionalCounter4.getSize();
        int[] intArray28 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator29 = multidimensionalCounter4.spliterator();
        int[] intArray31 = multidimensionalCounter4.getCounts(2);
        int[] intArray35 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter36 = new org.apache.commons.math.util.MultidimensionalCounter(intArray35);
        int int37 = multidimensionalCounter36.getDimension();
        int int38 = multidimensionalCounter36.getDimension();
        int int39 = multidimensionalCounter36.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator40 = multidimensionalCounter36.iterator();
        int int41 = iterator40.getCount();
        int[] intArray42 = iterator40.getCounts();
        int[] intArray43 = iterator40.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            int int44 = multidimensionalCounter4.getCount(intArray43);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: -1 out of [0, 0] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 320 + "'", int18 == 320);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 320 + "'", int27 == 320);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 2, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 320 + "'", int39 == 320);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, 0, -1]");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray11 = multidimensionalCounter4.getCounts((int) '4');
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int int13 = multidimensionalCounter4.getSize();
        int[] intArray15 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray16 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 320 + "'", int13 == 320);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
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
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        int int11 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intSpliterator13);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray9 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        boolean boolean13 = iterator12.hasNext();
        int int15 = iterator12.getCount(0);
        int int16 = iterator12.getCount();
        int int17 = iterator12.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int[] intArray8 = multidimensionalCounter7.getSizes();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        int[] intArray12 = multidimensionalCounter7.getCounts((int) (short) 0);
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter17.iterator();
        int int22 = multidimensionalCounter17.getDimension();
        int[] intArray24 = multidimensionalCounter17.getCounts((int) '4');
        int int25 = multidimensionalCounter17.getSize();
        int[] intArray27 = multidimensionalCounter17.getCounts(0);
        int int28 = multidimensionalCounter7.getCount(intArray27);
        int int29 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter7.iterator();
        int[] intArray34 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter35 = new org.apache.commons.math.util.MultidimensionalCounter(intArray34);
        int int36 = multidimensionalCounter35.getSize();
        int[] intArray37 = multidimensionalCounter35.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator38 = multidimensionalCounter35.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator39 = multidimensionalCounter35.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator40 = multidimensionalCounter35.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator41 = multidimensionalCounter35.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator42 = multidimensionalCounter35.iterator();
        int[] intArray43 = multidimensionalCounter35.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator44 = multidimensionalCounter35.iterator();
        int int45 = multidimensionalCounter35.getDimension();
        int[] intArray46 = multidimensionalCounter35.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int47 = multidimensionalCounter7.getCount(intArray46);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 320 + "'", int25 == 320);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 320 + "'", int29 == 320);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 320 + "'", int36 == 320);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(intSpliterator40);
        org.junit.Assert.assertNotNull(intSpliterator41);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[32, 10, 1]");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getSize();
        int[] intArray16 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter14.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter14.iterator();
        int[] intArray20 = multidimensionalCounter14.getCounts((int) (short) 10);
        int[] intArray22 = multidimensionalCounter14.getCounts((int) (byte) 100);
        int int23 = multidimensionalCounter4.getCount(intArray22);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter4.iterator();
        int int25 = iterator24.getCount();
        // The following exception was thrown during execution in test generation
        try {
            iterator24.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
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
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getCounts(100);
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter4.spliterator();
        int int14 = multidimensionalCounter4.getDimension();
        int[] intArray16 = multidimensionalCounter4.getCounts(0);
        int[] intArray18 = multidimensionalCounter4.getCounts((int) (short) 1);
        java.util.Spliterator<java.lang.Integer> intSpliterator19 = multidimensionalCounter4.spliterator();
        int int20 = multidimensionalCounter4.getDimension();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getCounts((int) ' ');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        boolean boolean11 = iterator10.hasNext();
        int[] intArray12 = iterator10.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, -1]");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int int10 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 320 + "'", int10 == 320);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intSpliterator12);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        int[] intArray14 = iterator13.getCounts();
        int[] intArray15 = iterator13.getCounts();
        int int16 = iterator13.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int int10 = multidimensionalCounter4.getDimension();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int[] intArray14 = multidimensionalCounter13.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        int[] intArray19 = multidimensionalCounter4.getCounts((int) '4');
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter4.iterator();
        int int22 = iterator21.getCount();
        boolean boolean23 = iterator21.hasNext();
        boolean boolean24 = iterator21.hasNext();
        boolean boolean25 = iterator21.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter4.iterator();
        int[] intArray17 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int[] intArray20 = multidimensionalCounter18.getCounts(100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 0, 0]");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray9 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int[] intArray13 = multidimensionalCounter4.getSizes();
        int[] intArray14 = multidimensionalCounter4.getSizes();
        int int15 = multidimensionalCounter4.getDimension();
        int int16 = multidimensionalCounter4.getSize();
        int[] intArray17 = multidimensionalCounter4.getSizes();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter22.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator27 = multidimensionalCounter22.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator28 = multidimensionalCounter22.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator29 = multidimensionalCounter22.iterator();
        int[] intArray30 = multidimensionalCounter22.getSizes();
        int int31 = multidimensionalCounter22.getDimension();
        int[] intArray32 = multidimensionalCounter22.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = multidimensionalCounter4.getCount(intArray32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 320 + "'", int16 == 320);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 320 + "'", int23 == 320);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(intSpliterator27);
        org.junit.Assert.assertNotNull(intSpliterator28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[32, 10, 1]");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (short) 10);
        int int11 = multidimensionalCounter4.getSize();
        int[] intArray13 = multidimensionalCounter4.getCounts(1);
        int[] intArray14 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        int[] intArray17 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator19 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intSpliterator19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int[] intArray14 = multidimensionalCounter4.getCounts((int) (short) 100);
        int[] intArray15 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator17 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter4.iterator();
        int[] intArray19 = iterator18.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator16);
        org.junit.Assert.assertNotNull(intSpliterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, -1]");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) '4');
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (short) 1);
        int int13 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 320 + "'", int13 == 320);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(iterator15);
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
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getSize();
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int int19 = multidimensionalCounter18.getSize();
        int[] intArray20 = multidimensionalCounter18.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter18.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter18.iterator();
        int int23 = multidimensionalCounter18.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator24 = multidimensionalCounter18.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter18.iterator();
        int[] intArray26 = multidimensionalCounter18.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator27 = multidimensionalCounter18.iterator();
        int[] intArray31 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter32 = new org.apache.commons.math.util.MultidimensionalCounter(intArray31);
        int int33 = multidimensionalCounter32.getSize();
        int[] intArray34 = multidimensionalCounter32.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter35 = new org.apache.commons.math.util.MultidimensionalCounter(intArray34);
        int[] intArray37 = multidimensionalCounter35.getCounts((int) (byte) 10);
        int int38 = multidimensionalCounter18.getCount(intArray37);
        int int39 = multidimensionalCounter4.getCount(intArray37);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator40 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator41 = multidimensionalCounter4.iterator();
        int int42 = multidimensionalCounter4.getSize();
        int[] intArray46 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter47 = new org.apache.commons.math.util.MultidimensionalCounter(intArray46);
        int int48 = multidimensionalCounter47.getDimension();
        int int49 = multidimensionalCounter47.getDimension();
        int int50 = multidimensionalCounter47.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator51 = multidimensionalCounter47.iterator();
        int int52 = multidimensionalCounter47.getDimension();
        int int53 = multidimensionalCounter47.getDimension();
        int int54 = multidimensionalCounter47.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator55 = multidimensionalCounter47.iterator();
        int[] intArray59 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter60 = new org.apache.commons.math.util.MultidimensionalCounter(intArray59);
        int int61 = multidimensionalCounter60.getDimension();
        int[] intArray63 = multidimensionalCounter60.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator64 = multidimensionalCounter60.iterator();
        int int65 = multidimensionalCounter60.getDimension();
        int[] intArray67 = multidimensionalCounter60.getCounts((int) '4');
        int[] intArray68 = multidimensionalCounter60.getSizes();
        int int69 = multidimensionalCounter60.getSize();
        int[] intArray71 = multidimensionalCounter60.getCounts((int) (short) 0);
        int[] intArray73 = multidimensionalCounter60.getCounts(0);
        int int74 = multidimensionalCounter47.getCount(intArray73);
        int int75 = multidimensionalCounter47.getSize();
        int[] intArray77 = multidimensionalCounter47.getCounts(0);
        int int78 = multidimensionalCounter4.getCount(intArray77);
        int[] intArray79 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 320 + "'", int13 == 320);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 320 + "'", int19 == 320);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 320 + "'", int23 == 320);
        org.junit.Assert.assertNotNull(intSpliterator24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 320 + "'", int33 == 320);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 320 + "'", int42 == 320);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 320 + "'", int50 == 320);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 320 + "'", int69 == 320);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 320 + "'", int75 == 320);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[32, 10, 1]");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int[] intArray8 = multidimensionalCounter7.getSizes();
        int[] intArray10 = multidimensionalCounter7.getCounts(2);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter7.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 2, 0]");
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (short) 10);
        int[] intArray12 = multidimensionalCounter4.getCounts(0);
        int[] intArray14 = multidimensionalCounter4.getCounts(0);
        int[] intArray18 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter19 = new org.apache.commons.math.util.MultidimensionalCounter(intArray18);
        int int20 = multidimensionalCounter19.getSize();
        int[] intArray21 = multidimensionalCounter19.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter19.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter19.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter19.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter19.iterator();
        int[] intArray27 = multidimensionalCounter19.getCounts(100);
        int int28 = multidimensionalCounter4.getCount(intArray27);
        int int29 = multidimensionalCounter4.getSize();
        int[] intArray33 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter34 = new org.apache.commons.math.util.MultidimensionalCounter(intArray33);
        int int35 = multidimensionalCounter34.getDimension();
        int[] intArray37 = multidimensionalCounter34.getCounts(1);
        int int38 = multidimensionalCounter34.getSize();
        int[] intArray39 = multidimensionalCounter34.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator40 = multidimensionalCounter34.iterator();
        int[] intArray42 = multidimensionalCounter34.getCounts((int) (short) 0);
        int int43 = multidimensionalCounter4.getCount(intArray42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 320 + "'", int20 == 320);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 320 + "'", int29 == 320);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 320 + "'", int38 == 320);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int int8 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (short) 10);
        int int11 = multidimensionalCounter4.getSize();
        int[] intArray13 = multidimensionalCounter4.getCounts(1);
        int[] intArray14 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator15 = multidimensionalCounter4.spliterator();
        int[] intArray19 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter20 = new org.apache.commons.math.util.MultidimensionalCounter(intArray19);
        int int21 = multidimensionalCounter20.getDimension();
        int[] intArray23 = multidimensionalCounter20.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter20.iterator();
        int[] intArray28 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter29 = new org.apache.commons.math.util.MultidimensionalCounter(intArray28);
        int int30 = multidimensionalCounter29.getDimension();
        int[] intArray32 = multidimensionalCounter29.getCounts(1);
        int int33 = multidimensionalCounter20.getCount(intArray32);
        java.util.Spliterator<java.lang.Integer> intSpliterator34 = multidimensionalCounter20.spliterator();
        int[] intArray38 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter39 = new org.apache.commons.math.util.MultidimensionalCounter(intArray38);
        int int40 = multidimensionalCounter39.getSize();
        int[] intArray41 = multidimensionalCounter39.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator42 = multidimensionalCounter39.spliterator();
        int int43 = multidimensionalCounter39.getDimension();
        int[] intArray45 = multidimensionalCounter39.getCounts((int) (byte) 1);
        int int46 = multidimensionalCounter20.getCount(intArray45);
        int int47 = multidimensionalCounter4.getCount(intArray45);
        int[] intArray49 = multidimensionalCounter4.getCounts(32);
        int[] intArray50 = multidimensionalCounter4.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(intSpliterator34);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 320 + "'", int40 == 320);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[32, 10, 1]");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray9 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray12 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int[] intArray14 = multidimensionalCounter13.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray8 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter9 = new org.apache.commons.math.util.MultidimensionalCounter(intArray8);
        int int10 = multidimensionalCounter9.getSize();
        int[] intArray11 = multidimensionalCounter9.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter9.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter9.iterator();
        int[] intArray15 = multidimensionalCounter9.getCounts((int) (short) 10);
        int[] intArray17 = multidimensionalCounter9.getCounts((int) (byte) 100);
        int[] intArray19 = multidimensionalCounter9.getCounts(100);
        int int20 = multidimensionalCounter4.getCount(intArray19);
        int[] intArray22 = multidimensionalCounter4.getCounts((int) '4');
        int[] intArray26 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter27 = new org.apache.commons.math.util.MultidimensionalCounter(intArray26);
        int int28 = multidimensionalCounter27.getDimension();
        int[] intArray30 = multidimensionalCounter27.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator31 = multidimensionalCounter27.iterator();
        int int32 = multidimensionalCounter27.getDimension();
        int[] intArray34 = multidimensionalCounter27.getCounts((int) '4');
        int int35 = multidimensionalCounter4.getCount(intArray34);
        int[] intArray37 = multidimensionalCounter4.getCounts((int) 'a');
        int int38 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 320 + "'", int10 == 320);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 320 + "'", int38 == 320);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int int8 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getCounts(2);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        int int15 = iterator13.getCount(0);
        boolean boolean16 = iterator13.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 2, 0]");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int int8 = iterator7.getCount();
        int[] intArray9 = iterator7.getCounts();
        int int11 = iterator7.getCount(0);
        int[] intArray12 = iterator7.getCounts();
        boolean boolean13 = iterator7.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) '#');
        int[] intArray14 = multidimensionalCounter4.getCounts(0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0]");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        boolean boolean11 = iterator10.hasNext();
        int int12 = iterator10.getCount();
        int[] intArray13 = iterator10.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, -1]");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        int int18 = multidimensionalCounter4.getDimension();
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getSize();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter23.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator27 = multidimensionalCounter23.iterator();
        int[] intArray31 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter32 = new org.apache.commons.math.util.MultidimensionalCounter(intArray31);
        int int33 = multidimensionalCounter32.getDimension();
        int[] intArray35 = multidimensionalCounter32.getCounts(1);
        int int36 = multidimensionalCounter23.getCount(intArray35);
        int[] intArray40 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter41 = new org.apache.commons.math.util.MultidimensionalCounter(intArray40);
        int int42 = multidimensionalCounter41.getDimension();
        int int43 = multidimensionalCounter41.getDimension();
        int int44 = multidimensionalCounter41.getSize();
        int[] intArray48 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter49 = new org.apache.commons.math.util.MultidimensionalCounter(intArray48);
        int int50 = multidimensionalCounter49.getDimension();
        int int51 = multidimensionalCounter49.getDimension();
        int[] intArray53 = multidimensionalCounter49.getCounts(0);
        int int54 = multidimensionalCounter41.getCount(intArray53);
        int int55 = multidimensionalCounter23.getCount(intArray53);
        int int56 = multidimensionalCounter4.getCount(intArray53);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator57 = multidimensionalCounter4.iterator();
        int int58 = iterator57.getCount();
        boolean boolean59 = iterator57.hasNext();
        java.lang.Class<?> wildcardClass60 = iterator57.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 320 + "'", int24 == 320);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 320 + "'", int44 == 320);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter12.spliterator();
        int[] intArray16 = multidimensionalCounter12.getCounts(32);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter12.iterator();
        boolean boolean18 = iterator17.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        int int8 = multidimensionalCounter4.getSize();
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = iterator10.getCounts();
        boolean boolean12 = iterator10.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 320 + "'", int8 == 320);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        int[] intArray27 = multidimensionalCounter25.getCounts((int) (byte) 10);
        int int28 = multidimensionalCounter4.getCount(intArray27);
        int[] intArray29 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter4.iterator();
        int[] intArray32 = multidimensionalCounter4.getCounts((int) (short) 100);
        int int33 = multidimensionalCounter4.getSize();
        int int34 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 320 + "'", int23 == 320);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 320 + "'", int33 == 320);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 320 + "'", int34 == 320);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray11 = multidimensionalCounter4.getCounts((int) '4');
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int int13 = multidimensionalCounter4.getSize();
        int int14 = multidimensionalCounter4.getDimension();
        int[] intArray16 = multidimensionalCounter4.getCounts(2);
        int int17 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 320 + "'", int13 == 320);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 2, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 320 + "'", int17 == 320);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        int int18 = multidimensionalCounter4.getSize();
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getSize();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter23.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator27 = multidimensionalCounter23.iterator();
        int[] intArray29 = multidimensionalCounter23.getCounts((int) (short) 10);
        int[] intArray31 = multidimensionalCounter23.getCounts(0);
        int[] intArray33 = multidimensionalCounter23.getCounts(0);
        int int34 = multidimensionalCounter4.getCount(intArray33);
        int int35 = multidimensionalCounter4.getDimension();
        int[] intArray36 = multidimensionalCounter4.getSizes();
        int[] intArray38 = multidimensionalCounter4.getCounts((int) ' ');
        java.util.Spliterator<java.lang.Integer> intSpliterator39 = multidimensionalCounter4.spliterator();
        int[] intArray41 = multidimensionalCounter4.getCounts(32);
        int int42 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 320 + "'", int18 == 320);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 320 + "'", int24 == 320);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(intSpliterator39);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[3, 2, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 320 + "'", int42 == 320);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int13 = iterator11.getCount((int) (short) 0);
        int int14 = iterator11.getCount();
        // The following exception was thrown during execution in test generation
        try {
            iterator11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int int10 = multidimensionalCounter4.getDimension();
        int int11 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getSize();
        int[] intArray19 = multidimensionalCounter17.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter17.iterator();
        int[] intArray25 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter26 = new org.apache.commons.math.util.MultidimensionalCounter(intArray25);
        int int27 = multidimensionalCounter26.getDimension();
        int[] intArray29 = multidimensionalCounter26.getCounts(1);
        int int30 = multidimensionalCounter17.getCount(intArray29);
        int int31 = multidimensionalCounter4.getCount(intArray29);
        int int32 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 320 + "'", int18 == 320);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        int int13 = multidimensionalCounter4.getSize();
        int int14 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 320 + "'", int13 == 320);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 320 + "'", int14 == 320);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        int int17 = multidimensionalCounter16.getDimension();
        int int18 = multidimensionalCounter16.getDimension();
        int[] intArray20 = multidimensionalCounter16.getCounts(0);
        int int21 = multidimensionalCounter16.getSize();
        int[] intArray22 = multidimensionalCounter16.getSizes();
        int[] intArray23 = multidimensionalCounter16.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter24 = new org.apache.commons.math.util.MultidimensionalCounter(intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = multidimensionalCounter4.getCount(intArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 320 + "'", int21 == 320);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int[] intArray8 = multidimensionalCounter7.getSizes();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter10.iterator();
        int int12 = iterator11.getCount();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = iterator11.getCount((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int int8 = multidimensionalCounter4.getSize();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getCounts(100);
        int[] intArray13 = multidimensionalCounter4.getCounts((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 320 + "'", int8 == 320);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 0]");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray8 = multidimensionalCounter4.getSizes();
        int int9 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intSpliterator11);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getCounts(100);
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter4.spliterator();
        int int14 = multidimensionalCounter4.getDimension();
        int[] intArray16 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter4.spliterator();
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getSize();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator26 = multidimensionalCounter23.spliterator();
        int int27 = multidimensionalCounter23.getDimension();
        int[] intArray29 = multidimensionalCounter23.getCounts((int) (byte) 1);
        int int30 = multidimensionalCounter4.getCount(intArray29);
        int[] intArray31 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator32 = multidimensionalCounter4.spliterator();
        int int33 = multidimensionalCounter4.getSize();
        int[] intArray34 = multidimensionalCounter4.getSizes();
        int[] intArray36 = multidimensionalCounter4.getCounts((int) (short) 1);
        int int37 = multidimensionalCounter4.getDimension();
        int[] intArray41 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter42 = new org.apache.commons.math.util.MultidimensionalCounter(intArray41);
        int int43 = multidimensionalCounter42.getSize();
        int[] intArray44 = multidimensionalCounter42.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator45 = multidimensionalCounter42.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator46 = multidimensionalCounter42.iterator();
        int int47 = multidimensionalCounter42.getSize();
        int int48 = multidimensionalCounter42.getDimension();
        int[] intArray50 = multidimensionalCounter42.getCounts(2);
        int[] intArray54 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter55 = new org.apache.commons.math.util.MultidimensionalCounter(intArray54);
        int int56 = multidimensionalCounter55.getDimension();
        int int57 = multidimensionalCounter55.getDimension();
        int[] intArray59 = multidimensionalCounter55.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator60 = multidimensionalCounter55.iterator();
        int[] intArray62 = multidimensionalCounter55.getCounts((int) (byte) 10);
        int[] intArray64 = multidimensionalCounter55.getCounts((int) (short) 0);
        int int65 = multidimensionalCounter42.getCount(intArray64);
        int int66 = multidimensionalCounter4.getCount(intArray64);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 320 + "'", int24 == 320);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 320 + "'", int33 == 320);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 320 + "'", int43 == 320);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 320 + "'", int47 == 320);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[0, 2, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray8 = iterator7.getCounts();
        int int9 = iterator7.getCount();
        int int11 = iterator7.getCount((int) (byte) 1);
        int int12 = iterator7.getCount();
        // The following exception was thrown during execution in test generation
        try {
            iterator7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int int8 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        int[] intArray12 = multidimensionalCounter4.getCounts(3);
        int int13 = multidimensionalCounter4.getSize();
        int int14 = multidimensionalCounter4.getSize();
        int[] intArray18 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter19 = new org.apache.commons.math.util.MultidimensionalCounter(intArray18);
        int int20 = multidimensionalCounter19.getDimension();
        int[] intArray22 = multidimensionalCounter19.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter19.iterator();
        int int24 = multidimensionalCounter19.getDimension();
        int[] intArray28 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter29 = new org.apache.commons.math.util.MultidimensionalCounter(intArray28);
        int int30 = multidimensionalCounter29.getSize();
        int[] intArray31 = multidimensionalCounter29.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator32 = multidimensionalCounter29.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator33 = multidimensionalCounter29.iterator();
        int[] intArray35 = multidimensionalCounter29.getCounts((int) (short) 10);
        int[] intArray37 = multidimensionalCounter29.getCounts((int) (byte) 100);
        int int38 = multidimensionalCounter19.getCount(intArray37);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator39 = multidimensionalCounter19.iterator();
        int[] intArray43 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter44 = new org.apache.commons.math.util.MultidimensionalCounter(intArray43);
        int int45 = multidimensionalCounter44.getSize();
        int[] intArray46 = multidimensionalCounter44.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator47 = multidimensionalCounter44.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator48 = multidimensionalCounter44.iterator();
        int[] intArray50 = multidimensionalCounter44.getCounts((int) (short) 10);
        int int51 = multidimensionalCounter19.getCount(intArray50);
        int int52 = multidimensionalCounter19.getDimension();
        int[] intArray54 = multidimensionalCounter19.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator55 = multidimensionalCounter19.iterator();
        int[] intArray57 = multidimensionalCounter19.getCounts((int) (short) 0);
        int int58 = multidimensionalCounter4.getCount(intArray57);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 3, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 320 + "'", int13 == 320);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 320 + "'", int14 == 320);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 320 + "'", int30 == 320);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 320 + "'", int45 == 320);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int int8 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int int10 = iterator9.getCount();
        boolean boolean11 = iterator9.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 320 + "'", int8 == 320);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int int11 = multidimensionalCounter4.getDimension();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        int[] intArray14 = multidimensionalCounter4.getCounts((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 0]");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int[] intArray9 = multidimensionalCounter7.getCounts((int) (byte) 10);
        int[] intArray11 = multidimensionalCounter7.getCounts((int) (byte) 1);
        int int12 = multidimensionalCounter7.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 320 + "'", int12 == 320);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getSize();
        int[] intArray17 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter15.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter15.iterator();
        int[] intArray21 = multidimensionalCounter15.getCounts((int) (short) 10);
        int int22 = multidimensionalCounter4.getCount(intArray21);
        int[] intArray24 = multidimensionalCounter4.getCounts(0);
        int[] intArray26 = multidimensionalCounter4.getCounts(52);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator27 = multidimensionalCounter4.iterator();
        int int28 = multidimensionalCounter4.getDimension();
        int[] intArray29 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 320 + "'", int16 == 320);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 10, 1]");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int[] intArray13 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int int10 = multidimensionalCounter4.getSize();
        int int11 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 320 + "'", int10 == 320);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        int int11 = multidimensionalCounter4.getDimension();
        int[] intArray13 = multidimensionalCounter4.getCounts((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 320 + "'", int10 == 320);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0]");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        int int11 = multidimensionalCounter4.getDimension();
        int int12 = multidimensionalCounter4.getSize();
        int[] intArray14 = multidimensionalCounter4.getCounts(1);
        int[] intArray15 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 320 + "'", int10 == 320);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 320 + "'", int12 == 320);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int int10 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 320 + "'", int10 == 320);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int10 = iterator8.getCount(1);
        int[] intArray11 = iterator8.getCounts();
        int int12 = iterator8.getCount();
        // The following exception was thrown during execution in test generation
        try {
            iterator8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray9 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int[] intArray12 = multidimensionalCounter11.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int int15 = multidimensionalCounter13.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter11.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter11.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getSize();
        int[] intArray15 = multidimensionalCounter13.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter13.spliterator();
        int int17 = multidimensionalCounter13.getDimension();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getDimension();
        int[] intArray25 = multidimensionalCounter22.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        int[] intArray30 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter31 = new org.apache.commons.math.util.MultidimensionalCounter(intArray30);
        int int32 = multidimensionalCounter31.getDimension();
        int[] intArray34 = multidimensionalCounter31.getCounts(1);
        int int35 = multidimensionalCounter22.getCount(intArray34);
        int[] intArray37 = multidimensionalCounter22.getCounts((int) '4');
        int int38 = multidimensionalCounter13.getCount(intArray37);
        int int39 = multidimensionalCounter4.getCount(intArray37);
        int int40 = multidimensionalCounter4.getDimension();
        int int41 = multidimensionalCounter4.getDimension();
        int[] intArray43 = multidimensionalCounter4.getCounts((int) '#');
        int[] intArray44 = multidimensionalCounter4.getSizes();
        int int45 = multidimensionalCounter4.getDimension();
        int[] intArray46 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 320 + "'", int14 == 320);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[32, 10, 1]");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        int int11 = multidimensionalCounter4.getDimension();
        int[] intArray13 = multidimensionalCounter4.getCounts((int) (short) 0);
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 320 + "'", int10 == 320);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator14);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int int12 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        int int14 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int int10 = multidimensionalCounter4.getDimension();
        int[] intArray12 = multidimensionalCounter4.getCounts(3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 3, 0]");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int10 = iterator8.getCount(1);
        boolean boolean11 = iterator8.hasNext();
        int int13 = iterator8.getCount((int) (byte) 1);
        int[] intArray14 = iterator8.getCounts();
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray11 = multidimensionalCounter4.getCounts((int) '4');
        int int12 = multidimensionalCounter4.getSize();
        int[] intArray13 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        boolean boolean16 = iterator15.hasNext();
        int int17 = iterator15.getCount();
        // The following exception was thrown during execution in test generation
        try {
            iterator15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 320 + "'", int12 == 320);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (short) 10);
        int[] intArray12 = multidimensionalCounter4.getCounts(0);
        int[] intArray14 = multidimensionalCounter4.getCounts(0);
        int int15 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter4.iterator();
        int int18 = iterator16.getCount((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int int10 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = iterator11.getCount();
        int int13 = iterator11.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int int13 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter4.iterator();
        int[] intArray16 = multidimensionalCounter4.getCounts(100);
        int int17 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 320 + "'", int17 == 320);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        boolean boolean9 = iterator8.hasNext();
        int int10 = iterator8.getCount();
        int int12 = iterator8.getCount(1);
        boolean boolean13 = iterator8.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int int11 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getSize();
        int[] intArray16 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter14.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter14.iterator();
        int[] intArray20 = multidimensionalCounter14.getCounts((int) (short) 10);
        int[] intArray22 = multidimensionalCounter14.getCounts((int) (byte) 100);
        int int23 = multidimensionalCounter4.getCount(intArray22);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter4.iterator();
        int[] intArray28 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter29 = new org.apache.commons.math.util.MultidimensionalCounter(intArray28);
        int int30 = multidimensionalCounter29.getSize();
        int[] intArray31 = multidimensionalCounter29.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator32 = multidimensionalCounter29.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator33 = multidimensionalCounter29.iterator();
        int[] intArray35 = multidimensionalCounter29.getCounts((int) (short) 10);
        int int36 = multidimensionalCounter4.getCount(intArray35);
        int int37 = multidimensionalCounter4.getDimension();
        int[] intArray39 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator40 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator41 = multidimensionalCounter4.iterator();
        int[] intArray43 = multidimensionalCounter4.getCounts(32);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 320 + "'", int30 == 320);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[3, 2, 0]");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int int11 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int int10 = iterator9.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getDimension();
        int int14 = multidimensionalCounter12.getDimension();
        int[] intArray16 = multidimensionalCounter12.getCounts(0);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator19 = multidimensionalCounter4.spliterator();
        int int20 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertNotNull(intSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray11 = multidimensionalCounter4.getCounts((int) '4');
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int int13 = multidimensionalCounter4.getSize();
        int int14 = multidimensionalCounter4.getDimension();
        int[] intArray16 = multidimensionalCounter4.getCounts(10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter4.iterator();
        int int18 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 320 + "'", int13 == 320);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int int8 = iterator7.getCount();
        boolean boolean9 = iterator7.hasNext();
        int[] intArray10 = iterator7.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, -1]");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getDimension();
        int int14 = multidimensionalCounter12.getDimension();
        int[] intArray16 = multidimensionalCounter12.getCounts(0);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator19 = multidimensionalCounter4.spliterator();
        int[] intArray20 = multidimensionalCounter4.getSizes();
        int[] intArray21 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertNotNull(intSpliterator19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        int int17 = multidimensionalCounter16.getDimension();
        int[] intArray19 = multidimensionalCounter16.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter16.iterator();
        int int21 = multidimensionalCounter16.getDimension();
        int[] intArray25 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter26 = new org.apache.commons.math.util.MultidimensionalCounter(intArray25);
        int int27 = multidimensionalCounter26.getSize();
        int[] intArray28 = multidimensionalCounter26.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator29 = multidimensionalCounter26.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter26.iterator();
        int[] intArray32 = multidimensionalCounter26.getCounts((int) (short) 10);
        int[] intArray34 = multidimensionalCounter26.getCounts((int) (byte) 100);
        int int35 = multidimensionalCounter16.getCount(intArray34);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator36 = multidimensionalCounter16.iterator();
        int[] intArray40 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter41 = new org.apache.commons.math.util.MultidimensionalCounter(intArray40);
        int int42 = multidimensionalCounter41.getSize();
        int[] intArray43 = multidimensionalCounter41.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator44 = multidimensionalCounter41.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator45 = multidimensionalCounter41.iterator();
        int[] intArray47 = multidimensionalCounter41.getCounts((int) (short) 10);
        int int48 = multidimensionalCounter16.getCount(intArray47);
        int int49 = multidimensionalCounter16.getDimension();
        int[] intArray51 = multidimensionalCounter16.getCounts((int) (short) 0);
        int int52 = multidimensionalCounter4.getCount(intArray51);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator53 = multidimensionalCounter4.iterator();
        int int54 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 320 + "'", int27 == 320);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 320 + "'", int42 == 320);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray11 = multidimensionalCounter4.getCounts((int) '4');
        int[] intArray12 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter13.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator14);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int int8 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int int11 = multidimensionalCounter4.getSize();
        int int12 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 320 + "'", int12 == 320);
        org.junit.Assert.assertNotNull(intSpliterator13);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray13 = multidimensionalCounter4.getCounts(52);
        int[] intArray15 = multidimensionalCounter4.getCounts((int) '#');
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter4.spliterator();
        java.lang.Class<?> wildcardClass17 = intSpliterator16.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intSpliterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter4.spliterator();
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getSize();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator26 = multidimensionalCounter23.spliterator();
        int int27 = multidimensionalCounter23.getDimension();
        int[] intArray29 = multidimensionalCounter23.getCounts((int) (byte) 1);
        int int30 = multidimensionalCounter4.getCount(intArray29);
        int[] intArray31 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator32 = multidimensionalCounter4.spliterator();
        int int33 = multidimensionalCounter4.getSize();
        int[] intArray34 = multidimensionalCounter4.getSizes();
        int[] intArray36 = multidimensionalCounter4.getCounts((int) (short) 1);
        java.util.Spliterator<java.lang.Integer> intSpliterator37 = multidimensionalCounter4.spliterator();
        int[] intArray41 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter42 = new org.apache.commons.math.util.MultidimensionalCounter(intArray41);
        int int43 = multidimensionalCounter42.getDimension();
        int int44 = multidimensionalCounter42.getDimension();
        int[] intArray46 = multidimensionalCounter42.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator47 = multidimensionalCounter42.iterator();
        int[] intArray48 = multidimensionalCounter42.getSizes();
        int[] intArray49 = multidimensionalCounter42.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter50 = new org.apache.commons.math.util.MultidimensionalCounter(intArray49);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = multidimensionalCounter4.getCount(intArray49);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 320 + "'", int24 == 320);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 320 + "'", int33 == 320);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intSpliterator37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[32, 10, 1]");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int10 = iterator8.getCount(1);
        boolean boolean11 = iterator8.hasNext();
        int int13 = iterator8.getCount((int) (byte) 1);
        int int14 = iterator8.getCount();
        // The following exception was thrown during execution in test generation
        try {
            iterator8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter4.iterator();
        int int18 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts(1);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        int int18 = multidimensionalCounter4.getSize();
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getSize();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter23.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator27 = multidimensionalCounter23.iterator();
        int[] intArray29 = multidimensionalCounter23.getCounts((int) (short) 10);
        int[] intArray31 = multidimensionalCounter23.getCounts(0);
        int[] intArray33 = multidimensionalCounter23.getCounts(0);
        int int34 = multidimensionalCounter4.getCount(intArray33);
        java.util.Spliterator<java.lang.Integer> intSpliterator35 = multidimensionalCounter4.spliterator();
        int int36 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 320 + "'", int18 == 320);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 320 + "'", int24 == 320);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intSpliterator35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (short) 10);
        int[] intArray12 = multidimensionalCounter4.getCounts(0);
        int[] intArray14 = multidimensionalCounter4.getCounts(0);
        int[] intArray18 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter19 = new org.apache.commons.math.util.MultidimensionalCounter(intArray18);
        int int20 = multidimensionalCounter19.getSize();
        int[] intArray21 = multidimensionalCounter19.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter19.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter19.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter19.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter19.iterator();
        int[] intArray27 = multidimensionalCounter19.getCounts(100);
        int int28 = multidimensionalCounter4.getCount(intArray27);
        int[] intArray30 = multidimensionalCounter4.getCounts((int) '#');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator31 = multidimensionalCounter4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = iterator31.getCount(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 320 + "'", int20 == 320);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(iterator31);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray9 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray12 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int[] intArray15 = multidimensionalCounter13.getCounts(52);
        int int16 = multidimensionalCounter13.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 320 + "'", int16 == 320);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getSize();
        int[] intArray17 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter15.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter15.iterator();
        int[] intArray21 = multidimensionalCounter15.getCounts((int) (short) 10);
        int int22 = multidimensionalCounter4.getCount(intArray21);
        int int23 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator24 = multidimensionalCounter4.spliterator();
        int int25 = multidimensionalCounter4.getDimension();
        int[] intArray27 = multidimensionalCounter4.getCounts(52);
        int int28 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 320 + "'", int16 == 320);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 320 + "'", int23 == 320);
        org.junit.Assert.assertNotNull(intSpliterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 320 + "'", int28 == 320);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (short) 10);
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getDimension();
        int[] intArray18 = multidimensionalCounter15.getCounts((int) (byte) 100);
        int int19 = multidimensionalCounter4.getCount(intArray18);
        int[] intArray21 = multidimensionalCounter4.getCounts(32);
        int[] intArray23 = multidimensionalCounter4.getCounts(10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 0]");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (short) 10);
        int int11 = multidimensionalCounter4.getDimension();
        int[] intArray13 = multidimensionalCounter4.getCounts(100);
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int int19 = multidimensionalCounter18.getSize();
        int[] intArray20 = multidimensionalCounter18.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter18.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter18.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter18.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator24 = multidimensionalCounter18.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator25 = multidimensionalCounter18.spliterator();
        int[] intArray26 = multidimensionalCounter18.getSizes();
        int[] intArray28 = multidimensionalCounter18.getCounts((int) (short) 100);
        java.util.Spliterator<java.lang.Integer> intSpliterator29 = multidimensionalCounter18.spliterator();
        int[] intArray31 = multidimensionalCounter18.getCounts(52);
        int int32 = multidimensionalCounter4.getCount(intArray31);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator33 = multidimensionalCounter4.iterator();
        boolean boolean34 = iterator33.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 320 + "'", int19 == 320);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(intSpliterator24);
        org.junit.Assert.assertNotNull(intSpliterator25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int int8 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int int10 = iterator9.getCount();
        int[] intArray11 = iterator9.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 320 + "'", int8 == 320);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, -1]");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray11 = multidimensionalCounter4.getCounts((int) '4');
        int[] intArray12 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        boolean boolean14 = iterator13.hasNext();
        int int15 = iterator13.getCount();
        int int16 = iterator13.getCount();
        // The following exception was thrown during execution in test generation
        try {
            iterator13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        boolean boolean12 = iterator11.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int int10 = multidimensionalCounter4.getDimension();
        int int11 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int14 = iterator12.getCount(0);
        int[] intArray15 = iterator12.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, -1]");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getSize();
        int[] intArray19 = multidimensionalCounter17.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter17.iterator();
        int[] intArray25 = multidimensionalCounter17.getCounts(100);
        int int26 = multidimensionalCounter4.getCount(intArray25);
        int int27 = multidimensionalCounter4.getSize();
        int int28 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 320 + "'", int18 == 320);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 320 + "'", int27 == 320);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getCounts(0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0]");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int int8 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getDimension();
        int int16 = multidimensionalCounter14.getDimension();
        int int17 = multidimensionalCounter14.getSize();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getDimension();
        int int24 = multidimensionalCounter22.getDimension();
        int[] intArray26 = multidimensionalCounter22.getCounts(0);
        int int27 = multidimensionalCounter14.getCount(intArray26);
        java.util.Spliterator<java.lang.Integer> intSpliterator28 = multidimensionalCounter14.spliterator();
        int[] intArray29 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter14.iterator();
        int[] intArray31 = iterator30.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            int int32 = multidimensionalCounter4.getCount(intArray31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: -1 out of [0, 0] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 320 + "'", int8 == 320);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 320 + "'", int17 == 320);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intSpliterator28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, -1]");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getDimension();
        int[] intArray14 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int[] intArray18 = multidimensionalCounter16.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter16.iterator();
        int[] intArray20 = iterator19.getCounts();
        int int21 = iterator19.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int int12 = multidimensionalCounter4.getSize();
        int[] intArray13 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 320 + "'", int12 == 320);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int[] intArray9 = multidimensionalCounter4.getCounts(52);
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = multidimensionalCounter4.getCounts((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: -1 out of [0, 320] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 0]");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray8 = multidimensionalCounter4.getSizes();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 1);
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter4.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = multidimensionalCounter4.getCounts(10240);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 10,240 out of [0, 320] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 320 + "'", int7 == 320);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intSpliterator13);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getCounts(100);
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter4.spliterator();
        int[] intArray15 = multidimensionalCounter4.getCounts(32);
        int int16 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[3, 2, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 320 + "'", int16 == 320);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray8 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter9 = new org.apache.commons.math.util.MultidimensionalCounter(intArray8);
        int int10 = multidimensionalCounter9.getSize();
        int[] intArray11 = multidimensionalCounter9.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter9.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter9.iterator();
        int[] intArray15 = multidimensionalCounter9.getCounts((int) (short) 10);
        int[] intArray17 = multidimensionalCounter9.getCounts((int) (byte) 100);
        int[] intArray19 = multidimensionalCounter9.getCounts(100);
        int int20 = multidimensionalCounter4.getCount(intArray19);
        int[] intArray22 = multidimensionalCounter4.getCounts((int) '4');
        int[] intArray23 = multidimensionalCounter4.getSizes();
        int[] intArray27 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter28 = new org.apache.commons.math.util.MultidimensionalCounter(intArray27);
        int int29 = multidimensionalCounter28.getSize();
        int[] intArray31 = multidimensionalCounter28.getCounts((int) (byte) 1);
        int[] intArray33 = multidimensionalCounter28.getCounts((int) (byte) 100);
        int[] intArray35 = multidimensionalCounter28.getCounts((int) ' ');
        int int36 = multidimensionalCounter4.getCount(intArray35);
        int[] intArray38 = multidimensionalCounter4.getCounts(4);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 320 + "'", int10 == 320);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 320 + "'", int29 == 320);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[3, 2, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 4, 0]");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray9 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray12 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter4.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = multidimensionalCounter4.getCounts(10240);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 10,240 out of [0, 320] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator13);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray9 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int[] intArray13 = multidimensionalCounter4.getSizes();
        int[] intArray14 = multidimensionalCounter4.getSizes();
        int int15 = multidimensionalCounter4.getDimension();
        int int16 = multidimensionalCounter4.getSize();
        int[] intArray18 = multidimensionalCounter4.getCounts(3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter19 = new org.apache.commons.math.util.MultidimensionalCounter(intArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 320 + "'", int16 == 320);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 3, 0]");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        int int10 = multidimensionalCounter7.getSize();
        int int11 = multidimensionalCounter7.getSize();
        java.lang.Class<?> wildcardClass12 = multidimensionalCounter7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 320 + "'", int5 == 320);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 320 + "'", int10 == 320);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

