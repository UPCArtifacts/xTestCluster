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
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int int12 = multidimensionalCounter11.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter11.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter11.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter11.iterator();
        int[] intArray16 = multidimensionalCounter11.getSizes();
        int[] intArray17 = multidimensionalCounter11.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter19 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int[] intArray23 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter24 = new org.apache.commons.math.util.MultidimensionalCounter(intArray23);
        int[] intArray26 = multidimensionalCounter24.getCounts((int) '#');
        java.util.Spliterator<java.lang.Integer> intSpliterator27 = multidimensionalCounter24.spliterator();
        int[] intArray31 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter32 = new org.apache.commons.math.util.MultidimensionalCounter(intArray31);
        int int33 = multidimensionalCounter32.getDimension();
        int int34 = multidimensionalCounter32.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator35 = multidimensionalCounter32.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator36 = multidimensionalCounter32.spliterator();
        int[] intArray38 = multidimensionalCounter32.getCounts((int) (byte) 1);
        int[] intArray42 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter43 = new org.apache.commons.math.util.MultidimensionalCounter(intArray42);
        int int44 = multidimensionalCounter43.getDimension();
        int[] intArray45 = multidimensionalCounter43.getSizes();
        int[] intArray47 = multidimensionalCounter43.getCounts((int) 'a');
        int[] intArray49 = multidimensionalCounter43.getCounts((int) 'a');
        int int50 = multidimensionalCounter32.getCount(intArray49);
        int int51 = multidimensionalCounter24.getCount(intArray49);
        int[] intArray53 = multidimensionalCounter24.getCounts(1);
        java.util.Spliterator<java.lang.Integer> intSpliterator54 = multidimensionalCounter24.spliterator();
        int[] intArray55 = multidimensionalCounter24.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter56 = new org.apache.commons.math.util.MultidimensionalCounter(intArray55);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = multidimensionalCounter19.getCount(intArray55);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intSpliterator27);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(intSpliterator36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intSpliterator54);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[32, 10, 1]");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        int[] intArray8 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter9 = new org.apache.commons.math.util.MultidimensionalCounter(intArray8);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray8);
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter10.spliterator();
        int int12 = multidimensionalCounter10.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter10.iterator();
        int[] intArray15 = multidimensionalCounter10.getCounts(52);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[5, 2, 0]");
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
        int int10 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        int[] intArray13 = multidimensionalCounter4.getCounts(97);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[9, 7, 0]");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        int[] intArray30 = multidimensionalCounter4.getCounts(100);
        java.util.Spliterator<java.lang.Integer> intSpliterator31 = multidimensionalCounter4.spliterator();
        int[] intArray33 = multidimensionalCounter4.getCounts(3);
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
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 3, 0]");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        boolean boolean10 = iterator9.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        boolean boolean8 = iterator7.hasNext();
        boolean boolean9 = iterator7.hasNext();
        int[] intArray10 = iterator7.getCounts();
        boolean boolean11 = iterator7.hasNext();
        int int12 = iterator7.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int[] intArray14 = multidimensionalCounter4.getCounts((int) '4');
        int int15 = multidimensionalCounter4.getSize();
        int[] intArray16 = multidimensionalCounter4.getSizes();
        int[] intArray18 = multidimensionalCounter4.getCounts(0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 3, 0]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0]");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        int int19 = multidimensionalCounter4.getDimension();
        int int20 = multidimensionalCounter4.getDimension();
        int int21 = multidimensionalCounter4.getDimension();
        int[] intArray22 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter4.iterator();
        int int24 = multidimensionalCounter4.getSize();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        int[] intArray18 = multidimensionalCounter16.getCounts((int) (short) 0);
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getSize();
        int int25 = multidimensionalCounter23.getDimension();
        int[] intArray29 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter30 = new org.apache.commons.math.util.MultidimensionalCounter(intArray29);
        int[] intArray32 = multidimensionalCounter30.getCounts((int) (short) 0);
        int[] intArray34 = multidimensionalCounter30.getCounts(10);
        int int35 = multidimensionalCounter23.getCount(intArray34);
        int int36 = multidimensionalCounter16.getCount(intArray34);
        int int37 = multidimensionalCounter11.getCount(intArray34);
        int int38 = multidimensionalCounter11.getDimension();
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
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
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter8 = new org.apache.commons.math.util.MultidimensionalCounter(intArray7);
        int[] intArray10 = multidimensionalCounter8.getCounts((int) '4');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter8.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter8.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray13 = multidimensionalCounter4.getCounts((int) 'a');
        int[] intArray15 = multidimensionalCounter4.getCounts((int) ' ');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter4.iterator();
        int[] intArray18 = multidimensionalCounter4.getSizes();
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) (short) 100);
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        int int10 = multidimensionalCounter4.getDimension();
        int int11 = multidimensionalCounter4.getDimension();
        int[] intArray13 = multidimensionalCounter4.getCounts(3);
        int[] intArray14 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 3, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        int[] intArray15 = multidimensionalCounter4.getCounts(100);
        int[] intArray16 = multidimensionalCounter4.getSizes();
        int int17 = multidimensionalCounter4.getDimension();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter22.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        int int27 = multidimensionalCounter22.getSize();
        int[] intArray28 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter29 = new org.apache.commons.math.util.MultidimensionalCounter(intArray28);
        int int30 = multidimensionalCounter29.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator31 = multidimensionalCounter29.iterator();
        int[] intArray33 = multidimensionalCounter29.getCounts((int) (byte) 0);
        int int34 = multidimensionalCounter4.getCount(intArray33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = multidimensionalCounter4.toString();
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
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter10.iterator();
        boolean boolean12 = iterator11.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int13 = multidimensionalCounter4.getSize();
        int[] intArray14 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int[] intArray16 = multidimensionalCounter15.getSizes();
        int int17 = multidimensionalCounter15.getDimension();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        java.util.Spliterator<java.lang.Integer> intSpliterator26 = multidimensionalCounter25.spliterator();
        int[] intArray27 = multidimensionalCounter25.getSizes();
        int[] intArray28 = multidimensionalCounter25.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter29 = new org.apache.commons.math.util.MultidimensionalCounter(intArray28);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = multidimensionalCounter15.getCount(intArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        int int10 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int13 = iterator12.getCount();
        int int14 = iterator12.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
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
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter11.iterator();
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getSize();
        int[] intArray19 = multidimensionalCounter17.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter17.iterator();
        int int22 = multidimensionalCounter17.getSize();
        int[] intArray23 = multidimensionalCounter17.getSizes();
        int[] intArray25 = multidimensionalCounter17.getCounts((int) (byte) 1);
        int int26 = multidimensionalCounter11.getCount(intArray25);
        int int27 = multidimensionalCounter11.getDimension();
        int[] intArray29 = multidimensionalCounter11.getCounts((int) (byte) 0);
        java.util.Spliterator<java.lang.Integer> intSpliterator30 = multidimensionalCounter11.spliterator();
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator30);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int13 = iterator12.getCount();
        int[] intArray14 = iterator12.getCounts();
        int int15 = iterator12.getCount();
        int int16 = iterator12.getCount();
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
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int int8 = iterator7.getCount();
        java.lang.Class<?> wildcardClass9 = iterator7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
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
        int[] intArray14 = multidimensionalCounter11.getCounts((int) (short) 1);
        int[] intArray15 = multidimensionalCounter11.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
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
        boolean boolean8 = iterator7.hasNext();
        int[] intArray9 = iterator7.getCounts();
        int int10 = iterator7.getCount();
        int int11 = iterator7.getCount();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0]");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        int[] intArray15 = multidimensionalCounter4.getCounts(100);
        int[] intArray16 = multidimensionalCounter4.getSizes();
        int int17 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 3, 0]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray5 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int int7 = iterator6.getCount();
        int[] intArray8 = iterator6.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            iterator6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, -1]");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (short) 10);
        int[] intArray12 = multidimensionalCounter4.getCounts(10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 0]");
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
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int[] intArray13 = multidimensionalCounter12.getSizes();
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getCounts(0);
        int int12 = multidimensionalCounter4.getSize();
        int int13 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        int[] intArray16 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter4.iterator();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        java.lang.Class<?> wildcardClass30 = multidimensionalCounter4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int int7 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter9 = new org.apache.commons.math.util.MultidimensionalCounter(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = multidimensionalCounter9.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        int int11 = multidimensionalCounter10.getSize();
        int[] intArray12 = multidimensionalCounter10.getSizes();
        int[] intArray13 = multidimensionalCounter10.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
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
        int[] intArray10 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter7.iterator();
        int int12 = multidimensionalCounter7.getDimension();
        int int13 = multidimensionalCounter7.getDimension();
        int int14 = multidimensionalCounter7.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator15 = multidimensionalCounter7.spliterator();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intSpliterator15);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) 'a');
        int int11 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int13 = iterator12.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter8 = new org.apache.commons.math.util.MultidimensionalCounter(intArray7);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter9 = new org.apache.commons.math.util.MultidimensionalCounter(intArray7);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray7);
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter10.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator11);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = iterator8.getCount();
        int int11 = iterator8.getCount((int) (byte) 0);
        int[] intArray12 = iterator8.getCounts();
        int[] intArray13 = iterator8.getCounts();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, -1]");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intSpliterator12);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        int int11 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
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
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int int8 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 0]");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int int7 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) '#');
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getDimension();
        int int14 = multidimensionalCounter12.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter12.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter12.spliterator();
        int[] intArray18 = multidimensionalCounter12.getCounts((int) (byte) 1);
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getDimension();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        int[] intArray27 = multidimensionalCounter23.getCounts((int) 'a');
        int[] intArray29 = multidimensionalCounter23.getCounts((int) 'a');
        int int30 = multidimensionalCounter12.getCount(intArray29);
        int int31 = multidimensionalCounter4.getCount(intArray29);
        int[] intArray33 = multidimensionalCounter4.getCounts(1);
        java.util.Spliterator<java.lang.Integer> intSpliterator34 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator35 = multidimensionalCounter4.spliterator();
        java.lang.Class<?> wildcardClass36 = intSpliterator35.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intSpliterator16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intSpliterator34);
        org.junit.Assert.assertNotNull(intSpliterator35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        int[] intArray9 = multidimensionalCounter4.getCounts(2);
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getSize();
        int[] intArray16 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter17.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator19 = multidimensionalCounter17.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter17.spliterator();
        int[] intArray22 = multidimensionalCounter17.getCounts((int) (short) 10);
        int int23 = multidimensionalCounter4.getCount(intArray22);
        java.util.Spliterator<java.lang.Integer> intSpliterator24 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator25 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator26 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator27 = multidimensionalCounter4.iterator();
        int[] intArray28 = iterator27.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 2, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intSpliterator19);
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(intSpliterator24);
        org.junit.Assert.assertNotNull(intSpliterator25);
        org.junit.Assert.assertNotNull(intSpliterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, -1]");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int[] intArray10 = multidimensionalCounter4.getCounts(10);
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getSize();
        int[] intArray17 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter15.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator19 = multidimensionalCounter15.spliterator();
        int[] intArray21 = multidimensionalCounter15.getCounts(3);
        int int22 = multidimensionalCounter4.getCount(intArray21);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter4.iterator();
        int int24 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intSpliterator19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 3, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
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
        int int10 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        int[] intArray13 = multidimensionalCounter4.getCounts(97);
        int int14 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        boolean boolean7 = iterator6.hasNext();
        int[] intArray8 = iterator6.getCounts();
        int int9 = iterator6.getCount();
        int int11 = iterator6.getCount(0);
        int int13 = iterator6.getCount((int) (short) 0);
        java.lang.Class<?> wildcardClass14 = iterator6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray10 = iterator9.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, -1]");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray8 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter9 = new org.apache.commons.math.util.MultidimensionalCounter(intArray8);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter9.iterator();
        int[] intArray12 = multidimensionalCounter9.getCounts(2);
        int int13 = multidimensionalCounter9.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter9.spliterator();
        int int15 = multidimensionalCounter9.getDimension();
        int[] intArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = multidimensionalCounter9.getCount(intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 2, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
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
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter7.spliterator();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter7.iterator();
        int int12 = multidimensionalCounter7.getSize();
        int[] intArray14 = multidimensionalCounter7.getCounts((int) (byte) 100);
        int[] intArray15 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray8 = multidimensionalCounter4.getSizes();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        int int17 = multidimensionalCounter16.getSize();
        int[] intArray18 = multidimensionalCounter16.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter16.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter16.iterator();
        int int21 = multidimensionalCounter16.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator22 = multidimensionalCounter16.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter16.iterator();
        int[] intArray25 = multidimensionalCounter16.getCounts((int) 'a');
        int[] intArray27 = multidimensionalCounter16.getCounts((int) ' ');
        int int28 = multidimensionalCounter11.getCount(intArray27);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator29 = multidimensionalCounter11.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter11.iterator();
        int[] intArray31 = iterator30.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter32 = new org.apache.commons.math.util.MultidimensionalCounter(intArray31);
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
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intSpliterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[3, 2, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, -1]");
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
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = multidimensionalCounter4.getSize();
        int int13 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter4.iterator();
        int[] intArray15 = multidimensionalCounter4.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = multidimensionalCounter4.toString();
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
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        int int14 = multidimensionalCounter4.getSize();
        int int15 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter4.spliterator();
        int[] intArray17 = multidimensionalCounter4.getSizes();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intSpliterator16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) '#');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getCounts((int) 'a');
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        java.lang.Class<?> wildcardClass11 = multidimensionalCounter4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray5 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int int7 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getSize();
        int[] intArray16 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter14.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter14.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter14.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter14.spliterator();
        int[] intArray24 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        int int26 = multidimensionalCounter25.getDimension();
        int[] intArray28 = multidimensionalCounter25.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator29 = multidimensionalCounter25.iterator();
        int[] intArray31 = multidimensionalCounter25.getCounts((int) (short) 0);
        int[] intArray35 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter36 = new org.apache.commons.math.util.MultidimensionalCounter(intArray35);
        int[] intArray38 = multidimensionalCounter36.getCounts((int) (short) 0);
        int[] intArray42 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter43 = new org.apache.commons.math.util.MultidimensionalCounter(intArray42);
        int int44 = multidimensionalCounter43.getSize();
        int int45 = multidimensionalCounter43.getDimension();
        int[] intArray49 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter50 = new org.apache.commons.math.util.MultidimensionalCounter(intArray49);
        int[] intArray52 = multidimensionalCounter50.getCounts((int) (short) 0);
        int[] intArray54 = multidimensionalCounter50.getCounts(10);
        int int55 = multidimensionalCounter43.getCount(intArray54);
        int int56 = multidimensionalCounter36.getCount(intArray54);
        int int57 = multidimensionalCounter25.getCount(intArray54);
        int int58 = multidimensionalCounter14.getCount(intArray54);
        int int59 = multidimensionalCounter4.getCount(intArray54);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator60 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(iterator60);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter7.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter7.spliterator();
        int int11 = multidimensionalCounter7.getDimension();
        int[] intArray13 = multidimensionalCounter7.getCounts((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = multidimensionalCounter7.getCounts((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[3, 5, 0]");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        int[] intArray19 = multidimensionalCounter4.getCounts((int) '#');
        int int20 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator21 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter4.iterator();
        int[] intArray26 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter27 = new org.apache.commons.math.util.MultidimensionalCounter(intArray26);
        int int28 = multidimensionalCounter27.getDimension();
        int[] intArray29 = multidimensionalCounter27.getSizes();
        int int30 = multidimensionalCounter27.getDimension();
        int[] intArray34 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter35 = new org.apache.commons.math.util.MultidimensionalCounter(intArray34);
        int int36 = multidimensionalCounter35.getSize();
        int[] intArray37 = multidimensionalCounter35.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator38 = multidimensionalCounter35.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator39 = multidimensionalCounter35.iterator();
        int int40 = multidimensionalCounter35.getSize();
        int[] intArray41 = multidimensionalCounter35.getSizes();
        int int42 = multidimensionalCounter35.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator43 = multidimensionalCounter35.spliterator();
        int int44 = multidimensionalCounter35.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator45 = multidimensionalCounter35.iterator();
        int[] intArray49 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter50 = new org.apache.commons.math.util.MultidimensionalCounter(intArray49);
        int int51 = multidimensionalCounter50.getSize();
        int[] intArray52 = multidimensionalCounter50.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator53 = multidimensionalCounter50.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator54 = multidimensionalCounter50.iterator();
        boolean boolean55 = iterator54.hasNext();
        int[] intArray56 = iterator54.getCounts();
        int int57 = multidimensionalCounter35.getCount(intArray56);
        int int58 = multidimensionalCounter27.getCount(intArray56);
        int int59 = multidimensionalCounter4.getCount(intArray56);
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intSpliterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(intSpliterator43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter7.spliterator();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter7.iterator();
        boolean boolean11 = iterator10.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getDimension();
        int int16 = multidimensionalCounter14.getDimension();
        int int17 = multidimensionalCounter14.getSize();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter22.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        int int27 = multidimensionalCounter22.getSize();
        int[] intArray31 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter32 = new org.apache.commons.math.util.MultidimensionalCounter(intArray31);
        int int33 = multidimensionalCounter32.getSize();
        int[] intArray34 = multidimensionalCounter32.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator35 = multidimensionalCounter32.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator36 = multidimensionalCounter32.iterator();
        int[] intArray40 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter41 = new org.apache.commons.math.util.MultidimensionalCounter(intArray40);
        int int42 = multidimensionalCounter41.getDimension();
        int[] intArray44 = multidimensionalCounter41.getCounts((int) (short) 10);
        int int45 = multidimensionalCounter32.getCount(intArray44);
        int int46 = multidimensionalCounter22.getCount(intArray44);
        int int47 = multidimensionalCounter14.getCount(intArray44);
        int int48 = multidimensionalCounter14.getSize();
        int int49 = multidimensionalCounter14.getSize();
        int int50 = multidimensionalCounter14.getSize();
        int[] intArray52 = multidimensionalCounter14.getCounts(0);
        int int53 = multidimensionalCounter7.getCount(intArray52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = multidimensionalCounter7.toString();
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
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int[] intArray10 = multidimensionalCounter4.getCounts((int) 'a');
        int[] intArray11 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter12.iterator();
        int int14 = multidimensionalCounter12.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int int11 = multidimensionalCounter4.getDimension();
        int[] intArray13 = multidimensionalCounter4.getCounts(0);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0]");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        int[] intArray16 = multidimensionalCounter4.getCounts((int) (byte) 100);
        java.util.Spliterator<java.lang.Integer> intSpliterator17 = multidimensionalCounter4.spliterator();
        int int18 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter4.iterator();
        int int20 = multidimensionalCounter4.getDimension();
        int int21 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator22 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter4.iterator();
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
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(intSpliterator22);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        int[] intArray19 = multidimensionalCounter4.getCounts((int) '#');
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter4.iterator();
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) '#');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getCounts((int) 'a');
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        int[] intArray12 = multidimensionalCounter4.getCounts(1);
        int int13 = multidimensionalCounter4.getDimension();
        int int14 = multidimensionalCounter4.getSize();
        int[] intArray15 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        int int17 = multidimensionalCounter16.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int13 = iterator12.getCount();
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
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter7.spliterator();
        int int9 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
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
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int[] intArray14 = multidimensionalCounter13.getSizes();
        int[] intArray16 = multidimensionalCounter13.getCounts((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = multidimensionalCounter13.toString();
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 0, 0]");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intSpliterator9);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator41 = multidimensionalCounter4.iterator();
        boolean boolean42 = iterator41.hasNext();
        int int44 = iterator41.getCount(1);
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
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        int[] intArray19 = multidimensionalCounter4.getCounts((int) '#');
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator21 = multidimensionalCounter4.spliterator();
        int int22 = multidimensionalCounter4.getSize();
        java.lang.Class<?> wildcardClass23 = multidimensionalCounter4.getClass();
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertNotNull(intSpliterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        int int17 = iterator15.getCount(2);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int int8 = iterator7.getCount();
        int[] intArray9 = iterator7.getCounts();
        boolean boolean10 = iterator7.hasNext();
        int int11 = iterator7.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
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
        boolean boolean8 = iterator7.hasNext();
        int[] intArray9 = iterator7.getCounts();
        boolean boolean10 = iterator7.hasNext();
        java.lang.Class<?> wildcardClass11 = iterator7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int int8 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
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
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray13 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = multidimensionalCounter15.toString();
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
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getCounts(10);
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter4.spliterator();
        int[] intArray15 = multidimensionalCounter4.getCounts(10);
        int[] intArray16 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter4.iterator();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) '#');
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getDimension();
        int int14 = multidimensionalCounter12.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter12.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter12.spliterator();
        int[] intArray18 = multidimensionalCounter12.getCounts((int) (byte) 1);
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getDimension();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        int[] intArray27 = multidimensionalCounter23.getCounts((int) 'a');
        int[] intArray29 = multidimensionalCounter23.getCounts((int) 'a');
        int int30 = multidimensionalCounter12.getCount(intArray29);
        int int31 = multidimensionalCounter4.getCount(intArray29);
        int[] intArray33 = multidimensionalCounter4.getCounts((int) (byte) 0);
        int int34 = multidimensionalCounter4.getDimension();
        int[] intArray38 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter39 = new org.apache.commons.math.util.MultidimensionalCounter(intArray38);
        int int40 = multidimensionalCounter39.getSize();
        int[] intArray41 = multidimensionalCounter39.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator42 = multidimensionalCounter39.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator43 = multidimensionalCounter39.iterator();
        int int44 = multidimensionalCounter39.getSize();
        int[] intArray48 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter49 = new org.apache.commons.math.util.MultidimensionalCounter(intArray48);
        int int50 = multidimensionalCounter49.getSize();
        int[] intArray51 = multidimensionalCounter49.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator52 = multidimensionalCounter49.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator53 = multidimensionalCounter49.iterator();
        int[] intArray57 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter58 = new org.apache.commons.math.util.MultidimensionalCounter(intArray57);
        int int59 = multidimensionalCounter58.getDimension();
        int[] intArray61 = multidimensionalCounter58.getCounts((int) (short) 10);
        int int62 = multidimensionalCounter49.getCount(intArray61);
        int int63 = multidimensionalCounter39.getCount(intArray61);
        int int64 = multidimensionalCounter4.getCount(intArray61);
        int int65 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator66 = multidimensionalCounter4.iterator();
        boolean boolean67 = iterator66.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intSpliterator16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray5 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter6 = new org.apache.commons.math.util.MultidimensionalCounter(intArray5);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray5);
        int[] intArray8 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator9);
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
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter7.spliterator();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter7.iterator();
        int int13 = multidimensionalCounter7.getDimension();
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int int19 = multidimensionalCounter18.getDimension();
        int[] intArray20 = multidimensionalCounter18.getSizes();
        int int21 = multidimensionalCounter18.getDimension();
        int[] intArray22 = multidimensionalCounter18.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator23 = multidimensionalCounter18.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator24 = multidimensionalCounter18.spliterator();
        int int25 = multidimensionalCounter18.getSize();
        int[] intArray26 = multidimensionalCounter18.getSizes();
        int[] intArray27 = multidimensionalCounter18.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = multidimensionalCounter7.getCount(intArray27);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator23);
        org.junit.Assert.assertNotNull(intSpliterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray13 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        int[] intArray16 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator17 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator17);
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
        int int9 = iterator8.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter4.iterator();
        int[] intArray18 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter19 = new org.apache.commons.math.util.MultidimensionalCounter(intArray18);
        int int20 = multidimensionalCounter19.getSize();
        int[] intArray21 = multidimensionalCounter19.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter19.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter19.iterator();
        int[] intArray24 = multidimensionalCounter19.getSizes();
        int[] intArray25 = multidimensionalCounter19.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter26 = new org.apache.commons.math.util.MultidimensionalCounter(intArray25);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter27 = new org.apache.commons.math.util.MultidimensionalCounter(intArray25);
        int[] intArray29 = multidimensionalCounter27.getCounts(0);
        int[] intArray31 = multidimensionalCounter27.getCounts((int) '#');
        int[] intArray35 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter36 = new org.apache.commons.math.util.MultidimensionalCounter(intArray35);
        int[] intArray38 = multidimensionalCounter36.getCounts((int) (short) 0);
        int[] intArray40 = multidimensionalCounter36.getCounts((int) '#');
        int int41 = multidimensionalCounter36.getSize();
        int[] intArray43 = multidimensionalCounter36.getCounts(3);
        int int44 = multidimensionalCounter36.getDimension();
        int int45 = multidimensionalCounter36.getSize();
        int[] intArray49 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter50 = new org.apache.commons.math.util.MultidimensionalCounter(intArray49);
        int int51 = multidimensionalCounter50.getDimension();
        int int52 = multidimensionalCounter50.getDimension();
        int int53 = multidimensionalCounter50.getSize();
        int int54 = multidimensionalCounter50.getDimension();
        int[] intArray58 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter59 = new org.apache.commons.math.util.MultidimensionalCounter(intArray58);
        int int60 = multidimensionalCounter59.getSize();
        int[] intArray61 = multidimensionalCounter59.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator62 = multidimensionalCounter59.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator63 = multidimensionalCounter59.iterator();
        int int64 = multidimensionalCounter59.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator65 = multidimensionalCounter59.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator66 = multidimensionalCounter59.iterator();
        int[] intArray68 = multidimensionalCounter59.getCounts((int) 'a');
        int int69 = multidimensionalCounter50.getCount(intArray68);
        int int70 = multidimensionalCounter36.getCount(intArray68);
        int[] intArray72 = multidimensionalCounter36.getCounts((int) '4');
        int int73 = multidimensionalCounter27.getCount(intArray72);
        int int74 = multidimensionalCounter4.getCount(intArray72);
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
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, 3, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(intSpliterator65);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 97 + "'", int69 == 97);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 97 + "'", int70 == 97);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 52 + "'", int73 == 52);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 52 + "'", int74 == 52);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter11.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator15 = multidimensionalCounter11.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter11.iterator();
        int int17 = multidimensionalCounter11.getDimension();
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
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(intSpliterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getCounts(0);
        int[] intArray12 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter4.iterator();
        int[] intArray15 = iterator14.getCounts();
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, -1]");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int int7 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(intSpliterator8);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        int[] intArray13 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 3, 0]");
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
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
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter11.iterator();
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getSize();
        int[] intArray19 = multidimensionalCounter17.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter17.iterator();
        int int22 = multidimensionalCounter17.getSize();
        int[] intArray23 = multidimensionalCounter17.getSizes();
        int[] intArray25 = multidimensionalCounter17.getCounts((int) (byte) 1);
        int int26 = multidimensionalCounter11.getCount(intArray25);
        int int27 = multidimensionalCounter11.getDimension();
        int[] intArray29 = multidimensionalCounter11.getCounts(5);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 5, 0]");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int[] intArray10 = multidimensionalCounter4.getCounts((int) 'a');
        int[] intArray11 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getSize();
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int int19 = multidimensionalCounter18.getSize();
        int[] intArray20 = multidimensionalCounter18.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter18.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter18.iterator();
        int[] intArray23 = multidimensionalCounter18.getSizes();
        int[] intArray24 = multidimensionalCounter18.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter26 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        int[] intArray28 = multidimensionalCounter26.getCounts(0);
        int[] intArray30 = multidimensionalCounter26.getCounts((int) (short) 10);
        int int31 = multidimensionalCounter12.getCount(intArray30);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter8 = new org.apache.commons.math.util.MultidimensionalCounter(intArray7);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter9 = new org.apache.commons.math.util.MultidimensionalCounter(intArray7);
        int int10 = multidimensionalCounter9.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter9.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter4.iterator();
        int[] intArray16 = multidimensionalCounter4.getCounts(52);
        int int17 = multidimensionalCounter4.getSize();
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
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int int11 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray8 = multidimensionalCounter4.getSizes();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        java.util.Spliterator<java.lang.Integer> intSpliterator17 = multidimensionalCounter16.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter16.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter16.iterator();
        int[] intArray21 = multidimensionalCounter16.getCounts((int) (byte) 0);
        int int22 = multidimensionalCounter4.getCount(intArray21);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        int[] intArray15 = multidimensionalCounter7.getCounts(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = multidimensionalCounter7.toString();
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0]");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        int int17 = multidimensionalCounter16.getSize();
        int[] intArray18 = multidimensionalCounter16.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter16.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter16.iterator();
        int int21 = multidimensionalCounter16.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator22 = multidimensionalCounter16.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter16.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator24 = multidimensionalCounter16.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter16.iterator();
        int[] intArray27 = multidimensionalCounter16.getCounts(100);
        int int28 = multidimensionalCounter4.getCount(intArray27);
        int[] intArray30 = multidimensionalCounter4.getCounts((int) ' ');
        java.util.Spliterator<java.lang.Integer> intSpliterator31 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intSpliterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(intSpliterator24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(intSpliterator31);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter42 = new org.apache.commons.math.util.MultidimensionalCounter(intArray41);
        java.util.Spliterator<java.lang.Integer> intSpliterator43 = multidimensionalCounter42.spliterator();
        int[] intArray44 = multidimensionalCounter42.getSizes();
        int[] intArray45 = multidimensionalCounter42.getSizes();
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
        org.junit.Assert.assertNotNull(intSpliterator43);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[32, 10, 1]");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        int int11 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(intSpliterator12);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int int7 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray5 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int int7 = multidimensionalCounter4.getSize();
        int int8 = multidimensionalCounter4.getSize();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray12 = iterator11.getCounts();
        boolean boolean13 = iterator11.hasNext();
        int int14 = iterator11.getCount();
        boolean boolean15 = iterator11.hasNext();
        boolean boolean16 = iterator11.hasNext();
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        int[] intArray8 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter9 = new org.apache.commons.math.util.MultidimensionalCounter(intArray8);
        int[] intArray10 = multidimensionalCounter9.getSizes();
        int int11 = multidimensionalCounter9.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter9.iterator();
        int[] intArray14 = multidimensionalCounter9.getCounts(0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0]");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = iterator8.getCounts();
        int int10 = iterator8.getCount();
        int[] intArray11 = iterator8.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, -1]");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter7.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter7.spliterator();
        int[] intArray12 = multidimensionalCounter7.getCounts((int) (short) 10);
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.iterator();
        java.lang.Class<?> wildcardClass15 = iterator14.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray13 = multidimensionalCounter4.getCounts((int) 'a');
        int[] intArray15 = multidimensionalCounter4.getCounts((int) ' ');
        int[] intArray17 = multidimensionalCounter4.getCounts(0);
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter22.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        int int27 = multidimensionalCounter22.getSize();
        int[] intArray28 = multidimensionalCounter22.getSizes();
        int int29 = multidimensionalCounter22.getSize();
        int[] intArray31 = multidimensionalCounter22.getCounts(2);
        int int32 = multidimensionalCounter4.getCount(intArray31);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator33 = multidimensionalCounter4.iterator();
        int int34 = multidimensionalCounter4.getDimension();
        int int35 = multidimensionalCounter4.getSize();
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 2, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray5 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int int7 = iterator6.getCount();
        // The following exception was thrown during execution in test generation
        try {
            iterator6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        int[] intArray14 = multidimensionalCounter7.getCounts((int) (byte) 1);
        int int15 = multidimensionalCounter7.getDimension();
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) '#');
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getDimension();
        int int14 = multidimensionalCounter12.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter12.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter12.spliterator();
        int[] intArray18 = multidimensionalCounter12.getCounts((int) (byte) 1);
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getDimension();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        int[] intArray27 = multidimensionalCounter23.getCounts((int) 'a');
        int[] intArray29 = multidimensionalCounter23.getCounts((int) 'a');
        int int30 = multidimensionalCounter12.getCount(intArray29);
        int int31 = multidimensionalCounter4.getCount(intArray29);
        int[] intArray33 = multidimensionalCounter4.getCounts((int) (byte) 0);
        int int34 = multidimensionalCounter4.getDimension();
        int[] intArray38 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter39 = new org.apache.commons.math.util.MultidimensionalCounter(intArray38);
        int int40 = multidimensionalCounter39.getSize();
        int[] intArray41 = multidimensionalCounter39.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator42 = multidimensionalCounter39.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator43 = multidimensionalCounter39.iterator();
        int int44 = multidimensionalCounter39.getSize();
        int[] intArray48 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter49 = new org.apache.commons.math.util.MultidimensionalCounter(intArray48);
        int int50 = multidimensionalCounter49.getSize();
        int[] intArray51 = multidimensionalCounter49.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator52 = multidimensionalCounter49.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator53 = multidimensionalCounter49.iterator();
        int[] intArray57 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter58 = new org.apache.commons.math.util.MultidimensionalCounter(intArray57);
        int int59 = multidimensionalCounter58.getDimension();
        int[] intArray61 = multidimensionalCounter58.getCounts((int) (short) 10);
        int int62 = multidimensionalCounter49.getCount(intArray61);
        int int63 = multidimensionalCounter39.getCount(intArray61);
        int int64 = multidimensionalCounter4.getCount(intArray61);
        int int65 = multidimensionalCounter4.getDimension();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intSpliterator16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray5 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getDimension();
        int[] intArray14 = multidimensionalCounter12.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter12.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter12.spliterator();
        int[] intArray18 = multidimensionalCounter12.getCounts((int) (short) 10);
        int int19 = multidimensionalCounter4.getCount(intArray18);
        int[] intArray20 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter21 = new org.apache.commons.math.util.MultidimensionalCounter(intArray20);
        int int22 = multidimensionalCounter21.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intSpliterator16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        int int40 = multidimensionalCounter4.getSize();
        int[] intArray42 = multidimensionalCounter4.getCounts(0);
        java.util.Spliterator<java.lang.Integer> intSpliterator43 = multidimensionalCounter4.spliterator();
        int[] intArray47 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter48 = new org.apache.commons.math.util.MultidimensionalCounter(intArray47);
        int int49 = multidimensionalCounter48.getDimension();
        int[] intArray50 = multidimensionalCounter48.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator51 = multidimensionalCounter48.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator52 = multidimensionalCounter48.spliterator();
        int int53 = multidimensionalCounter48.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator54 = multidimensionalCounter48.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator55 = multidimensionalCounter48.iterator();
        int[] intArray56 = multidimensionalCounter48.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator57 = multidimensionalCounter48.iterator();
        int[] intArray58 = iterator57.getCounts();
        int[] intArray59 = iterator57.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            int int60 = multidimensionalCounter4.getCount(intArray59);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: -1 out of [0, 0] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator43);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(intSpliterator52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertNotNull(intSpliterator54);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 0, -1]");
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
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int int12 = multidimensionalCounter11.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter11.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter11.spliterator();
        int int15 = multidimensionalCounter11.getDimension();
        java.lang.Class<?> wildcardClass16 = multidimensionalCounter11.getClass();
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
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter7.spliterator();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter7.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter7.spliterator();
        int[] intArray14 = multidimensionalCounter7.getCounts((int) (short) 1);
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
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 0]");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) '#');
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getDimension();
        int int14 = multidimensionalCounter12.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter12.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter12.spliterator();
        int[] intArray18 = multidimensionalCounter12.getCounts((int) (byte) 1);
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getDimension();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        int[] intArray27 = multidimensionalCounter23.getCounts((int) 'a');
        int[] intArray29 = multidimensionalCounter23.getCounts((int) 'a');
        int int30 = multidimensionalCounter12.getCount(intArray29);
        int int31 = multidimensionalCounter4.getCount(intArray29);
        int[] intArray33 = multidimensionalCounter4.getCounts((int) (byte) 0);
        int int34 = multidimensionalCounter4.getDimension();
        int[] intArray38 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter39 = new org.apache.commons.math.util.MultidimensionalCounter(intArray38);
        int int40 = multidimensionalCounter39.getSize();
        int[] intArray41 = multidimensionalCounter39.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator42 = multidimensionalCounter39.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator43 = multidimensionalCounter39.iterator();
        int int44 = multidimensionalCounter39.getSize();
        int[] intArray48 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter49 = new org.apache.commons.math.util.MultidimensionalCounter(intArray48);
        int int50 = multidimensionalCounter49.getSize();
        int[] intArray51 = multidimensionalCounter49.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator52 = multidimensionalCounter49.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator53 = multidimensionalCounter49.iterator();
        int[] intArray57 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter58 = new org.apache.commons.math.util.MultidimensionalCounter(intArray57);
        int int59 = multidimensionalCounter58.getDimension();
        int[] intArray61 = multidimensionalCounter58.getCounts((int) (short) 10);
        int int62 = multidimensionalCounter49.getCount(intArray61);
        int int63 = multidimensionalCounter39.getCount(intArray61);
        int int64 = multidimensionalCounter4.getCount(intArray61);
        int int65 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intSpliterator16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray5 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int int7 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getSize();
        int[] intArray16 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter14.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter14.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter14.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter14.spliterator();
        int[] intArray24 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        int int26 = multidimensionalCounter25.getDimension();
        int[] intArray28 = multidimensionalCounter25.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator29 = multidimensionalCounter25.iterator();
        int[] intArray31 = multidimensionalCounter25.getCounts((int) (short) 0);
        int[] intArray35 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter36 = new org.apache.commons.math.util.MultidimensionalCounter(intArray35);
        int[] intArray38 = multidimensionalCounter36.getCounts((int) (short) 0);
        int[] intArray42 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter43 = new org.apache.commons.math.util.MultidimensionalCounter(intArray42);
        int int44 = multidimensionalCounter43.getSize();
        int int45 = multidimensionalCounter43.getDimension();
        int[] intArray49 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter50 = new org.apache.commons.math.util.MultidimensionalCounter(intArray49);
        int[] intArray52 = multidimensionalCounter50.getCounts((int) (short) 0);
        int[] intArray54 = multidimensionalCounter50.getCounts(10);
        int int55 = multidimensionalCounter43.getCount(intArray54);
        int int56 = multidimensionalCounter36.getCount(intArray54);
        int int57 = multidimensionalCounter25.getCount(intArray54);
        int int58 = multidimensionalCounter14.getCount(intArray54);
        int int59 = multidimensionalCounter4.getCount(intArray54);
        int int60 = multidimensionalCounter4.getSize();
        int[] intArray61 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator62 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator62);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        int[] intArray16 = multidimensionalCounter4.getCounts((int) (byte) 100);
        java.util.Spliterator<java.lang.Integer> intSpliterator17 = multidimensionalCounter4.spliterator();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getDimension();
        int[] intArray25 = multidimensionalCounter22.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        int[] intArray27 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter28 = new org.apache.commons.math.util.MultidimensionalCounter(intArray27);
        int[] intArray30 = multidimensionalCounter28.getCounts((int) (byte) 10);
        int int31 = multidimensionalCounter28.getSize();
        int[] intArray33 = multidimensionalCounter28.getCounts((int) (short) 0);
        int[] intArray35 = multidimensionalCounter28.getCounts(1);
        int int36 = multidimensionalCounter4.getCount(intArray35);
        int[] intArray38 = multidimensionalCounter4.getCounts(35);
        int int39 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator40 = multidimensionalCounter4.iterator();
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
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(iterator40);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int int7 = multidimensionalCounter4.getDimension();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getSize();
        int[] intArray14 = multidimensionalCounter12.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter12.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter12.iterator();
        int int17 = multidimensionalCounter12.getSize();
        int[] intArray18 = multidimensionalCounter12.getSizes();
        int int19 = multidimensionalCounter12.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter12.spliterator();
        int int21 = multidimensionalCounter12.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter12.iterator();
        int[] intArray26 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter27 = new org.apache.commons.math.util.MultidimensionalCounter(intArray26);
        int int28 = multidimensionalCounter27.getSize();
        int[] intArray29 = multidimensionalCounter27.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter27.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator31 = multidimensionalCounter27.iterator();
        boolean boolean32 = iterator31.hasNext();
        int[] intArray33 = iterator31.getCounts();
        int int34 = multidimensionalCounter12.getCount(intArray33);
        int int35 = multidimensionalCounter4.getCount(intArray33);
        int[] intArray39 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter40 = new org.apache.commons.math.util.MultidimensionalCounter(intArray39);
        int int41 = multidimensionalCounter40.getSize();
        int[] intArray42 = multidimensionalCounter40.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator43 = multidimensionalCounter40.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator44 = multidimensionalCounter40.iterator();
        int int45 = multidimensionalCounter40.getSize();
        int[] intArray46 = multidimensionalCounter40.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter47 = new org.apache.commons.math.util.MultidimensionalCounter(intArray46);
        int int48 = multidimensionalCounter47.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator49 = multidimensionalCounter47.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator50 = multidimensionalCounter47.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator51 = multidimensionalCounter47.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator52 = multidimensionalCounter47.iterator();
        int[] intArray53 = multidimensionalCounter47.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int54 = multidimensionalCounter4.getCount(intArray53);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[32, 10, 1]");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) 'a');
        int[] intArray11 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter7.iterator();
        int int13 = multidimensionalCounter7.getSize();
        int[] intArray14 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        int[] intArray19 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter20 = new org.apache.commons.math.util.MultidimensionalCounter(intArray19);
        int int21 = multidimensionalCounter20.getDimension();
        int[] intArray23 = multidimensionalCounter20.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter20.iterator();
        int[] intArray25 = multidimensionalCounter20.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter26 = new org.apache.commons.math.util.MultidimensionalCounter(intArray25);
        int[] intArray28 = multidimensionalCounter26.getCounts(0);
        int int29 = multidimensionalCounter4.getCount(intArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = multidimensionalCounter4.toString();
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 3, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (short) 100);
        int[] intArray14 = multidimensionalCounter4.getCounts(2);
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 2, 0]");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int int11 = multidimensionalCounter4.getSize();
        int int12 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int[] intArray9 = multidimensionalCounter4.getCounts(10);
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (short) 10);
        int[] intArray12 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getDimension();
        int int16 = multidimensionalCounter14.getDimension();
        int int17 = multidimensionalCounter14.getSize();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter22.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        int int27 = multidimensionalCounter22.getSize();
        int[] intArray31 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter32 = new org.apache.commons.math.util.MultidimensionalCounter(intArray31);
        int int33 = multidimensionalCounter32.getSize();
        int[] intArray34 = multidimensionalCounter32.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator35 = multidimensionalCounter32.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator36 = multidimensionalCounter32.iterator();
        int[] intArray40 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter41 = new org.apache.commons.math.util.MultidimensionalCounter(intArray40);
        int int42 = multidimensionalCounter41.getDimension();
        int[] intArray44 = multidimensionalCounter41.getCounts((int) (short) 10);
        int int45 = multidimensionalCounter32.getCount(intArray44);
        int int46 = multidimensionalCounter22.getCount(intArray44);
        int int47 = multidimensionalCounter14.getCount(intArray44);
        int int48 = multidimensionalCounter14.getSize();
        int int49 = multidimensionalCounter14.getSize();
        int int50 = multidimensionalCounter14.getSize();
        int[] intArray52 = multidimensionalCounter14.getCounts(0);
        int int53 = multidimensionalCounter7.getCount(intArray52);
        int int54 = multidimensionalCounter7.getSize();
        int[] intArray55 = multidimensionalCounter7.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[32, 10, 1]");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int[] intArray9 = multidimensionalCounter4.getCounts((int) (byte) 0);
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int int12 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int[] intArray10 = multidimensionalCounter4.getCounts(10);
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getSize();
        int[] intArray17 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter15.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator19 = multidimensionalCounter15.spliterator();
        int[] intArray21 = multidimensionalCounter15.getCounts(3);
        int int22 = multidimensionalCounter4.getCount(intArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intSpliterator19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 3, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
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
        int[] intArray8 = multidimensionalCounter4.getSizes();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        java.util.Spliterator<java.lang.Integer> intSpliterator17 = multidimensionalCounter16.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter16.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter16.iterator();
        int[] intArray21 = multidimensionalCounter16.getCounts((int) (byte) 0);
        int int22 = multidimensionalCounter4.getCount(intArray21);
        java.util.Spliterator<java.lang.Integer> intSpliterator23 = multidimensionalCounter4.spliterator();
        int[] intArray24 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intSpliterator23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) '#');
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
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
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int int12 = multidimensionalCounter11.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter11.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter11.iterator();
        int int15 = multidimensionalCounter11.getDimension();
        int int16 = multidimensionalCounter11.getSize();
        int[] intArray18 = multidimensionalCounter11.getCounts((int) '#');
        int int19 = multidimensionalCounter11.getSize();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        boolean boolean13 = iterator12.hasNext();
        int int14 = iterator12.getCount();
        boolean boolean15 = iterator12.hasNext();
        int int16 = iterator12.getCount();
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
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter7.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter7.spliterator();
        int[] intArray12 = multidimensionalCounter7.getCounts((int) (short) 1);
        int int13 = multidimensionalCounter7.getSize();
        int int14 = multidimensionalCounter7.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int int8 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        int int15 = multidimensionalCounter11.getDimension();
        int int16 = multidimensionalCounter11.getDimension();
        int[] intArray17 = multidimensionalCounter11.getSizes();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        int[] intArray17 = multidimensionalCounter11.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter11.spliterator();
        int[] intArray19 = multidimensionalCounter11.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter11.spliterator();
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator20);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) 'a');
        int int11 = multidimensionalCounter7.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter7.spliterator();
        int int13 = multidimensionalCounter7.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        int int17 = multidimensionalCounter16.getDimension();
        int[] intArray19 = multidimensionalCounter16.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter16.iterator();
        int[] intArray24 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        int int26 = multidimensionalCounter25.getDimension();
        int[] intArray28 = multidimensionalCounter25.getCounts((int) (short) 10);
        int int29 = multidimensionalCounter16.getCount(intArray28);
        int[] intArray31 = multidimensionalCounter16.getCounts((int) '#');
        int int32 = multidimensionalCounter4.getCount(intArray31);
        int[] intArray34 = multidimensionalCounter4.getCounts(3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 3, 0]");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int13 = iterator12.getCount();
        // The following exception was thrown during execution in test generation
        try {
            iterator12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        int[] intArray41 = multidimensionalCounter4.getCounts(100);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator42 = multidimensionalCounter4.iterator();
        java.lang.Class<?> wildcardClass43 = iterator42.getClass();
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
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) (short) 100);
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int int12 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
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
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getCounts(0);
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int[] intArray13 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        int[] intArray16 = multidimensionalCounter4.getCounts(32);
        int[] intArray18 = multidimensionalCounter4.getCounts((int) '#');
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[3, 5, 0]");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        boolean boolean8 = iterator7.hasNext();
        int[] intArray9 = iterator7.getCounts();
        boolean boolean10 = iterator7.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = iterator7.getCount(5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getSize();
        int[] intArray14 = multidimensionalCounter12.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter15.iterator();
        int[] intArray20 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter21 = new org.apache.commons.math.util.MultidimensionalCounter(intArray20);
        int int22 = multidimensionalCounter21.getDimension();
        int[] intArray24 = multidimensionalCounter21.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter21.iterator();
        int[] intArray29 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter30 = new org.apache.commons.math.util.MultidimensionalCounter(intArray29);
        int int31 = multidimensionalCounter30.getDimension();
        int[] intArray33 = multidimensionalCounter30.getCounts((int) (short) 10);
        int int34 = multidimensionalCounter21.getCount(intArray33);
        int int35 = multidimensionalCounter15.getCount(intArray33);
        int int36 = multidimensionalCounter4.getCount(intArray33);
        java.util.Spliterator<java.lang.Integer> intSpliterator37 = multidimensionalCounter4.spliterator();
        int[] intArray38 = multidimensionalCounter4.getSizes();
        int[] intArray39 = multidimensionalCounter4.getSizes();
        int[] intArray41 = multidimensionalCounter4.getCounts(32);
        int[] intArray45 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter46 = new org.apache.commons.math.util.MultidimensionalCounter(intArray45);
        int int47 = multidimensionalCounter46.getSize();
        int[] intArray48 = multidimensionalCounter46.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter49 = new org.apache.commons.math.util.MultidimensionalCounter(intArray48);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator50 = multidimensionalCounter49.iterator();
        int[] intArray54 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter55 = new org.apache.commons.math.util.MultidimensionalCounter(intArray54);
        int int56 = multidimensionalCounter55.getDimension();
        int[] intArray58 = multidimensionalCounter55.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator59 = multidimensionalCounter55.iterator();
        int[] intArray63 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter64 = new org.apache.commons.math.util.MultidimensionalCounter(intArray63);
        int int65 = multidimensionalCounter64.getDimension();
        int[] intArray67 = multidimensionalCounter64.getCounts((int) (short) 10);
        int int68 = multidimensionalCounter55.getCount(intArray67);
        int int69 = multidimensionalCounter49.getCount(intArray67);
        int[] intArray71 = multidimensionalCounter49.getCounts((int) '4');
        int int72 = multidimensionalCounter4.getCount(intArray71);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(intSpliterator37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 52 + "'", int72 == 52);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        int int19 = multidimensionalCounter4.getDimension();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
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
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int int12 = multidimensionalCounter11.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter11.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter11.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter11.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter11.iterator();
        int int18 = iterator16.getCount(1);
        int[] intArray19 = iterator16.getCounts();
        int int20 = iterator16.getCount();
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
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        int[] intArray17 = multidimensionalCounter11.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter11.spliterator();
        int[] intArray19 = multidimensionalCounter11.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter11.iterator();
        int int21 = multidimensionalCounter11.getDimension();
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getSize();
        int[] intArray17 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter15.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter15.iterator();
        int int20 = multidimensionalCounter15.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator21 = multidimensionalCounter15.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter15.iterator();
        int[] intArray24 = multidimensionalCounter15.getCounts((int) 'a');
        int[] intArray26 = multidimensionalCounter15.getCounts((int) ' ');
        int[] intArray28 = multidimensionalCounter15.getCounts(0);
        int[] intArray32 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter33 = new org.apache.commons.math.util.MultidimensionalCounter(intArray32);
        int int34 = multidimensionalCounter33.getSize();
        int[] intArray35 = multidimensionalCounter33.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator36 = multidimensionalCounter33.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator37 = multidimensionalCounter33.iterator();
        int int38 = multidimensionalCounter33.getSize();
        int[] intArray39 = multidimensionalCounter33.getSizes();
        int int40 = multidimensionalCounter33.getSize();
        int[] intArray42 = multidimensionalCounter33.getCounts(2);
        int int43 = multidimensionalCounter15.getCount(intArray42);
        int[] intArray45 = multidimensionalCounter15.getCounts(35);
        int int46 = multidimensionalCounter4.getCount(intArray45);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator47 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intSpliterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 2, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
        org.junit.Assert.assertNotNull(iterator47);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int int11 = multidimensionalCounter4.getDimension();
        int[] intArray13 = multidimensionalCounter4.getCounts(10);
        int[] intArray15 = multidimensionalCounter4.getCounts((int) (byte) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter4.iterator();
        int[] intArray17 = iterator16.getCounts();
        boolean boolean18 = iterator16.hasNext();
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray10 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int int12 = multidimensionalCounter11.getSize();
        int int13 = multidimensionalCounter11.getDimension();
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int[] intArray20 = multidimensionalCounter18.getCounts((int) (short) 0);
        int[] intArray22 = multidimensionalCounter18.getCounts(10);
        int int23 = multidimensionalCounter11.getCount(intArray22);
        int int24 = multidimensionalCounter4.getCount(intArray22);
        int[] intArray25 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter26 = new org.apache.commons.math.util.MultidimensionalCounter(intArray25);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int[] intArray12 = multidimensionalCounter11.getSizes();
        int[] intArray13 = multidimensionalCounter11.getSizes();
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int int19 = multidimensionalCounter18.getSize();
        int[] intArray20 = multidimensionalCounter18.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter18.iterator();
        int[] intArray22 = multidimensionalCounter18.getSizes();
        int[] intArray23 = multidimensionalCounter18.getSizes();
        int[] intArray27 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter28 = new org.apache.commons.math.util.MultidimensionalCounter(intArray27);
        int int29 = multidimensionalCounter28.getSize();
        int[] intArray30 = multidimensionalCounter28.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator31 = multidimensionalCounter28.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator32 = multidimensionalCounter28.iterator();
        int int33 = multidimensionalCounter28.getSize();
        int[] intArray34 = multidimensionalCounter28.getSizes();
        int int35 = multidimensionalCounter28.getSize();
        int[] intArray37 = multidimensionalCounter28.getCounts(2);
        int[] intArray39 = multidimensionalCounter28.getCounts(0);
        int int40 = multidimensionalCounter18.getCount(intArray39);
        int int41 = multidimensionalCounter11.getCount(intArray39);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator42 = multidimensionalCounter11.iterator();
        boolean boolean43 = iterator42.hasNext();
        boolean boolean44 = iterator42.hasNext();
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 2, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int int15 = multidimensionalCounter13.getDimension();
        int int16 = multidimensionalCounter13.getSize();
        int int17 = multidimensionalCounter13.getDimension();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter22.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        int int27 = multidimensionalCounter22.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator28 = multidimensionalCounter22.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator29 = multidimensionalCounter22.iterator();
        int[] intArray31 = multidimensionalCounter22.getCounts((int) 'a');
        int int32 = multidimensionalCounter13.getCount(intArray31);
        int int33 = multidimensionalCounter4.getCount(intArray31);
        java.lang.Class<?> wildcardClass34 = intArray31.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intSpliterator28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) '#');
        int[] intArray10 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int int12 = multidimensionalCounter11.getSize();
        int[] intArray13 = multidimensionalCounter11.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter11.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter11.iterator();
        int[] intArray16 = multidimensionalCounter11.getSizes();
        int[] intArray18 = multidimensionalCounter11.getCounts(0);
        int int19 = multidimensionalCounter4.getCount(intArray18);
        int[] intArray20 = multidimensionalCounter4.getSizes();
        int int21 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int int10 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        int int13 = multidimensionalCounter4.getDimension();
        int int14 = multidimensionalCounter4.getSize();
        int int15 = multidimensionalCounter4.getDimension();
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
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int int8 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) 'a');
        int int11 = multidimensionalCounter4.getDimension();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int[] intArray13 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (short) 0);
        int int11 = multidimensionalCounter4.getSize();
        int[] intArray13 = multidimensionalCounter4.getCounts((int) (short) 1);
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        int[] intArray16 = multidimensionalCounter4.getCounts(0);
        int int17 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) '#');
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int13 = multidimensionalCounter12.getDimension();
        int int14 = multidimensionalCounter12.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter12.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter12.spliterator();
        int[] intArray18 = multidimensionalCounter12.getCounts((int) (byte) 1);
        int[] intArray22 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getDimension();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        int[] intArray27 = multidimensionalCounter23.getCounts((int) 'a');
        int[] intArray29 = multidimensionalCounter23.getCounts((int) 'a');
        int int30 = multidimensionalCounter12.getCount(intArray29);
        int int31 = multidimensionalCounter4.getCount(intArray29);
        int[] intArray33 = multidimensionalCounter4.getCounts((int) (byte) 0);
        int int34 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator35 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intSpliterator16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(intSpliterator35);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        int[] intArray20 = multidimensionalCounter4.getSizes();
        int[] intArray21 = multidimensionalCounter4.getSizes();
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray8 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter9 = new org.apache.commons.math.util.MultidimensionalCounter(intArray8);
        int int10 = multidimensionalCounter9.getSize();
        int[] intArray11 = multidimensionalCounter9.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter12.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter12.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter12.iterator();
        int[] intArray16 = iterator15.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = multidimensionalCounter4.getCount(intArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: -1 out of [0, 0] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, -1]");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = iterator11.getCount();
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) 'a');
        int[] intArray11 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter7.iterator();
        int int13 = multidimensionalCounter7.getSize();
        int int14 = multidimensionalCounter7.getDimension();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        int int10 = multidimensionalCounter4.getDimension();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int int13 = multidimensionalCounter4.getDimension();
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int[] intArray19 = multidimensionalCounter18.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter18.iterator();
        int int21 = multidimensionalCounter18.getSize();
        int int22 = multidimensionalCounter18.getSize();
        int[] intArray23 = multidimensionalCounter18.getSizes();
        int[] intArray24 = multidimensionalCounter18.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = multidimensionalCounter4.getCount(intArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        int int16 = multidimensionalCounter11.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator17 = multidimensionalCounter11.spliterator();
        int int18 = multidimensionalCounter11.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator19 = multidimensionalCounter11.spliterator();
        int int20 = multidimensionalCounter11.getDimension();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intSpliterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(intSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        int int19 = multidimensionalCounter4.getDimension();
        int int20 = multidimensionalCounter4.getDimension();
        int[] intArray24 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        int int26 = multidimensionalCounter25.getDimension();
        int[] intArray27 = multidimensionalCounter25.getSizes();
        int int28 = multidimensionalCounter25.getSize();
        int[] intArray30 = multidimensionalCounter25.getCounts(0);
        int[] intArray32 = multidimensionalCounter25.getCounts(100);
        int int33 = multidimensionalCounter4.getCount(intArray32);
        int[] intArray35 = multidimensionalCounter4.getCounts((int) (short) 1);
        java.util.Spliterator<java.lang.Integer> intSpliterator36 = multidimensionalCounter4.spliterator();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intSpliterator36);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        int[] intArray11 = multidimensionalCounter4.getCounts(10);
        int[] intArray13 = multidimensionalCounter4.getCounts(0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0]");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int int8 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(intSpliterator9);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int int7 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getSizes();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts((int) 'a');
        int int12 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        int int14 = iterator13.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray13 = multidimensionalCounter4.getCounts(1);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        int[] intArray16 = iterator15.getCounts();
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, -1]");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getCounts(52);
        int[] intArray13 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[5, 2, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        int int10 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        boolean boolean13 = iterator12.hasNext();
        int int15 = iterator12.getCount((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        int[] intArray12 = multidimensionalCounter10.getCounts((int) (byte) 10);
        int[] intArray13 = multidimensionalCounter10.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter10.iterator();
        int[] intArray15 = iterator14.getCounts();
        boolean boolean16 = iterator14.hasNext();
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        boolean boolean7 = iterator6.hasNext();
        int[] intArray8 = iterator6.getCounts();
        int[] intArray9 = iterator6.getCounts();
        int[] intArray10 = iterator6.getCounts();
        int int11 = iterator6.getCount();
        boolean boolean12 = iterator6.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int int7 = iterator6.getCount();
        boolean boolean8 = iterator6.hasNext();
        int[] intArray9 = iterator6.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0]");
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
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray13 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter14.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter14.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = iterator16.getCount(35);
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
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray10 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int int12 = multidimensionalCounter11.getSize();
        int int13 = multidimensionalCounter11.getDimension();
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int[] intArray20 = multidimensionalCounter18.getCounts((int) (short) 0);
        int[] intArray22 = multidimensionalCounter18.getCounts(10);
        int int23 = multidimensionalCounter11.getCount(intArray22);
        int int24 = multidimensionalCounter4.getCount(intArray22);
        int int25 = multidimensionalCounter4.getDimension();
        int int26 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator27 = multidimensionalCounter4.spliterator();
        int[] intArray29 = multidimensionalCounter4.getCounts(0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intSpliterator27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0]");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        int[] intArray19 = multidimensionalCounter4.getCounts((int) '#');
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter4.spliterator();
        int[] intArray21 = multidimensionalCounter4.getSizes();
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
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
        int int8 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getDimension();
        int int16 = multidimensionalCounter14.getDimension();
        int int17 = multidimensionalCounter14.getSize();
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter22.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        int int27 = multidimensionalCounter22.getSize();
        int[] intArray31 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter32 = new org.apache.commons.math.util.MultidimensionalCounter(intArray31);
        int int33 = multidimensionalCounter32.getSize();
        int[] intArray34 = multidimensionalCounter32.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator35 = multidimensionalCounter32.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator36 = multidimensionalCounter32.iterator();
        int[] intArray40 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter41 = new org.apache.commons.math.util.MultidimensionalCounter(intArray40);
        int int42 = multidimensionalCounter41.getDimension();
        int[] intArray44 = multidimensionalCounter41.getCounts((int) (short) 10);
        int int45 = multidimensionalCounter32.getCount(intArray44);
        int int46 = multidimensionalCounter22.getCount(intArray44);
        int int47 = multidimensionalCounter14.getCount(intArray44);
        int int48 = multidimensionalCounter14.getSize();
        int[] intArray49 = multidimensionalCounter14.getSizes();
        int int50 = multidimensionalCounter14.getSize();
        int[] intArray51 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter52 = new org.apache.commons.math.util.MultidimensionalCounter(intArray51);
        java.util.Spliterator<java.lang.Integer> intSpliterator53 = multidimensionalCounter52.spliterator();
        int[] intArray54 = multidimensionalCounter52.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter55 = new org.apache.commons.math.util.MultidimensionalCounter(intArray54);
        int int56 = multidimensionalCounter55.getSize();
        int[] intArray58 = multidimensionalCounter55.getCounts(2);
        int int59 = multidimensionalCounter4.getCount(intArray58);
        int[] intArray61 = multidimensionalCounter4.getCounts(97);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator53);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 2, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[9, 7, 0]");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        int int14 = iterator12.getCount((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = iterator12.getCount((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        int int41 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator42 = multidimensionalCounter4.iterator();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(iterator42);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int[] intArray13 = iterator12.getCounts();
        boolean boolean14 = iterator12.hasNext();
        boolean boolean15 = iterator12.hasNext();
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getCounts(5);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 5, 0]");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int int7 = multidimensionalCounter4.getDimension();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int[] intArray14 = multidimensionalCounter12.getCounts((int) (short) 0);
        int[] intArray16 = multidimensionalCounter12.getCounts((int) '#');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter12.iterator();
        int[] intArray18 = multidimensionalCounter12.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter19 = new org.apache.commons.math.util.MultidimensionalCounter(intArray18);
        int[] intArray21 = multidimensionalCounter19.getCounts(0);
        int int22 = multidimensionalCounter4.getCount(intArray21);
        int int23 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
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
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        int int11 = multidimensionalCounter10.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter10.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter10.iterator();
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int int19 = multidimensionalCounter18.getDimension();
        int[] intArray21 = multidimensionalCounter18.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter18.iterator();
        int[] intArray23 = multidimensionalCounter18.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter24 = new org.apache.commons.math.util.MultidimensionalCounter(intArray23);
        int[] intArray26 = multidimensionalCounter24.getCounts((int) (byte) 10);
        int int27 = multidimensionalCounter24.getSize();
        int[] intArray29 = multidimensionalCounter24.getCounts((int) (short) 0);
        java.util.Spliterator<java.lang.Integer> intSpliterator30 = multidimensionalCounter24.spliterator();
        int int31 = multidimensionalCounter24.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator32 = multidimensionalCounter24.iterator();
        int[] intArray34 = multidimensionalCounter24.getCounts(10);
        int int35 = multidimensionalCounter10.getCount(intArray34);
        int[] intArray37 = multidimensionalCounter10.getCounts((int) ' ');
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
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[3, 2, 0]");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = iterator13.getCount(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 3, 0]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int[] intArray9 = multidimensionalCounter4.getCounts(10);
        int int10 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray13 = multidimensionalCounter4.getCounts((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0]");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        boolean boolean9 = iterator8.hasNext();
        int[] intArray10 = iterator8.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            iterator8.remove();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0]");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int int12 = multidimensionalCounter11.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter11.iterator();
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int int19 = multidimensionalCounter18.getDimension();
        int int20 = multidimensionalCounter18.getDimension();
        int int21 = multidimensionalCounter18.getSize();
        int[] intArray25 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter26 = new org.apache.commons.math.util.MultidimensionalCounter(intArray25);
        int int27 = multidimensionalCounter26.getSize();
        int[] intArray28 = multidimensionalCounter26.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator29 = multidimensionalCounter26.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter26.iterator();
        int int31 = multidimensionalCounter26.getSize();
        int[] intArray35 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter36 = new org.apache.commons.math.util.MultidimensionalCounter(intArray35);
        int int37 = multidimensionalCounter36.getSize();
        int[] intArray38 = multidimensionalCounter36.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator39 = multidimensionalCounter36.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator40 = multidimensionalCounter36.iterator();
        int[] intArray44 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter45 = new org.apache.commons.math.util.MultidimensionalCounter(intArray44);
        int int46 = multidimensionalCounter45.getDimension();
        int[] intArray48 = multidimensionalCounter45.getCounts((int) (short) 10);
        int int49 = multidimensionalCounter36.getCount(intArray48);
        int int50 = multidimensionalCounter26.getCount(intArray48);
        int int51 = multidimensionalCounter18.getCount(intArray48);
        int int52 = multidimensionalCounter18.getSize();
        int int53 = multidimensionalCounter18.getSize();
        int int54 = multidimensionalCounter18.getSize();
        int[] intArray56 = multidimensionalCounter18.getCounts(0);
        int int57 = multidimensionalCounter11.getCount(intArray56);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator58 = multidimensionalCounter11.iterator();
        int[] intArray60 = multidimensionalCounter11.getCounts((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter61 = new org.apache.commons.math.util.MultidimensionalCounter(intArray60);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[10, 0, 0]");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        int int12 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter4.iterator();
        java.lang.Class<?> wildcardClass14 = iterator13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 3, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getSizes();
        int int13 = multidimensionalCounter4.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
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
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int int9 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int[] intArray13 = multidimensionalCounter4.getCounts(52);
        int int14 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator15 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intSpliterator15);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int[] intArray8 = multidimensionalCounter4.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        int[] intArray9 = multidimensionalCounter4.getCounts(2);
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getSize();
        int[] intArray16 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter17.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator19 = multidimensionalCounter17.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter17.spliterator();
        int[] intArray22 = multidimensionalCounter17.getCounts((int) (short) 10);
        int int23 = multidimensionalCounter4.getCount(intArray22);
        int[] intArray25 = multidimensionalCounter4.getCounts(35);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 2, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intSpliterator19);
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[3, 5, 0]");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (short) 0);
        int int11 = multidimensionalCounter4.getSize();
        int[] intArray13 = multidimensionalCounter4.getCounts((int) (short) 1);
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        int[] intArray16 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 100);
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getSize();
        int[] intArray19 = multidimensionalCounter17.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter17.iterator();
        int int22 = multidimensionalCounter17.getSize();
        int[] intArray23 = multidimensionalCounter17.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter24 = new org.apache.commons.math.util.MultidimensionalCounter(intArray23);
        int int25 = multidimensionalCounter24.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator26 = multidimensionalCounter24.spliterator();
        int[] intArray30 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter31 = new org.apache.commons.math.util.MultidimensionalCounter(intArray30);
        int[] intArray33 = multidimensionalCounter31.getCounts((int) '#');
        java.util.Spliterator<java.lang.Integer> intSpliterator34 = multidimensionalCounter31.spliterator();
        int[] intArray38 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter39 = new org.apache.commons.math.util.MultidimensionalCounter(intArray38);
        int int40 = multidimensionalCounter39.getDimension();
        int int41 = multidimensionalCounter39.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator42 = multidimensionalCounter39.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator43 = multidimensionalCounter39.spliterator();
        int[] intArray45 = multidimensionalCounter39.getCounts((int) (byte) 1);
        int[] intArray49 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter50 = new org.apache.commons.math.util.MultidimensionalCounter(intArray49);
        int int51 = multidimensionalCounter50.getDimension();
        int[] intArray52 = multidimensionalCounter50.getSizes();
        int[] intArray54 = multidimensionalCounter50.getCounts((int) 'a');
        int[] intArray56 = multidimensionalCounter50.getCounts((int) 'a');
        int int57 = multidimensionalCounter39.getCount(intArray56);
        int int58 = multidimensionalCounter31.getCount(intArray56);
        int[] intArray60 = multidimensionalCounter31.getCounts((int) (byte) 0);
        int int61 = multidimensionalCounter31.getDimension();
        int[] intArray65 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter66 = new org.apache.commons.math.util.MultidimensionalCounter(intArray65);
        int int67 = multidimensionalCounter66.getSize();
        int[] intArray68 = multidimensionalCounter66.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator69 = multidimensionalCounter66.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator70 = multidimensionalCounter66.iterator();
        int int71 = multidimensionalCounter66.getSize();
        int[] intArray75 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter76 = new org.apache.commons.math.util.MultidimensionalCounter(intArray75);
        int int77 = multidimensionalCounter76.getSize();
        int[] intArray78 = multidimensionalCounter76.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator79 = multidimensionalCounter76.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator80 = multidimensionalCounter76.iterator();
        int[] intArray84 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter85 = new org.apache.commons.math.util.MultidimensionalCounter(intArray84);
        int int86 = multidimensionalCounter85.getDimension();
        int[] intArray88 = multidimensionalCounter85.getCounts((int) (short) 10);
        int int89 = multidimensionalCounter76.getCount(intArray88);
        int int90 = multidimensionalCounter66.getCount(intArray88);
        int int91 = multidimensionalCounter31.getCount(intArray88);
        int int92 = multidimensionalCounter24.getCount(intArray88);
        int int93 = multidimensionalCounter4.getCount(intArray88);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator94 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(intSpliterator26);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(intSpliterator34);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(intSpliterator43);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 97 + "'", int58 == 97);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator69);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator79);
        org.junit.Assert.assertNotNull(iterator80);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 3 + "'", int86 == 3);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 10 + "'", int89 == 10);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 10 + "'", int90 == 10);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 10 + "'", int91 == 10);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 10 + "'", int92 == 10);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 10 + "'", int93 == 10);
        org.junit.Assert.assertNotNull(iterator94);
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
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int12 = multidimensionalCounter4.getSize();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        java.lang.Class<?> wildcardClass12 = iterator11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts(0);
        int[] intArray12 = multidimensionalCounter4.getCounts((int) '4');
        int int13 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator15 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[5, 2, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(intSpliterator15);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray12 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        int int14 = multidimensionalCounter13.getDimension();
        int[] intArray16 = multidimensionalCounter13.getCounts((int) (short) 10);
        int int17 = multidimensionalCounter4.getCount(intArray16);
        int int18 = multidimensionalCounter4.getDimension();
        int int19 = multidimensionalCounter4.getSize();
        int[] intArray23 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter24 = new org.apache.commons.math.util.MultidimensionalCounter(intArray23);
        int int25 = multidimensionalCounter24.getDimension();
        int[] intArray26 = multidimensionalCounter24.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = multidimensionalCounter4.getCount(intArray26);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 10, 1]");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        int[] intArray9 = multidimensionalCounter4.getCounts(10);
        int[] intArray11 = multidimensionalCounter4.getCounts((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 0]");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        int int10 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int int13 = iterator11.getCount(2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter17.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter17.iterator();
        int[] intArray24 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        int int26 = multidimensionalCounter25.getDimension();
        int[] intArray28 = multidimensionalCounter25.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator29 = multidimensionalCounter25.iterator();
        int[] intArray31 = multidimensionalCounter25.getCounts((int) (short) 0);
        int[] intArray35 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter36 = new org.apache.commons.math.util.MultidimensionalCounter(intArray35);
        int[] intArray38 = multidimensionalCounter36.getCounts((int) (short) 0);
        int[] intArray42 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter43 = new org.apache.commons.math.util.MultidimensionalCounter(intArray42);
        int int44 = multidimensionalCounter43.getSize();
        int int45 = multidimensionalCounter43.getDimension();
        int[] intArray49 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter50 = new org.apache.commons.math.util.MultidimensionalCounter(intArray49);
        int[] intArray52 = multidimensionalCounter50.getCounts((int) (short) 0);
        int[] intArray54 = multidimensionalCounter50.getCounts(10);
        int int55 = multidimensionalCounter43.getCount(intArray54);
        int int56 = multidimensionalCounter36.getCount(intArray54);
        int int57 = multidimensionalCounter25.getCount(intArray54);
        int int58 = multidimensionalCounter17.getCount(intArray54);
        int int59 = multidimensionalCounter4.getCount(intArray54);
        java.util.Spliterator<java.lang.Integer> intSpliterator60 = multidimensionalCounter4.spliterator();
        int[] intArray62 = multidimensionalCounter4.getCounts(0);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(intSpliterator60);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 0]");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int int8 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) 'a');
        int int11 = multidimensionalCounter4.getDimension();
        int int12 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getDimension();
        int int16 = multidimensionalCounter14.getDimension();
        int[] intArray18 = multidimensionalCounter14.getCounts((int) (short) 0);
        int int19 = multidimensionalCounter4.getCount(intArray18);
        int[] intArray23 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter24 = new org.apache.commons.math.util.MultidimensionalCounter(intArray23);
        int[] intArray26 = multidimensionalCounter24.getCounts((int) (short) 0);
        int[] intArray28 = multidimensionalCounter24.getCounts((int) '#');
        int int29 = multidimensionalCounter24.getSize();
        int[] intArray31 = multidimensionalCounter24.getCounts(3);
        int int32 = multidimensionalCounter24.getDimension();
        int int33 = multidimensionalCounter24.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator34 = multidimensionalCounter24.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator35 = multidimensionalCounter24.spliterator();
        int int36 = multidimensionalCounter24.getDimension();
        int[] intArray40 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter41 = new org.apache.commons.math.util.MultidimensionalCounter(intArray40);
        int[] intArray43 = multidimensionalCounter41.getCounts((int) (short) 0);
        int[] intArray45 = multidimensionalCounter41.getCounts((int) '#');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator46 = multidimensionalCounter41.iterator();
        int[] intArray47 = multidimensionalCounter41.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter48 = new org.apache.commons.math.util.MultidimensionalCounter(intArray47);
        int[] intArray50 = multidimensionalCounter48.getCounts(0);
        int int51 = multidimensionalCounter24.getCount(intArray50);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator52 = multidimensionalCounter24.iterator();
        int[] intArray54 = multidimensionalCounter24.getCounts((int) '#');
        int int55 = multidimensionalCounter4.getCount(intArray54);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 3, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intSpliterator34);
        org.junit.Assert.assertNotNull(intSpliterator35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getSize();
        int[] intArray17 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter15.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter15.iterator();
        int int20 = multidimensionalCounter15.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator21 = multidimensionalCounter15.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter15.iterator();
        int int23 = multidimensionalCounter15.getSize();
        int[] intArray27 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter28 = new org.apache.commons.math.util.MultidimensionalCounter(intArray27);
        int int29 = multidimensionalCounter28.getSize();
        int[] intArray30 = multidimensionalCounter28.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator31 = multidimensionalCounter28.iterator();
        boolean boolean32 = iterator31.hasNext();
        int[] intArray33 = iterator31.getCounts();
        int int34 = multidimensionalCounter15.getCount(intArray33);
        int int35 = multidimensionalCounter4.getCount(intArray33);
        int[] intArray36 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator37 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intSpliterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator37);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator15 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter4.iterator();
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
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(intSpliterator15);
        org.junit.Assert.assertNotNull(intSpliterator16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray13 = multidimensionalCounter4.getCounts((int) 'a');
        int[] intArray15 = multidimensionalCounter4.getCounts((int) ' ');
        int[] intArray17 = multidimensionalCounter4.getCounts(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0]");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        int[] intArray19 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter20 = new org.apache.commons.math.util.MultidimensionalCounter(intArray19);
        int int21 = multidimensionalCounter20.getDimension();
        int[] intArray23 = multidimensionalCounter20.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter20.iterator();
        int[] intArray25 = multidimensionalCounter20.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter26 = new org.apache.commons.math.util.MultidimensionalCounter(intArray25);
        int[] intArray28 = multidimensionalCounter26.getCounts(0);
        int int29 = multidimensionalCounter4.getCount(intArray28);
        int[] intArray33 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter34 = new org.apache.commons.math.util.MultidimensionalCounter(intArray33);
        int int35 = multidimensionalCounter34.getDimension();
        int[] intArray36 = multidimensionalCounter34.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator37 = multidimensionalCounter34.iterator();
        int int38 = multidimensionalCounter34.getSize();
        int[] intArray39 = multidimensionalCounter34.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int40 = multidimensionalCounter4.getCount(intArray39);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 3, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[32, 10, 1]");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray13 = multidimensionalCounter4.getCounts((int) 'a');
        int[] intArray15 = multidimensionalCounter4.getCounts((int) ' ');
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter4.spliterator();
        int[] intArray20 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter21 = new org.apache.commons.math.util.MultidimensionalCounter(intArray20);
        java.util.Spliterator<java.lang.Integer> intSpliterator22 = multidimensionalCounter21.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter21.iterator();
        int[] intArray24 = multidimensionalCounter21.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = multidimensionalCounter4.getCount(intArray24);
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
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(intSpliterator16);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
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
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int int11 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        int int13 = multidimensionalCounter4.getDimension();
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int[] intArray20 = multidimensionalCounter18.getCounts((int) '#');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter18.iterator();
        int[] intArray23 = multidimensionalCounter18.getCounts((int) 'a');
        int[] intArray24 = multidimensionalCounter18.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = multidimensionalCounter4.getCount(intArray24);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
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
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int int11 = multidimensionalCounter4.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int14 = iterator12.getCount(2);
        java.lang.Class<?> wildcardClass15 = iterator12.getClass();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        int[] intArray9 = multidimensionalCounter4.getCounts(2);
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getSize();
        int[] intArray16 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter17.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator19 = multidimensionalCounter17.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter17.spliterator();
        int[] intArray22 = multidimensionalCounter17.getCounts((int) (short) 10);
        int int23 = multidimensionalCounter4.getCount(intArray22);
        java.util.Spliterator<java.lang.Integer> intSpliterator24 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator25 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator26 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator27 = multidimensionalCounter4.iterator();
        int[] intArray29 = multidimensionalCounter4.getCounts(35);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 2, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intSpliterator19);
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(intSpliterator24);
        org.junit.Assert.assertNotNull(intSpliterator25);
        org.junit.Assert.assertNotNull(intSpliterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(iterator30);
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
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int int11 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        int int13 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter4.iterator();
        int[] intArray18 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter19 = new org.apache.commons.math.util.MultidimensionalCounter(intArray18);
        int int20 = multidimensionalCounter19.getDimension();
        int int21 = multidimensionalCounter19.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter19.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator23 = multidimensionalCounter19.spliterator();
        int[] intArray25 = multidimensionalCounter19.getCounts((int) (byte) 1);
        int[] intArray26 = multidimensionalCounter19.getSizes();
        int[] intArray28 = multidimensionalCounter19.getCounts(0);
        int int29 = multidimensionalCounter4.getCount(intArray28);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intSpliterator23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        java.lang.Class<?> wildcardClass10 = iterator9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray5 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter8 = new org.apache.commons.math.util.MultidimensionalCounter(intArray7);
        int[] intArray9 = multidimensionalCounter8.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray8 = multidimensionalCounter4.getSizes();
        int int9 = multidimensionalCounter4.getDimension();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        int int12 = multidimensionalCounter4.getDimension();
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
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int int7 = iterator6.getCount();
        int int8 = iterator6.getCount();
        int int9 = iterator6.getCount();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int int10 = multidimensionalCounter4.getDimension();
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 10);
        int int13 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = iterator8.getCount();
        int int11 = iterator8.getCount((int) (byte) 0);
        int int12 = iterator8.getCount();
        int int13 = iterator8.getCount();
        int int15 = iterator8.getCount((int) (short) 0);
        int int16 = iterator8.getCount();
        boolean boolean17 = iterator8.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) (short) 100);
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        int int10 = multidimensionalCounter4.getDimension();
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getSize();
        int[] intArray17 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter15.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter15.iterator();
        int int20 = multidimensionalCounter15.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator21 = multidimensionalCounter15.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter15.iterator();
        int int23 = multidimensionalCounter15.getSize();
        int[] intArray27 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter28 = new org.apache.commons.math.util.MultidimensionalCounter(intArray27);
        int int29 = multidimensionalCounter28.getSize();
        int[] intArray30 = multidimensionalCounter28.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator31 = multidimensionalCounter28.iterator();
        boolean boolean32 = iterator31.hasNext();
        int[] intArray33 = iterator31.getCounts();
        int int34 = multidimensionalCounter15.getCount(intArray33);
        int int35 = multidimensionalCounter4.getCount(intArray33);
        int[] intArray37 = multidimensionalCounter4.getCounts((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intSpliterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1, 0]");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        int[] intArray15 = multidimensionalCounter11.getCounts((int) (byte) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter11.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter11.iterator();
        int[] intArray18 = iterator17.getCounts();
        boolean boolean19 = iterator17.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator17.remove();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int int19 = multidimensionalCounter18.getSize();
        int[] intArray20 = multidimensionalCounter18.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter18.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter18.iterator();
        int[] intArray23 = multidimensionalCounter18.getSizes();
        int[] intArray24 = multidimensionalCounter18.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter25.iterator();
        int[] intArray30 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter31 = new org.apache.commons.math.util.MultidimensionalCounter(intArray30);
        int int32 = multidimensionalCounter31.getSize();
        int[] intArray33 = multidimensionalCounter31.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator34 = multidimensionalCounter31.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator35 = multidimensionalCounter31.iterator();
        int int36 = multidimensionalCounter31.getSize();
        int[] intArray37 = multidimensionalCounter31.getSizes();
        int[] intArray39 = multidimensionalCounter31.getCounts((int) (byte) 1);
        int int40 = multidimensionalCounter25.getCount(intArray39);
        int int41 = multidimensionalCounter4.getCount(intArray39);
        java.util.Spliterator<java.lang.Integer> intSpliterator42 = multidimensionalCounter4.spliterator();
        java.lang.Class<?> wildcardClass43 = multidimensionalCounter4.getClass();
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(intSpliterator42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        int[] intArray43 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter44 = new org.apache.commons.math.util.MultidimensionalCounter(intArray43);
        int[] intArray45 = multidimensionalCounter44.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator46 = multidimensionalCounter44.iterator();
        int int47 = multidimensionalCounter44.getSize();
        int int48 = multidimensionalCounter44.getSize();
        int[] intArray49 = multidimensionalCounter44.getSizes();
        int[] intArray51 = multidimensionalCounter44.getCounts((int) (short) 10);
        int int52 = multidimensionalCounter4.getCount(intArray51);
        int[] intArray54 = multidimensionalCounter4.getCounts((int) 'a');
        int[] intArray58 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter59 = new org.apache.commons.math.util.MultidimensionalCounter(intArray58);
        int int60 = multidimensionalCounter59.getSize();
        int[] intArray61 = multidimensionalCounter59.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int62 = multidimensionalCounter4.getCount(intArray61);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
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
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[32, 10, 1]");
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
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter13.iterator();
        int[] intArray18 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter19 = new org.apache.commons.math.util.MultidimensionalCounter(intArray18);
        int int20 = multidimensionalCounter19.getSize();
        int[] intArray21 = multidimensionalCounter19.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter19.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter19.iterator();
        int[] intArray24 = multidimensionalCounter19.getSizes();
        int[] intArray26 = multidimensionalCounter19.getCounts(0);
        int[] intArray27 = multidimensionalCounter19.getSizes();
        int[] intArray28 = multidimensionalCounter19.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = multidimensionalCounter13.getCount(intArray28);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getCounts(2);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 2, 0]");
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray12 = multidimensionalCounter4.getCounts((int) 'a');
        int[] intArray14 = multidimensionalCounter4.getCounts((int) (short) 0);
        int int15 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int int8 = multidimensionalCounter4.getSize();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getCounts(100);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int[] intArray13 = iterator12.getCounts();
        boolean boolean14 = iterator12.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        int int17 = multidimensionalCounter16.getSize();
        int[] intArray18 = multidimensionalCounter16.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter16.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter16.spliterator();
        int[] intArray22 = multidimensionalCounter16.getCounts(3);
        int[] intArray24 = multidimensionalCounter16.getCounts(35);
        int int25 = multidimensionalCounter11.getCount(intArray24);
        java.lang.Class<?> wildcardClass26 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 3, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int int8 = multidimensionalCounter4.getSize();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int int10 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getSize();
        int[] intArray10 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int int12 = multidimensionalCounter11.getSize();
        int[] intArray13 = multidimensionalCounter11.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter11.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter11.iterator();
        int int16 = multidimensionalCounter11.getSize();
        int[] intArray17 = multidimensionalCounter11.getSizes();
        int int18 = multidimensionalCounter11.getSize();
        int[] intArray20 = multidimensionalCounter11.getCounts(2);
        int int21 = multidimensionalCounter4.getCount(intArray20);
        int int22 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 2, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        int[] intArray12 = multidimensionalCounter10.getCounts((int) (byte) 10);
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter10.spliterator();
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
        org.junit.Assert.assertNotNull(intSpliterator13);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = iterator10.getCounts();
        int int13 = iterator10.getCount(1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        int int19 = multidimensionalCounter4.getDimension();
        int int20 = multidimensionalCounter4.getDimension();
        int[] intArray24 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter25 = new org.apache.commons.math.util.MultidimensionalCounter(intArray24);
        int int26 = multidimensionalCounter25.getDimension();
        int[] intArray27 = multidimensionalCounter25.getSizes();
        int int28 = multidimensionalCounter25.getSize();
        int[] intArray30 = multidimensionalCounter25.getCounts(0);
        int[] intArray32 = multidimensionalCounter25.getCounts(100);
        int int33 = multidimensionalCounter4.getCount(intArray32);
        int int34 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator35 = multidimensionalCounter4.spliterator();
        int[] intArray36 = multidimensionalCounter4.getSizes();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intSpliterator35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 10, 1]");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        int[] intArray39 = multidimensionalCounter4.getSizes();
        int[] intArray40 = multidimensionalCounter4.getSizes();
        int int41 = multidimensionalCounter4.getDimension();
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
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int int11 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        int int13 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        boolean boolean16 = iterator15.hasNext();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray11 = iterator10.getCounts();
        int int12 = iterator10.getCount();
        boolean boolean13 = iterator10.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator7 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int int9 = multidimensionalCounter4.getDimension();
        int int10 = multidimensionalCounter4.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = multidimensionalCounter4.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter10 = new org.apache.commons.math.util.MultidimensionalCounter(intArray9);
        int[] intArray12 = multidimensionalCounter10.getCounts((int) (byte) 10);
        int int13 = multidimensionalCounter10.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter10.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter10.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter10.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter10.iterator();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        int[] intArray16 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getSize();
        int[] intArray19 = multidimensionalCounter17.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter17.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter17.iterator();
        int int22 = multidimensionalCounter17.getSize();
        int[] intArray23 = multidimensionalCounter17.getSizes();
        int[] intArray25 = multidimensionalCounter17.getCounts((int) (byte) 1);
        int int26 = multidimensionalCounter11.getCount(intArray25);
        int int27 = multidimensionalCounter11.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator28 = multidimensionalCounter11.iterator();
        int[] intArray32 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter33 = new org.apache.commons.math.util.MultidimensionalCounter(intArray32);
        int int34 = multidimensionalCounter33.getSize();
        int[] intArray35 = multidimensionalCounter33.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator36 = multidimensionalCounter33.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator37 = multidimensionalCounter33.iterator();
        int int38 = multidimensionalCounter33.getSize();
        int[] intArray39 = multidimensionalCounter33.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter40 = new org.apache.commons.math.util.MultidimensionalCounter(intArray39);
        int int41 = multidimensionalCounter40.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator42 = multidimensionalCounter40.iterator();
        int[] intArray44 = multidimensionalCounter40.getCounts((int) (byte) 0);
        int int45 = multidimensionalCounter11.getCount(intArray44);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        int[] intArray13 = multidimensionalCounter4.getCounts((int) 'a');
        int[] intArray15 = multidimensionalCounter4.getCounts((int) ' ');
        int[] intArray17 = multidimensionalCounter4.getCounts(0);
        int[] intArray21 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int int23 = multidimensionalCounter22.getSize();
        int[] intArray24 = multidimensionalCounter22.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter22.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter22.iterator();
        int int27 = multidimensionalCounter22.getSize();
        int[] intArray28 = multidimensionalCounter22.getSizes();
        int int29 = multidimensionalCounter22.getSize();
        int[] intArray31 = multidimensionalCounter22.getCounts(2);
        int int32 = multidimensionalCounter4.getCount(intArray31);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator33 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator34 = multidimensionalCounter4.iterator();
        boolean boolean35 = iterator34.hasNext();
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[3, 2, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 2, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) '#');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getCounts((int) 'a');
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter4.spliterator();
        int[] intArray15 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter16 = new org.apache.commons.math.util.MultidimensionalCounter(intArray15);
        int int17 = multidimensionalCounter16.getSize();
        int[] intArray18 = multidimensionalCounter16.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator19 = multidimensionalCounter16.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter16.iterator();
        int[] intArray21 = iterator20.getCounts();
        int[] intArray22 = iterator20.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = multidimensionalCounter4.getCount(intArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: -1 out of [0, 0] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, -1]");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter4.iterator();
        int[] intArray16 = multidimensionalCounter4.getCounts(1);
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
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 0]");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        boolean boolean8 = iterator7.hasNext();
        int[] intArray9 = iterator7.getCounts();
        boolean boolean10 = iterator7.hasNext();
        int int11 = iterator7.getCount();
        boolean boolean12 = iterator7.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        int int19 = multidimensionalCounter4.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator20 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator21 = multidimensionalCounter4.iterator();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(intSpliterator20);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter4.spliterator();
        int[] intArray10 = multidimensionalCounter4.getCounts(3);
        int[] intArray12 = multidimensionalCounter4.getCounts((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 3, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0]");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = iterator8.getCounts();
        int int11 = iterator8.getCount((int) (short) 1);
        int int12 = iterator8.getCount();
        boolean boolean13 = iterator8.hasNext();
        boolean boolean14 = iterator8.hasNext();
        int int16 = iterator8.getCount((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray11 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int[] intArray13 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        int int15 = multidimensionalCounter4.getDimension();
        int int16 = multidimensionalCounter4.getSize();
        int[] intArray18 = multidimensionalCounter4.getCounts(0);
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
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0]");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        int int16 = iterator15.getCount();
        int int17 = iterator15.getCount();
        int int18 = iterator15.getCount();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int[] intArray9 = multidimensionalCounter4.getCounts((int) (byte) 10);
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray10 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        int int12 = multidimensionalCounter11.getSize();
        int int13 = multidimensionalCounter11.getDimension();
        int[] intArray17 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int[] intArray20 = multidimensionalCounter18.getCounts((int) (short) 0);
        int[] intArray22 = multidimensionalCounter18.getCounts(10);
        int int23 = multidimensionalCounter11.getCount(intArray22);
        int int24 = multidimensionalCounter4.getCount(intArray22);
        int[] intArray25 = multidimensionalCounter4.getSizes();
        int int26 = multidimensionalCounter4.getDimension();
        int[] intArray30 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter31 = new org.apache.commons.math.util.MultidimensionalCounter(intArray30);
        int int32 = multidimensionalCounter31.getSize();
        int[] intArray33 = multidimensionalCounter31.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator34 = multidimensionalCounter31.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator35 = multidimensionalCounter31.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator36 = multidimensionalCounter31.iterator();
        int[] intArray38 = multidimensionalCounter31.getCounts(0);
        int int39 = multidimensionalCounter31.getDimension();
        int[] intArray40 = multidimensionalCounter31.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int41 = multidimensionalCounter4.getCount(intArray40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 32 out of [0, 31] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 10, 1]");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        int[] intArray16 = multidimensionalCounter4.getCounts((int) (byte) 100);
        java.util.Spliterator<java.lang.Integer> intSpliterator17 = multidimensionalCounter4.spliterator();
        int int18 = multidimensionalCounter4.getDimension();
        int[] intArray20 = multidimensionalCounter4.getCounts((int) (byte) 1);
        int int21 = multidimensionalCounter4.getDimension();
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
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int int7 = multidimensionalCounter4.getDimension();
        int[] intArray11 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int[] intArray14 = multidimensionalCounter12.getCounts((int) (short) 0);
        int[] intArray16 = multidimensionalCounter12.getCounts((int) '#');
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter12.iterator();
        int[] intArray18 = multidimensionalCounter12.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter19 = new org.apache.commons.math.util.MultidimensionalCounter(intArray18);
        int[] intArray21 = multidimensionalCounter19.getCounts(0);
        int int22 = multidimensionalCounter4.getCount(intArray21);
        java.util.Spliterator<java.lang.Integer> intSpliterator23 = multidimensionalCounter4.spliterator();
        int[] intArray25 = multidimensionalCounter4.getCounts((int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[3, 5, 0]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intSpliterator23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[3, 2, 0]");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        int[] intArray30 = multidimensionalCounter4.getCounts(100);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator31 = multidimensionalCounter4.iterator();
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
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(iterator31);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator9 = multidimensionalCounter4.spliterator();
        int[] intArray11 = multidimensionalCounter4.getCounts(10);
        int int12 = multidimensionalCounter4.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(intSpliterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = multidimensionalCounter7.spliterator();
        int int9 = multidimensionalCounter7.getDimension();
        int[] intArray11 = multidimensionalCounter7.getCounts((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int int6 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        int int8 = multidimensionalCounter4.getDimension();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter8 = new org.apache.commons.math.util.MultidimensionalCounter(intArray7);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter9 = new org.apache.commons.math.util.MultidimensionalCounter(intArray7);
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter9.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = multidimensionalCounter9.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator10);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter13.iterator();
        int[] intArray18 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter19 = new org.apache.commons.math.util.MultidimensionalCounter(intArray18);
        int int20 = multidimensionalCounter19.getDimension();
        int[] intArray21 = multidimensionalCounter19.getSizes();
        int[] intArray23 = multidimensionalCounter19.getCounts((int) (short) 100);
        java.util.Spliterator<java.lang.Integer> intSpliterator24 = multidimensionalCounter19.spliterator();
        int int25 = multidimensionalCounter19.getDimension();
        int[] intArray29 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter30 = new org.apache.commons.math.util.MultidimensionalCounter(intArray29);
        int int31 = multidimensionalCounter30.getSize();
        int[] intArray32 = multidimensionalCounter30.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator33 = multidimensionalCounter30.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator34 = multidimensionalCounter30.iterator();
        int int35 = multidimensionalCounter30.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator36 = multidimensionalCounter30.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator37 = multidimensionalCounter30.iterator();
        int int38 = multidimensionalCounter30.getSize();
        int[] intArray42 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter43 = new org.apache.commons.math.util.MultidimensionalCounter(intArray42);
        int int44 = multidimensionalCounter43.getSize();
        int[] intArray45 = multidimensionalCounter43.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator46 = multidimensionalCounter43.iterator();
        boolean boolean47 = iterator46.hasNext();
        int[] intArray48 = iterator46.getCounts();
        int int49 = multidimensionalCounter30.getCount(intArray48);
        int int50 = multidimensionalCounter19.getCount(intArray48);
        int int51 = multidimensionalCounter19.getDimension();
        int[] intArray53 = multidimensionalCounter19.getCounts(10);
        int int54 = multidimensionalCounter13.getCount(intArray53);
        int int55 = multidimensionalCounter13.getDimension();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = multidimensionalCounter13.toString();
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intSpliterator36);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        int int12 = multidimensionalCounter4.getDimension();
        int int13 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator14 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter4.iterator();
        int[] intArray19 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter20 = new org.apache.commons.math.util.MultidimensionalCounter(intArray19);
        int int21 = multidimensionalCounter20.getDimension();
        int[] intArray22 = multidimensionalCounter20.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter20.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator24 = multidimensionalCounter20.spliterator();
        int int25 = multidimensionalCounter20.getDimension();
        int int26 = multidimensionalCounter20.getDimension();
        int[] intArray28 = multidimensionalCounter20.getCounts((int) (byte) 1);
        int int29 = multidimensionalCounter20.getSize();
        int[] intArray30 = multidimensionalCounter20.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = multidimensionalCounter4.getCount(intArray30);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 3, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intSpliterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(intSpliterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 10, 1]");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray10 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter13.iterator();
        int[] intArray18 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter19 = new org.apache.commons.math.util.MultidimensionalCounter(intArray18);
        int int20 = multidimensionalCounter19.getDimension();
        int[] intArray21 = multidimensionalCounter19.getSizes();
        int[] intArray23 = multidimensionalCounter19.getCounts((int) (short) 100);
        java.util.Spliterator<java.lang.Integer> intSpliterator24 = multidimensionalCounter19.spliterator();
        int int25 = multidimensionalCounter19.getDimension();
        int[] intArray29 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter30 = new org.apache.commons.math.util.MultidimensionalCounter(intArray29);
        int int31 = multidimensionalCounter30.getSize();
        int[] intArray32 = multidimensionalCounter30.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator33 = multidimensionalCounter30.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator34 = multidimensionalCounter30.iterator();
        int int35 = multidimensionalCounter30.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator36 = multidimensionalCounter30.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator37 = multidimensionalCounter30.iterator();
        int int38 = multidimensionalCounter30.getSize();
        int[] intArray42 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter43 = new org.apache.commons.math.util.MultidimensionalCounter(intArray42);
        int int44 = multidimensionalCounter43.getSize();
        int[] intArray45 = multidimensionalCounter43.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator46 = multidimensionalCounter43.iterator();
        boolean boolean47 = iterator46.hasNext();
        int[] intArray48 = iterator46.getCounts();
        int int49 = multidimensionalCounter30.getCount(intArray48);
        int int50 = multidimensionalCounter19.getCount(intArray48);
        int int51 = multidimensionalCounter19.getDimension();
        int[] intArray53 = multidimensionalCounter19.getCounts(10);
        int int54 = multidimensionalCounter13.getCount(intArray53);
        int int55 = multidimensionalCounter13.getDimension();
        int int56 = multidimensionalCounter13.getDimension();
        java.lang.Class<?> wildcardClass57 = multidimensionalCounter13.getClass();
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
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intSpliterator36);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter14 = new org.apache.commons.math.util.MultidimensionalCounter(intArray13);
        int int15 = multidimensionalCounter14.getSize();
        int[] intArray16 = multidimensionalCounter14.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter14.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter14.iterator();
        int[] intArray19 = multidimensionalCounter14.getSizes();
        int[] intArray21 = multidimensionalCounter14.getCounts(0);
        int[] intArray23 = multidimensionalCounter14.getCounts((int) (byte) 100);
        int int24 = multidimensionalCounter4.getCount(intArray23);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter4.iterator();
        int int27 = iterator25.getCount(0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        int[] intArray8 = multidimensionalCounter4.getCounts((int) 'a');
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        int[] intArray11 = multidimensionalCounter4.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[9, 7, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator12);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        int[] intArray11 = multidimensionalCounter4.getCounts(3);
        int int12 = multidimensionalCounter4.getSize();
        int int13 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter4.iterator();
        int[] intArray15 = iterator14.getCounts();
        int[] intArray16 = iterator14.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 3, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, -1]");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int int6 = multidimensionalCounter4.getDimension();
        int int7 = multidimensionalCounter4.getSize();
        int int8 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        boolean boolean10 = iterator9.hasNext();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        int[] intArray11 = multidimensionalCounter4.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter4.iterator();
        int int13 = multidimensionalCounter4.getSize();
        int[] intArray14 = multidimensionalCounter4.getSizes();
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
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        boolean boolean8 = iterator7.hasNext();
        int[] intArray9 = iterator7.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = iterator7.getCount(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0]");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        int[] intArray8 = iterator7.getCounts();
        boolean boolean9 = iterator7.hasNext();
        boolean boolean10 = iterator7.hasNext();
        boolean boolean11 = iterator7.hasNext();
        int[] intArray12 = iterator7.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 2, 0]");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        java.util.Spliterator<java.lang.Integer> intSpliterator5 = multidimensionalCounter4.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator6 = multidimensionalCounter4.iterator();
        int[] intArray7 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int int9 = multidimensionalCounter4.getSize();
        int int10 = multidimensionalCounter4.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter4.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter4.spliterator();
        int[] intArray14 = multidimensionalCounter4.getCounts(52);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[5, 2, 0]");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getDimension();
        int[] intArray7 = multidimensionalCounter4.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter4.iterator();
        int[] intArray10 = iterator9.getCounts();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, -1]");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int[] intArray6 = multidimensionalCounter4.getCounts((int) (short) 0);
        int[] intArray8 = multidimensionalCounter4.getCounts((int) '#');
        int int9 = multidimensionalCounter4.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter4.spliterator();
        int[] intArray14 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        int int16 = multidimensionalCounter15.getDimension();
        int[] intArray17 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter15.iterator();
        int[] intArray19 = multidimensionalCounter15.getSizes();
        int int20 = multidimensionalCounter15.getDimension();
        int[] intArray21 = multidimensionalCounter15.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter22 = new org.apache.commons.math.util.MultidimensionalCounter(intArray21);
        int[] intArray26 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter27 = new org.apache.commons.math.util.MultidimensionalCounter(intArray26);
        int int28 = multidimensionalCounter27.getSize();
        int[] intArray29 = multidimensionalCounter27.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator30 = multidimensionalCounter27.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator31 = multidimensionalCounter27.iterator();
        int int32 = multidimensionalCounter27.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator33 = multidimensionalCounter27.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator34 = multidimensionalCounter27.iterator();
        int[] intArray36 = multidimensionalCounter27.getCounts((int) 'a');
        int[] intArray38 = multidimensionalCounter27.getCounts((int) ' ');
        int int39 = multidimensionalCounter22.getCount(intArray38);
        int int40 = multidimensionalCounter4.getCount(intArray38);
        int[] intArray41 = multidimensionalCounter4.getSizes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[3, 5, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intSpliterator33);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[9, 7, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[3, 2, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 10, 1]");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter4 = new org.apache.commons.math.util.MultidimensionalCounter(intArray3);
        int int5 = multidimensionalCounter4.getSize();
        int[] intArray6 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter4.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter4.iterator();
        int[] intArray9 = multidimensionalCounter4.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter4.iterator();
        int[] intArray12 = multidimensionalCounter4.getCounts(10);
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter4.spliterator();
        int[] intArray15 = multidimensionalCounter4.getCounts(10);
        int[] intArray19 = new int[] { ' ', (short) 10, (byte) 1 };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter20 = new org.apache.commons.math.util.MultidimensionalCounter(intArray19);
        int int21 = multidimensionalCounter20.getDimension();
        int[] intArray23 = multidimensionalCounter20.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter20.iterator();
        int[] intArray25 = multidimensionalCounter20.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter26 = new org.apache.commons.math.util.MultidimensionalCounter(intArray25);
        int[] intArray28 = multidimensionalCounter26.getCounts((int) (byte) 10);
        int int29 = multidimensionalCounter26.getSize();
        int[] intArray31 = multidimensionalCounter26.getCounts((int) (short) 0);
        java.util.Spliterator<java.lang.Integer> intSpliterator32 = multidimensionalCounter26.spliterator();
        int int33 = multidimensionalCounter26.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator34 = multidimensionalCounter26.iterator();
        int int35 = multidimensionalCounter26.getSize();
        int[] intArray36 = multidimensionalCounter26.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter37 = new org.apache.commons.math.util.MultidimensionalCounter(intArray36);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = multidimensionalCounter4.getCount(intArray36);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intSpliterator32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 10, 1]");
    }
}

