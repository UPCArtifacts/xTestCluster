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
        char[] charArray0 = null;
        char[] charArray2 = new char[] { '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.toObject(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 'a');
        char[] charArray13 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray13, '4', (int) (byte) 100);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray13, '#', 0);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.addAll(charArray4, charArray13);
        char[] charArray22 = new char[] { '#' };
        java.lang.Character[] charArray23 = org.apache.commons.lang3.ArrayUtils.toObject(charArray22);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.clone(charArray22);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.add(charArray24, 'a');
        char[] charArray28 = new char[] { '#' };
        java.lang.Character[] charArray29 = org.apache.commons.lang3.ArrayUtils.toObject(charArray28);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.addAll(charArray24, charArray28);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.addAll(charArray20, charArray28);
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray33);
        java.lang.Character[] charArray35 = org.apache.commons.lang3.ArrayUtils.toObject(charArray33);
        char[] charArray37 = new char[] { '#' };
        java.lang.Character[] charArray38 = org.apache.commons.lang3.ArrayUtils.toObject(charArray37);
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.clone(charArray37);
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.add(charArray39, 'a');
        java.lang.Character[] charArray42 = org.apache.commons.lang3.ArrayUtils.toObject(charArray39);
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray42);
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.clone(charArray43);
        char[] charArray46 = new char[] { '#' };
        java.lang.Character[] charArray47 = org.apache.commons.lang3.ArrayUtils.toObject(charArray46);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray46);
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.addAll(charArray44, charArray46);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray33, charArray49);
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray33, 'a', 3);
        char[] charArray55 = org.apache.commons.lang3.ArrayUtils.add(charArray33, ' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[#]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, a]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "##a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "##a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, #, a, 4, #,  ,  ]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, a]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "##a4#  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "##a4#  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[#, #, a, 4, #,  ,  , #]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[#]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, a]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#]");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#]");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[#,  ]");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        float[][][][] floatArray0 = new float[][][][] {};
        float[][][][] floatArray1 = new float[][][][] {};
        float[][][][][] floatArray2 = new float[][][][][] { floatArray0, floatArray1 };
        float[][][][] floatArray3 = new float[][][][] {};
        float[][][][] floatArray4 = new float[][][][] {};
        float[][][][][] floatArray5 = new float[][][][][] { floatArray3, floatArray4 };
        float[][][][] floatArray6 = new float[][][][] {};
        float[][][][] floatArray7 = new float[][][][] {};
        float[][][][][] floatArray8 = new float[][][][][] { floatArray6, floatArray7 };
        float[][][][][][] floatArray9 = new float[][][][][][] { floatArray2, floatArray5, floatArray8 };
        float[][][][] floatArray10 = new float[][][][] {};
        float[][][][] floatArray11 = new float[][][][] {};
        float[][][][][] floatArray12 = new float[][][][][] { floatArray10, floatArray11 };
        float[][][][] floatArray13 = new float[][][][] {};
        float[][][][] floatArray14 = new float[][][][] {};
        float[][][][][] floatArray15 = new float[][][][][] { floatArray13, floatArray14 };
        float[][][][] floatArray16 = new float[][][][] {};
        float[][][][] floatArray17 = new float[][][][] {};
        float[][][][][] floatArray18 = new float[][][][][] { floatArray16, floatArray17 };
        float[][][][][][] floatArray19 = new float[][][][][][] { floatArray12, floatArray15, floatArray18 };
        float[][][][] floatArray20 = new float[][][][] {};
        float[][][][] floatArray21 = new float[][][][] {};
        float[][][][][] floatArray22 = new float[][][][][] { floatArray20, floatArray21 };
        float[][][][] floatArray23 = new float[][][][] {};
        float[][][][] floatArray24 = new float[][][][] {};
        float[][][][][] floatArray25 = new float[][][][][] { floatArray23, floatArray24 };
        float[][][][] floatArray26 = new float[][][][] {};
        float[][][][] floatArray27 = new float[][][][] {};
        float[][][][][] floatArray28 = new float[][][][][] { floatArray26, floatArray27 };
        float[][][][][][] floatArray29 = new float[][][][][][] { floatArray22, floatArray25, floatArray28 };
        float[][][][] floatArray30 = new float[][][][] {};
        float[][][][] floatArray31 = new float[][][][] {};
        float[][][][][] floatArray32 = new float[][][][][] { floatArray30, floatArray31 };
        float[][][][] floatArray33 = new float[][][][] {};
        float[][][][] floatArray34 = new float[][][][] {};
        float[][][][][] floatArray35 = new float[][][][][] { floatArray33, floatArray34 };
        float[][][][] floatArray36 = new float[][][][] {};
        float[][][][] floatArray37 = new float[][][][] {};
        float[][][][][] floatArray38 = new float[][][][][] { floatArray36, floatArray37 };
        float[][][][][][] floatArray39 = new float[][][][][][] { floatArray32, floatArray35, floatArray38 };
        float[][][][][][][] floatArray40 = new float[][][][][][][] { floatArray9, floatArray19, floatArray29, floatArray39 };
        float[][][][][][][] floatArray41 = org.apache.commons.lang3.ArrayUtils.toArray(floatArray40);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertNotNull(floatArray41);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.lang.Integer[][] intArray0 = new java.lang.Integer[][] {};
        java.lang.Integer[][] intArray1 = new java.lang.Integer[][] {};
        java.lang.Integer[][] intArray2 = new java.lang.Integer[][] {};
        java.lang.Integer[][] intArray3 = new java.lang.Integer[][] {};
        java.lang.Integer[][] intArray4 = new java.lang.Integer[][] {};
        java.lang.Integer[][] intArray5 = new java.lang.Integer[][] {};
        java.lang.Integer[][][] intArray6 = new java.lang.Integer[][][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        java.lang.Integer[][] intArray7 = new java.lang.Integer[][] {};
        java.lang.Integer[][] intArray8 = new java.lang.Integer[][] {};
        java.lang.Integer[][] intArray9 = new java.lang.Integer[][] {};
        java.lang.Integer[][] intArray10 = new java.lang.Integer[][] {};
        java.lang.Integer[][] intArray11 = new java.lang.Integer[][] {};
        java.lang.Integer[][] intArray12 = new java.lang.Integer[][] {};
        java.lang.Integer[][][] intArray13 = new java.lang.Integer[][][] { intArray7, intArray8, intArray9, intArray10, intArray11, intArray12 };
        java.lang.Integer[][][][] intArray14 = new java.lang.Integer[][][][] { intArray6, intArray13 };
        java.lang.Integer[][][][] intArray16 = org.apache.commons.lang3.ArrayUtils.remove(intArray14, 1);
        java.util.Map<java.lang.Object, java.lang.Object> objMap17 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) intArray14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(objMap17);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, true, false, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5);
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray6);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray7, true);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray7);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray10, 1, 100);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray10, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[true, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[true, true, false, true]");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        long[] longArray2 = new long[] { (byte) -1, 10 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.clone(longArray2);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.add(longArray3, 0, (long) 10);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.clone(longArray3);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[10, -1, 10]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[-1, 10]");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) 10, (short) 100, (short) -1, (short) 1, (short) 0, (short) 0 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray9);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.remove(shortArray9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0, 0, 1, -1, 100, 10]");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray2);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray2, (double) 0L, (int) (byte) 10, (-1.0d));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray2, (double) (byte) 0);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray2, (double) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0]");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        short[] shortArray5 = new short[] { (short) 0, (byte) 0, (byte) -1, (short) 100, (short) 10 };
        short[] shortArray10 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray10, (short) (byte) 0, 2);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray5, shortArray10);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray10, (short) 100, 7);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, 0, -1, 100, 10]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.clone(charArray7);
        char[] charArray10 = new char[] { '#' };
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.toObject(charArray10);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.clone(charArray10);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.add(charArray12, 'a');
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.toObject(charArray12);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray12, ' ');
        java.lang.Character[] charArray18 = org.apache.commons.lang3.ArrayUtils.toObject(charArray12);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray12, 'a');
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray12, ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.addAll(charArray7, charArray22);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray22);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #]");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        char[] charArray12 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray12, '4', (int) (byte) 100);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray12, '#', 0);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.addAll(charArray3, charArray12);
        char[] charArray21 = new char[] { '#' };
        java.lang.Character[] charArray22 = org.apache.commons.lang3.ArrayUtils.toObject(charArray21);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.clone(charArray21);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.add(charArray23, 'a');
        char[] charArray27 = new char[] { '#' };
        java.lang.Character[] charArray28 = org.apache.commons.lang3.ArrayUtils.toObject(charArray27);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.clone(charArray27);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.addAll(charArray23, charArray27);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.addAll(charArray19, charArray27);
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        java.lang.Object[][] objArray34 = new java.lang.Object[][] { objArray32, objArray33 };
        java.lang.Object obj35 = null;
        java.lang.Object[][] objArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(objArray34, obj35);
        char[] charArray38 = new char[] { '#' };
        java.lang.Character[] charArray39 = org.apache.commons.lang3.ArrayUtils.toObject(charArray38);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) objArray34, (java.lang.Object[]) charArray39);
        char[] charArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray39, ' ');
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray39);
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray39);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray27, charArray44);
        char[] charArray46 = org.apache.commons.lang3.ArrayUtils.clone(charArray44);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.contains(charArray46, ' ');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "##a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "##a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, #, a, 4, #,  ,  ]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#, a]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, #]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##a4#  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##a4#  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #, a, 4, #,  ,  , #]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[#]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.lang.Object[] objArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) 10L);
        float[] floatArray5 = new float[] { (byte) -1 };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray3, floatArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray6, (float) (-1L));
        float[] floatArray9 = new float[] {};
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (float) 10L);
        float[] floatArray13 = new float[] { (byte) -1 };
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray11, floatArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray6, floatArray11);
        java.lang.Float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray11);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) floatArray16);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16, (float) ' ');
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16, (float) '#');
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, 4, 6);
        float[] floatArray28 = new float[] { 10.0f, 2, 6 };
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.add(floatArray28, 0, (float) (byte) 1);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray24, floatArray31);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0, 2.0, 6.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[1.0, 10.0, 2.0, 6.0]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[1.0, 10.0, 2.0, 6.0]");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) '#');
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, (int) (short) 1, (double) 1.0f);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray11, (double) (short) -1);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray11);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray14);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray14, 0.0d);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.add(doubleArray17, (double) 5);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray19, (double) ' ', (double) 1L);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, (double) 0, (int) (short) 1, (double) 3);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 1.0, 1.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 1.0, 1.0, 1.0, 10.0, 10.0, 5.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) '#');
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, (int) (short) 1, (double) 1.0f);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray11, (double) (short) -1);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray11);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray14);
        java.lang.Object[] objArray16 = null;
        java.lang.Double[] doubleArray23 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray23, (double) '#');
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.add(doubleArray25, (int) (short) 1, (double) 1.0f);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray28, (double) (short) -1);
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray28);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray16, (java.lang.Object) doubleArray31);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray31, 10.0d, (int) '4');
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray31, (double) 6, (int) '#');
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray14, doubleArray31);
        double[] doubleArray41 = new double[] { (byte) 10 };
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray41);
        double[] doubleArray48 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray48, (double) (short) -1);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray41, doubleArray48);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray31, doubleArray48);
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray31, (double) 'a');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6 + "'", int35 == 6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0, -1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray8, 0, (long) 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray8, (long) (-1), (int) (byte) 1);
        long[] longArray15 = new long[] {};
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(longArray15, (long) (short) 1);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.addAll(longArray8, longArray15);
        java.lang.Long[] longArray25 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray25, (long) (-1));
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray27, (long) '#');
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.subarray(longArray27, (int) '4', (int) (byte) 10);
        java.lang.Long[] longArray39 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray39, (long) (-1));
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray41, (long) '#');
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.addAll(longArray32, longArray41);
        long[] longArray47 = new long[] { (byte) -1, 10 };
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.clone(longArray47);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray32, longArray47);
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.addAll(longArray18, longArray47);
        java.lang.Long[] longArray57 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray59 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray57, (long) (-1));
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray50, longArray59);
        long[] longArray62 = org.apache.commons.lang3.ArrayUtils.add(longArray59, (long) 1);
        long[] longArray65 = org.apache.commons.lang3.ArrayUtils.subarray(longArray62, 1, 100);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[-1, 10, -1, 10, 1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[-1, 10, -1, 10, 1, 1, 1]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[10, -1, 10, 1, 1, 1]");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[] floatArray9 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[] floatArray14 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[] floatArray24 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[] floatArray29 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[][] floatArray30 = new java.lang.Float[][] { floatArray4, floatArray9, floatArray14, floatArray19, floatArray24, floatArray29 };
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        java.lang.Object[][] objArray33 = new java.lang.Object[][] { objArray31, objArray32 };
        java.lang.Object obj34 = null;
        java.lang.Object[][] objArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(objArray33, obj34);
        char[] charArray37 = new char[] { '#' };
        java.lang.Character[] charArray38 = org.apache.commons.lang3.ArrayUtils.toObject(charArray37);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) objArray33, (java.lang.Object[]) charArray38);
        java.lang.Float[][] floatArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray30, (java.lang.Object) charArray38);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray40);
        java.lang.Float[][] floatArray44 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray40, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(floatArray44);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7, (long) (-1));
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, 0, (long) 1);
        java.lang.Class<?> wildcardClass13 = longArray9.getClass();
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ArrayUtils.add(wildcardClassArray0, wildcardClass13);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) wildcardClassArray0);
        java.lang.Long[] longArray16 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int[] intArray20 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray26);
        int[] intArray33 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray27, intArray33);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.addAll(intArray20, intArray33);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray33, 1);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) longArray16, (java.lang.Object) intArray33);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) wildcardClassArray0, (java.lang.Object[]) longArray16);
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray16, (long) (short) -1);
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray16, (long) 7);
        double[] doubleArray49 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray49, (double) (short) -1);
        int int54 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray49, (double) (-1.0f), (int) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray49);
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray49, (double) 3, (double) (byte) 100);
        int int60 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray49, (double) '#');
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray49, (double) 1, (double) (short) 10);
        int int65 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray16, (java.lang.Object) (short) 10, 0);
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 10, 52, 0, -1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 1.0, -1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] {};
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty(strArray1);
        java.lang.String[][][][] strArray3 = org.apache.commons.lang3.ArrayUtils.add(strArray0, strArray1);
        java.lang.String[][] strArray5 = new java.lang.String[][] {};
        java.lang.String[][][] strArray6 = new java.lang.String[][][] { strArray5 };
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.lang.String[][] strArray11 = new java.lang.String[][] { strArray7, strArray8, strArray9, strArray10 };
        java.lang.String[][][] strArray12 = new java.lang.String[][][] { strArray11 };
        java.lang.String[][][] strArray13 = org.apache.commons.lang3.ArrayUtils.addAll(strArray6, strArray12);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.lang.String[][] strArray21 = new java.lang.String[][] { strArray15, strArray16, strArray17, strArray18, strArray19, strArray20 };
        java.lang.String[] strArray22 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray22);
        java.lang.String[][] strArray24 = org.apache.commons.lang3.ArrayUtils.add(strArray21, strArray22);
        float[] floatArray25 = new float[] {};
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.add(floatArray25, (float) 10L);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray25, floatArray28);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray29, (int) (byte) 0, (int) 'a');
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray24, (java.lang.Object) floatArray32, (int) (byte) -1);
        short[] shortArray39 = new short[] { (short) 10, (short) 1, (byte) 1, (short) 1 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray39);
        short[] shortArray44 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray44);
        short[] shortArray50 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray50, (short) (byte) 0, 2);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray44, shortArray50);
        short[] shortArray55 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray39, shortArray44);
        int int56 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray24, (java.lang.Object) shortArray39);
        java.lang.String[][] strArray59 = org.apache.commons.lang3.ArrayUtils.subarray(strArray24, 7, (int) (byte) 10);
        java.lang.String[][][] strArray60 = org.apache.commons.lang3.ArrayUtils.add(strArray6, (int) (byte) 1, strArray59);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[][][][] strArray61 = org.apache.commons.lang3.ArrayUtils.add(strArray0, 6, strArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[1, 1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray55), "[1, 1, 1, 10, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[] floatArray9 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[] floatArray14 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[] floatArray24 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[] floatArray29 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[][] floatArray30 = new java.lang.Float[][] { floatArray4, floatArray9, floatArray14, floatArray19, floatArray24, floatArray29 };
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        java.lang.Object[][] objArray33 = new java.lang.Object[][] { objArray31, objArray32 };
        java.lang.Object obj34 = null;
        java.lang.Object[][] objArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(objArray33, obj34);
        char[] charArray37 = new char[] { '#' };
        java.lang.Character[] charArray38 = org.apache.commons.lang3.ArrayUtils.toObject(charArray37);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) objArray33, (java.lang.Object[]) charArray38);
        java.lang.Float[][] floatArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray30, (java.lang.Object) charArray38);
        byte[] byteArray43 = new byte[] { (byte) 100, (byte) 100 };
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray43, (byte) 10, 0);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.add(byteArray43, (byte) 1);
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.add(byteArray48, (int) (short) 0, (byte) 1);
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.add(byteArray48, (byte) 10);
        java.lang.Byte[] byteArray56 = new java.lang.Byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray56);
        byte[] byteArray58 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray48, byteArray57);
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray38, (java.lang.Object) byteArray58);
        byte[] byteArray62 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray58, 6, 8);
        byte[] byteArray67 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray69 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray67, (byte) 0);
        byte[] byteArray72 = new byte[] { (byte) 100, (byte) 100 };
        int int75 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray72, (byte) 10, 0);
        byte[] byteArray76 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray67, byteArray72);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray76);
        int int79 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray76, (byte) 100);
        java.lang.String str81 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) byteArray76, "{10.0}");
        byte[] byteArray82 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray62, byteArray76);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[100, 100, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[100, 100, 1, 0, 100]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "{100,100,1,0,0,-1}" + "'", str81, "{100,100,1,0,0,-1}");
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[100, 100, 1, 0, 0, -1]");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (int) (short) 0, (byte) 1);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray10, (byte) 10, 7);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 100, 100, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, 1L);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray11, (long) 6);
        java.lang.Long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toObject(longArray11);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray14, (long) 2);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[-1, 10, -1, 10, 1, 1]");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.lang.Byte[][] byteArray0 = new java.lang.Byte[][] {};
        java.lang.Byte[][] byteArray1 = new java.lang.Byte[][] {};
        java.lang.Byte[][] byteArray2 = new java.lang.Byte[][] {};
        java.lang.Byte[][] byteArray3 = new java.lang.Byte[][] {};
        java.lang.Byte[][] byteArray4 = new java.lang.Byte[][] {};
        java.lang.Byte[][][] byteArray5 = new java.lang.Byte[][][] { byteArray0, byteArray1, byteArray2, byteArray3, byteArray4 };
        boolean[] booleanArray10 = new boolean[] { true, true, false, true };
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray10, true, (int) '4');
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray10);
        java.lang.Boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray10);
        boolean[] booleanArray16 = null;
        boolean[] booleanArray17 = new boolean[] {};
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray17, true);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray16, booleanArray17);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray17);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray17);
        java.lang.Boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray17);
        java.lang.Byte[][][] byteArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray5, (java.lang.Object) booleanArray23);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertNotNull(byteArray24);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray4 = new float[] { (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) (-1L));
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) 100L);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.clone(floatArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray5);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0, -1.0]");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 10, 0);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray9);
        byte[] byteArray14 = null;
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray13, byteArray14);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.remove(byteArray13, 2);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.clone(byteArray13);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray18, (byte) 0, 1);
        java.lang.String str23 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) byteArray18, "hi!");
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray18);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray29, (byte) 0);
        byte[] byteArray34 = new byte[] { (byte) 100, (byte) 100 };
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray34, (byte) 10, 0);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray29, byteArray34);
        byte[] byteArray39 = null;
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray38, byteArray39);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.remove(byteArray38, 2);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.remove(byteArray38, 4);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray18, byteArray44);
        java.lang.Byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray44);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{-1,0,0,1,100,100}" + "'", str23, "{-1,0,0,1,100,100}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 0, 0, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 0, 0, 1, 100, 100, -1, 0, 0, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray46);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, true);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, false);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray4, (int) 'a', (int) (short) -1);
        boolean[] booleanArray12 = new boolean[] { true, true, false, true };
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray12, true, (int) '4');
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray12, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray12);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray19);
        boolean[] booleanArray25 = new boolean[] { true, true, false, false };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray25, false);
        boolean[] booleanArray32 = new boolean[] { true, true, false, true };
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray32, true, (int) '4');
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray25, booleanArray32);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray32, true, (int) 'a');
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray32, true, (int) '4');
        java.lang.Boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray32);
        boolean[] booleanArray44 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray19, booleanArray32);
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray7, booleanArray32);
        boolean[] booleanArray50 = new boolean[] { true, true, false, true };
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray50, true, (int) '4');
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray50);
        java.lang.Boolean[] booleanArray55 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray50);
        boolean[] booleanArray56 = null;
        boolean[] booleanArray57 = new boolean[] {};
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray57, true);
        boolean[] booleanArray60 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray56, booleanArray57);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray57);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray50, booleanArray57);
        java.lang.Boolean[] booleanArray63 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray57);
        boolean[] booleanArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray63);
        boolean[] booleanArray65 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray63);
        boolean[] booleanArray67 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray63, true);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray45, booleanArray67);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[true, true, false, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(booleanArray55);
        org.junit.Assert.assertNotNull(booleanArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray57), "[]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(booleanArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray60), "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(booleanArray63);
        org.junit.Assert.assertNotNull(booleanArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray64), "[]");
        org.junit.Assert.assertNotNull(booleanArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray65), "[]");
        org.junit.Assert.assertNotNull(booleanArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray1);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray1, 3, 2);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, ' ');
        char[] charArray10 = new char[] { '#' };
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.toObject(charArray10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray10, 'a');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.remove(charArray10, 0);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray6, charArray10);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.clone(charArray10);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(charArray18, 'a');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (int) (short) 0, (byte) 1);
        java.lang.Long[] longArray17 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray17, (long) (-1));
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.clone(longArray19);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) (byte) 1, (java.lang.Object) longArray20);
        long[] longArray22 = new long[] {};
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(longArray22, (long) (short) 1);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray22, (long) 3);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray20, longArray22);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray22, (long) (short) 0, 10);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(longArray22, (long) ' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        long[] longArray0 = new long[] {};
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(longArray0, (long) (short) 1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(longArray4, (long) (-1));
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.lang.Object[] objArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) 10L);
        float[] floatArray5 = new float[] { (byte) -1 };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray3, floatArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray6, (float) (-1L));
        float[] floatArray9 = new float[] {};
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (float) 10L);
        float[] floatArray13 = new float[] { (byte) -1 };
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray11, floatArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray6, floatArray11);
        java.lang.Float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray11);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) floatArray16);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16, (float) ' ');
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray19, (float) (short) -1);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.clone(floatArray19);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0]");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) '#');
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, (int) (short) 1, (double) 1.0f);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray11, (double) (short) -1);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray11);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray11, (double) (short) -1, (int) (short) 100, (double) (-1.0f));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        boolean[] booleanArray4 = new boolean[] { true, true, false, false };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, false);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, true);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, 0, true);
        java.lang.Boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray13);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray14);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        char[] charArray0 = null;
        char[] charArray2 = new char[] { '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.toObject(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 'a');
        char[] charArray13 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray13, '4', (int) (byte) 100);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray13, '#', 0);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.addAll(charArray4, charArray13);
        char[] charArray22 = new char[] { '#' };
        java.lang.Character[] charArray23 = org.apache.commons.lang3.ArrayUtils.toObject(charArray22);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.clone(charArray22);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.add(charArray24, 'a');
        char[] charArray28 = new char[] { '#' };
        java.lang.Character[] charArray29 = org.apache.commons.lang3.ArrayUtils.toObject(charArray28);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.addAll(charArray24, charArray28);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.addAll(charArray20, charArray28);
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray33);
        char[] charArray36 = new char[] { '#' };
        java.lang.Character[] charArray37 = org.apache.commons.lang3.ArrayUtils.toObject(charArray36);
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.clone(charArray36);
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.add(charArray38, 'a');
        java.lang.Character[] charArray41 = org.apache.commons.lang3.ArrayUtils.toObject(charArray38);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray38, ' ');
        java.lang.Character[] charArray44 = org.apache.commons.lang3.ArrayUtils.toObject(charArray38);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray38);
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray38, ' ');
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray47, '#');
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray47, '#', (int) (short) 1);
        char[] charArray54 = org.apache.commons.lang3.ArrayUtils.add(charArray47, ' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[#]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, a]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "##a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "##a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, #, a, 4, #,  ,  ]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, a]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "##a4#  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "##a4#  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[#, #, a, 4, #,  ,  , #]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[#, a]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[#]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[#,  ]");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (int) (short) 100);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray1);
        int[] intArray12 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray18);
        int[] intArray25 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray19, intArray25);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.addAll(intArray12, intArray25);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray12, 2);
        int[] intArray33 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray39);
        int[] intArray46 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray40, intArray46);
        int[] intArray48 = org.apache.commons.lang3.ArrayUtils.addAll(intArray33, intArray46);
        int[] intArray50 = org.apache.commons.lang3.ArrayUtils.remove(intArray33, (int) (short) 1);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray29, intArray50);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray1, intArray50);
        java.lang.Integer[] intArray53 = org.apache.commons.lang3.ArrayUtils.toObject(intArray50);
        int[] intArray55 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray53, (int) '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 10, 52, 0, -1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 10, 52, 0, -1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 52]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 52]");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        boolean[] booleanArray4 = new boolean[] { true, true, false, false };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, false);
        boolean[] booleanArray11 = new boolean[] { true, true, false, true };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, true, (int) '4');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray4, booleanArray11);
        boolean[] booleanArray20 = new boolean[] { true, true, false, false };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray20, false);
        boolean[] booleanArray27 = new boolean[] { true, true, false, true };
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray27, true, (int) '4');
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray20, booleanArray27);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray20);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, true, (int) (byte) 10);
        boolean[] booleanArray40 = new boolean[] { true, true, false, false };
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray40, false);
        boolean[] booleanArray47 = new boolean[] { true, true, false, true };
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray47, true, (int) '4');
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray40, booleanArray47);
        boolean[] booleanArray54 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray40, (int) (byte) 1, (-1));
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray40);
        boolean[] booleanArray56 = null;
        boolean[] booleanArray57 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray40, booleanArray56);
        int int60 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray57, false, 4);
        boolean[] booleanArray61 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray57);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[true, true, false, true, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(booleanArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray57), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(booleanArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray61), "[true, true, false, true, true, true, false, false]");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = org.apache.commons.lang3.ArrayUtils.clone(typeArray0);
        float[] floatArray2 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (float) 10L);
        float[] floatArray6 = new float[] { (byte) -1 };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray6);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) typeArray1, (java.lang.Object) floatArray4);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray4);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray9);
        java.lang.Long[] longArray17 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray17, (long) (-1));
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray19, (long) '#');
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.subarray(longArray19, (int) '4', (int) (byte) 10);
        java.lang.Long[] longArray31 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray31, (long) (-1));
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray33, (long) '#');
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.addAll(longArray24, longArray33);
        long[] longArray39 = new long[] { (byte) -1, 10 };
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.clone(longArray39);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray24, longArray39);
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray39, (long) (byte) 100);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) floatArray9, (java.lang.Object) longArray43);
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.add(longArray43, (long) 5);
        java.lang.Long[] longArray47 = org.apache.commons.lang3.ArrayUtils.toObject(longArray46);
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray47, 0L);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[-1, 10, 5]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[-1, 10, 5]");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        java.lang.Long[] longArray1 = new java.lang.Long[] {};
        java.lang.Long[] longArray2 = new java.lang.Long[] {};
        java.lang.Long[] longArray3 = new java.lang.Long[] {};
        java.lang.Long[] longArray4 = new java.lang.Long[] {};
        java.lang.Long[] longArray5 = new java.lang.Long[] {};
        java.lang.Long[][] longArray6 = new java.lang.Long[][] { longArray0, longArray1, longArray2, longArray3, longArray4, longArray5 };
        java.lang.Long[] longArray7 = new java.lang.Long[] {};
        java.lang.Long[] longArray8 = new java.lang.Long[] {};
        java.lang.Long[] longArray9 = new java.lang.Long[] {};
        java.lang.Long[] longArray10 = new java.lang.Long[] {};
        java.lang.Long[] longArray11 = new java.lang.Long[] {};
        java.lang.Long[][] longArray12 = new java.lang.Long[][] { longArray7, longArray8, longArray9, longArray10, longArray11 };
        java.lang.Long[][] longArray13 = org.apache.commons.lang3.ArrayUtils.toArray(longArray12);
        java.lang.Long[][] longArray14 = new java.lang.Long[][] {};
        java.lang.Long[][] longArray15 = org.apache.commons.lang3.ArrayUtils.addAll(longArray12, longArray14);
        java.lang.Long[][] longArray16 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray12);
        java.lang.Long[] longArray17 = new java.lang.Long[] {};
        java.lang.Long[] longArray18 = new java.lang.Long[] {};
        java.lang.Long[] longArray19 = new java.lang.Long[] {};
        java.lang.Long[] longArray20 = new java.lang.Long[] {};
        java.lang.Long[] longArray21 = new java.lang.Long[] {};
        java.lang.Long[] longArray22 = new java.lang.Long[] {};
        java.lang.Long[][] longArray23 = new java.lang.Long[][] { longArray17, longArray18, longArray19, longArray20, longArray21, longArray22 };
        java.lang.Long[] longArray24 = new java.lang.Long[] {};
        java.lang.Long[] longArray25 = new java.lang.Long[] {};
        java.lang.Long[] longArray26 = new java.lang.Long[] {};
        java.lang.Long[] longArray27 = new java.lang.Long[] {};
        java.lang.Long[] longArray28 = new java.lang.Long[] {};
        java.lang.Long[][] longArray29 = new java.lang.Long[][] { longArray24, longArray25, longArray26, longArray27, longArray28 };
        java.lang.Long[][] longArray30 = org.apache.commons.lang3.ArrayUtils.toArray(longArray29);
        java.lang.Long[][] longArray31 = new java.lang.Long[][] {};
        java.lang.Long[][] longArray32 = org.apache.commons.lang3.ArrayUtils.addAll(longArray29, longArray31);
        java.lang.Long[][] longArray33 = org.apache.commons.lang3.ArrayUtils.addAll(longArray23, longArray29);
        java.lang.Long[][] longArray34 = org.apache.commons.lang3.ArrayUtils.addAll(longArray16, longArray29);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertNotNull(longArray34);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray1);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.add(charArray1, ' ');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#,  ]");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 1, 10 };
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, 100);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray4 = new float[] { (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) (-1L));
        float[] floatArray8 = new float[] {};
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) 10L);
        float[] floatArray12 = new float[] { (byte) -1 };
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray10, (float) 1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray5, floatArray10);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) 'a');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray18);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray18, (int) (short) 1, 5);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(floatArray22, (float) 3);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray3);
        float[] floatArray5 = null;
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray3, floatArray5);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (int) (byte) 0, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray9, (float) 6);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0]");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 1);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray7, (byte) 100, (int) (byte) 10);
        java.lang.Byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray7);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(byteArray11);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray9, (long) 2, (int) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray9, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        double[] doubleArray0 = null;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) 0.0f);
        double[] doubleArray4 = new double[] { (byte) 10 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray4);
        double[] doubleArray11 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray11, (double) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray11);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray4);
        java.lang.Double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray15);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) 1, (int) (short) -1, (double) 10);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray15, (double) (-1.0f));
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray2, doubleArray15);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray26 = new double[] { (byte) 10 };
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray26);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray27);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) 0L, (int) (byte) 10, (-1.0d));
        double[] doubleArray34 = new double[] { (byte) 10 };
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray34);
        double[] doubleArray41 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray41, (double) (short) -1);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray34, doubleArray41);
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray27, doubleArray41);
        double[] doubleArray46 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray24, doubleArray27);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray2, doubleArray24);
        double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray50 = new double[] { (byte) 10 };
        double[] doubleArray51 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray50);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray51);
        int int56 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray51, (double) 0L, (int) (byte) 10, (-1.0d));
        double[] doubleArray58 = new double[] { (byte) 10 };
        double[] doubleArray59 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray58);
        double[] doubleArray65 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int67 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray65, (double) (short) -1);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray58, doubleArray65);
        double[] doubleArray69 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray51, doubleArray65);
        double[] doubleArray70 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray48, doubleArray51);
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray2, doubleArray51);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) '#');
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, (int) (short) 1, (double) 1.0f);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray11, (double) (short) -1);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray11);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray14);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray15, (double) (byte) 10);
        double[] doubleArray23 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray23, (double) (short) -1);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, (double) (-1.0f), (int) (byte) 1);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray23, (double) 5);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray30, (double) 0L);
        int int33 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) doubleArray30);
        java.lang.Double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray30);
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray34);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray17, doubleArray35);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0, 52.0, -1.0, -1.0, 1.0, 100.0]");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.lang.Object[] objArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) 10L);
        float[] floatArray5 = new float[] { (byte) -1 };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray3, floatArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray6, (float) (-1L));
        float[] floatArray9 = new float[] {};
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (float) 10L);
        float[] floatArray13 = new float[] { (byte) -1 };
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray11, floatArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray6, floatArray11);
        java.lang.Float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray11);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) floatArray16);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16, (float) (-1L));
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16, 0.0f);
        java.lang.Float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray22);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray23, (float) 0L);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[10.0]");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String[][] strArray6 = new java.lang.String[][] { strArray0, strArray1, strArray2, strArray3, strArray4, strArray5 };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.ArrayUtils.add(strArray6, strArray7);
        float[] floatArray10 = new float[] {};
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) 10L);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray13);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray14, (int) (byte) 0, (int) 'a');
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray9, (java.lang.Object) floatArray17, (int) (byte) -1);
        short[] shortArray24 = new short[] { (short) 10, (short) 1, (byte) 1, (short) 1 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray24);
        short[] shortArray29 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray29);
        short[] shortArray35 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray35, (short) (byte) 0, 2);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray29, shortArray35);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray24, shortArray29);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray9, (java.lang.Object) shortArray24);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray24, (short) 10);
        short[] shortArray47 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray47);
        short[] shortArray53 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int56 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray53, (short) (byte) 0, 2);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray47, shortArray53);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray53);
        int int61 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray53, (short) -1, (int) (byte) 1);
        short[] shortArray62 = null;
        short[] shortArray63 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray53, shortArray62);
        int int66 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray63, (short) 0, 0);
        short[] shortArray71 = new short[] { (short) 10, (short) 1, (byte) 1, (short) 1 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray71);
        short[] shortArray74 = org.apache.commons.lang3.ArrayUtils.remove(shortArray71, 0);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray63, shortArray74);
        int int77 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray63, (short) (byte) 10);
        boolean boolean78 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray24, shortArray63);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[1, 1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[1, 1, 1, 10, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray71), "[1, 1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray74), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) '#');
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray8, (int) '4', (int) (byte) 10);
        java.lang.Long[] longArray20 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray20, (long) (-1));
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray22, (long) '#');
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.addAll(longArray13, longArray22);
        long[] longArray28 = new long[] { (byte) -1, 10 };
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.clone(longArray28);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray13, longArray28);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.clone(longArray13);
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray31, (long) 2);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.add(longArray31, 10L);
        java.lang.Long[] longArray42 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray42, (long) (-1));
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray44, (long) '#');
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.subarray(longArray44, (int) '4', (int) (byte) 10);
        java.lang.Long[] longArray56 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray58 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray56, (long) (-1));
        int int60 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray58, (long) '#');
        long[] longArray61 = org.apache.commons.lang3.ArrayUtils.addAll(longArray49, longArray58);
        int int63 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray49, (long) (short) 10);
        int int65 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray49, (long) (short) 1);
        long[] longArray66 = org.apache.commons.lang3.ArrayUtils.clone(longArray49);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray31, longArray49);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[10]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) 1);
        java.lang.Long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toObject(longArray2);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray3, (long) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray2);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, (double) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray2);
        java.lang.Double[] doubleArray13 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray13, (double) '#');
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, (int) (short) 1, (double) 1.0f);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray18, (double) (short) -1);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray18);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray2, doubleArray18);
        java.lang.Double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray18);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray23, (double) 10);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray23, (double) '#');
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) '#');
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray8, (int) '4', (int) (byte) 10);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray8, (long) 6);
        java.lang.Long[] longArray16 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray16, 0L);
        java.lang.String str19 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) longArray18);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{-1,10,-1,10,1,1}" + "'", str19, "{-1,10,-1,10,1,1}");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray8, 0, (long) 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray8, (long) (-1), (int) (byte) 1);
        long[] longArray15 = new long[] {};
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(longArray15, (long) (short) 1);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.addAll(longArray8, longArray15);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray18, (long) 1, 3);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.add(longArray18, (long) (byte) 100);
        java.lang.Long[] longArray24 = org.apache.commons.lang3.ArrayUtils.toObject(longArray23);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[-1, 10, -1, 10, 1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray24);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (int) (short) 0, (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 10);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray7, (int) (byte) 10, 10);
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray20, (byte) 0);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 100 };
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray25, (byte) 10, 0);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray20, byteArray25);
        byte[] byteArray30 = null;
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray29, byteArray30);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.remove(byteArray29, 2);
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray7, byteArray29);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray7, (int) (short) 100, 10);
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray42, (byte) 0);
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) 100 };
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray47, (byte) 10, 0);
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray42, byteArray47);
        byte[] byteArray52 = null;
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray51, byteArray52);
        byte[] byteArray55 = org.apache.commons.lang3.ArrayUtils.remove(byteArray51, 2);
        java.lang.Byte[] byteArray56 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray55);
        byte[] byteArray59 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray55, (int) (short) 0, 6);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray59);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray37, byteArray59);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 100, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100, 100, 1, -1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-1, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 0, (short) 0 };
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) -1, (short) 0, (short) 0 };
        java.lang.Short[] shortArray11 = new java.lang.Short[] { (short) -1, (short) 0, (short) 0 };
        java.lang.Short[] shortArray15 = new java.lang.Short[] { (short) -1, (short) 0, (short) 0 };
        java.lang.Short[] shortArray19 = new java.lang.Short[] { (short) -1, (short) 0, (short) 0 };
        java.lang.Short[] shortArray23 = new java.lang.Short[] { (short) -1, (short) 0, (short) 0 };
        java.lang.Short[][] shortArray24 = new java.lang.Short[][] { shortArray3, shortArray7, shortArray11, shortArray15, shortArray19, shortArray23 };
        java.lang.Short[] shortArray30 = new java.lang.Short[] { (short) 100, (short) 10, (short) -1, (short) 10, (short) 10 };
        java.lang.Short[] shortArray36 = new java.lang.Short[] { (short) 100, (short) 10, (short) -1, (short) 10, (short) 10 };
        java.lang.Short[] shortArray42 = new java.lang.Short[] { (short) 100, (short) 10, (short) -1, (short) 10, (short) 10 };
        java.lang.Short[] shortArray48 = new java.lang.Short[] { (short) 100, (short) 10, (short) -1, (short) 10, (short) 10 };
        java.lang.Short[][] shortArray49 = new java.lang.Short[][] { shortArray30, shortArray36, shortArray42, shortArray48 };
        java.lang.Short[][] shortArray50 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray24, shortArray49);
        int[] intArray54 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray61 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray60);
        int[] intArray67 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray61, intArray67);
        int[] intArray69 = org.apache.commons.lang3.ArrayUtils.addAll(intArray54, intArray67);
        int[] intArray71 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray54, 2);
        int[] intArray73 = org.apache.commons.lang3.ArrayUtils.add(intArray54, (-1));
        int[] intArray75 = org.apache.commons.lang3.ArrayUtils.add(intArray54, (int) (byte) 10);
        java.lang.Short[][] shortArray76 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray49, (java.lang.Object) intArray54);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[100, 10, 52, 0, -1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[100, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[100, 10, 52, 10]");
        org.junit.Assert.assertNotNull(shortArray76);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray0, (java.lang.Object) byteArray15);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, 0L);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100 };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray22, (byte) 10, 0);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.add(byteArray22, (byte) 1);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.add(byteArray27, (int) (short) 0, (byte) 1);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray30, (byte) 0, 8);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.contains(byteArray30, (byte) 0);
        java.lang.Short[] shortArray42 = new java.lang.Short[] { (short) 10, (short) 100, (short) -1, (short) 1, (short) 0, (short) 0 };
        short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray42);
        short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray42);
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray42, (short) 1);
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray42, (short) 10);
        java.lang.Long[] longArray49 = new java.lang.Long[] {};
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray49);
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray57 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray55, (byte) 0);
        byte[] byteArray60 = new byte[] { (byte) 100, (byte) 100 };
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray60, (byte) 10, 0);
        byte[] byteArray64 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray55, byteArray60);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray49, (java.lang.Object) byteArray64);
        byte[] byteArray70 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray72 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray70, (byte) 0);
        byte[] byteArray74 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray70, (byte) 1);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray64, byteArray70);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray64);
        boolean boolean77 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) shortArray42, (java.lang.Object) byteArray64);
        boolean boolean79 = org.apache.commons.lang3.ArrayUtils.contains(byteArray64, (byte) 1);
        int int81 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray64, (byte) 10);
        boolean boolean82 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray30, byteArray64);
        int int83 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray0, (java.lang.Object) boolean82);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 100, 100, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (-1), (-1));
        java.lang.Double[] doubleArray14 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray14, (double) '#');
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray14);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray14);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) int7, (java.lang.Object) doubleArray18);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) '4', (double) (short) 10);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        char[] charArray12 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray12, '4', (int) (byte) 100);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray12, '#', 0);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.addAll(charArray3, charArray12);
        char[] charArray21 = new char[] { '#' };
        java.lang.Character[] charArray22 = org.apache.commons.lang3.ArrayUtils.toObject(charArray21);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.clone(charArray21);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.add(charArray23, 'a');
        char[] charArray27 = new char[] { '#' };
        java.lang.Character[] charArray28 = org.apache.commons.lang3.ArrayUtils.toObject(charArray27);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.clone(charArray27);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.addAll(charArray23, charArray27);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.addAll(charArray19, charArray27);
        char[] charArray33 = new char[] { '#' };
        java.lang.Character[] charArray34 = org.apache.commons.lang3.ArrayUtils.toObject(charArray33);
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.clone(charArray33);
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.add(charArray35, 'a');
        java.lang.Character[] charArray38 = org.apache.commons.lang3.ArrayUtils.toObject(charArray35);
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.clone(charArray35);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray19, charArray39);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "##a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "##a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, #, a, 4, #,  ,  ]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#, a]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, #]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##a4#  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##a4#  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #, a, 4, #,  ,  , #]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#, a]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[#]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        boolean[][] booleanArray0 = new boolean[][] {};
        boolean[][] booleanArray1 = new boolean[][] {};
        boolean[][] booleanArray2 = new boolean[][] {};
        boolean[][] booleanArray3 = new boolean[][] {};
        boolean[][] booleanArray4 = new boolean[][] {};
        boolean[][][] booleanArray5 = new boolean[][][] { booleanArray0, booleanArray1, booleanArray2, booleanArray3, booleanArray4 };
        boolean[][][] booleanArray6 = new boolean[][][] {};
        java.lang.Double[] doubleArray10 = new java.lang.Double[] { 100.0d, 1.0d, 100.0d };
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray10);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray11, (double) (byte) 0);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.add(doubleArray13, 1, 0.0d);
        boolean[][][] booleanArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray6, (java.lang.Object) 1);
        boolean[][][] booleanArray18 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray6);
        double[] doubleArray20 = new double[] { (byte) 10 };
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray20);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray21);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray21, (double) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray21);
        java.lang.String str27 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) doubleArray21, " ");
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray21, (int) '#', (int) (short) 0);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray21, (double) 6);
        boolean[][][] booleanArray33 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray6, (java.lang.Object) doubleArray21);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 0.0, 1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{10.0}" + "'", str27, "{10.0}");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0]");
        org.junit.Assert.assertNotNull(booleanArray33);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        int[] intArray3 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9);
        int[] intArray16 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray16);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = org.apache.commons.lang3.ArrayUtils.remove(intArray18, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 10, 52, 0, -1, -1, 10, 100]");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (int) (byte) 1, (int) ' ');
        int[] intArray10 = new int[] { (byte) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, 10, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, 0, 1);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.addAll(intArray1, intArray10);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray19, 4);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.add(intArray19, (int) '4');
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray23);
        java.lang.Integer[] intArray25 = org.apache.commons.lang3.ArrayUtils.toObject(intArray23);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 52]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        char[] charArray1 = new char[] { ' ' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.add(charArray1, '#');
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray1, '#', (int) (short) 10);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.subarray(charArray1, (int) (short) -1, (int) '#');
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.clone(charArray9);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.add(charArray12, 'a');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , a]");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.remove(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = org.apache.commons.lang3.ArrayUtils.remove(intArray5, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        char[] charArray0 = null;
        char[] charArray2 = new char[] { '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.toObject(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray4, '4');
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.addAll(charArray0, charArray6);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.subarray(charArray7, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray10, (int) (byte) 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[#]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        double[] doubleArray3 = new double[] { (-1), (byte) 100, 10L };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) 0.0f, 0, 100.0d);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8, (double) (-1.0f));
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8, (double) 1L);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8, (double) 0.0f);
        double[] doubleArray16 = new double[] { (byte) 10 };
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray16);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray17);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray17, (double) ' ');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray17);
        java.lang.Double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray17);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray14, doubleArray17);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, (-1.0d), 4, (double) 1);
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.add(doubleArray23, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 10.0, 10.0, 0.0]");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 10, 0);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray9);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.add(byteArray13, (byte) 1);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray13, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 0, 0, 1, 100, 100, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (int) (byte) 1, (int) ' ');
        int[] intArray10 = new int[] { (byte) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, 10, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, 0, 1);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.addAll(intArray1, intArray10);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray19, 4);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.add(intArray19, (int) '4');
        java.lang.Integer[] intArray24 = org.apache.commons.lang3.ArrayUtils.toObject(intArray19);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray24);
        int[] intArray27 = new int[] { (byte) 0 };
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray27, 0);
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.add(intArray27, 0);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray27, (int) (short) 100);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray27);
        int[] intArray38 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray44);
        int[] intArray51 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray45, intArray51);
        int[] intArray53 = org.apache.commons.lang3.ArrayUtils.addAll(intArray38, intArray51);
        int[] intArray55 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray38, 2);
        int[] intArray59 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray66 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray65);
        int[] intArray72 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean73 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray66, intArray72);
        int[] intArray74 = org.apache.commons.lang3.ArrayUtils.addAll(intArray59, intArray72);
        int[] intArray76 = org.apache.commons.lang3.ArrayUtils.remove(intArray59, (int) (short) 1);
        boolean boolean77 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray55, intArray76);
        boolean boolean78 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray27, intArray76);
        int int80 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray27, (int) (byte) 0);
        boolean boolean82 = org.apache.commons.lang3.ArrayUtils.contains(intArray27, (int) ' ');
        int int84 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray27, (int) ' ');
        boolean boolean85 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray27);
        boolean boolean86 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray25, intArray27);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 52]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 10, 52, 0, -1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 10, 52, 0, -1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 52]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 1);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, 5);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(byteArray2, (byte) 1);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 100 };
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray15, (byte) 10, 0);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray15, (byte) 1);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.add(byteArray20, (int) (short) 0, (byte) 1);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.add(byteArray20, (byte) 10);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray20, (int) (byte) 10, 10);
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray33, (byte) 0);
        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 100 };
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray38, (byte) 10, 0);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray33, byteArray38);
        byte[] byteArray43 = null;
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray42, byteArray43);
        byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.remove(byteArray42, 2);
        byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray20, byteArray42);
        byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray20, (int) (short) 100, 10);
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray2, byteArray20);
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.add(byteArray51, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 100, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, 100, 1, -1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[100, 100, 100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[100, 100, 100, 100, 1, 1]");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        char[] charArray7 = new char[] { '#' };
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.toObject(charArray7);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.clone(charArray7);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.addAll(charArray3, charArray7);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray10, '4', (int) (byte) 100);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.subarray(charArray10, 5, (int) (short) 1);
        char[] charArray17 = null;
        char[] charArray19 = new char[] { '#' };
        java.lang.Character[] charArray20 = org.apache.commons.lang3.ArrayUtils.toObject(charArray19);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.clone(charArray19);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.add(charArray21, 'a');
        char[] charArray30 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray30, '4', (int) (byte) 100);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray30, '#', 0);
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.addAll(charArray21, charArray30);
        char[] charArray39 = new char[] { '#' };
        java.lang.Character[] charArray40 = org.apache.commons.lang3.ArrayUtils.toObject(charArray39);
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.clone(charArray39);
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.add(charArray41, 'a');
        char[] charArray45 = new char[] { '#' };
        java.lang.Character[] charArray46 = org.apache.commons.lang3.ArrayUtils.toObject(charArray45);
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.clone(charArray45);
        char[] charArray48 = org.apache.commons.lang3.ArrayUtils.addAll(charArray41, charArray45);
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.addAll(charArray37, charArray45);
        char[] charArray50 = org.apache.commons.lang3.ArrayUtils.clone(charArray45);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray17, charArray50);
        char[] charArray53 = new char[] { '#' };
        java.lang.Character[] charArray54 = org.apache.commons.lang3.ArrayUtils.toObject(charArray53);
        char[] charArray55 = org.apache.commons.lang3.ArrayUtils.clone(charArray53);
        char[] charArray57 = org.apache.commons.lang3.ArrayUtils.add(charArray55, 'a');
        java.lang.Character[] charArray58 = org.apache.commons.lang3.ArrayUtils.toObject(charArray55);
        int int60 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray55, ' ');
        java.lang.Character[] charArray61 = org.apache.commons.lang3.ArrayUtils.toObject(charArray55);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray17, charArray55);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray55);
        int int65 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray55, ' ');
        char[] charArray66 = org.apache.commons.lang3.ArrayUtils.addAll(charArray16, charArray55);
        char[] charArray67 = org.apache.commons.lang3.ArrayUtils.clone(charArray16);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, a]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "##a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "##a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#, #, a, 4, #,  ,  ]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[#]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#, a]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[#]");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[#]");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[#, #]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##a4#  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##a4#  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, a, 4, #,  ,  , #]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[#]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[#]");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[#]");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[#, a]");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[#]");
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[]");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] { objArray0, objArray1 };
        java.lang.Object obj3 = null;
        java.lang.Object[][] objArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(objArray2, obj3);
        char[] charArray6 = new char[] { '#' };
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) objArray2, (java.lang.Object[]) charArray7);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, ' ');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.add(charArray12, ' ');
        boolean[] booleanArray19 = new boolean[] { true, true, false, true };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray19, true, (int) '4');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray19);
        java.lang.Boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray19);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray24);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray24, false);
        java.lang.Character[] charArray29 = new java.lang.Character[] { '4' };
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray29);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray29, 'a');
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray24, (java.lang.Object) charArray32);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray32, '4', 10);
        char[] charArray38 = new char[] { '#' };
        java.lang.Character[] charArray39 = org.apache.commons.lang3.ArrayUtils.toObject(charArray38);
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.clone(charArray38);
        char[] charArray42 = org.apache.commons.lang3.ArrayUtils.add(charArray40, 'a');
        char[] charArray49 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray49, '4', (int) (byte) 100);
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray49, '#', 0);
        char[] charArray56 = org.apache.commons.lang3.ArrayUtils.addAll(charArray40, charArray49);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray32, charArray40);
        char[] charArray58 = org.apache.commons.lang3.ArrayUtils.addAll(charArray14, charArray32);
        char[] charArray61 = org.apache.commons.lang3.ArrayUtils.add(charArray58, (int) (short) 1, '4');
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#,  ]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[#]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[#, a]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "#a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "#a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "##a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "##a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[#, #, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[#,  , 4]");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[#, 4,  , 4]");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        double[] doubleArray3 = new double[] { (-1), (byte) 100, 10L };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) 0.0f, 0, 100.0d);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8, (double) (-1.0f));
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8, (double) 1L);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8, (double) 0.0f);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray14);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray15);
        double[] doubleArray18 = new double[] { (byte) 10 };
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray18);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray19, 0.0d);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray19, (double) 5, 100.0d);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray19, (double) (byte) 1, 0.0d);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray16, doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray3);
        float[] floatArray5 = null;
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray3, floatArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray6, (float) 0, (int) (short) 10);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.clone(floatArray6);
        float[] floatArray12 = new float[] {};
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (float) 10L);
        float[] floatArray16 = new float[] { (byte) -1 };
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray16);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray17, (float) (-1L));
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray17, (float) 100L);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray6, floatArray17);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0]");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.lang.Byte[][] byteArray0 = new java.lang.Byte[][] {};
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        java.lang.Byte[] byteArray12 = new java.lang.Byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        java.lang.Byte[] byteArray18 = new java.lang.Byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        java.lang.Byte[] byteArray24 = new java.lang.Byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        java.lang.Byte[] byteArray30 = new java.lang.Byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        java.lang.Byte[][] byteArray31 = new java.lang.Byte[][] { byteArray6, byteArray12, byteArray18, byteArray24, byteArray30 };
        java.lang.Byte[][] byteArray32 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray31);
        java.util.Map<java.lang.Object, java.lang.Object> objMap33 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) byteArray0);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(objMap33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) 1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray3, floatArray7);
        float[] floatArray9 = new float[] {};
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (float) 10L);
        float[] floatArray13 = new float[] { (byte) -1 };
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray11, floatArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray14, (float) (-1L));
        float[] floatArray17 = new float[] {};
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (float) 10L);
        float[] floatArray21 = new float[] { (byte) -1 };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray19, floatArray21);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray19, (float) 1);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray14, floatArray19);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray19);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.add(floatArray7, (float) (byte) 1);
        float[] floatArray30 = new float[] { '#' };
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.add(floatArray30, (float) (-1));
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.clone(floatArray30);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray33, 0, (int) (short) 100);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray33, (float) 4);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray28, floatArray33);
        float[] floatArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray33, (float) 8);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[35.0]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[35.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[35.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[35.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[35.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[35.0]");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        char[] charArray0 = null;
        char[] charArray2 = new char[] { '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.toObject(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 'a');
        char[] charArray13 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray13, '4', (int) (byte) 100);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray13, '#', 0);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.addAll(charArray4, charArray13);
        char[] charArray22 = new char[] { '#' };
        java.lang.Character[] charArray23 = org.apache.commons.lang3.ArrayUtils.toObject(charArray22);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.clone(charArray22);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.add(charArray24, 'a');
        char[] charArray28 = new char[] { '#' };
        java.lang.Character[] charArray29 = org.apache.commons.lang3.ArrayUtils.toObject(charArray28);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.addAll(charArray24, charArray28);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.addAll(charArray20, charArray28);
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray33);
        char[] charArray36 = new char[] { '#' };
        java.lang.Character[] charArray37 = org.apache.commons.lang3.ArrayUtils.toObject(charArray36);
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.clone(charArray36);
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.add(charArray38, 'a');
        java.lang.Character[] charArray41 = org.apache.commons.lang3.ArrayUtils.toObject(charArray38);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray38, ' ');
        java.lang.Character[] charArray44 = org.apache.commons.lang3.ArrayUtils.toObject(charArray38);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray38);
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray38, ' ');
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray47, '#');
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray47, '#', (int) (short) 1);
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray47, ' ');
        char[] charArray55 = org.apache.commons.lang3.ArrayUtils.clone(charArray47);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[#]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, a]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "##a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "##a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, #, a, 4, #,  ,  ]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, a]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "##a4#  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "##a4#  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[#, #, a, 4, #,  ,  , #]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[#, a]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[#]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[#]");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray4 = new float[] { (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) (-1L));
        float[] floatArray8 = new float[] {};
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) 10L);
        float[] floatArray12 = new float[] { (byte) -1 };
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray12);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray5, floatArray10);
        java.lang.Float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray10);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray10, (float) 3, (int) '4');
        java.lang.Double[] doubleArray25 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray25, (double) '#');
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, (int) (short) 1, (double) 1.0f);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray30, (double) (short) -1);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray30);
        java.lang.Double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray33);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        int int36 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) floatArray35);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray34, (java.lang.Object) floatArray35);
        float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray35, (float) '#');
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray35);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray40, (float) (short) 0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) (short) 0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        char[] charArray5 = new char[] { ' ' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray5, '#');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray10, objArray11 };
        java.lang.Object obj13 = null;
        java.lang.Object[][] objArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(objArray12, obj13);
        char[] charArray16 = new char[] { '#' };
        java.lang.Character[] charArray17 = org.apache.commons.lang3.ArrayUtils.toObject(charArray16);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) objArray12, (java.lang.Object[]) charArray17);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17, ' ');
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17, '4');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.addAll(charArray7, charArray22);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray0, (java.lang.Object) charArray22, 10);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, a]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " ##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " ##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , #, #]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray3 = org.apache.commons.lang3.ArrayUtils.add(charArray0, 5, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray3);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 0, (int) 'a');
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) (byte) 0, (int) (byte) -1);
        float[] floatArray12 = new float[] { '#' };
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (float) (-1));
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray12);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) 1L);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[35.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[35.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[35.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.lang.Object[] objArray0 = null;
        double[] doubleArray3 = new double[] { (byte) 100, (-1.0d) };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray3);
        double[] doubleArray6 = new double[] { (byte) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray6);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray6, (double) 2);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 100L, (double) 4);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.add(doubleArray6, (double) (byte) 100);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, (double) 0.0f);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(objArray0, (java.lang.Object) doubleArray15, (int) (short) 1);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray15, 1.0d, 9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        char[] charArray0 = null;
        char[] charArray2 = new char[] { '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.toObject(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 'a');
        char[] charArray13 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray13, '4', (int) (byte) 100);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray13, '#', 0);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.addAll(charArray4, charArray13);
        char[] charArray22 = new char[] { '#' };
        java.lang.Character[] charArray23 = org.apache.commons.lang3.ArrayUtils.toObject(charArray22);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.clone(charArray22);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.add(charArray24, 'a');
        char[] charArray28 = new char[] { '#' };
        java.lang.Character[] charArray29 = org.apache.commons.lang3.ArrayUtils.toObject(charArray28);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.addAll(charArray24, charArray28);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.addAll(charArray20, charArray28);
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray33);
        char[] charArray36 = new char[] { '#' };
        java.lang.Character[] charArray37 = org.apache.commons.lang3.ArrayUtils.toObject(charArray36);
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.clone(charArray36);
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.add(charArray38, 'a');
        java.lang.Character[] charArray41 = org.apache.commons.lang3.ArrayUtils.toObject(charArray38);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray38, ' ');
        java.lang.Character[] charArray44 = org.apache.commons.lang3.ArrayUtils.toObject(charArray38);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray38);
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray38, ' ');
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray47, '#');
        char[] charArray51 = new char[] { '#' };
        java.lang.Character[] charArray52 = org.apache.commons.lang3.ArrayUtils.toObject(charArray51);
        char[] charArray53 = org.apache.commons.lang3.ArrayUtils.clone(charArray51);
        char[] charArray55 = org.apache.commons.lang3.ArrayUtils.add(charArray53, 'a');
        char[] charArray62 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int65 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray62, '4', (int) (byte) 100);
        int int68 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray62, '#', 0);
        char[] charArray69 = org.apache.commons.lang3.ArrayUtils.addAll(charArray53, charArray62);
        char[] charArray71 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray62, 'a');
        boolean boolean72 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray49, charArray71);
        int int75 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray49, '4', (int) 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray49);
        java.lang.Character[] charArray77 = org.apache.commons.lang3.ArrayUtils.toObject(charArray49);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[#]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, a]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "##a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "##a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, #, a, 4, #,  ,  ]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, a]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "##a4#  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "##a4#  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[#, #, a, 4, #,  ,  , #]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[#, a]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[#]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[]");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[#]");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[#]");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[#, a]");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "#a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "#a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[#, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "##a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "##a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[#, #, a, 4, #,  ,  ]");
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "#4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "#4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[#, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(charArray77);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray9, (short) (byte) 1);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 100, 3);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, (short) (byte) 1);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray20);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[1, 10, 100, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 100, 3);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (int) (short) 0);
        java.lang.Integer[] intArray9 = org.apache.commons.lang3.ArrayUtils.toObject(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = org.apache.commons.lang3.ArrayUtils.remove(intArray1, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        char[] charArray0 = null;
        char[] charArray2 = new char[] { '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.toObject(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 'a');
        char[] charArray13 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray13, '4', (int) (byte) 100);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray13, '#', 0);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.addAll(charArray4, charArray13);
        char[] charArray22 = new char[] { '#' };
        java.lang.Character[] charArray23 = org.apache.commons.lang3.ArrayUtils.toObject(charArray22);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.clone(charArray22);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.add(charArray24, 'a');
        char[] charArray28 = new char[] { '#' };
        java.lang.Character[] charArray29 = org.apache.commons.lang3.ArrayUtils.toObject(charArray28);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.addAll(charArray24, charArray28);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.addAll(charArray20, charArray28);
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray33);
        java.lang.Character[] charArray35 = org.apache.commons.lang3.ArrayUtils.toObject(charArray33);
        char[] charArray37 = new char[] { '#' };
        java.lang.Character[] charArray38 = org.apache.commons.lang3.ArrayUtils.toObject(charArray37);
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.clone(charArray37);
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.add(charArray39, 'a');
        java.lang.Character[] charArray42 = org.apache.commons.lang3.ArrayUtils.toObject(charArray39);
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray42);
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.clone(charArray43);
        char[] charArray46 = new char[] { '#' };
        java.lang.Character[] charArray47 = org.apache.commons.lang3.ArrayUtils.toObject(charArray46);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray46);
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.addAll(charArray44, charArray46);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray33, charArray49);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.contains(charArray49, '4');
        char[] charArray54 = org.apache.commons.lang3.ArrayUtils.remove(charArray49, 1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[#]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, a]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "##a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "##a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, #, a, 4, #,  ,  ]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, a]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "##a4#  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "##a4#  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[#, #, a, 4, #,  ,  , #]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[#]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, a]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#]");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#]");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[#]");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, (int) '4');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        java.lang.Boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray4);
        boolean[] booleanArray10 = null;
        boolean[] booleanArray11 = new boolean[] {};
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, true);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray10, booleanArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray4, booleanArray11);
        java.lang.Boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray11);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17, false);
        double[] doubleArray25 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray25, (double) (short) -1);
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray25, (double) ' ');
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray17, (java.lang.Object) ' ', (int) (short) 1);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[]");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.lang.Object[] objArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) 10L);
        float[] floatArray5 = new float[] { (byte) -1 };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray3, floatArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray6, (float) (-1L));
        float[] floatArray9 = new float[] {};
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (float) 10L);
        float[] floatArray13 = new float[] { (byte) -1 };
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray11, floatArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray6, floatArray11);
        java.lang.Float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray11);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) floatArray16);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16, (float) (-1L));
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16, 0.0f);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.clone(floatArray22);
        float[] floatArray24 = new float[] {};
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.add(floatArray24, (float) 10L);
        float[] floatArray28 = new float[] { (byte) -1 };
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray26, floatArray28);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray29, (float) (-1L));
        float[] floatArray32 = new float[] {};
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.add(floatArray32, (float) 10L);
        float[] floatArray36 = new float[] { (byte) -1 };
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray34, floatArray36);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray34, (float) 1);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray29, floatArray34);
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray34, 10, 0);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.contains(floatArray43, (float) '4');
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray43);
        float[] floatArray47 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray23, floatArray43);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[10.0]");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, (byte) -1);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.clone(byteArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, -1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 10, 0);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray9);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray9, 0, (int) (byte) 10);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray9, (byte) 100);
        java.lang.Byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray18);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray18);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray18, (int) (short) -1, (int) (byte) -1);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray18, (byte) 100);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.clone(byteArray25);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 100]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, 100]");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3, 1.0d);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0]");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray3, (short) (byte) 0);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) 100);
        short[] shortArray22 = new short[] { (short) 10, (short) 1, (byte) 1, (short) 1 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray22);
        short[] shortArray27 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray27);
        short[] shortArray33 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray33, (short) (byte) 0, 2);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray27, shortArray33);
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray22, shortArray27);
        short[] shortArray42 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray42);
        short[] shortArray48 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray48, (short) (byte) 0, 2);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray42, shortArray48);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray22, shortArray42);
        short[] shortArray59 = new short[] { (short) 0, (byte) 0, (byte) -1, (short) 100, (short) 10 };
        short[] shortArray64 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int67 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray64, (short) (byte) 0, 2);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray59, shortArray64);
        int int71 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray64, (short) -1, (int) (short) 0);
        short[] shortArray74 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray64, 2, (int) (byte) -1);
        boolean boolean76 = org.apache.commons.lang3.ArrayUtils.contains(shortArray64, (short) (byte) 100);
        boolean boolean77 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray22, shortArray64);
        short[] shortArray78 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray17, shortArray64);
        boolean boolean79 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray17);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[10, 100]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[1, 1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[1, 1, 1, 10, 100, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[0, 0, -1, 100, 10]");
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray74), "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray78), "[10, 100, 1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray0, (java.lang.Object) byteArray15);
        java.lang.Byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray15);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray15, (byte) 1);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.clone(byteArray19);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray25, (byte) 0);
        byte[] byteArray30 = new byte[] { (byte) 100, (byte) 100 };
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray30, (byte) 10, 0);
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray25, byteArray30);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray30, 0, (int) (byte) 10);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.clone(byteArray30);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray20, byteArray30);
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 100 };
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray42, (byte) 10, 0);
        byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.add(byteArray42, (byte) 1);
        byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.add(byteArray47, (int) (short) 0, (byte) 1);
        int[] intArray52 = new int[] { (byte) 0 };
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray52, 0);
        int[] intArray56 = org.apache.commons.lang3.ArrayUtils.add(intArray52, 0);
        int int59 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray52, (int) (byte) 1, (int) ' ');
        int[] intArray61 = new int[] { (byte) 0 };
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray61, 0);
        int int66 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray61, 10, 0);
        int int69 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray61, 0, 1);
        int[] intArray70 = org.apache.commons.lang3.ArrayUtils.addAll(intArray52, intArray61);
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) byteArray50, (java.lang.Object) intArray61);
        byte[] byteArray72 = null;
        boolean boolean73 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray50, byteArray72);
        byte[] byteArray78 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray80 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray78, (byte) 0);
        byte[] byteArray82 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray78, (byte) 1);
        int int85 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray78, (byte) 1, 1);
        int int88 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray78, (byte) 10, (int) (short) -1);
        java.lang.Byte[] byteArray89 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray78);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray78);
        byte[] byteArray91 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray50, byteArray78);
        byte[] byteArray93 = org.apache.commons.lang3.ArrayUtils.add(byteArray50, (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray93);
        int int97 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray93, (byte) 10, (int) ' ');
        boolean boolean98 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray20, byteArray93);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 0, 0, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 0, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100, 100]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100, 100]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 0, 0, 100, 100, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray91), "[1, 100, 100, 1, 1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray93), "[10, 1, 100, 100, 1]");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray1);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray1, 3, 2);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, ' ');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, (int) '4');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        java.lang.Boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray4);
        boolean[] booleanArray10 = null;
        boolean[] booleanArray11 = new boolean[] {};
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, true);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray10, booleanArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray4, booleanArray11);
        java.lang.Boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray11);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17, false);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17, true);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[]");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        java.lang.Character[] charArray1 = new java.lang.Character[] { '4' };
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 0, 9);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, false };
        boolean[] booleanArray11 = new boolean[] { false, false, false, false, false };
        boolean[] booleanArray17 = new boolean[] { false, false, false, false, false };
        boolean[][] booleanArray18 = new boolean[][] { booleanArray5, booleanArray11, booleanArray17 };
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        boolean[][] booleanArray21 = org.apache.commons.lang3.ArrayUtils.add(booleanArray18, (int) (byte) 0, booleanArray20);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1), 2, (-1), 2 };
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray26);
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray32, (byte) 0);
        byte[] byteArray37 = new byte[] { (byte) 100, (byte) 100 };
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray37, (byte) 10, 0);
        byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray32, byteArray37);
        byte[] byteArray42 = null;
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray41, byteArray42);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.remove(byteArray41, 2);
        byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.clone(byteArray45);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.add(byteArray46, (byte) 0);
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) intArray26, (java.lang.Object) byteArray46, (int) (byte) 0);
        boolean[][] booleanArray51 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray18, (java.lang.Object) intArray26);
        int[] intArray53 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray26, (int) (short) 10);
        int int56 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray53, (int) (short) 100, 2);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 2, -1, 2]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-1, 0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(booleanArray51);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1, 2, -1, 2]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray10, (long) (-1));
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray12, 0, (long) 1);
        java.lang.Class<?> wildcardClass16 = longArray12.getClass();
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ArrayUtils.add(wildcardClassArray3, wildcardClass16);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) wildcardClassArray3);
        java.lang.Long[] longArray19 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int[] intArray23 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray29);
        int[] intArray36 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray30, intArray36);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.addAll(intArray23, intArray36);
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray36, 1);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) longArray19, (java.lang.Object) intArray36);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) wildcardClassArray3, (java.lang.Object[]) longArray19);
        java.lang.Class<?>[][] wildcardClassArray43 = org.apache.commons.lang3.ArrayUtils.add(wildcardClassArray2, wildcardClassArray3);
        java.lang.Class<?>[][] wildcardClassArray44 = org.apache.commons.lang3.ArrayUtils.clone(wildcardClassArray43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[][] wildcardClassArray46 = org.apache.commons.lang3.ArrayUtils.remove(wildcardClassArray44, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 10, 52, 0, -1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, 1.0f);
        double[] doubleArray4 = new double[] { (byte) 10 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray4);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) floatArray0, (java.lang.Object[]) doubleArray7);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, 10.0f);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, 0.0f);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray13, (float) (short) 10);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        double[] doubleArray5 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) (short) -1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 'a', (double) 3);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) '#', (double) 0.0f);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[] floatArray9 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[] floatArray14 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[] floatArray24 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[] floatArray29 = new java.lang.Float[] { (-1.0f), (-1.0f), 0.0f, (-1.0f) };
        java.lang.Float[][] floatArray30 = new java.lang.Float[][] { floatArray4, floatArray9, floatArray14, floatArray19, floatArray24, floatArray29 };
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        java.lang.Object[][] objArray33 = new java.lang.Object[][] { objArray31, objArray32 };
        java.lang.Object obj34 = null;
        java.lang.Object[][] objArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(objArray33, obj34);
        char[] charArray37 = new char[] { '#' };
        java.lang.Character[] charArray38 = org.apache.commons.lang3.ArrayUtils.toObject(charArray37);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) objArray33, (java.lang.Object[]) charArray38);
        java.lang.Float[][] floatArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray30, (java.lang.Object) charArray38);
        char[] charArray42 = new char[] { ' ' };
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.add(charArray42, '#');
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray42, '#', (int) (short) 10);
        char[] charArray50 = org.apache.commons.lang3.ArrayUtils.subarray(charArray42, (int) (short) -1, (int) '#');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray50);
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray38, (java.lang.Object) charArray50);
        char[] charArray54 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray38, '4');
        java.lang.Character[] charArray55 = org.apache.commons.lang3.ArrayUtils.toObject(charArray54);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ ]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[ , #]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[ ]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[#]");
        org.junit.Assert.assertNotNull(charArray55);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        int[] intArray3 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9);
        int[] intArray16 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray16);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray16);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) -1, 1);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(intArray3, (int) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 10, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 10, 52, 0, -1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray3, ' ');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 0, (int) (byte) -1);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray3, '#');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[]");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) 1, (short) 100, (short) -1, (short) 100 };
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray4, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, 5, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 100, -1, 100]");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.lang.Float[][][][] floatArray0 = new java.lang.Float[][][][] {};
        java.lang.Float[][][][][] floatArray1 = new java.lang.Float[][][][][] { floatArray0 };
        java.lang.Float[][][][][] floatArray2 = org.apache.commons.lang3.ArrayUtils.toArray(floatArray1);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = org.apache.commons.lang3.ArrayUtils.clone(typeArray0);
        float[] floatArray2 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (float) 10L);
        float[] floatArray6 = new float[] { (byte) -1 };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray6);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) typeArray1, (java.lang.Object) floatArray4);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray4);
        java.lang.reflect.Type[][] typeArray10 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray11 = org.apache.commons.lang3.ArrayUtils.clone(typeArray10);
        float[] floatArray12 = new float[] {};
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (float) 10L);
        float[] floatArray16 = new float[] { (byte) -1 };
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray16);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) typeArray11, (java.lang.Object) floatArray14);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray14, (-1), (int) (short) 0);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) floatArray9, (java.lang.Object) floatArray21, 6);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray21, 0.0f);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        boolean[] booleanArray0 = new boolean[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, true);
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray0);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, true, (int) (byte) 10);
        boolean[] booleanArray7 = new boolean[] {};
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray7, true);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray7);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray7, true, (int) (byte) 10);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray0, booleanArray7);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 10);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray0, 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[]");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 10, 0);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray9);
        byte[] byteArray14 = null;
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray13, byteArray14);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.remove(byteArray13, 2);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.clone(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray17, (byte) 1);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray20, (byte) 1);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(byteArray22, (byte) 10);
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 100 };
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray27, (byte) 10, 0);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.add(byteArray27, (byte) 1);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.add(byteArray32, (int) (short) 0, (byte) 1);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.add(byteArray32, (byte) 10);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.add(byteArray37, (byte) 0);
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray22, byteArray39);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 0, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100, 100, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[100, 100, 1, 10, 0]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-1, 0, 100, 100, 100, 100, 1, 10, 0]");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (int) (short) 0, (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 10);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray7, byteArray16);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray17, (byte) 10);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray19, (byte) 100);
        short[] shortArray25 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray25);
        short[] shortArray31 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray31, (short) (byte) 0, 2);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray25, shortArray31);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray31);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray31, (short) -1, (int) (byte) 1);
        short[] shortArray40 = null;
        short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray31, shortArray40);
        int int44 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray41, (short) 0, 0);
        short[] shortArray49 = new short[] { (short) 10, (short) 1, (byte) 1, (short) 1 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray49);
        short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.remove(shortArray49, 0);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray41, shortArray52);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.add(shortArray52, 3, (short) 0);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) int21, (java.lang.Object) shortArray56);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 100, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 100, 1, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 100, 1, 0, 100]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[1, 1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[1, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, (int) '4');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, (int) (byte) 1);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true);
        boolean[] booleanArray19 = new boolean[] { true, true, false, true };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray19, true, (int) '4');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray19);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray19, false);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray19);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray26, true);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray26, (int) (byte) 0, (int) '4');
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray4, booleanArray31);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray31, false, (int) '#');
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[true, true, false, true, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        long[] longArray0 = null;
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, (long) 1);
        java.lang.Long[] longArray4 = org.apache.commons.lang3.ArrayUtils.toObject(longArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray0, longArray3);
        java.lang.Long[] longArray12 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray12, (long) (-1));
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray14, (long) '#');
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.subarray(longArray14, (int) '4', (int) (byte) 10);
        java.lang.Long[] longArray26 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray26, (long) (-1));
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray28, (long) '#');
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.addAll(longArray19, longArray28);
        long[] longArray34 = new long[] { (byte) -1, 10 };
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.clone(longArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray19, longArray34);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray34, (long) 7);
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray38);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[-1, 10]");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        short[] shortArray4 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray4);
        short[] shortArray10 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray10, (short) (byte) 0, 2);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray4, shortArray10);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray4, (short) (byte) 0);
        short[] shortArray21 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray21, (short) (byte) 0, 2);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray21, (short) 100);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray26);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) wildcardClassArray0, (java.lang.Object) shortArray27);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray27, (short) (byte) 1);
        short[] shortArray34 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray34);
        short[] shortArray40 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray40, (short) (byte) 0, 2);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray34, shortArray40);
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray34, (short) (byte) 0);
        short[] shortArray51 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray51, (short) (byte) 0, 2);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray51, (short) 100);
        short[] shortArray57 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray34, shortArray56);
        short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray27, shortArray56);
        short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray58, 2, (int) (byte) 1);
        short[] shortArray65 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray65);
        short[] shortArray71 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int74 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray71, (short) (byte) 0, 2);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray65, shortArray71);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray71);
        int int79 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray71, (short) -1, (int) (byte) 1);
        short[] shortArray80 = null;
        short[] shortArray81 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray71, shortArray80);
        int int84 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray81, (short) 0, 0);
        short[] shortArray86 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray81, (short) 1);
        boolean boolean87 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray61, shortArray81);
        short[] shortArray90 = org.apache.commons.lang3.ArrayUtils.add(shortArray81, (int) (byte) 0, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[100, 10, 100, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[100, 10, 100, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[100, 10, 100, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[100, 10, 100, 1, 10, 0, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[]");
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray71), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray81), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(shortArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray86), "[0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(shortArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray90), "[10, 0, 100, 10, 1]");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        char[] charArray1 = new char[] { ' ' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.add(charArray1, '#');
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray1, '#', (int) (short) 10);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.subarray(charArray1, (int) (short) -1, (int) '#');
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.clone(charArray9);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(charArray12, 'a');
        char[] charArray16 = new char[] { '#' };
        java.lang.Character[] charArray17 = org.apache.commons.lang3.ArrayUtils.toObject(charArray16);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray16);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.subarray(charArray16, (int) (byte) -1, 6);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.addAll(charArray12, charArray16);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray25 = org.apache.commons.lang3.ArrayUtils.add(charArray22, (int) '#', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , #]");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (int) (byte) 1, (int) ' ');
        int[] intArray10 = new int[] { (byte) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, 10, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, 0, 1);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.addAll(intArray1, intArray10);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.clone(intArray10);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.clone(intArray10);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.subarray(intArray10, (int) (short) 0, 2);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray24, 3, 8);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray24);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.clone(charArray7);
        char[] charArray10 = new char[] { '#' };
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.toObject(charArray10);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.clone(charArray10);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.add(charArray12, 'a');
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.toObject(charArray12);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray12, ' ');
        java.lang.Character[] charArray18 = org.apache.commons.lang3.ArrayUtils.toObject(charArray12);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray12, 'a');
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray12, ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.addAll(charArray7, charArray22);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.clone(charArray22);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#]");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        char[] charArray1 = new char[] { ' ' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.add(charArray1, '#');
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray1, '#', (int) (short) 10);
        char[] charArray8 = new char[] { '#' };
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.clone(charArray8);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray10, 'a');
        char[] charArray19 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray19, '4', (int) (byte) 100);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray19, '#', 0);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.addAll(charArray10, charArray19);
        char[] charArray28 = new char[] { '#' };
        java.lang.Character[] charArray29 = org.apache.commons.lang3.ArrayUtils.toObject(charArray28);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.add(charArray30, 'a');
        char[] charArray34 = new char[] { '#' };
        java.lang.Character[] charArray35 = org.apache.commons.lang3.ArrayUtils.toObject(charArray34);
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.clone(charArray34);
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.addAll(charArray30, charArray34);
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.addAll(charArray26, charArray34);
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.addAll(charArray1, charArray34);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray34, ' ');
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.add(charArray34, '4');
        char[] charArray45 = new char[] { '#' };
        java.lang.Character[] charArray46 = org.apache.commons.lang3.ArrayUtils.toObject(charArray45);
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.clone(charArray45);
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.add(charArray47, 'a');
        java.lang.Character[] charArray50 = org.apache.commons.lang3.ArrayUtils.toObject(charArray47);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray47, ' ');
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray47, ' ', 2);
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray47, 'a', (int) (short) 10);
        char[] charArray59 = org.apache.commons.lang3.ArrayUtils.addAll(charArray43, charArray47);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray59);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "##a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "##a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, #, a, 4, #,  ,  ]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[#, a]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#, #]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "##a4#  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "##a4#  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#, #, a, 4, #,  ,  , #]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[ , #]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#, 4]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[#]");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[#]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, a]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "#4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "#4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[#, 4, #]");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        short[] shortArray4 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray4, (short) (byte) 0, 2);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.add(shortArray4, (short) -1);
        short[] shortArray10 = null;
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray9, shortArray10);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray10, (short) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[1, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[1]");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) '#');
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, (int) (short) 1, (double) 1.0f);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray11, (double) (short) -1);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray11);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray14);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        int int17 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) floatArray16);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray15, (java.lang.Object) floatArray16);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray16, (float) '#');
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray20, (int) (byte) -1, (int) (short) 1);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray23, (float) (short) -1);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray23, (float) 10);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray23, (float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.remove(floatArray23, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[]");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 10.0d };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1, (double) (byte) -1);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11, (double) '#');
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.add(doubleArray13, (int) (short) 1, (double) 1.0f);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray16, (double) (short) -1);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray16);
        java.lang.Double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray19);
        java.lang.Object[] objArray21 = null;
        java.lang.Double[] doubleArray28 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray28, (double) '#');
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.add(doubleArray30, (int) (short) 1, (double) 1.0f);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray33, (double) (short) -1);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray33);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray21, (java.lang.Object) doubleArray36);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray36, 10.0d, (int) '4');
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray36, (double) 6, (int) '#');
        double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray19, doubleArray36);
        double[] doubleArray46 = new double[] { (byte) 10 };
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray46);
        double[] doubleArray53 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray53, (double) (short) -1);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray46, doubleArray53);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray36, doubleArray53);
        java.lang.Double[] doubleArray59 = new java.lang.Double[] { 10.0d };
        double[] doubleArray60 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray59);
        int int63 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray60, (double) '#', 2);
        double[] doubleArray64 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray36, doubleArray60);
        double[] doubleArray65 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray36);
        java.lang.Double[] doubleArray66 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray65);
        java.lang.Double[] doubleArray67 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray65);
        int int70 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray65, (double) 2, (double) 3);
        double[] doubleArray73 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray65, (int) '#', 9);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 6 + "'", int40 == 6);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0, -1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, -1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] { objArray0, objArray1 };
        java.lang.Object obj3 = null;
        java.lang.Object[][] objArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(objArray2, obj3);
        char[] charArray6 = new char[] { '#' };
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) objArray2, (java.lang.Object[]) charArray7);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, ' ');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray12, '4', (int) (byte) 100);
        boolean[] booleanArray20 = new boolean[] { true, true, false, false };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray20, false);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray20, true);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray20, true);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.add(booleanArray20, 0, true);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray29, true, 6);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray29, false);
        java.lang.Character[] charArray36 = new java.lang.Character[] { '4' };
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray36);
        java.lang.Character[] charArray38 = org.apache.commons.lang3.ArrayUtils.toObject(charArray37);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) boolean34, (java.lang.Object) charArray37);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray37, '4', 1);
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.addAll(charArray12, charArray37);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[true, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[4]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#, 4]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (int) (short) 100);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(intArray1, (int) (short) 100);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.clone(intArray1);
        int int11 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) intArray10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, true);
        boolean[] booleanArray7 = new boolean[] { true, true, false, false };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray7, false);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray7, true);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray7);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray2, true);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) 1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray2);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 100L);
        java.lang.Float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3, (float) 1L);
        float[] floatArray7 = new float[] {};
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.add(floatArray7, (float) 10L);
        float[] floatArray11 = new float[] { (byte) -1 };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray9, floatArray11);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray12, (float) (-1L));
        float[] floatArray15 = new float[] {};
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray15, (float) 10L);
        float[] floatArray19 = new float[] { (byte) -1 };
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray17, floatArray19);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray17, (float) 1);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray17);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray6, floatArray17);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray24, (float) 1L);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.clone(floatArray24);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray2, floatArray24);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(floatArray2, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) ' ', 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[100.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (int) (short) 0, (byte) 1);
        java.lang.Long[] longArray17 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray17, (long) (-1));
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.clone(longArray19);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) (byte) 1, (java.lang.Object) longArray20);
        long[] longArray22 = new long[] {};
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(longArray22, (long) (short) 1);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray22, (long) 3);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray20, longArray22);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray20);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, (int) '4');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        java.lang.Boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray4);
        boolean[] booleanArray10 = null;
        boolean[] booleanArray11 = new boolean[] {};
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, true);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray10, booleanArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray4, booleanArray11);
        java.lang.Boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray11);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17);
        java.lang.Double[] doubleArray24 = new java.lang.Double[] { 100.0d, 0.0d, 0.0d, 100.0d, 10.0d };
        java.lang.Double[] doubleArray30 = new java.lang.Double[] { 100.0d, 0.0d, 0.0d, 100.0d, 10.0d };
        java.lang.Double[] doubleArray36 = new java.lang.Double[] { 100.0d, 0.0d, 0.0d, 100.0d, 10.0d };
        java.lang.Double[][] doubleArray37 = new java.lang.Double[][] { doubleArray24, doubleArray30, doubleArray36 };
        java.lang.Double[][] doubleArray38 = new java.lang.Double[][] {};
        java.lang.Double[][] doubleArray39 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray37, doubleArray38);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) booleanArray17, (java.lang.Object[]) doubleArray39);
        double[] doubleArray43 = new double[] { (byte) 100, (-1.0d) };
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray43);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray39, (java.lang.Object) boolean44);
        java.lang.Short[] shortArray52 = new java.lang.Short[] { (short) 10, (short) 100, (short) -1, (short) 1, (short) 0, (short) 0 };
        short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray52);
        short[] shortArray55 = org.apache.commons.lang3.ArrayUtils.add(shortArray53, (short) 100);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.clone(shortArray53);
        int int57 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray39, (java.lang.Object) shortArray53);
        short[] shortArray60 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray53, (int) '4', (int) (short) 1);
        short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.clone(shortArray53);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray55), "[10, 100, -1, 1, 0, 0, 100]");
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[]");
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[10, 100, -1, 1, 0, 0]");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, 1.0f);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray4, (float) 0L);
        java.lang.Object[] objArray8 = null;
        float[] floatArray9 = new float[] {};
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (float) 10L);
        float[] floatArray13 = new float[] { (byte) -1 };
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray11, floatArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray14, (float) (-1L));
        float[] floatArray17 = new float[] {};
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (float) 10L);
        float[] floatArray21 = new float[] { (byte) -1 };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray19, floatArray21);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray14, floatArray19);
        java.lang.Float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray19);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray8, (java.lang.Object) floatArray24);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray24, (float) ' ');
        java.lang.Float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray27);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray27);
        float[] floatArray30 = new float[] {};
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.add(floatArray30, (float) 10L);
        float[] floatArray34 = new float[] { (byte) -1 };
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray32, floatArray34);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray35, (float) (-1L));
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray35, (int) (byte) 0, 0);
        float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.add(floatArray35, (float) (short) 10);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) floatArray27, (java.lang.Object) floatArray42);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray42, (float) (-1), (int) (short) 100);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.lang.Object[] objArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) 10L);
        float[] floatArray5 = new float[] { (byte) -1 };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray3, floatArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray6, (float) (-1L));
        float[] floatArray9 = new float[] {};
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (float) 10L);
        float[] floatArray13 = new float[] { (byte) -1 };
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray11, floatArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray6, floatArray11);
        java.lang.Float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray11);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) floatArray16);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16, (float) (-1L));
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16, 0.0f);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray22, (float) (-1L), (int) '4');
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.clone(floatArray22);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray26, 1.0f, (int) 'a');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 10.0d };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1);
        double[] doubleArray4 = new double[] { (byte) 10 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray4);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray5);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray2, doubleArray5);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 1L);
        double[] doubleArray14 = new double[] { (byte) 10 };
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray14);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray5, doubleArray15);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray16, 8, 8);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray16, (double) '4', (-1.0d));
        double[] doubleArray28 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray28, (double) (short) -1);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray28, (double) (-1.0f), (int) (byte) 1);
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray28);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray34, (double) 5);
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray34, (int) (short) 0, 8);
        double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray16, doubleArray39);
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.add(doubleArray39, (double) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 10.0, 52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[52.0, -1.0, -1.0, 1.0, 100.0, -1.0]");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray4 = new float[] { (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) 1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) 8);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray4 = new float[] { (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) (-1L));
        float[] floatArray8 = new float[] {};
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) 10L);
        float[] floatArray12 = new float[] { (byte) -1 };
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray10, (float) 1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray5, floatArray10);
        java.lang.String str17 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) floatArray10);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{10.0}" + "'", str17, "{10.0}");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        int[] intArray3 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9);
        int[] intArray16 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray16);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray16);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray3, 2);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (-1));
        int[] intArray24 = new int[] { (byte) 0 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray24, 0);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray24, 100, 3);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray24, (int) (short) 0);
        java.lang.Integer[] intArray32 = org.apache.commons.lang3.ArrayUtils.toObject(intArray24);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray24, 10);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray3, intArray34);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray34);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 10, 52, 0, -1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        boolean[] booleanArray4 = new boolean[] { true, true, false, false };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, false);
        boolean[] booleanArray11 = new boolean[] { true, true, false, true };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, true, (int) '4');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray4, booleanArray11);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray4, (int) (byte) 1, (-1));
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray24, (byte) 0);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray24, (byte) 1);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray24, (byte) 1, 1);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray24, (byte) 10, (int) (short) -1);
        java.lang.Byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray24);
        java.lang.Byte[] byteArray41 = new java.lang.Byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 10 };
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray41);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray42);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray35, (java.lang.Object) byteArray42, 2);
        java.lang.Byte[] byteArray48 = new java.lang.Byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray49 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray48);
        boolean[] booleanArray54 = new boolean[] { true, true, false, true };
        int int57 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray54, true, (int) '4');
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray54);
        boolean[] booleanArray60 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray54, false);
        boolean[] booleanArray61 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray54);
        java.lang.Boolean[] booleanArray62 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray61);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray48, (java.lang.Object) booleanArray61);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) byteArray42, (java.lang.Object) booleanArray61);
        boolean[] booleanArray66 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray61, false);
        java.lang.String str68 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray61, "{-1,10,-1,10,1,1}");
        int int71 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray61, false, (int) '4');
        boolean boolean73 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray61, false);
        boolean[] booleanArray75 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray61, true);
        boolean boolean76 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) boolean19, (java.lang.Object) true);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 0, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 100]");
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(booleanArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray60), "[true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray61), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(booleanArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray66), "[true, true, true]");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "{true,true,false,true}" + "'", str68, "{true,true,false,true}");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(booleanArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray75), "[true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L, 100L, (-1L), (-1L), 100L, 100L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray7, (long) '#');
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100 };
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray12, (byte) 10, 0);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) 1);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray17, (int) (short) 0, (byte) 1);
        java.lang.Long[] longArray27 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray27, (long) (-1));
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.clone(longArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) (byte) 1, (java.lang.Object) longArray30);
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.remove(longArray30, 2);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray7, longArray33);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray33);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 100, -1, -1, 100, 100]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[0, 100, -1, -1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[1, 1, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray10, (long) (-1));
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray2, (java.lang.Object) longArray12, (int) (short) -1);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 1);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 100);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 100]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 100]");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray8, 0, (long) 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray8, (long) (-1), (int) (byte) 1);
        long[] longArray15 = new long[] {};
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(longArray15, (long) (short) 1);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.addAll(longArray8, longArray15);
        java.lang.Long[] longArray25 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray25, (long) (-1));
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.add(longArray27, 0, (long) 1);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.addAll(longArray18, longArray27);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(longArray31, (long) ' ');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, 10, -1, 10, 1, 1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        char[] charArray1 = new char[] { ' ' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.add(charArray1, '#');
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] { objArray4, objArray5 };
        java.lang.Object obj7 = null;
        java.lang.Object[][] objArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(objArray6, obj7);
        char[] charArray10 = new char[] { '#' };
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.toObject(charArray10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) objArray6, (java.lang.Object[]) charArray11);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray11, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.addAll(charArray3, charArray14);
        char[] charArray17 = new char[] { '#' };
        java.lang.Character[] charArray18 = org.apache.commons.lang3.ArrayUtils.toObject(charArray17);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.clone(charArray17);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray19, 'a');
        java.lang.Character[] charArray22 = org.apache.commons.lang3.ArrayUtils.toObject(charArray19);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray22);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.addAll(charArray15, charArray23);
        java.lang.Class<?> wildcardClass25 = charArray23.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " ##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " ##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , #, #]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#, a]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " ###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " ###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , #, #, #]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        char[] charArray1 = new char[] { ' ' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.add(charArray1, '#');
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] { objArray4, objArray5 };
        java.lang.Object obj7 = null;
        java.lang.Object[][] objArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(objArray6, obj7);
        char[] charArray10 = new char[] { '#' };
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.toObject(charArray10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) objArray6, (java.lang.Object[]) charArray11);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray11, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.addAll(charArray3, charArray14);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray3);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " ##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " ##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , #, #]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        boolean[] booleanArray4 = new boolean[] { true, true, false, false };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, false);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, true);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, 0, true);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray13, false);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray13, true);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray13, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, true, false, false]");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray3, '4');
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, (int) '4', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, ' ', (int) (byte) -1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(charArray8, ' ');
        char[] charArray15 = new char[] { '#' };
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.clone(charArray15);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.add(charArray17, 'a');
        char[] charArray26 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray26, '4', (int) (byte) 100);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray26, '#', 0);
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.addAll(charArray17, charArray26);
        char[] charArray35 = new char[] { '#' };
        java.lang.Character[] charArray36 = org.apache.commons.lang3.ArrayUtils.toObject(charArray35);
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.clone(charArray35);
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.add(charArray37, 'a');
        char[] charArray41 = new char[] { '#' };
        java.lang.Character[] charArray42 = org.apache.commons.lang3.ArrayUtils.toObject(charArray41);
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.clone(charArray41);
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.addAll(charArray37, charArray41);
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.addAll(charArray33, charArray41);
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.add(charArray41, 'a');
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray8, charArray41);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, a]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "#a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "#a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "##a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "##a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, #, a, 4, #,  ,  ]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[#, a]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "##a4#  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "##a4#  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[#, #, a, 4, #,  ,  , #]");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[#, a]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray4 = new float[] { (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) (-1L));
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) 100L);
        float[] floatArray10 = new float[] {};
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) 10L);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray13);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray5, floatArray10);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray15, (float) 100);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray15, 0.0f);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0, -1.0]");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        int[] intArray4 = new int[] { (byte) 0 };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 0);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 0);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(intArray4, (int) (short) 0);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) longArray0, (java.lang.Object) intArray4);
        int[] intArray15 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray21);
        int[] intArray28 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray22, intArray28);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.addAll(intArray15, intArray28);
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.subarray(intArray15, (int) (short) -1, 1);
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.subarray(intArray15, (-1), 0);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray15);
        java.lang.Integer[] intArray38 = org.apache.commons.lang3.ArrayUtils.toObject(intArray15);
        boolean[] booleanArray43 = new boolean[] { true, true, false, false };
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray43, false);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray43, true);
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray43, true);
        boolean[] booleanArray52 = org.apache.commons.lang3.ArrayUtils.add(booleanArray43, 0, true);
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray52, true, 6);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray52, false);
        boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray52, false);
        boolean[] booleanArray60 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray52, booleanArray60);
        java.lang.Boolean[] booleanArray62 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray60);
        boolean[] booleanArray63 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray62);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) intArray38, (java.lang.Object[]) booleanArray62);
        int[] intArray65 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray38);
        int[] intArray67 = org.apache.commons.lang3.ArrayUtils.remove(intArray65, 2);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 10, 52, 0, -1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[true, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(booleanArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray59), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray60), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(booleanArray62);
        org.junit.Assert.assertNotNull(booleanArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray63), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 10]");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray3, ' ');
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) '#');
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, (int) (short) 1, (double) 1.0f);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray11, (double) (short) -1);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray11);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray14);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        int int17 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) floatArray16);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray15, (java.lang.Object) floatArray16);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray16, (float) '#');
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray20, (int) (byte) -1, (int) (short) 1);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray23, (float) (short) -1);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray23, (float) 10);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, 1, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray2, (java.lang.Object) (short) 10);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#]");
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        boolean[] booleanArray4 = new boolean[] { true, true, false, false };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, false);
        boolean[] booleanArray11 = new boolean[] { true, true, false, true };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, true, (int) '4');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray4, booleanArray11);
        boolean[] booleanArray20 = new boolean[] { true, true, false, false };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray20, false);
        boolean[] booleanArray27 = new boolean[] { true, true, false, true };
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray27, true, (int) '4');
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray20, booleanArray27);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray20);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, true, (int) (byte) 10);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, false, 10);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray11, 3);
        java.lang.Boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray11);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray41);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[true, true, false, true, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[true, true, false, true]");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        short[] shortArray4 = new short[] { (short) 10, (short) 1, (byte) 1, (short) 1 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray4);
        short[] shortArray9 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray9);
        short[] shortArray15 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray15, (short) (byte) 0, 2);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray9, shortArray15);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray9);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(shortArray4, (short) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray4);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray4);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray4, (short) (byte) 0, (int) '4');
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.add(shortArray4, 4, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.remove(shortArray30, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[10, 1, 1, 1]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[1, 1, 1, 10, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[10, 1, 1, 1, 0]");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 1, 10 };
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, 100);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        float[] floatArray7 = new float[] {};
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.add(floatArray7, (float) 10L);
        float[] floatArray11 = new float[] { (byte) -1 };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray9, floatArray11);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray12, (float) (-1L));
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, (int) (byte) 0, 0);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.clone(floatArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) intArray3, (java.lang.Object) floatArray12);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, 1.0f);
        double[] doubleArray4 = new double[] { (byte) 10 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray4);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) floatArray0, (java.lang.Object[]) doubleArray7);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, 10.0f);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, 0.0f);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) 2);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        boolean[] booleanArray4 = new boolean[] { true, true, false, false };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, false);
        boolean[] booleanArray11 = new boolean[] { true, true, false, true };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, true, (int) '4');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray4, booleanArray11);
        boolean[] booleanArray20 = new boolean[] { true, true, false, false };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray20, false);
        boolean[] booleanArray27 = new boolean[] { true, true, false, true };
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray27, true, (int) '4');
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray20, booleanArray27);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray20);
        boolean[] booleanArray37 = new boolean[] { true, true, false, false };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray37, false);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray37, true, (int) (byte) 100);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray32, booleanArray37);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray32);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[true, true, false, true, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[true, true, false, true, true, true, false, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray3, intArray4 };
        int[][][] intArray6 = new int[][][] { intArray2, intArray5 };
        int[][][] intArray7 = org.apache.commons.lang3.ArrayUtils.toArray(intArray6);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        double[] doubleArray8 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) (short) -1);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray8);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray1, (int) (byte) -1, (int) (byte) 1);
        double[] doubleArray16 = new double[] { (byte) 10 };
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray16);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray17);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray17, (double) ' ');
        double[] doubleArray22 = new double[] { (byte) 10 };
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray22);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray17, doubleArray22);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray14, doubleArray17);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray25, (int) (byte) 1, 100);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray25, (double) 'a');
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.add(doubleArray25, 0, (double) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 10.0, 10.0]");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray10, (long) (-1));
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray2, (java.lang.Object) longArray12, (int) (short) -1);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 1);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray22, (byte) 0);
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 100 };
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray27, (byte) 10, 0);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray22, byteArray27);
        byte[] byteArray32 = null;
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray31, byteArray32);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.remove(byteArray31, 2);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.clone(byteArray35);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.add(byteArray36, (byte) 0);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray17, byteArray36);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray44, (byte) 0);
        byte[] byteArray49 = new byte[] { (byte) 100, (byte) 100 };
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray49, (byte) 10, 0);
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray44, byteArray49);
        byte[] byteArray56 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray49, 0, (int) (byte) 10);
        byte[] byteArray57 = org.apache.commons.lang3.ArrayUtils.clone(byteArray49);
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray36, byteArray57);
        byte[] byteArray63 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray65 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray63, (byte) 0);
        byte[] byteArray67 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray63, (byte) 1);
        int int70 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray63, (byte) 1, 1);
        int int73 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray63, (byte) 10, (int) (short) -1);
        java.lang.Byte[] byteArray74 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray63);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray36, byteArray63);
        java.lang.Byte[] byteArray76 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray36);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 100]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-1, 0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[100, 100]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[100, 100]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray76);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        short[] shortArray4 = new short[] { (short) 10, (short) 1, (byte) 1, (short) 1 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray4);
        short[] shortArray9 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray9);
        short[] shortArray15 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray15, (short) (byte) 0, 2);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray9, shortArray15);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray9);
        short[] shortArray24 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray24);
        short[] shortArray30 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray30, (short) (byte) 0, 2);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray24, shortArray30);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray4, shortArray24);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.contains(shortArray24, (short) (byte) -1);
        java.lang.Short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray24);
        java.lang.Double[] doubleArray42 = new java.lang.Double[] { 100.0d, 1.0d, 100.0d };
        double[] doubleArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray42);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray38, (java.lang.Object) doubleArray43, (int) (byte) 0);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray43, (double) (short) 10);
        double[] doubleArray49 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray43, 0);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, 1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[1, 1, 1, 10, 100, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 100.0]");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, (int) '4');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        java.lang.Boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray4);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9, false);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) booleanArray9);
        short[] shortArray19 = new short[] { (short) 10, (short) 1, (byte) 1, (short) 1 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray19);
        short[] shortArray24 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray24);
        short[] shortArray30 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray30, (short) (byte) 0, 2);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray24, shortArray30);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray19, shortArray24);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.contains(shortArray19, (short) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray19);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray19);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray19, (short) (byte) 0, (int) '4');
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, 4, (short) (byte) 0);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray9, (java.lang.Object) (byte) 0);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9, false);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[10, 1, 1, 1]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[1, 1, 1, 10, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[10, 1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[true, false, true, true]");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.lang.Object[] objArray0 = null;
        java.lang.Double[] doubleArray7 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7, (double) '#');
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray9, (int) (short) 1, (double) 1.0f);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray12, (double) (short) -1);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) doubleArray15);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray15, 10.0d, (int) '4');
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) 6, (int) '#');
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) 100L);
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray15, (int) (short) 0);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, 0.0d, (double) '#');
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        short[] shortArray4 = new short[] { (byte) 1, (short) 0, (short) -1, (short) 1 };
        short[] shortArray9 = new short[] { (byte) 1, (short) 0, (short) -1, (short) 1 };
        short[] shortArray14 = new short[] { (byte) 1, (short) 0, (short) -1, (short) 1 };
        short[] shortArray19 = new short[] { (byte) 1, (short) 0, (short) -1, (short) 1 };
        short[] shortArray24 = new short[] { (byte) 1, (short) 0, (short) -1, (short) 1 };
        short[] shortArray29 = new short[] { (byte) 1, (short) 0, (short) -1, (short) 1 };
        short[][] shortArray30 = new short[][] { shortArray4, shortArray9, shortArray14, shortArray19, shortArray24, shortArray29 };
        java.lang.Long[] longArray37 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray37, (long) (-1));
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray39, (long) '#');
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.subarray(longArray39, (int) '4', (int) (byte) 10);
        short[][] shortArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray30, (java.lang.Object) longArray44);
        int int47 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray44, (long) (byte) -1);
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.subarray(longArray44, 10, (int) 'a');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, 0, -1, 1]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 0, -1, 1]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[1, 0, -1, 1]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[1, 0, -1, 1]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[1, 0, -1, 1]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[1, 0, -1, 1]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[]");
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[]");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 0.0d, (-1.0d), 100.0d, 10.0d, 10.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) 2, (int) (byte) 100, (double) 'a');
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, 0.0d);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) (-1));
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) (short) 1, 100);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 0.0, -1.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (-1), (-1));
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray0, 6, 4);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray0);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray0, 7, (int) (short) 10);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        java.lang.Short[][][][] shortArray8 = new java.lang.Short[][][][] {};
        java.lang.Short[][][][] shortArray11 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray8, (int) 'a', 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray6, (java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, 1.0f);
        double[] doubleArray4 = new double[] { (byte) 10 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray4);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) floatArray0, (java.lang.Object[]) doubleArray7);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray9, (double) (-1), (double) 4);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray9, (double) 100L, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) 100L, 1);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.clone(charArray7);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.clone(charArray7);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray9, ' ');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#,  ]");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray2);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, (double) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) doubleArray2, " ");
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '#', (int) (short) 0);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray2, (double) 1.0f);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray13, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{10.0}" + "'", str8, "{10.0}");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0]");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray3, (short) (byte) 0);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.clone(shortArray3);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray16, (short) (byte) 10);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray16, (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.add(shortArray16, (int) (byte) 100, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[100, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray9);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray9, (short) -1, (int) (byte) 1);
        short[] shortArray18 = null;
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray9, shortArray18);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray19, (short) 0, 0);
        short[] shortArray27 = new short[] { (short) 10, (short) 1, (byte) 1, (short) 1 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray27);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.remove(shortArray27, 0);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray19, shortArray30);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.add(shortArray30, 3, (short) 0);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray30, (short) 0, 1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[1, 1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[1, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray2);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray2, (double) 0L, (int) (byte) 10, (-1.0d));
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, (double) ' ', (double) (-1.0f));
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, (double) 2, (-1));
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, (double) ' ');
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        java.lang.Character[][][][] charArray0 = null;
        java.lang.Character[][][][] charArray3 = org.apache.commons.lang3.ArrayUtils.subarray(charArray0, (int) '#', (int) (short) 10);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (int) (byte) 1, (int) ' ');
        int[] intArray10 = new int[] { (byte) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, 10, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, 0, 1);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.addAll(intArray1, intArray10);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.clone(intArray10);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray20, 1, (int) (short) 0);
        int[] intArray25 = new int[] { (byte) 0 };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray25, 0);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.add(intArray25, 0);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(intArray25, (int) (short) 0);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.subarray(intArray25, 1, 10);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.clone(intArray25);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray20, intArray25);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray20, (int) (short) -1);
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.clone(intArray38);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0]");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (-1), (-1));
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray0, 6, 4);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray10, (float) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, 1.0f);
        double[] doubleArray4 = new double[] { (byte) 10 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray4);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) floatArray0, (java.lang.Object[]) doubleArray7);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray9, (double) (-1), (double) 4);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.add(doubleArray9, 10.0d);
        java.lang.Double[] doubleArray16 = new java.lang.Double[] { 10.0d };
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray16);
        double[] doubleArray19 = new double[] { (byte) 10 };
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray19);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray20);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray20, (double) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray20);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray17, doubleArray20);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, (double) 1L);
        double[] doubleArray29 = new double[] { (byte) 10 };
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray29);
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray20, doubleArray30);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray31);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray31, 0.0d, (double) (-1.0f));
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray31, 7, 2);
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray9, doubleArray31);
        java.lang.Double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray39);
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray39, 100.0d, (double) 3);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, true);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray2);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray2, (-1), 10);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[]");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        double[] doubleArray3 = new double[] { (-1), (byte) 100, 10L };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) 0.0f, 0, 100.0d);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray13, (byte) 0);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.add(byteArray13, (byte) 0);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray8, (java.lang.Object) byteArray17, 4);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) doubleArray8);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8, 0.0d);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0, -1.0]");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        double[] doubleArray8 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) (short) -1);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray8);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) (byte) 10, 0);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray4 = new float[] { (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) (-1L));
        float[] floatArray8 = new float[] {};
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) 10L);
        float[] floatArray12 = new float[] { (byte) -1 };
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray12);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray5, floatArray10);
        java.lang.Float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray10);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray10, (float) 3, (int) '4');
        java.lang.Double[] doubleArray25 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray25, (double) '#');
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, (int) (short) 1, (double) 1.0f);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray30, (double) (short) -1);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray30);
        java.lang.Double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray33);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        int int36 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) floatArray35);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray34, (java.lang.Object) floatArray35);
        float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray35, (float) '#');
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray35);
        float[] floatArray41 = org.apache.commons.lang3.ArrayUtils.clone(floatArray10);
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray41, (float) 100, 10);
        float[] floatArray47 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray41, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[10.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[]");
    }
}

